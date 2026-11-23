package m6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import m9.u;
public final class l implements ServiceConnection {
    public int f20899a = 0;
    public final Messenger f20900b;
    public k8.a f20901c;
    public final ArrayDeque d;
    public final SparseArray f20902e;
    public final n f20903f;

    public l(n nVar) {
        this.f20903f = nVar;
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                int i7 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i7).length() + 30);
                    sb2.append("Received response to request: ");
                    sb2.append(i7);
                    Log.d("MessengerIpcClient", sb2.toString());
                }
                l lVar = l.this;
                synchronized (lVar) {
                    try {
                        SparseArray sparseArray = lVar.f20902e;
                        m mVar = (m) sparseArray.get(i7);
                        if (mVar == 0) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i7).length() + 39);
                            sb3.append("Received response for unknown request: ");
                            sb3.append(i7);
                            Log.w("MessengerIpcClient", sb3.toString());
                            return true;
                        }
                        sparseArray.remove(i7);
                        lVar.d();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            mVar.c(new Exception("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (mVar.f20907e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    mVar.b(null);
                                    return true;
                                }
                                mVar.c(new Exception("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                mVar.b(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.f20900b = new Messenger(handler);
        this.d = new ArrayDeque();
        this.f20902e = new SparseArray();
    }

    public final synchronized boolean a(m mVar) {
        Throwable th2;
        int i7;
        boolean z10;
        w6.a a10;
        n nVar;
        Context context;
        try {
            try {
                i7 = this.f20899a;
                z10 = false;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                throw th2;
            }
            try {
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            return false;
                        }
                        this.d.add(mVar);
                        ((ScheduledExecutorService) this.f20903f.f20911c).execute(new j(this, 1));
                        return true;
                    }
                    this.d.add(mVar);
                    return true;
                }
                this.d.add(mVar);
                if (this.f20899a == 0) {
                    z10 = true;
                }
                q6.m.k(z10);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f20899a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a10 = w6.a.a();
                    nVar = this.f20903f;
                    context = (Context) nVar.f20910b;
                } catch (SecurityException e10) {
                    e = e10;
                }
                try {
                    if (!a10.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        b("Unable to bind to service");
                    } else {
                        ((ScheduledExecutorService) nVar.f20911c).schedule(new j(this, 0), 30L, TimeUnit.SECONDS);
                    }
                } catch (SecurityException e11) {
                    e = e11;
                    c("Unable to bind to service", e);
                    return true;
                }
                return true;
            } catch (Throwable th4) {
                th2 = th4;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final synchronized void b(String str) {
        c(str, null);
    }

    public final synchronized void c(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i7 = this.f20899a;
            if (i7 != 0) {
                if (i7 != 1 && i7 != 2) {
                    if (i7 != 3) {
                        return;
                    }
                    this.f20899a = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f20899a = 4;
                w6.a.a().b((Context) this.f20903f.f20910b, this);
                ?? exc = new Exception(str, securityException);
                ArrayDeque arrayDeque = this.d;
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).c(exc);
                }
                arrayDeque.clear();
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = this.f20902e;
                    if (i10 < sparseArray.size()) {
                        ((m) sparseArray.valueAt(i10)).c(exc);
                        i10++;
                    } else {
                        sparseArray.clear();
                        return;
                    }
                }
            } else {
                throw new IllegalStateException();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d() {
        try {
            if (this.f20899a == 2 && this.d.isEmpty() && this.f20902e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f20899a = 3;
                w6.a.a().b((Context) this.f20903f.f20910b, this);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f20903f.f20911c).execute(new u(22, this, iBinder));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f20903f.f20911c).execute(new j(this, 2));
    }
}

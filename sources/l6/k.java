package l6;

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
import l9.u;
import p4.q;
public final class k implements ServiceConnection {
    public int f18078a = 0;
    public final Messenger f18079b;
    public q f18080c;
    public final ArrayDeque d;
    public final SparseArray f18081e;
    public final n f18082f;

    public k(n nVar) {
        this.f18082f = nVar;
        Handler handler = new Handler(Looper.getMainLooper(), new Handler.Callback() {
            @Override
            public final boolean handleMessage(Message message) {
                int i3 = message.arg1;
                if (Log.isLoggable("MessengerIpcClient", 3)) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + 30);
                    sb2.append("Received response to request: ");
                    sb2.append(i3);
                    Log.d("MessengerIpcClient", sb2.toString());
                }
                k kVar = k.this;
                synchronized (kVar) {
                    try {
                        SparseArray sparseArray = kVar.f18081e;
                        l lVar = (l) sparseArray.get(i3);
                        if (lVar == 0) {
                            StringBuilder sb3 = new StringBuilder(String.valueOf(i3).length() + 39);
                            sb3.append("Received response for unknown request: ");
                            sb3.append(i3);
                            Log.w("MessengerIpcClient", sb3.toString());
                            return true;
                        }
                        sparseArray.remove(i3);
                        kVar.d();
                        Bundle data = message.getData();
                        if (data.getBoolean("unsupported", false)) {
                            lVar.c(new Exception("Not supported by GmsCore", null));
                            return true;
                        }
                        switch (lVar.f18086e) {
                            case 0:
                                if (data.getBoolean("ack", false)) {
                                    lVar.b(null);
                                    return true;
                                }
                                lVar.c(new Exception("Invalid response to one way request", null));
                                return true;
                            default:
                                Bundle bundle = data.getBundle("data");
                                if (bundle == null) {
                                    bundle = Bundle.EMPTY;
                                }
                                lVar.b(bundle);
                                return true;
                        }
                    } finally {
                    }
                }
            }
        });
        Looper.getMainLooper();
        this.f18079b = new Messenger(handler);
        this.d = new ArrayDeque();
        this.f18081e = new SparseArray();
    }

    public final synchronized boolean a(l lVar) {
        Throwable th2;
        int i3;
        boolean z10;
        v6.a a10;
        n nVar;
        Context context;
        try {
            try {
                i3 = this.f18078a;
                z10 = false;
            } catch (Throwable th3) {
                th = th3;
                th2 = th;
                throw th2;
            }
            try {
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            return false;
                        }
                        this.d.add(lVar);
                        ((ScheduledExecutorService) this.f18082f.f18090c).execute(new i(this, 1));
                        return true;
                    }
                    this.d.add(lVar);
                    return true;
                }
                this.d.add(lVar);
                if (this.f18078a == 0) {
                    z10 = true;
                }
                p6.m.j(z10);
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                }
                this.f18078a = 1;
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                try {
                    a10 = v6.a.a();
                    nVar = this.f18082f;
                    context = (Context) nVar.f18089b;
                } catch (SecurityException e10) {
                    e = e10;
                }
                try {
                    if (!a10.c(context, context.getClass().getName(), intent, this, 1, null)) {
                        b("Unable to bind to service");
                    } else {
                        ((ScheduledExecutorService) nVar.f18090c).schedule(new i(this, 0), 30L, TimeUnit.SECONDS);
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
            int i3 = this.f18078a;
            if (i3 != 0) {
                if (i3 != 1 && i3 != 2) {
                    if (i3 != 3) {
                        return;
                    }
                    this.f18078a = 4;
                    return;
                }
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Unbinding service");
                }
                this.f18078a = 4;
                v6.a.a().b((Context) this.f18082f.f18089b, this);
                ?? exc = new Exception(str, securityException);
                ArrayDeque arrayDeque = this.d;
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    ((l) it.next()).c(exc);
                }
                arrayDeque.clear();
                int i10 = 0;
                while (true) {
                    SparseArray sparseArray = this.f18081e;
                    if (i10 < sparseArray.size()) {
                        ((l) sparseArray.valueAt(i10)).c(exc);
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
            if (this.f18078a == 2 && this.d.isEmpty() && this.f18081e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f18078a = 3;
                v6.a.a().b((Context) this.f18082f.f18089b, this);
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
        ((ScheduledExecutorService) this.f18082f.f18090c).execute(new u(16, this, iBinder));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f18082f.f18090c).execute(new i(this, 2));
    }
}

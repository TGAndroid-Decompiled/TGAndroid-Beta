package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
public final class ccf implements ServiceConnection {
    public byte a = 0;
    public final Messenger b;
    public zhc c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final ykf f;

    public ccf(ykf ykfVar) {
        this.f = ykfVar;
        Handler handler = new Handler(Looper.getMainLooper(), new w9f(this, (byte) 0));
        Looper.getMainLooper();
        this.b = new Messenger(handler);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized boolean a(uff uffVar) {
        Throwable th;
        ccf ccfVar;
        boolean z;
        wz4 E;
        ykf ykfVar;
        Context context;
        try {
            try {
                byte b = this.a;
                try {
                    if (b != 0) {
                        if (b != 1) {
                            if (b != 2) {
                                return false;
                            }
                            this.d.add(uffVar);
                            ((ScheduledExecutorService) this.f.c).execute(new kre(this, (byte) 1));
                            return true;
                        }
                        this.d.add(uffVar);
                        return true;
                    }
                    this.d.add(uffVar);
                    if (this.a == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    xve.k(z);
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.a = (byte) 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    try {
                        E = wz4.E();
                        ykfVar = this.f;
                        try {
                            context = (Context) ykfVar.b;
                            ccfVar = this;
                        } catch (Throwable th2) {
                            th = th2;
                            ccfVar = this;
                        }
                    } catch (SecurityException e) {
                        e = e;
                        ccfVar = this;
                    }
                    try {
                        try {
                            if (!E.L(context, context.getClass().getName(), intent, ccfVar, 1)) {
                                ccfVar.b("Unable to bind to service");
                            } else {
                                ((ScheduledExecutorService) ykfVar.c).schedule(new kre(ccfVar, (byte) 0), 30L, TimeUnit.SECONDS);
                            }
                        } catch (SecurityException e2) {
                            e = e2;
                            ccfVar.c("Unable to bind to service", e);
                            return true;
                        }
                        return true;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    ccfVar = this;
                }
            } catch (Throwable th5) {
                th = th5;
                ccfVar = this;
                th = th;
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public final synchronized void b(String str) {
        c(str, null);
    }

    public final synchronized void c(String str, SecurityException securityException) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
        }
        byte b = this.a;
        if (b != 0) {
            if (b != 1 && b != 2) {
                if (b != 3) {
                    return;
                }
                this.a = (byte) 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = (byte) 4;
            wz4.E().K((Context) this.f.b, this);
            ?? exc = new Exception(str, securityException);
            ArrayDeque arrayDeque = this.d;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((uff) it.next()).c(exc);
            }
            arrayDeque.clear();
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.e;
                if (i < sparseArray.size()) {
                    ((uff) sparseArray.valueAt(i)).c(exc);
                    i++;
                } else {
                    sparseArray.clear();
                    return;
                }
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final synchronized void d() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
            }
            this.a = (byte) 3;
            wz4.E().K((Context) this.f.b, this);
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new xs4(this, iBinder, (byte) 21));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new kre(this, (byte) 2));
    }
}

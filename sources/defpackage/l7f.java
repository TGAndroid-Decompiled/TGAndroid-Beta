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
public final class l7f implements ServiceConnection {
    public byte a = 0;
    public final Messenger b;
    public aec c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final igf f;

    public l7f(igf igfVar) {
        this.f = igfVar;
        Handler handler = new Handler(Looper.getMainLooper(), new f5f(this, (byte) 0));
        Looper.getMainLooper();
        this.b = new Messenger(handler);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized boolean a(ebf ebfVar) {
        Throwable th;
        l7f l7fVar;
        boolean z;
        qx4 I;
        igf igfVar;
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
                            this.d.add(ebfVar);
                            ((ScheduledExecutorService) this.f.c).execute(new tme(this, (byte) 1));
                            return true;
                        }
                        this.d.add(ebfVar);
                        return true;
                    }
                    this.d.add(ebfVar);
                    if (this.a == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    fre.k(z);
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.a = (byte) 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    try {
                        I = qx4.I();
                        igfVar = this.f;
                        try {
                            context = (Context) igfVar.b;
                            l7fVar = this;
                        } catch (Throwable th2) {
                            th = th2;
                            l7fVar = this;
                        }
                    } catch (SecurityException e) {
                        e = e;
                        l7fVar = this;
                    }
                    try {
                        try {
                            if (!I.N(context, context.getClass().getName(), intent, l7fVar, 1)) {
                                l7fVar.b("Unable to bind to service");
                            } else {
                                ((ScheduledExecutorService) igfVar.c).schedule(new tme(l7fVar, (byte) 0), 30L, TimeUnit.SECONDS);
                            }
                        } catch (SecurityException e2) {
                            e = e2;
                            l7fVar.c("Unable to bind to service", e);
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
                    l7fVar = this;
                }
            } catch (Throwable th5) {
                th = th5;
                l7fVar = this;
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
            qx4.I().M((Context) this.f.b, this);
            ?? exc = new Exception(str, securityException);
            ArrayDeque arrayDeque = this.d;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((ebf) it.next()).c(exc);
            }
            arrayDeque.clear();
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.e;
                if (i < sparseArray.size()) {
                    ((ebf) sparseArray.valueAt(i)).c(exc);
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
            qx4.I().M((Context) this.f.b, this);
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new tq4(this, iBinder, (byte) 21));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new tme(this, (byte) 2));
    }
}

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
public final class n9f implements ServiceConnection {
    public byte a = 0;
    public final Messenger b;
    public rhb c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final jif f;

    public n9f(jif jifVar) {
        this.f = jifVar;
        Handler handler = new Handler(Looper.getMainLooper(), new h7f(this, (byte) 0));
        Looper.getMainLooper();
        this.b = new Messenger(handler);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized boolean a(fdf fdfVar) {
        Throwable th;
        n9f n9fVar;
        boolean z;
        sz4 F;
        jif jifVar;
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
                            this.d.add(fdfVar);
                            ((ScheduledExecutorService) this.f.c).execute(new woe(this, (byte) 1));
                            return true;
                        }
                        this.d.add(fdfVar);
                        return true;
                    }
                    this.d.add(fdfVar);
                    if (this.a == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    ite.k(z);
                    if (Log.isLoggable("MessengerIpcClient", 2)) {
                        Log.v("MessengerIpcClient", "Starting bind to GmsCore");
                    }
                    this.a = (byte) 1;
                    Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent.setPackage("com.google.android.gms");
                    try {
                        F = sz4.F();
                        jifVar = this.f;
                        try {
                            context = (Context) jifVar.b;
                            n9fVar = this;
                        } catch (Throwable th2) {
                            th = th2;
                            n9fVar = this;
                        }
                    } catch (SecurityException e) {
                        e = e;
                        n9fVar = this;
                    }
                    try {
                        try {
                            if (!F.L(context, context.getClass().getName(), intent, n9fVar, 1)) {
                                n9fVar.b("Unable to bind to service");
                            } else {
                                ((ScheduledExecutorService) jifVar.c).schedule(new woe(n9fVar, (byte) 0), 30L, TimeUnit.SECONDS);
                            }
                        } catch (SecurityException e2) {
                            e = e2;
                            n9fVar.c("Unable to bind to service", e);
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
                    n9fVar = this;
                }
            } catch (Throwable th5) {
                th = th5;
                n9fVar = this;
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
            sz4.F().K((Context) this.f.b, this);
            ?? exc = new Exception(str, securityException);
            ArrayDeque arrayDeque = this.d;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((fdf) it.next()).c(exc);
            }
            arrayDeque.clear();
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.e;
                if (i < sparseArray.size()) {
                    ((fdf) sparseArray.valueAt(i)).c(exc);
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
            sz4.F().K((Context) this.f.b, this);
        }
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new us4(this, iBinder, (byte) 21));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.c).execute(new woe(this, (byte) 2));
    }
}

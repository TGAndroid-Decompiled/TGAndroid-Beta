package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import org.telegram.utils.twidget.n;
import org.telegram.utils.twidget.o;
import org.telegram.utils.twidget.x;
public final class n0d implements ServiceConnection, IBinder.DeathRecipient {
    public final x E;
    public final int a;
    public final boolean b;
    public final boolean c;
    public volatile jl5 d;
    public int e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public long s;
    public volatile int w;
    public final long x = SystemClock.uptimeMillis();
    public final olc y = new olc(this, (byte) 25);

    public n0d(x xVar, int i, boolean z, boolean z2) {
        this.E = xVar;
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override
    public final void binderDied() {
        this.E.q(this, "died");
    }

    @Override
    public final void onBindingDied(ComponentName componentName) {
        this.E.q(this, "died");
    }

    @Override
    public final void onNullBinding(ComponentName componentName) {
        this.E.q(this, "no binding");
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        jl5 jl5Var;
        String str;
        synchronized (this.E.a) {
            if (this.n) {
                return;
            }
            try {
                iBinder.linkToDeath(this, 0);
                int i = n.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngine");
                if (queryLocalInterface != null && (queryLocalInterface instanceof jl5)) {
                    jl5Var = (jl5) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.a = iBinder;
                    jl5Var = obj;
                }
                try {
                    jl5Var.v(o.b());
                    this.d = jl5Var;
                    if (f11.a) {
                        StringBuilder sb = new StringBuilder("process ");
                        sb.append(this.a);
                        sb.append(" up in ");
                        sb.append(SystemClock.uptimeMillis() - this.x);
                        sb.append(" ms");
                        if (this.b) {
                            str = " (app zygote)";
                        } else {
                            str = "";
                        }
                        sb.append(str);
                        Log.d("WidgetEngine", sb.toString());
                    }
                    if (this.r) {
                        try {
                            jl5Var.L();
                        } catch (RemoteException unused) {
                        }
                    }
                    this.E.a.notifyAll();
                } catch (RemoteException unused2) {
                }
            } catch (RemoteException unused3) {
            }
        }
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.E.q(this, "died");
    }
}

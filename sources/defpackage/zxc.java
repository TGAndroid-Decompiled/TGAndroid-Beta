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
public final class zxc implements ServiceConnection, IBinder.DeathRecipient {
    public final x E;
    public final int a;
    public final boolean b;
    public final boolean c;
    public volatile gl5 d;
    public int e;
    public int f;
    public boolean h;
    public boolean n;
    public boolean r;
    public long s;
    public volatile int w;
    public final long x = SystemClock.uptimeMillis();
    public final cpc y = new cpc(this, (byte) 16);

    public zxc(x xVar, int i, boolean z, boolean z2) {
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
        gl5 gl5Var;
        String str;
        synchronized (this.E.a) {
            if (this.n) {
                return;
            }
            try {
                iBinder.linkToDeath(this, 0);
                int i = n.b;
                IInterface queryLocalInterface = iBinder.queryLocalInterface("org.telegram.utils.twidget.IWidgetEngine");
                if (queryLocalInterface != null && (queryLocalInterface instanceof gl5)) {
                    gl5Var = (gl5) queryLocalInterface;
                } else {
                    ?? obj = new Object();
                    obj.a = iBinder;
                    gl5Var = obj;
                }
                try {
                    gl5Var.v(o.b());
                    this.d = gl5Var;
                    if (e21.a) {
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
                            gl5Var.L();
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

package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class kjd extends ebd {
    public final rjd c;

    public kjd(rjd rjdVar) {
        super((byte) 1);
        this.c = rjdVar;
    }

    @Override
    public final void T(xr xrVar, String str, String str2, boolean z) {
        rjd rjdVar = this.c;
        rjdVar.u = xrVar;
        rjdVar.v = str;
        zdf zdfVar = new zdf(new Status(0, null, null, null), xrVar, str, str2, z);
        synchronized (rjdVar.s) {
            TaskCompletionSource taskCompletionSource = rjdVar.p;
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(zdfVar);
            }
            rjdVar.p = null;
        }
    }

    @Override
    public final void V(int i) {
        this.c.i(i);
    }

    @Override
    public final void W(int i) {
        rjd rjdVar = this.c;
        rjd.g(rjdVar, i);
        if (rjdVar.E != null) {
            rjd.k(rjdVar).post(new uid(this, i, (byte) 2));
        }
    }

    @Override
    public final void X(int i) {
        rjd.g(this.c, i);
    }

    @Override
    public final void Y(t9d t9dVar) {
        rjd.k(this.c).post(new xs4(this, t9dVar, (byte) 20));
    }

    @Override
    public final void Z(int i) {
        rjd.g(this.c, i);
    }

    @Override
    public final void b0(int i) {
        rjd.k(this.c).post(new uid(this, i, (byte) 1));
    }

    @Override
    public final void c0(fad fadVar) {
        rjd.k(this.c).post(new iqd(this, fadVar, (byte) 17));
    }

    @Override
    public final void d0(int i) {
        rjd.k(this.c).post(new uid(this, i, (byte) 0));
    }

    @Override
    public final void e0(long j) {
        rjd.f(this.c, j, 0);
    }

    @Override
    public final void f0(int i, long j) {
        rjd.f(this.c, j, i);
    }

    @Override
    public final void h0(int i) {
        rjd.k(this.c).post(new uid(this, i, (byte) 3));
    }

    @Override
    public final void i0(String str, String str2) {
        rjd.H.b("Receive (type=text, ns=%s) %s", str, str2);
        rjd.k(this.c).post(new uy1(this, str, str2, false, (byte) 6));
    }
}

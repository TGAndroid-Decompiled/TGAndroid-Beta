package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class ted extends l6d {
    public final afd c;

    public ted(afd afdVar) {
        super((byte) 1);
        this.c = afdVar;
    }

    @Override
    public final void T(wr wrVar, String str, String str2, boolean z) {
        afd afdVar = this.c;
        afdVar.u = wrVar;
        afdVar.v = str;
        i9f i9fVar = new i9f(new Status(0, null, null, null), wrVar, str, str2, z);
        synchronized (afdVar.s) {
            TaskCompletionSource taskCompletionSource = afdVar.p;
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(i9fVar);
            }
            afdVar.p = null;
        }
    }

    @Override
    public final void V(int i) {
        this.c.i(i);
    }

    @Override
    public final void W(int i) {
        afd afdVar = this.c;
        afd.g(afdVar, i);
        if (afdVar.E != null) {
            afd.k(afdVar).post(new ded(this, i, (byte) 2));
        }
    }

    @Override
    public final void X(int i) {
        afd.g(this.c, i);
    }

    @Override
    public final void Y(a5d a5dVar) {
        afd.k(this.c).post(new tq4(this, a5dVar, (byte) 20));
    }

    @Override
    public final void Z(int i) {
        afd.g(this.c, i);
    }

    @Override
    public final void b0(int i) {
        afd.k(this.c).post(new ded(this, i, (byte) 1));
    }

    @Override
    public final void c0(m5d m5dVar) {
        afd.k(this.c).post(new rld(this, m5dVar, (byte) 17));
    }

    @Override
    public final void d0(int i) {
        afd.k(this.c).post(new ded(this, i, (byte) 0));
    }

    @Override
    public final void e0(long j) {
        afd.f(this.c, j, 0);
    }

    @Override
    public final void f0(int i, long j) {
        afd.f(this.c, j, i);
    }

    @Override
    public final void h0(int i) {
        afd.k(this.c).post(new ded(this, i, (byte) 3));
    }

    @Override
    public final void i0(String str, String str2) {
        afd.H.b("Receive (type=text, ns=%s) %s", str, str2);
        afd.k(this.c).post(new ey1(this, str, str2, false, (byte) 6));
    }
}

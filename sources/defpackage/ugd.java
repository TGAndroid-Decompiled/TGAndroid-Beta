package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class ugd extends n8d {
    public final bhd c;

    public ugd(bhd bhdVar) {
        super((byte) 1);
        this.c = bhdVar;
    }

    @Override
    public final void T(ws wsVar, String str, String str2, boolean z) {
        bhd bhdVar = this.c;
        bhdVar.u = wsVar;
        bhdVar.v = str;
        kbf kbfVar = new kbf(new Status(0, null, null, null), wsVar, str, str2, z);
        synchronized (bhdVar.s) {
            TaskCompletionSource taskCompletionSource = bhdVar.p;
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(kbfVar);
            }
            bhdVar.p = null;
        }
    }

    @Override
    public final void V(int i) {
        this.c.i(i);
    }

    @Override
    public final void W(int i) {
        bhd bhdVar = this.c;
        bhd.g(bhdVar, i);
        if (bhdVar.E != null) {
            bhd.k(bhdVar).post(new egd(this, i, (byte) 2));
        }
    }

    @Override
    public final void X(int i) {
        bhd.g(this.c, i);
    }

    @Override
    public final void Y(c7d c7dVar) {
        bhd.k(this.c).post(new us4(this, c7dVar, (byte) 20));
    }

    @Override
    public final void Z(int i) {
        bhd.g(this.c, i);
    }

    @Override
    public final void b0(int i) {
        bhd.k(this.c).post(new egd(this, i, (byte) 1));
    }

    @Override
    public final void c0(o7d o7dVar) {
        bhd.k(this.c).post(new tnd(this, o7dVar, (byte) 17));
    }

    @Override
    public final void d0(int i) {
        bhd.k(this.c).post(new egd(this, i, (byte) 0));
    }

    @Override
    public final void e0(long j) {
        bhd.f(this.c, j, 0);
    }

    @Override
    public final void f0(int i, long j) {
        bhd.f(this.c, j, i);
    }

    @Override
    public final void h0(int i) {
        bhd.k(this.c).post(new egd(this, i, (byte) 3));
    }

    @Override
    public final void i0(String str, String str2) {
        bhd.H.b("Receive (type=text, ns=%s) %s", str, str2);
        bhd.k(this.c).post(new rz1(this, str, str2, false, (byte) 6));
    }
}

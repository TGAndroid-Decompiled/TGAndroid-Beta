package c6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class d0 extends g6.g {
    public final e0 f4834b;

    public d0(e0 e0Var) {
        this.f4834b = e0Var;
    }

    @Override
    public final void A0(String str, byte[] bArr) {
        e0.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void P(int i10) {
        e0.k(this.f4834b).post(new c0(this, i10, 0));
    }

    @Override
    public final void T(String str, String str2) {
        e0.G.b("Receive (type=text, ns=%s) %s", str, str2);
        e0.k(this.f4834b).post(new c5.w(this, str, str2, 3));
    }

    @Override
    public final void X(int i10) {
        this.f4834b.i(i10);
    }

    @Override
    public final void Y(long j10) {
        e0.f(this.f4834b, j10, 0);
    }

    @Override
    public final void c(int i10) {
        e0.g(this.f4834b, i10);
    }

    @Override
    public final void f(int i10) {
        e0.k(this.f4834b).post(new c0(this, i10, 1));
    }

    @Override
    public final void m(d dVar, String str, String str2, boolean z10) {
        e0 e0Var = this.f4834b;
        e0Var.f4847t = dVar;
        e0Var.f4848u = str;
        g6.t tVar = new g6.t(new Status(0, null, null, null), dVar, str, str2, z10);
        synchronized (e0Var.f4845r) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.f4842o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(tVar);
                }
                e0Var.f4842o = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void t0(g6.d dVar) {
        e0.k(this.f4834b).post(new j9.u(7, this, dVar));
    }

    @Override
    public final void v0(int i10) {
        e0.k(this.f4834b).post(new c0(this, i10, 3));
    }

    @Override
    public final void y0(g6.c cVar) {
        e0.k(this.f4834b).post(new j9.u(8, this, cVar));
    }

    @Override
    public final void zzd(int i10) {
        e0 e0Var = this.f4834b;
        e0.g(e0Var, i10);
        if (e0Var.D != null) {
            e0.k(e0Var).post(new c0(this, i10, 2));
        }
    }

    @Override
    public final void zzg(int i10) {
        e0.g(this.f4834b, i10);
    }

    @Override
    public final void zzm(int i10, long j10) {
        e0.f(this.f4834b, j10, i10);
    }

    @Override
    public final void zzn() {
        e0.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}

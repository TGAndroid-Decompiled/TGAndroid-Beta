package c6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class d0 extends g6.g {
    public final e0 f3863b;

    public d0(e0 e0Var) {
        this.f3863b = e0Var;
    }

    @Override
    public final void A0(g6.c cVar) {
        e0.k(this.f3863b).post(new j9.u(8, this, cVar));
    }

    @Override
    public final void C0(String str, byte[] bArr) {
        e0.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void Q(int i10) {
        e0.k(this.f3863b).post(new c0(this, i10, 0));
    }

    @Override
    public final void U(String str, String str2) {
        e0.G.b("Receive (type=text, ns=%s) %s", str, str2);
        e0.k(this.f3863b).post(new c5.w(this, str, str2, 2));
    }

    @Override
    public final void Y(int i10) {
        this.f3863b.i(i10);
    }

    @Override
    public final void Z(long j10) {
        e0.f(this.f3863b, j10, 0);
    }

    @Override
    public final void d(int i10) {
        e0.g(this.f3863b, i10);
    }

    @Override
    public final void g(int i10) {
        e0.k(this.f3863b).post(new c0(this, i10, 1));
    }

    @Override
    public final void n(d dVar, String str, String str2, boolean z10) {
        e0 e0Var = this.f3863b;
        e0Var.f3876t = dVar;
        e0Var.f3877u = str;
        g6.t tVar = new g6.t(new Status(0, null, null, null), dVar, str, str2, z10);
        synchronized (e0Var.f3874r) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.f3871o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(tVar);
                }
                e0Var.f3871o = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void v0(g6.d dVar) {
        e0.k(this.f3863b).post(new j9.u(7, this, dVar));
    }

    @Override
    public final void x0(int i10) {
        e0.k(this.f3863b).post(new c0(this, i10, 3));
    }

    @Override
    public final void zzd(int i10) {
        e0 e0Var = this.f3863b;
        e0.g(e0Var, i10);
        if (e0Var.D != null) {
            e0.k(e0Var).post(new c0(this, i10, 2));
        }
    }

    @Override
    public final void zzg(int i10) {
        e0.g(this.f3863b, i10);
    }

    @Override
    public final void zzm(int i10, long j10) {
        e0.f(this.f3863b, j10, i10);
    }

    @Override
    public final void zzn() {
        e0.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}

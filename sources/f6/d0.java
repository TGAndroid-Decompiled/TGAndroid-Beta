package f6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class d0 extends j6.g {
    public final e0 f11246b;

    public d0(e0 e0Var) {
        this.f11246b = e0Var;
    }

    @Override
    public final void C0(String str, byte[] bArr) {
        e0.H.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void M(int i7) {
        e0.k(this.f11246b).post(new c0(this, i7, 0));
    }

    @Override
    public final void P(String str, String str2) {
        e0.H.b("Receive (type=text, ns=%s) %s", str, str2);
        e0.k(this.f11246b).post(new a9.h(this, str, str2, 4));
    }

    @Override
    public final void S(int i7) {
        this.f11246b.i(i7);
    }

    @Override
    public final void U(long j3) {
        e0.f(this.f11246b, j3, 0);
    }

    @Override
    public final void g(int i7) {
        e0.g(this.f11246b, i7);
    }

    @Override
    public final void h(int i7) {
        e0.k(this.f11246b).post(new c0(this, i7, 1));
    }

    @Override
    public final void r0(j6.d dVar) {
        e0.k(this.f11246b).post(new m9.u(18, this, dVar));
    }

    @Override
    public final void t0(j6.c cVar) {
        e0.k(this.f11246b).post(new m9.u(19, this, cVar));
    }

    @Override
    public final void u0(int i7) {
        e0.k(this.f11246b).post(new c0(this, i7, 3));
    }

    @Override
    public final void w0(d dVar, String str, String str2, boolean z9) {
        e0 e0Var = this.f11246b;
        e0Var.f11259u = dVar;
        e0Var.v = str;
        j6.t tVar = new j6.t(new Status(0, null, null, null), dVar, str, str2, z9);
        synchronized (e0Var.f11257s) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.f11254p;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(tVar);
                }
                e0Var.f11254p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void zzd(int i7) {
        e0 e0Var = this.f11246b;
        e0.g(e0Var, i7);
        if (e0Var.E != null) {
            e0.k(e0Var).post(new c0(this, i7, 2));
        }
    }

    @Override
    public final void zzg(int i7) {
        e0.g(this.f11246b, i7);
    }

    @Override
    public final void zzm(int i7, long j3) {
        e0.f(this.f11246b, j3, i7);
    }

    @Override
    public final void zzn() {
        e0.H.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}

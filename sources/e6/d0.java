package e6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class d0 extends i6.g {
    public final e0 f9689b;

    public d0(e0 e0Var) {
        this.f9689b = e0Var;
    }

    @Override
    public final void C0(String str, byte[] bArr) {
        e0.H.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void D0(i6.d dVar) {
        e0.k(this.f9689b).post(new l9.u(12, this, dVar));
    }

    @Override
    public final void N(int i3) {
        e0.k(this.f9689b).post(new c0(this, i3, 0));
    }

    @Override
    public final void Q(String str, String str2) {
        e0.H.b("Receive (type=text, ns=%s) %s", str, str2);
        e0.k(this.f9689b).post(new j1(this, str, str2, false, 3));
    }

    @Override
    public final void T(i6.c cVar) {
        e0.k(this.f9689b).post(new l9.u(13, this, cVar));
    }

    @Override
    public final void U(int i3) {
        this.f9689b.i(i3);
    }

    @Override
    public final void V(long j10) {
        e0.f(this.f9689b, j10, 0);
    }

    @Override
    public final void b0(d dVar, String str, String str2, boolean z10) {
        e0 e0Var = this.f9689b;
        e0Var.f9702u = dVar;
        e0Var.v = str;
        i6.t tVar = new i6.t(new Status(0, null, null, null), dVar, str, str2, z10);
        synchronized (e0Var.f9700s) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.f9697p;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(tVar);
                }
                e0Var.f9697p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void d(int i3) {
        e0.g(this.f9689b, i3);
    }

    @Override
    public final void g(int i3) {
        e0.k(this.f9689b).post(new c0(this, i3, 1));
    }

    @Override
    public final void x0(int i3) {
        e0.k(this.f9689b).post(new c0(this, i3, 3));
    }

    @Override
    public final void zzd(int i3) {
        e0 e0Var = this.f9689b;
        e0.g(e0Var, i3);
        if (e0Var.E != null) {
            e0.k(e0Var).post(new c0(this, i3, 2));
        }
    }

    @Override
    public final void zzg(int i3) {
        e0.g(this.f9689b, i3);
    }

    @Override
    public final void zzm(int i3, long j10) {
        e0.f(this.f9689b, j10, i3);
    }

    @Override
    public final void zzn() {
        e0.H.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}

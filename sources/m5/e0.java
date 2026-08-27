package m5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class e0 extends r5.g {

    public final f0 f17769b;

    public e0(f0 f0Var) {
        this.f17769b = f0Var;
    }

    @Override
    public final void A0(String str, byte[] bArr) {
        f0.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void D(r5.d dVar) {
        f0.k(this.f17769b).post(new a9.o(this, dVar, false, 22));
    }

    @Override
    public final void L(d dVar, String str, String str2, boolean z10) {
        f0 f0Var = this.f17769b;
        f0Var.f17779t = dVar;
        f0Var.f17780u = str;
        r5.u uVar = new r5.u(new Status(0, null, null, null), dVar, str, str2, z10);
        synchronized (f0Var.f17777r) {
            try {
                TaskCompletionSource taskCompletionSource = f0Var.f17774o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(uVar);
                }
                f0Var.f17774o = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final void M(int i10) {
        f0.k(this.f17769b).post(new d0(this, i10, 0));
    }

    @Override
    public final void P(String str, String str2) {
        f0.G.b("Receive (type=text, ns=%s) %s", str, str2);
        f0.k(this.f17769b).post(new q1(this, str, str2, false, 7));
    }

    @Override
    public final void T(int i10) {
        this.f17769b.i(i10);
    }

    @Override
    public final void V(long j10) {
        f0.f(this.f17769b, j10, 0);
    }

    @Override
    public final void c(int i10) {
        f0.g(this.f17769b, i10);
    }

    @Override
    public final void d(int i10) {
        f0.k(this.f17769b).post(new d0(this, i10, 1));
    }

    @Override
    public final void w0(int i10) {
        f0.k(this.f17769b).post(new d0(this, i10, 3));
    }

    @Override
    public final void y(r5.c cVar) {
        f0.k(this.f17769b).post(new a9.o(this, cVar, false, 23));
    }

    @Override
    public final void zzd(int i10) {
        f0 f0Var = this.f17769b;
        f0.g(f0Var, i10);
        if (f0Var.D != null) {
            f0.k(f0Var).post(new d0(this, i10, 2));
        }
    }

    @Override
    public final void zzg(int i10) {
        f0.g(this.f17769b, i10);
    }

    @Override
    public final void zzm(int i10, long j10) {
        f0.f(this.f17769b, j10, i10);
    }

    @Override
    public final void zzn() {
        f0.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}

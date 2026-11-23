package f6;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
public final class d0 extends j6.g {
    public final e0 f11372b;

    public d0(e0 e0Var) {
        this.f11372b = e0Var;
    }

    @Override
    public final void K0(j6.d dVar) {
        e0.k(this.f11372b).post(new m9.u(18, this, dVar));
    }

    @Override
    public final void N0(j6.c cVar) {
        e0.k(this.f11372b).post(new m9.u(19, this, cVar));
    }

    @Override
    public final void O0(int i7) {
        e0.k(this.f11372b).post(new c0(this, i7, 3));
    }

    @Override
    public final void S0(d dVar, String str, String str2, boolean z10) {
        e0 e0Var = this.f11372b;
        e0Var.f11385u = dVar;
        e0Var.v = str;
        j6.u uVar = new j6.u(new Status(0, null, null, null), dVar, str, str2, z10);
        synchronized (e0Var.f11383s) {
            try {
                TaskCompletionSource taskCompletionSource = e0Var.f11380p;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(uVar);
                }
                e0Var.f11380p = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override
    public final void W(int i7) {
        e0.k(this.f11372b).post(new c0(this, i7, 0));
    }

    @Override
    public final void Y0(String str, byte[] bArr) {
        e0.H.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void Z(String str, String str2) {
        e0.H.b("Receive (type=text, ns=%s) %s", str, str2);
        e0.k(this.f11372b).post(new a9.h(this, str, str2, 4));
    }

    @Override
    public final void c0(int i7) {
        this.f11372b.i(i7);
    }

    @Override
    public final void f0(long j3) {
        e0.f(this.f11372b, j3, 0);
    }

    @Override
    public final void g(int i7) {
        e0.g(this.f11372b, i7);
    }

    @Override
    public final void h(int i7) {
        e0.k(this.f11372b).post(new c0(this, i7, 1));
    }

    @Override
    public final void zzd(int i7) {
        e0 e0Var = this.f11372b;
        e0.g(e0Var, i7);
        if (e0Var.E != null) {
            e0.k(e0Var).post(new c0(this, i7, 2));
        }
    }

    @Override
    public final void zzg(int i7) {
        e0.g(this.f11372b, i7);
    }

    @Override
    public final void zzm(int i7, long j3) {
        e0.f(this.f11372b, j3, i7);
    }

    @Override
    public final void zzn() {
        e0.H.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}

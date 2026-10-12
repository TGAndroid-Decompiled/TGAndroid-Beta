package g6;

import com.google.android.gms.internal.cast.a0;
import java.util.concurrent.atomic.AtomicReference;
import n6.b0;
public final class u extends g {
    public final AtomicReference f9973b;
    public final a0 f9974c;

    public u(v vVar) {
        this.f9973b = new AtomicReference(vVar);
        this.f9974c = new a0(vVar.f16089r, 0);
    }

    @Override
    public final void A0(String str, byte[] bArr) {
        if (((v) this.f9973b.get()) == null) {
            return;
        }
        v.f9975n0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void P(int i10) {
        v vVar = null;
        v vVar2 = (v) this.f9973b.getAndSet(null);
        if (vVar2 != null) {
            vVar2.f9985h0 = -1;
            vVar2.f9986i0 = -1;
            vVar2.U = null;
            vVar2.f9979b0 = null;
            vVar2.f9983f0 = 0.0d;
            vVar2.I();
            vVar2.f9980c0 = false;
            vVar2.f9984g0 = null;
            vVar = vVar2;
        }
        if (vVar != null) {
            v.f9975n0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i10));
            if (i10 != 0) {
                int i11 = vVar.R.get();
                b0 b0Var = vVar.v;
                b0Var.sendMessage(b0Var.obtainMessage(6, i11, 2));
            }
        }
    }

    @Override
    public final void T(String str, String str2) {
        v vVar = (v) this.f9973b.get();
        if (vVar == null) {
            return;
        }
        v.f9975n0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f9974c.post(new c5.w(vVar, str, str2, 6));
    }

    @Override
    public final void X(int i10) {
        if (((v) this.f9973b.get()) == null) {
            return;
        }
        synchronized (v.f9976o0) {
        }
    }

    @Override
    public final void Y(long j10) {
        v vVar = (v) this.f9973b.get();
        if (vVar == null) {
            return;
        }
        v.G(vVar, j10, 0);
    }

    @Override
    public final void c(int i10) {
        if (((v) this.f9973b.get()) == null) {
            return;
        }
        synchronized (v.f9977p0) {
        }
    }

    @Override
    public final void m(c6.d dVar, String str, String str2, boolean z10) {
        v vVar = (v) this.f9973b.get();
        if (vVar == null) {
            return;
        }
        vVar.U = dVar;
        vVar.f9987j0 = dVar.f4455a;
        vVar.f9988k0 = str2;
        vVar.f9979b0 = str;
        synchronized (v.f9976o0) {
        }
    }

    @Override
    public final void t0(d dVar) {
        v vVar = (v) this.f9973b.get();
        if (vVar == null) {
            return;
        }
        v.f9975n0.b("onDeviceStatusChanged", new Object[0]);
        this.f9974c.post(new j9.u(14, vVar, dVar));
    }

    @Override
    public final void y0(c cVar) {
        v vVar = (v) this.f9973b.get();
        if (vVar == null) {
            return;
        }
        v.f9975n0.b("onApplicationStatusChanged", new Object[0]);
        this.f9974c.post(new j9.u(15, vVar, cVar));
    }

    @Override
    public final void zzd(int i10) {
        v vVar = (v) this.f9973b.get();
        if (vVar != null) {
            vVar.f9987j0 = null;
            vVar.f9988k0 = null;
            synchronized (v.f9977p0) {
            }
            if (vVar.W != null) {
                this.f9974c.post(new androidx.emoji2.text.j(vVar, i10, 2));
            }
        }
    }

    @Override
    public final void zzg(int i10) {
        if (((v) this.f9973b.get()) == null) {
            return;
        }
        synchronized (v.f9977p0) {
        }
    }

    @Override
    public final void zzm(int i10, long j10) {
        v vVar = (v) this.f9973b.get();
        if (vVar == null) {
            return;
        }
        v.G(vVar, j10, i10);
    }

    @Override
    public final void zzn() {
        v.f9975n0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void f(int i10) {
    }

    @Override
    public final void v0(int i10) {
    }
}

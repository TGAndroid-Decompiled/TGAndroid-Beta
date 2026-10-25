package h6;

import com.google.android.gms.common.api.internal.q1;
import com.google.android.gms.internal.cast.y;
import java.util.concurrent.atomic.AtomicReference;
import o6.a0;
public final class u extends g {
    public final AtomicReference f12660b;
    public final y f12661c;

    public u(v vVar) {
        this.f12660b = new AtomicReference(vVar);
        this.f12661c = new y(vVar.f19128r, 0);
    }

    @Override
    public final void A0(String str, byte[] bArr) {
        if (((v) this.f12660b.get()) == null) {
            return;
        }
        v.f12662n0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void H(d6.d dVar, String str, String str2, boolean z10) {
        v vVar = (v) this.f12660b.get();
        if (vVar == null) {
            return;
        }
        vVar.U = dVar;
        vVar.f12674j0 = dVar.f8054a;
        vVar.f12675k0 = str2;
        vVar.f12666b0 = str;
        synchronized (v.f12663o0) {
        }
    }

    @Override
    public final void O(int i10) {
        v vVar = null;
        v vVar2 = (v) this.f12660b.getAndSet(null);
        if (vVar2 != null) {
            vVar2.f12672h0 = -1;
            vVar2.f12673i0 = -1;
            vVar2.U = null;
            vVar2.f12666b0 = null;
            vVar2.f12670f0 = 0.0d;
            vVar2.I();
            vVar2.f12667c0 = false;
            vVar2.f12671g0 = null;
            vVar = vVar2;
        }
        if (vVar != null) {
            v.f12662n0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i10));
            if (i10 != 0) {
                int i11 = vVar.R.get();
                a0 a0Var = vVar.v;
                a0Var.sendMessage(a0Var.obtainMessage(6, i11, 2));
            }
        }
    }

    @Override
    public final void R(String str, String str2) {
        v vVar = (v) this.f12660b.get();
        if (vVar == null) {
            return;
        }
        v.f12662n0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f12661c.post(new q1(vVar, str, str2, false, 6));
    }

    @Override
    public final void U(int i10) {
        if (((v) this.f12660b.get()) == null) {
            return;
        }
        synchronized (v.f12663o0) {
        }
    }

    @Override
    public final void W(long j10) {
        v vVar = (v) this.f12660b.get();
        if (vVar == null) {
            return;
        }
        v.G(vVar, j10, 0);
    }

    @Override
    public final void Z(c cVar) {
        v vVar = (v) this.f12660b.get();
        if (vVar == null) {
            return;
        }
        v.f12662n0.b("onApplicationStatusChanged", new Object[0]);
        this.f12661c.post(new k9.u(15, vVar, cVar));
    }

    @Override
    public final void c(int i10) {
        if (((v) this.f12660b.get()) == null) {
            return;
        }
        synchronized (v.f12664p0) {
        }
    }

    @Override
    public final void z0(d dVar) {
        v vVar = (v) this.f12660b.get();
        if (vVar == null) {
            return;
        }
        v.f12662n0.b("onDeviceStatusChanged", new Object[0]);
        this.f12661c.post(new k9.u(14, vVar, dVar));
    }

    @Override
    public final void zzd(int i10) {
        v vVar = (v) this.f12660b.get();
        if (vVar != null) {
            vVar.f12674j0 = null;
            vVar.f12675k0 = null;
            synchronized (v.f12664p0) {
            }
            if (vVar.W != null) {
                this.f12661c.post(new androidx.emoji2.text.j(vVar, i10, 2));
            }
        }
    }

    @Override
    public final void zzg(int i10) {
        if (((v) this.f12660b.get()) == null) {
            return;
        }
        synchronized (v.f12664p0) {
        }
    }

    @Override
    public final void zzm(int i10, long j10) {
        v vVar = (v) this.f12660b.get();
        if (vVar == null) {
            return;
        }
        v.G(vVar, j10, i10);
    }

    @Override
    public final void zzn() {
        v.f12662n0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void f(int i10) {
    }

    @Override
    public final void r0(int i10) {
    }
}

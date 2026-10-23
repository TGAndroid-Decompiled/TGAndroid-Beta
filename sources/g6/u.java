package g6;

import com.google.android.gms.internal.cast.a0;
import java.util.concurrent.atomic.AtomicReference;
public final class u extends g {
    public final AtomicReference f10900b;
    public final a0 f10901c;

    public u(v vVar) {
        this.f10900b = new AtomicReference(vVar);
        this.f10901c = new a0(vVar.f17248r, 0);
    }

    @Override
    public final void A0(String str, byte[] bArr) {
        if (((v) this.f10900b.get()) == null) {
            return;
        }
        v.f10902n0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void P(int i10) {
        v vVar = null;
        v vVar2 = (v) this.f10900b.getAndSet(null);
        if (vVar2 != null) {
            vVar2.f10912h0 = -1;
            vVar2.f10913i0 = -1;
            vVar2.U = null;
            vVar2.f10906b0 = null;
            vVar2.f10910f0 = 0.0d;
            vVar2.I();
            vVar2.f10907c0 = false;
            vVar2.f10911g0 = null;
            vVar = vVar2;
        }
        if (vVar != null) {
            v.f10902n0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i10));
            if (i10 != 0) {
                int i11 = vVar.R.get();
                n6.a0 a0Var = vVar.v;
                a0Var.sendMessage(a0Var.obtainMessage(6, i11, 2));
            }
        }
    }

    @Override
    public final void T(String str, String str2) {
        v vVar = (v) this.f10900b.get();
        if (vVar == null) {
            return;
        }
        v.f10902n0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f10901c.post(new c5.w(vVar, str, str2, 6));
    }

    @Override
    public final void X(int i10) {
        if (((v) this.f10900b.get()) == null) {
            return;
        }
        synchronized (v.f10903o0) {
        }
    }

    @Override
    public final void Y(long j10) {
        v vVar = (v) this.f10900b.get();
        if (vVar == null) {
            return;
        }
        v.G(vVar, j10, 0);
    }

    @Override
    public final void c(int i10) {
        if (((v) this.f10900b.get()) == null) {
            return;
        }
        synchronized (v.f10904p0) {
        }
    }

    @Override
    public final void m(c6.d dVar, String str, String str2, boolean z10) {
        v vVar = (v) this.f10900b.get();
        if (vVar == null) {
            return;
        }
        vVar.U = dVar;
        vVar.f10914j0 = dVar.f4831a;
        vVar.f10915k0 = str2;
        vVar.f10906b0 = str;
        synchronized (v.f10903o0) {
        }
    }

    @Override
    public final void t0(d dVar) {
        v vVar = (v) this.f10900b.get();
        if (vVar == null) {
            return;
        }
        v.f10902n0.b("onDeviceStatusChanged", new Object[0]);
        this.f10901c.post(new j9.u(14, vVar, dVar));
    }

    @Override
    public final void y0(c cVar) {
        v vVar = (v) this.f10900b.get();
        if (vVar == null) {
            return;
        }
        v.f10902n0.b("onApplicationStatusChanged", new Object[0]);
        this.f10901c.post(new j9.u(15, vVar, cVar));
    }

    @Override
    public final void zzd(int i10) {
        v vVar = (v) this.f10900b.get();
        if (vVar != null) {
            vVar.f10914j0 = null;
            vVar.f10915k0 = null;
            synchronized (v.f10904p0) {
            }
            if (vVar.W != null) {
                this.f10901c.post(new androidx.emoji2.text.j(vVar, i10, 2));
            }
        }
    }

    @Override
    public final void zzg(int i10) {
        if (((v) this.f10900b.get()) == null) {
            return;
        }
        synchronized (v.f10904p0) {
        }
    }

    @Override
    public final void zzm(int i10, long j10) {
        v vVar = (v) this.f10900b.get();
        if (vVar == null) {
            return;
        }
        v.G(vVar, j10, i10);
    }

    @Override
    public final void zzn() {
        v.f10902n0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void f(int i10) {
    }

    @Override
    public final void v0(int i10) {
    }
}

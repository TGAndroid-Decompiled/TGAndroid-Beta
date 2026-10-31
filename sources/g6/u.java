package g6;

import com.google.android.gms.internal.cast.z;
import java.util.concurrent.atomic.AtomicReference;
import n6.a0;
public final class u extends g {
    public final AtomicReference f7406b;
    public final z f7407c;

    public u(v vVar) {
        this.f7406b = new AtomicReference(vVar);
        this.f7407c = new z(vVar.f13586r, 0);
    }

    @Override
    public final void A0(c cVar) {
        v vVar = (v) this.f7406b.get();
        if (vVar == null) {
            return;
        }
        v.f7408n0.b("onApplicationStatusChanged", new Object[0]);
        this.f7407c.post(new j9.u(15, vVar, cVar));
    }

    @Override
    public final void C0(String str, byte[] bArr) {
        if (((v) this.f7406b.get()) == null) {
            return;
        }
        v.f7408n0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void Q(int i10) {
        v vVar = null;
        v vVar2 = (v) this.f7406b.getAndSet(null);
        if (vVar2 != null) {
            vVar2.f7418h0 = -1;
            vVar2.f7419i0 = -1;
            vVar2.U = null;
            vVar2.f7412b0 = null;
            vVar2.f7416f0 = 0.0d;
            vVar2.J();
            vVar2.f7413c0 = false;
            vVar2.f7417g0 = null;
            vVar = vVar2;
        }
        if (vVar != null) {
            v.f7408n0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i10));
            if (i10 != 0) {
                int i11 = vVar.R.get();
                a0 a0Var = vVar.f13588w;
                a0Var.sendMessage(a0Var.obtainMessage(6, i11, 2));
            }
        }
    }

    @Override
    public final void U(String str, String str2) {
        v vVar = (v) this.f7406b.get();
        if (vVar == null) {
            return;
        }
        v.f7408n0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f7407c.post(new c5.w(vVar, str, str2, 5));
    }

    @Override
    public final void Y(int i10) {
        if (((v) this.f7406b.get()) == null) {
            return;
        }
        synchronized (v.f7409o0) {
        }
    }

    @Override
    public final void Z(long j10) {
        v vVar = (v) this.f7406b.get();
        if (vVar == null) {
            return;
        }
        v.H(vVar, j10, 0);
    }

    @Override
    public final void d(int i10) {
        if (((v) this.f7406b.get()) == null) {
            return;
        }
        synchronized (v.f7410p0) {
        }
    }

    @Override
    public final void n(c6.d dVar, String str, String str2, boolean z10) {
        v vVar = (v) this.f7406b.get();
        if (vVar == null) {
            return;
        }
        vVar.U = dVar;
        vVar.f7420j0 = dVar.f3857a;
        vVar.f7421k0 = str2;
        vVar.f7412b0 = str;
        synchronized (v.f7409o0) {
        }
    }

    @Override
    public final void v0(d dVar) {
        v vVar = (v) this.f7406b.get();
        if (vVar == null) {
            return;
        }
        v.f7408n0.b("onDeviceStatusChanged", new Object[0]);
        this.f7407c.post(new j9.u(14, vVar, dVar));
    }

    @Override
    public final void zzd(int i10) {
        v vVar = (v) this.f7406b.get();
        if (vVar != null) {
            vVar.f7420j0 = null;
            vVar.f7421k0 = null;
            synchronized (v.f7410p0) {
            }
            if (vVar.W != null) {
                this.f7407c.post(new androidx.emoji2.text.j(vVar, i10, 2));
            }
        }
    }

    @Override
    public final void zzg(int i10) {
        if (((v) this.f7406b.get()) == null) {
            return;
        }
        synchronized (v.f7410p0) {
        }
    }

    @Override
    public final void zzm(int i10, long j10) {
        v vVar = (v) this.f7406b.get();
        if (vVar == null) {
            return;
        }
        v.H(vVar, j10, i10);
    }

    @Override
    public final void zzn() {
        v.f7408n0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void g(int i10) {
    }

    @Override
    public final void x0(int i10) {
    }
}

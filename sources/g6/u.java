package g6;

import com.google.android.gms.internal.cast.c0;
import java.util.concurrent.atomic.AtomicReference;
import n6.a0;
public final class u extends g {
    public final AtomicReference f9468b;
    public final c0 f9469c;

    public u(v vVar) {
        this.f9468b = new AtomicReference(vVar);
        this.f9469c = new c0(vVar.f15220r, 0);
    }

    @Override
    public final void B0(String str, byte[] bArr) {
        if (((v) this.f9468b.get()) == null) {
            return;
        }
        v.f9470n0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void P(int i10) {
        v vVar = null;
        v vVar2 = (v) this.f9468b.getAndSet(null);
        if (vVar2 != null) {
            vVar2.f9480h0 = -1;
            vVar2.f9481i0 = -1;
            vVar2.U = null;
            vVar2.f9474b0 = null;
            vVar2.f9478f0 = 0.0d;
            vVar2.I();
            vVar2.f9475c0 = false;
            vVar2.f9479g0 = null;
            vVar = vVar2;
        }
        if (vVar != null) {
            v.f9470n0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i10));
            if (i10 != 0) {
                int i11 = vVar.R.get();
                a0 a0Var = vVar.v;
                a0Var.sendMessage(a0Var.obtainMessage(6, i11, 2));
            }
        }
    }

    @Override
    public final void T(String str, String str2) {
        v vVar = (v) this.f9468b.get();
        if (vVar == null) {
            return;
        }
        v.f9470n0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f9469c.post(new c5.v(vVar, str, str2, 7));
    }

    @Override
    public final void X(int i10) {
        if (((v) this.f9468b.get()) == null) {
            return;
        }
        synchronized (v.f9471o0) {
        }
    }

    @Override
    public final void Y(long j3) {
        v vVar = (v) this.f9468b.get();
        if (vVar == null) {
            return;
        }
        v.G(vVar, j3, 0);
    }

    @Override
    public final void c(int i10) {
        if (((v) this.f9468b.get()) == null) {
            return;
        }
        synchronized (v.f9472p0) {
        }
    }

    @Override
    public final void m(c6.d dVar, String str, String str2, boolean z10) {
        v vVar = (v) this.f9468b.get();
        if (vVar == null) {
            return;
        }
        vVar.U = dVar;
        vVar.f9482j0 = dVar.f3970a;
        vVar.f9483k0 = str2;
        vVar.f9474b0 = str;
        synchronized (v.f9471o0) {
        }
    }

    @Override
    public final void u0(d dVar) {
        v vVar = (v) this.f9468b.get();
        if (vVar == null) {
            return;
        }
        v.f9470n0.b("onDeviceStatusChanged", new Object[0]);
        this.f9469c.post(new i9.s(14, vVar, dVar));
    }

    @Override
    public final void z0(c cVar) {
        v vVar = (v) this.f9468b.get();
        if (vVar == null) {
            return;
        }
        v.f9470n0.b("onApplicationStatusChanged", new Object[0]);
        this.f9469c.post(new i9.s(15, vVar, cVar));
    }

    @Override
    public final void zzd(int i10) {
        v vVar = (v) this.f9468b.get();
        if (vVar != null) {
            vVar.f9482j0 = null;
            vVar.f9483k0 = null;
            synchronized (v.f9472p0) {
            }
            if (vVar.W != null) {
                this.f9469c.post(new androidx.emoji2.text.j(vVar, i10, 2));
            }
        }
    }

    @Override
    public final void zzg(int i10) {
        if (((v) this.f9468b.get()) == null) {
            return;
        }
        synchronized (v.f9472p0) {
        }
    }

    @Override
    public final void zzm(int i10, long j3) {
        v vVar = (v) this.f9468b.get();
        if (vVar == null) {
            return;
        }
        v.G(vVar, j3, i10);
    }

    @Override
    public final void zzn() {
        v.f9470n0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void f(int i10) {
    }

    @Override
    public final void w0(int i10) {
    }
}

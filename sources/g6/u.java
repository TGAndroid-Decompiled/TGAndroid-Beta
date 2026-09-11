package g6;

import com.google.android.gms.internal.cast.c0;
import java.util.concurrent.atomic.AtomicReference;
import n6.a0;
public final class u extends g {
    public final AtomicReference f10429b;
    public final c0 f10430c;

    public u(v vVar) {
        this.f10429b = new AtomicReference(vVar);
        this.f10430c = new c0(vVar.f16540r, 0);
    }

    @Override
    public final void B0(String str, byte[] bArr) {
        if (((v) this.f10429b.get()) == null) {
            return;
        }
        v.f10431n0.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void P(int i10) {
        v vVar = null;
        v vVar2 = (v) this.f10429b.getAndSet(null);
        if (vVar2 != null) {
            vVar2.f10441h0 = -1;
            vVar2.f10442i0 = -1;
            vVar2.U = null;
            vVar2.f10435b0 = null;
            vVar2.f10439f0 = 0.0d;
            vVar2.I();
            vVar2.f10436c0 = false;
            vVar2.f10440g0 = null;
            vVar = vVar2;
        }
        if (vVar != null) {
            v.f10431n0.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i10));
            if (i10 != 0) {
                int i11 = vVar.R.get();
                a0 a0Var = vVar.v;
                a0Var.sendMessage(a0Var.obtainMessage(6, i11, 2));
            }
        }
    }

    @Override
    public final void T(String str, String str2) {
        v vVar = (v) this.f10429b.get();
        if (vVar == null) {
            return;
        }
        v.f10431n0.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f10430c.post(new c5.v(vVar, str, str2, 7));
    }

    @Override
    public final void X(int i10) {
        if (((v) this.f10429b.get()) == null) {
            return;
        }
        synchronized (v.f10432o0) {
        }
    }

    @Override
    public final void Y(long j3) {
        v vVar = (v) this.f10429b.get();
        if (vVar == null) {
            return;
        }
        v.G(vVar, j3, 0);
    }

    @Override
    public final void c(int i10) {
        if (((v) this.f10429b.get()) == null) {
            return;
        }
        synchronized (v.f10433p0) {
        }
    }

    @Override
    public final void m(c6.d dVar, String str, String str2, boolean z10) {
        v vVar = (v) this.f10429b.get();
        if (vVar == null) {
            return;
        }
        vVar.U = dVar;
        vVar.f10443j0 = dVar.f4479a;
        vVar.f10444k0 = str2;
        vVar.f10435b0 = str;
        synchronized (v.f10432o0) {
        }
    }

    @Override
    public final void u0(d dVar) {
        v vVar = (v) this.f10429b.get();
        if (vVar == null) {
            return;
        }
        v.f10431n0.b("onDeviceStatusChanged", new Object[0]);
        this.f10430c.post(new i9.s(14, vVar, dVar));
    }

    @Override
    public final void z0(c cVar) {
        v vVar = (v) this.f10429b.get();
        if (vVar == null) {
            return;
        }
        v.f10431n0.b("onApplicationStatusChanged", new Object[0]);
        this.f10430c.post(new i9.s(15, vVar, cVar));
    }

    @Override
    public final void zzd(int i10) {
        v vVar = (v) this.f10429b.get();
        if (vVar != null) {
            vVar.f10443j0 = null;
            vVar.f10444k0 = null;
            synchronized (v.f10433p0) {
            }
            if (vVar.W != null) {
                this.f10430c.post(new androidx.emoji2.text.j(vVar, i10, 2));
            }
        }
    }

    @Override
    public final void zzg(int i10) {
        if (((v) this.f10429b.get()) == null) {
            return;
        }
        synchronized (v.f10433p0) {
        }
    }

    @Override
    public final void zzm(int i10, long j3) {
        v vVar = (v) this.f10429b.get();
        if (vVar == null) {
            return;
        }
        v.G(vVar, j3, i10);
    }

    @Override
    public final void zzn() {
        v.f10431n0.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void f(int i10) {
    }

    @Override
    public final void w0(int i10) {
    }
}

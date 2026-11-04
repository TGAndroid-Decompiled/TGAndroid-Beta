package i6;

import com.google.android.gms.common.api.internal.j1;
import com.google.android.gms.internal.cast.z;
import java.util.concurrent.atomic.AtomicReference;
import p6.c0;
public final class u extends g {
    public final AtomicReference f14663b;
    public final z f14664c;

    public u(v vVar) {
        this.f14663b = new AtomicReference(vVar);
        this.f14664c = new z(vVar.f53220i, 0);
    }

    @Override
    public final void C0(String str, byte[] bArr) {
        if (((v) this.f14663b.get()) == null) {
            return;
        }
        v.Y.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void D0(d dVar) {
        v vVar = (v) this.f14663b.get();
        if (vVar == null) {
            return;
        }
        v.Y.b("onDeviceStatusChanged", new Object[0]);
        this.f14664c.post(new l9.u(14, vVar, dVar));
    }

    @Override
    public final void N(int i3) {
        v vVar = null;
        v vVar2 = (v) this.f14663b.getAndSet(null);
        if (vVar2 != null) {
            vVar2.S = -1;
            vVar2.T = -1;
            vVar2.F = null;
            vVar2.M = null;
            vVar2.Q = 0.0d;
            vVar2.C();
            vVar2.N = false;
            vVar2.R = null;
            vVar = vVar2;
        }
        if (vVar != null) {
            v.Y.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i3));
            if (i3 != 0) {
                int i10 = vVar.C.get();
                c0 c0Var = vVar.f53222k;
                c0Var.sendMessage(c0Var.obtainMessage(6, i10, 2));
            }
        }
    }

    @Override
    public final void Q(String str, String str2) {
        v vVar = (v) this.f14663b.get();
        if (vVar == null) {
            return;
        }
        v.Y.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f14664c.post(new j1(vVar, str, str2, false, 5));
    }

    @Override
    public final void T(c cVar) {
        v vVar = (v) this.f14663b.get();
        if (vVar == null) {
            return;
        }
        v.Y.b("onApplicationStatusChanged", new Object[0]);
        this.f14664c.post(new l9.u(15, vVar, cVar));
    }

    @Override
    public final void U(int i3) {
        if (((v) this.f14663b.get()) == null) {
            return;
        }
        synchronized (v.Z) {
        }
    }

    @Override
    public final void V(long j10) {
        v vVar = (v) this.f14663b.get();
        if (vVar == null) {
            return;
        }
        v.A(vVar, j10, 0);
    }

    @Override
    public final void b0(e6.d dVar, String str, String str2, boolean z10) {
        v vVar = (v) this.f14663b.get();
        if (vVar == null) {
            return;
        }
        vVar.F = dVar;
        vVar.U = dVar.f9682a;
        vVar.V = str2;
        vVar.M = str;
        synchronized (v.Z) {
        }
    }

    @Override
    public final void d(int i3) {
        if (((v) this.f14663b.get()) == null) {
            return;
        }
        synchronized (v.f14665a0) {
        }
    }

    @Override
    public final void zzd(int i3) {
        v vVar = (v) this.f14663b.get();
        if (vVar != null) {
            vVar.U = null;
            vVar.V = null;
            synchronized (v.f14665a0) {
            }
            if (vVar.H != null) {
                this.f14664c.post(new androidx.emoji2.text.j(vVar, i3, 2));
            }
        }
    }

    @Override
    public final void zzg(int i3) {
        if (((v) this.f14663b.get()) == null) {
            return;
        }
        synchronized (v.f14665a0) {
        }
    }

    @Override
    public final void zzm(int i3, long j10) {
        v vVar = (v) this.f14663b.get();
        if (vVar == null) {
            return;
        }
        v.A(vVar, j10, i3);
    }

    @Override
    public final void zzn() {
        v.Y.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void g(int i3) {
    }

    @Override
    public final void x0(int i3) {
    }
}

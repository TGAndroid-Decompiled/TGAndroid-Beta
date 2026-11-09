package j6;

import com.google.android.gms.internal.cast.y;
import java.util.concurrent.atomic.AtomicReference;
import q6.c0;
public final class u extends g {
    public final AtomicReference f16551b;
    public final y f16552c;

    public u(v vVar) {
        this.f16551b = new AtomicReference(vVar);
        this.f16552c = new y(vVar.f53856i, 0);
    }

    @Override
    public final void K0(d dVar) {
        v vVar = (v) this.f16551b.get();
        if (vVar == null) {
            return;
        }
        v.Y.b("onDeviceStatusChanged", new Object[0]);
        this.f16552c.post(new m9.u(20, vVar, dVar));
    }

    @Override
    public final void N0(c cVar) {
        v vVar = (v) this.f16551b.get();
        if (vVar == null) {
            return;
        }
        v.Y.b("onApplicationStatusChanged", new Object[0]);
        this.f16552c.post(new m9.u(21, vVar, cVar));
    }

    @Override
    public final void R0(f6.d dVar, String str, String str2, boolean z9) {
        v vVar = (v) this.f16551b.get();
        if (vVar == null) {
            return;
        }
        vVar.F = dVar;
        vVar.U = dVar.f11239a;
        vVar.V = str2;
        vVar.M = str;
        synchronized (v.Z) {
        }
    }

    @Override
    public final void W(int i7) {
        v vVar = null;
        v vVar2 = (v) this.f16551b.getAndSet(null);
        if (vVar2 != null) {
            vVar2.S = -1;
            vVar2.T = -1;
            vVar2.F = null;
            vVar2.M = null;
            vVar2.Q = 0.0d;
            vVar2.D();
            vVar2.N = false;
            vVar2.R = null;
            vVar = vVar2;
        }
        if (vVar != null) {
            v.Y.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i7));
            if (i7 != 0) {
                int i10 = vVar.C.get();
                c0 c0Var = vVar.f53858k;
                c0Var.sendMessage(c0Var.obtainMessage(6, i10, 2));
            }
        }
    }

    @Override
    public final void X0(String str, byte[] bArr) {
        if (((v) this.f16551b.get()) == null) {
            return;
        }
        v.Y.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void Z(String str, String str2) {
        v vVar = (v) this.f16551b.get();
        if (vVar == null) {
            return;
        }
        v.Y.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f16552c.post(new a9.h(vVar, str, str2, 6));
    }

    @Override
    public final void c0(int i7) {
        if (((v) this.f16551b.get()) == null) {
            return;
        }
        synchronized (v.Z) {
        }
    }

    @Override
    public final void f0(long j3) {
        v vVar = (v) this.f16551b.get();
        if (vVar == null) {
            return;
        }
        v.B(vVar, j3, 0);
    }

    @Override
    public final void g(int i7) {
        if (((v) this.f16551b.get()) == null) {
            return;
        }
        synchronized (v.f16553a0) {
        }
    }

    @Override
    public final void zzd(int i7) {
        v vVar = (v) this.f16551b.get();
        if (vVar != null) {
            vVar.U = null;
            vVar.V = null;
            synchronized (v.f16553a0) {
            }
            if (vVar.H != null) {
                this.f16552c.post(new androidx.emoji2.text.j(vVar, i7, 2));
            }
        }
    }

    @Override
    public final void zzg(int i7) {
        if (((v) this.f16551b.get()) == null) {
            return;
        }
        synchronized (v.f16553a0) {
        }
    }

    @Override
    public final void zzm(int i7, long j3) {
        v vVar = (v) this.f16551b.get();
        if (vVar == null) {
            return;
        }
        v.B(vVar, j3, i7);
    }

    @Override
    public final void zzn() {
        v.Y.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void O0(int i7) {
    }

    @Override
    public final void h(int i7) {
    }
}

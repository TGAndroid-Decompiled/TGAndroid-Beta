package j6;

import java.util.concurrent.atomic.AtomicReference;
import q6.c0;
public final class v extends g {
    public final AtomicReference f17289b;
    public final com.google.android.gms.internal.cast.y f17290c;

    public v(w wVar) {
        this.f17289b = new AtomicReference(wVar);
        this.f17290c = new com.google.android.gms.internal.cast.y(wVar.f55866i, 0);
    }

    @Override
    public final void K0(d dVar) {
        w wVar = (w) this.f17289b.get();
        if (wVar == null) {
            return;
        }
        w.Y.b("onDeviceStatusChanged", new Object[0]);
        this.f17290c.post(new m9.u(20, wVar, dVar));
    }

    @Override
    public final void N0(c cVar) {
        w wVar = (w) this.f17289b.get();
        if (wVar == null) {
            return;
        }
        w.Y.b("onApplicationStatusChanged", new Object[0]);
        this.f17290c.post(new m9.u(21, wVar, cVar));
    }

    @Override
    public final void S0(f6.d dVar, String str, String str2, boolean z10) {
        w wVar = (w) this.f17289b.get();
        if (wVar == null) {
            return;
        }
        wVar.F = dVar;
        wVar.U = dVar.f11373a;
        wVar.V = str2;
        wVar.M = str;
        synchronized (w.Z) {
        }
    }

    @Override
    public final void W(int i7) {
        w wVar = null;
        w wVar2 = (w) this.f17289b.getAndSet(null);
        if (wVar2 != null) {
            wVar2.S = -1;
            wVar2.T = -1;
            wVar2.F = null;
            wVar2.M = null;
            wVar2.Q = 0.0d;
            wVar2.D();
            wVar2.N = false;
            wVar2.R = null;
            wVar = wVar2;
        }
        if (wVar != null) {
            w.Y.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i7));
            if (i7 != 0) {
                int i10 = wVar.C.get();
                c0 c0Var = wVar.f55868k;
                c0Var.sendMessage(c0Var.obtainMessage(6, i10, 2));
            }
        }
    }

    @Override
    public final void Y0(String str, byte[] bArr) {
        if (((w) this.f17289b.get()) == null) {
            return;
        }
        w.Y.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void Z(String str, String str2) {
        w wVar = (w) this.f17289b.get();
        if (wVar == null) {
            return;
        }
        w.Y.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f17290c.post(new a9.h(wVar, str, str2, 6));
    }

    @Override
    public final void c0(int i7) {
        if (((w) this.f17289b.get()) == null) {
            return;
        }
        synchronized (w.Z) {
        }
    }

    @Override
    public final void f0(long j3) {
        w wVar = (w) this.f17289b.get();
        if (wVar == null) {
            return;
        }
        w.B(wVar, j3, 0);
    }

    @Override
    public final void g(int i7) {
        if (((w) this.f17289b.get()) == null) {
            return;
        }
        synchronized (w.f17291a0) {
        }
    }

    @Override
    public final void zzd(int i7) {
        w wVar = (w) this.f17289b.get();
        if (wVar != null) {
            wVar.U = null;
            wVar.V = null;
            synchronized (w.f17291a0) {
            }
            if (wVar.H != null) {
                this.f17290c.post(new androidx.emoji2.text.j(wVar, i7, 2));
            }
        }
    }

    @Override
    public final void zzg(int i7) {
        if (((w) this.f17289b.get()) == null) {
            return;
        }
        synchronized (w.f17291a0) {
        }
    }

    @Override
    public final void zzm(int i7, long j3) {
        w wVar = (w) this.f17289b.get();
        if (wVar == null) {
            return;
        }
        w.B(wVar, j3, i7);
    }

    @Override
    public final void zzn() {
        w.Y.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void O0(int i7) {
    }

    @Override
    public final void h(int i7) {
    }
}

package j6;

import java.util.concurrent.atomic.AtomicReference;
import q6.c0;
public final class w extends g {
    public final AtomicReference f17380b;
    public final com.google.android.gms.internal.cast.y f17381c;

    public w(x xVar) {
        this.f17380b = new AtomicReference(xVar);
        this.f17381c = new com.google.android.gms.internal.cast.y(xVar.f55989i, 0);
    }

    @Override
    public final void K0(d dVar) {
        x xVar = (x) this.f17380b.get();
        if (xVar == null) {
            return;
        }
        x.Y.b("onDeviceStatusChanged", new Object[0]);
        this.f17381c.post(new m9.u(20, xVar, dVar));
    }

    @Override
    public final void N0(c cVar) {
        x xVar = (x) this.f17380b.get();
        if (xVar == null) {
            return;
        }
        x.Y.b("onApplicationStatusChanged", new Object[0]);
        this.f17381c.post(new m9.u(21, xVar, cVar));
    }

    @Override
    public final void S0(f6.d dVar, String str, String str2, boolean z10) {
        x xVar = (x) this.f17380b.get();
        if (xVar == null) {
            return;
        }
        xVar.F = dVar;
        xVar.U = dVar.f11364a;
        xVar.V = str2;
        xVar.M = str;
        synchronized (x.Z) {
        }
    }

    @Override
    public final void W(int i7) {
        x xVar = null;
        x xVar2 = (x) this.f17380b.getAndSet(null);
        if (xVar2 != null) {
            xVar2.S = -1;
            xVar2.T = -1;
            xVar2.F = null;
            xVar2.M = null;
            xVar2.Q = 0.0d;
            xVar2.D();
            xVar2.N = false;
            xVar2.R = null;
            xVar = xVar2;
        }
        if (xVar != null) {
            x.Y.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i7));
            if (i7 != 0) {
                int i10 = xVar.C.get();
                c0 c0Var = xVar.f55991k;
                c0Var.sendMessage(c0Var.obtainMessage(6, i10, 2));
            }
        }
    }

    @Override
    public final void Y0(String str, byte[] bArr) {
        if (((x) this.f17380b.get()) == null) {
            return;
        }
        x.Y.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void Z(String str, String str2) {
        x xVar = (x) this.f17380b.get();
        if (xVar == null) {
            return;
        }
        x.Y.b("Receive (type=text, ns=%s) %s", str, str2);
        this.f17381c.post(new a9.h(xVar, str, str2, 6));
    }

    @Override
    public final void c0(int i7) {
        if (((x) this.f17380b.get()) == null) {
            return;
        }
        synchronized (x.Z) {
        }
    }

    @Override
    public final void f0(long j3) {
        x xVar = (x) this.f17380b.get();
        if (xVar == null) {
            return;
        }
        x.B(xVar, j3, 0);
    }

    @Override
    public final void g(int i7) {
        if (((x) this.f17380b.get()) == null) {
            return;
        }
        synchronized (x.f17382a0) {
        }
    }

    @Override
    public final void zzd(int i7) {
        x xVar = (x) this.f17380b.get();
        if (xVar != null) {
            xVar.U = null;
            xVar.V = null;
            synchronized (x.f17382a0) {
            }
            if (xVar.H != null) {
                this.f17381c.post(new androidx.emoji2.text.j(xVar, i7, 2));
            }
        }
    }

    @Override
    public final void zzg(int i7) {
        if (((x) this.f17380b.get()) == null) {
            return;
        }
        synchronized (x.f17382a0) {
        }
    }

    @Override
    public final void zzm(int i7, long j3) {
        x xVar = (x) this.f17380b.get();
        if (xVar == null) {
            return;
        }
        x.B(xVar, j3, i7);
    }

    @Override
    public final void zzn() {
        x.Y.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void O0(int i7) {
    }

    @Override
    public final void h(int i7) {
    }
}

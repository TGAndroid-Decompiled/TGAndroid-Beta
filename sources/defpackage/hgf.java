package defpackage;

import java.util.concurrent.atomic.AtomicReference;
public final class hgf extends l6d {
    public final AtomicReference c;
    public final o59 d;

    public hgf(ygf ygfVar) {
        super((byte) 1);
        this.c = new AtomicReference(ygfVar);
        this.d = new o59(ygfVar.i, (byte) 3);
    }

    @Override
    public final void T(wr wrVar, String str, String str2, boolean z) {
        ygf ygfVar = (ygf) this.c.get();
        if (ygfVar == null) {
            return;
        }
        ygfVar.F = wrVar;
        ygfVar.T = wrVar.a;
        ygfVar.U = str2;
        ygfVar.L = str;
        synchronized (ygf.Y) {
        }
    }

    @Override
    public final void V(int i) {
        if (((ygf) this.c.get()) == null) {
            return;
        }
        synchronized (ygf.Y) {
        }
    }

    @Override
    public final void W(int i) {
        ygf ygfVar = (ygf) this.c.get();
        if (ygfVar != null) {
            ygfVar.T = null;
            ygfVar.U = null;
            ygfVar.D(i);
            if (ygfVar.H != null) {
                this.d.post(new ef0(ygfVar, i, (byte) 6));
            }
        }
    }

    @Override
    public final void X(int i) {
        ygf ygfVar = (ygf) this.c.get();
        if (ygfVar == null) {
            return;
        }
        ygfVar.D(i);
    }

    @Override
    public final void Y(a5d a5dVar) {
        ygf ygfVar = (ygf) this.c.get();
        if (ygfVar == null) {
            return;
        }
        ygf.X.b("onApplicationStatusChanged", new Object[0]);
        this.d.post(new rld(ygfVar, a5dVar, (byte) 22));
    }

    @Override
    public final void Z(int i) {
        ygf ygfVar = (ygf) this.c.get();
        if (ygfVar == null) {
            return;
        }
        ygfVar.D(i);
    }

    @Override
    public final void a0(String str, byte[] bArr) {
        if (((ygf) this.c.get()) == null) {
            return;
        }
        ygf.X.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void c0(m5d m5dVar) {
        ygf ygfVar = (ygf) this.c.get();
        if (ygfVar == null) {
            return;
        }
        ygf.X.b("onDeviceStatusChanged", new Object[0]);
        this.d.post(new rld(ygfVar, m5dVar, (byte) 21));
    }

    @Override
    public final void d0(int i) {
        ygf ygfVar = null;
        ygf ygfVar2 = (ygf) this.c.getAndSet(null);
        if (ygfVar2 != null) {
            ygfVar2.R = -1;
            ygfVar2.S = -1;
            ygfVar2.F = null;
            ygfVar2.L = null;
            ygfVar2.P = 0.0d;
            ygfVar2.E();
            ygfVar2.M = false;
            ygfVar2.Q = null;
            ygfVar = ygfVar2;
        }
        if (ygfVar != null) {
            ygf.X.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i != 0) {
                int i2 = ygfVar.C.get();
                pbd pbdVar = ygfVar.k;
                pbdVar.sendMessage(pbdVar.obtainMessage(6, i2, 2));
            }
        }
    }

    @Override
    public final void e0(long j) {
        ygf ygfVar = (ygf) this.c.get();
        if (ygfVar == null) {
            return;
        }
        ygfVar.C(0, j);
    }

    @Override
    public final void f0(int i, long j) {
        ygf ygfVar = (ygf) this.c.get();
        if (ygfVar == null) {
            return;
        }
        ygfVar.C(i, j);
    }

    @Override
    public final void g0() {
        ygf.X.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void i0(String str, String str2) {
        ygf ygfVar = (ygf) this.c.get();
        if (ygfVar == null) {
            return;
        }
        ygf.X.b("Receive (type=text, ns=%s) %s", str, str2);
        this.d.post(new ey1(ygfVar, str, str2, false, (byte) 11));
    }
}

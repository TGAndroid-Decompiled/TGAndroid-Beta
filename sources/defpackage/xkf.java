package defpackage;

import java.util.concurrent.atomic.AtomicReference;
public final class xkf extends ebd {
    public final AtomicReference c;
    public final b99 d;

    public xkf(olf olfVar) {
        super((byte) 1);
        this.c = new AtomicReference(olfVar);
        this.d = new b99(olfVar.i, (byte) 3);
    }

    @Override
    public final void T(xr xrVar, String str, String str2, boolean z) {
        olf olfVar = (olf) this.c.get();
        if (olfVar == null) {
            return;
        }
        olfVar.F = xrVar;
        olfVar.T = xrVar.a;
        olfVar.U = str2;
        olfVar.L = str;
        synchronized (olf.Y) {
        }
    }

    @Override
    public final void V(int i) {
        if (((olf) this.c.get()) == null) {
            return;
        }
        synchronized (olf.Y) {
        }
    }

    @Override
    public final void W(int i) {
        olf olfVar = (olf) this.c.get();
        if (olfVar != null) {
            olfVar.T = null;
            olfVar.U = null;
            olfVar.D(i);
            if (olfVar.H != null) {
                this.d.post(new gf0(olfVar, i, (byte) 6));
            }
        }
    }

    @Override
    public final void X(int i) {
        olf olfVar = (olf) this.c.get();
        if (olfVar == null) {
            return;
        }
        olfVar.D(i);
    }

    @Override
    public final void Y(t9d t9dVar) {
        olf olfVar = (olf) this.c.get();
        if (olfVar == null) {
            return;
        }
        olf.X.b("onApplicationStatusChanged", new Object[0]);
        this.d.post(new iqd(olfVar, t9dVar, (byte) 22));
    }

    @Override
    public final void Z(int i) {
        olf olfVar = (olf) this.c.get();
        if (olfVar == null) {
            return;
        }
        olfVar.D(i);
    }

    @Override
    public final void a0(String str, byte[] bArr) {
        if (((olf) this.c.get()) == null) {
            return;
        }
        olf.X.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void c0(fad fadVar) {
        olf olfVar = (olf) this.c.get();
        if (olfVar == null) {
            return;
        }
        olf.X.b("onDeviceStatusChanged", new Object[0]);
        this.d.post(new iqd(olfVar, fadVar, (byte) 21));
    }

    @Override
    public final void d0(int i) {
        olf olfVar = null;
        olf olfVar2 = (olf) this.c.getAndSet(null);
        if (olfVar2 != null) {
            olfVar2.R = -1;
            olfVar2.S = -1;
            olfVar2.F = null;
            olfVar2.L = null;
            olfVar2.P = 0.0d;
            olfVar2.E();
            olfVar2.M = false;
            olfVar2.Q = null;
            olfVar = olfVar2;
        }
        if (olfVar != null) {
            olf.X.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i != 0) {
                int i2 = olfVar.C.get();
                igd igdVar = olfVar.k;
                igdVar.sendMessage(igdVar.obtainMessage(6, i2, 2));
            }
        }
    }

    @Override
    public final void e0(long j) {
        olf olfVar = (olf) this.c.get();
        if (olfVar == null) {
            return;
        }
        olfVar.C(0, j);
    }

    @Override
    public final void f0(int i, long j) {
        olf olfVar = (olf) this.c.get();
        if (olfVar == null) {
            return;
        }
        olfVar.C(i, j);
    }

    @Override
    public final void g0() {
        olf.X.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void i0(String str, String str2) {
        olf olfVar = (olf) this.c.get();
        if (olfVar == null) {
            return;
        }
        olf.X.b("Receive (type=text, ns=%s) %s", str, str2);
        this.d.post(new uy1(olfVar, str, str2, false, (byte) 11));
    }
}

package defpackage;

import java.util.concurrent.atomic.AtomicReference;
public final class iif extends n8d {
    public final AtomicReference c;
    public final q79 d;

    public iif(zif zifVar) {
        super((byte) 1);
        this.c = new AtomicReference(zifVar);
        this.d = new q79(zifVar.i, (byte) 3);
    }

    @Override
    public final void T(ws wsVar, String str, String str2, boolean z) {
        zif zifVar = (zif) this.c.get();
        if (zifVar == null) {
            return;
        }
        zifVar.F = wsVar;
        zifVar.T = wsVar.a;
        zifVar.U = str2;
        zifVar.L = str;
        synchronized (zif.Y) {
        }
    }

    @Override
    public final void V(int i) {
        if (((zif) this.c.get()) == null) {
            return;
        }
        synchronized (zif.Y) {
        }
    }

    @Override
    public final void W(int i) {
        zif zifVar = (zif) this.c.get();
        if (zifVar != null) {
            zifVar.T = null;
            zifVar.U = null;
            zifVar.D(i);
            if (zifVar.H != null) {
                this.d.post(new eg0(zifVar, i, (byte) 6));
            }
        }
    }

    @Override
    public final void X(int i) {
        zif zifVar = (zif) this.c.get();
        if (zifVar == null) {
            return;
        }
        zifVar.D(i);
    }

    @Override
    public final void Y(c7d c7dVar) {
        zif zifVar = (zif) this.c.get();
        if (zifVar == null) {
            return;
        }
        zif.X.b("onApplicationStatusChanged", new Object[0]);
        this.d.post(new tnd(zifVar, c7dVar, (byte) 22));
    }

    @Override
    public final void Z(int i) {
        zif zifVar = (zif) this.c.get();
        if (zifVar == null) {
            return;
        }
        zifVar.D(i);
    }

    @Override
    public final void a0(String str, byte[] bArr) {
        if (((zif) this.c.get()) == null) {
            return;
        }
        zif.X.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override
    public final void c0(o7d o7dVar) {
        zif zifVar = (zif) this.c.get();
        if (zifVar == null) {
            return;
        }
        zif.X.b("onDeviceStatusChanged", new Object[0]);
        this.d.post(new tnd(zifVar, o7dVar, (byte) 21));
    }

    @Override
    public final void d0(int i) {
        zif zifVar = null;
        zif zifVar2 = (zif) this.c.getAndSet(null);
        if (zifVar2 != null) {
            zifVar2.R = -1;
            zifVar2.S = -1;
            zifVar2.F = null;
            zifVar2.L = null;
            zifVar2.P = 0.0d;
            zifVar2.E();
            zifVar2.M = false;
            zifVar2.Q = null;
            zifVar = zifVar2;
        }
        if (zifVar != null) {
            zif.X.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i != 0) {
                int i2 = zifVar.C.get();
                rdd rddVar = zifVar.k;
                rddVar.sendMessage(rddVar.obtainMessage(6, i2, 2));
            }
        }
    }

    @Override
    public final void e0(long j) {
        zif zifVar = (zif) this.c.get();
        if (zifVar == null) {
            return;
        }
        zifVar.C(0, j);
    }

    @Override
    public final void f0(int i, long j) {
        zif zifVar = (zif) this.c.get();
        if (zifVar == null) {
            return;
        }
        zifVar.C(i, j);
    }

    @Override
    public final void g0() {
        zif.X.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override
    public final void i0(String str, String str2) {
        zif zifVar = (zif) this.c.get();
        if (zifVar == null) {
            return;
        }
        zif.X.b("Receive (type=text, ns=%s) %s", str, str2);
        this.d.post(new rz1(zifVar, str, str2, false, (byte) 11));
    }
}

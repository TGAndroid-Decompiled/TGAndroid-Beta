package defpackage;
public final class x3d extends j5d {
    public final byte h;
    public final Object n;

    public x3d(Object obj, byte b) {
        this.h = b;
        this.n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                y3d y3dVar = (y3d) ((t8a) this.n).b;
                y3dVar.b.b("unlinkToDeath", new Object[0]);
                y3dVar.n.asBinder().unlinkToDeath(y3dVar.k, 0);
                y3dVar.n = null;
                y3dVar.g = false;
                return;
            default:
                synchronized (((y3d) this.n).f) {
                    if (((y3d) this.n).l.get() > 0 && ((y3d) this.n).l.decrementAndGet() > 0) {
                        ((y3d) this.n).b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                    y3d y3dVar2 = (y3d) this.n;
                    if (y3dVar2.n != null) {
                        y3dVar2.b.b("Unbind from service.", new Object[0]);
                        y3d y3dVar3 = (y3d) this.n;
                        y3dVar3.a.unbindService(y3dVar3.m);
                        y3dVar2 = (y3d) this.n;
                        y3dVar2.g = false;
                        y3dVar2.n = null;
                        y3dVar2.m = null;
                    }
                    y3dVar2.e();
                    return;
                }
        }
    }
}

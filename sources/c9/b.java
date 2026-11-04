package c9;
public final class b extends h0 {
    public final int h;
    public final Object f4245n;

    public b(Object obj, int i3) {
        this.h = i3;
        this.f4245n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((bg.a) this.f4245n).f3297b;
                cVar.f4248b.b("unlinkToDeath", new Object[0]);
                cVar.f4258n.asBinder().unlinkToDeath(cVar.f4255k, 0);
                cVar.f4258n = null;
                cVar.f4252g = false;
                return;
            default:
                synchronized (((c) this.f4245n).f4251f) {
                    try {
                        if (((c) this.f4245n).f4256l.get() > 0 && ((c) this.f4245n).f4256l.decrementAndGet() > 0) {
                            ((c) this.f4245n).f4248b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f4245n;
                        if (cVar2.f4258n != null) {
                            cVar2.f4248b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f4245n;
                            cVar3.f4247a.unbindService(cVar3.f4257m);
                            c cVar4 = (c) this.f4245n;
                            cVar4.f4252g = false;
                            cVar4.f4258n = null;
                            cVar4.f4257m = null;
                        }
                        ((c) this.f4245n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

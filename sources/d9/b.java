package d9;
public final class b extends h0 {
    public final int h;
    public final Object f8219n;

    public b(Object obj, int i7) {
        this.h = i7;
        this.f8219n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((ag.a) this.f8219n).f1055b;
                cVar.f8222b.b("unlinkToDeath", new Object[0]);
                cVar.f8232n.asBinder().unlinkToDeath(cVar.f8229k, 0);
                cVar.f8232n = null;
                cVar.f8226g = false;
                return;
            default:
                synchronized (((c) this.f8219n).f8225f) {
                    try {
                        if (((c) this.f8219n).f8230l.get() > 0 && ((c) this.f8219n).f8230l.decrementAndGet() > 0) {
                            ((c) this.f8219n).f8222b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f8219n;
                        if (cVar2.f8232n != null) {
                            cVar2.f8222b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f8219n;
                            cVar3.f8221a.unbindService(cVar3.f8231m);
                            c cVar4 = (c) this.f8219n;
                            cVar4.f8226g = false;
                            cVar4.f8232n = null;
                            cVar4.f8231m = null;
                        }
                        ((c) this.f8219n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

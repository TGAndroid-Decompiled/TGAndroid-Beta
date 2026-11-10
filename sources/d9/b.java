package d9;
public final class b extends h0 {
    public final int h;
    public final Object f8222n;

    public b(Object obj, int i7) {
        this.h = i7;
        this.f8222n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((ag.a) this.f8222n).f1055b;
                cVar.f8225b.b("unlinkToDeath", new Object[0]);
                cVar.f8235n.asBinder().unlinkToDeath(cVar.f8232k, 0);
                cVar.f8235n = null;
                cVar.f8229g = false;
                return;
            default:
                synchronized (((c) this.f8222n).f8228f) {
                    try {
                        if (((c) this.f8222n).f8233l.get() > 0 && ((c) this.f8222n).f8233l.decrementAndGet() > 0) {
                            ((c) this.f8222n).f8225b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f8222n;
                        if (cVar2.f8235n != null) {
                            cVar2.f8225b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f8222n;
                            cVar3.f8224a.unbindService(cVar3.f8234m);
                            c cVar4 = (c) this.f8222n;
                            cVar4.f8229g = false;
                            cVar4.f8235n = null;
                            cVar4.f8234m = null;
                        }
                        ((c) this.f8222n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

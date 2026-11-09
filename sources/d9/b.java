package d9;
public final class b extends h0 {
    public final int h;
    public final Object f8217n;

    public b(Object obj, int i7) {
        this.h = i7;
        this.f8217n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((ag.a) this.f8217n).f1055b;
                cVar.f8220b.b("unlinkToDeath", new Object[0]);
                cVar.f8230n.asBinder().unlinkToDeath(cVar.f8227k, 0);
                cVar.f8230n = null;
                cVar.f8224g = false;
                return;
            default:
                synchronized (((c) this.f8217n).f8223f) {
                    try {
                        if (((c) this.f8217n).f8228l.get() > 0 && ((c) this.f8217n).f8228l.decrementAndGet() > 0) {
                            ((c) this.f8217n).f8220b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f8217n;
                        if (cVar2.f8230n != null) {
                            cVar2.f8220b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f8217n;
                            cVar3.f8219a.unbindService(cVar3.f8229m);
                            c cVar4 = (c) this.f8217n;
                            cVar4.f8224g = false;
                            cVar4.f8230n = null;
                            cVar4.f8229m = null;
                        }
                        ((c) this.f8217n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

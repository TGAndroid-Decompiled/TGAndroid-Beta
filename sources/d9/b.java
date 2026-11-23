package d9;
public final class b extends h0 {
    public final int h;
    public final Object f7920n;

    public b(Object obj, int i7) {
        this.h = i7;
        this.f7920n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((ag.a) this.f7920n).f1052b;
                cVar.f7923b.b("unlinkToDeath", new Object[0]);
                cVar.f7933n.asBinder().unlinkToDeath(cVar.f7930k, 0);
                cVar.f7933n = null;
                cVar.f7927g = false;
                return;
            default:
                synchronized (((c) this.f7920n).f7926f) {
                    try {
                        if (((c) this.f7920n).f7931l.get() > 0 && ((c) this.f7920n).f7931l.decrementAndGet() > 0) {
                            ((c) this.f7920n).f7923b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f7920n;
                        if (cVar2.f7933n != null) {
                            cVar2.f7923b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f7920n;
                            cVar3.f7922a.unbindService(cVar3.f7932m);
                            c cVar4 = (c) this.f7920n;
                            cVar4.f7927g = false;
                            cVar4.f7933n = null;
                            cVar4.f7932m = null;
                        }
                        ((c) this.f7920n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

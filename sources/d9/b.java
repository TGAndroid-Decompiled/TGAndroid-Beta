package d9;
public final class b extends h0 {
    public final int h;
    public final Object f7888n;

    public b(Object obj, int i7) {
        this.h = i7;
        this.f7888n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((ag.a) this.f7888n).f1052b;
                cVar.f7891b.b("unlinkToDeath", new Object[0]);
                cVar.f7901n.asBinder().unlinkToDeath(cVar.f7898k, 0);
                cVar.f7901n = null;
                cVar.f7895g = false;
                return;
            default:
                synchronized (((c) this.f7888n).f7894f) {
                    try {
                        if (((c) this.f7888n).f7899l.get() > 0 && ((c) this.f7888n).f7899l.decrementAndGet() > 0) {
                            ((c) this.f7888n).f7891b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f7888n;
                        if (cVar2.f7901n != null) {
                            cVar2.f7891b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f7888n;
                            cVar3.f7890a.unbindService(cVar3.f7900m);
                            c cVar4 = (c) this.f7888n;
                            cVar4.f7895g = false;
                            cVar4.f7901n = null;
                            cVar4.f7900m = null;
                        }
                        ((c) this.f7888n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

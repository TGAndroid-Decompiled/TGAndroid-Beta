package d9;
public final class b extends h0 {
    public final int h;
    public final Object f7891n;

    public b(Object obj, int i7) {
        this.h = i7;
        this.f7891n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((ag.a) this.f7891n).f1052b;
                cVar.f7894b.b("unlinkToDeath", new Object[0]);
                cVar.f7904n.asBinder().unlinkToDeath(cVar.f7901k, 0);
                cVar.f7904n = null;
                cVar.f7898g = false;
                return;
            default:
                synchronized (((c) this.f7891n).f7897f) {
                    try {
                        if (((c) this.f7891n).f7902l.get() > 0 && ((c) this.f7891n).f7902l.decrementAndGet() > 0) {
                            ((c) this.f7891n).f7894b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f7891n;
                        if (cVar2.f7904n != null) {
                            cVar2.f7894b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f7891n;
                            cVar3.f7893a.unbindService(cVar3.f7903m);
                            c cVar4 = (c) this.f7891n;
                            cVar4.f7898g = false;
                            cVar4.f7904n = null;
                            cVar4.f7903m = null;
                        }
                        ((c) this.f7891n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

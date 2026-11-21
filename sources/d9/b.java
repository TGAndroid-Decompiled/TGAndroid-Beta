package d9;
public final class b extends h0 {
    public final int h;
    public final Object f7917n;

    public b(Object obj, int i7) {
        this.h = i7;
        this.f7917n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((ag.a) this.f7917n).f1052b;
                cVar.f7920b.b("unlinkToDeath", new Object[0]);
                cVar.f7930n.asBinder().unlinkToDeath(cVar.f7927k, 0);
                cVar.f7930n = null;
                cVar.f7924g = false;
                return;
            default:
                synchronized (((c) this.f7917n).f7923f) {
                    try {
                        if (((c) this.f7917n).f7928l.get() > 0 && ((c) this.f7917n).f7928l.decrementAndGet() > 0) {
                            ((c) this.f7917n).f7920b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f7917n;
                        if (cVar2.f7930n != null) {
                            cVar2.f7920b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f7917n;
                            cVar3.f7919a.unbindService(cVar3.f7929m);
                            c cVar4 = (c) this.f7917n;
                            cVar4.f7924g = false;
                            cVar4.f7930n = null;
                            cVar4.f7929m = null;
                        }
                        ((c) this.f7917n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

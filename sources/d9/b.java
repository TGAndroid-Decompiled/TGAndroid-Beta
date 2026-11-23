package d9;
public final class b extends h0 {
    public final int h;
    public final Object f7882n;

    public b(Object obj, int i7) {
        this.h = i7;
        this.f7882n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((ag.a) this.f7882n).f1052b;
                cVar.f7885b.b("unlinkToDeath", new Object[0]);
                cVar.f7895n.asBinder().unlinkToDeath(cVar.f7892k, 0);
                cVar.f7895n = null;
                cVar.f7889g = false;
                return;
            default:
                synchronized (((c) this.f7882n).f7888f) {
                    try {
                        if (((c) this.f7882n).f7893l.get() > 0 && ((c) this.f7882n).f7893l.decrementAndGet() > 0) {
                            ((c) this.f7882n).f7885b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f7882n;
                        if (cVar2.f7895n != null) {
                            cVar2.f7885b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f7882n;
                            cVar3.f7884a.unbindService(cVar3.f7894m);
                            c cVar4 = (c) this.f7882n;
                            cVar4.f7889g = false;
                            cVar4.f7895n = null;
                            cVar4.f7894m = null;
                        }
                        ((c) this.f7882n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

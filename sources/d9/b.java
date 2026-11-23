package d9;
public final class b extends h0 {
    public final int h;
    public final Object f7883n;

    public b(Object obj, int i7) {
        this.h = i7;
        this.f7883n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((ag.a) this.f7883n).f1052b;
                cVar.f7886b.b("unlinkToDeath", new Object[0]);
                cVar.f7896n.asBinder().unlinkToDeath(cVar.f7893k, 0);
                cVar.f7896n = null;
                cVar.f7890g = false;
                return;
            default:
                synchronized (((c) this.f7883n).f7889f) {
                    try {
                        if (((c) this.f7883n).f7894l.get() > 0 && ((c) this.f7883n).f7894l.decrementAndGet() > 0) {
                            ((c) this.f7883n).f7886b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f7883n;
                        if (cVar2.f7896n != null) {
                            cVar2.f7886b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f7883n;
                            cVar3.f7885a.unbindService(cVar3.f7895m);
                            c cVar4 = (c) this.f7883n;
                            cVar4.f7890g = false;
                            cVar4.f7896n = null;
                            cVar4.f7895m = null;
                        }
                        ((c) this.f7883n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

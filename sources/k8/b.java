package k8;
public final class b extends h0 {
    public final int h;
    public final Object f14669n;

    public b(Object obj, int i9) {
        this.h = i9;
        this.f14669n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((df.a) this.f14669n).f4482b;
                cVar.f14672b.b("unlinkToDeath", new Object[0]);
                cVar.f14682n.asBinder().unlinkToDeath(cVar.f14679k, 0);
                cVar.f14682n = null;
                cVar.f14676g = false;
                return;
            default:
                synchronized (((c) this.f14669n).f14675f) {
                    try {
                        if (((c) this.f14669n).f14680l.get() > 0 && ((c) this.f14669n).f14680l.decrementAndGet() > 0) {
                            ((c) this.f14669n).f14672b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f14669n;
                        if (cVar2.f14682n != null) {
                            cVar2.f14672b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f14669n;
                            cVar3.f14671a.unbindService(cVar3.f14681m);
                            c cVar4 = (c) this.f14669n;
                            cVar4.f14676g = false;
                            cVar4.f14682n = null;
                            cVar4.f14681m = null;
                        }
                        ((c) this.f14669n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

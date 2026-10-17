package a9;
public final class c extends k0 {
    public final int h;
    public final Object f321n;

    public c(Object obj, int i10) {
        this.h = i10;
        this.f321n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                e eVar = (e) ((d) this.f321n).f323b;
                eVar.f327b.b("unlinkToDeath", new Object[0]);
                eVar.f336n.asBinder().unlinkToDeath(eVar.f333k, 0);
                eVar.f336n = null;
                eVar.f330g = false;
                return;
            default:
                synchronized (((e) this.f321n).f329f) {
                    try {
                        if (((e) this.f321n).f334l.get() > 0 && ((e) this.f321n).f334l.decrementAndGet() > 0) {
                            ((e) this.f321n).f327b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        e eVar2 = (e) this.f321n;
                        if (eVar2.f336n != null) {
                            eVar2.f327b.b("Unbind from service.", new Object[0]);
                            e eVar3 = (e) this.f321n;
                            eVar3.f326a.unbindService(eVar3.f335m);
                            e eVar4 = (e) this.f321n;
                            eVar4.f330g = false;
                            eVar4.f336n = null;
                            eVar4.f335m = null;
                        }
                        ((e) this.f321n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

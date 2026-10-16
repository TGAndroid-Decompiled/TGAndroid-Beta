package a9;
public final class c extends k0 {
    public final int h;
    public final Object f322n;

    public c(Object obj, int i10) {
        this.h = i10;
        this.f322n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                e eVar = (e) ((d) this.f322n).f324b;
                eVar.f328b.b("unlinkToDeath", new Object[0]);
                eVar.f337n.asBinder().unlinkToDeath(eVar.f334k, 0);
                eVar.f337n = null;
                eVar.f331g = false;
                return;
            default:
                synchronized (((e) this.f322n).f330f) {
                    try {
                        if (((e) this.f322n).f335l.get() > 0 && ((e) this.f322n).f335l.decrementAndGet() > 0) {
                            ((e) this.f322n).f328b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        e eVar2 = (e) this.f322n;
                        if (eVar2.f337n != null) {
                            eVar2.f328b.b("Unbind from service.", new Object[0]);
                            e eVar3 = (e) this.f322n;
                            eVar3.f327a.unbindService(eVar3.f336m);
                            e eVar4 = (e) this.f322n;
                            eVar4.f331g = false;
                            eVar4.f337n = null;
                            eVar4.f336m = null;
                        }
                        ((e) this.f322n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

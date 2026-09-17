package a9;
public final class c extends j0 {
    public final int h;
    public final Object f327n;

    public c(Object obj, int i10) {
        this.h = i10;
        this.f327n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                e eVar = (e) ((d) this.f327n).f330b;
                eVar.f333b.b("unlinkToDeath", new Object[0]);
                eVar.f343n.asBinder().unlinkToDeath(eVar.f340k, 0);
                eVar.f343n = null;
                eVar.f337g = false;
                return;
            default:
                synchronized (((e) this.f327n).f336f) {
                    try {
                        if (((e) this.f327n).f341l.get() > 0 && ((e) this.f327n).f341l.decrementAndGet() > 0) {
                            ((e) this.f327n).f333b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        e eVar2 = (e) this.f327n;
                        if (eVar2.f343n != null) {
                            eVar2.f333b.b("Unbind from service.", new Object[0]);
                            e eVar3 = (e) this.f327n;
                            eVar3.f332a.unbindService(eVar3.f342m);
                            e eVar4 = (e) this.f327n;
                            eVar4.f337g = false;
                            eVar4.f343n = null;
                            eVar4.f342m = null;
                        }
                        ((e) this.f327n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

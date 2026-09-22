package a9;
public final class c extends k0 {
    public final int h;
    public final Object f315n;

    public c(Object obj, int i10) {
        this.h = i10;
        this.f315n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                e eVar = (e) ((d) this.f315n).f317b;
                eVar.f321b.b("unlinkToDeath", new Object[0]);
                eVar.f330n.asBinder().unlinkToDeath(eVar.f327k, 0);
                eVar.f330n = null;
                eVar.f324g = false;
                return;
            default:
                synchronized (((e) this.f315n).f323f) {
                    try {
                        if (((e) this.f315n).f328l.get() > 0 && ((e) this.f315n).f328l.decrementAndGet() > 0) {
                            ((e) this.f315n).f321b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        e eVar2 = (e) this.f315n;
                        if (eVar2.f330n != null) {
                            eVar2.f321b.b("Unbind from service.", new Object[0]);
                            e eVar3 = (e) this.f315n;
                            eVar3.f320a.unbindService(eVar3.f329m);
                            e eVar4 = (e) this.f315n;
                            eVar4.f324g = false;
                            eVar4.f330n = null;
                            eVar4.f329m = null;
                        }
                        ((e) this.f315n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

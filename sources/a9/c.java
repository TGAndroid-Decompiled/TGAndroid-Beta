package a9;
public final class c extends k0 {
    public final int h;
    public final Object f318n;

    public c(Object obj, int i10) {
        this.h = i10;
        this.f318n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                e eVar = (e) ((d) this.f318n).f320b;
                eVar.f324b.b("unlinkToDeath", new Object[0]);
                eVar.f333n.asBinder().unlinkToDeath(eVar.f330k, 0);
                eVar.f333n = null;
                eVar.f327g = false;
                return;
            default:
                synchronized (((e) this.f318n).f326f) {
                    try {
                        if (((e) this.f318n).f331l.get() > 0 && ((e) this.f318n).f331l.decrementAndGet() > 0) {
                            ((e) this.f318n).f324b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        e eVar2 = (e) this.f318n;
                        if (eVar2.f333n != null) {
                            eVar2.f324b.b("Unbind from service.", new Object[0]);
                            e eVar3 = (e) this.f318n;
                            eVar3.f323a.unbindService(eVar3.f332m);
                            e eVar4 = (e) this.f318n;
                            eVar4.f327g = false;
                            eVar4.f333n = null;
                            eVar4.f332m = null;
                        }
                        ((e) this.f318n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

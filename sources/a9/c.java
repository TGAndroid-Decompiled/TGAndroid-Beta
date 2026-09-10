package a9;
public final class c extends k0 {
    public final int h;
    public final Object f314n;

    public c(Object obj, int i10) {
        this.h = i10;
        this.f314n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                e eVar = (e) ((d) this.f314n).f316b;
                eVar.f320b.b("unlinkToDeath", new Object[0]);
                eVar.f329n.asBinder().unlinkToDeath(eVar.f326k, 0);
                eVar.f329n = null;
                eVar.f323g = false;
                return;
            default:
                synchronized (((e) this.f314n).f322f) {
                    try {
                        if (((e) this.f314n).f327l.get() > 0 && ((e) this.f314n).f327l.decrementAndGet() > 0) {
                            ((e) this.f314n).f320b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        e eVar2 = (e) this.f314n;
                        if (eVar2.f329n != null) {
                            eVar2.f320b.b("Unbind from service.", new Object[0]);
                            e eVar3 = (e) this.f314n;
                            eVar3.f319a.unbindService(eVar3.f328m);
                            e eVar4 = (e) this.f314n;
                            eVar4.f323g = false;
                            eVar4.f329n = null;
                            eVar4.f328m = null;
                        }
                        ((e) this.f314n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

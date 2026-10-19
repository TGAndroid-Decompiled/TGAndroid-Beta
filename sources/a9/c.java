package a9;
public final class c extends k0 {
    public final int h;
    public final Object f320n;

    public c(Object obj, int i10) {
        this.h = i10;
        this.f320n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                e eVar = (e) ((d) this.f320n).f322b;
                eVar.f326b.b("unlinkToDeath", new Object[0]);
                eVar.f335n.asBinder().unlinkToDeath(eVar.f332k, 0);
                eVar.f335n = null;
                eVar.f329g = false;
                return;
            default:
                synchronized (((e) this.f320n).f328f) {
                    try {
                        if (((e) this.f320n).f333l.get() > 0 && ((e) this.f320n).f333l.decrementAndGet() > 0) {
                            ((e) this.f320n).f326b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        e eVar2 = (e) this.f320n;
                        if (eVar2.f335n != null) {
                            eVar2.f326b.b("Unbind from service.", new Object[0]);
                            e eVar3 = (e) this.f320n;
                            eVar3.f325a.unbindService(eVar3.f334m);
                            e eVar4 = (e) this.f320n;
                            eVar4.f329g = false;
                            eVar4.f335n = null;
                            eVar4.f334m = null;
                        }
                        ((e) this.f320n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

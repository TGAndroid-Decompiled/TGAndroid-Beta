package a9;
public final class c extends k0 {
    public final int h;
    public final Object f341n;

    public c(Object obj, int i10) {
        this.h = i10;
        this.f341n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                e eVar = (e) ((d) this.f341n).f343b;
                eVar.f347b.b("unlinkToDeath", new Object[0]);
                eVar.f357n.asBinder().unlinkToDeath(eVar.f354k, 0);
                eVar.f357n = null;
                eVar.f351g = false;
                return;
            default:
                synchronized (((e) this.f341n).f350f) {
                    try {
                        if (((e) this.f341n).f355l.get() > 0 && ((e) this.f341n).f355l.decrementAndGet() > 0) {
                            ((e) this.f341n).f347b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        e eVar2 = (e) this.f341n;
                        if (eVar2.f357n != null) {
                            eVar2.f347b.b("Unbind from service.", new Object[0]);
                            e eVar3 = (e) this.f341n;
                            eVar3.f346a.unbindService(eVar3.f356m);
                            e eVar4 = (e) this.f341n;
                            eVar4.f351g = false;
                            eVar4.f357n = null;
                            eVar4.f356m = null;
                        }
                        ((e) this.f341n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

package a9;
public final class c extends j0 {
    public final int h;
    public final Object f339n;

    public c(Object obj, int i10) {
        this.h = i10;
        this.f339n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                e eVar = (e) ((d) this.f339n).f342b;
                eVar.f345b.b("unlinkToDeath", new Object[0]);
                eVar.f355n.asBinder().unlinkToDeath(eVar.f352k, 0);
                eVar.f355n = null;
                eVar.f349g = false;
                return;
            default:
                synchronized (((e) this.f339n).f348f) {
                    try {
                        if (((e) this.f339n).f353l.get() > 0 && ((e) this.f339n).f353l.decrementAndGet() > 0) {
                            ((e) this.f339n).f345b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        e eVar2 = (e) this.f339n;
                        if (eVar2.f355n != null) {
                            eVar2.f345b.b("Unbind from service.", new Object[0]);
                            e eVar3 = (e) this.f339n;
                            eVar3.f344a.unbindService(eVar3.f354m);
                            e eVar4 = (e) this.f339n;
                            eVar4.f349g = false;
                            eVar4.f355n = null;
                            eVar4.f354m = null;
                        }
                        ((e) this.f339n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

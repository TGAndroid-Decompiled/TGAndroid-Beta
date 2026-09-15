package a9;
public final class c extends k0 {
    public final int h;
    public final Object f316n;

    public c(Object obj, int i10) {
        this.h = i10;
        this.f316n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                e eVar = (e) ((d) this.f316n).f318b;
                eVar.f322b.b("unlinkToDeath", new Object[0]);
                eVar.f331n.asBinder().unlinkToDeath(eVar.f328k, 0);
                eVar.f331n = null;
                eVar.f325g = false;
                return;
            default:
                synchronized (((e) this.f316n).f324f) {
                    try {
                        if (((e) this.f316n).f329l.get() > 0 && ((e) this.f316n).f329l.decrementAndGet() > 0) {
                            ((e) this.f316n).f322b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        e eVar2 = (e) this.f316n;
                        if (eVar2.f331n != null) {
                            eVar2.f322b.b("Unbind from service.", new Object[0]);
                            e eVar3 = (e) this.f316n;
                            eVar3.f321a.unbindService(eVar3.f330m);
                            e eVar4 = (e) this.f316n;
                            eVar4.f325g = false;
                            eVar4.f331n = null;
                            eVar4.f330m = null;
                        }
                        ((e) this.f316n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

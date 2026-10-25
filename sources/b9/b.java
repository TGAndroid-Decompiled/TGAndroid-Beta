package b9;
public final class b extends i0 {
    public final int h;
    public final Object f3680n;

    public b(Object obj, int i10) {
        this.h = i10;
        this.f3680n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                d dVar = (d) ((c) this.f3680n).f3683b;
                dVar.f3686b.b("unlinkToDeath", new Object[0]);
                dVar.f3695n.asBinder().unlinkToDeath(dVar.f3692k, 0);
                dVar.f3695n = null;
                dVar.f3689g = false;
                return;
            default:
                synchronized (((d) this.f3680n).f3688f) {
                    try {
                        if (((d) this.f3680n).f3693l.get() > 0 && ((d) this.f3680n).f3693l.decrementAndGet() > 0) {
                            ((d) this.f3680n).f3686b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        d dVar2 = (d) this.f3680n;
                        if (dVar2.f3695n != null) {
                            dVar2.f3686b.b("Unbind from service.", new Object[0]);
                            d dVar3 = (d) this.f3680n;
                            dVar3.f3685a.unbindService(dVar3.f3694m);
                            d dVar4 = (d) this.f3680n;
                            dVar4.f3689g = false;
                            dVar4.f3695n = null;
                            dVar4.f3694m = null;
                        }
                        ((d) this.f3680n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

package o8;
public final class b extends g0 {
    public final int h;
    public final Object f16466n;

    public b(Object obj, int i10) {
        this.h = i10;
        this.f16466n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((jf.a) this.f16466n).f9369b;
                cVar.f16469b.b("unlinkToDeath", new Object[0]);
                cVar.f16478n.asBinder().unlinkToDeath(cVar.f16475k, 0);
                cVar.f16478n = null;
                cVar.f16472g = false;
                return;
            default:
                synchronized (((c) this.f16466n).f16471f) {
                    try {
                        if (((c) this.f16466n).f16476l.get() > 0 && ((c) this.f16466n).f16476l.decrementAndGet() > 0) {
                            ((c) this.f16466n).f16469b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f16466n;
                        if (cVar2.f16478n != null) {
                            cVar2.f16469b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f16466n;
                            cVar3.f16468a.unbindService(cVar3.f16477m);
                            c cVar4 = (c) this.f16466n;
                            cVar4.f16472g = false;
                            cVar4.f16478n = null;
                            cVar4.f16477m = null;
                        }
                        ((c) this.f16466n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

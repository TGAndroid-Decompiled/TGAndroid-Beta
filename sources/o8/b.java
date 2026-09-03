package o8;
public final class b extends g0 {
    public final int h;
    public final Object f16626n;

    public b(Object obj, int i10) {
        this.h = i10;
        this.f16626n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((jf.a) this.f16626n).f10005b;
                cVar.f16629b.b("unlinkToDeath", new Object[0]);
                cVar.f16639n.asBinder().unlinkToDeath(cVar.f16636k, 0);
                cVar.f16639n = null;
                cVar.f16633g = false;
                return;
            default:
                synchronized (((c) this.f16626n).f16632f) {
                    try {
                        if (((c) this.f16626n).f16637l.get() > 0 && ((c) this.f16626n).f16637l.decrementAndGet() > 0) {
                            ((c) this.f16626n).f16629b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f16626n;
                        if (cVar2.f16639n != null) {
                            cVar2.f16629b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f16626n;
                            cVar3.f16628a.unbindService(cVar3.f16638m);
                            c cVar4 = (c) this.f16626n;
                            cVar4.f16633g = false;
                            cVar4.f16639n = null;
                            cVar4.f16638m = null;
                        }
                        ((c) this.f16626n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

package l8;

public final class b extends g0 {
    public final int h;

    public final Object f15450n;

    public b(Object obj, int i10) {
        this.h = i10;
        this.f15450n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((ef.a) this.f15450n).f5381b;
                cVar.f15453b.b("unlinkToDeath", new Object[0]);
                cVar.f15463n.asBinder().unlinkToDeath(cVar.f15460k, 0);
                cVar.f15463n = null;
                cVar.f15457g = false;
                return;
            default:
                synchronized (((c) this.f15450n).f15456f) {
                    try {
                        if (((c) this.f15450n).f15461l.get() > 0 && ((c) this.f15450n).f15461l.decrementAndGet() > 0) {
                            ((c) this.f15450n).f15453b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f15450n;
                        if (cVar2.f15463n != null) {
                            cVar2.f15453b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f15450n;
                            cVar3.f15452a.unbindService(cVar3.f15462m);
                            c cVar4 = (c) this.f15450n;
                            cVar4.f15457g = false;
                            cVar4.f15463n = null;
                            cVar4.f15462m = null;
                        }
                        ((c) this.f15450n).e();
                        return;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
        }
    }
}

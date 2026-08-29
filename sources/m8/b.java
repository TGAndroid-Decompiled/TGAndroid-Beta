package m8;
public final class b extends h0 {
    public final int h;
    public final Object f16890n;

    public b(Object obj, int i10) {
        this.h = i10;
        this.f16890n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((gf.a) this.f16890n).f7275b;
                cVar.f16893b.b("unlinkToDeath", new Object[0]);
                cVar.f16903n.asBinder().unlinkToDeath(cVar.f16900k, 0);
                cVar.f16903n = null;
                cVar.f16897g = false;
                return;
            default:
                synchronized (((c) this.f16890n).f16896f) {
                    try {
                        if (((c) this.f16890n).f16901l.get() > 0 && ((c) this.f16890n).f16901l.decrementAndGet() > 0) {
                            ((c) this.f16890n).f16893b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f16890n;
                        if (cVar2.f16903n != null) {
                            cVar2.f16893b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f16890n;
                            cVar3.f16892a.unbindService(cVar3.f16902m);
                            c cVar4 = (c) this.f16890n;
                            cVar4.f16897g = false;
                            cVar4.f16903n = null;
                            cVar4.f16902m = null;
                        }
                        ((c) this.f16890n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

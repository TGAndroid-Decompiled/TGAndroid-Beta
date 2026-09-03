package o8;
public final class b extends g0 {
    public final int h;
    public final Object f16448n;

    public b(Object obj, int i10) {
        this.h = i10;
        this.f16448n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((hf.a) this.f16448n).f7049b;
                cVar.f16451b.b("unlinkToDeath", new Object[0]);
                cVar.f16460n.asBinder().unlinkToDeath(cVar.f16457k, 0);
                cVar.f16460n = null;
                cVar.f16454g = false;
                return;
            default:
                synchronized (((c) this.f16448n).f16453f) {
                    try {
                        if (((c) this.f16448n).f16458l.get() > 0 && ((c) this.f16448n).f16458l.decrementAndGet() > 0) {
                            ((c) this.f16448n).f16451b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f16448n;
                        if (cVar2.f16460n != null) {
                            cVar2.f16451b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f16448n;
                            cVar3.f16450a.unbindService(cVar3.f16459m);
                            c cVar4 = (c) this.f16448n;
                            cVar4.f16454g = false;
                            cVar4.f16460n = null;
                            cVar4.f16459m = null;
                        }
                        ((c) this.f16448n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

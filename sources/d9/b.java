package d9;
public final class b extends h0 {
    public final int h;
    public final Object f7605n;

    public b(Object obj, int i7) {
        this.h = i7;
        this.f7605n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((ag.a) this.f7605n).f1053b;
                cVar.f7608b.b("unlinkToDeath", new Object[0]);
                cVar.f7618n.asBinder().unlinkToDeath(cVar.f7615k, 0);
                cVar.f7618n = null;
                cVar.f7612g = false;
                return;
            default:
                synchronized (((c) this.f7605n).f7611f) {
                    try {
                        if (((c) this.f7605n).f7616l.get() > 0 && ((c) this.f7605n).f7616l.decrementAndGet() > 0) {
                            ((c) this.f7605n).f7608b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f7605n;
                        if (cVar2.f7618n != null) {
                            cVar2.f7608b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f7605n;
                            cVar3.f7607a.unbindService(cVar3.f7617m);
                            c cVar4 = (c) this.f7605n;
                            cVar4.f7612g = false;
                            cVar4.f7618n = null;
                            cVar4.f7617m = null;
                        }
                        ((c) this.f7605n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

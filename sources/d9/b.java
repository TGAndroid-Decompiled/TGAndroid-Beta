package d9;
public final class b extends h0 {
    public final int h;
    public final Object f7608n;

    public b(Object obj, int i7) {
        this.h = i7;
        this.f7608n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((ag.a) this.f7608n).f1053b;
                cVar.f7611b.b("unlinkToDeath", new Object[0]);
                cVar.f7621n.asBinder().unlinkToDeath(cVar.f7618k, 0);
                cVar.f7621n = null;
                cVar.f7615g = false;
                return;
            default:
                synchronized (((c) this.f7608n).f7614f) {
                    try {
                        if (((c) this.f7608n).f7619l.get() > 0 && ((c) this.f7608n).f7619l.decrementAndGet() > 0) {
                            ((c) this.f7608n).f7611b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f7608n;
                        if (cVar2.f7621n != null) {
                            cVar2.f7611b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f7608n;
                            cVar3.f7610a.unbindService(cVar3.f7620m);
                            c cVar4 = (c) this.f7608n;
                            cVar4.f7615g = false;
                            cVar4.f7621n = null;
                            cVar4.f7620m = null;
                        }
                        ((c) this.f7608n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

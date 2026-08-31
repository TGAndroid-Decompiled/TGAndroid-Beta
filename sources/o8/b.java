package o8;
public final class b extends g0 {
    public final int h;
    public final Object f16624n;

    public b(Object obj, int i10) {
        this.h = i10;
        this.f16624n = obj;
    }

    @Override
    public final void b() {
        switch (this.h) {
            case 0:
                c cVar = (c) ((jf.a) this.f16624n).f10005b;
                cVar.f16627b.b("unlinkToDeath", new Object[0]);
                cVar.f16637n.asBinder().unlinkToDeath(cVar.f16634k, 0);
                cVar.f16637n = null;
                cVar.f16631g = false;
                return;
            default:
                synchronized (((c) this.f16624n).f16630f) {
                    try {
                        if (((c) this.f16624n).f16635l.get() > 0 && ((c) this.f16624n).f16635l.decrementAndGet() > 0) {
                            ((c) this.f16624n).f16627b.b("Leaving the connection open for other ongoing calls.", new Object[0]);
                            return;
                        }
                        c cVar2 = (c) this.f16624n;
                        if (cVar2.f16637n != null) {
                            cVar2.f16627b.b("Unbind from service.", new Object[0]);
                            c cVar3 = (c) this.f16624n;
                            cVar3.f16626a.unbindService(cVar3.f16636m);
                            c cVar4 = (c) this.f16624n;
                            cVar4.f16631g = false;
                            cVar4.f16637n = null;
                            cVar4.f16636m = null;
                        }
                        ((c) this.f16624n).e();
                        return;
                    } finally {
                    }
                }
        }
    }
}

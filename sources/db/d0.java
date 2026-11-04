package db;

import android.content.Context;
public final class d0 implements fb.b {
    public final int f8631a = 0;
    public final fb.c f8632b;
    public final e.a f8633c;

    public d0(e.a aVar, fb.c cVar) {
        this.f8633c = aVar;
        this.f8632b = cVar;
    }

    @Override
    public final Object mo5get() {
        switch (this.f8631a) {
            case 0:
                return new c0((Context) this.f8633c.f9205a, (j1) this.f8632b.mo5get());
            default:
                return new gb.f((b) this.f8632b.mo5get(), (fd.h) this.f8633c.f9205a);
        }
    }

    public d0(fb.c cVar, e.a aVar) {
        this.f8632b = cVar;
        this.f8633c = aVar;
    }
}

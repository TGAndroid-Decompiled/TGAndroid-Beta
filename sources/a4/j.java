package a4;

import h5.w;
import r3.m;
import r3.v;
public abstract class j {
    public v f75b;
    public m f76c;
    public h d;
    public long e;
    public long f77f;
    public long f78g;
    public int h;
    public int f79i;
    public long f81k;
    public boolean f82l;
    public boolean f83m;
    public final f f74a = new f();
    public af.c f80j = new af.c((char) 0, 1);

    public void a(long j10) {
        this.f78g = j10;
    }

    public abstract long b(w wVar);

    public abstract boolean c(w wVar, long j10, af.c cVar);

    public void d(boolean z4) {
        if (z4) {
            this.f80j = new af.c((char) 0, 1);
            this.f77f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f78g = 0L;
    }
}

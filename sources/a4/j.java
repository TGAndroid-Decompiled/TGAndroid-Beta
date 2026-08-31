package a4;

import h5.w;
import r3.m;
import r3.v;
public abstract class j {
    public v f82b;
    public m f83c;
    public h d;
    public long f84e;
    public long f85f;
    public long f86g;
    public int h;
    public int f87i;
    public long f89k;
    public boolean f90l;
    public boolean f91m;
    public final f f81a = new f();
    public bf.b f88j = new bf.b((char) 0, 1);

    public void a(long j10) {
        this.f86g = j10;
    }

    public abstract long b(w wVar);

    public abstract boolean c(w wVar, long j10, bf.b bVar);

    public void d(boolean z4) {
        if (z4) {
            this.f88j = new bf.b((char) 0, 1);
            this.f85f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.f84e = -1L;
        this.f86g = 0L;
    }
}

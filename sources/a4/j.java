package a4;

import h5.w;
import r3.m;
import r3.v;
public abstract class j {
    public v f76b;
    public m f77c;
    public h d;
    public long e;
    public long f78f;
    public long f79g;
    public int h;
    public int f80i;
    public long f82k;
    public boolean f83l;
    public boolean f84m;
    public final f f75a = new f();
    public bf.b f81j = new bf.b((char) 0, 1);

    public void a(long j10) {
        this.f79g = j10;
    }

    public abstract long b(w wVar);

    public abstract boolean c(w wVar, long j10, bf.b bVar);

    public void d(boolean z4) {
        if (z4) {
            this.f81j = new bf.b((char) 0, 1);
            this.f78f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.f79g = 0L;
    }
}

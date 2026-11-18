package f2;

import a8.la;
import h2.l0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class s implements n {
    public int f11084b;
    public float f11085c;
    public float d;
    public k f11086e;
    public k f11087f;
    public k f11088g;
    public k h;
    public boolean f11089i;
    public r f11090j;
    public ByteBuffer f11091k;
    public ByteBuffer f11092l;
    public long f11093m;
    public long f11094n;
    public boolean f11095o;

    @Override
    public final boolean a() {
        boolean z10;
        if (this.f11095o) {
            r rVar = this.f11090j;
            if (rVar != null) {
                if (rVar.f11077k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                la.p(z10);
                if (rVar.f11075i.o() * rVar.f11077k * rVar.f11070b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        boolean z10;
        r rVar = this.f11090j;
        if (rVar != null) {
            q qVar = rVar.f11075i;
            int i7 = rVar.f11070b;
            boolean z11 = true;
            if (rVar.f11077k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
            int o4 = qVar.o() * rVar.f11077k * i7;
            if (o4 > 0) {
                if (this.f11091k.capacity() < o4) {
                    this.f11091k = ByteBuffer.allocateDirect(o4).order(ByteOrder.nativeOrder());
                } else {
                    this.f11091k.clear();
                }
                ByteBuffer byteBuffer = this.f11091k;
                if (rVar.f11077k < 0) {
                    z11 = false;
                }
                la.p(z11);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i7), rVar.f11077k);
                qVar.b(min, byteBuffer);
                rVar.f11077k -= min;
                System.arraycopy(qVar.h(), min * i7, qVar.h(), 0, rVar.f11077k * i7);
                this.f11091k.flip();
                this.f11094n += o4;
                this.f11092l = this.f11091k;
            }
        }
        ByteBuffer byteBuffer2 = this.f11092l;
        this.f11092l = n.f11057a;
        return byteBuffer2;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        r rVar = this.f11090j;
        rVar.getClass();
        this.f11093m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i7 = rVar.f11070b;
        q qVar = rVar.f11075i;
        int o4 = remaining / (qVar.o() * i7);
        qVar.p(o4);
        qVar.a(remaining, byteBuffer);
        rVar.f11076j += o4;
        rVar.b();
    }

    @Override
    public final void d(l lVar) {
        boolean z10;
        if (isActive()) {
            k kVar = this.f11086e;
            this.f11088g = kVar;
            k kVar2 = this.f11087f;
            this.h = kVar2;
            if (this.f11089i) {
                int i7 = kVar.f11052a;
                int i10 = kVar.f11053b;
                float f10 = this.f11085c;
                float f11 = this.d;
                int i11 = kVar2.f11052a;
                if (kVar.f11054c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f11090j = new r(i7, i10, f10, f11, i11, z10);
            } else {
                r rVar = this.f11090j;
                if (rVar != null) {
                    rVar.f11076j = 0;
                    rVar.f11077k = 0;
                    rVar.f11078l = 0;
                    rVar.f11079m = 0;
                    rVar.f11080n = 0;
                    rVar.f11081o = 0;
                    rVar.f11082p = 0;
                    rVar.f11083q = 0.0d;
                    rVar.f11075i.flush();
                }
            }
        }
        this.f11092l = n.f11057a;
        this.f11093m = 0L;
        this.f11094n = 0L;
        this.f11095o = false;
    }

    @Override
    public final k e(k kVar) {
        int i7 = kVar.f11054c;
        if (i7 != 2 && i7 != 4) {
            throw new m(kVar);
        }
        int i10 = this.f11084b;
        if (i10 == -1) {
            i10 = kVar.f11052a;
        }
        this.f11086e = kVar;
        k kVar2 = new k(i10, kVar.f11053b, i7);
        this.f11087f = kVar2;
        this.f11089i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        r rVar = this.f11090j;
        if (rVar != null) {
            int i7 = rVar.f11076j;
            float f10 = rVar.f11071c;
            float f11 = rVar.d;
            int i10 = rVar.f11081o;
            int i11 = rVar.f11077k + ((int) (((((((i7 - i10) / (f10 / f11)) + i10) + rVar.f11083q) + rVar.f11078l) / (rVar.f11072e * f11)) + 0.5d));
            rVar.f11083q = 0.0d;
            q qVar = rVar.f11075i;
            int i12 = rVar.h * 2;
            qVar.p(i12 + i7);
            qVar.c(i7 * rVar.f11070b, i12);
            rVar.f11076j = i12 + rVar.f11076j;
            rVar.b();
            if (rVar.f11077k > i11) {
                rVar.f11077k = Math.max(i11, 0);
            }
            rVar.f11076j = 0;
            rVar.f11081o = 0;
            rVar.f11078l = 0;
        }
        this.f11095o = true;
    }

    @Override
    public final long g(long j3) {
        if (this.f11094n >= 1024) {
            long j10 = this.f11093m;
            r rVar = this.f11090j;
            rVar.getClass();
            long o4 = j10 - (rVar.f11075i.o() * (rVar.f11076j * rVar.f11070b));
            int i7 = this.h.f11052a;
            int i10 = this.f11088g.f11052a;
            if (i7 == i10) {
                return l0.a0(j3, this.f11094n, o4, RoundingMode.DOWN);
            }
            return l0.a0(j3, this.f11094n * i10, o4 * i7, RoundingMode.DOWN);
        }
        return (long) (j3 / this.f11085c);
    }

    @Override
    public final boolean isActive() {
        if (this.f11087f.f11052a != -1) {
            if (Math.abs(this.f11085c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f11087f.f11052a != this.f11086e.f11052a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f11085c = 1.0f;
        this.d = 1.0f;
        k kVar = k.f11051e;
        this.f11086e = kVar;
        this.f11087f = kVar;
        this.f11088g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.f11057a;
        this.f11091k = byteBuffer;
        this.f11092l = byteBuffer;
        this.f11084b = -1;
        this.f11089i = false;
        this.f11090j = null;
        this.f11093m = 0L;
        this.f11094n = 0L;
        this.f11095o = false;
    }
}

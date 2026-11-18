package f2;

import a8.la;
import h2.l0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class s implements n {
    public int f11081b;
    public float f11082c;
    public float d;
    public k f11083e;
    public k f11084f;
    public k f11085g;
    public k h;
    public boolean f11086i;
    public r f11087j;
    public ByteBuffer f11088k;
    public ByteBuffer f11089l;
    public long f11090m;
    public long f11091n;
    public boolean f11092o;

    @Override
    public final boolean a() {
        boolean z10;
        if (this.f11092o) {
            r rVar = this.f11087j;
            if (rVar != null) {
                if (rVar.f11074k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                la.p(z10);
                if (rVar.f11072i.o() * rVar.f11074k * rVar.f11067b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        boolean z10;
        r rVar = this.f11087j;
        if (rVar != null) {
            q qVar = rVar.f11072i;
            int i7 = rVar.f11067b;
            boolean z11 = true;
            if (rVar.f11074k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
            int o4 = qVar.o() * rVar.f11074k * i7;
            if (o4 > 0) {
                if (this.f11088k.capacity() < o4) {
                    this.f11088k = ByteBuffer.allocateDirect(o4).order(ByteOrder.nativeOrder());
                } else {
                    this.f11088k.clear();
                }
                ByteBuffer byteBuffer = this.f11088k;
                if (rVar.f11074k < 0) {
                    z11 = false;
                }
                la.p(z11);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i7), rVar.f11074k);
                qVar.b(min, byteBuffer);
                rVar.f11074k -= min;
                System.arraycopy(qVar.h(), min * i7, qVar.h(), 0, rVar.f11074k * i7);
                this.f11088k.flip();
                this.f11091n += o4;
                this.f11089l = this.f11088k;
            }
        }
        ByteBuffer byteBuffer2 = this.f11089l;
        this.f11089l = n.f11054a;
        return byteBuffer2;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        r rVar = this.f11087j;
        rVar.getClass();
        this.f11090m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i7 = rVar.f11067b;
        q qVar = rVar.f11072i;
        int o4 = remaining / (qVar.o() * i7);
        qVar.p(o4);
        qVar.a(remaining, byteBuffer);
        rVar.f11073j += o4;
        rVar.b();
    }

    @Override
    public final void d(l lVar) {
        boolean z10;
        if (isActive()) {
            k kVar = this.f11083e;
            this.f11085g = kVar;
            k kVar2 = this.f11084f;
            this.h = kVar2;
            if (this.f11086i) {
                int i7 = kVar.f11049a;
                int i10 = kVar.f11050b;
                float f10 = this.f11082c;
                float f11 = this.d;
                int i11 = kVar2.f11049a;
                if (kVar.f11051c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f11087j = new r(i7, i10, f10, f11, i11, z10);
            } else {
                r rVar = this.f11087j;
                if (rVar != null) {
                    rVar.f11073j = 0;
                    rVar.f11074k = 0;
                    rVar.f11075l = 0;
                    rVar.f11076m = 0;
                    rVar.f11077n = 0;
                    rVar.f11078o = 0;
                    rVar.f11079p = 0;
                    rVar.f11080q = 0.0d;
                    rVar.f11072i.flush();
                }
            }
        }
        this.f11089l = n.f11054a;
        this.f11090m = 0L;
        this.f11091n = 0L;
        this.f11092o = false;
    }

    @Override
    public final k e(k kVar) {
        int i7 = kVar.f11051c;
        if (i7 != 2 && i7 != 4) {
            throw new m(kVar);
        }
        int i10 = this.f11081b;
        if (i10 == -1) {
            i10 = kVar.f11049a;
        }
        this.f11083e = kVar;
        k kVar2 = new k(i10, kVar.f11050b, i7);
        this.f11084f = kVar2;
        this.f11086i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        r rVar = this.f11087j;
        if (rVar != null) {
            int i7 = rVar.f11073j;
            float f10 = rVar.f11068c;
            float f11 = rVar.d;
            int i10 = rVar.f11078o;
            int i11 = rVar.f11074k + ((int) (((((((i7 - i10) / (f10 / f11)) + i10) + rVar.f11080q) + rVar.f11075l) / (rVar.f11069e * f11)) + 0.5d));
            rVar.f11080q = 0.0d;
            q qVar = rVar.f11072i;
            int i12 = rVar.h * 2;
            qVar.p(i12 + i7);
            qVar.c(i7 * rVar.f11067b, i12);
            rVar.f11073j = i12 + rVar.f11073j;
            rVar.b();
            if (rVar.f11074k > i11) {
                rVar.f11074k = Math.max(i11, 0);
            }
            rVar.f11073j = 0;
            rVar.f11078o = 0;
            rVar.f11075l = 0;
        }
        this.f11092o = true;
    }

    @Override
    public final long g(long j3) {
        if (this.f11091n >= 1024) {
            long j10 = this.f11090m;
            r rVar = this.f11087j;
            rVar.getClass();
            long o4 = j10 - (rVar.f11072i.o() * (rVar.f11073j * rVar.f11067b));
            int i7 = this.h.f11049a;
            int i10 = this.f11085g.f11049a;
            if (i7 == i10) {
                return l0.a0(j3, this.f11091n, o4, RoundingMode.DOWN);
            }
            return l0.a0(j3, this.f11091n * i10, o4 * i7, RoundingMode.DOWN);
        }
        return (long) (j3 / this.f11082c);
    }

    @Override
    public final boolean isActive() {
        if (this.f11084f.f11049a != -1) {
            if (Math.abs(this.f11082c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f11084f.f11049a != this.f11083e.f11049a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f11082c = 1.0f;
        this.d = 1.0f;
        k kVar = k.f11048e;
        this.f11083e = kVar;
        this.f11084f = kVar;
        this.f11085g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.f11054a;
        this.f11088k = byteBuffer;
        this.f11089l = byteBuffer;
        this.f11081b = -1;
        this.f11086i = false;
        this.f11087j = null;
        this.f11090m = 0L;
        this.f11091n = 0L;
        this.f11092o = false;
    }
}

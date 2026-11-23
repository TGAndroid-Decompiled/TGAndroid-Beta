package f2;

import a8.ma;
import h2.l0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class s implements n {
    public int f11074b;
    public float f11075c;
    public float d;
    public k f11076e;
    public k f11077f;
    public k f11078g;
    public k h;
    public boolean f11079i;
    public r f11080j;
    public ByteBuffer f11081k;
    public ByteBuffer f11082l;
    public long f11083m;
    public long f11084n;
    public boolean f11085o;

    @Override
    public final boolean a() {
        boolean z10;
        if (this.f11085o) {
            r rVar = this.f11080j;
            if (rVar != null) {
                if (rVar.f11067k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ma.p(z10);
                if (rVar.f11065i.o() * rVar.f11067k * rVar.f11060b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        boolean z10;
        r rVar = this.f11080j;
        if (rVar != null) {
            q qVar = rVar.f11065i;
            int i7 = rVar.f11060b;
            boolean z11 = true;
            if (rVar.f11067k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ma.p(z10);
            int o4 = qVar.o() * rVar.f11067k * i7;
            if (o4 > 0) {
                if (this.f11081k.capacity() < o4) {
                    this.f11081k = ByteBuffer.allocateDirect(o4).order(ByteOrder.nativeOrder());
                } else {
                    this.f11081k.clear();
                }
                ByteBuffer byteBuffer = this.f11081k;
                if (rVar.f11067k < 0) {
                    z11 = false;
                }
                ma.p(z11);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i7), rVar.f11067k);
                qVar.b(min, byteBuffer);
                rVar.f11067k -= min;
                System.arraycopy(qVar.h(), min * i7, qVar.h(), 0, rVar.f11067k * i7);
                this.f11081k.flip();
                this.f11084n += o4;
                this.f11082l = this.f11081k;
            }
        }
        ByteBuffer byteBuffer2 = this.f11082l;
        this.f11082l = n.f11047a;
        return byteBuffer2;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        r rVar = this.f11080j;
        rVar.getClass();
        this.f11083m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i7 = rVar.f11060b;
        q qVar = rVar.f11065i;
        int o4 = remaining / (qVar.o() * i7);
        qVar.p(o4);
        qVar.a(remaining, byteBuffer);
        rVar.f11066j += o4;
        rVar.b();
    }

    @Override
    public final void d(l lVar) {
        boolean z10;
        if (isActive()) {
            k kVar = this.f11076e;
            this.f11078g = kVar;
            k kVar2 = this.f11077f;
            this.h = kVar2;
            if (this.f11079i) {
                int i7 = kVar.f11042a;
                int i10 = kVar.f11043b;
                float f10 = this.f11075c;
                float f11 = this.d;
                int i11 = kVar2.f11042a;
                if (kVar.f11044c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f11080j = new r(i7, i10, f10, f11, i11, z10);
            } else {
                r rVar = this.f11080j;
                if (rVar != null) {
                    rVar.f11066j = 0;
                    rVar.f11067k = 0;
                    rVar.f11068l = 0;
                    rVar.f11069m = 0;
                    rVar.f11070n = 0;
                    rVar.f11071o = 0;
                    rVar.f11072p = 0;
                    rVar.f11073q = 0.0d;
                    rVar.f11065i.flush();
                }
            }
        }
        this.f11082l = n.f11047a;
        this.f11083m = 0L;
        this.f11084n = 0L;
        this.f11085o = false;
    }

    @Override
    public final k e(k kVar) {
        int i7 = kVar.f11044c;
        if (i7 != 2 && i7 != 4) {
            throw new m(kVar);
        }
        int i10 = this.f11074b;
        if (i10 == -1) {
            i10 = kVar.f11042a;
        }
        this.f11076e = kVar;
        k kVar2 = new k(i10, kVar.f11043b, i7);
        this.f11077f = kVar2;
        this.f11079i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        r rVar = this.f11080j;
        if (rVar != null) {
            int i7 = rVar.f11066j;
            float f10 = rVar.f11061c;
            float f11 = rVar.d;
            int i10 = rVar.f11071o;
            int i11 = rVar.f11067k + ((int) (((((((i7 - i10) / (f10 / f11)) + i10) + rVar.f11073q) + rVar.f11068l) / (rVar.f11062e * f11)) + 0.5d));
            rVar.f11073q = 0.0d;
            q qVar = rVar.f11065i;
            int i12 = rVar.h * 2;
            qVar.p(i12 + i7);
            qVar.c(i7 * rVar.f11060b, i12);
            rVar.f11066j = i12 + rVar.f11066j;
            rVar.b();
            if (rVar.f11067k > i11) {
                rVar.f11067k = Math.max(i11, 0);
            }
            rVar.f11066j = 0;
            rVar.f11071o = 0;
            rVar.f11068l = 0;
        }
        this.f11085o = true;
    }

    @Override
    public final long g(long j3) {
        if (this.f11084n >= 1024) {
            long j10 = this.f11083m;
            r rVar = this.f11080j;
            rVar.getClass();
            long o4 = j10 - (rVar.f11065i.o() * (rVar.f11066j * rVar.f11060b));
            int i7 = this.h.f11042a;
            int i10 = this.f11078g.f11042a;
            if (i7 == i10) {
                return l0.a0(j3, this.f11084n, o4, RoundingMode.DOWN);
            }
            return l0.a0(j3, this.f11084n * i10, o4 * i7, RoundingMode.DOWN);
        }
        return (long) (j3 / this.f11075c);
    }

    @Override
    public final boolean isActive() {
        if (this.f11077f.f11042a != -1) {
            if (Math.abs(this.f11075c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f11077f.f11042a != this.f11076e.f11042a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f11075c = 1.0f;
        this.d = 1.0f;
        k kVar = k.f11041e;
        this.f11076e = kVar;
        this.f11077f = kVar;
        this.f11078g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.f11047a;
        this.f11081k = byteBuffer;
        this.f11082l = byteBuffer;
        this.f11074b = -1;
        this.f11079i = false;
        this.f11080j = null;
        this.f11083m = 0L;
        this.f11084n = 0L;
        this.f11085o = false;
    }
}

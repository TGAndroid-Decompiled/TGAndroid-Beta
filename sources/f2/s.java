package f2;

import a8.ma;
import h2.l0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class s implements n {
    public int f11076b;
    public float f11077c;
    public float d;
    public k f11078e;
    public k f11079f;
    public k f11080g;
    public k h;
    public boolean f11081i;
    public r f11082j;
    public ByteBuffer f11083k;
    public ByteBuffer f11084l;
    public long f11085m;
    public long f11086n;
    public boolean f11087o;

    @Override
    public final boolean a() {
        boolean z10;
        if (this.f11087o) {
            r rVar = this.f11082j;
            if (rVar != null) {
                if (rVar.f11069k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ma.p(z10);
                if (rVar.f11067i.o() * rVar.f11069k * rVar.f11062b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        boolean z10;
        r rVar = this.f11082j;
        if (rVar != null) {
            q qVar = rVar.f11067i;
            int i7 = rVar.f11062b;
            boolean z11 = true;
            if (rVar.f11069k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ma.p(z10);
            int o4 = qVar.o() * rVar.f11069k * i7;
            if (o4 > 0) {
                if (this.f11083k.capacity() < o4) {
                    this.f11083k = ByteBuffer.allocateDirect(o4).order(ByteOrder.nativeOrder());
                } else {
                    this.f11083k.clear();
                }
                ByteBuffer byteBuffer = this.f11083k;
                if (rVar.f11069k < 0) {
                    z11 = false;
                }
                ma.p(z11);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i7), rVar.f11069k);
                qVar.b(min, byteBuffer);
                rVar.f11069k -= min;
                System.arraycopy(qVar.h(), min * i7, qVar.h(), 0, rVar.f11069k * i7);
                this.f11083k.flip();
                this.f11086n += o4;
                this.f11084l = this.f11083k;
            }
        }
        ByteBuffer byteBuffer2 = this.f11084l;
        this.f11084l = n.f11049a;
        return byteBuffer2;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        r rVar = this.f11082j;
        rVar.getClass();
        this.f11085m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i7 = rVar.f11062b;
        q qVar = rVar.f11067i;
        int o4 = remaining / (qVar.o() * i7);
        qVar.p(o4);
        qVar.a(remaining, byteBuffer);
        rVar.f11068j += o4;
        rVar.b();
    }

    @Override
    public final void d(l lVar) {
        boolean z10;
        if (isActive()) {
            k kVar = this.f11078e;
            this.f11080g = kVar;
            k kVar2 = this.f11079f;
            this.h = kVar2;
            if (this.f11081i) {
                int i7 = kVar.f11044a;
                int i10 = kVar.f11045b;
                float f10 = this.f11077c;
                float f11 = this.d;
                int i11 = kVar2.f11044a;
                if (kVar.f11046c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f11082j = new r(i7, i10, f10, f11, i11, z10);
            } else {
                r rVar = this.f11082j;
                if (rVar != null) {
                    rVar.f11068j = 0;
                    rVar.f11069k = 0;
                    rVar.f11070l = 0;
                    rVar.f11071m = 0;
                    rVar.f11072n = 0;
                    rVar.f11073o = 0;
                    rVar.f11074p = 0;
                    rVar.f11075q = 0.0d;
                    rVar.f11067i.flush();
                }
            }
        }
        this.f11084l = n.f11049a;
        this.f11085m = 0L;
        this.f11086n = 0L;
        this.f11087o = false;
    }

    @Override
    public final k e(k kVar) {
        int i7 = kVar.f11046c;
        if (i7 != 2 && i7 != 4) {
            throw new m(kVar);
        }
        int i10 = this.f11076b;
        if (i10 == -1) {
            i10 = kVar.f11044a;
        }
        this.f11078e = kVar;
        k kVar2 = new k(i10, kVar.f11045b, i7);
        this.f11079f = kVar2;
        this.f11081i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        r rVar = this.f11082j;
        if (rVar != null) {
            int i7 = rVar.f11068j;
            float f10 = rVar.f11063c;
            float f11 = rVar.d;
            int i10 = rVar.f11073o;
            int i11 = rVar.f11069k + ((int) (((((((i7 - i10) / (f10 / f11)) + i10) + rVar.f11075q) + rVar.f11070l) / (rVar.f11064e * f11)) + 0.5d));
            rVar.f11075q = 0.0d;
            q qVar = rVar.f11067i;
            int i12 = rVar.h * 2;
            qVar.p(i12 + i7);
            qVar.c(i7 * rVar.f11062b, i12);
            rVar.f11068j = i12 + rVar.f11068j;
            rVar.b();
            if (rVar.f11069k > i11) {
                rVar.f11069k = Math.max(i11, 0);
            }
            rVar.f11068j = 0;
            rVar.f11073o = 0;
            rVar.f11070l = 0;
        }
        this.f11087o = true;
    }

    @Override
    public final long g(long j3) {
        if (this.f11086n >= 1024) {
            long j10 = this.f11085m;
            r rVar = this.f11082j;
            rVar.getClass();
            long o4 = j10 - (rVar.f11067i.o() * (rVar.f11068j * rVar.f11062b));
            int i7 = this.h.f11044a;
            int i10 = this.f11080g.f11044a;
            if (i7 == i10) {
                return l0.a0(j3, this.f11086n, o4, RoundingMode.DOWN);
            }
            return l0.a0(j3, this.f11086n * i10, o4 * i7, RoundingMode.DOWN);
        }
        return (long) (j3 / this.f11077c);
    }

    @Override
    public final boolean isActive() {
        if (this.f11079f.f11044a != -1) {
            if (Math.abs(this.f11077c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f11079f.f11044a != this.f11078e.f11044a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f11077c = 1.0f;
        this.d = 1.0f;
        k kVar = k.f11043e;
        this.f11078e = kVar;
        this.f11079f = kVar;
        this.f11080g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.f11049a;
        this.f11083k = byteBuffer;
        this.f11084l = byteBuffer;
        this.f11076b = -1;
        this.f11081i = false;
        this.f11082j = null;
        this.f11085m = 0L;
        this.f11086n = 0L;
        this.f11087o = false;
    }
}

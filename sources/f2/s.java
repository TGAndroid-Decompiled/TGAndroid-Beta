package f2;

import a8.la;
import h2.l0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class s implements n {
    public int f11113b;
    public float f11114c;
    public float d;
    public k f11115e;
    public k f11116f;
    public k f11117g;
    public k h;
    public boolean f11118i;
    public r f11119j;
    public ByteBuffer f11120k;
    public ByteBuffer f11121l;
    public long f11122m;
    public long f11123n;
    public boolean f11124o;

    @Override
    public final boolean a() {
        boolean z10;
        if (this.f11124o) {
            r rVar = this.f11119j;
            if (rVar != null) {
                if (rVar.f11106k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                la.p(z10);
                if (rVar.f11104i.o() * rVar.f11106k * rVar.f11099b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        boolean z10;
        r rVar = this.f11119j;
        if (rVar != null) {
            q qVar = rVar.f11104i;
            int i7 = rVar.f11099b;
            boolean z11 = true;
            if (rVar.f11106k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
            int o4 = qVar.o() * rVar.f11106k * i7;
            if (o4 > 0) {
                if (this.f11120k.capacity() < o4) {
                    this.f11120k = ByteBuffer.allocateDirect(o4).order(ByteOrder.nativeOrder());
                } else {
                    this.f11120k.clear();
                }
                ByteBuffer byteBuffer = this.f11120k;
                if (rVar.f11106k < 0) {
                    z11 = false;
                }
                la.p(z11);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i7), rVar.f11106k);
                qVar.b(min, byteBuffer);
                rVar.f11106k -= min;
                System.arraycopy(qVar.h(), min * i7, qVar.h(), 0, rVar.f11106k * i7);
                this.f11120k.flip();
                this.f11123n += o4;
                this.f11121l = this.f11120k;
            }
        }
        ByteBuffer byteBuffer2 = this.f11121l;
        this.f11121l = n.f11086a;
        return byteBuffer2;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        r rVar = this.f11119j;
        rVar.getClass();
        this.f11122m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i7 = rVar.f11099b;
        q qVar = rVar.f11104i;
        int o4 = remaining / (qVar.o() * i7);
        qVar.p(o4);
        qVar.a(remaining, byteBuffer);
        rVar.f11105j += o4;
        rVar.b();
    }

    @Override
    public final void d(l lVar) {
        boolean z10;
        if (isActive()) {
            k kVar = this.f11115e;
            this.f11117g = kVar;
            k kVar2 = this.f11116f;
            this.h = kVar2;
            if (this.f11118i) {
                int i7 = kVar.f11081a;
                int i10 = kVar.f11082b;
                float f10 = this.f11114c;
                float f11 = this.d;
                int i11 = kVar2.f11081a;
                if (kVar.f11083c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f11119j = new r(i7, i10, f10, f11, i11, z10);
            } else {
                r rVar = this.f11119j;
                if (rVar != null) {
                    rVar.f11105j = 0;
                    rVar.f11106k = 0;
                    rVar.f11107l = 0;
                    rVar.f11108m = 0;
                    rVar.f11109n = 0;
                    rVar.f11110o = 0;
                    rVar.f11111p = 0;
                    rVar.f11112q = 0.0d;
                    rVar.f11104i.flush();
                }
            }
        }
        this.f11121l = n.f11086a;
        this.f11122m = 0L;
        this.f11123n = 0L;
        this.f11124o = false;
    }

    @Override
    public final k e(k kVar) {
        int i7 = kVar.f11083c;
        if (i7 != 2 && i7 != 4) {
            throw new m(kVar);
        }
        int i10 = this.f11113b;
        if (i10 == -1) {
            i10 = kVar.f11081a;
        }
        this.f11115e = kVar;
        k kVar2 = new k(i10, kVar.f11082b, i7);
        this.f11116f = kVar2;
        this.f11118i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        r rVar = this.f11119j;
        if (rVar != null) {
            int i7 = rVar.f11105j;
            float f10 = rVar.f11100c;
            float f11 = rVar.d;
            int i10 = rVar.f11110o;
            int i11 = rVar.f11106k + ((int) (((((((i7 - i10) / (f10 / f11)) + i10) + rVar.f11112q) + rVar.f11107l) / (rVar.f11101e * f11)) + 0.5d));
            rVar.f11112q = 0.0d;
            q qVar = rVar.f11104i;
            int i12 = rVar.h * 2;
            qVar.p(i12 + i7);
            qVar.c(i7 * rVar.f11099b, i12);
            rVar.f11105j = i12 + rVar.f11105j;
            rVar.b();
            if (rVar.f11106k > i11) {
                rVar.f11106k = Math.max(i11, 0);
            }
            rVar.f11105j = 0;
            rVar.f11110o = 0;
            rVar.f11107l = 0;
        }
        this.f11124o = true;
    }

    @Override
    public final long g(long j3) {
        if (this.f11123n >= 1024) {
            long j10 = this.f11122m;
            r rVar = this.f11119j;
            rVar.getClass();
            long o4 = j10 - (rVar.f11104i.o() * (rVar.f11105j * rVar.f11099b));
            int i7 = this.h.f11081a;
            int i10 = this.f11117g.f11081a;
            if (i7 == i10) {
                return l0.a0(j3, this.f11123n, o4, RoundingMode.DOWN);
            }
            return l0.a0(j3, this.f11123n * i10, o4 * i7, RoundingMode.DOWN);
        }
        return (long) (j3 / this.f11114c);
    }

    @Override
    public final boolean isActive() {
        if (this.f11116f.f11081a != -1) {
            if (Math.abs(this.f11114c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f11116f.f11081a != this.f11115e.f11081a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f11114c = 1.0f;
        this.d = 1.0f;
        k kVar = k.f11080e;
        this.f11115e = kVar;
        this.f11116f = kVar;
        this.f11117g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.f11086a;
        this.f11120k = byteBuffer;
        this.f11121l = byteBuffer;
        this.f11113b = -1;
        this.f11118i = false;
        this.f11119j = null;
        this.f11122m = 0L;
        this.f11123n = 0L;
        this.f11124o = false;
    }
}

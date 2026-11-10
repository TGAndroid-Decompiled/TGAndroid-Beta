package f2;

import a8.ia;
import h2.m0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class s implements n {
    public int f10954b;
    public float f10955c;
    public float d;
    public k f10956e;
    public k f10957f;
    public k f10958g;
    public k h;
    public boolean f10959i;
    public r f10960j;
    public ByteBuffer f10961k;
    public ByteBuffer f10962l;
    public long f10963m;
    public long f10964n;
    public boolean f10965o;

    @Override
    public final boolean a() {
        boolean z9;
        if (this.f10965o) {
            r rVar = this.f10960j;
            if (rVar != null) {
                if (rVar.f10947k >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ia.p(z9);
                if (rVar.f10945i.o() * rVar.f10947k * rVar.f10940b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        boolean z9;
        r rVar = this.f10960j;
        if (rVar != null) {
            q qVar = rVar.f10945i;
            int i7 = rVar.f10940b;
            boolean z10 = true;
            if (rVar.f10947k >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
            int o4 = qVar.o() * rVar.f10947k * i7;
            if (o4 > 0) {
                if (this.f10961k.capacity() < o4) {
                    this.f10961k = ByteBuffer.allocateDirect(o4).order(ByteOrder.nativeOrder());
                } else {
                    this.f10961k.clear();
                }
                ByteBuffer byteBuffer = this.f10961k;
                if (rVar.f10947k < 0) {
                    z10 = false;
                }
                ia.p(z10);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i7), rVar.f10947k);
                qVar.b(min, byteBuffer);
                rVar.f10947k -= min;
                System.arraycopy(qVar.h(), min * i7, qVar.h(), 0, rVar.f10947k * i7);
                this.f10961k.flip();
                this.f10964n += o4;
                this.f10962l = this.f10961k;
            }
        }
        ByteBuffer byteBuffer2 = this.f10962l;
        this.f10962l = n.f10927a;
        return byteBuffer2;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        r rVar = this.f10960j;
        rVar.getClass();
        this.f10963m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i7 = rVar.f10940b;
        q qVar = rVar.f10945i;
        int o4 = remaining / (qVar.o() * i7);
        qVar.p(o4);
        qVar.a(remaining, byteBuffer);
        rVar.f10946j += o4;
        rVar.b();
    }

    @Override
    public final void d(l lVar) {
        boolean z9;
        if (isActive()) {
            k kVar = this.f10956e;
            this.f10958g = kVar;
            k kVar2 = this.f10957f;
            this.h = kVar2;
            if (this.f10959i) {
                int i7 = kVar.f10922a;
                int i10 = kVar.f10923b;
                float f10 = this.f10955c;
                float f11 = this.d;
                int i11 = kVar2.f10922a;
                if (kVar.f10924c == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f10960j = new r(i7, i10, f10, f11, i11, z9);
            } else {
                r rVar = this.f10960j;
                if (rVar != null) {
                    rVar.f10946j = 0;
                    rVar.f10947k = 0;
                    rVar.f10948l = 0;
                    rVar.f10949m = 0;
                    rVar.f10950n = 0;
                    rVar.f10951o = 0;
                    rVar.f10952p = 0;
                    rVar.f10953q = 0.0d;
                    rVar.f10945i.flush();
                }
            }
        }
        this.f10962l = n.f10927a;
        this.f10963m = 0L;
        this.f10964n = 0L;
        this.f10965o = false;
    }

    @Override
    public final k e(k kVar) {
        int i7 = kVar.f10924c;
        if (i7 != 2 && i7 != 4) {
            throw new m(kVar);
        }
        int i10 = this.f10954b;
        if (i10 == -1) {
            i10 = kVar.f10922a;
        }
        this.f10956e = kVar;
        k kVar2 = new k(i10, kVar.f10923b, i7);
        this.f10957f = kVar2;
        this.f10959i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        r rVar = this.f10960j;
        if (rVar != null) {
            int i7 = rVar.f10946j;
            float f10 = rVar.f10941c;
            float f11 = rVar.d;
            int i10 = rVar.f10951o;
            int i11 = rVar.f10947k + ((int) (((((((i7 - i10) / (f10 / f11)) + i10) + rVar.f10953q) + rVar.f10948l) / (rVar.f10942e * f11)) + 0.5d));
            rVar.f10953q = 0.0d;
            q qVar = rVar.f10945i;
            int i12 = rVar.h * 2;
            qVar.p(i12 + i7);
            qVar.c(i7 * rVar.f10940b, i12);
            rVar.f10946j = i12 + rVar.f10946j;
            rVar.b();
            if (rVar.f10947k > i11) {
                rVar.f10947k = Math.max(i11, 0);
            }
            rVar.f10946j = 0;
            rVar.f10951o = 0;
            rVar.f10948l = 0;
        }
        this.f10965o = true;
    }

    @Override
    public final long g(long j3) {
        if (this.f10964n >= 1024) {
            long j10 = this.f10963m;
            r rVar = this.f10960j;
            rVar.getClass();
            long o4 = j10 - (rVar.f10945i.o() * (rVar.f10946j * rVar.f10940b));
            int i7 = this.h.f10922a;
            int i10 = this.f10958g.f10922a;
            if (i7 == i10) {
                return m0.a0(j3, this.f10964n, o4, RoundingMode.DOWN);
            }
            return m0.a0(j3, this.f10964n * i10, o4 * i7, RoundingMode.DOWN);
        }
        return (long) (j3 / this.f10955c);
    }

    @Override
    public final boolean isActive() {
        if (this.f10957f.f10922a != -1) {
            if (Math.abs(this.f10955c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f10957f.f10922a != this.f10956e.f10922a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f10955c = 1.0f;
        this.d = 1.0f;
        k kVar = k.f10921e;
        this.f10956e = kVar;
        this.f10957f = kVar;
        this.f10958g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.f10927a;
        this.f10961k = byteBuffer;
        this.f10962l = byteBuffer;
        this.f10954b = -1;
        this.f10959i = false;
        this.f10960j = null;
        this.f10963m = 0L;
        this.f10964n = 0L;
        this.f10965o = false;
    }
}

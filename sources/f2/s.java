package f2;

import a8.ia;
import h2.m0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class s implements n {
    public int f10949b;
    public float f10950c;
    public float d;
    public k f10951e;
    public k f10952f;
    public k f10953g;
    public k h;
    public boolean f10954i;
    public r f10955j;
    public ByteBuffer f10956k;
    public ByteBuffer f10957l;
    public long f10958m;
    public long f10959n;
    public boolean f10960o;

    @Override
    public final boolean a() {
        boolean z9;
        if (this.f10960o) {
            r rVar = this.f10955j;
            if (rVar != null) {
                if (rVar.f10942k >= 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                ia.p(z9);
                if (rVar.f10940i.o() * rVar.f10942k * rVar.f10935b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        boolean z9;
        r rVar = this.f10955j;
        if (rVar != null) {
            q qVar = rVar.f10940i;
            int i7 = rVar.f10935b;
            boolean z10 = true;
            if (rVar.f10942k >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.p(z9);
            int o4 = qVar.o() * rVar.f10942k * i7;
            if (o4 > 0) {
                if (this.f10956k.capacity() < o4) {
                    this.f10956k = ByteBuffer.allocateDirect(o4).order(ByteOrder.nativeOrder());
                } else {
                    this.f10956k.clear();
                }
                ByteBuffer byteBuffer = this.f10956k;
                if (rVar.f10942k < 0) {
                    z10 = false;
                }
                ia.p(z10);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i7), rVar.f10942k);
                qVar.b(min, byteBuffer);
                rVar.f10942k -= min;
                System.arraycopy(qVar.h(), min * i7, qVar.h(), 0, rVar.f10942k * i7);
                this.f10956k.flip();
                this.f10959n += o4;
                this.f10957l = this.f10956k;
            }
        }
        ByteBuffer byteBuffer2 = this.f10957l;
        this.f10957l = n.f10922a;
        return byteBuffer2;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        r rVar = this.f10955j;
        rVar.getClass();
        this.f10958m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i7 = rVar.f10935b;
        q qVar = rVar.f10940i;
        int o4 = remaining / (qVar.o() * i7);
        qVar.p(o4);
        qVar.a(remaining, byteBuffer);
        rVar.f10941j += o4;
        rVar.b();
    }

    @Override
    public final void d(l lVar) {
        boolean z9;
        if (isActive()) {
            k kVar = this.f10951e;
            this.f10953g = kVar;
            k kVar2 = this.f10952f;
            this.h = kVar2;
            if (this.f10954i) {
                int i7 = kVar.f10917a;
                int i10 = kVar.f10918b;
                float f10 = this.f10950c;
                float f11 = this.d;
                int i11 = kVar2.f10917a;
                if (kVar.f10919c == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f10955j = new r(i7, i10, f10, f11, i11, z9);
            } else {
                r rVar = this.f10955j;
                if (rVar != null) {
                    rVar.f10941j = 0;
                    rVar.f10942k = 0;
                    rVar.f10943l = 0;
                    rVar.f10944m = 0;
                    rVar.f10945n = 0;
                    rVar.f10946o = 0;
                    rVar.f10947p = 0;
                    rVar.f10948q = 0.0d;
                    rVar.f10940i.flush();
                }
            }
        }
        this.f10957l = n.f10922a;
        this.f10958m = 0L;
        this.f10959n = 0L;
        this.f10960o = false;
    }

    @Override
    public final k e(k kVar) {
        int i7 = kVar.f10919c;
        if (i7 != 2 && i7 != 4) {
            throw new m(kVar);
        }
        int i10 = this.f10949b;
        if (i10 == -1) {
            i10 = kVar.f10917a;
        }
        this.f10951e = kVar;
        k kVar2 = new k(i10, kVar.f10918b, i7);
        this.f10952f = kVar2;
        this.f10954i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        r rVar = this.f10955j;
        if (rVar != null) {
            int i7 = rVar.f10941j;
            float f10 = rVar.f10936c;
            float f11 = rVar.d;
            int i10 = rVar.f10946o;
            int i11 = rVar.f10942k + ((int) (((((((i7 - i10) / (f10 / f11)) + i10) + rVar.f10948q) + rVar.f10943l) / (rVar.f10937e * f11)) + 0.5d));
            rVar.f10948q = 0.0d;
            q qVar = rVar.f10940i;
            int i12 = rVar.h * 2;
            qVar.p(i12 + i7);
            qVar.c(i7 * rVar.f10935b, i12);
            rVar.f10941j = i12 + rVar.f10941j;
            rVar.b();
            if (rVar.f10942k > i11) {
                rVar.f10942k = Math.max(i11, 0);
            }
            rVar.f10941j = 0;
            rVar.f10946o = 0;
            rVar.f10943l = 0;
        }
        this.f10960o = true;
    }

    @Override
    public final long g(long j3) {
        if (this.f10959n >= 1024) {
            long j10 = this.f10958m;
            r rVar = this.f10955j;
            rVar.getClass();
            long o4 = j10 - (rVar.f10940i.o() * (rVar.f10941j * rVar.f10935b));
            int i7 = this.h.f10917a;
            int i10 = this.f10953g.f10917a;
            if (i7 == i10) {
                return m0.a0(j3, this.f10959n, o4, RoundingMode.DOWN);
            }
            return m0.a0(j3, this.f10959n * i10, o4 * i7, RoundingMode.DOWN);
        }
        return (long) (j3 / this.f10950c);
    }

    @Override
    public final boolean isActive() {
        if (this.f10952f.f10917a != -1) {
            if (Math.abs(this.f10950c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f10952f.f10917a != this.f10951e.f10917a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f10950c = 1.0f;
        this.d = 1.0f;
        k kVar = k.f10916e;
        this.f10951e = kVar;
        this.f10952f = kVar;
        this.f10953g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.f10922a;
        this.f10956k = byteBuffer;
        this.f10957l = byteBuffer;
        this.f10949b = -1;
        this.f10954i = false;
        this.f10955j = null;
        this.f10958m = 0L;
        this.f10959n = 0L;
        this.f10960o = false;
    }
}

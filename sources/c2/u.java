package c2;

import a8.yb;
import e2.n0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class u implements o {
    public int f5988b;
    public float f5989c;
    public float d;
    public l e;
    public l f5990f;
    public l f5991g;
    public l h;
    public boolean f5992i;
    public t f5993j;
    public ByteBuffer f5994k;
    public ByteBuffer f5995l;
    public long f5996m;
    public long f5997n;
    public boolean f5998o;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        t tVar = this.f5993j;
        if (tVar != null) {
            r rVar = tVar.f5979i;
            int i10 = tVar.f5975b;
            boolean z11 = true;
            if (tVar.f5981k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.p(z10);
            int o10 = rVar.o() * tVar.f5981k * i10;
            if (o10 > 0) {
                if (this.f5994k.capacity() < o10) {
                    this.f5994k = ByteBuffer.allocateDirect(o10).order(ByteOrder.nativeOrder());
                } else {
                    this.f5994k.clear();
                }
                ByteBuffer byteBuffer = this.f5994k;
                if (tVar.f5981k < 0) {
                    z11 = false;
                }
                yb.p(z11);
                int min = Math.min(byteBuffer.remaining() / (rVar.o() * i10), tVar.f5981k);
                rVar.b(min, byteBuffer);
                tVar.f5981k -= min;
                System.arraycopy(rVar.i(), min * i10, rVar.i(), 0, tVar.f5981k * i10);
                this.f5994k.flip();
                this.f5997n += o10;
                this.f5995l = this.f5994k;
            }
        }
        ByteBuffer byteBuffer2 = this.f5995l;
        this.f5995l = o.f5959a;
        return byteBuffer2;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        t tVar = this.f5993j;
        tVar.getClass();
        this.f5996m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i10 = tVar.f5975b;
        r rVar = tVar.f5979i;
        int o10 = remaining / (rVar.o() * i10);
        rVar.p(o10);
        rVar.a(remaining, byteBuffer);
        tVar.f5980j += o10;
        tVar.b();
    }

    @Override
    public final boolean c() {
        boolean z10;
        if (this.f5998o) {
            t tVar = this.f5993j;
            if (tVar != null) {
                if (tVar.f5981k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                yb.p(z10);
                if (tVar.f5979i.o() * tVar.f5981k * tVar.f5975b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final void d(m mVar) {
        boolean z10;
        if (isActive()) {
            l lVar = this.e;
            this.f5991g = lVar;
            l lVar2 = this.f5990f;
            this.h = lVar2;
            if (this.f5992i) {
                int i10 = lVar.f5954a;
                int i11 = lVar.f5955b;
                float f7 = this.f5989c;
                float f10 = this.d;
                int i12 = lVar2.f5954a;
                if (lVar.f5956c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f5993j = new t(i10, i11, f7, f10, i12, z10);
            } else {
                t tVar = this.f5993j;
                if (tVar != null) {
                    tVar.f5980j = 0;
                    tVar.f5981k = 0;
                    tVar.f5982l = 0;
                    tVar.f5983m = 0;
                    tVar.f5984n = 0;
                    tVar.f5985o = 0;
                    tVar.f5986p = 0;
                    tVar.f5987q = 0.0d;
                    tVar.f5979i.flush();
                }
            }
        }
        this.f5995l = o.f5959a;
        this.f5996m = 0L;
        this.f5997n = 0L;
        this.f5998o = false;
    }

    @Override
    public final l e(l lVar) {
        int i10 = lVar.f5956c;
        if (i10 != 2 && i10 != 4) {
            throw new n(lVar);
        }
        int i11 = this.f5988b;
        if (i11 == -1) {
            i11 = lVar.f5954a;
        }
        this.e = lVar;
        l lVar2 = new l(i11, lVar.f5955b, i10);
        this.f5990f = lVar2;
        this.f5992i = true;
        return lVar2;
    }

    @Override
    public final void f() {
        t tVar = this.f5993j;
        if (tVar != null) {
            int i10 = tVar.f5980j;
            float f7 = tVar.f5976c;
            float f10 = tVar.d;
            int i11 = tVar.f5985o;
            int i12 = tVar.f5981k + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + tVar.f5987q) + tVar.f5982l) / (tVar.e * f10)) + 0.5d));
            tVar.f5987q = 0.0d;
            r rVar = tVar.f5979i;
            int i13 = tVar.h * 2;
            rVar.p(i13 + i10);
            rVar.d(i10 * tVar.f5975b, i13);
            tVar.f5980j = i13 + tVar.f5980j;
            tVar.b();
            if (tVar.f5981k > i12) {
                tVar.f5981k = Math.max(i12, 0);
            }
            tVar.f5980j = 0;
            tVar.f5985o = 0;
            tVar.f5982l = 0;
        }
        this.f5998o = true;
    }

    @Override
    public final long g(long j10) {
        if (this.f5997n >= 1024) {
            long j11 = this.f5996m;
            t tVar = this.f5993j;
            tVar.getClass();
            long o10 = j11 - (tVar.f5979i.o() * (tVar.f5980j * tVar.f5975b));
            int i10 = this.h.f5954a;
            int i11 = this.f5991g.f5954a;
            if (i10 == i11) {
                return n0.a0(j10, this.f5997n, o10, RoundingMode.DOWN);
            }
            return n0.a0(j10, this.f5997n * i11, o10 * i10, RoundingMode.DOWN);
        }
        return (long) (j10 / this.f5989c);
    }

    @Override
    public final boolean isActive() {
        if (this.f5990f.f5954a != -1) {
            if (Math.abs(this.f5989c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f5990f.f5954a != this.e.f5954a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f5989c = 1.0f;
        this.d = 1.0f;
        l lVar = l.e;
        this.e = lVar;
        this.f5990f = lVar;
        this.f5991g = lVar;
        this.h = lVar;
        ByteBuffer byteBuffer = o.f5959a;
        this.f5994k = byteBuffer;
        this.f5995l = byteBuffer;
        this.f5988b = -1;
        this.f5992i = false;
        this.f5993j = null;
        this.f5996m = 0L;
        this.f5997n = 0L;
        this.f5998o = false;
    }
}

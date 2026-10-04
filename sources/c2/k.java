package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class k implements h {
    public int f3988b;
    public float f3989c;
    public float d;
    public f f3990e;
    public f f3991f;
    public f f3992g;
    public f h;
    public boolean f3993i;
    public j f3994j;
    public ByteBuffer f3995k;
    public ShortBuffer f3996l;
    public ByteBuffer f3997m;
    public long f3998n;
    public long f3999o;
    public boolean f4000p;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        j jVar = this.f3994j;
        if (jVar != null) {
            int i10 = jVar.f3969b;
            boolean z11 = true;
            if (jVar.f3978m >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            int i11 = jVar.f3978m * i10 * 2;
            if (i11 > 0) {
                if (this.f3995k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f3995k = order;
                    this.f3996l = order.asShortBuffer();
                } else {
                    this.f3995k.clear();
                    this.f3996l.clear();
                }
                ShortBuffer shortBuffer = this.f3996l;
                if (jVar.f3978m < 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                int min = Math.min(shortBuffer.remaining() / i10, jVar.f3978m);
                int i12 = min * i10;
                shortBuffer.put(jVar.f3977l, 0, i12);
                int i13 = jVar.f3978m - min;
                jVar.f3978m = i13;
                short[] sArr = jVar.f3977l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f3999o += i11;
                this.f3995k.limit(i11);
                this.f3997m = this.f3995k;
            }
        }
        ByteBuffer byteBuffer = this.f3997m;
        this.f3997m = h.f3962a;
        return byteBuffer;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f4000p) {
            j jVar = this.f3994j;
            if (jVar != null) {
                if (jVar.f3978m >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (jVar.f3978m * jVar.f3969b * 2 == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        j jVar = this.f3994j;
        jVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f3998n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = jVar.f3969b;
        int i11 = remaining2 / i10;
        short[] c10 = jVar.c(jVar.f3975j, jVar.f3976k, i11);
        jVar.f3975j = c10;
        asShortBuffer.get(c10, jVar.f3976k * i10, ((i11 * i10) * 2) / 2);
        jVar.f3976k += i11;
        jVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final f d(f fVar) {
        if (fVar.f3961c == 2) {
            int i10 = this.f3988b;
            if (i10 == -1) {
                i10 = fVar.f3959a;
            }
            this.f3990e = fVar;
            f fVar2 = new f(i10, fVar.f3960b, 2);
            this.f3991f = fVar2;
            this.f3993i = true;
            return fVar2;
        }
        throw new g(fVar);
    }

    @Override
    public final void e() {
        j jVar = this.f3994j;
        if (jVar != null) {
            int i10 = jVar.f3976k;
            float f7 = jVar.f3970c;
            float f10 = jVar.d;
            int i11 = jVar.f3983r;
            int i12 = jVar.f3978m + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + jVar.f3987w) + jVar.f3980o) / (jVar.f3971e * f10)) + 0.5d));
            jVar.f3987w = 0.0d;
            short[] sArr = jVar.f3975j;
            int i13 = jVar.h * 2;
            jVar.f3975j = jVar.c(sArr, i10, i13 + i10);
            int i14 = 0;
            while (true) {
                int i15 = jVar.f3969b;
                if (i14 >= i13 * i15) {
                    break;
                }
                jVar.f3975j[(i15 * i10) + i14] = 0;
                i14++;
            }
            jVar.f3976k = i13 + jVar.f3976k;
            jVar.f();
            if (jVar.f3978m > i12) {
                jVar.f3978m = Math.max(i12, 0);
            }
            jVar.f3976k = 0;
            jVar.f3983r = 0;
            jVar.f3980o = 0;
        }
        this.f4000p = true;
    }

    @Override
    public final void flush() {
        if (isActive()) {
            f fVar = this.f3990e;
            this.f3992g = fVar;
            f fVar2 = this.f3991f;
            this.h = fVar2;
            if (this.f3993i) {
                this.f3994j = new j(fVar.f3959a, this.f3989c, fVar.f3960b, this.d, fVar2.f3959a);
            } else {
                j jVar = this.f3994j;
                if (jVar != null) {
                    jVar.f3976k = 0;
                    jVar.f3978m = 0;
                    jVar.f3980o = 0;
                    jVar.f3981p = 0;
                    jVar.f3982q = 0;
                    jVar.f3983r = 0;
                    jVar.f3984s = 0;
                    jVar.f3985t = 0;
                    jVar.f3986u = 0;
                    jVar.v = 0;
                    jVar.f3987w = 0.0d;
                }
            }
        }
        this.f3997m = h.f3962a;
        this.f3998n = 0L;
        this.f3999o = 0L;
        this.f4000p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f3991f.f3959a != -1) {
            if (Math.abs(this.f3989c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f3991f.f3959a != this.f3990e.f3959a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f3989c = 1.0f;
        this.d = 1.0f;
        f fVar = f.f3958e;
        this.f3990e = fVar;
        this.f3991f = fVar;
        this.f3992g = fVar;
        this.h = fVar;
        ByteBuffer byteBuffer = h.f3962a;
        this.f3995k = byteBuffer;
        this.f3996l = byteBuffer.asShortBuffer();
        this.f3997m = byteBuffer;
        this.f3988b = -1;
        this.f3993i = false;
        this.f3994j = null;
        this.f3998n = 0L;
        this.f3999o = 0L;
        this.f4000p = false;
    }
}

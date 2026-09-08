package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class k implements h {
    public int f4209b;
    public float f4210c;
    public float d;
    public f f4211e;
    public f f4212f;
    public f f4213g;
    public f h;
    public boolean f4214i;
    public j f4215j;
    public ByteBuffer f4216k;
    public ShortBuffer f4217l;
    public ByteBuffer f4218m;
    public long f4219n;
    public long f4220o;
    public boolean f4221p;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        j jVar = this.f4215j;
        if (jVar != null) {
            int i10 = jVar.f4190b;
            boolean z11 = true;
            if (jVar.f4199m >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            int i11 = jVar.f4199m * i10 * 2;
            if (i11 > 0) {
                if (this.f4216k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f4216k = order;
                    this.f4217l = order.asShortBuffer();
                } else {
                    this.f4216k.clear();
                    this.f4217l.clear();
                }
                ShortBuffer shortBuffer = this.f4217l;
                if (jVar.f4199m < 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                int min = Math.min(shortBuffer.remaining() / i10, jVar.f4199m);
                int i12 = min * i10;
                shortBuffer.put(jVar.f4198l, 0, i12);
                int i13 = jVar.f4199m - min;
                jVar.f4199m = i13;
                short[] sArr = jVar.f4198l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f4220o += i11;
                this.f4216k.limit(i11);
                this.f4218m = this.f4216k;
            }
        }
        ByteBuffer byteBuffer = this.f4218m;
        this.f4218m = h.f4183a;
        return byteBuffer;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f4221p) {
            j jVar = this.f4215j;
            if (jVar != null) {
                if (jVar.f4199m >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (jVar.f4199m * jVar.f4190b * 2 == 0) {
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
        j jVar = this.f4215j;
        jVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f4219n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = jVar.f4190b;
        int i11 = remaining2 / i10;
        short[] c10 = jVar.c(jVar.f4196j, jVar.f4197k, i11);
        jVar.f4196j = c10;
        asShortBuffer.get(c10, jVar.f4197k * i10, ((i11 * i10) * 2) / 2);
        jVar.f4197k += i11;
        jVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final f d(f fVar) {
        if (fVar.f4182c == 2) {
            int i10 = this.f4209b;
            if (i10 == -1) {
                i10 = fVar.f4180a;
            }
            this.f4211e = fVar;
            f fVar2 = new f(i10, fVar.f4181b, 2);
            this.f4212f = fVar2;
            this.f4214i = true;
            return fVar2;
        }
        throw new g(fVar);
    }

    @Override
    public final void e() {
        j jVar = this.f4215j;
        if (jVar != null) {
            int i10 = jVar.f4197k;
            float f7 = jVar.f4191c;
            float f10 = jVar.d;
            int i11 = jVar.f4204r;
            int i12 = jVar.f4199m + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + jVar.f4208w) + jVar.f4201o) / (jVar.f4192e * f10)) + 0.5d));
            jVar.f4208w = 0.0d;
            short[] sArr = jVar.f4196j;
            int i13 = jVar.h * 2;
            jVar.f4196j = jVar.c(sArr, i10, i13 + i10);
            int i14 = 0;
            while (true) {
                int i15 = jVar.f4190b;
                if (i14 >= i13 * i15) {
                    break;
                }
                jVar.f4196j[(i15 * i10) + i14] = 0;
                i14++;
            }
            jVar.f4197k = i13 + jVar.f4197k;
            jVar.f();
            if (jVar.f4199m > i12) {
                jVar.f4199m = Math.max(i12, 0);
            }
            jVar.f4197k = 0;
            jVar.f4204r = 0;
            jVar.f4201o = 0;
        }
        this.f4221p = true;
    }

    @Override
    public final void flush() {
        if (isActive()) {
            f fVar = this.f4211e;
            this.f4213g = fVar;
            f fVar2 = this.f4212f;
            this.h = fVar2;
            if (this.f4214i) {
                this.f4215j = new j(fVar.f4180a, this.f4210c, fVar.f4181b, this.d, fVar2.f4180a);
            } else {
                j jVar = this.f4215j;
                if (jVar != null) {
                    jVar.f4197k = 0;
                    jVar.f4199m = 0;
                    jVar.f4201o = 0;
                    jVar.f4202p = 0;
                    jVar.f4203q = 0;
                    jVar.f4204r = 0;
                    jVar.f4205s = 0;
                    jVar.f4206t = 0;
                    jVar.f4207u = 0;
                    jVar.v = 0;
                    jVar.f4208w = 0.0d;
                }
            }
        }
        this.f4218m = h.f4183a;
        this.f4219n = 0L;
        this.f4220o = 0L;
        this.f4221p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f4212f.f4180a != -1) {
            if (Math.abs(this.f4210c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f4212f.f4180a != this.f4211e.f4180a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f4210c = 1.0f;
        this.d = 1.0f;
        f fVar = f.f4179e;
        this.f4211e = fVar;
        this.f4212f = fVar;
        this.f4213g = fVar;
        this.h = fVar;
        ByteBuffer byteBuffer = h.f4183a;
        this.f4216k = byteBuffer;
        this.f4217l = byteBuffer.asShortBuffer();
        this.f4218m = byteBuffer;
        this.f4209b = -1;
        this.f4214i = false;
        this.f4215j = null;
        this.f4219n = 0L;
        this.f4220o = 0L;
        this.f4221p = false;
    }
}

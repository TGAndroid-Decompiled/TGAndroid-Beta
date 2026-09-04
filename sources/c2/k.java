package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class k implements h {
    public int f4182b;
    public float f4183c;
    public float d;
    public f f4184e;
    public f f4185f;
    public f f4186g;
    public f h;
    public boolean f4187i;
    public j f4188j;
    public ByteBuffer f4189k;
    public ShortBuffer f4190l;
    public ByteBuffer f4191m;
    public long f4192n;
    public long f4193o;
    public boolean f4194p;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        j jVar = this.f4188j;
        if (jVar != null) {
            int i10 = jVar.f4163b;
            boolean z11 = true;
            if (jVar.f4172m >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            int i11 = jVar.f4172m * i10 * 2;
            if (i11 > 0) {
                if (this.f4189k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f4189k = order;
                    this.f4190l = order.asShortBuffer();
                } else {
                    this.f4189k.clear();
                    this.f4190l.clear();
                }
                ShortBuffer shortBuffer = this.f4190l;
                if (jVar.f4172m < 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                int min = Math.min(shortBuffer.remaining() / i10, jVar.f4172m);
                int i12 = min * i10;
                shortBuffer.put(jVar.f4171l, 0, i12);
                int i13 = jVar.f4172m - min;
                jVar.f4172m = i13;
                short[] sArr = jVar.f4171l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f4193o += i11;
                this.f4189k.limit(i11);
                this.f4191m = this.f4189k;
            }
        }
        ByteBuffer byteBuffer = this.f4191m;
        this.f4191m = h.f4156a;
        return byteBuffer;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f4194p) {
            j jVar = this.f4188j;
            if (jVar != null) {
                if (jVar.f4172m >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (jVar.f4172m * jVar.f4163b * 2 == 0) {
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
        j jVar = this.f4188j;
        jVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f4192n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = jVar.f4163b;
        int i11 = remaining2 / i10;
        short[] c10 = jVar.c(jVar.f4169j, jVar.f4170k, i11);
        jVar.f4169j = c10;
        asShortBuffer.get(c10, jVar.f4170k * i10, ((i11 * i10) * 2) / 2);
        jVar.f4170k += i11;
        jVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final f d(f fVar) {
        if (fVar.f4155c == 2) {
            int i10 = this.f4182b;
            if (i10 == -1) {
                i10 = fVar.f4153a;
            }
            this.f4184e = fVar;
            f fVar2 = new f(i10, fVar.f4154b, 2);
            this.f4185f = fVar2;
            this.f4187i = true;
            return fVar2;
        }
        throw new g(fVar);
    }

    @Override
    public final void e() {
        j jVar = this.f4188j;
        if (jVar != null) {
            int i10 = jVar.f4170k;
            float f7 = jVar.f4164c;
            float f10 = jVar.d;
            int i11 = jVar.f4177r;
            int i12 = jVar.f4172m + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + jVar.f4181w) + jVar.f4174o) / (jVar.f4165e * f10)) + 0.5d));
            jVar.f4181w = 0.0d;
            short[] sArr = jVar.f4169j;
            int i13 = jVar.h * 2;
            jVar.f4169j = jVar.c(sArr, i10, i13 + i10);
            int i14 = 0;
            while (true) {
                int i15 = jVar.f4163b;
                if (i14 >= i13 * i15) {
                    break;
                }
                jVar.f4169j[(i15 * i10) + i14] = 0;
                i14++;
            }
            jVar.f4170k = i13 + jVar.f4170k;
            jVar.f();
            if (jVar.f4172m > i12) {
                jVar.f4172m = Math.max(i12, 0);
            }
            jVar.f4170k = 0;
            jVar.f4177r = 0;
            jVar.f4174o = 0;
        }
        this.f4194p = true;
    }

    @Override
    public final void flush() {
        if (isActive()) {
            f fVar = this.f4184e;
            this.f4186g = fVar;
            f fVar2 = this.f4185f;
            this.h = fVar2;
            if (this.f4187i) {
                this.f4188j = new j(fVar.f4153a, this.f4183c, fVar.f4154b, this.d, fVar2.f4153a);
            } else {
                j jVar = this.f4188j;
                if (jVar != null) {
                    jVar.f4170k = 0;
                    jVar.f4172m = 0;
                    jVar.f4174o = 0;
                    jVar.f4175p = 0;
                    jVar.f4176q = 0;
                    jVar.f4177r = 0;
                    jVar.f4178s = 0;
                    jVar.f4179t = 0;
                    jVar.f4180u = 0;
                    jVar.v = 0;
                    jVar.f4181w = 0.0d;
                }
            }
        }
        this.f4191m = h.f4156a;
        this.f4192n = 0L;
        this.f4193o = 0L;
        this.f4194p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f4185f.f4153a != -1) {
            if (Math.abs(this.f4183c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f4185f.f4153a != this.f4184e.f4153a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f4183c = 1.0f;
        this.d = 1.0f;
        f fVar = f.f4152e;
        this.f4184e = fVar;
        this.f4185f = fVar;
        this.f4186g = fVar;
        this.h = fVar;
        ByteBuffer byteBuffer = h.f4156a;
        this.f4189k = byteBuffer;
        this.f4190l = byteBuffer.asShortBuffer();
        this.f4191m = byteBuffer;
        this.f4182b = -1;
        this.f4187i = false;
        this.f4188j = null;
        this.f4192n = 0L;
        this.f4193o = 0L;
        this.f4194p = false;
    }
}

package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class k implements h {
    public int f4037b;
    public float f4038c;
    public float d;
    public f f4039e;
    public f f4040f;
    public f f4041g;
    public f h;
    public boolean f4042i;
    public j f4043j;
    public ByteBuffer f4044k;
    public ShortBuffer f4045l;
    public ByteBuffer f4046m;
    public long f4047n;
    public long f4048o;
    public boolean f4049p;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        j jVar = this.f4043j;
        if (jVar != null) {
            int i10 = jVar.f4018b;
            boolean z11 = true;
            if (jVar.f4027m >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            int i11 = jVar.f4027m * i10 * 2;
            if (i11 > 0) {
                if (this.f4044k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f4044k = order;
                    this.f4045l = order.asShortBuffer();
                } else {
                    this.f4044k.clear();
                    this.f4045l.clear();
                }
                ShortBuffer shortBuffer = this.f4045l;
                if (jVar.f4027m < 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                int min = Math.min(shortBuffer.remaining() / i10, jVar.f4027m);
                int i12 = min * i10;
                shortBuffer.put(jVar.f4026l, 0, i12);
                int i13 = jVar.f4027m - min;
                jVar.f4027m = i13;
                short[] sArr = jVar.f4026l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f4048o += i11;
                this.f4044k.limit(i11);
                this.f4046m = this.f4044k;
            }
        }
        ByteBuffer byteBuffer = this.f4046m;
        this.f4046m = h.f4011a;
        return byteBuffer;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f4049p) {
            j jVar = this.f4043j;
            if (jVar != null) {
                if (jVar.f4027m >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (jVar.f4027m * jVar.f4018b * 2 == 0) {
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
        j jVar = this.f4043j;
        jVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f4047n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = jVar.f4018b;
        int i11 = remaining2 / i10;
        short[] c10 = jVar.c(jVar.f4024j, jVar.f4025k, i11);
        jVar.f4024j = c10;
        asShortBuffer.get(c10, jVar.f4025k * i10, ((i11 * i10) * 2) / 2);
        jVar.f4025k += i11;
        jVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final f d(f fVar) {
        if (fVar.f4010c == 2) {
            int i10 = this.f4037b;
            if (i10 == -1) {
                i10 = fVar.f4008a;
            }
            this.f4039e = fVar;
            f fVar2 = new f(i10, fVar.f4009b, 2);
            this.f4040f = fVar2;
            this.f4042i = true;
            return fVar2;
        }
        throw new g(fVar);
    }

    @Override
    public final void e() {
        int i10;
        j jVar = this.f4043j;
        if (jVar != null) {
            int i11 = jVar.f4025k;
            float f7 = jVar.f4019c;
            float f10 = jVar.d;
            int i12 = jVar.f4027m + ((int) (((((((i11 - i10) / (f7 / f10)) + jVar.f4032r) + jVar.f4036w) + jVar.f4029o) / (jVar.f4020e * f10)) + 0.5d));
            jVar.f4036w = 0.0d;
            short[] sArr = jVar.f4024j;
            int i13 = jVar.h * 2;
            jVar.f4024j = jVar.c(sArr, i11, i13 + i11);
            int i14 = 0;
            while (true) {
                int i15 = jVar.f4018b;
                if (i14 >= i13 * i15) {
                    break;
                }
                jVar.f4024j[(i15 * i11) + i14] = 0;
                i14++;
            }
            jVar.f4025k = i13 + jVar.f4025k;
            jVar.f();
            if (jVar.f4027m > i12) {
                jVar.f4027m = Math.max(i12, 0);
            }
            jVar.f4025k = 0;
            jVar.f4032r = 0;
            jVar.f4029o = 0;
        }
        this.f4049p = true;
    }

    @Override
    public final void flush() {
        if (isActive()) {
            f fVar = this.f4039e;
            this.f4041g = fVar;
            f fVar2 = this.f4040f;
            this.h = fVar2;
            if (this.f4042i) {
                this.f4043j = new j(fVar.f4008a, this.f4038c, fVar.f4009b, this.d, fVar2.f4008a);
            } else {
                j jVar = this.f4043j;
                if (jVar != null) {
                    jVar.f4025k = 0;
                    jVar.f4027m = 0;
                    jVar.f4029o = 0;
                    jVar.f4030p = 0;
                    jVar.f4031q = 0;
                    jVar.f4032r = 0;
                    jVar.f4033s = 0;
                    jVar.f4034t = 0;
                    jVar.f4035u = 0;
                    jVar.v = 0;
                    jVar.f4036w = 0.0d;
                }
            }
        }
        this.f4046m = h.f4011a;
        this.f4047n = 0L;
        this.f4048o = 0L;
        this.f4049p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f4040f.f4008a != -1) {
            if (Math.abs(this.f4038c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f4040f.f4008a != this.f4039e.f4008a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f4038c = 1.0f;
        this.d = 1.0f;
        f fVar = f.f4007e;
        this.f4039e = fVar;
        this.f4040f = fVar;
        this.f4041g = fVar;
        this.h = fVar;
        ByteBuffer byteBuffer = h.f4011a;
        this.f4044k = byteBuffer;
        this.f4045l = byteBuffer.asShortBuffer();
        this.f4046m = byteBuffer;
        this.f4037b = -1;
        this.f4042i = false;
        this.f4043j = null;
        this.f4047n = 0L;
        this.f4048o = 0L;
        this.f4049p = false;
    }
}

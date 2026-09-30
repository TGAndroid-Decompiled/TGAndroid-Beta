package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class k implements h {
    public int f3695b;
    public float f3696c;
    public float d;
    public f e;
    public f f3697f;
    public f f3698g;
    public f h;
    public boolean f3699i;
    public j f3700j;
    public ByteBuffer f3701k;
    public ShortBuffer f3702l;
    public ByteBuffer f3703m;
    public long f3704n;
    public long f3705o;
    public boolean f3706p;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        j jVar = this.f3700j;
        if (jVar != null) {
            int i10 = jVar.f3677b;
            boolean z11 = true;
            if (jVar.f3685m >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            int i11 = jVar.f3685m * i10 * 2;
            if (i11 > 0) {
                if (this.f3701k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f3701k = order;
                    this.f3702l = order.asShortBuffer();
                } else {
                    this.f3701k.clear();
                    this.f3702l.clear();
                }
                ShortBuffer shortBuffer = this.f3702l;
                if (jVar.f3685m < 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                int min = Math.min(shortBuffer.remaining() / i10, jVar.f3685m);
                int i12 = min * i10;
                shortBuffer.put(jVar.f3684l, 0, i12);
                int i13 = jVar.f3685m - min;
                jVar.f3685m = i13;
                short[] sArr = jVar.f3684l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f3705o += i11;
                this.f3701k.limit(i11);
                this.f3703m = this.f3701k;
            }
        }
        ByteBuffer byteBuffer = this.f3703m;
        this.f3703m = h.f3671a;
        return byteBuffer;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f3706p) {
            j jVar = this.f3700j;
            if (jVar != null) {
                if (jVar.f3685m >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (jVar.f3685m * jVar.f3677b * 2 == 0) {
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
        j jVar = this.f3700j;
        jVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f3704n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = jVar.f3677b;
        int i11 = remaining2 / i10;
        short[] c10 = jVar.c(jVar.f3682j, jVar.f3683k, i11);
        jVar.f3682j = c10;
        asShortBuffer.get(c10, jVar.f3683k * i10, ((i11 * i10) * 2) / 2);
        jVar.f3683k += i11;
        jVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final f d(f fVar) {
        if (fVar.f3670c == 2) {
            int i10 = this.f3695b;
            if (i10 == -1) {
                i10 = fVar.f3668a;
            }
            this.e = fVar;
            f fVar2 = new f(i10, fVar.f3669b, 2);
            this.f3697f = fVar2;
            this.f3699i = true;
            return fVar2;
        }
        throw new g(fVar);
    }

    @Override
    public final void e() {
        j jVar = this.f3700j;
        if (jVar != null) {
            int i10 = jVar.f3683k;
            float f7 = jVar.f3678c;
            float f10 = jVar.d;
            int i11 = jVar.f3690r;
            int i12 = jVar.f3685m + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + jVar.f3694w) + jVar.f3687o) / (jVar.e * f10)) + 0.5d));
            jVar.f3694w = 0.0d;
            short[] sArr = jVar.f3682j;
            int i13 = jVar.h * 2;
            jVar.f3682j = jVar.c(sArr, i10, i13 + i10);
            int i14 = 0;
            while (true) {
                int i15 = jVar.f3677b;
                if (i14 >= i13 * i15) {
                    break;
                }
                jVar.f3682j[(i15 * i10) + i14] = 0;
                i14++;
            }
            jVar.f3683k = i13 + jVar.f3683k;
            jVar.f();
            if (jVar.f3685m > i12) {
                jVar.f3685m = Math.max(i12, 0);
            }
            jVar.f3683k = 0;
            jVar.f3690r = 0;
            jVar.f3687o = 0;
        }
        this.f3706p = true;
    }

    @Override
    public final void flush() {
        if (isActive()) {
            f fVar = this.e;
            this.f3698g = fVar;
            f fVar2 = this.f3697f;
            this.h = fVar2;
            if (this.f3699i) {
                this.f3700j = new j(fVar.f3668a, this.f3696c, fVar.f3669b, this.d, fVar2.f3668a);
            } else {
                j jVar = this.f3700j;
                if (jVar != null) {
                    jVar.f3683k = 0;
                    jVar.f3685m = 0;
                    jVar.f3687o = 0;
                    jVar.f3688p = 0;
                    jVar.f3689q = 0;
                    jVar.f3690r = 0;
                    jVar.f3691s = 0;
                    jVar.f3692t = 0;
                    jVar.f3693u = 0;
                    jVar.v = 0;
                    jVar.f3694w = 0.0d;
                }
            }
        }
        this.f3703m = h.f3671a;
        this.f3704n = 0L;
        this.f3705o = 0L;
        this.f3706p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f3697f.f3668a != -1) {
            if (Math.abs(this.f3696c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f3697f.f3668a != this.e.f3668a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f3696c = 1.0f;
        this.d = 1.0f;
        f fVar = f.e;
        this.e = fVar;
        this.f3697f = fVar;
        this.f3698g = fVar;
        this.h = fVar;
        ByteBuffer byteBuffer = h.f3671a;
        this.f3701k = byteBuffer;
        this.f3702l = byteBuffer.asShortBuffer();
        this.f3703m = byteBuffer;
        this.f3695b = -1;
        this.f3699i = false;
        this.f3700j = null;
        this.f3704n = 0L;
        this.f3705o = 0L;
        this.f3706p = false;
    }
}

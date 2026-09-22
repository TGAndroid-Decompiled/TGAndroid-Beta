package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class k implements h {
    public int f3693b;
    public float f3694c;
    public float d;
    public f e;
    public f f3695f;
    public f f3696g;
    public f h;
    public boolean f3697i;
    public j f3698j;
    public ByteBuffer f3699k;
    public ShortBuffer f3700l;
    public ByteBuffer f3701m;
    public long f3702n;
    public long f3703o;
    public boolean f3704p;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        j jVar = this.f3698j;
        if (jVar != null) {
            int i10 = jVar.f3675b;
            boolean z11 = true;
            if (jVar.f3683m >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            int i11 = jVar.f3683m * i10 * 2;
            if (i11 > 0) {
                if (this.f3699k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f3699k = order;
                    this.f3700l = order.asShortBuffer();
                } else {
                    this.f3699k.clear();
                    this.f3700l.clear();
                }
                ShortBuffer shortBuffer = this.f3700l;
                if (jVar.f3683m < 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                int min = Math.min(shortBuffer.remaining() / i10, jVar.f3683m);
                int i12 = min * i10;
                shortBuffer.put(jVar.f3682l, 0, i12);
                int i13 = jVar.f3683m - min;
                jVar.f3683m = i13;
                short[] sArr = jVar.f3682l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f3703o += i11;
                this.f3699k.limit(i11);
                this.f3701m = this.f3699k;
            }
        }
        ByteBuffer byteBuffer = this.f3701m;
        this.f3701m = h.f3669a;
        return byteBuffer;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f3704p) {
            j jVar = this.f3698j;
            if (jVar != null) {
                if (jVar.f3683m >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (jVar.f3683m * jVar.f3675b * 2 == 0) {
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
        j jVar = this.f3698j;
        jVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f3702n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = jVar.f3675b;
        int i11 = remaining2 / i10;
        short[] c10 = jVar.c(jVar.f3680j, jVar.f3681k, i11);
        jVar.f3680j = c10;
        asShortBuffer.get(c10, jVar.f3681k * i10, ((i11 * i10) * 2) / 2);
        jVar.f3681k += i11;
        jVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final f d(f fVar) {
        if (fVar.f3668c == 2) {
            int i10 = this.f3693b;
            if (i10 == -1) {
                i10 = fVar.f3666a;
            }
            this.e = fVar;
            f fVar2 = new f(i10, fVar.f3667b, 2);
            this.f3695f = fVar2;
            this.f3697i = true;
            return fVar2;
        }
        throw new g(fVar);
    }

    @Override
    public final void e() {
        j jVar = this.f3698j;
        if (jVar != null) {
            int i10 = jVar.f3681k;
            float f7 = jVar.f3676c;
            float f10 = jVar.d;
            int i11 = jVar.f3688r;
            int i12 = jVar.f3683m + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + jVar.f3692w) + jVar.f3685o) / (jVar.e * f10)) + 0.5d));
            jVar.f3692w = 0.0d;
            short[] sArr = jVar.f3680j;
            int i13 = jVar.h * 2;
            jVar.f3680j = jVar.c(sArr, i10, i13 + i10);
            int i14 = 0;
            while (true) {
                int i15 = jVar.f3675b;
                if (i14 >= i13 * i15) {
                    break;
                }
                jVar.f3680j[(i15 * i10) + i14] = 0;
                i14++;
            }
            jVar.f3681k = i13 + jVar.f3681k;
            jVar.f();
            if (jVar.f3683m > i12) {
                jVar.f3683m = Math.max(i12, 0);
            }
            jVar.f3681k = 0;
            jVar.f3688r = 0;
            jVar.f3685o = 0;
        }
        this.f3704p = true;
    }

    @Override
    public final void flush() {
        if (isActive()) {
            f fVar = this.e;
            this.f3696g = fVar;
            f fVar2 = this.f3695f;
            this.h = fVar2;
            if (this.f3697i) {
                this.f3698j = new j(fVar.f3666a, this.f3694c, fVar.f3667b, this.d, fVar2.f3666a);
            } else {
                j jVar = this.f3698j;
                if (jVar != null) {
                    jVar.f3681k = 0;
                    jVar.f3683m = 0;
                    jVar.f3685o = 0;
                    jVar.f3686p = 0;
                    jVar.f3687q = 0;
                    jVar.f3688r = 0;
                    jVar.f3689s = 0;
                    jVar.f3690t = 0;
                    jVar.f3691u = 0;
                    jVar.v = 0;
                    jVar.f3692w = 0.0d;
                }
            }
        }
        this.f3701m = h.f3669a;
        this.f3702n = 0L;
        this.f3703o = 0L;
        this.f3704p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f3695f.f3666a != -1) {
            if (Math.abs(this.f3694c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f3695f.f3666a != this.e.f3666a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f3694c = 1.0f;
        this.d = 1.0f;
        f fVar = f.e;
        this.e = fVar;
        this.f3695f = fVar;
        this.f3696g = fVar;
        this.h = fVar;
        ByteBuffer byteBuffer = h.f3669a;
        this.f3699k = byteBuffer;
        this.f3700l = byteBuffer.asShortBuffer();
        this.f3701m = byteBuffer;
        this.f3693b = -1;
        this.f3697i = false;
        this.f3698j = null;
        this.f3702n = 0L;
        this.f3703o = 0L;
        this.f3704p = false;
    }
}

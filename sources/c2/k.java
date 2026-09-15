package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class k implements h {
    public int f3691b;
    public float f3692c;
    public float d;
    public f e;
    public f f3693f;
    public f f3694g;
    public f h;
    public boolean f3695i;
    public j f3696j;
    public ByteBuffer f3697k;
    public ShortBuffer f3698l;
    public ByteBuffer f3699m;
    public long f3700n;
    public long f3701o;
    public boolean f3702p;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        j jVar = this.f3696j;
        if (jVar != null) {
            int i10 = jVar.f3673b;
            boolean z11 = true;
            if (jVar.f3681m >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            int i11 = jVar.f3681m * i10 * 2;
            if (i11 > 0) {
                if (this.f3697k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f3697k = order;
                    this.f3698l = order.asShortBuffer();
                } else {
                    this.f3697k.clear();
                    this.f3698l.clear();
                }
                ShortBuffer shortBuffer = this.f3698l;
                if (jVar.f3681m < 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                int min = Math.min(shortBuffer.remaining() / i10, jVar.f3681m);
                int i12 = min * i10;
                shortBuffer.put(jVar.f3680l, 0, i12);
                int i13 = jVar.f3681m - min;
                jVar.f3681m = i13;
                short[] sArr = jVar.f3680l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f3701o += i11;
                this.f3697k.limit(i11);
                this.f3699m = this.f3697k;
            }
        }
        ByteBuffer byteBuffer = this.f3699m;
        this.f3699m = h.f3667a;
        return byteBuffer;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f3702p) {
            j jVar = this.f3696j;
            if (jVar != null) {
                if (jVar.f3681m >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (jVar.f3681m * jVar.f3673b * 2 == 0) {
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
        j jVar = this.f3696j;
        jVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f3700n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = jVar.f3673b;
        int i11 = remaining2 / i10;
        short[] c10 = jVar.c(jVar.f3678j, jVar.f3679k, i11);
        jVar.f3678j = c10;
        asShortBuffer.get(c10, jVar.f3679k * i10, ((i11 * i10) * 2) / 2);
        jVar.f3679k += i11;
        jVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final f d(f fVar) {
        if (fVar.f3666c == 2) {
            int i10 = this.f3691b;
            if (i10 == -1) {
                i10 = fVar.f3664a;
            }
            this.e = fVar;
            f fVar2 = new f(i10, fVar.f3665b, 2);
            this.f3693f = fVar2;
            this.f3695i = true;
            return fVar2;
        }
        throw new g(fVar);
    }

    @Override
    public final void e() {
        j jVar = this.f3696j;
        if (jVar != null) {
            int i10 = jVar.f3679k;
            float f7 = jVar.f3674c;
            float f10 = jVar.d;
            int i11 = jVar.f3686r;
            int i12 = jVar.f3681m + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + jVar.f3690w) + jVar.f3683o) / (jVar.e * f10)) + 0.5d));
            jVar.f3690w = 0.0d;
            short[] sArr = jVar.f3678j;
            int i13 = jVar.h * 2;
            jVar.f3678j = jVar.c(sArr, i10, i13 + i10);
            int i14 = 0;
            while (true) {
                int i15 = jVar.f3673b;
                if (i14 >= i13 * i15) {
                    break;
                }
                jVar.f3678j[(i15 * i10) + i14] = 0;
                i14++;
            }
            jVar.f3679k = i13 + jVar.f3679k;
            jVar.f();
            if (jVar.f3681m > i12) {
                jVar.f3681m = Math.max(i12, 0);
            }
            jVar.f3679k = 0;
            jVar.f3686r = 0;
            jVar.f3683o = 0;
        }
        this.f3702p = true;
    }

    @Override
    public final void flush() {
        if (isActive()) {
            f fVar = this.e;
            this.f3694g = fVar;
            f fVar2 = this.f3693f;
            this.h = fVar2;
            if (this.f3695i) {
                this.f3696j = new j(fVar.f3664a, this.f3692c, fVar.f3665b, this.d, fVar2.f3664a);
            } else {
                j jVar = this.f3696j;
                if (jVar != null) {
                    jVar.f3679k = 0;
                    jVar.f3681m = 0;
                    jVar.f3683o = 0;
                    jVar.f3684p = 0;
                    jVar.f3685q = 0;
                    jVar.f3686r = 0;
                    jVar.f3687s = 0;
                    jVar.f3688t = 0;
                    jVar.f3689u = 0;
                    jVar.v = 0;
                    jVar.f3690w = 0.0d;
                }
            }
        }
        this.f3699m = h.f3667a;
        this.f3700n = 0L;
        this.f3701o = 0L;
        this.f3702p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f3693f.f3664a != -1) {
            if (Math.abs(this.f3692c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f3693f.f3664a != this.e.f3664a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f3692c = 1.0f;
        this.d = 1.0f;
        f fVar = f.e;
        this.e = fVar;
        this.f3693f = fVar;
        this.f3694g = fVar;
        this.h = fVar;
        ByteBuffer byteBuffer = h.f3667a;
        this.f3697k = byteBuffer;
        this.f3698l = byteBuffer.asShortBuffer();
        this.f3699m = byteBuffer;
        this.f3691b = -1;
        this.f3695i = false;
        this.f3696j = null;
        this.f3700n = 0L;
        this.f3701o = 0L;
        this.f3702p = false;
    }
}

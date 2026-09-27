package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class k implements h {
    public int f3690b;
    public float f3691c;
    public float d;
    public f e;
    public f f3692f;
    public f f3693g;
    public f h;
    public boolean f3694i;
    public j f3695j;
    public ByteBuffer f3696k;
    public ShortBuffer f3697l;
    public ByteBuffer f3698m;
    public long f3699n;
    public long f3700o;
    public boolean f3701p;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        j jVar = this.f3695j;
        if (jVar != null) {
            int i10 = jVar.f3672b;
            boolean z11 = true;
            if (jVar.f3680m >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            int i11 = jVar.f3680m * i10 * 2;
            if (i11 > 0) {
                if (this.f3696k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f3696k = order;
                    this.f3697l = order.asShortBuffer();
                } else {
                    this.f3696k.clear();
                    this.f3697l.clear();
                }
                ShortBuffer shortBuffer = this.f3697l;
                if (jVar.f3680m < 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                int min = Math.min(shortBuffer.remaining() / i10, jVar.f3680m);
                int i12 = min * i10;
                shortBuffer.put(jVar.f3679l, 0, i12);
                int i13 = jVar.f3680m - min;
                jVar.f3680m = i13;
                short[] sArr = jVar.f3679l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f3700o += i11;
                this.f3696k.limit(i11);
                this.f3698m = this.f3696k;
            }
        }
        ByteBuffer byteBuffer = this.f3698m;
        this.f3698m = h.f3666a;
        return byteBuffer;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f3701p) {
            j jVar = this.f3695j;
            if (jVar != null) {
                if (jVar.f3680m >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (jVar.f3680m * jVar.f3672b * 2 == 0) {
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
        j jVar = this.f3695j;
        jVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f3699n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = jVar.f3672b;
        int i11 = remaining2 / i10;
        short[] c10 = jVar.c(jVar.f3677j, jVar.f3678k, i11);
        jVar.f3677j = c10;
        asShortBuffer.get(c10, jVar.f3678k * i10, ((i11 * i10) * 2) / 2);
        jVar.f3678k += i11;
        jVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final f d(f fVar) {
        if (fVar.f3665c == 2) {
            int i10 = this.f3690b;
            if (i10 == -1) {
                i10 = fVar.f3663a;
            }
            this.e = fVar;
            f fVar2 = new f(i10, fVar.f3664b, 2);
            this.f3692f = fVar2;
            this.f3694i = true;
            return fVar2;
        }
        throw new g(fVar);
    }

    @Override
    public final void e() {
        j jVar = this.f3695j;
        if (jVar != null) {
            int i10 = jVar.f3678k;
            float f7 = jVar.f3673c;
            float f10 = jVar.d;
            int i11 = jVar.f3685r;
            int i12 = jVar.f3680m + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + jVar.f3689w) + jVar.f3682o) / (jVar.e * f10)) + 0.5d));
            jVar.f3689w = 0.0d;
            short[] sArr = jVar.f3677j;
            int i13 = jVar.h * 2;
            jVar.f3677j = jVar.c(sArr, i10, i13 + i10);
            int i14 = 0;
            while (true) {
                int i15 = jVar.f3672b;
                if (i14 >= i13 * i15) {
                    break;
                }
                jVar.f3677j[(i15 * i10) + i14] = 0;
                i14++;
            }
            jVar.f3678k = i13 + jVar.f3678k;
            jVar.f();
            if (jVar.f3680m > i12) {
                jVar.f3680m = Math.max(i12, 0);
            }
            jVar.f3678k = 0;
            jVar.f3685r = 0;
            jVar.f3682o = 0;
        }
        this.f3701p = true;
    }

    @Override
    public final void flush() {
        if (isActive()) {
            f fVar = this.e;
            this.f3693g = fVar;
            f fVar2 = this.f3692f;
            this.h = fVar2;
            if (this.f3694i) {
                this.f3695j = new j(fVar.f3663a, this.f3691c, fVar.f3664b, this.d, fVar2.f3663a);
            } else {
                j jVar = this.f3695j;
                if (jVar != null) {
                    jVar.f3678k = 0;
                    jVar.f3680m = 0;
                    jVar.f3682o = 0;
                    jVar.f3683p = 0;
                    jVar.f3684q = 0;
                    jVar.f3685r = 0;
                    jVar.f3686s = 0;
                    jVar.f3687t = 0;
                    jVar.f3688u = 0;
                    jVar.v = 0;
                    jVar.f3689w = 0.0d;
                }
            }
        }
        this.f3698m = h.f3666a;
        this.f3699n = 0L;
        this.f3700o = 0L;
        this.f3701p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f3692f.f3663a != -1) {
            if (Math.abs(this.f3691c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f3692f.f3663a != this.e.f3663a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f3691c = 1.0f;
        this.d = 1.0f;
        f fVar = f.e;
        this.e = fVar;
        this.f3692f = fVar;
        this.f3693g = fVar;
        this.h = fVar;
        ByteBuffer byteBuffer = h.f3666a;
        this.f3696k = byteBuffer;
        this.f3697l = byteBuffer.asShortBuffer();
        this.f3698m = byteBuffer;
        this.f3690b = -1;
        this.f3694i = false;
        this.f3695j = null;
        this.f3699n = 0L;
        this.f3700o = 0L;
        this.f3701p = false;
    }
}

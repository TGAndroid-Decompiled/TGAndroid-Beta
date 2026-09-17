package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class k implements h {
    public int f3696b;
    public float f3697c;
    public float d;
    public f e;
    public f f3698f;
    public f f3699g;
    public f h;
    public boolean f3700i;
    public j f3701j;
    public ByteBuffer f3702k;
    public ShortBuffer f3703l;
    public ByteBuffer f3704m;
    public long f3705n;
    public long f3706o;
    public boolean f3707p;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        j jVar = this.f3701j;
        if (jVar != null) {
            int i10 = jVar.f3678b;
            boolean z11 = true;
            if (jVar.f3686m >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            int i11 = jVar.f3686m * i10 * 2;
            if (i11 > 0) {
                if (this.f3702k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f3702k = order;
                    this.f3703l = order.asShortBuffer();
                } else {
                    this.f3702k.clear();
                    this.f3703l.clear();
                }
                ShortBuffer shortBuffer = this.f3703l;
                if (jVar.f3686m < 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                int min = Math.min(shortBuffer.remaining() / i10, jVar.f3686m);
                int i12 = min * i10;
                shortBuffer.put(jVar.f3685l, 0, i12);
                int i13 = jVar.f3686m - min;
                jVar.f3686m = i13;
                short[] sArr = jVar.f3685l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f3706o += i11;
                this.f3702k.limit(i11);
                this.f3704m = this.f3702k;
            }
        }
        ByteBuffer byteBuffer = this.f3704m;
        this.f3704m = h.f3672a;
        return byteBuffer;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f3707p) {
            j jVar = this.f3701j;
            if (jVar != null) {
                if (jVar.f3686m >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (jVar.f3686m * jVar.f3678b * 2 == 0) {
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
        j jVar = this.f3701j;
        jVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f3705n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = jVar.f3678b;
        int i11 = remaining2 / i10;
        short[] c10 = jVar.c(jVar.f3683j, jVar.f3684k, i11);
        jVar.f3683j = c10;
        asShortBuffer.get(c10, jVar.f3684k * i10, ((i11 * i10) * 2) / 2);
        jVar.f3684k += i11;
        jVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final f d(f fVar) {
        if (fVar.f3671c == 2) {
            int i10 = this.f3696b;
            if (i10 == -1) {
                i10 = fVar.f3669a;
            }
            this.e = fVar;
            f fVar2 = new f(i10, fVar.f3670b, 2);
            this.f3698f = fVar2;
            this.f3700i = true;
            return fVar2;
        }
        throw new g(fVar);
    }

    @Override
    public final void e() {
        j jVar = this.f3701j;
        if (jVar != null) {
            int i10 = jVar.f3684k;
            float f7 = jVar.f3679c;
            float f10 = jVar.d;
            int i11 = jVar.f3691r;
            int i12 = jVar.f3686m + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + jVar.f3695w) + jVar.f3688o) / (jVar.e * f10)) + 0.5d));
            jVar.f3695w = 0.0d;
            short[] sArr = jVar.f3683j;
            int i13 = jVar.h * 2;
            jVar.f3683j = jVar.c(sArr, i10, i13 + i10);
            int i14 = 0;
            while (true) {
                int i15 = jVar.f3678b;
                if (i14 >= i13 * i15) {
                    break;
                }
                jVar.f3683j[(i15 * i10) + i14] = 0;
                i14++;
            }
            jVar.f3684k = i13 + jVar.f3684k;
            jVar.f();
            if (jVar.f3686m > i12) {
                jVar.f3686m = Math.max(i12, 0);
            }
            jVar.f3684k = 0;
            jVar.f3691r = 0;
            jVar.f3688o = 0;
        }
        this.f3707p = true;
    }

    @Override
    public final void flush() {
        if (isActive()) {
            f fVar = this.e;
            this.f3699g = fVar;
            f fVar2 = this.f3698f;
            this.h = fVar2;
            if (this.f3700i) {
                this.f3701j = new j(fVar.f3669a, this.f3697c, fVar.f3670b, this.d, fVar2.f3669a);
            } else {
                j jVar = this.f3701j;
                if (jVar != null) {
                    jVar.f3684k = 0;
                    jVar.f3686m = 0;
                    jVar.f3688o = 0;
                    jVar.f3689p = 0;
                    jVar.f3690q = 0;
                    jVar.f3691r = 0;
                    jVar.f3692s = 0;
                    jVar.f3693t = 0;
                    jVar.f3694u = 0;
                    jVar.v = 0;
                    jVar.f3695w = 0.0d;
                }
            }
        }
        this.f3704m = h.f3672a;
        this.f3705n = 0L;
        this.f3706o = 0L;
        this.f3707p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f3698f.f3669a != -1) {
            if (Math.abs(this.f3697c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f3698f.f3669a != this.e.f3669a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f3697c = 1.0f;
        this.d = 1.0f;
        f fVar = f.e;
        this.e = fVar;
        this.f3698f = fVar;
        this.f3699g = fVar;
        this.h = fVar;
        ByteBuffer byteBuffer = h.f3672a;
        this.f3702k = byteBuffer;
        this.f3703l = byteBuffer.asShortBuffer();
        this.f3704m = byteBuffer;
        this.f3696b = -1;
        this.f3700i = false;
        this.f3701j = null;
        this.f3705n = 0L;
        this.f3706o = 0L;
        this.f3707p = false;
    }
}

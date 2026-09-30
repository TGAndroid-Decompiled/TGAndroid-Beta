package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class k implements h {
    public int f3688b;
    public float f3689c;
    public float d;
    public f e;
    public f f3690f;
    public f f3691g;
    public f h;
    public boolean f3692i;
    public j f3693j;
    public ByteBuffer f3694k;
    public ShortBuffer f3695l;
    public ByteBuffer f3696m;
    public long f3697n;
    public long f3698o;
    public boolean f3699p;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        j jVar = this.f3693j;
        if (jVar != null) {
            int i10 = jVar.f3670b;
            boolean z11 = true;
            if (jVar.f3678m >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            int i11 = jVar.f3678m * i10 * 2;
            if (i11 > 0) {
                if (this.f3694k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f3694k = order;
                    this.f3695l = order.asShortBuffer();
                } else {
                    this.f3694k.clear();
                    this.f3695l.clear();
                }
                ShortBuffer shortBuffer = this.f3695l;
                if (jVar.f3678m < 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                int min = Math.min(shortBuffer.remaining() / i10, jVar.f3678m);
                int i12 = min * i10;
                shortBuffer.put(jVar.f3677l, 0, i12);
                int i13 = jVar.f3678m - min;
                jVar.f3678m = i13;
                short[] sArr = jVar.f3677l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f3698o += i11;
                this.f3694k.limit(i11);
                this.f3696m = this.f3694k;
            }
        }
        ByteBuffer byteBuffer = this.f3696m;
        this.f3696m = h.f3664a;
        return byteBuffer;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f3699p) {
            j jVar = this.f3693j;
            if (jVar != null) {
                if (jVar.f3678m >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (jVar.f3678m * jVar.f3670b * 2 == 0) {
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
        j jVar = this.f3693j;
        jVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f3697n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = jVar.f3670b;
        int i11 = remaining2 / i10;
        short[] c10 = jVar.c(jVar.f3675j, jVar.f3676k, i11);
        jVar.f3675j = c10;
        asShortBuffer.get(c10, jVar.f3676k * i10, ((i11 * i10) * 2) / 2);
        jVar.f3676k += i11;
        jVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final f d(f fVar) {
        if (fVar.f3663c == 2) {
            int i10 = this.f3688b;
            if (i10 == -1) {
                i10 = fVar.f3661a;
            }
            this.e = fVar;
            f fVar2 = new f(i10, fVar.f3662b, 2);
            this.f3690f = fVar2;
            this.f3692i = true;
            return fVar2;
        }
        throw new g(fVar);
    }

    @Override
    public final void e() {
        j jVar = this.f3693j;
        if (jVar != null) {
            int i10 = jVar.f3676k;
            float f7 = jVar.f3671c;
            float f10 = jVar.d;
            int i11 = jVar.f3683r;
            int i12 = jVar.f3678m + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + jVar.f3687w) + jVar.f3680o) / (jVar.e * f10)) + 0.5d));
            jVar.f3687w = 0.0d;
            short[] sArr = jVar.f3675j;
            int i13 = jVar.h * 2;
            jVar.f3675j = jVar.c(sArr, i10, i13 + i10);
            int i14 = 0;
            while (true) {
                int i15 = jVar.f3670b;
                if (i14 >= i13 * i15) {
                    break;
                }
                jVar.f3675j[(i15 * i10) + i14] = 0;
                i14++;
            }
            jVar.f3676k = i13 + jVar.f3676k;
            jVar.f();
            if (jVar.f3678m > i12) {
                jVar.f3678m = Math.max(i12, 0);
            }
            jVar.f3676k = 0;
            jVar.f3683r = 0;
            jVar.f3680o = 0;
        }
        this.f3699p = true;
    }

    @Override
    public final void flush() {
        if (isActive()) {
            f fVar = this.e;
            this.f3691g = fVar;
            f fVar2 = this.f3690f;
            this.h = fVar2;
            if (this.f3692i) {
                this.f3693j = new j(fVar.f3661a, this.f3689c, fVar.f3662b, this.d, fVar2.f3661a);
            } else {
                j jVar = this.f3693j;
                if (jVar != null) {
                    jVar.f3676k = 0;
                    jVar.f3678m = 0;
                    jVar.f3680o = 0;
                    jVar.f3681p = 0;
                    jVar.f3682q = 0;
                    jVar.f3683r = 0;
                    jVar.f3684s = 0;
                    jVar.f3685t = 0;
                    jVar.f3686u = 0;
                    jVar.v = 0;
                    jVar.f3687w = 0.0d;
                }
            }
        }
        this.f3696m = h.f3664a;
        this.f3697n = 0L;
        this.f3698o = 0L;
        this.f3699p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f3690f.f3661a != -1) {
            if (Math.abs(this.f3689c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f3690f.f3661a != this.e.f3661a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f3689c = 1.0f;
        this.d = 1.0f;
        f fVar = f.e;
        this.e = fVar;
        this.f3690f = fVar;
        this.f3691g = fVar;
        this.h = fVar;
        ByteBuffer byteBuffer = h.f3664a;
        this.f3694k = byteBuffer;
        this.f3695l = byteBuffer.asShortBuffer();
        this.f3696m = byteBuffer;
        this.f3688b = -1;
        this.f3692i = false;
        this.f3693j = null;
        this.f3697n = 0L;
        this.f3698o = 0L;
        this.f3699p = false;
    }
}

package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class k implements h {
    public int f3987b;
    public float f3988c;
    public float d;
    public f f3989e;
    public f f3990f;
    public f f3991g;
    public f h;
    public boolean f3992i;
    public j f3993j;
    public ByteBuffer f3994k;
    public ShortBuffer f3995l;
    public ByteBuffer f3996m;
    public long f3997n;
    public long f3998o;
    public boolean f3999p;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        j jVar = this.f3993j;
        if (jVar != null) {
            int i10 = jVar.f3968b;
            boolean z11 = true;
            if (jVar.f3977m >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            int i11 = jVar.f3977m * i10 * 2;
            if (i11 > 0) {
                if (this.f3994k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f3994k = order;
                    this.f3995l = order.asShortBuffer();
                } else {
                    this.f3994k.clear();
                    this.f3995l.clear();
                }
                ShortBuffer shortBuffer = this.f3995l;
                if (jVar.f3977m < 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                int min = Math.min(shortBuffer.remaining() / i10, jVar.f3977m);
                int i12 = min * i10;
                shortBuffer.put(jVar.f3976l, 0, i12);
                int i13 = jVar.f3977m - min;
                jVar.f3977m = i13;
                short[] sArr = jVar.f3976l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f3998o += i11;
                this.f3994k.limit(i11);
                this.f3996m = this.f3994k;
            }
        }
        ByteBuffer byteBuffer = this.f3996m;
        this.f3996m = h.f3961a;
        return byteBuffer;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f3999p) {
            j jVar = this.f3993j;
            if (jVar != null) {
                if (jVar.f3977m >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (jVar.f3977m * jVar.f3968b * 2 == 0) {
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
        j jVar = this.f3993j;
        jVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f3997n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = jVar.f3968b;
        int i11 = remaining2 / i10;
        short[] c10 = jVar.c(jVar.f3974j, jVar.f3975k, i11);
        jVar.f3974j = c10;
        asShortBuffer.get(c10, jVar.f3975k * i10, ((i11 * i10) * 2) / 2);
        jVar.f3975k += i11;
        jVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final f d(f fVar) {
        if (fVar.f3960c == 2) {
            int i10 = this.f3987b;
            if (i10 == -1) {
                i10 = fVar.f3958a;
            }
            this.f3989e = fVar;
            f fVar2 = new f(i10, fVar.f3959b, 2);
            this.f3990f = fVar2;
            this.f3992i = true;
            return fVar2;
        }
        throw new g(fVar);
    }

    @Override
    public final void e() {
        j jVar = this.f3993j;
        if (jVar != null) {
            int i10 = jVar.f3975k;
            float f7 = jVar.f3969c;
            float f10 = jVar.d;
            int i11 = jVar.f3982r;
            int i12 = jVar.f3977m + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + jVar.f3986w) + jVar.f3979o) / (jVar.f3970e * f10)) + 0.5d));
            jVar.f3986w = 0.0d;
            short[] sArr = jVar.f3974j;
            int i13 = jVar.h * 2;
            jVar.f3974j = jVar.c(sArr, i10, i13 + i10);
            int i14 = 0;
            while (true) {
                int i15 = jVar.f3968b;
                if (i14 >= i13 * i15) {
                    break;
                }
                jVar.f3974j[(i15 * i10) + i14] = 0;
                i14++;
            }
            jVar.f3975k = i13 + jVar.f3975k;
            jVar.f();
            if (jVar.f3977m > i12) {
                jVar.f3977m = Math.max(i12, 0);
            }
            jVar.f3975k = 0;
            jVar.f3982r = 0;
            jVar.f3979o = 0;
        }
        this.f3999p = true;
    }

    @Override
    public final void flush() {
        if (isActive()) {
            f fVar = this.f3989e;
            this.f3991g = fVar;
            f fVar2 = this.f3990f;
            this.h = fVar2;
            if (this.f3992i) {
                this.f3993j = new j(fVar.f3958a, this.f3988c, fVar.f3959b, this.d, fVar2.f3958a);
            } else {
                j jVar = this.f3993j;
                if (jVar != null) {
                    jVar.f3975k = 0;
                    jVar.f3977m = 0;
                    jVar.f3979o = 0;
                    jVar.f3980p = 0;
                    jVar.f3981q = 0;
                    jVar.f3982r = 0;
                    jVar.f3983s = 0;
                    jVar.f3984t = 0;
                    jVar.f3985u = 0;
                    jVar.v = 0;
                    jVar.f3986w = 0.0d;
                }
            }
        }
        this.f3996m = h.f3961a;
        this.f3997n = 0L;
        this.f3998o = 0L;
        this.f3999p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f3990f.f3958a != -1) {
            if (Math.abs(this.f3988c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f3990f.f3958a != this.f3989e.f3958a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f3988c = 1.0f;
        this.d = 1.0f;
        f fVar = f.f3957e;
        this.f3989e = fVar;
        this.f3990f = fVar;
        this.f3991g = fVar;
        this.h = fVar;
        ByteBuffer byteBuffer = h.f3961a;
        this.f3994k = byteBuffer;
        this.f3995l = byteBuffer.asShortBuffer();
        this.f3996m = byteBuffer;
        this.f3987b = -1;
        this.f3992i = false;
        this.f3993j = null;
        this.f3997n = 0L;
        this.f3998o = 0L;
        this.f3999p = false;
    }
}

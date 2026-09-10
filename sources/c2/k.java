package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class k implements h {
    public int f4110b;
    public float f4111c;
    public float d;
    public f e;
    public f f4112f;
    public f f4113g;
    public f h;
    public boolean f4114i;
    public j f4115j;
    public ByteBuffer f4116k;
    public ShortBuffer f4117l;
    public ByteBuffer f4118m;
    public long f4119n;
    public long f4120o;
    public boolean f4121p;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        j jVar = this.f4115j;
        if (jVar != null) {
            int i10 = jVar.f4092b;
            boolean z11 = true;
            if (jVar.f4100m >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            int i11 = jVar.f4100m * i10 * 2;
            if (i11 > 0) {
                if (this.f4116k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f4116k = order;
                    this.f4117l = order.asShortBuffer();
                } else {
                    this.f4116k.clear();
                    this.f4117l.clear();
                }
                ShortBuffer shortBuffer = this.f4117l;
                if (jVar.f4100m < 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                int min = Math.min(shortBuffer.remaining() / i10, jVar.f4100m);
                int i12 = min * i10;
                shortBuffer.put(jVar.f4099l, 0, i12);
                int i13 = jVar.f4100m - min;
                jVar.f4100m = i13;
                short[] sArr = jVar.f4099l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f4120o += i11;
                this.f4116k.limit(i11);
                this.f4118m = this.f4116k;
            }
        }
        ByteBuffer byteBuffer = this.f4118m;
        this.f4118m = h.f4086a;
        return byteBuffer;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f4121p) {
            j jVar = this.f4115j;
            if (jVar != null) {
                if (jVar.f4100m >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (jVar.f4100m * jVar.f4092b * 2 == 0) {
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
        j jVar = this.f4115j;
        jVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f4119n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = jVar.f4092b;
        int i11 = remaining2 / i10;
        short[] c10 = jVar.c(jVar.f4097j, jVar.f4098k, i11);
        jVar.f4097j = c10;
        asShortBuffer.get(c10, jVar.f4098k * i10, ((i11 * i10) * 2) / 2);
        jVar.f4098k += i11;
        jVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final f d(f fVar) {
        if (fVar.f4085c == 2) {
            int i10 = this.f4110b;
            if (i10 == -1) {
                i10 = fVar.f4083a;
            }
            this.e = fVar;
            f fVar2 = new f(i10, fVar.f4084b, 2);
            this.f4112f = fVar2;
            this.f4114i = true;
            return fVar2;
        }
        throw new g(fVar);
    }

    @Override
    public final void e() {
        j jVar = this.f4115j;
        if (jVar != null) {
            int i10 = jVar.f4098k;
            float f7 = jVar.f4093c;
            float f10 = jVar.d;
            int i11 = jVar.f4105r;
            int i12 = jVar.f4100m + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + jVar.f4109w) + jVar.f4102o) / (jVar.e * f10)) + 0.5d));
            jVar.f4109w = 0.0d;
            short[] sArr = jVar.f4097j;
            int i13 = jVar.h * 2;
            jVar.f4097j = jVar.c(sArr, i10, i13 + i10);
            int i14 = 0;
            while (true) {
                int i15 = jVar.f4092b;
                if (i14 >= i13 * i15) {
                    break;
                }
                jVar.f4097j[(i15 * i10) + i14] = 0;
                i14++;
            }
            jVar.f4098k = i13 + jVar.f4098k;
            jVar.f();
            if (jVar.f4100m > i12) {
                jVar.f4100m = Math.max(i12, 0);
            }
            jVar.f4098k = 0;
            jVar.f4105r = 0;
            jVar.f4102o = 0;
        }
        this.f4121p = true;
    }

    @Override
    public final void flush() {
        if (isActive()) {
            f fVar = this.e;
            this.f4113g = fVar;
            f fVar2 = this.f4112f;
            this.h = fVar2;
            if (this.f4114i) {
                this.f4115j = new j(fVar.f4083a, this.f4111c, fVar.f4084b, this.d, fVar2.f4083a);
            } else {
                j jVar = this.f4115j;
                if (jVar != null) {
                    jVar.f4098k = 0;
                    jVar.f4100m = 0;
                    jVar.f4102o = 0;
                    jVar.f4103p = 0;
                    jVar.f4104q = 0;
                    jVar.f4105r = 0;
                    jVar.f4106s = 0;
                    jVar.f4107t = 0;
                    jVar.f4108u = 0;
                    jVar.v = 0;
                    jVar.f4109w = 0.0d;
                }
            }
        }
        this.f4118m = h.f4086a;
        this.f4119n = 0L;
        this.f4120o = 0L;
        this.f4121p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f4112f.f4083a != -1) {
            if (Math.abs(this.f4111c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f4112f.f4083a != this.e.f4083a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f4111c = 1.0f;
        this.d = 1.0f;
        f fVar = f.e;
        this.e = fVar;
        this.f4112f = fVar;
        this.f4113g = fVar;
        this.h = fVar;
        ByteBuffer byteBuffer = h.f4086a;
        this.f4116k = byteBuffer;
        this.f4117l = byteBuffer.asShortBuffer();
        this.f4118m = byteBuffer;
        this.f4110b = -1;
        this.f4114i = false;
        this.f4115j = null;
        this.f4119n = 0L;
        this.f4120o = 0L;
        this.f4121p = false;
    }
}

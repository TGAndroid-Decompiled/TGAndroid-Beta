package l3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class s0 implements n {
    public int f11619b;
    public float f11620c;
    public float d;
    public l f11621e;
    public l f11622f;
    public l f11623g;
    public l h;
    public boolean f11624i;
    public r0 f11625j;
    public ByteBuffer f11626k;
    public ShortBuffer f11627l;
    public ByteBuffer f11628m;
    public long f11629n;
    public long f11630o;
    public boolean f11631p;

    @Override
    public final ByteBuffer a() {
        r0 r0Var = this.f11625j;
        if (r0Var != null) {
            int i10 = r0Var.f11598b;
            int i11 = r0Var.f11607m * i10 * 2;
            if (i11 > 0) {
                if (this.f11626k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f11626k = order;
                    this.f11627l = order.asShortBuffer();
                } else {
                    this.f11626k.clear();
                    this.f11627l.clear();
                }
                ShortBuffer shortBuffer = this.f11627l;
                int min = Math.min(shortBuffer.remaining() / i10, r0Var.f11607m);
                int i12 = min * i10;
                shortBuffer.put(r0Var.f11606l, 0, i12);
                int i13 = r0Var.f11607m - min;
                r0Var.f11607m = i13;
                short[] sArr = r0Var.f11606l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f11630o += i11;
                this.f11626k.limit(i11);
                this.f11628m = this.f11626k;
            }
        }
        ByteBuffer byteBuffer = this.f11628m;
        this.f11628m = n.f11564a;
        return byteBuffer;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        r0 r0Var = this.f11625j;
        r0Var.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f11629n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = r0Var.f11598b;
        int i11 = remaining2 / i10;
        short[] c3 = r0Var.c(r0Var.f11604j, r0Var.f11605k, i11);
        r0Var.f11604j = c3;
        asShortBuffer.get(c3, r0Var.f11605k * i10, ((i11 * i10) * 2) / 2);
        r0Var.f11605k += i11;
        r0Var.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final void c() {
        r0 r0Var = this.f11625j;
        if (r0Var != null) {
            int i10 = r0Var.f11605k;
            float f10 = r0Var.f11599c;
            float f11 = r0Var.d;
            float f12 = r0Var.f11600e * f11;
            int b10 = r0Var.f11607m + ((int) l.d.b(i10 / (f10 / f11), r0Var.f11609o, f12, 0.5f));
            short[] sArr = r0Var.f11604j;
            int i11 = r0Var.h * 2;
            r0Var.f11604j = r0Var.c(sArr, i10, i11 + i10);
            int i12 = 0;
            while (true) {
                int i13 = r0Var.f11598b;
                if (i12 >= i11 * i13) {
                    break;
                }
                r0Var.f11604j[(i13 * i10) + i12] = 0;
                i12++;
            }
            r0Var.f11605k = i11 + r0Var.f11605k;
            r0Var.f();
            if (r0Var.f11607m > b10) {
                r0Var.f11607m = b10;
            }
            r0Var.f11605k = 0;
            r0Var.f11612r = 0;
            r0Var.f11609o = 0;
        }
        this.f11631p = true;
    }

    @Override
    public final boolean d() {
        if (this.f11631p) {
            r0 r0Var = this.f11625j;
            if (r0Var == null || r0Var.f11607m * r0Var.f11598b * 2 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final l e(l lVar) {
        if (lVar.f11562c == 2) {
            int i10 = this.f11619b;
            if (i10 == -1) {
                i10 = lVar.f11560a;
            }
            this.f11621e = lVar;
            l lVar2 = new l(i10, lVar.f11561b, 2);
            this.f11622f = lVar2;
            this.f11624i = true;
            return lVar2;
        }
        throw new m(lVar);
    }

    @Override
    public final void flush() {
        if (isActive()) {
            l lVar = this.f11621e;
            this.f11623g = lVar;
            l lVar2 = this.f11622f;
            this.h = lVar2;
            if (this.f11624i) {
                this.f11625j = new r0(lVar.f11560a, this.f11620c, lVar.f11561b, this.d, lVar2.f11560a);
            } else {
                r0 r0Var = this.f11625j;
                if (r0Var != null) {
                    r0Var.f11605k = 0;
                    r0Var.f11607m = 0;
                    r0Var.f11609o = 0;
                    r0Var.f11610p = 0;
                    r0Var.f11611q = 0;
                    r0Var.f11612r = 0;
                    r0Var.f11613s = 0;
                    r0Var.f11614t = 0;
                    r0Var.f11615u = 0;
                    r0Var.v = 0;
                }
            }
        }
        this.f11628m = n.f11564a;
        this.f11629n = 0L;
        this.f11630o = 0L;
        this.f11631p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f11622f.f11560a != -1) {
            if (Math.abs(this.f11620c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f11622f.f11560a != this.f11621e.f11560a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f11620c = 1.0f;
        this.d = 1.0f;
        l lVar = l.f11559e;
        this.f11621e = lVar;
        this.f11622f = lVar;
        this.f11623g = lVar;
        this.h = lVar;
        ByteBuffer byteBuffer = n.f11564a;
        this.f11626k = byteBuffer;
        this.f11627l = byteBuffer.asShortBuffer();
        this.f11628m = byteBuffer;
        this.f11619b = -1;
        this.f11624i = false;
        this.f11625j = null;
        this.f11629n = 0L;
        this.f11630o = 0L;
        this.f11631p = false;
    }
}

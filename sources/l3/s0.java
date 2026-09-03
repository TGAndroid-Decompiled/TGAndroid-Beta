package l3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class s0 implements n {
    public int f11360b;
    public float f11361c;
    public float d;
    public l e;
    public l f11362f;
    public l f11363g;
    public l h;
    public boolean f11364i;
    public r0 f11365j;
    public ByteBuffer f11366k;
    public ShortBuffer f11367l;
    public ByteBuffer f11368m;
    public long f11369n;
    public long f11370o;
    public boolean f11371p;

    @Override
    public final ByteBuffer a() {
        r0 r0Var = this.f11365j;
        if (r0Var != null) {
            int i10 = r0Var.f11340b;
            int i11 = r0Var.f11348m * i10 * 2;
            if (i11 > 0) {
                if (this.f11366k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f11366k = order;
                    this.f11367l = order.asShortBuffer();
                } else {
                    this.f11366k.clear();
                    this.f11367l.clear();
                }
                ShortBuffer shortBuffer = this.f11367l;
                int min = Math.min(shortBuffer.remaining() / i10, r0Var.f11348m);
                int i12 = min * i10;
                shortBuffer.put(r0Var.f11347l, 0, i12);
                int i13 = r0Var.f11348m - min;
                r0Var.f11348m = i13;
                short[] sArr = r0Var.f11347l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f11370o += i11;
                this.f11366k.limit(i11);
                this.f11368m = this.f11366k;
            }
        }
        ByteBuffer byteBuffer = this.f11368m;
        this.f11368m = n.f11308a;
        return byteBuffer;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        r0 r0Var = this.f11365j;
        r0Var.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f11369n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = r0Var.f11340b;
        int i11 = remaining2 / i10;
        short[] c3 = r0Var.c(r0Var.f11345j, r0Var.f11346k, i11);
        r0Var.f11345j = c3;
        asShortBuffer.get(c3, r0Var.f11346k * i10, ((i11 * i10) * 2) / 2);
        r0Var.f11346k += i11;
        r0Var.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final void c() {
        r0 r0Var = this.f11365j;
        if (r0Var != null) {
            int i10 = r0Var.f11346k;
            float f10 = r0Var.f11341c;
            float f11 = r0Var.d;
            float f12 = r0Var.e * f11;
            int b10 = r0Var.f11348m + ((int) kf.k0.b(i10 / (f10 / f11), r0Var.f11350o, f12, 0.5f));
            short[] sArr = r0Var.f11345j;
            int i11 = r0Var.h * 2;
            r0Var.f11345j = r0Var.c(sArr, i10, i11 + i10);
            int i12 = 0;
            while (true) {
                int i13 = r0Var.f11340b;
                if (i12 >= i11 * i13) {
                    break;
                }
                r0Var.f11345j[(i13 * i10) + i12] = 0;
                i12++;
            }
            r0Var.f11346k = i11 + r0Var.f11346k;
            r0Var.f();
            if (r0Var.f11348m > b10) {
                r0Var.f11348m = b10;
            }
            r0Var.f11346k = 0;
            r0Var.f11353r = 0;
            r0Var.f11350o = 0;
        }
        this.f11371p = true;
    }

    @Override
    public final boolean d() {
        if (this.f11371p) {
            r0 r0Var = this.f11365j;
            if (r0Var == null || r0Var.f11348m * r0Var.f11340b * 2 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final l e(l lVar) {
        if (lVar.f11306c == 2) {
            int i10 = this.f11360b;
            if (i10 == -1) {
                i10 = lVar.f11304a;
            }
            this.e = lVar;
            l lVar2 = new l(i10, lVar.f11305b, 2);
            this.f11362f = lVar2;
            this.f11364i = true;
            return lVar2;
        }
        throw new m(lVar);
    }

    @Override
    public final void flush() {
        if (isActive()) {
            l lVar = this.e;
            this.f11363g = lVar;
            l lVar2 = this.f11362f;
            this.h = lVar2;
            if (this.f11364i) {
                this.f11365j = new r0(lVar.f11304a, this.f11361c, lVar.f11305b, this.d, lVar2.f11304a);
            } else {
                r0 r0Var = this.f11365j;
                if (r0Var != null) {
                    r0Var.f11346k = 0;
                    r0Var.f11348m = 0;
                    r0Var.f11350o = 0;
                    r0Var.f11351p = 0;
                    r0Var.f11352q = 0;
                    r0Var.f11353r = 0;
                    r0Var.f11354s = 0;
                    r0Var.f11355t = 0;
                    r0Var.f11356u = 0;
                    r0Var.v = 0;
                }
            }
        }
        this.f11368m = n.f11308a;
        this.f11369n = 0L;
        this.f11370o = 0L;
        this.f11371p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f11362f.f11304a != -1) {
            if (Math.abs(this.f11361c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f11362f.f11304a != this.e.f11304a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f11361c = 1.0f;
        this.d = 1.0f;
        l lVar = l.e;
        this.e = lVar;
        this.f11362f = lVar;
        this.f11363g = lVar;
        this.h = lVar;
        ByteBuffer byteBuffer = n.f11308a;
        this.f11366k = byteBuffer;
        this.f11367l = byteBuffer.asShortBuffer();
        this.f11368m = byteBuffer;
        this.f11360b = -1;
        this.f11364i = false;
        this.f11365j = null;
        this.f11369n = 0L;
        this.f11370o = 0L;
        this.f11371p = false;
    }
}

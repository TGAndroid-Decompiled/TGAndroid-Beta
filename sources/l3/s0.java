package l3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
import kh.a2;
public final class s0 implements n {
    public int f11250b;
    public float f11251c;
    public float d;
    public l e;
    public l f11252f;
    public l f11253g;
    public l h;
    public boolean f11254i;
    public r0 f11255j;
    public ByteBuffer f11256k;
    public ShortBuffer f11257l;
    public ByteBuffer f11258m;
    public long f11259n;
    public long f11260o;
    public boolean f11261p;

    @Override
    public final ByteBuffer a() {
        r0 r0Var = this.f11255j;
        if (r0Var != null) {
            int i10 = r0Var.f11230b;
            int i11 = r0Var.f11238m * i10 * 2;
            if (i11 > 0) {
                if (this.f11256k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f11256k = order;
                    this.f11257l = order.asShortBuffer();
                } else {
                    this.f11256k.clear();
                    this.f11257l.clear();
                }
                ShortBuffer shortBuffer = this.f11257l;
                int min = Math.min(shortBuffer.remaining() / i10, r0Var.f11238m);
                int i12 = min * i10;
                shortBuffer.put(r0Var.f11237l, 0, i12);
                int i13 = r0Var.f11238m - min;
                r0Var.f11238m = i13;
                short[] sArr = r0Var.f11237l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f11260o += i11;
                this.f11256k.limit(i11);
                this.f11258m = this.f11256k;
            }
        }
        ByteBuffer byteBuffer = this.f11258m;
        this.f11258m = n.f11198a;
        return byteBuffer;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        r0 r0Var = this.f11255j;
        r0Var.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f11259n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = r0Var.f11230b;
        int i11 = remaining2 / i10;
        short[] c3 = r0Var.c(r0Var.f11235j, r0Var.f11236k, i11);
        r0Var.f11235j = c3;
        asShortBuffer.get(c3, r0Var.f11236k * i10, ((i11 * i10) * 2) / 2);
        r0Var.f11236k += i11;
        r0Var.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final void c() {
        r0 r0Var = this.f11255j;
        if (r0Var != null) {
            int i10 = r0Var.f11236k;
            float f10 = r0Var.f11231c;
            float f11 = r0Var.d;
            float f12 = r0Var.e * f11;
            int b10 = r0Var.f11238m + ((int) a2.b(i10 / (f10 / f11), r0Var.f11240o, f12, 0.5f));
            short[] sArr = r0Var.f11235j;
            int i11 = r0Var.h * 2;
            r0Var.f11235j = r0Var.c(sArr, i10, i11 + i10);
            int i12 = 0;
            while (true) {
                int i13 = r0Var.f11230b;
                if (i12 >= i11 * i13) {
                    break;
                }
                r0Var.f11235j[(i13 * i10) + i12] = 0;
                i12++;
            }
            r0Var.f11236k = i11 + r0Var.f11236k;
            r0Var.f();
            if (r0Var.f11238m > b10) {
                r0Var.f11238m = b10;
            }
            r0Var.f11236k = 0;
            r0Var.f11243r = 0;
            r0Var.f11240o = 0;
        }
        this.f11261p = true;
    }

    @Override
    public final boolean d() {
        if (this.f11261p) {
            r0 r0Var = this.f11255j;
            if (r0Var == null || r0Var.f11238m * r0Var.f11230b * 2 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final l e(l lVar) {
        if (lVar.f11196c == 2) {
            int i10 = this.f11250b;
            if (i10 == -1) {
                i10 = lVar.f11194a;
            }
            this.e = lVar;
            l lVar2 = new l(i10, lVar.f11195b, 2);
            this.f11252f = lVar2;
            this.f11254i = true;
            return lVar2;
        }
        throw new m(lVar);
    }

    @Override
    public final void flush() {
        if (isActive()) {
            l lVar = this.e;
            this.f11253g = lVar;
            l lVar2 = this.f11252f;
            this.h = lVar2;
            if (this.f11254i) {
                this.f11255j = new r0(lVar.f11194a, this.f11251c, lVar.f11195b, this.d, lVar2.f11194a);
            } else {
                r0 r0Var = this.f11255j;
                if (r0Var != null) {
                    r0Var.f11236k = 0;
                    r0Var.f11238m = 0;
                    r0Var.f11240o = 0;
                    r0Var.f11241p = 0;
                    r0Var.f11242q = 0;
                    r0Var.f11243r = 0;
                    r0Var.f11244s = 0;
                    r0Var.f11245t = 0;
                    r0Var.f11246u = 0;
                    r0Var.v = 0;
                }
            }
        }
        this.f11258m = n.f11198a;
        this.f11259n = 0L;
        this.f11260o = 0L;
        this.f11261p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f11252f.f11194a != -1) {
            if (Math.abs(this.f11251c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f11252f.f11194a != this.e.f11194a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f11251c = 1.0f;
        this.d = 1.0f;
        l lVar = l.e;
        this.e = lVar;
        this.f11252f = lVar;
        this.f11253g = lVar;
        this.h = lVar;
        ByteBuffer byteBuffer = n.f11198a;
        this.f11256k = byteBuffer;
        this.f11257l = byteBuffer.asShortBuffer();
        this.f11258m = byteBuffer;
        this.f11250b = -1;
        this.f11254i = false;
        this.f11255j = null;
        this.f11259n = 0L;
        this.f11260o = 0L;
        this.f11261p = false;
    }
}

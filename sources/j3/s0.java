package j3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class s0 implements j {
    public int f13337b;
    public float f13338c;
    public float d;
    public h f13339e;
    public h f13340f;
    public h f13341g;
    public h h;
    public boolean f13342i;
    public q0 f13343j;
    public ByteBuffer f13344k;
    public ShortBuffer f13345l;
    public ByteBuffer f13346m;
    public long f13347n;
    public long f13348o;
    public boolean f13349p;

    @Override
    public final ByteBuffer a() {
        q0 q0Var = this.f13343j;
        if (q0Var != null) {
            int i9 = q0Var.f13316b;
            int i10 = q0Var.f13325m * i9 * 2;
            if (i10 > 0) {
                if (this.f13344k.capacity() < i10) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i10).order(ByteOrder.nativeOrder());
                    this.f13344k = order;
                    this.f13345l = order.asShortBuffer();
                } else {
                    this.f13344k.clear();
                    this.f13345l.clear();
                }
                ShortBuffer shortBuffer = this.f13345l;
                int min = Math.min(shortBuffer.remaining() / i9, q0Var.f13325m);
                int i11 = min * i9;
                shortBuffer.put(q0Var.f13324l, 0, i11);
                int i12 = q0Var.f13325m - min;
                q0Var.f13325m = i12;
                short[] sArr = q0Var.f13324l;
                System.arraycopy(sArr, i11, sArr, 0, i12 * i9);
                this.f13348o += i10;
                this.f13344k.limit(i10);
                this.f13346m = this.f13344k;
            }
        }
        ByteBuffer byteBuffer = this.f13346m;
        this.f13346m = j.f13282a;
        return byteBuffer;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        q0 q0Var = this.f13343j;
        q0Var.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f13347n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i9 = q0Var.f13316b;
        int i10 = remaining2 / i9;
        short[] c10 = q0Var.c(q0Var.f13322j, q0Var.f13323k, i10);
        q0Var.f13322j = c10;
        asShortBuffer.get(c10, q0Var.f13323k * i9, ((i10 * i9) * 2) / 2);
        q0Var.f13323k += i10;
        q0Var.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final void c() {
        q0 q0Var = this.f13343j;
        if (q0Var != null) {
            int i9 = q0Var.f13323k;
            float f10 = q0Var.f13317c;
            float f11 = q0Var.d;
            float f12 = q0Var.f13318e * f11;
            int c10 = q0Var.f13325m + ((int) r0.c(i9 / (f10 / f11), q0Var.f13327o, f12, 0.5f));
            short[] sArr = q0Var.f13322j;
            int i10 = q0Var.h * 2;
            q0Var.f13322j = q0Var.c(sArr, i9, i10 + i9);
            int i11 = 0;
            while (true) {
                int i12 = q0Var.f13316b;
                if (i11 >= i10 * i12) {
                    break;
                }
                q0Var.f13322j[(i12 * i9) + i11] = 0;
                i11++;
            }
            q0Var.f13323k = i10 + q0Var.f13323k;
            q0Var.f();
            if (q0Var.f13325m > c10) {
                q0Var.f13325m = c10;
            }
            q0Var.f13323k = 0;
            q0Var.f13330r = 0;
            q0Var.f13327o = 0;
        }
        this.f13349p = true;
    }

    @Override
    public final boolean d() {
        if (this.f13349p) {
            q0 q0Var = this.f13343j;
            if (q0Var == null || q0Var.f13325m * q0Var.f13316b * 2 == 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final h e(h hVar) {
        if (hVar.f13249c == 2) {
            int i9 = this.f13337b;
            if (i9 == -1) {
                i9 = hVar.f13247a;
            }
            this.f13339e = hVar;
            h hVar2 = new h(i9, hVar.f13248b, 2);
            this.f13340f = hVar2;
            this.f13342i = true;
            return hVar2;
        }
        throw new i(hVar);
    }

    @Override
    public final void flush() {
        if (isActive()) {
            h hVar = this.f13339e;
            this.f13341g = hVar;
            h hVar2 = this.f13340f;
            this.h = hVar2;
            if (this.f13342i) {
                this.f13343j = new q0(hVar.f13247a, this.f13338c, hVar.f13248b, this.d, hVar2.f13247a);
            } else {
                q0 q0Var = this.f13343j;
                if (q0Var != null) {
                    q0Var.f13323k = 0;
                    q0Var.f13325m = 0;
                    q0Var.f13327o = 0;
                    q0Var.f13328p = 0;
                    q0Var.f13329q = 0;
                    q0Var.f13330r = 0;
                    q0Var.f13331s = 0;
                    q0Var.f13332t = 0;
                    q0Var.f13333u = 0;
                    q0Var.v = 0;
                }
            }
        }
        this.f13346m = j.f13282a;
        this.f13347n = 0L;
        this.f13348o = 0L;
        this.f13349p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f13340f.f13247a != -1) {
            if (Math.abs(this.f13338c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f13340f.f13247a != this.f13339e.f13247a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f13338c = 1.0f;
        this.d = 1.0f;
        h hVar = h.f13246e;
        this.f13339e = hVar;
        this.f13340f = hVar;
        this.f13341g = hVar;
        this.h = hVar;
        ByteBuffer byteBuffer = j.f13282a;
        this.f13344k = byteBuffer;
        this.f13345l = byteBuffer.asShortBuffer();
        this.f13346m = byteBuffer;
        this.f13337b = -1;
        this.f13342i = false;
        this.f13343j = null;
        this.f13347n = 0L;
        this.f13348o = 0L;
        this.f13349p = false;
    }
}

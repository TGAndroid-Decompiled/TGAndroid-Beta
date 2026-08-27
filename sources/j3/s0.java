package j3;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class s0 implements j {

    public int f12437b;

    public float f12438c;
    public float d;

    public h f12439e;

    public h f12440f;

    public h f12441g;
    public h h;

    public boolean f12442i;

    public r0 f12443j;

    public ByteBuffer f12444k;

    public ShortBuffer f12445l;

    public ByteBuffer f12446m;

    public long f12447n;

    public long f12448o;

    public boolean f12449p;

    @Override
    public final ByteBuffer a() {
        r0 r0Var = this.f12443j;
        if (r0Var != null) {
            int i10 = r0Var.f12416b;
            int i11 = r0Var.f12425m * i10 * 2;
            if (i11 > 0) {
                if (this.f12444k.capacity() < i11) {
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f12444k = byteBufferOrder;
                    this.f12445l = byteBufferOrder.asShortBuffer();
                } else {
                    this.f12444k.clear();
                    this.f12445l.clear();
                }
                ShortBuffer shortBuffer = this.f12445l;
                int iMin = Math.min(shortBuffer.remaining() / i10, r0Var.f12425m);
                int i12 = iMin * i10;
                shortBuffer.put(r0Var.f12424l, 0, i12);
                int i13 = r0Var.f12425m - iMin;
                r0Var.f12425m = i13;
                short[] sArr = r0Var.f12424l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f12448o += (long) i11;
                this.f12444k.limit(i11);
                this.f12446m = this.f12444k;
            }
        }
        ByteBuffer byteBuffer = this.f12446m;
        this.f12446m = j.f12350a;
        return byteBuffer;
    }

    @Override
    public final void b(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            r0 r0Var = this.f12443j;
            r0Var.getClass();
            ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.f12447n += (long) iRemaining;
            int iRemaining2 = shortBufferAsShortBuffer.remaining();
            int i10 = r0Var.f12416b;
            int i11 = iRemaining2 / i10;
            short[] sArrC = r0Var.c(r0Var.f12422j, r0Var.f12423k, i11);
            r0Var.f12422j = sArrC;
            shortBufferAsShortBuffer.get(sArrC, r0Var.f12423k * i10, ((i11 * i10) * 2) / 2);
            r0Var.f12423k += i11;
            r0Var.f();
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override
    public final void c() {
        r0 r0Var = this.f12443j;
        if (r0Var != null) {
            int i10 = r0Var.f12423k;
            float f10 = r0Var.f12417c;
            float f11 = r0Var.d;
            int iC = r0Var.f12425m + ((int) i0.a.c(i10 / (f10 / f11), r0Var.f12427o, r0Var.f12418e * f11, 0.5f));
            short[] sArr = r0Var.f12422j;
            int i11 = r0Var.h * 2;
            r0Var.f12422j = r0Var.c(sArr, i10, i11 + i10);
            int i12 = 0;
            while (true) {
                int i13 = r0Var.f12416b;
                if (i12 >= i11 * i13) {
                    break;
                }
                r0Var.f12422j[(i13 * i10) + i12] = 0;
                i12++;
            }
            r0Var.f12423k = i11 + r0Var.f12423k;
            r0Var.f();
            if (r0Var.f12425m > iC) {
                r0Var.f12425m = iC;
            }
            r0Var.f12423k = 0;
            r0Var.f12430r = 0;
            r0Var.f12427o = 0;
        }
        this.f12449p = true;
    }

    @Override
    public final boolean d() {
        if (!this.f12449p) {
            return false;
        }
        r0 r0Var = this.f12443j;
        return r0Var == null || (r0Var.f12425m * r0Var.f12416b) * 2 == 0;
    }

    @Override
    public final h e(h hVar) throws i {
        if (hVar.f12345c != 2) {
            throw new i(hVar);
        }
        int i10 = this.f12437b;
        if (i10 == -1) {
            i10 = hVar.f12343a;
        }
        this.f12439e = hVar;
        h hVar2 = new h(i10, hVar.f12344b, 2);
        this.f12440f = hVar2;
        this.f12442i = true;
        return hVar2;
    }

    @Override
    public final void flush() {
        if (isActive()) {
            h hVar = this.f12439e;
            this.f12441g = hVar;
            h hVar2 = this.f12440f;
            this.h = hVar2;
            if (this.f12442i) {
                this.f12443j = new r0(hVar.f12343a, this.f12438c, hVar.f12344b, this.d, hVar2.f12343a);
            } else {
                r0 r0Var = this.f12443j;
                if (r0Var != null) {
                    r0Var.f12423k = 0;
                    r0Var.f12425m = 0;
                    r0Var.f12427o = 0;
                    r0Var.f12428p = 0;
                    r0Var.f12429q = 0;
                    r0Var.f12430r = 0;
                    r0Var.f12431s = 0;
                    r0Var.f12432t = 0;
                    r0Var.f12433u = 0;
                    r0Var.v = 0;
                }
            }
        }
        this.f12446m = j.f12350a;
        this.f12447n = 0L;
        this.f12448o = 0L;
        this.f12449p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f12440f.f12343a != -1) {
            return Math.abs(this.f12438c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f12440f.f12343a != this.f12439e.f12343a;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f12438c = 1.0f;
        this.d = 1.0f;
        h hVar = h.f12342e;
        this.f12439e = hVar;
        this.f12440f = hVar;
        this.f12441g = hVar;
        this.h = hVar;
        ByteBuffer byteBuffer = j.f12350a;
        this.f12444k = byteBuffer;
        this.f12445l = byteBuffer.asShortBuffer();
        this.f12446m = byteBuffer;
        this.f12437b = -1;
        this.f12442i = false;
        this.f12443j = null;
        this.f12447n = 0L;
        this.f12448o = 0L;
        this.f12449p = false;
    }
}

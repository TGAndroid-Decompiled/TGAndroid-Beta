package c2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;
public final class k implements h {
    public int f4036b;
    public float f4037c;
    public float d;
    public f f4038e;
    public f f4039f;
    public f f4040g;
    public f h;
    public boolean f4041i;
    public j f4042j;
    public ByteBuffer f4043k;
    public ShortBuffer f4044l;
    public ByteBuffer f4045m;
    public long f4046n;
    public long f4047o;
    public boolean f4048p;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        j jVar = this.f4042j;
        if (jVar != null) {
            int i10 = jVar.f4017b;
            boolean z11 = true;
            if (jVar.f4026m >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            e2.d.g(z10);
            int i11 = jVar.f4026m * i10 * 2;
            if (i11 > 0) {
                if (this.f4043k.capacity() < i11) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i11).order(ByteOrder.nativeOrder());
                    this.f4043k = order;
                    this.f4044l = order.asShortBuffer();
                } else {
                    this.f4043k.clear();
                    this.f4044l.clear();
                }
                ShortBuffer shortBuffer = this.f4044l;
                if (jVar.f4026m < 0) {
                    z11 = false;
                }
                e2.d.g(z11);
                int min = Math.min(shortBuffer.remaining() / i10, jVar.f4026m);
                int i12 = min * i10;
                shortBuffer.put(jVar.f4025l, 0, i12);
                int i13 = jVar.f4026m - min;
                jVar.f4026m = i13;
                short[] sArr = jVar.f4025l;
                System.arraycopy(sArr, i12, sArr, 0, i13 * i10);
                this.f4047o += i11;
                this.f4043k.limit(i11);
                this.f4045m = this.f4043k;
            }
        }
        ByteBuffer byteBuffer = this.f4045m;
        this.f4045m = h.f4010a;
        return byteBuffer;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f4048p) {
            j jVar = this.f4042j;
            if (jVar != null) {
                if (jVar.f4026m >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                e2.d.g(z10);
                if (jVar.f4026m * jVar.f4017b * 2 == 0) {
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
        j jVar = this.f4042j;
        jVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f4046n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = jVar.f4017b;
        int i11 = remaining2 / i10;
        short[] c10 = jVar.c(jVar.f4023j, jVar.f4024k, i11);
        jVar.f4023j = c10;
        asShortBuffer.get(c10, jVar.f4024k * i10, ((i11 * i10) * 2) / 2);
        jVar.f4024k += i11;
        jVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override
    public final f d(f fVar) {
        if (fVar.f4009c == 2) {
            int i10 = this.f4036b;
            if (i10 == -1) {
                i10 = fVar.f4007a;
            }
            this.f4038e = fVar;
            f fVar2 = new f(i10, fVar.f4008b, 2);
            this.f4039f = fVar2;
            this.f4041i = true;
            return fVar2;
        }
        throw new g(fVar);
    }

    @Override
    public final void e() {
        int i10;
        j jVar = this.f4042j;
        if (jVar != null) {
            int i11 = jVar.f4024k;
            float f7 = jVar.f4018c;
            float f10 = jVar.d;
            int i12 = jVar.f4026m + ((int) (((((((i11 - i10) / (f7 / f10)) + jVar.f4031r) + jVar.f4035w) + jVar.f4028o) / (jVar.f4019e * f10)) + 0.5d));
            jVar.f4035w = 0.0d;
            short[] sArr = jVar.f4023j;
            int i13 = jVar.h * 2;
            jVar.f4023j = jVar.c(sArr, i11, i13 + i11);
            int i14 = 0;
            while (true) {
                int i15 = jVar.f4017b;
                if (i14 >= i13 * i15) {
                    break;
                }
                jVar.f4023j[(i15 * i11) + i14] = 0;
                i14++;
            }
            jVar.f4024k = i13 + jVar.f4024k;
            jVar.f();
            if (jVar.f4026m > i12) {
                jVar.f4026m = Math.max(i12, 0);
            }
            jVar.f4024k = 0;
            jVar.f4031r = 0;
            jVar.f4028o = 0;
        }
        this.f4048p = true;
    }

    @Override
    public final void flush() {
        if (isActive()) {
            f fVar = this.f4038e;
            this.f4040g = fVar;
            f fVar2 = this.f4039f;
            this.h = fVar2;
            if (this.f4041i) {
                this.f4042j = new j(fVar.f4007a, this.f4037c, fVar.f4008b, this.d, fVar2.f4007a);
            } else {
                j jVar = this.f4042j;
                if (jVar != null) {
                    jVar.f4024k = 0;
                    jVar.f4026m = 0;
                    jVar.f4028o = 0;
                    jVar.f4029p = 0;
                    jVar.f4030q = 0;
                    jVar.f4031r = 0;
                    jVar.f4032s = 0;
                    jVar.f4033t = 0;
                    jVar.f4034u = 0;
                    jVar.v = 0;
                    jVar.f4035w = 0.0d;
                }
            }
        }
        this.f4045m = h.f4010a;
        this.f4046n = 0L;
        this.f4047o = 0L;
        this.f4048p = false;
    }

    @Override
    public final boolean isActive() {
        if (this.f4039f.f4007a != -1) {
            if (Math.abs(this.f4037c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f4039f.f4007a != this.f4038e.f4007a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f4037c = 1.0f;
        this.d = 1.0f;
        f fVar = f.f4006e;
        this.f4038e = fVar;
        this.f4039f = fVar;
        this.f4040g = fVar;
        this.h = fVar;
        ByteBuffer byteBuffer = h.f4010a;
        this.f4043k = byteBuffer;
        this.f4044l = byteBuffer.asShortBuffer();
        this.f4045m = byteBuffer;
        this.f4036b = -1;
        this.f4041i = false;
        this.f4042j = null;
        this.f4046n = 0L;
        this.f4047o = 0L;
        this.f4048p = false;
    }
}

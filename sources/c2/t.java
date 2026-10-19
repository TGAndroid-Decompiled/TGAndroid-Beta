package c2;

import e2.m0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v7.u6;
public final class t implements n {
    public int f4547b;
    public float f4548c;
    public float d;
    public k e;
    public k f4549f;
    public k f4550g;
    public k h;
    public boolean f4551i;
    public s f4552j;
    public ByteBuffer f4553k;
    public ByteBuffer f4554l;
    public long f4555m;
    public long f4556n;
    public boolean f4557o;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        s sVar = this.f4552j;
        if (sVar != null) {
            q qVar = sVar.f4538i;
            int i10 = sVar.f4534b;
            boolean z11 = true;
            if (sVar.f4540k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            int o10 = qVar.o() * sVar.f4540k * i10;
            if (o10 > 0) {
                if (this.f4553k.capacity() < o10) {
                    this.f4553k = ByteBuffer.allocateDirect(o10).order(ByteOrder.nativeOrder());
                } else {
                    this.f4553k.clear();
                }
                ByteBuffer byteBuffer = this.f4553k;
                if (sVar.f4540k < 0) {
                    z11 = false;
                }
                u6.p(z11);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i10), sVar.f4540k);
                qVar.b(min, byteBuffer);
                sVar.f4540k -= min;
                System.arraycopy(qVar.i(), min * i10, qVar.i(), 0, sVar.f4540k * i10);
                this.f4553k.flip();
                this.f4556n += o10;
                this.f4554l = this.f4553k;
            }
        }
        ByteBuffer byteBuffer2 = this.f4554l;
        this.f4554l = n.f4518a;
        return byteBuffer2;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f4557o) {
            s sVar = this.f4552j;
            if (sVar != null) {
                if (sVar.f4540k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.p(z10);
                if (sVar.f4538i.o() * sVar.f4540k * sVar.f4534b == 0) {
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
        s sVar = this.f4552j;
        sVar.getClass();
        this.f4555m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i10 = sVar.f4534b;
        q qVar = sVar.f4538i;
        int o10 = remaining / (qVar.o() * i10);
        qVar.p(o10);
        qVar.a(remaining, byteBuffer);
        sVar.f4539j += o10;
        sVar.b();
    }

    @Override
    public final void d(l lVar) {
        boolean z10;
        if (isActive()) {
            k kVar = this.e;
            this.f4550g = kVar;
            k kVar2 = this.f4549f;
            this.h = kVar2;
            if (this.f4551i) {
                int i10 = kVar.f4513a;
                int i11 = kVar.f4514b;
                float f7 = this.f4548c;
                float f10 = this.d;
                int i12 = kVar2.f4513a;
                if (kVar.f4515c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f4552j = new s(i10, i11, f7, f10, i12, z10);
            } else {
                s sVar = this.f4552j;
                if (sVar != null) {
                    sVar.f4539j = 0;
                    sVar.f4540k = 0;
                    sVar.f4541l = 0;
                    sVar.f4542m = 0;
                    sVar.f4543n = 0;
                    sVar.f4544o = 0;
                    sVar.f4545p = 0;
                    sVar.f4546q = 0.0d;
                    sVar.f4538i.flush();
                }
            }
        }
        this.f4554l = n.f4518a;
        this.f4555m = 0L;
        this.f4556n = 0L;
        this.f4557o = false;
    }

    @Override
    public final k e(k kVar) {
        int i10 = kVar.f4515c;
        if (i10 != 2 && i10 != 4) {
            throw new m(kVar);
        }
        int i11 = this.f4547b;
        if (i11 == -1) {
            i11 = kVar.f4513a;
        }
        this.e = kVar;
        k kVar2 = new k(i11, kVar.f4514b, i10);
        this.f4549f = kVar2;
        this.f4551i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        s sVar = this.f4552j;
        if (sVar != null) {
            int i10 = sVar.f4539j;
            float f7 = sVar.f4535c;
            float f10 = sVar.d;
            int i11 = sVar.f4544o;
            int i12 = sVar.f4540k + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + sVar.f4546q) + sVar.f4541l) / (sVar.e * f10)) + 0.5d));
            sVar.f4546q = 0.0d;
            q qVar = sVar.f4538i;
            int i13 = sVar.h * 2;
            qVar.p(i13 + i10);
            qVar.d(i10 * sVar.f4534b, i13);
            sVar.f4539j = i13 + sVar.f4539j;
            sVar.b();
            if (sVar.f4540k > i12) {
                sVar.f4540k = Math.max(i12, 0);
            }
            sVar.f4539j = 0;
            sVar.f4544o = 0;
            sVar.f4541l = 0;
        }
        this.f4557o = true;
    }

    @Override
    public final long g(long j10) {
        if (this.f4556n >= 1024) {
            long j11 = this.f4555m;
            s sVar = this.f4552j;
            sVar.getClass();
            long o10 = j11 - (sVar.f4538i.o() * (sVar.f4539j * sVar.f4534b));
            int i10 = this.h.f4513a;
            int i11 = this.f4550g.f4513a;
            if (i10 == i11) {
                return m0.a0(j10, this.f4556n, o10, RoundingMode.DOWN);
            }
            return m0.a0(j10, this.f4556n * i11, o10 * i10, RoundingMode.DOWN);
        }
        return (long) (j10 / this.f4548c);
    }

    @Override
    public final boolean isActive() {
        if (this.f4549f.f4513a != -1) {
            if (Math.abs(this.f4548c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f4549f.f4513a != this.e.f4513a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f4548c = 1.0f;
        this.d = 1.0f;
        k kVar = k.e;
        this.e = kVar;
        this.f4549f = kVar;
        this.f4550g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.f4518a;
        this.f4553k = byteBuffer;
        this.f4554l = byteBuffer;
        this.f4547b = -1;
        this.f4551i = false;
        this.f4552j = null;
        this.f4555m = 0L;
        this.f4556n = 0L;
        this.f4557o = false;
    }
}

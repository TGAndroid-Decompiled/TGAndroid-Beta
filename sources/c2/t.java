package c2;

import e2.m0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v7.u6;
public final class t implements n {
    public int f4551b;
    public float f4552c;
    public float d;
    public k e;
    public k f4553f;
    public k f4554g;
    public k h;
    public boolean f4555i;
    public s f4556j;
    public ByteBuffer f4557k;
    public ByteBuffer f4558l;
    public long f4559m;
    public long f4560n;
    public boolean f4561o;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        s sVar = this.f4556j;
        if (sVar != null) {
            q qVar = sVar.f4542i;
            int i10 = sVar.f4538b;
            boolean z11 = true;
            if (sVar.f4544k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            int o10 = qVar.o() * sVar.f4544k * i10;
            if (o10 > 0) {
                if (this.f4557k.capacity() < o10) {
                    this.f4557k = ByteBuffer.allocateDirect(o10).order(ByteOrder.nativeOrder());
                } else {
                    this.f4557k.clear();
                }
                ByteBuffer byteBuffer = this.f4557k;
                if (sVar.f4544k < 0) {
                    z11 = false;
                }
                u6.p(z11);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i10), sVar.f4544k);
                qVar.b(min, byteBuffer);
                sVar.f4544k -= min;
                System.arraycopy(qVar.i(), min * i10, qVar.i(), 0, sVar.f4544k * i10);
                this.f4557k.flip();
                this.f4560n += o10;
                this.f4558l = this.f4557k;
            }
        }
        ByteBuffer byteBuffer2 = this.f4558l;
        this.f4558l = n.f4522a;
        return byteBuffer2;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f4561o) {
            s sVar = this.f4556j;
            if (sVar != null) {
                if (sVar.f4544k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.p(z10);
                if (sVar.f4542i.o() * sVar.f4544k * sVar.f4538b == 0) {
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
        s sVar = this.f4556j;
        sVar.getClass();
        this.f4559m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i10 = sVar.f4538b;
        q qVar = sVar.f4542i;
        int o10 = remaining / (qVar.o() * i10);
        qVar.p(o10);
        qVar.a(remaining, byteBuffer);
        sVar.f4543j += o10;
        sVar.b();
    }

    @Override
    public final void d(l lVar) {
        boolean z10;
        if (isActive()) {
            k kVar = this.e;
            this.f4554g = kVar;
            k kVar2 = this.f4553f;
            this.h = kVar2;
            if (this.f4555i) {
                int i10 = kVar.f4517a;
                int i11 = kVar.f4518b;
                float f7 = this.f4552c;
                float f10 = this.d;
                int i12 = kVar2.f4517a;
                if (kVar.f4519c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f4556j = new s(i10, i11, f7, f10, i12, z10);
            } else {
                s sVar = this.f4556j;
                if (sVar != null) {
                    sVar.f4543j = 0;
                    sVar.f4544k = 0;
                    sVar.f4545l = 0;
                    sVar.f4546m = 0;
                    sVar.f4547n = 0;
                    sVar.f4548o = 0;
                    sVar.f4549p = 0;
                    sVar.f4550q = 0.0d;
                    sVar.f4542i.flush();
                }
            }
        }
        this.f4558l = n.f4522a;
        this.f4559m = 0L;
        this.f4560n = 0L;
        this.f4561o = false;
    }

    @Override
    public final k e(k kVar) {
        int i10 = kVar.f4519c;
        if (i10 != 2 && i10 != 4) {
            throw new m(kVar);
        }
        int i11 = this.f4551b;
        if (i11 == -1) {
            i11 = kVar.f4517a;
        }
        this.e = kVar;
        k kVar2 = new k(i11, kVar.f4518b, i10);
        this.f4553f = kVar2;
        this.f4555i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        s sVar = this.f4556j;
        if (sVar != null) {
            int i10 = sVar.f4543j;
            float f7 = sVar.f4539c;
            float f10 = sVar.d;
            int i11 = sVar.f4548o;
            int i12 = sVar.f4544k + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + sVar.f4550q) + sVar.f4545l) / (sVar.e * f10)) + 0.5d));
            sVar.f4550q = 0.0d;
            q qVar = sVar.f4542i;
            int i13 = sVar.h * 2;
            qVar.p(i13 + i10);
            qVar.d(i10 * sVar.f4538b, i13);
            sVar.f4543j = i13 + sVar.f4543j;
            sVar.b();
            if (sVar.f4544k > i12) {
                sVar.f4544k = Math.max(i12, 0);
            }
            sVar.f4543j = 0;
            sVar.f4548o = 0;
            sVar.f4545l = 0;
        }
        this.f4561o = true;
    }

    @Override
    public final long g(long j10) {
        if (this.f4560n >= 1024) {
            long j11 = this.f4559m;
            s sVar = this.f4556j;
            sVar.getClass();
            long o10 = j11 - (sVar.f4542i.o() * (sVar.f4543j * sVar.f4538b));
            int i10 = this.h.f4517a;
            int i11 = this.f4554g.f4517a;
            if (i10 == i11) {
                return m0.a0(j10, this.f4560n, o10, RoundingMode.DOWN);
            }
            return m0.a0(j10, this.f4560n * i11, o10 * i10, RoundingMode.DOWN);
        }
        return (long) (j10 / this.f4552c);
    }

    @Override
    public final boolean isActive() {
        if (this.f4553f.f4517a != -1) {
            if (Math.abs(this.f4552c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f4553f.f4517a != this.e.f4517a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f4552c = 1.0f;
        this.d = 1.0f;
        k kVar = k.e;
        this.e = kVar;
        this.f4553f = kVar;
        this.f4554g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.f4522a;
        this.f4557k = byteBuffer;
        this.f4558l = byteBuffer;
        this.f4551b = -1;
        this.f4555i = false;
        this.f4556j = null;
        this.f4559m = 0L;
        this.f4560n = 0L;
        this.f4561o = false;
    }
}

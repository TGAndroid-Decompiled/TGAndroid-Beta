package c2;

import e2.m0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v7.u6;
public final class t implements n {
    public int f4180b;
    public float f4181c;
    public float d;
    public k e;
    public k f4182f;
    public k f4183g;
    public k h;
    public boolean f4184i;
    public s f4185j;
    public ByteBuffer f4186k;
    public ByteBuffer f4187l;
    public long f4188m;
    public long f4189n;
    public boolean f4190o;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        s sVar = this.f4185j;
        if (sVar != null) {
            q qVar = sVar.f4171i;
            int i10 = sVar.f4167b;
            boolean z11 = true;
            if (sVar.f4173k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            int o10 = qVar.o() * sVar.f4173k * i10;
            if (o10 > 0) {
                if (this.f4186k.capacity() < o10) {
                    this.f4186k = ByteBuffer.allocateDirect(o10).order(ByteOrder.nativeOrder());
                } else {
                    this.f4186k.clear();
                }
                ByteBuffer byteBuffer = this.f4186k;
                if (sVar.f4173k < 0) {
                    z11 = false;
                }
                u6.p(z11);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i10), sVar.f4173k);
                qVar.b(min, byteBuffer);
                sVar.f4173k -= min;
                System.arraycopy(qVar.i(), min * i10, qVar.i(), 0, sVar.f4173k * i10);
                this.f4186k.flip();
                this.f4189n += o10;
                this.f4187l = this.f4186k;
            }
        }
        ByteBuffer byteBuffer2 = this.f4187l;
        this.f4187l = n.f4151a;
        return byteBuffer2;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f4190o) {
            s sVar = this.f4185j;
            if (sVar != null) {
                if (sVar.f4173k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.p(z10);
                if (sVar.f4171i.o() * sVar.f4173k * sVar.f4167b == 0) {
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
        s sVar = this.f4185j;
        sVar.getClass();
        this.f4188m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i10 = sVar.f4167b;
        q qVar = sVar.f4171i;
        int o10 = remaining / (qVar.o() * i10);
        qVar.p(o10);
        qVar.a(remaining, byteBuffer);
        sVar.f4172j += o10;
        sVar.b();
    }

    @Override
    public final void d(l lVar) {
        boolean z10;
        if (isActive()) {
            k kVar = this.e;
            this.f4183g = kVar;
            k kVar2 = this.f4182f;
            this.h = kVar2;
            if (this.f4184i) {
                int i10 = kVar.f4146a;
                int i11 = kVar.f4147b;
                float f7 = this.f4181c;
                float f10 = this.d;
                int i12 = kVar2.f4146a;
                if (kVar.f4148c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f4185j = new s(i10, i11, f7, f10, i12, z10);
            } else {
                s sVar = this.f4185j;
                if (sVar != null) {
                    sVar.f4172j = 0;
                    sVar.f4173k = 0;
                    sVar.f4174l = 0;
                    sVar.f4175m = 0;
                    sVar.f4176n = 0;
                    sVar.f4177o = 0;
                    sVar.f4178p = 0;
                    sVar.f4179q = 0.0d;
                    sVar.f4171i.flush();
                }
            }
        }
        this.f4187l = n.f4151a;
        this.f4188m = 0L;
        this.f4189n = 0L;
        this.f4190o = false;
    }

    @Override
    public final k e(k kVar) {
        int i10 = kVar.f4148c;
        if (i10 != 2 && i10 != 4) {
            throw new m(kVar);
        }
        int i11 = this.f4180b;
        if (i11 == -1) {
            i11 = kVar.f4146a;
        }
        this.e = kVar;
        k kVar2 = new k(i11, kVar.f4147b, i10);
        this.f4182f = kVar2;
        this.f4184i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        s sVar = this.f4185j;
        if (sVar != null) {
            int i10 = sVar.f4172j;
            float f7 = sVar.f4168c;
            float f10 = sVar.d;
            int i11 = sVar.f4177o;
            int i12 = sVar.f4173k + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + sVar.f4179q) + sVar.f4174l) / (sVar.e * f10)) + 0.5d));
            sVar.f4179q = 0.0d;
            q qVar = sVar.f4171i;
            int i13 = sVar.h * 2;
            qVar.p(i13 + i10);
            qVar.d(i10 * sVar.f4167b, i13);
            sVar.f4172j = i13 + sVar.f4172j;
            sVar.b();
            if (sVar.f4173k > i12) {
                sVar.f4173k = Math.max(i12, 0);
            }
            sVar.f4172j = 0;
            sVar.f4177o = 0;
            sVar.f4174l = 0;
        }
        this.f4190o = true;
    }

    @Override
    public final long g(long j10) {
        if (this.f4189n >= 1024) {
            long j11 = this.f4188m;
            s sVar = this.f4185j;
            sVar.getClass();
            long o10 = j11 - (sVar.f4171i.o() * (sVar.f4172j * sVar.f4167b));
            int i10 = this.h.f4146a;
            int i11 = this.f4183g.f4146a;
            if (i10 == i11) {
                return m0.a0(j10, this.f4189n, o10, RoundingMode.DOWN);
            }
            return m0.a0(j10, this.f4189n * i11, o10 * i10, RoundingMode.DOWN);
        }
        return (long) (j10 / this.f4181c);
    }

    @Override
    public final boolean isActive() {
        if (this.f4182f.f4146a != -1) {
            if (Math.abs(this.f4181c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f4182f.f4146a != this.e.f4146a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f4181c = 1.0f;
        this.d = 1.0f;
        k kVar = k.e;
        this.e = kVar;
        this.f4182f = kVar;
        this.f4183g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.f4151a;
        this.f4186k = byteBuffer;
        this.f4187l = byteBuffer;
        this.f4180b = -1;
        this.f4184i = false;
        this.f4185j = null;
        this.f4188m = 0L;
        this.f4189n = 0L;
        this.f4190o = false;
    }
}

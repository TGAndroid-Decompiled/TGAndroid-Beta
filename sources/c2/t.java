package c2;

import e2.m0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v7.u6;
public final class t implements n {
    public int f4176b;
    public float f4177c;
    public float d;
    public k e;
    public k f4178f;
    public k f4179g;
    public k h;
    public boolean f4180i;
    public s f4181j;
    public ByteBuffer f4182k;
    public ByteBuffer f4183l;
    public long f4184m;
    public long f4185n;
    public boolean f4186o;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        s sVar = this.f4181j;
        if (sVar != null) {
            q qVar = sVar.f4167i;
            int i10 = sVar.f4163b;
            boolean z11 = true;
            if (sVar.f4169k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            int o10 = qVar.o() * sVar.f4169k * i10;
            if (o10 > 0) {
                if (this.f4182k.capacity() < o10) {
                    this.f4182k = ByteBuffer.allocateDirect(o10).order(ByteOrder.nativeOrder());
                } else {
                    this.f4182k.clear();
                }
                ByteBuffer byteBuffer = this.f4182k;
                if (sVar.f4169k < 0) {
                    z11 = false;
                }
                u6.p(z11);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i10), sVar.f4169k);
                qVar.b(min, byteBuffer);
                sVar.f4169k -= min;
                System.arraycopy(qVar.i(), min * i10, qVar.i(), 0, sVar.f4169k * i10);
                this.f4182k.flip();
                this.f4185n += o10;
                this.f4183l = this.f4182k;
            }
        }
        ByteBuffer byteBuffer2 = this.f4183l;
        this.f4183l = n.f4147a;
        return byteBuffer2;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f4186o) {
            s sVar = this.f4181j;
            if (sVar != null) {
                if (sVar.f4169k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.p(z10);
                if (sVar.f4167i.o() * sVar.f4169k * sVar.f4163b == 0) {
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
        s sVar = this.f4181j;
        sVar.getClass();
        this.f4184m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i10 = sVar.f4163b;
        q qVar = sVar.f4167i;
        int o10 = remaining / (qVar.o() * i10);
        qVar.p(o10);
        qVar.a(remaining, byteBuffer);
        sVar.f4168j += o10;
        sVar.b();
    }

    @Override
    public final void d(l lVar) {
        boolean z10;
        if (isActive()) {
            k kVar = this.e;
            this.f4179g = kVar;
            k kVar2 = this.f4178f;
            this.h = kVar2;
            if (this.f4180i) {
                int i10 = kVar.f4142a;
                int i11 = kVar.f4143b;
                float f7 = this.f4177c;
                float f10 = this.d;
                int i12 = kVar2.f4142a;
                if (kVar.f4144c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f4181j = new s(i10, i11, f7, f10, i12, z10);
            } else {
                s sVar = this.f4181j;
                if (sVar != null) {
                    sVar.f4168j = 0;
                    sVar.f4169k = 0;
                    sVar.f4170l = 0;
                    sVar.f4171m = 0;
                    sVar.f4172n = 0;
                    sVar.f4173o = 0;
                    sVar.f4174p = 0;
                    sVar.f4175q = 0.0d;
                    sVar.f4167i.flush();
                }
            }
        }
        this.f4183l = n.f4147a;
        this.f4184m = 0L;
        this.f4185n = 0L;
        this.f4186o = false;
    }

    @Override
    public final k e(k kVar) {
        int i10 = kVar.f4144c;
        if (i10 != 2 && i10 != 4) {
            throw new m(kVar);
        }
        int i11 = this.f4176b;
        if (i11 == -1) {
            i11 = kVar.f4142a;
        }
        this.e = kVar;
        k kVar2 = new k(i11, kVar.f4143b, i10);
        this.f4178f = kVar2;
        this.f4180i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        s sVar = this.f4181j;
        if (sVar != null) {
            int i10 = sVar.f4168j;
            float f7 = sVar.f4164c;
            float f10 = sVar.d;
            int i11 = sVar.f4173o;
            int i12 = sVar.f4169k + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + sVar.f4175q) + sVar.f4170l) / (sVar.e * f10)) + 0.5d));
            sVar.f4175q = 0.0d;
            q qVar = sVar.f4167i;
            int i13 = sVar.h * 2;
            qVar.p(i13 + i10);
            qVar.d(i10 * sVar.f4163b, i13);
            sVar.f4168j = i13 + sVar.f4168j;
            sVar.b();
            if (sVar.f4169k > i12) {
                sVar.f4169k = Math.max(i12, 0);
            }
            sVar.f4168j = 0;
            sVar.f4173o = 0;
            sVar.f4170l = 0;
        }
        this.f4186o = true;
    }

    @Override
    public final long g(long j10) {
        if (this.f4185n >= 1024) {
            long j11 = this.f4184m;
            s sVar = this.f4181j;
            sVar.getClass();
            long o10 = j11 - (sVar.f4167i.o() * (sVar.f4168j * sVar.f4163b));
            int i10 = this.h.f4142a;
            int i11 = this.f4179g.f4142a;
            if (i10 == i11) {
                return m0.a0(j10, this.f4185n, o10, RoundingMode.DOWN);
            }
            return m0.a0(j10, this.f4185n * i11, o10 * i10, RoundingMode.DOWN);
        }
        return (long) (j10 / this.f4177c);
    }

    @Override
    public final boolean isActive() {
        if (this.f4178f.f4142a != -1) {
            if (Math.abs(this.f4177c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f4178f.f4142a != this.e.f4142a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f4177c = 1.0f;
        this.d = 1.0f;
        k kVar = k.e;
        this.e = kVar;
        this.f4178f = kVar;
        this.f4179g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.f4147a;
        this.f4182k = byteBuffer;
        this.f4183l = byteBuffer;
        this.f4176b = -1;
        this.f4180i = false;
        this.f4181j = null;
        this.f4184m = 0L;
        this.f4185n = 0L;
        this.f4186o = false;
    }
}

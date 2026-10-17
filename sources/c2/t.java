package c2;

import e2.m0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v7.u6;
public final class t implements n {
    public int f4550b;
    public float f4551c;
    public float d;
    public k e;
    public k f4552f;
    public k f4553g;
    public k h;
    public boolean f4554i;
    public s f4555j;
    public ByteBuffer f4556k;
    public ByteBuffer f4557l;
    public long f4558m;
    public long f4559n;
    public boolean f4560o;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        s sVar = this.f4555j;
        if (sVar != null) {
            q qVar = sVar.f4541i;
            int i10 = sVar.f4537b;
            boolean z11 = true;
            if (sVar.f4543k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            int o10 = qVar.o() * sVar.f4543k * i10;
            if (o10 > 0) {
                if (this.f4556k.capacity() < o10) {
                    this.f4556k = ByteBuffer.allocateDirect(o10).order(ByteOrder.nativeOrder());
                } else {
                    this.f4556k.clear();
                }
                ByteBuffer byteBuffer = this.f4556k;
                if (sVar.f4543k < 0) {
                    z11 = false;
                }
                u6.p(z11);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i10), sVar.f4543k);
                qVar.b(min, byteBuffer);
                sVar.f4543k -= min;
                System.arraycopy(qVar.i(), min * i10, qVar.i(), 0, sVar.f4543k * i10);
                this.f4556k.flip();
                this.f4559n += o10;
                this.f4557l = this.f4556k;
            }
        }
        ByteBuffer byteBuffer2 = this.f4557l;
        this.f4557l = n.f4521a;
        return byteBuffer2;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f4560o) {
            s sVar = this.f4555j;
            if (sVar != null) {
                if (sVar.f4543k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.p(z10);
                if (sVar.f4541i.o() * sVar.f4543k * sVar.f4537b == 0) {
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
        s sVar = this.f4555j;
        sVar.getClass();
        this.f4558m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i10 = sVar.f4537b;
        q qVar = sVar.f4541i;
        int o10 = remaining / (qVar.o() * i10);
        qVar.p(o10);
        qVar.a(remaining, byteBuffer);
        sVar.f4542j += o10;
        sVar.b();
    }

    @Override
    public final void d(l lVar) {
        boolean z10;
        if (isActive()) {
            k kVar = this.e;
            this.f4553g = kVar;
            k kVar2 = this.f4552f;
            this.h = kVar2;
            if (this.f4554i) {
                int i10 = kVar.f4516a;
                int i11 = kVar.f4517b;
                float f7 = this.f4551c;
                float f10 = this.d;
                int i12 = kVar2.f4516a;
                if (kVar.f4518c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f4555j = new s(i10, i11, f7, f10, i12, z10);
            } else {
                s sVar = this.f4555j;
                if (sVar != null) {
                    sVar.f4542j = 0;
                    sVar.f4543k = 0;
                    sVar.f4544l = 0;
                    sVar.f4545m = 0;
                    sVar.f4546n = 0;
                    sVar.f4547o = 0;
                    sVar.f4548p = 0;
                    sVar.f4549q = 0.0d;
                    sVar.f4541i.flush();
                }
            }
        }
        this.f4557l = n.f4521a;
        this.f4558m = 0L;
        this.f4559n = 0L;
        this.f4560o = false;
    }

    @Override
    public final k e(k kVar) {
        int i10 = kVar.f4518c;
        if (i10 != 2 && i10 != 4) {
            throw new m(kVar);
        }
        int i11 = this.f4550b;
        if (i11 == -1) {
            i11 = kVar.f4516a;
        }
        this.e = kVar;
        k kVar2 = new k(i11, kVar.f4517b, i10);
        this.f4552f = kVar2;
        this.f4554i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        s sVar = this.f4555j;
        if (sVar != null) {
            int i10 = sVar.f4542j;
            float f7 = sVar.f4538c;
            float f10 = sVar.d;
            int i11 = sVar.f4547o;
            int i12 = sVar.f4543k + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + sVar.f4549q) + sVar.f4544l) / (sVar.e * f10)) + 0.5d));
            sVar.f4549q = 0.0d;
            q qVar = sVar.f4541i;
            int i13 = sVar.h * 2;
            qVar.p(i13 + i10);
            qVar.d(i10 * sVar.f4537b, i13);
            sVar.f4542j = i13 + sVar.f4542j;
            sVar.b();
            if (sVar.f4543k > i12) {
                sVar.f4543k = Math.max(i12, 0);
            }
            sVar.f4542j = 0;
            sVar.f4547o = 0;
            sVar.f4544l = 0;
        }
        this.f4560o = true;
    }

    @Override
    public final long g(long j10) {
        if (this.f4559n >= 1024) {
            long j11 = this.f4558m;
            s sVar = this.f4555j;
            sVar.getClass();
            long o10 = j11 - (sVar.f4541i.o() * (sVar.f4542j * sVar.f4537b));
            int i10 = this.h.f4516a;
            int i11 = this.f4553g.f4516a;
            if (i10 == i11) {
                return m0.a0(j10, this.f4559n, o10, RoundingMode.DOWN);
            }
            return m0.a0(j10, this.f4559n * i11, o10 * i10, RoundingMode.DOWN);
        }
        return (long) (j10 / this.f4551c);
    }

    @Override
    public final boolean isActive() {
        if (this.f4552f.f4516a != -1) {
            if (Math.abs(this.f4551c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f4552f.f4516a != this.e.f4516a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f4551c = 1.0f;
        this.d = 1.0f;
        k kVar = k.e;
        this.e = kVar;
        this.f4552f = kVar;
        this.f4553g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.f4521a;
        this.f4556k = byteBuffer;
        this.f4557l = byteBuffer;
        this.f4550b = -1;
        this.f4554i = false;
        this.f4555j = null;
        this.f4558m = 0L;
        this.f4559n = 0L;
        this.f4560o = false;
    }
}

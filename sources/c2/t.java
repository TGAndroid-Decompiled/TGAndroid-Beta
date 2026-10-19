package c2;

import e2.m0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import v7.u6;
public final class t implements n {
    public int f4549b;
    public float f4550c;
    public float d;
    public k e;
    public k f4551f;
    public k f4552g;
    public k h;
    public boolean f4553i;
    public s f4554j;
    public ByteBuffer f4555k;
    public ByteBuffer f4556l;
    public long f4557m;
    public long f4558n;
    public boolean f4559o;

    @Override
    public final ByteBuffer a() {
        boolean z10;
        s sVar = this.f4554j;
        if (sVar != null) {
            q qVar = sVar.f4540i;
            int i10 = sVar.f4536b;
            boolean z11 = true;
            if (sVar.f4542k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            u6.p(z10);
            int o10 = qVar.o() * sVar.f4542k * i10;
            if (o10 > 0) {
                if (this.f4555k.capacity() < o10) {
                    this.f4555k = ByteBuffer.allocateDirect(o10).order(ByteOrder.nativeOrder());
                } else {
                    this.f4555k.clear();
                }
                ByteBuffer byteBuffer = this.f4555k;
                if (sVar.f4542k < 0) {
                    z11 = false;
                }
                u6.p(z11);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i10), sVar.f4542k);
                qVar.b(min, byteBuffer);
                sVar.f4542k -= min;
                System.arraycopy(qVar.i(), min * i10, qVar.i(), 0, sVar.f4542k * i10);
                this.f4555k.flip();
                this.f4558n += o10;
                this.f4556l = this.f4555k;
            }
        }
        ByteBuffer byteBuffer2 = this.f4556l;
        this.f4556l = n.f4520a;
        return byteBuffer2;
    }

    @Override
    public final boolean b() {
        boolean z10;
        if (this.f4559o) {
            s sVar = this.f4554j;
            if (sVar != null) {
                if (sVar.f4542k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                u6.p(z10);
                if (sVar.f4540i.o() * sVar.f4542k * sVar.f4536b == 0) {
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
        s sVar = this.f4554j;
        sVar.getClass();
        this.f4557m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i10 = sVar.f4536b;
        q qVar = sVar.f4540i;
        int o10 = remaining / (qVar.o() * i10);
        qVar.p(o10);
        qVar.a(remaining, byteBuffer);
        sVar.f4541j += o10;
        sVar.b();
    }

    @Override
    public final void d(l lVar) {
        boolean z10;
        if (isActive()) {
            k kVar = this.e;
            this.f4552g = kVar;
            k kVar2 = this.f4551f;
            this.h = kVar2;
            if (this.f4553i) {
                int i10 = kVar.f4515a;
                int i11 = kVar.f4516b;
                float f7 = this.f4550c;
                float f10 = this.d;
                int i12 = kVar2.f4515a;
                if (kVar.f4517c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f4554j = new s(i10, i11, f7, f10, i12, z10);
            } else {
                s sVar = this.f4554j;
                if (sVar != null) {
                    sVar.f4541j = 0;
                    sVar.f4542k = 0;
                    sVar.f4543l = 0;
                    sVar.f4544m = 0;
                    sVar.f4545n = 0;
                    sVar.f4546o = 0;
                    sVar.f4547p = 0;
                    sVar.f4548q = 0.0d;
                    sVar.f4540i.flush();
                }
            }
        }
        this.f4556l = n.f4520a;
        this.f4557m = 0L;
        this.f4558n = 0L;
        this.f4559o = false;
    }

    @Override
    public final k e(k kVar) {
        int i10 = kVar.f4517c;
        if (i10 != 2 && i10 != 4) {
            throw new m(kVar);
        }
        int i11 = this.f4549b;
        if (i11 == -1) {
            i11 = kVar.f4515a;
        }
        this.e = kVar;
        k kVar2 = new k(i11, kVar.f4516b, i10);
        this.f4551f = kVar2;
        this.f4553i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        s sVar = this.f4554j;
        if (sVar != null) {
            int i10 = sVar.f4541j;
            float f7 = sVar.f4537c;
            float f10 = sVar.d;
            int i11 = sVar.f4546o;
            int i12 = sVar.f4542k + ((int) (((((((i10 - i11) / (f7 / f10)) + i11) + sVar.f4548q) + sVar.f4543l) / (sVar.e * f10)) + 0.5d));
            sVar.f4548q = 0.0d;
            q qVar = sVar.f4540i;
            int i13 = sVar.h * 2;
            qVar.p(i13 + i10);
            qVar.d(i10 * sVar.f4536b, i13);
            sVar.f4541j = i13 + sVar.f4541j;
            sVar.b();
            if (sVar.f4542k > i12) {
                sVar.f4542k = Math.max(i12, 0);
            }
            sVar.f4541j = 0;
            sVar.f4546o = 0;
            sVar.f4543l = 0;
        }
        this.f4559o = true;
    }

    @Override
    public final long g(long j10) {
        if (this.f4558n >= 1024) {
            long j11 = this.f4557m;
            s sVar = this.f4554j;
            sVar.getClass();
            long o10 = j11 - (sVar.f4540i.o() * (sVar.f4541j * sVar.f4536b));
            int i10 = this.h.f4515a;
            int i11 = this.f4552g.f4515a;
            if (i10 == i11) {
                return m0.a0(j10, this.f4558n, o10, RoundingMode.DOWN);
            }
            return m0.a0(j10, this.f4558n * i11, o10 * i10, RoundingMode.DOWN);
        }
        return (long) (j10 / this.f4550c);
    }

    @Override
    public final boolean isActive() {
        if (this.f4551f.f4515a != -1) {
            if (Math.abs(this.f4550c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f4551f.f4515a != this.e.f4515a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f4550c = 1.0f;
        this.d = 1.0f;
        k kVar = k.e;
        this.e = kVar;
        this.f4551f = kVar;
        this.f4552g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.f4520a;
        this.f4555k = byteBuffer;
        this.f4556l = byteBuffer;
        this.f4549b = -1;
        this.f4553i = false;
        this.f4554j = null;
        this.f4557m = 0L;
        this.f4558n = 0L;
        this.f4559o = false;
    }
}

package f2;

import a8.la;
import h2.l0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class s implements n {
    public int f11110b;
    public float f11111c;
    public float d;
    public k f11112e;
    public k f11113f;
    public k f11114g;
    public k h;
    public boolean f11115i;
    public r f11116j;
    public ByteBuffer f11117k;
    public ByteBuffer f11118l;
    public long f11119m;
    public long f11120n;
    public boolean f11121o;

    @Override
    public final boolean a() {
        boolean z10;
        if (this.f11121o) {
            r rVar = this.f11116j;
            if (rVar != null) {
                if (rVar.f11103k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                la.p(z10);
                if (rVar.f11101i.o() * rVar.f11103k * rVar.f11096b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        boolean z10;
        r rVar = this.f11116j;
        if (rVar != null) {
            q qVar = rVar.f11101i;
            int i7 = rVar.f11096b;
            boolean z11 = true;
            if (rVar.f11103k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            la.p(z10);
            int o4 = qVar.o() * rVar.f11103k * i7;
            if (o4 > 0) {
                if (this.f11117k.capacity() < o4) {
                    this.f11117k = ByteBuffer.allocateDirect(o4).order(ByteOrder.nativeOrder());
                } else {
                    this.f11117k.clear();
                }
                ByteBuffer byteBuffer = this.f11117k;
                if (rVar.f11103k < 0) {
                    z11 = false;
                }
                la.p(z11);
                int min = Math.min(byteBuffer.remaining() / (qVar.o() * i7), rVar.f11103k);
                qVar.b(min, byteBuffer);
                rVar.f11103k -= min;
                System.arraycopy(qVar.h(), min * i7, qVar.h(), 0, rVar.f11103k * i7);
                this.f11117k.flip();
                this.f11120n += o4;
                this.f11118l = this.f11117k;
            }
        }
        ByteBuffer byteBuffer2 = this.f11118l;
        this.f11118l = n.f11083a;
        return byteBuffer2;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        r rVar = this.f11116j;
        rVar.getClass();
        this.f11119m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i7 = rVar.f11096b;
        q qVar = rVar.f11101i;
        int o4 = remaining / (qVar.o() * i7);
        qVar.p(o4);
        qVar.a(remaining, byteBuffer);
        rVar.f11102j += o4;
        rVar.b();
    }

    @Override
    public final void d(l lVar) {
        boolean z10;
        if (isActive()) {
            k kVar = this.f11112e;
            this.f11114g = kVar;
            k kVar2 = this.f11113f;
            this.h = kVar2;
            if (this.f11115i) {
                int i7 = kVar.f11078a;
                int i10 = kVar.f11079b;
                float f10 = this.f11111c;
                float f11 = this.d;
                int i11 = kVar2.f11078a;
                if (kVar.f11080c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f11116j = new r(i7, i10, f10, f11, i11, z10);
            } else {
                r rVar = this.f11116j;
                if (rVar != null) {
                    rVar.f11102j = 0;
                    rVar.f11103k = 0;
                    rVar.f11104l = 0;
                    rVar.f11105m = 0;
                    rVar.f11106n = 0;
                    rVar.f11107o = 0;
                    rVar.f11108p = 0;
                    rVar.f11109q = 0.0d;
                    rVar.f11101i.flush();
                }
            }
        }
        this.f11118l = n.f11083a;
        this.f11119m = 0L;
        this.f11120n = 0L;
        this.f11121o = false;
    }

    @Override
    public final k e(k kVar) {
        int i7 = kVar.f11080c;
        if (i7 != 2 && i7 != 4) {
            throw new m(kVar);
        }
        int i10 = this.f11110b;
        if (i10 == -1) {
            i10 = kVar.f11078a;
        }
        this.f11112e = kVar;
        k kVar2 = new k(i10, kVar.f11079b, i7);
        this.f11113f = kVar2;
        this.f11115i = true;
        return kVar2;
    }

    @Override
    public final void f() {
        r rVar = this.f11116j;
        if (rVar != null) {
            int i7 = rVar.f11102j;
            float f10 = rVar.f11097c;
            float f11 = rVar.d;
            int i10 = rVar.f11107o;
            int i11 = rVar.f11103k + ((int) (((((((i7 - i10) / (f10 / f11)) + i10) + rVar.f11109q) + rVar.f11104l) / (rVar.f11098e * f11)) + 0.5d));
            rVar.f11109q = 0.0d;
            q qVar = rVar.f11101i;
            int i12 = rVar.h * 2;
            qVar.p(i12 + i7);
            qVar.c(i7 * rVar.f11096b, i12);
            rVar.f11102j = i12 + rVar.f11102j;
            rVar.b();
            if (rVar.f11103k > i11) {
                rVar.f11103k = Math.max(i11, 0);
            }
            rVar.f11102j = 0;
            rVar.f11107o = 0;
            rVar.f11104l = 0;
        }
        this.f11121o = true;
    }

    @Override
    public final long g(long j3) {
        if (this.f11120n >= 1024) {
            long j10 = this.f11119m;
            r rVar = this.f11116j;
            rVar.getClass();
            long o4 = j10 - (rVar.f11101i.o() * (rVar.f11102j * rVar.f11096b));
            int i7 = this.h.f11078a;
            int i10 = this.f11114g.f11078a;
            if (i7 == i10) {
                return l0.a0(j3, this.f11120n, o4, RoundingMode.DOWN);
            }
            return l0.a0(j3, this.f11120n * i10, o4 * i7, RoundingMode.DOWN);
        }
        return (long) (j3 / this.f11111c);
    }

    @Override
    public final boolean isActive() {
        if (this.f11113f.f11078a != -1) {
            if (Math.abs(this.f11111c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f11113f.f11078a != this.f11112e.f11078a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f11111c = 1.0f;
        this.d = 1.0f;
        k kVar = k.f11077e;
        this.f11112e = kVar;
        this.f11113f = kVar;
        this.f11114g = kVar;
        this.h = kVar;
        ByteBuffer byteBuffer = n.f11083a;
        this.f11117k = byteBuffer;
        this.f11118l = byteBuffer;
        this.f11110b = -1;
        this.f11115i = false;
        this.f11116j = null;
        this.f11119m = 0L;
        this.f11120n = 0L;
        this.f11121o = false;
    }
}

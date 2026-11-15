package f2;

import a8.ja;
import h2.l0;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
public final class r implements m {
    public int f10762b;
    public float f10763c;
    public float d;
    public j f10764e;
    public j f10765f;
    public j f10766g;
    public j h;
    public boolean f10767i;
    public q f10768j;
    public ByteBuffer f10769k;
    public ByteBuffer f10770l;
    public long f10771m;
    public long f10772n;
    public boolean f10773o;

    @Override
    public final boolean a() {
        boolean z10;
        if (this.f10773o) {
            q qVar = this.f10768j;
            if (qVar != null) {
                if (qVar.f10755k >= 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ja.p(z10);
                if (qVar.f10753i.o() * qVar.f10755k * qVar.f10748b == 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final ByteBuffer b() {
        boolean z10;
        q qVar = this.f10768j;
        if (qVar != null) {
            p pVar = qVar.f10753i;
            int i7 = qVar.f10748b;
            boolean z11 = true;
            if (qVar.f10755k >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ja.p(z10);
            int o4 = pVar.o() * qVar.f10755k * i7;
            if (o4 > 0) {
                if (this.f10769k.capacity() < o4) {
                    this.f10769k = ByteBuffer.allocateDirect(o4).order(ByteOrder.nativeOrder());
                } else {
                    this.f10769k.clear();
                }
                ByteBuffer byteBuffer = this.f10769k;
                if (qVar.f10755k < 0) {
                    z11 = false;
                }
                ja.p(z11);
                int min = Math.min(byteBuffer.remaining() / (pVar.o() * i7), qVar.f10755k);
                pVar.b(min, byteBuffer);
                qVar.f10755k -= min;
                System.arraycopy(pVar.h(), min * i7, pVar.h(), 0, qVar.f10755k * i7);
                this.f10769k.flip();
                this.f10772n += o4;
                this.f10770l = this.f10769k;
            }
        }
        ByteBuffer byteBuffer2 = this.f10770l;
        this.f10770l = m.f10735a;
        return byteBuffer2;
    }

    @Override
    public final void c(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        q qVar = this.f10768j;
        qVar.getClass();
        this.f10771m += byteBuffer.remaining();
        int remaining = byteBuffer.remaining();
        int i7 = qVar.f10748b;
        p pVar = qVar.f10753i;
        int o4 = remaining / (pVar.o() * i7);
        pVar.p(o4);
        pVar.a(remaining, byteBuffer);
        qVar.f10754j += o4;
        qVar.b();
    }

    @Override
    public final void d(k kVar) {
        boolean z10;
        if (isActive()) {
            j jVar = this.f10764e;
            this.f10766g = jVar;
            j jVar2 = this.f10765f;
            this.h = jVar2;
            if (this.f10767i) {
                int i7 = jVar.f10730a;
                int i10 = jVar.f10731b;
                float f10 = this.f10763c;
                float f11 = this.d;
                int i11 = jVar2.f10730a;
                if (jVar.f10732c == 4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f10768j = new q(i7, i10, f10, f11, i11, z10);
            } else {
                q qVar = this.f10768j;
                if (qVar != null) {
                    qVar.f10754j = 0;
                    qVar.f10755k = 0;
                    qVar.f10756l = 0;
                    qVar.f10757m = 0;
                    qVar.f10758n = 0;
                    qVar.f10759o = 0;
                    qVar.f10760p = 0;
                    qVar.f10761q = 0.0d;
                    qVar.f10753i.flush();
                }
            }
        }
        this.f10770l = m.f10735a;
        this.f10771m = 0L;
        this.f10772n = 0L;
        this.f10773o = false;
    }

    @Override
    public final j e(j jVar) {
        int i7 = jVar.f10732c;
        if (i7 != 2 && i7 != 4) {
            throw new l(jVar);
        }
        int i10 = this.f10762b;
        if (i10 == -1) {
            i10 = jVar.f10730a;
        }
        this.f10764e = jVar;
        j jVar2 = new j(i10, jVar.f10731b, i7);
        this.f10765f = jVar2;
        this.f10767i = true;
        return jVar2;
    }

    @Override
    public final void f() {
        q qVar = this.f10768j;
        if (qVar != null) {
            int i7 = qVar.f10754j;
            float f10 = qVar.f10749c;
            float f11 = qVar.d;
            int i10 = qVar.f10759o;
            int i11 = qVar.f10755k + ((int) (((((((i7 - i10) / (f10 / f11)) + i10) + qVar.f10761q) + qVar.f10756l) / (qVar.f10750e * f11)) + 0.5d));
            qVar.f10761q = 0.0d;
            p pVar = qVar.f10753i;
            int i12 = qVar.h * 2;
            pVar.p(i12 + i7);
            pVar.c(i7 * qVar.f10748b, i12);
            qVar.f10754j = i12 + qVar.f10754j;
            qVar.b();
            if (qVar.f10755k > i11) {
                qVar.f10755k = Math.max(i11, 0);
            }
            qVar.f10754j = 0;
            qVar.f10759o = 0;
            qVar.f10756l = 0;
        }
        this.f10773o = true;
    }

    @Override
    public final long g(long j3) {
        if (this.f10772n >= 1024) {
            long j10 = this.f10771m;
            q qVar = this.f10768j;
            qVar.getClass();
            long o4 = j10 - (qVar.f10753i.o() * (qVar.f10754j * qVar.f10748b));
            int i7 = this.h.f10730a;
            int i10 = this.f10766g.f10730a;
            if (i7 == i10) {
                return l0.a0(j3, this.f10772n, o4, RoundingMode.DOWN);
            }
            return l0.a0(j3, this.f10772n * i10, o4 * i7, RoundingMode.DOWN);
        }
        return (long) (j3 / this.f10763c);
    }

    @Override
    public final boolean isActive() {
        if (this.f10765f.f10730a != -1) {
            if (Math.abs(this.f10763c - 1.0f) >= 1.0E-4f || Math.abs(this.d - 1.0f) >= 1.0E-4f || this.f10765f.f10730a != this.f10764e.f10730a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void reset() {
        this.f10763c = 1.0f;
        this.d = 1.0f;
        j jVar = j.f10729e;
        this.f10764e = jVar;
        this.f10765f = jVar;
        this.f10766g = jVar;
        this.h = jVar;
        ByteBuffer byteBuffer = m.f10735a;
        this.f10769k = byteBuffer;
        this.f10770l = byteBuffer;
        this.f10762b = -1;
        this.f10767i = false;
        this.f10768j = null;
        this.f10771m = 0L;
        this.f10772n = 0L;
        this.f10773o = false;
    }
}

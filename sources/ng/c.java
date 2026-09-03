package ng;

import org.telegram.messenger.Utilities;
import org.telegram.ui.yh;
public final class c {
    public float f16005a;
    public float f16006b;
    public float f16007c;
    public float d;
    public float f16008e;
    public float f16009f;
    public float f16010g;
    public float h;
    public long f16011i;
    public boolean f16012j;
    public float f16013k;
    public final d f16014l;

    public c(d dVar) {
        this.f16014l = dVar;
    }

    public final void a() {
        d dVar;
        float f10;
        float f11 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c3 = c();
        int i10 = 0;
        while (true) {
            dVar = this.f16014l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c10 = c();
            float f12 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f16027c.size(); i11++) {
                float f13 = ((c) dVar.f16027c.get(i11)).f16007c - b11;
                float f14 = ((c) dVar.f16027c.get(i11)).d - c10;
                float f15 = (f14 * f14) + (f13 * f13);
                if (f15 < f12) {
                    f12 = f15;
                }
            }
            if (f12 > f11) {
                b10 = b11;
                c3 = c10;
                f11 = f12;
            }
            i10++;
        }
        if (dVar.f16029f) {
            f10 = 0.8f;
        } else {
            f10 = 0.5f;
        }
        this.f16007c = b10;
        if (b10 > dVar.f16026b.width() * f10) {
            this.f16005a = dVar.f16026b.width() * f10;
        } else {
            float width = dVar.f16026b.width() * f10;
            this.f16005a = width;
            if (this.f16007c > width) {
                this.f16007c = width - 0.1f;
            }
        }
        float height = dVar.f16026b.height() * 0.1f;
        this.f16006b = w.c.c(yh.f(Utilities.fastRandom, 100), 100.0f, height, dVar.f16026b.height() * 0.45f);
        if (dVar.f16029f) {
            float width2 = dVar.f16026b.width() * 0.1f;
            float c11 = w.c.c(yh.f(Utilities.fastRandom, 100), 100.0f, width2, dVar.f16026b.width() * 0.05f);
            this.f16009f = c11;
            this.f16010g = (((yh.f(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * c11;
            float height2 = dVar.f16026b.height() * 0.1f;
            this.d = w.c.c(yh.f(Utilities.fastRandom, 100), 100.0f, height2, this.f16009f / 2.0f);
            this.f16008e = dVar.f16026b.height() + this.f16009f;
            this.f16011i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = dVar.f16026b.width() * 0.1f;
            float c12 = w.c.c(yh.f(Utilities.fastRandom, 100), 100.0f, width3, dVar.f16026b.width() * 0.05f);
            this.f16009f = c12;
            this.f16010g = (((yh.f(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * c12;
            this.d = c3;
            this.f16008e = c3 + dVar.f16026b.height();
            this.f16011i = 1800L;
        }
        this.f16011i = ((float) this.f16011i) / 1.75f;
        this.f16012j = Utilities.fastRandom.nextBoolean();
        this.f16013k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f16014l;
        if (dVar.f16029f) {
            float width = dVar.f16026b.width() * 1.5f;
            return w.c.c(yh.f(Utilities.fastRandom, 100), 100.0f, width, dVar.f16026b.width() * (-0.25f));
        }
        return (yh.f(Utilities.fastRandom, 100) / 100.0f) * dVar.f16026b.width();
    }

    public final float c() {
        return (yh.f(Utilities.fastRandom, 100) / 100.0f) * this.f16014l.f16026b.height() * 0.5f;
    }
}

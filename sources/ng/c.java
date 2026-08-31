package ng;

import org.telegram.messenger.Utilities;
import org.telegram.ui.yh;
public final class c {
    public float f16003a;
    public float f16004b;
    public float f16005c;
    public float d;
    public float f16006e;
    public float f16007f;
    public float f16008g;
    public float h;
    public long f16009i;
    public boolean f16010j;
    public float f16011k;
    public final d f16012l;

    public c(d dVar) {
        this.f16012l = dVar;
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
            dVar = this.f16012l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c10 = c();
            float f12 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f16025c.size(); i11++) {
                float f13 = ((c) dVar.f16025c.get(i11)).f16005c - b11;
                float f14 = ((c) dVar.f16025c.get(i11)).d - c10;
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
        if (dVar.f16027f) {
            f10 = 0.8f;
        } else {
            f10 = 0.5f;
        }
        this.f16005c = b10;
        if (b10 > dVar.f16024b.width() * f10) {
            this.f16003a = dVar.f16024b.width() * f10;
        } else {
            float width = dVar.f16024b.width() * f10;
            this.f16003a = width;
            if (this.f16005c > width) {
                this.f16005c = width - 0.1f;
            }
        }
        float height = dVar.f16024b.height() * 0.1f;
        this.f16004b = w.c.c(yh.f(Utilities.fastRandom, 100), 100.0f, height, dVar.f16024b.height() * 0.45f);
        if (dVar.f16027f) {
            float width2 = dVar.f16024b.width() * 0.1f;
            float c11 = w.c.c(yh.f(Utilities.fastRandom, 100), 100.0f, width2, dVar.f16024b.width() * 0.05f);
            this.f16007f = c11;
            this.f16008g = (((yh.f(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * c11;
            float height2 = dVar.f16024b.height() * 0.1f;
            this.d = w.c.c(yh.f(Utilities.fastRandom, 100), 100.0f, height2, this.f16007f / 2.0f);
            this.f16006e = dVar.f16024b.height() + this.f16007f;
            this.f16009i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = dVar.f16024b.width() * 0.1f;
            float c12 = w.c.c(yh.f(Utilities.fastRandom, 100), 100.0f, width3, dVar.f16024b.width() * 0.05f);
            this.f16007f = c12;
            this.f16008g = (((yh.f(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * c12;
            this.d = c3;
            this.f16006e = c3 + dVar.f16024b.height();
            this.f16009i = 1800L;
        }
        this.f16009i = ((float) this.f16009i) / 1.75f;
        this.f16010j = Utilities.fastRandom.nextBoolean();
        this.f16011k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f16012l;
        if (dVar.f16027f) {
            float width = dVar.f16024b.width() * 1.5f;
            return w.c.c(yh.f(Utilities.fastRandom, 100), 100.0f, width, dVar.f16024b.width() * (-0.25f));
        }
        return (yh.f(Utilities.fastRandom, 100) / 100.0f) * dVar.f16024b.width();
    }

    public final float c() {
        return (yh.f(Utilities.fastRandom, 100) / 100.0f) * this.f16012l.f16024b.height() * 0.5f;
    }
}

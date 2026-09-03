package mg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.ai;
import vh.w2;
public final class c {
    public float f13933a;
    public float f13934b;
    public float f13935c;
    public float d;
    public float e;
    public float f13936f;
    public float f13937g;
    public float h;
    public long f13938i;
    public boolean f13939j;
    public float f13940k;
    public final d f13941l;

    public c(d dVar) {
        this.f13941l = dVar;
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
            dVar = this.f13941l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c10 = c();
            float f12 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f13953c.size(); i11++) {
                float f13 = ((c) dVar.f13953c.get(i11)).f13935c - b11;
                float f14 = ((c) dVar.f13953c.get(i11)).d - c10;
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
        if (dVar.f13954f) {
            f10 = 0.8f;
        } else {
            f10 = 0.5f;
        }
        this.f13935c = b10;
        if (b10 > dVar.f13952b.width() * f10) {
            this.f13933a = dVar.f13952b.width() * f10;
        } else {
            float width = dVar.f13952b.width() * f10;
            this.f13933a = width;
            if (this.f13935c > width) {
                this.f13935c = width - 0.1f;
            }
        }
        float height = dVar.f13952b.height() * 0.1f;
        this.f13934b = w2.c(ai.f(Utilities.fastRandom, 100), 100.0f, height, dVar.f13952b.height() * 0.45f);
        if (dVar.f13954f) {
            float width2 = dVar.f13952b.width() * 0.1f;
            float c11 = w2.c(ai.f(Utilities.fastRandom, 100), 100.0f, width2, dVar.f13952b.width() * 0.05f);
            this.f13936f = c11;
            this.f13937g = (((ai.f(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * c11;
            float height2 = dVar.f13952b.height() * 0.1f;
            this.d = w2.c(ai.f(Utilities.fastRandom, 100), 100.0f, height2, this.f13936f / 2.0f);
            this.e = dVar.f13952b.height() + this.f13936f;
            this.f13938i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = dVar.f13952b.width() * 0.1f;
            float c12 = w2.c(ai.f(Utilities.fastRandom, 100), 100.0f, width3, dVar.f13952b.width() * 0.05f);
            this.f13936f = c12;
            this.f13937g = (((ai.f(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * c12;
            this.d = c3;
            this.e = c3 + dVar.f13952b.height();
            this.f13938i = 1800L;
        }
        this.f13938i = ((float) this.f13938i) / 1.75f;
        this.f13939j = Utilities.fastRandom.nextBoolean();
        this.f13940k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f13941l;
        if (dVar.f13954f) {
            float width = dVar.f13952b.width() * 1.5f;
            return w2.c(ai.f(Utilities.fastRandom, 100), 100.0f, width, dVar.f13952b.width() * (-0.25f));
        }
        return (ai.f(Utilities.fastRandom, 100) / 100.0f) * dVar.f13952b.width();
    }

    public final float c() {
        return (ai.f(Utilities.fastRandom, 100) / 100.0f) * this.f13941l.f13952b.height() * 0.5f;
    }
}

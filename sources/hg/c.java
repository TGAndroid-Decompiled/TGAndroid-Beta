package hg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.j2;
public final class c {
    public float f10540a;
    public float f10541b;
    public float f10542c;
    public float d;
    public float f10543e;
    public float f10544f;
    public float f10545g;
    public float h;
    public long f10546i;
    public boolean f10547j;
    public float f10548k;
    public final d f10549l;

    public c(d dVar) {
        this.f10549l = dVar;
    }

    public final void a() {
        d dVar;
        float f10;
        float f11 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c10 = c();
        int i9 = 0;
        while (true) {
            dVar = this.f10549l;
            if (i9 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f12 = 2.1474836E9f;
            for (int i10 = 0; i10 < dVar.f10555c.size(); i10++) {
                float f13 = ((c) dVar.f10555c.get(i10)).f10542c - b11;
                float f14 = ((c) dVar.f10555c.get(i10)).d - c11;
                float f15 = (f14 * f14) + (f13 * f13);
                if (f15 < f12) {
                    f12 = f15;
                }
            }
            if (f12 > f11) {
                b10 = b11;
                c10 = c11;
                f11 = f12;
            }
            i9++;
        }
        if (dVar.f10557f) {
            f10 = 0.8f;
        } else {
            f10 = 0.5f;
        }
        this.f10542c = b10;
        if (b10 > dVar.f10554b.width() * f10) {
            this.f10540a = dVar.f10554b.width() * f10;
        } else {
            float width = dVar.f10554b.width() * f10;
            this.f10540a = width;
            if (this.f10542c > width) {
                this.f10542c = width - 0.1f;
            }
        }
        float height = dVar.f10554b.height() * 0.1f;
        this.f10541b = j2.b(j2.e(Utilities.fastRandom, 100), 100.0f, height, dVar.f10554b.height() * 0.45f);
        if (dVar.f10557f) {
            float width2 = dVar.f10554b.width() * 0.1f;
            float b12 = j2.b(j2.e(Utilities.fastRandom, 100), 100.0f, width2, dVar.f10554b.width() * 0.05f);
            this.f10544f = b12;
            this.f10545g = (((j2.e(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * b12;
            float height2 = dVar.f10554b.height() * 0.1f;
            this.d = j2.b(j2.e(Utilities.fastRandom, 100), 100.0f, height2, this.f10544f / 2.0f);
            this.f10543e = dVar.f10554b.height() + this.f10544f;
            this.f10546i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = dVar.f10554b.width() * 0.1f;
            float b13 = j2.b(j2.e(Utilities.fastRandom, 100), 100.0f, width3, dVar.f10554b.width() * 0.05f);
            this.f10544f = b13;
            this.f10545g = (((j2.e(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * b13;
            this.d = c10;
            this.f10543e = c10 + dVar.f10554b.height();
            this.f10546i = 1800L;
        }
        this.f10546i = ((float) this.f10546i) / 1.75f;
        this.f10547j = Utilities.fastRandom.nextBoolean();
        this.f10548k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f10549l;
        if (dVar.f10557f) {
            float width = dVar.f10554b.width() * 1.5f;
            return j2.b(j2.e(Utilities.fastRandom, 100), 100.0f, width, dVar.f10554b.width() * (-0.25f));
        }
        return (j2.e(Utilities.fastRandom, 100) / 100.0f) * dVar.f10554b.width();
    }

    public final float c() {
        return (j2.e(Utilities.fastRandom, 100) / 100.0f) * this.f10549l.f10554b.height() * 0.5f;
    }
}

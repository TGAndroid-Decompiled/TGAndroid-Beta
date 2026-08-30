package mg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.yh;
import vh.v2;
public final class c {
    public float f13945a;
    public float f13946b;
    public float f13947c;
    public float d;
    public float e;
    public float f13948f;
    public float f13949g;
    public float h;
    public long f13950i;
    public boolean f13951j;
    public float f13952k;
    public final d f13953l;

    public c(d dVar) {
        this.f13953l = dVar;
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
            dVar = this.f13953l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c10 = c();
            float f12 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f13965c.size(); i11++) {
                float f13 = ((c) dVar.f13965c.get(i11)).f13947c - b11;
                float f14 = ((c) dVar.f13965c.get(i11)).d - c10;
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
        if (dVar.f13966f) {
            f10 = 0.8f;
        } else {
            f10 = 0.5f;
        }
        this.f13947c = b10;
        if (b10 > dVar.f13964b.width() * f10) {
            this.f13945a = dVar.f13964b.width() * f10;
        } else {
            float width = dVar.f13964b.width() * f10;
            this.f13945a = width;
            if (this.f13947c > width) {
                this.f13947c = width - 0.1f;
            }
        }
        float height = dVar.f13964b.height() * 0.1f;
        this.f13946b = v2.c(yh.g(Utilities.fastRandom, 100), 100.0f, height, dVar.f13964b.height() * 0.45f);
        if (dVar.f13966f) {
            float width2 = dVar.f13964b.width() * 0.1f;
            float c11 = v2.c(yh.g(Utilities.fastRandom, 100), 100.0f, width2, dVar.f13964b.width() * 0.05f);
            this.f13948f = c11;
            this.f13949g = (((yh.g(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * c11;
            float height2 = dVar.f13964b.height() * 0.1f;
            this.d = v2.c(yh.g(Utilities.fastRandom, 100), 100.0f, height2, this.f13948f / 2.0f);
            this.e = dVar.f13964b.height() + this.f13948f;
            this.f13950i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = dVar.f13964b.width() * 0.1f;
            float c12 = v2.c(yh.g(Utilities.fastRandom, 100), 100.0f, width3, dVar.f13964b.width() * 0.05f);
            this.f13948f = c12;
            this.f13949g = (((yh.g(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * c12;
            this.d = c3;
            this.e = c3 + dVar.f13964b.height();
            this.f13950i = 1800L;
        }
        this.f13950i = ((float) this.f13950i) / 1.75f;
        this.f13951j = Utilities.fastRandom.nextBoolean();
        this.f13952k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f13953l;
        if (dVar.f13966f) {
            float width = dVar.f13964b.width() * 1.5f;
            return v2.c(yh.g(Utilities.fastRandom, 100), 100.0f, width, dVar.f13964b.width() * (-0.25f));
        }
        return (yh.g(Utilities.fastRandom, 100) / 100.0f) * dVar.f13964b.width();
    }

    public final float c() {
        return (yh.g(Utilities.fastRandom, 100) / 100.0f) * this.f13953l.f13964b.height() * 0.5f;
    }
}

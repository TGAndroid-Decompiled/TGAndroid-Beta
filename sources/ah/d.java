package ah;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.p6;
public final class d {
    public float f483a;
    public float f484b;
    public float f485c;
    public float d;
    public float f486e;
    public float f487f;
    public float f488g;
    public float h;
    public long f489i;
    public boolean f490j;
    public float f491k;
    public final e f492l;

    public d(e eVar) {
        this.f492l = eVar;
    }

    public final void a() {
        e eVar;
        float f7;
        float f10 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c10 = c();
        int i10 = 0;
        while (true) {
            eVar = this.f492l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < eVar.f508c.size(); i11++) {
                float f12 = ((d) eVar.f508c.get(i11)).f485c - b11;
                float f13 = ((d) eVar.f508c.get(i11)).d - c11;
                float f14 = (f13 * f13) + (f12 * f12);
                if (f14 < f11) {
                    f11 = f14;
                }
            }
            if (f11 > f10) {
                b10 = b11;
                c10 = c11;
                f10 = f11;
            }
            i10++;
        }
        if (eVar.f510f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f485c = b10;
        if (b10 > eVar.f507b.width() * f7) {
            this.f483a = eVar.f507b.width() * f7;
        } else {
            float width = eVar.f507b.width() * f7;
            this.f483a = width;
            if (this.f485c > width) {
                this.f485c = width - 0.1f;
            }
        }
        float height = eVar.f507b.height() * 0.1f;
        this.f484b = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, height, eVar.f507b.height() * 0.45f);
        if (eVar.f510f) {
            float width2 = eVar.f507b.width() * 0.1f;
            float e7 = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, width2, eVar.f507b.width() * 0.05f);
            this.f487f = e7;
            this.f488g = (((p6.c(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e7;
            float height2 = eVar.f507b.height() * 0.1f;
            this.d = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, height2, this.f487f / 2.0f);
            this.f486e = eVar.f507b.height() + this.f487f;
            this.f489i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = eVar.f507b.width() * 0.1f;
            float e10 = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, width3, eVar.f507b.width() * 0.05f);
            this.f487f = e10;
            this.f488g = (((p6.c(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e10;
            this.d = c10;
            this.f486e = c10 + eVar.f507b.height();
            this.f489i = 1800L;
        }
        this.f489i = ((float) this.f489i) / 1.75f;
        this.f490j = Utilities.fastRandom.nextBoolean();
        this.f491k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        e eVar = this.f492l;
        if (eVar.f510f) {
            float width = eVar.f507b.width() * 1.5f;
            return a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, width, eVar.f507b.width() * (-0.25f));
        }
        return (p6.c(Utilities.fastRandom, 100) / 100.0f) * eVar.f507b.width();
    }

    public final float c() {
        return (p6.c(Utilities.fastRandom, 100) / 100.0f) * this.f492l.f507b.height() * 0.5f;
    }
}

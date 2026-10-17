package ah;

import org.telegram.messenger.Utilities;
public final class d {
    public float f679a;
    public float f680b;
    public float f681c;
    public float d;
    public float e;
    public float f682f;
    public float f683g;
    public float h;
    public long f684i;
    public boolean f685j;
    public float f686k;
    public final e f687l;

    public d(e eVar) {
        this.f687l = eVar;
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
            eVar = this.f687l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < eVar.f715c.size(); i11++) {
                float f12 = ((d) eVar.f715c.get(i11)).f681c - b11;
                float f13 = ((d) eVar.f715c.get(i11)).d - c11;
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
        if (eVar.f716f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f681c = b10;
        if (b10 > eVar.f714b.width() * f7) {
            this.f679a = eVar.f714b.width() * f7;
        } else {
            float width = eVar.f714b.width() * f7;
            this.f679a = width;
            if (this.f681c > width) {
                this.f681c = width - 0.1f;
            }
        }
        this.f680b = a1.g.d(org.telegram.ui.Cells.t0.h(Utilities.fastRandom, 100), 100.0f, eVar.f714b.height() * 0.1f, eVar.f714b.height() * 0.45f);
        if (eVar.f716f) {
            float d = a1.g.d(org.telegram.ui.Cells.t0.h(Utilities.fastRandom, 100), 100.0f, eVar.f714b.width() * 0.1f, eVar.f714b.width() * 0.05f);
            this.f682f = d;
            this.f683g = (((org.telegram.ui.Cells.t0.h(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * d;
            this.d = a1.g.d(org.telegram.ui.Cells.t0.h(Utilities.fastRandom, 100), 100.0f, eVar.f714b.height() * 0.1f, this.f682f / 2.0f);
            this.e = eVar.f714b.height() + this.f682f;
            this.f684i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float d10 = a1.g.d(org.telegram.ui.Cells.t0.h(Utilities.fastRandom, 100), 100.0f, eVar.f714b.width() * 0.1f, eVar.f714b.width() * 0.05f);
            this.f682f = d10;
            this.f683g = (((org.telegram.ui.Cells.t0.h(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * d10;
            this.d = c10;
            this.e = c10 + eVar.f714b.height();
            this.f684i = 1800L;
        }
        this.f684i = ((float) this.f684i) / 1.75f;
        this.f685j = Utilities.fastRandom.nextBoolean();
        this.f686k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        e eVar = this.f687l;
        if (eVar.f716f) {
            float width = eVar.f714b.width() * 1.5f;
            return a1.g.d(org.telegram.ui.Cells.t0.h(Utilities.fastRandom, 100), 100.0f, width, eVar.f714b.width() * (-0.25f));
        }
        return (org.telegram.ui.Cells.t0.h(Utilities.fastRandom, 100) / 100.0f) * eVar.f714b.width();
    }

    public final float c() {
        return (org.telegram.ui.Cells.t0.h(Utilities.fastRandom, 100) / 100.0f) * this.f687l.f714b.height() * 0.5f;
    }
}

package ah;

import org.telegram.messenger.Utilities;
public final class d {
    public float f677a;
    public float f678b;
    public float f679c;
    public float d;
    public float e;
    public float f680f;
    public float f681g;
    public float h;
    public long f682i;
    public boolean f683j;
    public float f684k;
    public final e f685l;

    public d(e eVar) {
        this.f685l = eVar;
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
            eVar = this.f685l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < eVar.f713c.size(); i11++) {
                float f12 = ((d) eVar.f713c.get(i11)).f679c - b11;
                float f13 = ((d) eVar.f713c.get(i11)).d - c11;
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
        if (eVar.f714f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f679c = b10;
        if (b10 > eVar.f712b.width() * f7) {
            this.f677a = eVar.f712b.width() * f7;
        } else {
            float width = eVar.f712b.width() * f7;
            this.f677a = width;
            if (this.f679c > width) {
                this.f679c = width - 0.1f;
            }
        }
        this.f678b = a1.g.d(org.telegram.ui.Cells.b1.g(Utilities.fastRandom, 100), 100.0f, eVar.f712b.height() * 0.1f, eVar.f712b.height() * 0.45f);
        if (eVar.f714f) {
            float d = a1.g.d(org.telegram.ui.Cells.b1.g(Utilities.fastRandom, 100), 100.0f, eVar.f712b.width() * 0.1f, eVar.f712b.width() * 0.05f);
            this.f680f = d;
            this.f681g = (((org.telegram.ui.Cells.b1.g(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * d;
            this.d = a1.g.d(org.telegram.ui.Cells.b1.g(Utilities.fastRandom, 100), 100.0f, eVar.f712b.height() * 0.1f, this.f680f / 2.0f);
            this.e = eVar.f712b.height() + this.f680f;
            this.f682i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float d10 = a1.g.d(org.telegram.ui.Cells.b1.g(Utilities.fastRandom, 100), 100.0f, eVar.f712b.width() * 0.1f, eVar.f712b.width() * 0.05f);
            this.f680f = d10;
            this.f681g = (((org.telegram.ui.Cells.b1.g(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * d10;
            this.d = c10;
            this.e = c10 + eVar.f712b.height();
            this.f682i = 1800L;
        }
        this.f682i = ((float) this.f682i) / 1.75f;
        this.f683j = Utilities.fastRandom.nextBoolean();
        this.f684k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        e eVar = this.f685l;
        if (eVar.f714f) {
            float width = eVar.f712b.width() * 1.5f;
            return a1.g.d(org.telegram.ui.Cells.b1.g(Utilities.fastRandom, 100), 100.0f, width, eVar.f712b.width() * (-0.25f));
        }
        return (org.telegram.ui.Cells.b1.g(Utilities.fastRandom, 100) / 100.0f) * eVar.f712b.width();
    }

    public final float c() {
        return (org.telegram.ui.Cells.b1.g(Utilities.fastRandom, 100) / 100.0f) * this.f685l.f712b.height() * 0.5f;
    }
}

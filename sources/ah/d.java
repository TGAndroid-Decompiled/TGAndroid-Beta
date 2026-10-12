package ah;

import org.telegram.messenger.Utilities;
public final class d {
    public float f673a;
    public float f674b;
    public float f675c;
    public float d;
    public float e;
    public float f676f;
    public float f677g;
    public float h;
    public long f678i;
    public boolean f679j;
    public float f680k;
    public final e f681l;

    public d(e eVar) {
        this.f681l = eVar;
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
            eVar = this.f681l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < eVar.f709c.size(); i11++) {
                float f12 = ((d) eVar.f709c.get(i11)).f675c - b11;
                float f13 = ((d) eVar.f709c.get(i11)).d - c11;
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
        if (eVar.f710f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f675c = b10;
        if (b10 > eVar.f708b.width() * f7) {
            this.f673a = eVar.f708b.width() * f7;
        } else {
            float width = eVar.f708b.width() * f7;
            this.f673a = width;
            if (this.f675c > width) {
                this.f675c = width - 0.1f;
            }
        }
        this.f674b = a1.g.d(org.telegram.ui.Cells.d0.e(Utilities.fastRandom, 100), 100.0f, eVar.f708b.height() * 0.1f, eVar.f708b.height() * 0.45f);
        if (eVar.f710f) {
            float d = a1.g.d(org.telegram.ui.Cells.d0.e(Utilities.fastRandom, 100), 100.0f, eVar.f708b.width() * 0.1f, eVar.f708b.width() * 0.05f);
            this.f676f = d;
            this.f677g = (((org.telegram.ui.Cells.d0.e(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * d;
            this.d = a1.g.d(org.telegram.ui.Cells.d0.e(Utilities.fastRandom, 100), 100.0f, eVar.f708b.height() * 0.1f, this.f676f / 2.0f);
            this.e = eVar.f708b.height() + this.f676f;
            this.f678i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float d10 = a1.g.d(org.telegram.ui.Cells.d0.e(Utilities.fastRandom, 100), 100.0f, eVar.f708b.width() * 0.1f, eVar.f708b.width() * 0.05f);
            this.f676f = d10;
            this.f677g = (((org.telegram.ui.Cells.d0.e(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * d10;
            this.d = c10;
            this.e = c10 + eVar.f708b.height();
            this.f678i = 1800L;
        }
        this.f678i = ((float) this.f678i) / 1.75f;
        this.f679j = Utilities.fastRandom.nextBoolean();
        this.f680k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        e eVar = this.f681l;
        if (eVar.f710f) {
            float width = eVar.f708b.width() * 1.5f;
            return a1.g.d(org.telegram.ui.Cells.d0.e(Utilities.fastRandom, 100), 100.0f, width, eVar.f708b.width() * (-0.25f));
        }
        return (org.telegram.ui.Cells.d0.e(Utilities.fastRandom, 100) / 100.0f) * eVar.f708b.width();
    }

    public final float c() {
        return (org.telegram.ui.Cells.d0.e(Utilities.fastRandom, 100) / 100.0f) * this.f681l.f708b.height() * 0.5f;
    }
}

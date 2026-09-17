package ah;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.p6;
public final class d {
    public float f471a;
    public float f472b;
    public float f473c;
    public float d;
    public float f474e;
    public float f475f;
    public float f476g;
    public float h;
    public long f477i;
    public boolean f478j;
    public float f479k;
    public final e f480l;

    public d(e eVar) {
        this.f480l = eVar;
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
            eVar = this.f480l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < eVar.f496c.size(); i11++) {
                float f12 = ((d) eVar.f496c.get(i11)).f473c - b11;
                float f13 = ((d) eVar.f496c.get(i11)).d - c11;
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
        if (eVar.f498f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f473c = b10;
        if (b10 > eVar.f495b.width() * f7) {
            this.f471a = eVar.f495b.width() * f7;
        } else {
            float width = eVar.f495b.width() * f7;
            this.f471a = width;
            if (this.f473c > width) {
                this.f473c = width - 0.1f;
            }
        }
        float height = eVar.f495b.height() * 0.1f;
        this.f472b = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, height, eVar.f495b.height() * 0.45f);
        if (eVar.f498f) {
            float width2 = eVar.f495b.width() * 0.1f;
            float e7 = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, width2, eVar.f495b.width() * 0.05f);
            this.f475f = e7;
            this.f476g = (((p6.c(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * e7;
            float height2 = eVar.f495b.height() * 0.1f;
            this.d = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, height2, this.f475f / 2.0f);
            this.f474e = eVar.f495b.height() + this.f475f;
            this.f477i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = eVar.f495b.width() * 0.1f;
            float e10 = a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, width3, eVar.f495b.width() * 0.05f);
            this.f475f = e10;
            this.f476g = (((p6.c(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * e10;
            this.d = c10;
            this.f474e = c10 + eVar.f495b.height();
            this.f477i = 1800L;
        }
        this.f477i = ((float) this.f477i) / 1.75f;
        this.f478j = Utilities.fastRandom.nextBoolean();
        this.f479k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        e eVar = this.f480l;
        if (eVar.f498f) {
            float width = eVar.f495b.width() * 1.5f;
            return a4.a.e(p6.c(Utilities.fastRandom, 100), 100.0f, width, eVar.f495b.width() * (-0.25f));
        }
        return (p6.c(Utilities.fastRandom, 100) / 100.0f) * eVar.f495b.width();
    }

    public final float c() {
        return (p6.c(Utilities.fastRandom, 100) / 100.0f) * this.f480l.f495b.height() * 0.5f;
    }
}

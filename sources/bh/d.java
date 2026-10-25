package bh;

import org.telegram.messenger.Utilities;
import org.telegram.ui.d3;
public final class d {
    public float f4001a;
    public float f4002b;
    public float f4003c;
    public float d;
    public float e;
    public float f4004f;
    public float f4005g;
    public float h;
    public long f4006i;
    public boolean f4007j;
    public float f4008k;
    public final e f4009l;

    public d(e eVar) {
        this.f4009l = eVar;
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
            eVar = this.f4009l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c11 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < eVar.f4016c.size(); i11++) {
                float f12 = ((d) eVar.f4016c.get(i11)).f4003c - b11;
                float f13 = ((d) eVar.f4016c.get(i11)).d - c11;
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
        if (eVar.f4017f) {
            f7 = 0.8f;
        } else {
            f7 = 0.5f;
        }
        this.f4003c = b10;
        if (b10 > eVar.f4015b.width() * f7) {
            this.f4001a = eVar.f4015b.width() * f7;
        } else {
            float width = eVar.f4015b.width() * f7;
            this.f4001a = width;
            if (this.f4003c > width) {
                this.f4003c = width - 0.1f;
            }
        }
        this.f4002b = a1.g.c(d3.j(Utilities.fastRandom, 100), 100.0f, eVar.f4015b.height() * 0.1f, eVar.f4015b.height() * 0.45f);
        if (eVar.f4017f) {
            float c12 = a1.g.c(d3.j(Utilities.fastRandom, 100), 100.0f, eVar.f4015b.width() * 0.1f, eVar.f4015b.width() * 0.05f);
            this.f4004f = c12;
            this.f4005g = (((d3.j(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * c12;
            this.d = a1.g.c(d3.j(Utilities.fastRandom, 100), 100.0f, eVar.f4015b.height() * 0.1f, this.f4004f / 2.0f);
            this.e = eVar.f4015b.height() + this.f4004f;
            this.f4006i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float c13 = a1.g.c(d3.j(Utilities.fastRandom, 100), 100.0f, eVar.f4015b.width() * 0.1f, eVar.f4015b.width() * 0.05f);
            this.f4004f = c13;
            this.f4005g = (((d3.j(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * c13;
            this.d = c10;
            this.e = c10 + eVar.f4015b.height();
            this.f4006i = 1800L;
        }
        this.f4006i = ((float) this.f4006i) / 1.75f;
        this.f4007j = Utilities.fastRandom.nextBoolean();
        this.f4008k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        e eVar = this.f4009l;
        if (eVar.f4017f) {
            float width = eVar.f4015b.width() * 1.5f;
            return a1.g.c(d3.j(Utilities.fastRandom, 100), 100.0f, width, eVar.f4015b.width() * (-0.25f));
        }
        return (d3.j(Utilities.fastRandom, 100) / 100.0f) * eVar.f4015b.width();
    }

    public final float c() {
        return (d3.j(Utilities.fastRandom, 100) / 100.0f) * this.f4009l.f4015b.height() * 0.5f;
    }
}

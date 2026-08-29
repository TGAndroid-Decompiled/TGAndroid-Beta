package kg;

import org.telegram.messenger.Utilities;
import org.telegram.ui.th;
public final class c {
    public float f13651a;
    public float f13652b;
    public float f13653c;
    public float d;
    public float f13654e;
    public float f13655f;
    public float f13656g;
    public float h;
    public long f13657i;
    public boolean f13658j;
    public float f13659k;
    public final d f13660l;

    public c(d dVar) {
        this.f13660l = dVar;
    }

    public final void a() {
        d dVar;
        float f9;
        float f10 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c3 = c();
        int i10 = 0;
        while (true) {
            dVar = this.f13660l;
            if (i10 >= 20) {
                break;
            }
            float b11 = b();
            float c6 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f13673c.size(); i11++) {
                float f12 = ((c) dVar.f13673c.get(i11)).f13653c - b11;
                float f13 = ((c) dVar.f13673c.get(i11)).d - c6;
                float f14 = (f13 * f13) + (f12 * f12);
                if (f14 < f11) {
                    f11 = f14;
                }
            }
            if (f11 > f10) {
                b10 = b11;
                c3 = c6;
                f10 = f11;
            }
            i10++;
        }
        if (dVar.f13675f) {
            f9 = 0.8f;
        } else {
            f9 = 0.5f;
        }
        this.f13653c = b10;
        if (b10 > dVar.f13672b.width() * f9) {
            this.f13651a = dVar.f13672b.width() * f9;
        } else {
            float width = dVar.f13672b.width() * f9;
            this.f13651a = width;
            if (this.f13653c > width) {
                this.f13653c = width - 0.1f;
            }
        }
        float height = dVar.f13672b.height() * 0.1f;
        this.f13652b = u3.c.c(th.f(Utilities.fastRandom, 100), 100.0f, height, dVar.f13672b.height() * 0.45f);
        if (dVar.f13675f) {
            float width2 = dVar.f13672b.width() * 0.1f;
            float c10 = u3.c.c(th.f(Utilities.fastRandom, 100), 100.0f, width2, dVar.f13672b.width() * 0.05f);
            this.f13655f = c10;
            this.f13656g = (((th.f(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * c10;
            float height2 = dVar.f13672b.height() * 0.1f;
            this.d = u3.c.c(th.f(Utilities.fastRandom, 100), 100.0f, height2, this.f13655f / 2.0f);
            this.f13654e = dVar.f13672b.height() + this.f13655f;
            this.f13657i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float width3 = dVar.f13672b.width() * 0.1f;
            float c11 = u3.c.c(th.f(Utilities.fastRandom, 100), 100.0f, width3, dVar.f13672b.width() * 0.05f);
            this.f13655f = c11;
            this.f13656g = (((th.f(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * c11;
            this.d = c3;
            this.f13654e = c3 + dVar.f13672b.height();
            this.f13657i = 1800L;
        }
        this.f13657i = ((float) this.f13657i) / 1.75f;
        this.f13658j = Utilities.fastRandom.nextBoolean();
        this.f13659k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f13660l;
        if (dVar.f13675f) {
            float width = dVar.f13672b.width() * 1.5f;
            return u3.c.c(th.f(Utilities.fastRandom, 100), 100.0f, width, dVar.f13672b.width() * (-0.25f));
        }
        return (th.f(Utilities.fastRandom, 100) / 100.0f) * dVar.f13672b.width();
    }

    public final float c() {
        return (th.f(Utilities.fastRandom, 100) / 100.0f) * this.f13660l.f13672b.height() * 0.5f;
    }
}

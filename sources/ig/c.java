package ig;

import org.telegram.messenger.Utilities;
import org.telegram.ui.Cells.pa;

public final class c {

    public float f11238a;

    public float f11239b;

    public float f11240c;
    public float d;

    public float f11241e;

    public float f11242f;

    public float f11243g;
    public float h;

    public long f11244i;

    public boolean f11245j;

    public float f11246k;

    public final d f11247l;

    public c(d dVar) {
        this.f11247l = dVar;
    }

    public final void a() {
        d dVar;
        float f10 = 0.0f;
        this.h = 0.0f;
        float fB = b();
        float fC = c();
        int i10 = 0;
        while (true) {
            dVar = this.f11247l;
            if (i10 >= 20) {
                break;
            }
            float fB2 = b();
            float fC2 = c();
            float f11 = 2.1474836E9f;
            for (int i11 = 0; i11 < dVar.f11260c.size(); i11++) {
                float f12 = ((c) dVar.f11260c.get(i11)).f11240c - fB2;
                float f13 = ((c) dVar.f11260c.get(i11)).d - fC2;
                float f14 = (f13 * f13) + (f12 * f12);
                if (f14 < f11) {
                    f11 = f14;
                }
            }
            if (f11 > f10) {
                fB = fB2;
                fC = fC2;
                f10 = f11;
            }
            i10++;
        }
        float f15 = dVar.f11262f ? 0.8f : 0.5f;
        this.f11240c = fB;
        if (fB > dVar.f11259b.width() * f15) {
            this.f11238a = dVar.f11259b.width() * f15;
        } else {
            float fWidth = dVar.f11259b.width() * f15;
            this.f11238a = fWidth;
            if (this.f11240c > fWidth) {
                this.f11240c = fWidth - 0.1f;
            }
        }
        this.f11239b = s3.c.c(pa.f(Utilities.fastRandom, 100), 100.0f, dVar.f11259b.height() * 0.1f, dVar.f11259b.height() * 0.45f);
        if (dVar.f11262f) {
            float fC3 = s3.c.c(pa.f(Utilities.fastRandom, 100), 100.0f, dVar.f11259b.width() * 0.1f, dVar.f11259b.width() * 0.05f);
            this.f11242f = fC3;
            this.f11243g = (((pa.f(Utilities.fastRandom, 100) / 100.0f) * 1.5f) + 1.5f) * fC3;
            this.d = s3.c.c(pa.f(Utilities.fastRandom, 100), 100.0f, dVar.f11259b.height() * 0.1f, this.f11242f / 2.0f);
            this.f11241e = dVar.f11259b.height() + this.f11242f;
            this.f11244i = Math.abs(Utilities.fastRandom.nextInt() % 600) + 1000;
        } else {
            float fC4 = s3.c.c(pa.f(Utilities.fastRandom, 100), 100.0f, dVar.f11259b.width() * 0.1f, dVar.f11259b.width() * 0.05f);
            this.f11242f = fC4;
            this.f11243g = (((pa.f(Utilities.fastRandom, 100) / 100.0f) * 0.5f) + 1.5f) * fC4;
            this.d = fC;
            this.f11241e = fC + dVar.f11259b.height();
            this.f11244i = 1800L;
        }
        this.f11244i = (long) (this.f11244i / 1.75f);
        this.f11245j = Utilities.fastRandom.nextBoolean();
        this.f11246k = ((Utilities.fastRandom.nextInt() % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f11247l;
        if (!dVar.f11262f) {
            return (pa.f(Utilities.fastRandom, 100) / 100.0f) * dVar.f11259b.width();
        }
        return s3.c.c(pa.f(Utilities.fastRandom, 100), 100.0f, dVar.f11259b.width() * 1.5f, dVar.f11259b.width() * (-0.25f));
    }

    public final float c() {
        return (pa.f(Utilities.fastRandom, 100) / 100.0f) * this.f11247l.f11259b.height() * 0.5f;
    }
}

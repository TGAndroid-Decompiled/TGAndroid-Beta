package dh;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class c {
    public float f8959a;
    public float f8960b;
    public float f8961c;
    public float d;
    public float f8962e;
    public float f8963f;
    public float f8964g;
    public float h;
    public long f8965i;
    public boolean f8966j;
    public float f8967k;
    public final d f8968l;

    public c(d dVar) {
        this.f8968l = dVar;
    }

    public final void a() {
        float f10;
        d dVar = this.f8968l;
        boolean z10 = dVar.f8976f;
        ArrayList arrayList = dVar.f8974c;
        Rect rect = dVar.f8973b;
        float f11 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c2 = c();
        for (int i3 = 0; i3 < 20; i3++) {
            float b11 = b();
            float c10 = c();
            float f12 = 2.1474836E9f;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                float f13 = ((c) arrayList.get(i10)).f8961c - b11;
                float f14 = ((c) arrayList.get(i10)).d - c10;
                float f15 = (f14 * f14) + (f13 * f13);
                if (f15 < f12) {
                    f12 = f15;
                }
            }
            if (f12 > f11) {
                b10 = b11;
                c2 = c10;
                f11 = f12;
            }
        }
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 0.5f;
        }
        this.f8961c = b10;
        if (b10 > rect.width() * f10) {
            this.f8959a = rect.width() * f10;
        } else {
            float width = rect.width() * f10;
            this.f8959a = width;
            if (this.f8961c > width) {
                this.f8961c = width - 0.1f;
            }
        }
        f5.a aVar = Utilities.f21386c;
        this.f8960b = a1.g.A(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, rect.height() * 0.45f);
        if (z10) {
            float A = a1.g.A(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f8963f = A;
            this.f8964g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 1.5f) + 1.5f) * A;
            this.d = a1.g.A(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, this.f8963f / 2.0f);
            this.f8962e = rect.height() + this.f8963f;
            this.f8965i = Math.abs(((int) aVar.nextLong()) % 600) + 1000;
        } else {
            float A2 = a1.g.A(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f8963f = A2;
            this.f8964g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 0.5f) + 1.5f) * A2;
            this.d = c2;
            this.f8962e = c2 + rect.height();
            this.f8965i = 1800L;
        }
        this.f8965i = ((float) this.f8965i) / 1.75f;
        this.f8966j = aVar.nextBoolean();
        this.f8967k = ((((int) aVar.nextLong()) % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f8968l;
        Rect rect = dVar.f8973b;
        if (dVar.f8976f) {
            float width = rect.width() * 1.5f;
            return a1.g.A(Math.abs(((int) Utilities.f21386c.nextLong()) % 100), 100.0f, width, rect.width() * (-0.25f));
        }
        return (Math.abs(((int) Utilities.f21386c.nextLong()) % 100) / 100.0f) * rect.width();
    }

    public final float c() {
        return (Math.abs(((int) Utilities.f21386c.nextLong()) % 100) / 100.0f) * this.f8968l.f8973b.height() * 0.5f;
    }
}

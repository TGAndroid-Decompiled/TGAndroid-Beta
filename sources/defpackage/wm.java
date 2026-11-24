package defpackage;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class wm {
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public long i;
    public boolean j;
    public float k;
    public final xm l;

    public wm(xm xmVar) {
        this.l = xmVar;
    }

    public final void a() {
        float f;
        long j;
        xm xmVar = this.l;
        boolean z = xmVar.f;
        ArrayList arrayList = xmVar.c;
        Rect rect = xmVar.b;
        float f2 = 0.0f;
        this.h = 0.0f;
        float b = b();
        float c = c();
        for (int i = 0; i < 20; i++) {
            float b2 = b();
            float c2 = c();
            float f3 = 2.1474836E9f;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                float f4 = ((wm) arrayList.get(i2)).c - b2;
                float f5 = ((wm) arrayList.get(i2)).d - c2;
                float f6 = (f5 * f5) + (f4 * f4);
                if (f6 < f3) {
                    f3 = f6;
                }
            }
            if (f3 > f2) {
                b = b2;
                c = c2;
                f2 = f3;
            }
        }
        if (z) {
            f = 0.8f;
        } else {
            f = 0.5f;
        }
        this.c = b;
        if (b > rect.width() * f) {
            this.a = rect.width() * f;
        } else {
            float width = rect.width() * f;
            this.a = width;
            if (this.c > width) {
                this.c = width - 0.1f;
            }
        }
        z0d z0dVar = Utilities.c;
        this.b = b10.A(Math.abs(((int) z0dVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, rect.height() * 0.45f);
        if (z) {
            float A = b10.A(Math.abs(((int) z0dVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f = A;
            this.g = (((Math.abs(((int) z0dVar.nextLong()) % 100) / 100.0f) * 1.5f) + 1.5f) * A;
            this.d = b10.A(Math.abs(((int) z0dVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, this.f / 2.0f);
            this.e = rect.height() + this.f;
            j = Math.abs(((int) z0dVar.nextLong()) % 600) + 1000;
            this.i = j;
        } else {
            float A2 = b10.A(Math.abs(((int) z0dVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f = A2;
            this.g = (((Math.abs(((int) z0dVar.nextLong()) % 100) / 100.0f) * 0.5f) + 1.5f) * A2;
            this.d = c;
            this.e = c + rect.height();
            j = 1800;
            this.i = 1800L;
        }
        this.i = ((float) j) / 1.75f;
        this.j = z0dVar.nextBoolean();
        this.k = ((((int) z0dVar.nextLong()) % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        xm xmVar = this.l;
        boolean z = xmVar.f;
        Rect rect = xmVar.b;
        if (z) {
            float width = rect.width() * 1.5f;
            return b10.A(Math.abs(((int) Utilities.c.nextLong()) % 100), 100.0f, width, rect.width() * (-0.25f));
        }
        return (Math.abs(((int) Utilities.c.nextLong()) % 100) / 100.0f) * rect.width();
    }

    public final float c() {
        return (Math.abs(((int) Utilities.c.nextLong()) % 100) / 100.0f) * this.l.b.height() * 0.5f;
    }
}

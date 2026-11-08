package ch;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class c {
    public float f6206a;
    public float f6207b;
    public float f6208c;
    public float d;
    public float f6209e;
    public float f6210f;
    public float f6211g;
    public float h;
    public long f6212i;
    public boolean f6213j;
    public float f6214k;
    public final d f6215l;

    public c(d dVar) {
        this.f6215l = dVar;
    }

    public final void a() {
        float f10;
        d dVar = this.f6215l;
        boolean z9 = dVar.f6221f;
        ArrayList arrayList = dVar.f6219c;
        Rect rect = dVar.f6218b;
        float f11 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c10 = c();
        for (int i7 = 0; i7 < 20; i7++) {
            float b11 = b();
            float c11 = c();
            float f12 = 2.1474836E9f;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                float f13 = ((c) arrayList.get(i10)).f6208c - b11;
                float f14 = ((c) arrayList.get(i10)).d - c11;
                float f15 = (f14 * f14) + (f13 * f13);
                if (f15 < f12) {
                    f12 = f15;
                }
            }
            if (f12 > f11) {
                b10 = b11;
                c10 = c11;
                f11 = f12;
            }
        }
        if (z9) {
            f10 = 0.8f;
        } else {
            f10 = 0.5f;
        }
        this.f6208c = b10;
        if (b10 > rect.width() * f10) {
            this.f6206a = rect.width() * f10;
        } else {
            float width = rect.width() * f10;
            this.f6206a = width;
            if (this.f6208c > width) {
                this.f6208c = width - 0.1f;
            }
        }
        g5.a aVar = Utilities.f21335c;
        this.f6207b = com.google.android.recaptcha.internal.a.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, rect.height() * 0.45f);
        if (z9) {
            float c12 = com.google.android.recaptcha.internal.a.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f6210f = c12;
            this.f6211g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 1.5f) + 1.5f) * c12;
            this.d = com.google.android.recaptcha.internal.a.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, this.f6210f / 2.0f);
            this.f6209e = rect.height() + this.f6210f;
            this.f6212i = Math.abs(((int) aVar.nextLong()) % 600) + 1000;
        } else {
            float c13 = com.google.android.recaptcha.internal.a.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f6210f = c13;
            this.f6211g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 0.5f) + 1.5f) * c13;
            this.d = c10;
            this.f6209e = c10 + rect.height();
            this.f6212i = 1800L;
        }
        this.f6212i = ((float) this.f6212i) / 1.75f;
        this.f6213j = aVar.nextBoolean();
        this.f6214k = ((((int) aVar.nextLong()) % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f6215l;
        Rect rect = dVar.f6218b;
        if (dVar.f6221f) {
            float width = rect.width() * 1.5f;
            return com.google.android.recaptcha.internal.a.c(Math.abs(((int) Utilities.f21335c.nextLong()) % 100), 100.0f, width, rect.width() * (-0.25f));
        }
        return (Math.abs(((int) Utilities.f21335c.nextLong()) % 100) / 100.0f) * rect.width();
    }

    public final float c() {
        return (Math.abs(((int) Utilities.f21335c.nextLong()) % 100) / 100.0f) * this.f6215l.f6218b.height() * 0.5f;
    }
}

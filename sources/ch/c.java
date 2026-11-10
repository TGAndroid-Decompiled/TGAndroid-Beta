package ch;

import android.graphics.Rect;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class c {
    public float f6209a;
    public float f6210b;
    public float f6211c;
    public float d;
    public float f6212e;
    public float f6213f;
    public float f6214g;
    public float h;
    public long f6215i;
    public boolean f6216j;
    public float f6217k;
    public final d f6218l;

    public c(d dVar) {
        this.f6218l = dVar;
    }

    public final void a() {
        float f10;
        d dVar = this.f6218l;
        boolean z9 = dVar.f6224f;
        ArrayList arrayList = dVar.f6222c;
        Rect rect = dVar.f6221b;
        float f11 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c10 = c();
        for (int i7 = 0; i7 < 20; i7++) {
            float b11 = b();
            float c11 = c();
            float f12 = 2.1474836E9f;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                float f13 = ((c) arrayList.get(i10)).f6211c - b11;
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
        this.f6211c = b10;
        if (b10 > rect.width() * f10) {
            this.f6209a = rect.width() * f10;
        } else {
            float width = rect.width() * f10;
            this.f6209a = width;
            if (this.f6211c > width) {
                this.f6211c = width - 0.1f;
            }
        }
        g5.a aVar = Utilities.f21340c;
        this.f6210b = com.google.android.recaptcha.internal.a.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, rect.height() * 0.45f);
        if (z9) {
            float c12 = com.google.android.recaptcha.internal.a.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f6213f = c12;
            this.f6214g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 1.5f) + 1.5f) * c12;
            this.d = com.google.android.recaptcha.internal.a.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, this.f6213f / 2.0f);
            this.f6212e = rect.height() + this.f6213f;
            this.f6215i = Math.abs(((int) aVar.nextLong()) % 600) + 1000;
        } else {
            float c13 = com.google.android.recaptcha.internal.a.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f6213f = c13;
            this.f6214g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 0.5f) + 1.5f) * c13;
            this.d = c10;
            this.f6212e = c10 + rect.height();
            this.f6215i = 1800L;
        }
        this.f6215i = ((float) this.f6215i) / 1.75f;
        this.f6216j = aVar.nextBoolean();
        this.f6217k = ((((int) aVar.nextLong()) % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f6218l;
        Rect rect = dVar.f6221b;
        if (dVar.f6224f) {
            float width = rect.width() * 1.5f;
            return com.google.android.recaptcha.internal.a.c(Math.abs(((int) Utilities.f21340c.nextLong()) % 100), 100.0f, width, rect.width() * (-0.25f));
        }
        return (Math.abs(((int) Utilities.f21340c.nextLong()) % 100) / 100.0f) * rect.width();
    }

    public final float c() {
        return (Math.abs(((int) Utilities.f21340c.nextLong()) % 100) / 100.0f) * this.f6218l.f6221b.height() * 0.5f;
    }
}

package ch;

import android.graphics.Rect;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class c {
    public float f5031a;
    public float f5032b;
    public float f5033c;
    public float d;
    public float f5034e;
    public float f5035f;
    public float f5036g;
    public float h;
    public long f5037i;
    public boolean f5038j;
    public float f5039k;
    public final d f5040l;

    public c(d dVar) {
        this.f5040l = dVar;
    }

    public final void a() {
        float f10;
        d dVar = this.f5040l;
        boolean z10 = dVar.f5048f;
        ArrayList arrayList = dVar.f5046c;
        Rect rect = dVar.f5045b;
        float f11 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c10 = c();
        for (int i7 = 0; i7 < 20; i7++) {
            float b11 = b();
            float c11 = c();
            float f12 = 2.1474836E9f;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                float f13 = ((c) arrayList.get(i10)).f5033c - b11;
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
        if (z10) {
            f10 = 0.8f;
        } else {
            f10 = 0.5f;
        }
        this.f5033c = b10;
        if (b10 > rect.width() * f10) {
            this.f5031a = rect.width() * f10;
        } else {
            float width = rect.width() * f10;
            this.f5031a = width;
            if (this.f5033c > width) {
                this.f5033c = width - 0.1f;
            }
        }
        g5.a aVar = Utilities.f22415c;
        this.f5032b = e2.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, rect.height() * 0.45f);
        if (z10) {
            float c12 = e2.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f5035f = c12;
            this.f5036g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 1.5f) + 1.5f) * c12;
            this.d = e2.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, this.f5035f / 2.0f);
            this.f5034e = rect.height() + this.f5035f;
            this.f5037i = Math.abs(((int) aVar.nextLong()) % 600) + 1000;
        } else {
            float c13 = e2.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f5035f = c13;
            this.f5036g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 0.5f) + 1.5f) * c13;
            this.d = c10;
            this.f5034e = c10 + rect.height();
            this.f5037i = 1800L;
        }
        this.f5037i = ((float) this.f5037i) / 1.75f;
        this.f5038j = aVar.nextBoolean();
        this.f5039k = ((((int) aVar.nextLong()) % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f5040l;
        Rect rect = dVar.f5045b;
        if (dVar.f5048f) {
            float width = rect.width() * 1.5f;
            return e2.c(Math.abs(((int) Utilities.f22415c.nextLong()) % 100), 100.0f, width, rect.width() * (-0.25f));
        }
        return (Math.abs(((int) Utilities.f22415c.nextLong()) % 100) / 100.0f) * rect.width();
    }

    public final float c() {
        return (Math.abs(((int) Utilities.f22415c.nextLong()) % 100) / 100.0f) * this.f5040l.f5045b.height() * 0.5f;
    }
}

package ch;

import android.graphics.Rect;
import com.google.android.gms.internal.vision.e2;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class c {
    public float f5349a;
    public float f5350b;
    public float f5351c;
    public float d;
    public float f5352e;
    public float f5353f;
    public float f5354g;
    public float h;
    public long f5355i;
    public boolean f5356j;
    public float f5357k;
    public final d f5358l;

    public c(d dVar) {
        this.f5358l = dVar;
    }

    public final void a() {
        float f10;
        d dVar = this.f5358l;
        boolean z10 = dVar.f5366f;
        ArrayList arrayList = dVar.f5364c;
        Rect rect = dVar.f5363b;
        float f11 = 0.0f;
        this.h = 0.0f;
        float b10 = b();
        float c10 = c();
        for (int i7 = 0; i7 < 20; i7++) {
            float b11 = b();
            float c11 = c();
            float f12 = 2.1474836E9f;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                float f13 = ((c) arrayList.get(i10)).f5351c - b11;
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
        this.f5351c = b10;
        if (b10 > rect.width() * f10) {
            this.f5349a = rect.width() * f10;
        } else {
            float width = rect.width() * f10;
            this.f5349a = width;
            if (this.f5351c > width) {
                this.f5351c = width - 0.1f;
            }
        }
        g5.a aVar = Utilities.f22809c;
        this.f5350b = e2.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, rect.height() * 0.45f);
        if (z10) {
            float c12 = e2.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f5353f = c12;
            this.f5354g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 1.5f) + 1.5f) * c12;
            this.d = e2.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.height() * 0.1f, this.f5353f / 2.0f);
            this.f5352e = rect.height() + this.f5353f;
            this.f5355i = Math.abs(((int) aVar.nextLong()) % 600) + 1000;
        } else {
            float c13 = e2.c(Math.abs(((int) aVar.nextLong()) % 100), 100.0f, rect.width() * 0.1f, rect.width() * 0.05f);
            this.f5353f = c13;
            this.f5354g = (((Math.abs(((int) aVar.nextLong()) % 100) / 100.0f) * 0.5f) + 1.5f) * c13;
            this.d = c10;
            this.f5352e = c10 + rect.height();
            this.f5355i = 1800L;
        }
        this.f5355i = ((float) this.f5355i) / 1.75f;
        this.f5356j = aVar.nextBoolean();
        this.f5357k = ((((int) aVar.nextLong()) % 100) / 100.0f) * 20.0f;
    }

    public final float b() {
        d dVar = this.f5358l;
        Rect rect = dVar.f5363b;
        if (dVar.f5366f) {
            float width = rect.width() * 1.5f;
            return e2.c(Math.abs(((int) Utilities.f22809c.nextLong()) % 100), 100.0f, width, rect.width() * (-0.25f));
        }
        return (Math.abs(((int) Utilities.f22809c.nextLong()) % 100) / 100.0f) * rect.width();
    }

    public final float c() {
        return (Math.abs(((int) Utilities.f22809c.nextLong()) % 100) / 100.0f) * this.f5358l.f5363b.height() * 0.5f;
    }
}

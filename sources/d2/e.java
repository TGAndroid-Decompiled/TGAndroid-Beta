package d2;

import android.graphics.Color;
import java.util.Arrays;
public final class e {
    public final int f5282a;
    public final int f5283b;
    public final int f5284c;
    public final int d;
    public final int f5285e;
    public boolean f5286f;
    public int f5287g;
    public int h;
    public float[] f5288i;

    public e(int i10, int i11) {
        this.f5282a = Color.red(i10);
        this.f5283b = Color.green(i10);
        this.f5284c = Color.blue(i10);
        this.d = i10;
        this.f5285e = i11;
    }

    public final void a() {
        int k9;
        int k10;
        if (!this.f5286f) {
            int i10 = this.d;
            int g10 = i0.a.g(4.5f, -1, i10);
            int g11 = i0.a.g(3.0f, -1, i10);
            if (g10 != -1 && g11 != -1) {
                this.h = i0.a.k(-1, g10);
                this.f5287g = i0.a.k(-1, g11);
                this.f5286f = true;
                return;
            }
            int g12 = i0.a.g(4.5f, -16777216, i10);
            int g13 = i0.a.g(3.0f, -16777216, i10);
            if (g12 != -1 && g13 != -1) {
                this.h = i0.a.k(-16777216, g12);
                this.f5287g = i0.a.k(-16777216, g13);
                this.f5286f = true;
                return;
            }
            if (g10 != -1) {
                k9 = i0.a.k(-1, g10);
            } else {
                k9 = i0.a.k(-16777216, g12);
            }
            this.h = k9;
            if (g11 != -1) {
                k10 = i0.a.k(-1, g11);
            } else {
                k10 = i0.a.k(-16777216, g13);
            }
            this.f5287g = k10;
            this.f5286f = true;
        }
    }

    public final float[] b() {
        if (this.f5288i == null) {
            this.f5288i = new float[3];
        }
        i0.a.b(this.f5288i, this.f5282a, this.f5283b, this.f5284c);
        return this.f5288i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f5285e == eVar.f5285e && this.d == eVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f5285e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(e.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f5285e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f5287g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}

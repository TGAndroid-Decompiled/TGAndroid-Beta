package d2;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f4177a;
    public final int f4178b;
    public final int f4179c;
    public final int d;
    public final int f4180e;
    public boolean f4181f;
    public int f4182g;
    public int h;
    public float[] f4183i;

    public d(int i10, int i11) {
        this.f4177a = Color.red(i10);
        this.f4178b = Color.green(i10);
        this.f4179c = Color.blue(i10);
        this.d = i10;
        this.f4180e = i11;
    }

    public final void a() {
        int k10;
        int k11;
        if (!this.f4181f) {
            int i10 = this.d;
            int g10 = i0.a.g(4.5f, -1, i10);
            int g11 = i0.a.g(3.0f, -1, i10);
            if (g10 != -1 && g11 != -1) {
                this.h = i0.a.k(-1, g10);
                this.f4182g = i0.a.k(-1, g11);
                this.f4181f = true;
                return;
            }
            int g12 = i0.a.g(4.5f, -16777216, i10);
            int g13 = i0.a.g(3.0f, -16777216, i10);
            if (g12 != -1 && g13 != -1) {
                this.h = i0.a.k(-16777216, g12);
                this.f4182g = i0.a.k(-16777216, g13);
                this.f4181f = true;
                return;
            }
            if (g10 != -1) {
                k10 = i0.a.k(-1, g10);
            } else {
                k10 = i0.a.k(-16777216, g12);
            }
            this.h = k10;
            if (g11 != -1) {
                k11 = i0.a.k(-1, g11);
            } else {
                k11 = i0.a.k(-16777216, g13);
            }
            this.f4182g = k11;
            this.f4181f = true;
        }
    }

    public final float[] b() {
        if (this.f4183i == null) {
            this.f4183i = new float[3];
        }
        i0.a.b(this.f4183i, this.f4177a, this.f4178b, this.f4179c);
        return this.f4183i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f4180e == dVar.f4180e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f4180e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(d.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.f4180e);
        sb.append("] [Title Text: #");
        a();
        sb.append(Integer.toHexString(this.f4182g));
        sb.append("] [Body Text: #");
        a();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}

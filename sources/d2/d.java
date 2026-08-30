package d2;

import android.graphics.Color;
import java.util.Arrays;
public final class d {
    public final int f4114a;
    public final int f4115b;
    public final int f4116c;
    public final int d;
    public final int e;
    public boolean f4117f;
    public int f4118g;
    public int h;
    public float[] f4119i;

    public d(int i10, int i11) {
        this.f4114a = Color.red(i10);
        this.f4115b = Color.green(i10);
        this.f4116c = Color.blue(i10);
        this.d = i10;
        this.e = i11;
    }

    public final void a() {
        int k10;
        int k11;
        if (!this.f4117f) {
            int i10 = this.d;
            int g10 = i0.a.g(4.5f, -1, i10);
            int g11 = i0.a.g(3.0f, -1, i10);
            if (g10 != -1 && g11 != -1) {
                this.h = i0.a.k(-1, g10);
                this.f4118g = i0.a.k(-1, g11);
                this.f4117f = true;
                return;
            }
            int g12 = i0.a.g(4.5f, -16777216, i10);
            int g13 = i0.a.g(3.0f, -16777216, i10);
            if (g12 != -1 && g13 != -1) {
                this.h = i0.a.k(-16777216, g12);
                this.f4118g = i0.a.k(-16777216, g13);
                this.f4117f = true;
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
            this.f4118g = k11;
            this.f4117f = true;
        }
    }

    public final float[] b() {
        if (this.f4119i == null) {
            this.f4119i = new float[3];
        }
        i0.a.b(this.f4119i, this.f4114a, this.f4115b, this.f4116c);
        return this.f4119i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.e == dVar.e && this.d == dVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(d.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.e);
        sb.append("] [Title Text: #");
        a();
        sb.append(Integer.toHexString(this.f4118g));
        sb.append("] [Body Text: #");
        a();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}

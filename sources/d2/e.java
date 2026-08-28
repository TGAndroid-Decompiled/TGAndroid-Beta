package d2;

import android.graphics.Color;
import java.util.Arrays;
public final class e {
    public final int f4273a;
    public final int f4274b;
    public final int f4275c;
    public final int d;
    public final int f4276e;
    public boolean f4277f;
    public int f4278g;
    public int h;
    public float[] f4279i;

    public e(int i9, int i10) {
        this.f4273a = Color.red(i9);
        this.f4274b = Color.green(i9);
        this.f4275c = Color.blue(i9);
        this.d = i9;
        this.f4276e = i10;
    }

    public final void a() {
        int k10;
        int k11;
        if (!this.f4277f) {
            int i9 = this.d;
            int g10 = i0.a.g(4.5f, -1, i9);
            int g11 = i0.a.g(3.0f, -1, i9);
            if (g10 != -1 && g11 != -1) {
                this.h = i0.a.k(-1, g10);
                this.f4278g = i0.a.k(-1, g11);
                this.f4277f = true;
                return;
            }
            int g12 = i0.a.g(4.5f, -16777216, i9);
            int g13 = i0.a.g(3.0f, -16777216, i9);
            if (g12 != -1 && g13 != -1) {
                this.h = i0.a.k(-16777216, g12);
                this.f4278g = i0.a.k(-16777216, g13);
                this.f4277f = true;
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
            this.f4278g = k11;
            this.f4277f = true;
        }
    }

    public final float[] b() {
        if (this.f4279i == null) {
            this.f4279i = new float[3];
        }
        i0.a.b(this.f4279i, this.f4273a, this.f4274b, this.f4275c);
        return this.f4279i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f4276e == eVar.f4276e && this.d == eVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f4276e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(e.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f4276e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f4278g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}

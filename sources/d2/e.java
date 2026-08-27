package d2;

import android.graphics.Color;
import java.util.Arrays;

public final class e {

    public final int f4715a;

    public final int f4716b;

    public final int f4717c;
    public final int d;

    public final int f4718e;

    public boolean f4719f;

    public int f4720g;
    public int h;

    public float[] f4721i;

    public e(int i10, int i11) {
        this.f4715a = Color.red(i10);
        this.f4716b = Color.green(i10);
        this.f4717c = Color.blue(i10);
        this.d = i10;
        this.f4718e = i11;
    }

    public final void a() {
        if (this.f4719f) {
            return;
        }
        int i10 = this.d;
        int iG = i0.b.g(4.5f, -1, i10);
        int iG2 = i0.b.g(3.0f, -1, i10);
        if (iG != -1 && iG2 != -1) {
            this.h = i0.b.k(-1, iG);
            this.f4720g = i0.b.k(-1, iG2);
            this.f4719f = true;
            return;
        }
        int iG3 = i0.b.g(4.5f, -16777216, i10);
        int iG4 = i0.b.g(3.0f, -16777216, i10);
        if (iG3 == -1 || iG4 == -1) {
            this.h = iG != -1 ? i0.b.k(-1, iG) : i0.b.k(-16777216, iG3);
            this.f4720g = iG2 != -1 ? i0.b.k(-1, iG2) : i0.b.k(-16777216, iG4);
            this.f4719f = true;
        } else {
            this.h = i0.b.k(-16777216, iG3);
            this.f4720g = i0.b.k(-16777216, iG4);
            this.f4719f = true;
        }
    }

    public final float[] b() {
        if (this.f4721i == null) {
            this.f4721i = new float[3];
        }
        i0.b.b(this.f4721i, this.f4715a, this.f4716b, this.f4717c);
        return this.f4721i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f4718e == eVar.f4718e && this.d == eVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.f4718e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(e.class.getSimpleName());
        sb2.append(" [RGB: #");
        sb2.append(Integer.toHexString(this.d));
        sb2.append("] [HSL: ");
        sb2.append(Arrays.toString(b()));
        sb2.append("] [Population: ");
        sb2.append(this.f4718e);
        sb2.append("] [Title Text: #");
        a();
        sb2.append(Integer.toHexString(this.f4720g));
        sb2.append("] [Body Text: #");
        a();
        sb2.append(Integer.toHexString(this.h));
        sb2.append(']');
        return sb2.toString();
    }
}

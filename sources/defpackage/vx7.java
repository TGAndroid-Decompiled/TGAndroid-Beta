package defpackage;

import android.graphics.Color;
import java.util.Arrays;
public final class vx7 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public boolean f;
    public int g;
    public int h;
    public float[] i;

    public vx7(int i, int i2) {
        this.a = Color.red(i);
        this.b = Color.green(i);
        this.c = Color.blue(i);
        this.d = i;
        this.e = i2;
    }

    public final void a() {
        int o;
        int o2;
        if (!this.f) {
            int i = this.d;
            int i2 = vm2.i(4.5f, -1, i);
            int i3 = vm2.i(3.0f, -1, i);
            if (i2 != -1 && i3 != -1) {
                this.h = vm2.o(-1, i2);
                this.g = vm2.o(-1, i3);
                this.f = true;
                return;
            }
            int i4 = vm2.i(4.5f, -16777216, i);
            int i5 = vm2.i(3.0f, -16777216, i);
            if (i4 != -1 && i5 != -1) {
                this.h = vm2.o(-16777216, i4);
                this.g = vm2.o(-16777216, i5);
                this.f = true;
                return;
            }
            if (i2 != -1) {
                o = vm2.o(-1, i2);
            } else {
                o = vm2.o(-16777216, i4);
            }
            this.h = o;
            if (i3 != -1) {
                o2 = vm2.o(-1, i3);
            } else {
                o2 = vm2.o(-16777216, i5);
            }
            this.g = o2;
            this.f = true;
        }
    }

    public final float[] b() {
        float[] fArr = this.i;
        if (fArr == null) {
            fArr = new float[3];
            this.i = fArr;
        }
        vm2.c(this.a, this.b, this.c, fArr);
        return this.i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vx7.class == obj.getClass()) {
            vx7 vx7Var = (vx7) obj;
            if (this.e == vx7Var.e && this.d == vx7Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(vx7.class.getSimpleName());
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.d));
        sb.append("] [HSL: ");
        sb.append(Arrays.toString(b()));
        sb.append("] [Population: ");
        sb.append(this.e);
        sb.append("] [Title Text: #");
        a();
        sb.append(Integer.toHexString(this.g));
        sb.append("] [Body Text: #");
        a();
        sb.append(Integer.toHexString(this.h));
        sb.append(']');
        return sb.toString();
    }
}

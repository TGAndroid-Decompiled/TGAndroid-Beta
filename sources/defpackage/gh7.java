package defpackage;

import java.util.Arrays;
public final class gh7 {
    public float a;
    public float[] b;
    public int[] c;
    public boolean d;
    public int[] e;
    public float f;

    public final String toString() {
        String str;
        if (this.d) {
            str = "columns ";
        } else {
            str = "rows ";
        }
        return str + Arrays.toString(this.e) + " aspect=" + this.a + " cost=" + this.f + " order=" + Arrays.toString(this.c);
    }
}

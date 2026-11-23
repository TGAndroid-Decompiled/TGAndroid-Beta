package ai;

import java.util.Locale;
public final class z0 {
    public final String f1605a;
    public final float f1606b;
    public final boolean f1607c;

    public z0(String str, float f10, boolean z10) {
        this.f1605a = str;
        this.f1606b = f10;
        this.f1607c = z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1605a);
        sb2.append(String.format(Locale.US, " %.2f", Float.valueOf(this.f1606b)));
        if (this.f1607c) {
            str = " sure";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}

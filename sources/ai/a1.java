package ai;

import java.util.Locale;
public final class a1 {
    public final String f1121a;
    public final float f1122b;
    public final boolean f1123c;

    public a1(String str, float f10, boolean z10) {
        this.f1121a = str;
        this.f1122b = f10;
        this.f1123c = z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1121a);
        sb2.append(String.format(Locale.US, " %.2f", Float.valueOf(this.f1122b)));
        if (this.f1123c) {
            str = " sure";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}

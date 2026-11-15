package ai;

import java.util.Locale;
public final class d1 {
    public final String f1177a;
    public final float f1178b;
    public final boolean f1179c;

    public d1(String str, float f10, boolean z10) {
        this.f1177a = str;
        this.f1178b = f10;
        this.f1179c = z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1177a);
        sb2.append(String.format(Locale.US, " %.2f", Float.valueOf(this.f1178b)));
        if (this.f1179c) {
            str = " sure";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}

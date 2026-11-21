package ai;

import java.util.Locale;
public final class f1 {
    public final String f1196a;
    public final float f1197b;
    public final boolean f1198c;

    public f1(String str, float f10, boolean z10) {
        this.f1196a = str;
        this.f1197b = f10;
        this.f1198c = z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1196a);
        sb2.append(String.format(Locale.US, " %.2f", Float.valueOf(this.f1197b)));
        if (this.f1198c) {
            str = " sure";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}

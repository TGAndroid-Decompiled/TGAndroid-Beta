package ai;

import java.util.Locale;
public final class c1 {
    public final String f1169a;
    public final float f1170b;
    public final boolean f1171c;

    public c1(String str, float f10, boolean z10) {
        this.f1169a = str;
        this.f1170b = f10;
        this.f1171c = z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1169a);
        sb2.append(String.format(Locale.US, " %.2f", Float.valueOf(this.f1170b)));
        if (this.f1171c) {
            str = " sure";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}

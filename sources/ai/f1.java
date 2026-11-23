package ai;

import java.util.Locale;
public final class f1 {
    public final String f1172a;
    public final float f1173b;
    public final boolean f1174c;

    public f1(String str, float f10, boolean z10) {
        this.f1172a = str;
        this.f1173b = f10;
        this.f1174c = z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1172a);
        sb2.append(String.format(Locale.US, " %.2f", Float.valueOf(this.f1173b)));
        if (this.f1174c) {
            str = " sure";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}

package ai;

import java.util.Locale;
public final class d1 {
    public final String f1175a;
    public final float f1176b;
    public final boolean f1177c;

    public d1(String str, float f10, boolean z10) {
        this.f1175a = str;
        this.f1176b = f10;
        this.f1177c = z10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f1175a);
        sb2.append(String.format(Locale.US, " %.2f", Float.valueOf(this.f1176b)));
        if (this.f1177c) {
            str = " sure";
        } else {
            str = "";
        }
        sb2.append(str);
        return sb2.toString();
    }
}

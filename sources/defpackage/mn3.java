package defpackage;

import java.util.Locale;
public final class mn3 {
    public final String a;
    public final float b;
    public final boolean c;

    public mn3(String str, float f, boolean z) {
        this.a = str;
        this.b = f;
        this.c = z;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append(String.format(Locale.US, " %.2f", Float.valueOf(this.b)));
        if (this.c) {
            str = " sure";
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }
}

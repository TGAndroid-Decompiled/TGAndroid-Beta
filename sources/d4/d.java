package d4;

import a8.ed;
import a8.yb;
import android.graphics.Color;
import c3.h0;
public final class d {
    public final String f7921a;
    public final int f7922b;
    public final Integer f7923c;
    public final Integer d;
    public final float e;
    public final boolean f7924f;
    public final boolean f7925g;
    public final boolean h;
    public final boolean f7926i;
    public final int f7927j;

    public d(String str, int i10, Integer num, Integer num2, float f7, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f7921a = str;
        this.f7922b = i10;
        this.f7923c = num;
        this.d = num2;
        this.e = f7;
        this.f7924f = z10;
        this.f7925g = z11;
        this.h = z12;
        this.f7926i = z13;
        this.f7927j = i11;
    }

    public static int a(String str) {
        boolean z10;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    break;
            }
            if (z10) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        h0.p("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e) {
            e2.a.m("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z10;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z10 = true;
            } else {
                z10 = false;
            }
            yb.g(z10);
            int b10 = ed.b(((parseLong >> 24) & 255) ^ 255);
            int b11 = ed.b((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(b10, ed.b(parseLong & 255), ed.b((parseLong >> 8) & 255), b11));
        } catch (IllegalArgumentException e) {
            e2.a.m("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}

package f4;

import android.graphics.Color;
import b8.od;
import b8.zb;
public final class d {
    public final String f11432a;
    public final int f11433b;
    public final Integer f11434c;
    public final Integer d;
    public final float f11435e;
    public final boolean f11436f;
    public final boolean f11437g;
    public final boolean h;
    public final boolean f11438i;
    public final int f11439j;

    public d(String str, int i3, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        this.f11432a = str;
        this.f11433b = i3;
        this.f11434c = num;
        this.d = num2;
        this.f11435e = f10;
        this.f11436f = z10;
        this.f11437g = z11;
        this.h = z12;
        this.f11438i = z13;
        this.f11439j = i10;
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
        com.google.android.recaptcha.internal.a.q("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e10) {
            g2.a.m("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
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
            zb.f(z10);
            int b10 = od.b(((parseLong >> 24) & 255) ^ 255);
            int b11 = od.b((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(b10, od.b(parseLong & 255), od.b((parseLong >> 8) & 255), b11));
        } catch (IllegalArgumentException e10) {
            g2.a.m("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}

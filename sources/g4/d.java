package g4;

import a8.ia;
import android.graphics.Color;
import c8.e1;
public final class d {
    public final String f13510a;
    public final int f13511b;
    public final Integer f13512c;
    public final Integer d;
    public final float f13513e;
    public final boolean f13514f;
    public final boolean f13515g;
    public final boolean h;
    public final boolean f13516i;
    public final int f13517j;

    public d(String str, int i7, Integer num, Integer num2, float f10, boolean z9, boolean z10, boolean z11, boolean z12, int i10) {
        this.f13510a = str;
        this.f13511b = i7;
        this.f13512c = num;
        this.d = num2;
        this.f13513e = f10;
        this.f13514f = z9;
        this.f13515g = z10;
        this.h = z11;
        this.f13516i = z12;
        this.f13517j = i10;
    }

    public static int a(String str) {
        boolean z9;
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
                    z9 = true;
                    break;
                default:
                    z9 = false;
                    break;
            }
            if (z9) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        com.google.android.recaptcha.internal.a.r("Ignoring unknown alignment: ", str, "SsaStyle");
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
            h2.a.m("SsaStyle", "Failed to parse boolean value: '" + str + "'", e10);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z9;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z9 = true;
            } else {
                z9 = false;
            }
            ia.f(z9);
            int b10 = e1.b(((parseLong >> 24) & 255) ^ 255);
            int b11 = e1.b((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(b10, e1.b(parseLong & 255), e1.b((parseLong >> 8) & 255), b11));
        } catch (IllegalArgumentException e10) {
            h2.a.m("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}

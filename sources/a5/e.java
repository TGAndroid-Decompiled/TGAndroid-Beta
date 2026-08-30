package a5;

import android.graphics.Color;
import k7.y7;
public final class e {
    public final String f113a;
    public final int f114b;
    public final Integer f115c;
    public final Integer d;
    public final float e;
    public final boolean f116f;
    public final boolean f117g;
    public final boolean h;
    public final boolean f118i;
    public final int f119j;

    public e(String str, int i10, Integer num, Integer num2, float f10, boolean z4, boolean z10, boolean z11, boolean z12, int i11) {
        this.f113a = str;
        this.f114b = i10;
        this.f115c = num;
        this.d = num2;
        this.e = f10;
        this.f116f = z4;
        this.f117g = z10;
        this.h = z11;
        this.f118i = z12;
        this.f119j = i11;
    }

    public static int a(String str) {
        boolean z4;
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
                    z4 = true;
                    break;
                default:
                    z4 = false;
                    break;
            }
            if (z4) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        android.support.v4.media.a.w("Ignoring unknown alignment: ", str, "SsaStyle");
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
            h5.a.L("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }

    public static Integer c(String str) {
        long parseLong;
        boolean z4;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= 4294967295L) {
                z4 = true;
            } else {
                z4 = false;
            }
            h5.a.f(z4);
            int a2 = y7.a(((parseLong >> 24) & 255) ^ 255);
            int a10 = y7.a((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(a2, y7.a(parseLong & 255), y7.a((parseLong >> 8) & 255), a10));
        } catch (IllegalArgumentException e) {
            h5.a.L("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }
}

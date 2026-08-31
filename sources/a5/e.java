package a5;

import android.graphics.Color;
import k7.y7;
public final class e {
    public final String f123a;
    public final int f124b;
    public final Integer f125c;
    public final Integer d;
    public final float f126e;
    public final boolean f127f;
    public final boolean f128g;
    public final boolean h;
    public final boolean f129i;
    public final int f130j;

    public e(String str, int i10, Integer num, Integer num2, float f10, boolean z4, boolean z10, boolean z11, boolean z12, int i11) {
        this.f123a = str;
        this.f124b = i10;
        this.f125c = num;
        this.d = num2;
        this.f126e = f10;
        this.f127f = z4;
        this.f128g = z10;
        this.h = z11;
        this.f129i = z12;
        this.f130j = i11;
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
        } catch (NumberFormatException e6) {
            h5.a.L("SsaStyle", "Failed to parse boolean value: '" + str + "'", e6);
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
        } catch (IllegalArgumentException e6) {
            h5.a.L("SsaStyle", "Failed to parse color expression: '" + str + "'", e6);
            return null;
        }
    }
}

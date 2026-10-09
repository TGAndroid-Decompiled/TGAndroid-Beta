package d4;

import android.graphics.Color;
import com.google.android.gms.internal.vision.e2;
import v7.v7;
public final class d {
    public final String f8143a;
    public final int f8144b;
    public final Integer f8145c;
    public final Integer d;
    public final float f8146e;
    public final boolean f8147f;
    public final boolean f8148g;
    public final boolean h;
    public final boolean f8149i;
    public final int f8150j;

    public d(String str, int i10, Integer num, Integer num2, float f7, boolean z10, boolean z11, boolean z12, boolean z13, int i11) {
        this.f8143a = str;
        this.f8144b = i10;
        this.f8145c = num;
        this.d = num2;
        this.f8146e = f7;
        this.f8147f = z10;
        this.f8148g = z11;
        this.h = z12;
        this.f8149i = z13;
        this.f8150j = i11;
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
        e2.s("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static boolean b(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt != 1 && parseInt != -1) {
                return false;
            }
            return true;
        } catch (NumberFormatException e7) {
            e2.a.o("SsaStyle", "Failed to parse boolean value: '" + str + "'", e7);
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
            e2.d.b(z10);
            int b10 = v7.b(((parseLong >> 24) & 255) ^ 255);
            int b11 = v7.b((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(b10, v7.b(parseLong & 255), v7.b((parseLong >> 8) & 255), b11));
        } catch (IllegalArgumentException e7) {
            e2.a.o("SsaStyle", "Failed to parse color expression: '" + str + "'", e7);
            return null;
        }
    }
}

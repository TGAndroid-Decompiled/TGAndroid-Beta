package g4;

import a8.ja;
import android.graphics.Color;
import c8.g1;
import com.google.android.gms.internal.vision.e2;
public final class d {
    public final String f12859a;
    public final int f12860b;
    public final Integer f12861c;
    public final Integer d;
    public final float f12862e;
    public final boolean f12863f;
    public final boolean f12864g;
    public final boolean h;
    public final boolean f12865i;
    public final int f12866j;

    public d(String str, int i7, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        this.f12859a = str;
        this.f12860b = i7;
        this.f12861c = num;
        this.d = num2;
        this.f12862e = f10;
        this.f12863f = z10;
        this.f12864g = z11;
        this.h = z12;
        this.f12865i = z13;
        this.f12866j = i10;
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
        e2.q("Ignoring unknown alignment: ", str, "SsaStyle");
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
            ja.f(z10);
            int b10 = g1.b(((parseLong >> 24) & 255) ^ 255);
            int b11 = g1.b((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(b10, g1.b(parseLong & 255), g1.b((parseLong >> 8) & 255), b11));
        } catch (IllegalArgumentException e10) {
            h2.a.m("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}

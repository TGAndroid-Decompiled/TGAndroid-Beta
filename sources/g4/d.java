package g4;

import a8.la;
import android.graphics.Color;
import c8.k1;
import com.google.android.gms.internal.vision.e2;
public final class d {
    public final String f13176a;
    public final int f13177b;
    public final Integer f13178c;
    public final Integer d;
    public final float f13179e;
    public final boolean f13180f;
    public final boolean f13181g;
    public final boolean h;
    public final boolean f13182i;
    public final int f13183j;

    public d(String str, int i7, Integer num, Integer num2, float f10, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        this.f13176a = str;
        this.f13177b = i7;
        this.f13178c = num;
        this.d = num2;
        this.f13179e = f10;
        this.f13180f = z10;
        this.f13181g = z11;
        this.h = z12;
        this.f13182i = z13;
        this.f13183j = i10;
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
            la.f(z10);
            int b10 = k1.b(((parseLong >> 24) & 255) ^ 255);
            int b11 = k1.b((parseLong >> 16) & 255);
            return Integer.valueOf(Color.argb(b10, k1.b(parseLong & 255), k1.b((parseLong >> 8) & 255), b11));
        } catch (IllegalArgumentException e10) {
            h2.a.m("SsaStyle", "Failed to parse color expression: '" + str + "'", e10);
            return null;
        }
    }
}

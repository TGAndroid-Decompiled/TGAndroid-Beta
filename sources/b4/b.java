package b4;

import android.text.TextUtils;
import v7.s6;
import v7.u6;
public final class b {
    public final int f4162a;
    public final int f4163b;
    public final int f4164c;
    public final int d;
    public final int e;
    public final int f4165f;

    public b(int i10, int i11, int i12, int i13, int i14, int i15) {
        this.f4162a = i10;
        this.f4163b = i11;
        this.f4164c = i12;
        this.d = i13;
        this.e = i14;
        this.f4165f = i15;
    }

    public static b a(String str) {
        char c10;
        u6.g(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        for (int i15 = 0; i15 < split.length; i15++) {
            String c11 = s6.c(split[i15].trim());
            c11.getClass();
            switch (c11.hashCode()) {
                case 100571:
                    if (c11.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3556653:
                    if (c11.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 102749521:
                    if (c11.equals("layer")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109757538:
                    if (c11.equals("start")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (c11.equals("style")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    i12 = i15;
                    break;
                case 1:
                    i14 = i15;
                    break;
                case 2:
                    i10 = i15;
                    break;
                case 3:
                    i11 = i15;
                    break;
                case 4:
                    i13 = i15;
                    break;
            }
        }
        if (i11 != -1 && i12 != -1 && i14 != -1) {
            return new b(i10, i11, i12, i13, i14, split.length);
        }
        return null;
    }
}

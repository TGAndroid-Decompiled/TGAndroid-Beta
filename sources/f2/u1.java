package f2;

import android.text.TextUtils;
public final class u1 {
    public int f5539a;
    public int f5540b;
    public int f5541c;
    public int d;
    public int f5542e;

    public static u1 b(String str) {
        char c10;
        d5.a.f(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < split.length; i13++) {
            String b10 = g7.b0.b(split[i13].trim());
            b10.getClass();
            switch (b10.hashCode()) {
                case 100571:
                    if (b10.equals("end")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 3556653:
                    if (b10.equals("text")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109757538:
                    if (b10.equals("start")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109780401:
                    if (b10.equals("style")) {
                        c10 = 3;
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
                    i10 = i13;
                    break;
                case 1:
                    i11 = i13;
                    break;
                case 2:
                    i9 = i13;
                    break;
                case 3:
                    i12 = i13;
                    break;
            }
        }
        if (i9 != -1 && i10 != -1 && i11 != -1) {
            int length = split.length;
            ?? obj = new Object();
            obj.f5539a = i9;
            obj.f5540b = i10;
            obj.f5541c = i12;
            obj.d = i11;
            obj.f5542e = length;
            return obj;
        }
        return null;
    }

    public boolean a() {
        int i9;
        int i10;
        int i11;
        int i12 = this.f5539a;
        int i13 = 2;
        if ((i12 & 7) != 0) {
            int i14 = this.d;
            int i15 = this.f5540b;
            if (i14 > i15) {
                i11 = 1;
            } else if (i14 == i15) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            if ((i11 & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 112) != 0) {
            int i16 = this.d;
            int i17 = this.f5541c;
            if (i16 > i17) {
                i10 = 1;
            } else if (i16 == i17) {
                i10 = 2;
            } else {
                i10 = 4;
            }
            if (((i10 << 4) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 1792) != 0) {
            int i18 = this.f5542e;
            int i19 = this.f5540b;
            if (i18 > i19) {
                i9 = 1;
            } else if (i18 == i19) {
                i9 = 2;
            } else {
                i9 = 4;
            }
            if (((i9 << 8) & i12) == 0) {
                return false;
            }
        }
        if ((i12 & 28672) != 0) {
            int i20 = this.f5542e;
            int i21 = this.f5541c;
            if (i20 > i21) {
                i13 = 1;
            } else if (i20 != i21) {
                i13 = 4;
            }
            if ((i12 & (i13 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}

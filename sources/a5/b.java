package a5;

import android.text.TextUtils;
import k7.a7;
public final class b {
    public int f107a;
    public int f108b;
    public int f109c;
    public int d;
    public int f110e;

    public static b b(String str) {
        char c3;
        h5.a.f(str.startsWith("Format:"));
        String[] split = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < split.length; i14++) {
            String b10 = a7.b(split[i14].trim());
            b10.getClass();
            switch (b10.hashCode()) {
                case 100571:
                    if (b10.equals("end")) {
                        c3 = 0;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 3556653:
                    if (b10.equals("text")) {
                        c3 = 1;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109757538:
                    if (b10.equals("start")) {
                        c3 = 2;
                        break;
                    }
                    c3 = 65535;
                    break;
                case 109780401:
                    if (b10.equals("style")) {
                        c3 = 3;
                        break;
                    }
                    c3 = 65535;
                    break;
                default:
                    c3 = 65535;
                    break;
            }
            switch (c3) {
                case 0:
                    i11 = i14;
                    break;
                case 1:
                    i12 = i14;
                    break;
                case 2:
                    i10 = i14;
                    break;
                case 3:
                    i13 = i14;
                    break;
            }
        }
        if (i10 != -1 && i11 != -1 && i12 != -1) {
            int length = split.length;
            ?? obj = new Object();
            obj.f107a = i10;
            obj.f108b = i11;
            obj.f109c = i13;
            obj.d = i12;
            obj.f110e = length;
            return obj;
        }
        return null;
    }

    public boolean a() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f107a;
        int i14 = 2;
        if ((i13 & 7) != 0) {
            int i15 = this.d;
            int i16 = this.f108b;
            if (i15 > i16) {
                i12 = 1;
            } else if (i15 == i16) {
                i12 = 2;
            } else {
                i12 = 4;
            }
            if ((i12 & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 112) != 0) {
            int i17 = this.d;
            int i18 = this.f109c;
            if (i17 > i18) {
                i11 = 1;
            } else if (i17 == i18) {
                i11 = 2;
            } else {
                i11 = 4;
            }
            if (((i11 << 4) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 1792) != 0) {
            int i19 = this.f110e;
            int i20 = this.f108b;
            if (i19 > i20) {
                i10 = 1;
            } else if (i19 == i20) {
                i10 = 2;
            } else {
                i10 = 4;
            }
            if (((i10 << 8) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 28672) != 0) {
            int i21 = this.f110e;
            int i22 = this.f109c;
            if (i21 > i22) {
                i14 = 1;
            } else if (i21 != i22) {
                i14 = 4;
            }
            if ((i13 & (i14 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}

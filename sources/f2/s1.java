package f2;

import android.text.TextUtils;

public final class s1 {

    public int f5825a;

    public int f5826b;

    public int f5827c;
    public int d;

    public int f5828e;

    public static s1 b(String str) {
        d5.a.f(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            String strB = h7.d0.b(strArrSplit[i14].trim());
            strB.getClass();
            switch (strB) {
                case "end":
                    i11 = i14;
                    break;
                case "text":
                    i12 = i14;
                    break;
                case "start":
                    i10 = i14;
                    break;
                case "style":
                    i13 = i14;
                    break;
            }
        }
        if (i10 == -1 || i11 == -1 || i12 == -1) {
            return null;
        }
        int length = strArrSplit.length;
        s1 s1Var = new s1();
        s1Var.f5825a = i10;
        s1Var.f5826b = i11;
        s1Var.f5827c = i13;
        s1Var.d = i12;
        s1Var.f5828e = length;
        return s1Var;
    }

    public boolean a() {
        int i10;
        int i11;
        int i12;
        int i13 = this.f5825a;
        int i14 = 2;
        if ((i13 & 7) != 0) {
            int i15 = this.d;
            int i16 = this.f5826b;
            if (i15 > i16) {
                i12 = 1;
            } else {
                i12 = i15 == i16 ? 2 : 4;
            }
            if ((i12 & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 112) != 0) {
            int i17 = this.d;
            int i18 = this.f5827c;
            if (i17 > i18) {
                i11 = 1;
            } else {
                i11 = i17 == i18 ? 2 : 4;
            }
            if (((i11 << 4) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 1792) != 0) {
            int i19 = this.f5828e;
            int i20 = this.f5826b;
            if (i19 > i20) {
                i10 = 1;
            } else {
                i10 = i19 == i20 ? 2 : 4;
            }
            if (((i10 << 8) & i13) == 0) {
                return false;
            }
        }
        if ((i13 & 28672) != 0) {
            int i21 = this.f5828e;
            int i22 = this.f5827c;
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

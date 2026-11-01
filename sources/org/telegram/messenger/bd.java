package org.telegram.messenger;
public final class bd {
    public final int f14956a;

    public final int a(int i10) {
        switch (this.f14956a) {
            case 0:
                int i11 = i10 % 100;
                if (i10 == 0) {
                    return 1;
                }
                if (i10 == 1) {
                    return 2;
                }
                if (i10 == 2) {
                    return 4;
                }
                if (i11 >= 3 && i11 <= 10) {
                    return 8;
                }
                if (i11 >= 11 && i11 <= 99) {
                    return 16;
                }
                return 0;
            case 1:
                int i12 = i10 % 100;
                int i13 = i10 % 10;
                if (i13 == 1 && i12 != 11) {
                    return 2;
                }
                if (i13 >= 2 && i13 <= 4 && (i12 < 12 || i12 > 14)) {
                    return 8;
                }
                if (i13 != 0 && ((i13 < 5 || i13 > 9) && (i12 < 11 || i12 > 14))) {
                    return 0;
                }
                return 16;
            case 2:
                if (i10 == 0) {
                    return 1;
                }
                if (i10 == 1) {
                    return 2;
                }
                if (i10 == 2) {
                    return 4;
                }
                if (i10 == 3) {
                    return 8;
                }
                if (i10 == 6) {
                    return 16;
                }
                return 0;
            case 3:
                if (i10 == 1) {
                    return 2;
                }
                if (i10 >= 2 && i10 <= 4) {
                    return 8;
                }
                return 0;
            case 4:
                if (i10 >= 0 && i10 < 2) {
                    return 2;
                }
                return 0;
            case 5:
                if (i10 == 0) {
                    return 1;
                }
                if (i10 == 1) {
                    return 2;
                }
                return 0;
            case 6:
                if (i10 == 0) {
                    return 1;
                }
                if (i10 % 10 == 1 && i10 % 100 != 11) {
                    return 2;
                }
                return 0;
            case 7:
                int i14 = i10 % 100;
                int i15 = i10 % 10;
                if (i15 == 1 && (i14 < 11 || i14 > 19)) {
                    return 2;
                }
                if (i15 >= 2 && i15 <= 9 && (i14 < 11 || i14 > 19)) {
                    return 8;
                }
                return 0;
            case 8:
                if (i10 % 10 == 1 && i10 != 11) {
                    return 2;
                }
                return 0;
            case 9:
                int i16 = i10 % 100;
                if (i10 == 1) {
                    return 2;
                }
                if (i10 != 0 && (i16 < 2 || i16 > 10)) {
                    if (i16 >= 11 && i16 <= 19) {
                        return 16;
                    }
                    return 0;
                }
                return 8;
            case 10:
                return 0;
            case 11:
                if (i10 == 1) {
                    return 2;
                }
                return 0;
            case 12:
                int i17 = i10 % 100;
                int i18 = i10 % 10;
                if (i10 == 1) {
                    return 2;
                }
                if (i18 >= 2 && i18 <= 4 && (i17 < 12 || i17 > 14)) {
                    return 8;
                }
                if ((i18 >= 0 && i18 <= 1) || ((i18 >= 5 && i18 <= 9) || (i17 >= 12 && i17 <= 14))) {
                    return 16;
                }
                return 0;
            case 13:
                int i19 = i10 % 100;
                if (i10 == 1) {
                    return 2;
                }
                if (i10 != 0 && (i19 < 1 || i19 > 19)) {
                    return 0;
                }
                return 8;
            case 14:
                int i20 = i10 % 100;
                int i21 = i10 % 10;
                if (i21 == 1 && i20 != 11) {
                    return 2;
                }
                if (i21 >= 2 && i21 <= 4 && (i20 < 12 || i20 > 14)) {
                    return 8;
                }
                return 0;
            case 15:
                int i22 = i10 % 100;
                if (i22 == 1) {
                    return 2;
                }
                if (i22 == 2) {
                    return 4;
                }
                if (i22 >= 3 && i22 <= 4) {
                    return 8;
                }
                return 0;
            case 16:
                if (i10 >= 0 && i10 <= 1) {
                    return 2;
                }
                if (i10 >= 2 && i10 <= 10) {
                    return 8;
                }
                return 0;
            case 17:
                if (i10 == 1) {
                    return 2;
                }
                if (i10 == 2) {
                    return 4;
                }
                return 0;
            case 18:
                if (i10 == 0) {
                    return 1;
                }
                if (i10 == 1) {
                    return 2;
                }
                if (i10 == 2) {
                    return 4;
                }
                if (i10 == 3) {
                    return 8;
                }
                if (i10 == 6) {
                    return 16;
                }
                return 0;
            default:
                if (i10 != 0 && i10 != 1) {
                    return 0;
                }
                return 2;
        }
    }
}

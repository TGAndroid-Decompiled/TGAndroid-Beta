package org.telegram.messenger;
public final class fd {
    public final int f22370a;

    public final int a(int i7) {
        switch (this.f22370a) {
            case 0:
                int i10 = i7 % 100;
                if (i7 == 0) {
                    return 1;
                }
                if (i7 == 1) {
                    return 2;
                }
                if (i7 == 2) {
                    return 4;
                }
                if (i10 >= 3 && i10 <= 10) {
                    return 8;
                }
                if (i10 >= 11 && i10 <= 99) {
                    return 16;
                }
                return 0;
            case 1:
                int i11 = i7 % 100;
                int i12 = i7 % 10;
                if (i12 == 1 && i11 != 11) {
                    return 2;
                }
                if (i12 >= 2 && i12 <= 4 && (i11 < 12 || i11 > 14)) {
                    return 8;
                }
                if (i12 != 0 && ((i12 < 5 || i12 > 9) && (i11 < 11 || i11 > 14))) {
                    return 0;
                }
                return 16;
            case 2:
                if (i7 == 0) {
                    return 1;
                }
                if (i7 == 1) {
                    return 2;
                }
                if (i7 == 2) {
                    return 4;
                }
                if (i7 == 3) {
                    return 8;
                }
                if (i7 == 6) {
                    return 16;
                }
                return 0;
            case 3:
                if (i7 == 1) {
                    return 2;
                }
                if (i7 >= 2 && i7 <= 4) {
                    return 8;
                }
                return 0;
            case 4:
                if (i7 >= 0 && i7 < 2) {
                    return 2;
                }
                return 0;
            case 5:
                if (i7 == 0) {
                    return 1;
                }
                if (i7 == 1) {
                    return 2;
                }
                return 0;
            case 6:
                if (i7 == 0) {
                    return 1;
                }
                if (i7 % 10 == 1 && i7 % 100 != 11) {
                    return 2;
                }
                return 0;
            case 7:
                int i13 = i7 % 100;
                int i14 = i7 % 10;
                if (i14 == 1 && (i13 < 11 || i13 > 19)) {
                    return 2;
                }
                if (i14 >= 2 && i14 <= 9 && (i13 < 11 || i13 > 19)) {
                    return 8;
                }
                return 0;
            case 8:
                if (i7 % 10 == 1 && i7 != 11) {
                    return 2;
                }
                return 0;
            case 9:
                int i15 = i7 % 100;
                if (i7 == 1) {
                    return 2;
                }
                if (i7 != 0 && (i15 < 2 || i15 > 10)) {
                    if (i15 >= 11 && i15 <= 19) {
                        return 16;
                    }
                    return 0;
                }
                return 8;
            case 10:
                return 0;
            case 11:
                if (i7 == 1) {
                    return 2;
                }
                return 0;
            case 12:
                int i16 = i7 % 100;
                int i17 = i7 % 10;
                if (i7 == 1) {
                    return 2;
                }
                if (i17 >= 2 && i17 <= 4 && (i16 < 12 || i16 > 14)) {
                    return 8;
                }
                if ((i17 >= 0 && i17 <= 1) || ((i17 >= 5 && i17 <= 9) || (i16 >= 12 && i16 <= 14))) {
                    return 16;
                }
                return 0;
            case 13:
                int i18 = i7 % 100;
                if (i7 == 1) {
                    return 2;
                }
                if (i7 != 0 && (i18 < 1 || i18 > 19)) {
                    return 0;
                }
                return 8;
            case 14:
                int i19 = i7 % 100;
                int i20 = i7 % 10;
                if (i20 == 1 && i19 != 11) {
                    return 2;
                }
                if (i20 >= 2 && i20 <= 4 && (i19 < 12 || i19 > 14)) {
                    return 8;
                }
                return 0;
            case 15:
                int i21 = i7 % 100;
                if (i21 == 1) {
                    return 2;
                }
                if (i21 == 2) {
                    return 4;
                }
                if (i21 >= 3 && i21 <= 4) {
                    return 8;
                }
                return 0;
            case 16:
                if (i7 >= 0 && i7 <= 1) {
                    return 2;
                }
                if (i7 >= 2 && i7 <= 10) {
                    return 8;
                }
                return 0;
            case 17:
                if (i7 == 1) {
                    return 2;
                }
                if (i7 == 2) {
                    return 4;
                }
                return 0;
            case 18:
                if (i7 == 0) {
                    return 1;
                }
                if (i7 == 1) {
                    return 2;
                }
                if (i7 == 2) {
                    return 4;
                }
                if (i7 == 3) {
                    return 8;
                }
                if (i7 == 6) {
                    return 16;
                }
                return 0;
            default:
                if (i7 != 0 && i7 != 1) {
                    return 0;
                }
                return 2;
        }
    }
}

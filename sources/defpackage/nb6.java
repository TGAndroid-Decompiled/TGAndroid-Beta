package defpackage;
public final class nb6 {
    public final byte a;

    public final int a(int i) {
        switch (this.a) {
            case 0:
                int i2 = i % 100;
                if (i == 0) {
                    return 1;
                }
                if (i == 1) {
                    return 2;
                }
                if (i == 2) {
                    return 4;
                }
                if (i2 >= 3 && i2 <= 10) {
                    return 8;
                }
                if (i2 >= 11 && i2 <= 99) {
                    return 16;
                }
                return 0;
            case 1:
                int i3 = i % 100;
                int i4 = i % 10;
                if (i4 == 1 && i3 != 11) {
                    return 2;
                }
                if (i4 >= 2 && i4 <= 4 && (i3 < 12 || i3 > 14)) {
                    return 8;
                }
                if (i4 != 0 && ((i4 < 5 || i4 > 9) && (i3 < 11 || i3 > 14))) {
                    return 0;
                }
                return 16;
            case 2:
                if (i == 0) {
                    return 1;
                }
                if (i == 1) {
                    return 2;
                }
                if (i == 2) {
                    return 4;
                }
                if (i == 3) {
                    return 8;
                }
                if (i == 6) {
                    return 16;
                }
                return 0;
            case 3:
                if (i == 1) {
                    return 2;
                }
                if (i >= 2 && i <= 4) {
                    return 8;
                }
                return 0;
            case 4:
                if (i >= 0 && i < 2) {
                    return 2;
                }
                return 0;
            case 5:
                if (i == 0) {
                    return 1;
                }
                if (i == 1) {
                    return 2;
                }
                return 0;
            case 6:
                if (i == 0) {
                    return 1;
                }
                if (i % 10 == 1 && i % 100 != 11) {
                    return 2;
                }
                return 0;
            case 7:
                int i5 = i % 100;
                int i6 = i % 10;
                if (i6 == 1 && (i5 < 11 || i5 > 19)) {
                    return 2;
                }
                if (i6 >= 2 && i6 <= 9 && (i5 < 11 || i5 > 19)) {
                    return 8;
                }
                return 0;
            case 8:
                if (i % 10 == 1 && i != 11) {
                    return 2;
                }
                return 0;
            case 9:
                int i7 = i % 100;
                if (i == 1) {
                    return 2;
                }
                if (i != 0 && (i7 < 2 || i7 > 10)) {
                    if (i7 >= 11 && i7 <= 19) {
                        return 16;
                    }
                    return 0;
                }
                return 8;
            case 10:
                return 0;
            case 11:
                if (i == 1) {
                    return 2;
                }
                return 0;
            case 12:
                int i8 = i % 100;
                int i9 = i % 10;
                if (i == 1) {
                    return 2;
                }
                if (i9 >= 2 && i9 <= 4 && (i8 < 12 || i8 > 14)) {
                    return 8;
                }
                if ((i9 >= 0 && i9 <= 1) || ((i9 >= 5 && i9 <= 9) || (i8 >= 12 && i8 <= 14))) {
                    return 16;
                }
                return 0;
            case 13:
                int i10 = i % 100;
                if (i == 1) {
                    return 2;
                }
                if (i != 0 && (i10 < 1 || i10 > 19)) {
                    return 0;
                }
                return 8;
            case 14:
                int i11 = i % 100;
                int i12 = i % 10;
                if (i12 == 1 && i11 != 11) {
                    return 2;
                }
                if (i12 >= 2 && i12 <= 4 && (i11 < 12 || i11 > 14)) {
                    return 8;
                }
                return 0;
            case 15:
                int i13 = i % 100;
                if (i13 == 1) {
                    return 2;
                }
                if (i13 == 2) {
                    return 4;
                }
                if (i13 >= 3 && i13 <= 4) {
                    return 8;
                }
                return 0;
            case 16:
                if (i >= 0 && i <= 1) {
                    return 2;
                }
                if (i >= 2 && i <= 10) {
                    return 8;
                }
                return 0;
            case 17:
                if (i == 1) {
                    return 2;
                }
                if (i == 2) {
                    return 4;
                }
                return 0;
            case 18:
                if (i == 0) {
                    return 1;
                }
                if (i == 1) {
                    return 2;
                }
                if (i == 2) {
                    return 4;
                }
                if (i == 3) {
                    return 8;
                }
                if (i == 6) {
                    return 16;
                }
                return 0;
            default:
                if (i != 0 && i != 1) {
                    return 0;
                }
                return 2;
        }
    }
}

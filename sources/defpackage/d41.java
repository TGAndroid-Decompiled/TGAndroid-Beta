package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
public abstract class d41 {
    public static final byte[] a = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};

    public static String a(byte[] bArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        if (bArr == 0) {
            return null;
        }
        int length = (((((bArr.length << 3) + 5) / 6) + 3) / 4) << 2;
        StringBuilder sb = new StringBuilder(length);
        int i6 = 0;
        while (true) {
            int i7 = i6 / 8;
            if (bArr.length <= i7) {
                i3 = -1;
            } else {
                if (bArr.length - 1 == i7) {
                    i = 0;
                } else {
                    i = bArr[i7 + 1];
                }
                int i8 = (i6 % 24) / 6;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 != 2) {
                            if (i8 != 3) {
                                i3 = 0;
                            } else {
                                i2 = bArr[i7];
                            }
                        } else {
                            i4 = (bArr[i7] << 2) & 60;
                            i5 = (i >> 6) & 3;
                        }
                    } else {
                        i4 = (bArr[i7] << 4) & 48;
                        i5 = (i >> 4) & 15;
                    }
                    i3 = i4 | i5;
                } else {
                    i2 = bArr[i7] >> 2;
                }
                i3 = i2 & 63;
            }
            if (i3 < 0) {
                break;
            }
            sb.append((char) a[i3]);
            i6 += 6;
        }
        for (int length2 = sb.length(); length2 < length; length2++) {
            sb.append('=');
        }
        return sb.toString();
    }

    public static y79 b(bs4 bs4Var, ArrayList arrayList) {
        jo5 p = mo5.p();
        for (int i = 0; i < arrayList.size(); i++) {
            Bundle bundle = (Bundle) arrayList.get(i);
            bundle.getClass();
            p.c(bs4Var.apply(bundle));
        }
        return p.f();
    }

    public static ArrayList c(Collection collection, bs4 bs4Var) {
        ArrayList arrayList = new ArrayList(collection.size());
        for (Object obj : collection) {
            arrayList.add((Bundle) bs4Var.apply(obj));
        }
        return arrayList;
    }
}

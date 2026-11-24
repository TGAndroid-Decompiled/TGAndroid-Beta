package defpackage;

import java.util.Arrays;
import java.util.HashMap;
public final class nl8 {
    public static final HashMap b;
    public final int[] a;

    static {
        HashMap hashMap = new HashMap();
        a(hashMap, 1, "keyword");
        a(hashMap, 2, "operator", "entity");
        a(hashMap, 3, "constant", "boolean");
        a(hashMap, 4, "string", "string-literal", "char", "template-string");
        a(hashMap, 5, "number");
        a(hashMap, 6, "comment", "block-comment", "comment-multiline", "prolog", "doctype", "cdata");
        a(hashMap, 7, "function", "function-definition", "function-variable", "function-name");
        a(hashMap, 8, "builtin", "type");
        a(hashMap, 9, "class-name");
        a(hashMap, 10, "property");
        a(hashMap, 11, "attr-name");
        a(hashMap, 12, "attr-value");
        a(hashMap, 13, "selector");
        a(hashMap, 14, "tag");
        a(hashMap, 15, "symbol");
        a(hashMap, 16, "regex");
        a(hashMap, 17, "url");
        a(hashMap, 18, "atrule");
        a(hashMap, 19, "inserted");
        a(hashMap, 20, "deleted");
        a(hashMap, 21, "punctuation");
        a(hashMap, 256, "bold");
        a(hashMap, 512, "italic");
        a(hashMap, 257, "important");
        b = hashMap;
    }

    public nl8(String[] strArr) {
        this.a = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            int i2 = 0;
            for (String str : strArr[i].split("\\s+")) {
                Integer num = (Integer) b.get(str);
                if (num != null) {
                    i2 = ((i2 & 255) == 0 ? i2 | (num.intValue() & 255) : i2) | (num.intValue() & (-256));
                }
            }
            this.a[i] = i2;
        }
    }

    public static void a(HashMap hashMap, int i, String... strArr) {
        for (String str : strArr) {
            hashMap.put(str, Integer.valueOf(i));
        }
    }

    public final int[] b(f26 f26Var) {
        int i;
        int[] iArr = (int[]) f26Var.b;
        int length = iArr.length / 5;
        if (length == 0) {
            return new int[0];
        }
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int[] iArr4 = new int[length];
        de deVar = new de((byte) 13, false);
        deVar.c = new int[48];
        int i2 = -1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < length) {
            int i5 = i3 * 5;
            int i6 = iArr[i5];
            int i7 = iArr[i5 + 1];
            while (true) {
                if (i2 >= 0) {
                    int i8 = iArr3[i2];
                    if (i8 <= i6) {
                        deVar.V(i4, i8, iArr4[i2]);
                        i4 = iArr3[i2];
                        i2--;
                    } else {
                        deVar.V(i4, i6, iArr4[i2]);
                        break;
                    }
                } else {
                    break;
                }
            }
            int i9 = iArr[i5 + 4];
            if (i9 < 0) {
                i = 0;
            } else {
                i = iArr2[i9];
            }
            int i10 = iArr[i5 + 2];
            int[] iArr5 = this.a;
            int i11 = iArr5[i10];
            int i12 = iArr5[iArr[i5 + 3]];
            int i13 = i12 & 255;
            if (i13 == 0) {
                i13 = i11 & 255;
            }
            if (i13 == 0) {
                i13 = i & 255;
            }
            int i14 = i13 | ((i | i11 | i12) & (-256));
            iArr2[i3] = i14;
            i2++;
            iArr3[i2] = i7;
            iArr4[i2] = i14;
            i3++;
            i4 = i6;
        }
        while (i2 >= 0) {
            deVar.V(i4, iArr3[i2], iArr4[i2]);
            i4 = iArr3[i2];
            i2--;
        }
        return Arrays.copyOf((int[]) deVar.c, deVar.b);
    }
}

package li;

import com.google.android.gms.internal.play_billing.s0;
import java.util.Arrays;
import java.util.HashMap;
public final class s {
    public static final HashMap f15683b;
    public final int[] f15684a;

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
        f15683b = hashMap;
    }

    public s(String[] strArr) {
        this.f15684a = new int[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            int i11 = 0;
            for (String str : strArr[i10].split("\\s+")) {
                Integer num = (Integer) f15683b.get(str);
                if (num != null) {
                    i11 = ((i11 & 255) == 0 ? i11 | (num.intValue() & 255) : i11) | (num.intValue() & (-256));
                }
            }
            this.f15684a[i10] = i11;
        }
    }

    public static void a(HashMap hashMap, int i10, String... strArr) {
        for (String str : strArr) {
            hashMap.put(str, Integer.valueOf(i10));
        }
    }

    public final int[] b(s0 s0Var) {
        int i10;
        int[] iArr = (int[]) s0Var.f7461c;
        int length = iArr.length / 5;
        if (length == 0) {
            return new int[0];
        }
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int[] iArr4 = new int[length];
        ?? obj = new Object();
        obj.f15682b = new int[48];
        int i11 = -1;
        int i12 = 0;
        int i13 = 0;
        while (i12 < length) {
            int i14 = i12 * 5;
            int i15 = iArr[i14];
            int i16 = iArr[i14 + 1];
            while (i11 >= 0) {
                int i17 = iArr3[i11];
                if (i17 > i15) {
                    break;
                }
                obj.a(i13, i17, iArr4[i11]);
                i13 = iArr3[i11];
                i11--;
            }
            if (i11 >= 0) {
                obj.a(i13, i15, iArr4[i11]);
            }
            int i18 = iArr[i14 + 4];
            if (i18 < 0) {
                i10 = 0;
            } else {
                i10 = iArr2[i18];
            }
            int i19 = iArr[i14 + 2];
            int[] iArr5 = this.f15684a;
            int i20 = iArr5[i19];
            int i21 = iArr5[iArr[i14 + 3]];
            int i22 = i21 & 255;
            if (i22 == 0) {
                i22 = i20 & 255;
            }
            if (i22 == 0) {
                i22 = i10 & 255;
            }
            int i23 = ((i10 | i20 | i21) & (-256)) | i22;
            iArr2[i12] = i23;
            i11++;
            iArr3[i11] = i16;
            iArr4[i11] = i23;
            i12++;
            i13 = i15;
        }
        while (i11 >= 0) {
            obj.a(i13, iArr3[i11], iArr4[i11]);
            i13 = iArr3[i11];
            i11--;
        }
        return Arrays.copyOf(obj.f15682b, obj.f15681a);
    }
}

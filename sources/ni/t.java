package ni;

import com.google.android.gms.internal.play_billing.s0;
import f5.u;
import java.util.Arrays;
import java.util.HashMap;
public final class t {
    public static final HashMap f20658b;
    public final int[] f20659a;

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
        f20658b = hashMap;
    }

    public t(String[] strArr) {
        this.f20659a = new int[strArr.length];
        for (int i7 = 0; i7 < strArr.length; i7++) {
            int i10 = 0;
            for (String str : strArr[i7].split("\\s+")) {
                Integer num = (Integer) f20658b.get(str);
                if (num != null) {
                    i10 = ((i10 & 255) == 0 ? i10 | (num.intValue() & 255) : i10) | (num.intValue() & (-256));
                }
            }
            this.f20659a[i7] = i10;
        }
    }

    public static void a(HashMap hashMap, int i7, String... strArr) {
        for (String str : strArr) {
            hashMap.put(str, Integer.valueOf(i7));
        }
    }

    public final int[] b(s0 s0Var) {
        int i7;
        int[] iArr = (int[]) s0Var.f7453c;
        int length = iArr.length / 5;
        if (length == 0) {
            return new int[0];
        }
        int[] iArr2 = new int[length];
        int[] iArr3 = new int[length];
        int[] iArr4 = new int[length];
        u uVar = new u(8, false, false);
        uVar.f11191c = new int[48];
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            int i13 = i11 * 5;
            int i14 = iArr[i13];
            int i15 = iArr[i13 + 1];
            while (i10 >= 0) {
                int i16 = iArr3[i10];
                if (i16 > i14) {
                    break;
                }
                uVar.b(i12, i16, iArr4[i10]);
                i12 = iArr3[i10];
                i10--;
            }
            if (i10 >= 0) {
                uVar.b(i12, i14, iArr4[i10]);
            }
            int i17 = iArr[i13 + 4];
            if (i17 < 0) {
                i7 = 0;
            } else {
                i7 = iArr2[i17];
            }
            int i18 = iArr[i13 + 2];
            int[] iArr5 = this.f20659a;
            int i19 = iArr5[i18];
            int i20 = iArr5[iArr[i13 + 3]];
            int i21 = i20 & 255;
            if (i21 == 0) {
                i21 = i19 & 255;
            }
            if (i21 == 0) {
                i21 = i7 & 255;
            }
            int i22 = ((i7 | i19 | i20) & (-256)) | i21;
            iArr2[i11] = i22;
            i10++;
            iArr3[i10] = i15;
            iArr4[i10] = i22;
            i11++;
            i12 = i14;
        }
        while (i10 >= 0) {
            uVar.b(i12, iArr3[i10], iArr4[i10]);
            i12 = iArr3[i10];
            i10--;
        }
        return Arrays.copyOf((int[]) uVar.f11191c, uVar.f11190b);
    }
}

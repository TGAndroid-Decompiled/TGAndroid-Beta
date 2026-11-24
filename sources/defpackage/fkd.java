package defpackage;

import java.util.List;
import java.util.Map;
public abstract class fkd {
    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }

    public static final void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                b(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                b(sb, i, str, entry);
            }
        } else {
            sb.append('\n');
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sie sieVar = sie.c;
                sb.append(c3f.a(new sie(((String) obj).getBytes(foe.a))));
                sb.append('\"');
            } else if (obj instanceof sie) {
                sb.append(": \"");
                sb.append(c3f.a((sie) obj));
                sb.append('\"');
            } else if (obj instanceof nne) {
                sb.append(" {");
                c((nne) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i4 = i + 2;
                b(sb, i4, "key", entry2.getKey());
                b(sb, i4, "value", entry2.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    public static void c(defpackage.nne r13, java.lang.StringBuilder r14, int r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkd.c(nne, java.lang.StringBuilder, int):void");
    }
}

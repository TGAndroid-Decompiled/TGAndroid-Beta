package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
public abstract class e47 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }

    public static void b(StringBuilder sb, int i, String str, Object obj) {
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
            a(i, sb);
            if (!str.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(Character.toLowerCase(str.charAt(0)));
                for (int i2 = 1; i2 < str.length(); i2++) {
                    char charAt = str.charAt(i2);
                    if (Character.isUpperCase(charAt)) {
                        sb2.append("_");
                    }
                    sb2.append(Character.toLowerCase(charAt));
                }
                str = sb2.toString();
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                n51 n51Var = n51.c;
                sb.append(yze.a(new n51(((String) obj).getBytes(pr5.a))));
                sb.append('\"');
            } else if (obj instanceof n51) {
                sb.append(": \"");
                sb.append(yze.a((n51) obj));
                sb.append('\"');
            } else if (obj instanceof ju4) {
                sb.append(" {");
                c((ju4) obj, sb, i + 2);
                sb.append("\n");
                a(i, sb);
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry2 = (Map.Entry) obj;
                int i3 = i + 2;
                b(sb, i3, "key", entry2.getKey());
                b(sb, i3, "value", entry2.getValue());
                sb.append("\n");
                a(i, sb);
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj);
            }
        }
    }

    public static void c(defpackage.ju4 r21, java.lang.StringBuilder r22, int r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e47.c(ju4, java.lang.StringBuilder, int):void");
    }
}

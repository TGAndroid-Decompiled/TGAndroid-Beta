package defpackage;

import java.util.List;
import java.util.Map;
public abstract class lgd {
    public static final void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                a(sb, i, str, obj2);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                a(sb, i, str, entry);
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
                efd efdVar = efd.c;
                sb.append(q3f.a(new efd(((String) obj).getBytes(gld.a))));
                sb.append('\"');
            } else if (obj instanceof efd) {
                sb.append(": \"");
                sb.append(q3f.a((efd) obj));
                sb.append('\"');
            } else {
                if (obj instanceof xkd) {
                    sb.append(" {");
                    b((xkd) obj, sb, i + 2);
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else if (obj instanceof Map.Entry) {
                    sb.append(" {");
                    Map.Entry entry2 = (Map.Entry) obj;
                    int i4 = i + 2;
                    a(sb, i4, "key", entry2.getKey());
                    a(sb, i4, "value", entry2.getValue());
                    sb.append("\n");
                    while (i2 < i) {
                        sb.append(' ');
                        i2++;
                    }
                } else {
                    sb.append(": ");
                    sb.append(obj.toString());
                    return;
                }
                sb.append("}");
            }
        }
    }

    public static void b(defpackage.xkd r17, java.lang.StringBuilder r18, int r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgd.b(xkd, java.lang.StringBuilder, int):void");
    }

    public static final String c(String str) {
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
}

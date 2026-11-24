package defpackage;

import java.util.regex.Pattern;
public final class vwc {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final yw7 a = new yw7();
    public final StringBuilder b = new StringBuilder();

    public static String a(yw7 yw7Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = yw7Var.b;
        int i2 = yw7Var.c;
        while (i < i2 && !z) {
            char c2 = (char) yw7Var.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && ((c2 < '0' || c2 > '9') && c2 != '#' && c2 != '-' && c2 != '.' && c2 != '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        yw7Var.O(i - yw7Var.b);
        return sb.toString();
    }

    public static String b(yw7 yw7Var, StringBuilder sb) {
        c(yw7Var);
        if (yw7Var.a() == 0) {
            return null;
        }
        String a = a(yw7Var, sb);
        if (!a.isEmpty()) {
            return a;
        }
        return String.valueOf((char) yw7Var.A());
    }

    public static void c(yw7 yw7Var) {
        while (true) {
            for (boolean z = true; yw7Var.a() > 0 && z; z = false) {
                int i = yw7Var.b;
                byte[] bArr = yw7Var.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    int i2 = yw7Var.c;
                    int i3 = i + 2;
                    if (i3 <= i2) {
                        int i4 = i + 1;
                        if (b == 47 && bArr[i4] == 42) {
                            while (true) {
                                int i5 = i3 + 1;
                                if (i5 >= i2) {
                                    break;
                                } else if (((char) bArr[i3]) == '*' && ((char) bArr[i5]) == '/') {
                                    i3 += 2;
                                    i2 = i3;
                                } else {
                                    i3 = i5;
                                }
                            }
                            yw7Var.O(i2 - yw7Var.b);
                        }
                    }
                } else {
                    yw7Var.O(1);
                }
            }
            return;
        }
    }
}

package defpackage;

import java.util.regex.Pattern;
public final class kzc {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final ey7 a = new ey7();
    public final StringBuilder b = new StringBuilder();

    public static String a(ey7 ey7Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = ey7Var.b;
        int i2 = ey7Var.c;
        while (i < i2 && !z) {
            char c2 = (char) ey7Var.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && ((c2 < '0' || c2 > '9') && c2 != '#' && c2 != '-' && c2 != '.' && c2 != '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        ey7Var.O(i - ey7Var.b);
        return sb.toString();
    }

    public static String b(ey7 ey7Var, StringBuilder sb) {
        c(ey7Var);
        if (ey7Var.a() == 0) {
            return null;
        }
        String a = a(ey7Var, sb);
        if (!a.isEmpty()) {
            return a;
        }
        return String.valueOf((char) ey7Var.A());
    }

    public static void c(ey7 ey7Var) {
        while (true) {
            for (boolean z = true; ey7Var.a() > 0 && z; z = false) {
                int i = ey7Var.b;
                byte[] bArr = ey7Var.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    int i2 = ey7Var.c;
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
                            ey7Var.O(i2 - ey7Var.b);
                        }
                    }
                } else {
                    ey7Var.O(1);
                }
            }
            return;
        }
    }
}

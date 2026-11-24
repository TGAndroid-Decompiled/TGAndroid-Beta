package defpackage;

import java.util.regex.Pattern;
public final class uuc {
    public static final Pattern c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final xu7 a = new xu7();
    public final StringBuilder b = new StringBuilder();

    public static String a(xu7 xu7Var, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = xu7Var.b;
        int i2 = xu7Var.c;
        while (i < i2 && !z) {
            char c2 = (char) xu7Var.a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && ((c2 < '0' || c2 > '9') && c2 != '#' && c2 != '-' && c2 != '.' && c2 != '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        xu7Var.O(i - xu7Var.b);
        return sb.toString();
    }

    public static String b(xu7 xu7Var, StringBuilder sb) {
        c(xu7Var);
        if (xu7Var.a() == 0) {
            return null;
        }
        String a = a(xu7Var, sb);
        if (!a.isEmpty()) {
            return a;
        }
        return String.valueOf((char) xu7Var.A());
    }

    public static void c(xu7 xu7Var) {
        while (true) {
            for (boolean z = true; xu7Var.a() > 0 && z; z = false) {
                int i = xu7Var.b;
                byte[] bArr = xu7Var.a;
                byte b = bArr[i];
                char c2 = (char) b;
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    int i2 = xu7Var.c;
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
                            xu7Var.O(i2 - xu7Var.b);
                        }
                    }
                } else {
                    xu7Var.O(1);
                }
            }
            return;
        }
    }
}

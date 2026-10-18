package i4;

import e2.x;
import java.util.regex.Pattern;
public final class a {
    public static final Pattern f12665c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final x f12666a = new x();
    public final StringBuilder f12667b = new StringBuilder();

    public static String a(x xVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = xVar.f8295b;
        int i11 = xVar.f8296c;
        while (i10 < i11 && !z10) {
            char c10 = (char) xVar.f8294a[i10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && ((c10 < '0' || c10 > '9') && c10 != '#' && c10 != '-' && c10 != '.' && c10 != '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c10);
            }
        }
        xVar.O(i10 - xVar.f8295b);
        return sb2.toString();
    }

    public static String b(x xVar, StringBuilder sb2) {
        c(xVar);
        if (xVar.a() == 0) {
            return null;
        }
        String a2 = a(xVar, sb2);
        if (!a2.isEmpty()) {
            return a2;
        }
        return "" + ((char) xVar.A());
    }

    public static void c(x xVar) {
        while (true) {
            for (boolean z10 = true; xVar.a() > 0 && z10; z10 = false) {
                int i10 = xVar.f8295b;
                byte[] bArr = xVar.f8294a;
                byte b10 = bArr[i10];
                char c10 = (char) b10;
                if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                    int i11 = xVar.f8296c;
                    int i12 = i10 + 2;
                    if (i12 <= i11) {
                        int i13 = i10 + 1;
                        if (b10 == 47 && bArr[i13] == 42) {
                            while (true) {
                                int i14 = i12 + 1;
                                if (i14 >= i11) {
                                    break;
                                } else if (((char) bArr[i12]) == '*' && ((char) bArr[i14]) == '/') {
                                    i12 += 2;
                                    i11 = i12;
                                } else {
                                    i12 = i14;
                                }
                            }
                            xVar.O(i11 - xVar.f8295b);
                        }
                    }
                } else {
                    xVar.O(1);
                }
            }
            return;
        }
    }
}

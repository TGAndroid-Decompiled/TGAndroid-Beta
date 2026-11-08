package l4;

import h2.x;
import java.util.regex.Pattern;
public final class a {
    public static final Pattern f18128c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final x f18129a = new x();
    public final StringBuilder f18130b = new StringBuilder();

    public static String a(x xVar, StringBuilder sb2) {
        boolean z9 = false;
        sb2.setLength(0);
        int i7 = xVar.f14163b;
        int i10 = xVar.f14164c;
        while (i7 < i10 && !z9) {
            char c10 = (char) xVar.f14162a[i7];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && ((c10 < '0' || c10 > '9') && c10 != '#' && c10 != '-' && c10 != '.' && c10 != '_'))) {
                z9 = true;
            } else {
                i7++;
                sb2.append(c10);
            }
        }
        xVar.O(i7 - xVar.f14163b);
        return sb2.toString();
    }

    public static String b(x xVar, StringBuilder sb2) {
        c(xVar);
        if (xVar.a() == 0) {
            return null;
        }
        String a10 = a(xVar, sb2);
        if (!a10.isEmpty()) {
            return a10;
        }
        return "" + ((char) xVar.A());
    }

    public static void c(x xVar) {
        while (true) {
            for (boolean z9 = true; xVar.a() > 0 && z9; z9 = false) {
                int i7 = xVar.f14163b;
                byte[] bArr = xVar.f14162a;
                byte b10 = bArr[i7];
                char c10 = (char) b10;
                if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                    int i10 = xVar.f14164c;
                    int i11 = i7 + 2;
                    if (i11 <= i10) {
                        int i12 = i7 + 1;
                        if (b10 == 47 && bArr[i12] == 42) {
                            while (true) {
                                int i13 = i11 + 1;
                                if (i13 >= i10) {
                                    break;
                                } else if (((char) bArr[i11]) == '*' && ((char) bArr[i13]) == '/') {
                                    i11 += 2;
                                    i10 = i11;
                                } else {
                                    i11 = i13;
                                }
                            }
                            xVar.O(i10 - xVar.f14163b);
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

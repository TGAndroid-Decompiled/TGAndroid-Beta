package k4;

import g2.y;
import java.util.regex.Pattern;
public final class a {
    public static final Pattern f16827c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final y f16828a = new y();
    public final StringBuilder f16829b = new StringBuilder();

    public static String a(y yVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i3 = yVar.f11924b;
        int i10 = yVar.f11925c;
        while (i3 < i10 && !z10) {
            char c2 = (char) yVar.f11923a[i3];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && ((c2 < '0' || c2 > '9') && c2 != '#' && c2 != '-' && c2 != '.' && c2 != '_'))) {
                z10 = true;
            } else {
                i3++;
                sb2.append(c2);
            }
        }
        yVar.O(i3 - yVar.f11924b);
        return sb2.toString();
    }

    public static String b(y yVar, StringBuilder sb2) {
        c(yVar);
        if (yVar.a() == 0) {
            return null;
        }
        String a10 = a(yVar, sb2);
        if (!a10.isEmpty()) {
            return a10;
        }
        return "" + ((char) yVar.A());
    }

    public static void c(y yVar) {
        while (true) {
            for (boolean z10 = true; yVar.a() > 0 && z10; z10 = false) {
                int i3 = yVar.f11924b;
                byte[] bArr = yVar.f11923a;
                byte b10 = bArr[i3];
                char c2 = (char) b10;
                if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                    int i10 = yVar.f11925c;
                    int i11 = i3 + 2;
                    if (i11 <= i10) {
                        int i12 = i3 + 1;
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
                            yVar.O(i10 - yVar.f11924b);
                        }
                    }
                } else {
                    yVar.O(1);
                }
            }
            return;
        }
    }
}

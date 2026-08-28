package a5;

import d5.y;
import java.util.regex.Pattern;
public final class b {
    public static final Pattern f51c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final y f52a = new y();
    public final StringBuilder f53b = new StringBuilder();

    public static String a(y yVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i9 = yVar.f4411b;
        int i10 = yVar.f4412c;
        while (i9 < i10 && !z10) {
            char c10 = (char) yVar.f4410a[i9];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && ((c10 < '0' || c10 > '9') && c10 != '#' && c10 != '-' && c10 != '.' && c10 != '_'))) {
                z10 = true;
            } else {
                i9++;
                sb2.append(c10);
            }
        }
        yVar.D(i9 - yVar.f4411b);
        return sb2.toString();
    }

    public static String b(y yVar, StringBuilder sb2) {
        c(yVar);
        if (yVar.a() == 0) {
            return null;
        }
        String a2 = a(yVar, sb2);
        if (!"".equals(a2)) {
            return a2;
        }
        return "" + ((char) yVar.r());
    }

    public static void c(y yVar) {
        while (true) {
            for (boolean z10 = true; yVar.a() > 0 && z10; z10 = false) {
                int i9 = yVar.f4411b;
                byte[] bArr = yVar.f4410a;
                byte b10 = bArr[i9];
                char c10 = (char) b10;
                if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
                    int i10 = yVar.f4412c;
                    int i11 = i9 + 2;
                    if (i11 <= i10) {
                        int i12 = i9 + 1;
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
                            yVar.D(i10 - yVar.f4411b);
                        }
                    }
                } else {
                    yVar.D(1);
                }
            }
            return;
        }
    }
}

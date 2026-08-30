package e5;

import h5.w;
import java.util.regex.Pattern;
public final class c {
    public static final Pattern f5109c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final w f5110a = new w();
    public final StringBuilder f5111b = new StringBuilder();

    public static String a(w wVar, StringBuilder sb) {
        boolean z4 = false;
        sb.setLength(0);
        int i10 = wVar.f7001b;
        int i11 = wVar.f7002c;
        while (i10 < i11 && !z4) {
            char c3 = (char) wVar.f7000a[i10];
            if ((c3 < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && ((c3 < '0' || c3 > '9') && c3 != '#' && c3 != '-' && c3 != '.' && c3 != '_'))) {
                z4 = true;
            } else {
                i10++;
                sb.append(c3);
            }
        }
        wVar.G(i10 - wVar.f7001b);
        return sb.toString();
    }

    public static String b(w wVar, StringBuilder sb) {
        c(wVar);
        if (wVar.a() == 0) {
            return null;
        }
        String a2 = a(wVar, sb);
        if (!"".equals(a2)) {
            return a2;
        }
        return "" + ((char) wVar.u());
    }

    public static void c(w wVar) {
        while (true) {
            for (boolean z4 = true; wVar.a() > 0 && z4; z4 = false) {
                int i10 = wVar.f7001b;
                byte[] bArr = wVar.f7000a;
                byte b10 = bArr[i10];
                char c3 = (char) b10;
                if (c3 != '\t' && c3 != '\n' && c3 != '\f' && c3 != '\r' && c3 != ' ') {
                    int i11 = wVar.f7002c;
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
                            wVar.G(i11 - wVar.f7001b);
                        }
                    }
                } else {
                    wVar.G(1);
                }
            }
            return;
        }
    }
}

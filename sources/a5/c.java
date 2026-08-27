package a5;

import d5.z;
import java.util.regex.Pattern;

public final class c {

    public static final Pattern f53c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final Pattern d = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");

    public final z f54a = new z();

    public final StringBuilder f55b = new StringBuilder();

    public static String a(z zVar, StringBuilder sb2) {
        boolean z10 = false;
        sb2.setLength(0);
        int i10 = zVar.f4859b;
        int i11 = zVar.f4860c;
        while (i10 < i11 && !z10) {
            char c10 = (char) zVar.f4858a[i10];
            if ((c10 < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !((c10 >= '0' && c10 <= '9') || c10 == '#' || c10 == '-' || c10 == '.' || c10 == '_'))) {
                z10 = true;
            } else {
                i10++;
                sb2.append(c10);
            }
        }
        zVar.D(i10 - zVar.f4859b);
        return sb2.toString();
    }

    public static String b(z zVar, StringBuilder sb2) {
        c(zVar);
        if (zVar.a() == 0) {
            return null;
        }
        String strA = a(zVar, sb2);
        if (!"".equals(strA)) {
            return strA;
        }
        return "" + ((char) zVar.r());
    }

    public static void c(z zVar) {
        while (true) {
            for (boolean z10 = true; zVar.a() > 0 && z10; z10 = false) {
                int i10 = zVar.f4859b;
                byte[] bArr = zVar.f4858a;
                byte b10 = bArr[i10];
                char c10 = (char) b10;
                if (c10 == '\t' || c10 == '\n' || c10 == '\f' || c10 == '\r' || c10 == ' ') {
                    zVar.D(1);
                } else {
                    int i11 = zVar.f4860c;
                    int i12 = i10 + 2;
                    if (i12 <= i11) {
                        int i13 = i10 + 1;
                        if (b10 == 47 && bArr[i13] == 42) {
                            while (true) {
                                int i14 = i12 + 1;
                                if (i14 >= i11) {
                                    break;
                                }
                                if (((char) bArr[i12]) == '*' && ((char) bArr[i14]) == '/') {
                                    i12 += 2;
                                    i11 = i12;
                                } else {
                                    i12 = i14;
                                }
                            }
                            zVar.D(i11 - zVar.f4859b);
                        }
                    }
                }
            }
            return;
        }
    }
}

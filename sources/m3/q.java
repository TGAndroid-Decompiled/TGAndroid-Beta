package m3;

import d5.g0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class q {

    public static final Pattern f17626c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    public int f17627a = -1;

    public int f17628b = -1;

    public final boolean a(String str) {
        Matcher matcher = f17626c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i10 = g0.f4795a;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f17627a = i11;
            this.f17628b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(z3.c cVar) {
        int i10 = 0;
        while (true) {
            z3.b[] bVarArr = cVar.f50188a;
            if (i10 >= bVarArr.length) {
                return;
            }
            z3.b bVar = bVarArr[i10];
            if (bVar instanceof e4.e) {
                e4.e eVar = (e4.e) bVar;
                if ("iTunSMPB".equals(eVar.f5200c) && a(eVar.d)) {
                    return;
                }
            } else if (bVar instanceof e4.k) {
                e4.k kVar = (e4.k) bVar;
                if ("com.apple.iTunes".equals(kVar.f5210b) && "iTunSMPB".equals(kVar.f5211c) && a(kVar.d)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }
}

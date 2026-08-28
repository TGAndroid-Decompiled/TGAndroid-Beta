package m3;

import d5.f0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class q {
    public static final Pattern f17250c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int f17251a = -1;
    public int f17252b = -1;

    public final boolean a(String str) {
        Matcher matcher = f17250c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i9 = f0.f4349a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f17251a = parseInt;
                    this.f17252b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(z3.c cVar) {
        int i9 = 0;
        while (true) {
            z3.b[] bVarArr = cVar.f50288a;
            if (i9 < bVarArr.length) {
                z3.b bVar = bVarArr[i9];
                if (bVar instanceof e4.e) {
                    e4.e eVar = (e4.e) bVar;
                    if ("iTunSMPB".equals(eVar.f4841c) && a(eVar.d)) {
                        return;
                    }
                } else if (bVar instanceof e4.k) {
                    e4.k kVar = (e4.k) bVar;
                    if ("com.apple.iTunes".equals(kVar.f4851b) && "iTunSMPB".equals(kVar.f4852c) && a(kVar.d)) {
                        return;
                    }
                } else {
                    continue;
                }
                i9++;
            } else {
                return;
            }
        }
    }
}

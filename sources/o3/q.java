package o3;

import f5.d0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class q {
    public static final Pattern f19109c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int f19110a = -1;
    public int f19111b = -1;

    public final boolean a(String str) {
        Matcher matcher = f19109c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                int i10 = d0.f6579a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f19110a = parseInt;
                    this.f19111b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(b4.c cVar) {
        int i10 = 0;
        while (true) {
            b4.b[] bVarArr = cVar.f1919a;
            if (i10 < bVarArr.length) {
                b4.b bVar = bVarArr[i10];
                if (bVar instanceof g4.e) {
                    g4.e eVar = (g4.e) bVar;
                    if ("iTunSMPB".equals(eVar.f6997c) && a(eVar.d)) {
                        return;
                    }
                } else if (bVar instanceof g4.k) {
                    g4.k kVar = (g4.k) bVar;
                    if ("com.apple.iTunes".equals(kVar.f7007b) && "iTunSMPB".equals(kVar.f7008c) && a(kVar.d)) {
                        return;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                return;
            }
        }
    }
}

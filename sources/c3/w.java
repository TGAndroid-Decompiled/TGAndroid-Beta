package c3;

import b2.o0;
import b2.p0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class w {
    public static final Pattern f3804c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int f3805a = -1;
    public int f3806b = -1;

    public final boolean a(String str) {
        Matcher matcher = f3804c.matcher(str);
        if (matcher.find()) {
            try {
                String group = matcher.group(1);
                String str2 = e2.d0.f7871a;
                int parseInt = Integer.parseInt(group, 16);
                int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                if (parseInt > 0 || parseInt2 > 0) {
                    this.f3805a = parseInt;
                    this.f3806b = parseInt2;
                    return true;
                }
                return false;
            } catch (NumberFormatException unused) {
                return false;
            }
        }
        return false;
    }

    public final void b(p0 p0Var) {
        int i10 = 0;
        while (true) {
            o0[] o0VarArr = p0Var.f3170a;
            if (i10 < o0VarArr.length) {
                o0 o0Var = o0VarArr[i10];
                if (o0Var instanceof q3.e) {
                    q3.e eVar = (q3.e) o0Var;
                    if ("iTunSMPB".equals(eVar.f41070c) && a(eVar.d)) {
                        return;
                    }
                } else if (o0Var instanceof q3.l) {
                    q3.l lVar = (q3.l) o0Var;
                    if ("com.apple.iTunes".equals(lVar.f41080b) && "iTunSMPB".equals(lVar.f41081c) && a(lVar.d)) {
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

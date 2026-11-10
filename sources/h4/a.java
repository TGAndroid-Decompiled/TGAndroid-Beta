package h4;

import a8.p0;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import c4.d;
import c4.l;
import c4.m;
import h2.j;
import h2.x;
import h9.i0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class a implements m {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern f14210e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder f14211a = new StringBuilder();
    public final ArrayList f14212b = new ArrayList();
    public final x f14213c = new x();

    public static g2.b a(android.text.Spanned r21, java.lang.String r22) {
        throw new UnsupportedOperationException("Method not decompiled: h4.a.a(android.text.Spanned, java.lang.String):g2.b");
    }

    public static long b(Matcher matcher, int i7) {
        long j3;
        String group = matcher.group(i7 + 1);
        if (group != null) {
            j3 = Long.parseLong(group) * 3600000;
        } else {
            j3 = 0;
        }
        String group2 = matcher.group(i7 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j3;
        String group3 = matcher.group(i7 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i7 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    @Override
    public final int P() {
        return 1;
    }

    @Override
    public final d c(int i7, int i10, byte[] bArr) {
        return p0.a(this, bArr, i10);
    }

    @Override
    public final void z(byte[] bArr, int i7, int i10, l lVar, j jVar) {
        ArrayList arrayList;
        String n10;
        String str;
        a aVar = this;
        long j3 = lVar.f5294a;
        x xVar = aVar.f14213c;
        xVar.L(i7 + i10, bArr);
        xVar.N(i7);
        Charset J = xVar.J();
        if (J == null) {
            J = StandardCharsets.UTF_8;
        }
        long j10 = -9223372036854775807L;
        if (j3 != -9223372036854775807L && lVar.f5295b) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        while (true) {
            String n11 = xVar.n(J);
            if (n11 == null) {
                break;
            } else if (!n11.isEmpty()) {
                try {
                    Integer.parseInt(n11);
                    n10 = xVar.n(J);
                } catch (NumberFormatException unused) {
                    h2.a.l("SubripParser", "Skipping invalid index: ".concat(n11));
                }
                if (n10 == null) {
                    h2.a.l("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(n10);
                if (matcher.matches()) {
                    long b10 = b(matcher, 1);
                    long b11 = b(matcher, 6);
                    StringBuilder sb2 = aVar.f14211a;
                    sb2.setLength(0);
                    long j11 = j10;
                    ArrayList arrayList2 = aVar.f14212b;
                    arrayList2.clear();
                    for (String n12 = xVar.n(J); !TextUtils.isEmpty(n12); n12 = xVar.n(J)) {
                        if (sb2.length() > 0) {
                            sb2.append("<br>");
                        }
                        String trim = n12.trim();
                        StringBuilder sb3 = new StringBuilder(trim);
                        Matcher matcher2 = f14210e.matcher(trim);
                        int i11 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i11;
                            int length = group.length();
                            sb3.replace(start, start + length, "");
                            i11 += length;
                            j3 = j3;
                        }
                        sb2.append(sb3.toString());
                    }
                    long j12 = j3;
                    Spanned fromHtml = Html.fromHtml(sb2.toString());
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList2.size()) {
                            str = (String) arrayList2.get(i12);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i12++;
                        } else {
                            str = null;
                            break;
                        }
                    }
                    if (j12 != j11 && b11 < j12) {
                        if (arrayList != null) {
                            arrayList.add(new c4.a(b10, b11 - b10, i0.u(a(fromHtml, str))));
                        }
                    } else {
                        jVar.accept(new c4.a(b10, b11 - b10, i0.u(a(fromHtml, str))));
                    }
                    aVar = this;
                    j10 = j11;
                    j3 = j12;
                } else {
                    h2.a.l("SubripParser", "Skipping invalid timing: ".concat(n10));
                    aVar = this;
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i13 = 0;
            while (i13 < size) {
                Object obj = arrayList.get(i13);
                i13++;
                jVar.accept((c4.a) obj);
            }
        }
    }

    @Override
    public final void reset() {
    }
}

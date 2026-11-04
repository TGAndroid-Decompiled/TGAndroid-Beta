package g4;

import a1.g;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import b4.d;
import b4.l;
import b4.m;
import g2.k;
import g2.y;
import g9.i0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class a implements m {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern f11967e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder f11968a = new StringBuilder();
    public final ArrayList f11969b = new ArrayList();
    public final y f11970c = new y();

    public static f2.b a(android.text.Spanned r21, java.lang.String r22) {
        throw new UnsupportedOperationException("Method not decompiled: g4.a.a(android.text.Spanned, java.lang.String):f2.b");
    }

    public static long b(Matcher matcher, int i3) {
        long j10;
        String group = matcher.group(i3 + 1);
        if (group != null) {
            j10 = Long.parseLong(group) * 3600000;
        } else {
            j10 = 0;
        }
        String group2 = matcher.group(i3 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j10;
        String group3 = matcher.group(i3 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i3 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    @Override
    public final d B(int i3, int i10, byte[] bArr) {
        return g.a(this, bArr, i10);
    }

    @Override
    public final void F(byte[] bArr, int i3, int i10, l lVar, k kVar) {
        ArrayList arrayList;
        String n4;
        String str;
        a aVar = this;
        long j10 = lVar.f2374a;
        y yVar = aVar.f11970c;
        yVar.L(i3 + i10, bArr);
        yVar.N(i3);
        Charset J = yVar.J();
        if (J == null) {
            J = StandardCharsets.UTF_8;
        }
        long j11 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && lVar.f2375b) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        while (true) {
            String n10 = yVar.n(J);
            if (n10 == null) {
                break;
            } else if (!n10.isEmpty()) {
                try {
                    Integer.parseInt(n10);
                    n4 = yVar.n(J);
                } catch (NumberFormatException unused) {
                    g2.a.l("SubripParser", "Skipping invalid index: ".concat(n10));
                }
                if (n4 == null) {
                    g2.a.l("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(n4);
                if (matcher.matches()) {
                    long b10 = b(matcher, 1);
                    long b11 = b(matcher, 6);
                    StringBuilder sb2 = aVar.f11968a;
                    sb2.setLength(0);
                    long j12 = j11;
                    ArrayList arrayList2 = aVar.f11969b;
                    arrayList2.clear();
                    for (String n11 = yVar.n(J); !TextUtils.isEmpty(n11); n11 = yVar.n(J)) {
                        if (sb2.length() > 0) {
                            sb2.append("<br>");
                        }
                        String trim = n11.trim();
                        StringBuilder sb3 = new StringBuilder(trim);
                        Matcher matcher2 = f11967e.matcher(trim);
                        int i11 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i11;
                            int length = group.length();
                            sb3.replace(start, start + length, "");
                            i11 += length;
                            j10 = j10;
                        }
                        sb2.append(sb3.toString());
                    }
                    long j13 = j10;
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
                    if (j13 != j12 && b11 < j13) {
                        if (arrayList != null) {
                            arrayList.add(new b4.a(b10, b11 - b10, i0.u(a(fromHtml, str))));
                        }
                    } else {
                        kVar.accept(new b4.a(b10, b11 - b10, i0.u(a(fromHtml, str))));
                    }
                    aVar = this;
                    j11 = j12;
                    j10 = j13;
                } else {
                    g2.a.l("SubripParser", "Skipping invalid timing: ".concat(n4));
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
                kVar.accept((b4.a) obj);
            }
        }
    }

    @Override
    public final int Y() {
        return 1;
    }

    @Override
    public final void reset() {
    }
}

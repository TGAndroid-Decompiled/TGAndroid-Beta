package e4;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import e2.j;
import e2.x;
import e9.n0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import si.o0;
import z3.d;
import z3.l;
import z3.m;
public final class a implements m {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder f8341a = new StringBuilder();
    public final ArrayList f8342b = new ArrayList();
    public final x f8343c = new x();

    public static d2.b b(android.text.Spanned r21, java.lang.String r22) {
        throw new UnsupportedOperationException("Method not decompiled: e4.a.b(android.text.Spanned, java.lang.String):d2.b");
    }

    public static long d(Matcher matcher, int i10) {
        long j10;
        String group = matcher.group(i10 + 1);
        if (group != null) {
            j10 = Long.parseLong(group) * 3600000;
        } else {
            j10 = 0;
        }
        String group2 = matcher.group(i10 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j10;
        String group3 = matcher.group(i10 + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i10 + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    @Override
    public final d a(int i10, int i11, byte[] bArr) {
        return o0.a(this, bArr, i11);
    }

    @Override
    public final int c() {
        return 1;
    }

    @Override
    public final void f(byte[] bArr, int i10, int i11, l lVar, j jVar) {
        ArrayList arrayList;
        String n10;
        String str;
        a aVar = this;
        long j10 = lVar.f51123a;
        x xVar = aVar.f8343c;
        xVar.L(i10 + i11, bArr);
        xVar.N(i10);
        Charset J = xVar.J();
        if (J == null) {
            J = StandardCharsets.UTF_8;
        }
        long j11 = -9223372036854775807L;
        if (j10 != -9223372036854775807L && lVar.f51124b) {
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
                    e2.a.l("SubripParser", "Skipping invalid index: ".concat(n11));
                }
                if (n10 == null) {
                    e2.a.l("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(n10);
                if (matcher.matches()) {
                    long d10 = d(matcher, 1);
                    long d11 = d(matcher, 6);
                    StringBuilder sb2 = aVar.f8341a;
                    sb2.setLength(0);
                    long j12 = j11;
                    ArrayList arrayList2 = aVar.f8342b;
                    arrayList2.clear();
                    for (String n12 = xVar.n(J); !TextUtils.isEmpty(n12); n12 = xVar.n(J)) {
                        if (sb2.length() > 0) {
                            sb2.append("<br>");
                        }
                        String trim = n12.trim();
                        StringBuilder sb3 = new StringBuilder(trim);
                        Matcher matcher2 = e.matcher(trim);
                        int i12 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i12;
                            int length = group.length();
                            sb3.replace(start, start + length, "");
                            i12 += length;
                            j10 = j10;
                        }
                        sb2.append(sb3.toString());
                    }
                    long j13 = j10;
                    Spanned fromHtml = Html.fromHtml(sb2.toString());
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList2.size()) {
                            str = (String) arrayList2.get(i13);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i13++;
                        } else {
                            str = null;
                            break;
                        }
                    }
                    if (j13 != j12 && d11 < j13) {
                        if (arrayList != null) {
                            arrayList.add(new z3.a(d10, d11 - d10, n0.y(b(fromHtml, str))));
                        }
                    } else {
                        jVar.accept(new z3.a(d10, d11 - d10, n0.y(b(fromHtml, str))));
                    }
                    aVar = this;
                    j11 = j12;
                    j10 = j13;
                } else {
                    e2.a.l("SubripParser", "Skipping invalid timing: ".concat(n10));
                    aVar = this;
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayList.get(i14);
                i14++;
                jVar.accept((z3.a) obj);
            }
        }
    }

    @Override
    public final void reset() {
    }
}

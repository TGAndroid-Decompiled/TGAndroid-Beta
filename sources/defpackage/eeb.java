package defpackage;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class eeb implements reb {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder a = new StringBuilder();
    public final ArrayList b = new ArrayList();
    public final ey7 c = new ey7();

    public static defpackage.m43 a(android.text.Spanned r21, java.lang.String r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eeb.a(android.text.Spanned, java.lang.String):m43");
    }

    public static long b(Matcher matcher, int i) {
        long j;
        String group = matcher.group(i + 1);
        if (group != null) {
            j = Long.parseLong(group) * 3600000;
        } else {
            j = 0;
        }
        String group2 = matcher.group(i + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j;
        String group3 = matcher.group(i + 3);
        group3.getClass();
        long parseLong2 = (Long.parseLong(group3) * 1000) + parseLong;
        String group4 = matcher.group(i + 4);
        if (group4 != null) {
            parseLong2 += Long.parseLong(group4);
        }
        return parseLong2 * 1000;
    }

    @Override
    public final heb j(int i, int i2, byte[] bArr) {
        return uh9.c(this, bArr, i2);
    }

    @Override
    public final void l(byte[] bArr, int i, int i2, qeb qebVar, ot2 ot2Var) {
        ArrayList arrayList;
        String n;
        String str;
        eeb eebVar = this;
        long j = qebVar.a;
        ey7 ey7Var = eebVar.c;
        ey7Var.L(i + i2, bArr);
        ey7Var.N(i);
        Charset J = ey7Var.J();
        if (J == null) {
            J = StandardCharsets.UTF_8;
        }
        long j2 = -9223372036854775807L;
        if (j != -9223372036854775807L && qebVar.b) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        while (true) {
            String n2 = ey7Var.n(J);
            if (n2 == null) {
                break;
            } else if (!n2.isEmpty()) {
                try {
                    Integer.parseInt(n2);
                    n = ey7Var.n(J);
                } catch (NumberFormatException unused) {
                    efd.f("SubripParser", "Skipping invalid index: ".concat(n2));
                }
                if (n == null) {
                    efd.f("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(n);
                if (matcher.matches()) {
                    long b = b(matcher, 1);
                    long b2 = b(matcher, 6);
                    StringBuilder sb = eebVar.a;
                    sb.setLength(0);
                    long j3 = j2;
                    ArrayList arrayList2 = eebVar.b;
                    arrayList2.clear();
                    for (String n3 = ey7Var.n(J); !TextUtils.isEmpty(n3); n3 = ey7Var.n(J)) {
                        if (sb.length() > 0) {
                            sb.append("<br>");
                        }
                        String trim = n3.trim();
                        StringBuilder sb2 = new StringBuilder(trim);
                        Matcher matcher2 = e.matcher(trim);
                        int i3 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i3;
                            int length = group.length();
                            sb2.replace(start, start + length, "");
                            i3 += length;
                            j = j;
                        }
                        sb.append(sb2.toString());
                    }
                    long j4 = j;
                    Spanned fromHtml = Html.fromHtml(sb.toString());
                    int i4 = 0;
                    while (true) {
                        if (i4 < arrayList2.size()) {
                            str = (String) arrayList2.get(i4);
                            if (str.matches("\\{\\\\an[1-9]\\}")) {
                                break;
                            }
                            i4++;
                        } else {
                            str = null;
                            break;
                        }
                    }
                    if (j4 != j3 && b2 < j4) {
                        if (arrayList != null) {
                            arrayList.add(new p43(b, b2 - b, po5.u(a(fromHtml, str))));
                        }
                    } else {
                        ot2Var.accept(new p43(b, b2 - b, po5.u(a(fromHtml, str))));
                    }
                    eebVar = this;
                    j2 = j3;
                    j = j4;
                } else {
                    efd.f("SubripParser", "Skipping invalid timing: ".concat(n));
                    eebVar = this;
                }
            }
        }
        if (arrayList != null) {
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                ot2Var.accept((p43) obj);
            }
        }
    }

    @Override
    public final int s() {
        return 1;
    }

    @Override
    public final void reset() {
    }
}

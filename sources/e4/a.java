package e4;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import e2.h;
import e2.v;
import e9.i0;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w.f;
import z3.d;
import z3.l;
import z3.m;
public final class a implements m {
    public static final Pattern d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    public static final Pattern f8865e = Pattern.compile("\\{\\\\.*?\\}");
    public final StringBuilder f8866a = new StringBuilder();
    public final ArrayList f8867b = new ArrayList();
    public final v f8868c = new v();

    public static d2.b a(android.text.Spanned r21, java.lang.String r22) {
        throw new UnsupportedOperationException("Method not decompiled: e4.a.a(android.text.Spanned, java.lang.String):d2.b");
    }

    public static long b(Matcher matcher, int i10) {
        long j3;
        String group = matcher.group(i10 + 1);
        if (group != null) {
            j3 = Long.parseLong(group) * 3600000;
        } else {
            j3 = 0;
        }
        String group2 = matcher.group(i10 + 2);
        group2.getClass();
        long parseLong = (Long.parseLong(group2) * 60000) + j3;
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
    public final int U() {
        return 1;
    }

    @Override
    public final void e0(byte[] bArr, int i10, int i11, l lVar, h hVar) {
        ArrayList arrayList;
        String k10;
        String str;
        a aVar = this;
        long j3 = lVar.f50732a;
        v vVar = aVar.f8868c;
        vVar.H(i10 + i11, bArr);
        vVar.J(i10);
        Charset F = vVar.F();
        if (F == null) {
            F = StandardCharsets.UTF_8;
        }
        long j10 = -9223372036854775807L;
        if (j3 != -9223372036854775807L && lVar.f50733b) {
            arrayList = new ArrayList();
        } else {
            arrayList = null;
        }
        while (true) {
            String k11 = vVar.k(F);
            if (k11 == null) {
                break;
            } else if (!k11.isEmpty()) {
                try {
                    Integer.parseInt(k11);
                    k10 = vVar.k(F);
                } catch (NumberFormatException unused) {
                    e2.a.n("SubripParser", "Skipping invalid index: ".concat(k11));
                }
                if (k10 == null) {
                    e2.a.n("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = d.matcher(k10);
                if (matcher.matches()) {
                    long b10 = b(matcher, 1);
                    long b11 = b(matcher, 6);
                    StringBuilder sb2 = aVar.f8866a;
                    sb2.setLength(0);
                    ArrayList arrayList2 = aVar.f8867b;
                    arrayList2.clear();
                    String k12 = vVar.k(F);
                    while (!TextUtils.isEmpty(k12)) {
                        long j11 = j10;
                        if (sb2.length() > 0) {
                            sb2.append("<br>");
                        }
                        String trim = k12.trim();
                        StringBuilder sb3 = new StringBuilder(trim);
                        Matcher matcher2 = f8865e.matcher(trim);
                        int i12 = 0;
                        while (matcher2.find()) {
                            String group = matcher2.group();
                            arrayList2.add(group);
                            int start = matcher2.start() - i12;
                            int length = group.length();
                            sb3.replace(start, start + length, "");
                            i12 += length;
                            j3 = j3;
                        }
                        sb2.append(sb3.toString());
                        k12 = vVar.k(F);
                        j10 = j11;
                    }
                    long j12 = j3;
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
                    if (j12 != j13 && b11 < j12) {
                        if (arrayList != null) {
                            arrayList.add(new z3.a(b10, b11 - b10, i0.z(a(fromHtml, str))));
                        }
                    } else {
                        hVar.accept(new z3.a(b10, b11 - b10, i0.z(a(fromHtml, str))));
                    }
                    aVar = this;
                    j10 = j13;
                    j3 = j12;
                } else {
                    e2.a.n("SubripParser", "Skipping invalid timing: ".concat(k10));
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
                hVar.accept((z3.a) obj);
            }
        }
    }

    @Override
    public final d p(int i10, int i11, byte[] bArr) {
        return f.a(this, bArr, i11);
    }

    @Override
    public final void reset() {
    }
}

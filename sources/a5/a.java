package a5;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import h5.d0;
import h5.w;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import v4.f;
public final class a extends v4.e {
    public static final Pattern f101s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    public final boolean f102n;
    public final b f103o;
    public LinkedHashMap f104p;
    public float f105q;
    public float f106r;

    public a(List list) {
        super("SsaDecoder");
        this.f105q = -3.4028235E38f;
        this.f106r = -3.4028235E38f;
        if (list != null && !list.isEmpty()) {
            this.f102n = true;
            String m9 = d0.m((byte[]) list.get(0));
            h5.a.f(m9.startsWith("Format:"));
            b b10 = b.b(m9);
            b10.getClass();
            this.f103o = b10;
            m(new w((byte[]) list.get(1)), r8.d.f46769c);
            return;
        }
        this.f102n = false;
        this.f103o = null;
    }

    public static int l(long j10, ArrayList arrayList, ArrayList arrayList2) {
        int i10;
        ArrayList arrayList3;
        int size = arrayList.size() - 1;
        while (true) {
            if (size >= 0) {
                if (((Long) arrayList.get(size)).longValue() == j10) {
                    return size;
                }
                if (((Long) arrayList.get(size)).longValue() < j10) {
                    i10 = size + 1;
                    break;
                }
                size--;
            } else {
                i10 = 0;
                break;
            }
        }
        arrayList.add(i10, Long.valueOf(j10));
        if (i10 == 0) {
            arrayList3 = new ArrayList();
        } else {
            arrayList3 = new ArrayList((Collection) arrayList2.get(i10 - 1));
        }
        arrayList2.add(i10, arrayList3);
        return i10;
    }

    public static long n(String str) {
        Matcher matcher = f101s.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        int i10 = d0.f7237a;
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(group) * 3600000000L);
    }

    @Override
    public final f k(int i10, boolean z4, byte[] bArr) {
        b bVar;
        w wVar;
        Charset charset;
        b bVar2;
        e eVar;
        int i11;
        int i12;
        float f10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        int i13;
        PointF pointF;
        float f11;
        int i14;
        int i15;
        float f12;
        float f13;
        boolean z10;
        int i16;
        int i17;
        float f14;
        int i18;
        float f15;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        a aVar = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        w wVar2 = new w(bArr, i10);
        Charset B = wVar2.B();
        if (B == null) {
            B = r8.d.f46769c;
        }
        boolean z11 = aVar.f102n;
        if (!z11) {
            aVar.m(wVar2, B);
        }
        if (z11) {
            bVar = aVar.f103o;
        } else {
            bVar = null;
        }
        while (true) {
            String h = wVar2.h(B);
            if (h != null) {
                if (h.startsWith("Format:")) {
                    bVar = b.b(h);
                } else {
                    if (h.startsWith("Dialogue:")) {
                        if (bVar == null) {
                            h5.a.K("SsaDecoder", "Skipping dialogue line before complete format: ".concat(h));
                        } else {
                            int i24 = bVar.f110e;
                            h5.a.f(h.startsWith("Dialogue:"));
                            String[] split = h.substring(9).split(",", i24);
                            if (split.length != i24) {
                                h5.a.K("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(h));
                            } else {
                                long n10 = n(split[bVar.f107a]);
                                if (n10 == -9223372036854775807L) {
                                    h5.a.K("SsaDecoder", "Skipping invalid timing: ".concat(h));
                                } else {
                                    long n11 = n(split[bVar.f108b]);
                                    if (n11 == -9223372036854775807L) {
                                        h5.a.K("SsaDecoder", "Skipping invalid timing: ".concat(h));
                                    } else {
                                        LinkedHashMap linkedHashMap = aVar.f104p;
                                        if (linkedHashMap != null && (i23 = bVar.f109c) != -1) {
                                            eVar = (e) linkedHashMap.get(split[i23].trim());
                                        } else {
                                            eVar = null;
                                        }
                                        String str = split[bVar.d];
                                        Matcher matcher = d.f120a.matcher(str);
                                        int i25 = -1;
                                        PointF pointF2 = null;
                                        while (matcher.find()) {
                                            w wVar3 = wVar2;
                                            String group = matcher.group(1);
                                            group.getClass();
                                            try {
                                                PointF a2 = d.a(group);
                                                if (a2 != null) {
                                                    pointF2 = a2;
                                                }
                                            } catch (RuntimeException unused) {
                                            }
                                            try {
                                                Matcher matcher2 = d.d.matcher(group);
                                                if (matcher2.find()) {
                                                    String group2 = matcher2.group(1);
                                                    group2.getClass();
                                                    i22 = e.a(group2);
                                                } else {
                                                    i22 = -1;
                                                }
                                                if (i22 != -1) {
                                                    i25 = i22;
                                                }
                                            } catch (RuntimeException unused2) {
                                            }
                                            wVar2 = wVar3;
                                        }
                                        wVar = wVar2;
                                        String replace = d.f120a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f16 = aVar.f105q;
                                        float f17 = aVar.f106r;
                                        SpannableString spannableString = new SpannableString(replace);
                                        if (eVar != null) {
                                            boolean z12 = eVar.f128g;
                                            Integer num = eVar.d;
                                            Integer num2 = eVar.f125c;
                                            if (num2 != null) {
                                                z10 = z12;
                                                charset = B;
                                                bVar2 = bVar;
                                                i16 = 33;
                                                i17 = 0;
                                                spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            } else {
                                                z10 = z12;
                                                charset = B;
                                                bVar2 = bVar;
                                                i16 = 33;
                                                i17 = 0;
                                            }
                                            if (eVar.f130j == 3 && num != null) {
                                                spannableString.setSpan(new BackgroundColorSpan(num.intValue()), i17, spannableString.length(), i16);
                                            }
                                            float f18 = eVar.f126e;
                                            if (f18 != -3.4028235E38f && f17 != -3.4028235E38f) {
                                                f14 = f18 / f17;
                                                i18 = 1;
                                            } else {
                                                f14 = -3.4028235E38f;
                                                i18 = Integer.MIN_VALUE;
                                            }
                                            boolean z13 = eVar.f127f;
                                            if (z13 && z10) {
                                                f15 = f14;
                                                i19 = i18;
                                                i20 = 33;
                                                i21 = 0;
                                                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                f15 = f14;
                                                i19 = i18;
                                                i20 = 33;
                                                i21 = 0;
                                                if (z13) {
                                                    spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                                } else if (z10) {
                                                    spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            }
                                            if (eVar.h) {
                                                spannableString.setSpan(new UnderlineSpan(), i21, spannableString.length(), i20);
                                            }
                                            if (eVar.f129i) {
                                                spannableString.setSpan(new StrikethroughSpan(), i21, spannableString.length(), i20);
                                            }
                                            f10 = f15;
                                            i12 = i19;
                                            i11 = -1;
                                        } else {
                                            charset = B;
                                            bVar2 = bVar;
                                            i11 = -1;
                                            i12 = Integer.MIN_VALUE;
                                            f10 = -3.4028235E38f;
                                        }
                                        if (i25 != i11) {
                                            i11 = i25;
                                        } else if (eVar != null) {
                                            i11 = eVar.f124b;
                                        }
                                        switch (i11) {
                                            case 0:
                                            default:
                                                e2.c.q(i11, "Unknown alignment: ", "SsaDecoder");
                                            case -1:
                                                alignment2 = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = Layout.Alignment.ALIGN_NORMAL;
                                                alignment2 = alignment;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = Layout.Alignment.ALIGN_CENTER;
                                                alignment2 = alignment;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                                alignment2 = alignment;
                                                break;
                                        }
                                        int i26 = Integer.MIN_VALUE;
                                        switch (i11) {
                                            case 0:
                                            default:
                                                e2.c.q(i11, "Unknown alignment: ", "SsaDecoder");
                                            case -1:
                                                i13 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i13 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i13 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i13 = 2;
                                                break;
                                        }
                                        switch (i11) {
                                            case 0:
                                            default:
                                                e2.c.q(i11, "Unknown alignment: ", "SsaDecoder");
                                            case -1:
                                                pointF = pointF2;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                pointF = pointF2;
                                                i26 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                pointF = pointF2;
                                                i26 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                pointF = pointF2;
                                                i26 = 0;
                                                break;
                                        }
                                        if (pointF != null && f17 != -3.4028235E38f && f16 != -3.4028235E38f) {
                                            f11 = pointF.y / f17;
                                            f13 = pointF.x / f16;
                                        } else {
                                            f11 = 0.05f;
                                            if (i13 != 0) {
                                                i15 = 1;
                                                if (i13 != 1) {
                                                    i14 = 2;
                                                    if (i13 != 2) {
                                                        f12 = -3.4028235E38f;
                                                    } else {
                                                        f12 = 0.95f;
                                                    }
                                                } else {
                                                    i14 = 2;
                                                    f12 = 0.5f;
                                                }
                                            } else {
                                                i14 = 2;
                                                i15 = 1;
                                                f12 = 0.05f;
                                            }
                                            if (i26 != 0) {
                                                if (i26 != i15) {
                                                    if (i26 != i14) {
                                                        f11 = -3.4028235E38f;
                                                    } else {
                                                        f11 = 0.95f;
                                                    }
                                                } else {
                                                    f11 = 0.5f;
                                                }
                                            }
                                            f13 = f12;
                                        }
                                        v4.b bVar3 = new v4.b(spannableString, alignment2, null, null, f11, 0, i26, f13, i13, i12, f10, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                                        int l10 = l(n11, arrayList2, arrayList);
                                        for (int l11 = l(n10, arrayList2, arrayList); l11 < l10; l11++) {
                                            ((List) arrayList.get(l11)).add(bVar3);
                                        }
                                        aVar = this;
                                        wVar2 = wVar;
                                        B = charset;
                                        bVar = bVar2;
                                    }
                                }
                            }
                        }
                    }
                    wVar = wVar2;
                    charset = B;
                    bVar2 = bVar;
                    aVar = this;
                    wVar2 = wVar;
                    B = charset;
                    bVar = bVar2;
                }
            } else {
                return new bf.b(2, arrayList, arrayList2);
            }
        }
    }

    public final void m(h5.w r29, java.nio.charset.Charset r30) {
        throw new UnsupportedOperationException("Method not decompiled: a5.a.m(h5.w, java.nio.charset.Charset):void");
    }
}

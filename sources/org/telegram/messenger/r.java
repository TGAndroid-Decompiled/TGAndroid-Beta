package org.telegram.messenger;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.ui.Components.d41;
public final class r implements u10 {
    public final SpannableStringBuilder f25187a;
    public final int f25188b;
    public final boolean f25189c;
    public final boolean d;

    public r(SpannableStringBuilder spannableStringBuilder, int i7, boolean z9, boolean z10) {
        this.f25187a = spannableStringBuilder;
        this.f25188b = i7;
        this.f25189c = z9;
        this.d = z10;
    }

    @Override
    public final Object run() {
        boolean z9;
        SpannableStringBuilder spannableStringBuilder;
        int i7;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        String str;
        int i15;
        SpannableStringBuilder spannableStringBuilder2 = this.f25187a;
        String obj = spannableStringBuilder2.toString();
        int i16 = 0;
        if (!obj.contains("\u202c") && !obj.contains("\u202d") && !obj.contains("\u202e")) {
            if (!g0.T.matcher(obj).find()) {
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), URLSpan.class);
                boolean z11 = true;
                int length = uRLSpanArr.length - 1;
                while (true) {
                    z9 = this.d;
                    if (length < 0) {
                        break;
                    }
                    URLSpan uRLSpan = uRLSpanArr[length];
                    if (!(uRLSpan instanceof d41) || z9) {
                        spannableStringBuilder2.removeSpan(uRLSpan);
                    }
                    length--;
                }
                ArrayList arrayList = new ArrayList();
                boolean z12 = this.f25189c;
                int i17 = 4;
                if (!z12 && (this.f25188b & 4) != 0) {
                    Linkify.addLinks(spannableStringBuilder2, 4);
                }
                Pattern pattern = qc.f24692a;
                String[] strArr = {"http://", "https://", "tg://", "tonsite://"};
                f fVar = g0.f22544c0;
                if (TextUtils.indexOf((CharSequence) spannableStringBuilder2, (char) 9472) >= 0) {
                    spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder2.toString().replace((char) 9472, ' '));
                } else {
                    spannableStringBuilder = spannableStringBuilder2;
                }
                if (!TextUtils.isEmpty(spannableStringBuilder) && TextUtils.lastIndexOf(spannableStringBuilder, '_') == spannableStringBuilder.length() - 1) {
                    spannableStringBuilder = new SpannableStringBuilder(spannableStringBuilder.toString()).replace(spannableStringBuilder.length() - 1, spannableStringBuilder.length(), (CharSequence) "a");
                }
                Matcher matcher = pattern.matcher(spannableStringBuilder);
                while (matcher.find()) {
                    int start = matcher.start();
                    int end = matcher.end();
                    if (fVar != null && !fVar.acceptMatch(spannableStringBuilder, start, end)) {
                        i14 = i16;
                    } else {
                        ?? obj2 = new Object();
                        String group = matcher.group(i16);
                        i14 = i16;
                        while (true) {
                            if (i16 < i17) {
                                String str2 = strArr[i16];
                                if (group.regionMatches(true, 0, str2, 0, str2.length())) {
                                    String str3 = strArr[i16];
                                    str = group;
                                    if (!group.regionMatches(false, 0, str3, 0, str3.length())) {
                                        str = strArr[i16] + str.substring(strArr[i16].length());
                                    }
                                    i15 = 1;
                                } else {
                                    i16++;
                                    i17 = 4;
                                }
                            } else {
                                str = group;
                                i15 = i14;
                                break;
                            }
                        }
                        if (i15 == 0) {
                            str = a8.p0.s(new StringBuilder(), strArr[i14], str);
                        }
                        if (z12) {
                            z11 = true;
                            if (!vf.c.g(Uri.parse(str), true, null)) {
                            }
                        } else {
                            z11 = true;
                        }
                        obj2.f21965a = str;
                        obj2.f21966b = start;
                        obj2.f21967c = end;
                        arrayList.add(obj2);
                    }
                    i16 = i14;
                    i17 = 4;
                }
                i7 = i16;
                Collections.sort(arrayList, new jg.x(11));
                int size = arrayList.size();
                int i18 = i7;
                while (i18 < size - 1) {
                    d0 d0Var = (d0) arrayList.get(i18);
                    int i19 = i18 + 1;
                    d0 d0Var2 = (d0) arrayList.get(i19);
                    int i20 = d0Var.f21966b;
                    int i21 = d0Var2.f21966b;
                    if (i20 <= i21 && (i10 = d0Var.f21967c) > i21) {
                        int i22 = d0Var2.f21967c;
                        if (i22 <= i10 || (i11 = i10 - i20) > (i12 = i22 - i21)) {
                            i13 = i19;
                        } else if (i11 < i12) {
                            i13 = i18;
                        } else {
                            i13 = -1;
                        }
                        if (i13 != -1) {
                            arrayList.remove(i13);
                            size--;
                        }
                    }
                    i18 = i19;
                }
                if (arrayList.size() != 0) {
                    int size2 = arrayList.size();
                    for (int i23 = i7; i23 < size2; i23++) {
                        d0 d0Var3 = (d0) arrayList.get(i23);
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) spannableStringBuilder2.getSpans(d0Var3.f21966b, d0Var3.f21967c, URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 0) {
                            for (int i24 = i7; i24 < uRLSpanArr2.length; i24++) {
                                URLSpan uRLSpan2 = uRLSpanArr2[i24];
                                spannableStringBuilder2.removeSpan(uRLSpan2);
                                if (!(uRLSpan2 instanceof d41) || z9) {
                                    spannableStringBuilder2.removeSpan(uRLSpan2);
                                }
                            }
                        }
                        String str4 = d0Var3.f21965a;
                        if (str4 != null) {
                            str4 = str4.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                        }
                        if (!vf.c.k(str4)) {
                            spannableStringBuilder2.setSpan(new URLSpan(str4), d0Var3.f21966b, d0Var3.f21967c, 33);
                        }
                    }
                    z10 = z11;
                    return Boolean.valueOf(z10);
                }
                z10 = i7;
                return Boolean.valueOf(z10);
            }
        }
        i7 = 0;
        z10 = i7;
        return Boolean.valueOf(z10);
    }
}

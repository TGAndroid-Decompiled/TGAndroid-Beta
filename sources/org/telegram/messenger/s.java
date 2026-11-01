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
import org.telegram.ui.Components.h51;
public final class s implements j20 {
    public final SpannableStringBuilder f18014a;
    public final int f18015b;
    public final boolean f18016c;
    public final boolean d;

    public s(SpannableStringBuilder spannableStringBuilder, int i10, boolean z10, boolean z11) {
        this.f18014a = spannableStringBuilder;
        this.f18015b = i10;
        this.f18016c = z10;
        this.d = z11;
    }

    @Override
    public final Object run() {
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        int i10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        String str;
        int i16;
        SpannableStringBuilder spannableStringBuilder2 = this.f18014a;
        String obj = spannableStringBuilder2.toString();
        int i17 = 0;
        if (!obj.contains("\u202c") && !obj.contains("\u202d") && !obj.contains("\u202e")) {
            if (!i0.T.matcher(obj).find()) {
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), URLSpan.class);
                boolean z12 = true;
                int length = uRLSpanArr.length - 1;
                while (true) {
                    z10 = this.d;
                    if (length < 0) {
                        break;
                    }
                    URLSpan uRLSpan = uRLSpanArr[length];
                    if (!(uRLSpan instanceof h51) || z10) {
                        spannableStringBuilder2.removeSpan(uRLSpan);
                    }
                    length--;
                }
                ArrayList arrayList = new ArrayList();
                boolean z13 = this.f18016c;
                int i18 = 4;
                if (!z13 && (this.f18015b & 4) != 0) {
                    Linkify.addLinks(spannableStringBuilder2, 4);
                }
                Pattern pattern = sc.f18078a;
                String[] strArr = {"http://", "https://", "tg://", "tonsite://"};
                f fVar = i0.f16150c0;
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
                        i15 = i17;
                    } else {
                        ?? obj2 = new Object();
                        String group = matcher.group(i17);
                        i15 = i17;
                        while (true) {
                            if (i17 < i18) {
                                String str2 = strArr[i17];
                                if (group.regionMatches(true, 0, str2, 0, str2.length())) {
                                    String str3 = strArr[i17];
                                    str = group;
                                    if (!group.regionMatches(false, 0, str3, 0, str3.length())) {
                                        str = strArr[i17] + str.substring(strArr[i17].length());
                                    }
                                    i16 = 1;
                                } else {
                                    i17++;
                                    i18 = 4;
                                }
                            } else {
                                str = group;
                                i16 = i15;
                                break;
                            }
                        }
                        if (i16 == 0) {
                            str = a1.g.r(new StringBuilder(), strArr[i15], str);
                        }
                        if (z13) {
                            z12 = true;
                            if (!gf.f.e(Uri.parse(str), true, null)) {
                            }
                        } else {
                            z12 = true;
                        }
                        obj2.f15670a = str;
                        obj2.f15671b = start;
                        obj2.f15672c = end;
                        arrayList.add(obj2);
                    }
                    i17 = i15;
                    i18 = 4;
                }
                i10 = i17;
                Collections.sort(arrayList, new a4.d(13));
                int size = arrayList.size();
                int i19 = i10;
                while (i19 < size - 1) {
                    f0 f0Var = (f0) arrayList.get(i19);
                    int i20 = i19 + 1;
                    f0 f0Var2 = (f0) arrayList.get(i20);
                    int i21 = f0Var.f15671b;
                    int i22 = f0Var2.f15671b;
                    if (i21 <= i22 && (i11 = f0Var.f15672c) > i22) {
                        int i23 = f0Var2.f15672c;
                        if (i23 <= i11 || (i12 = i11 - i21) > (i13 = i23 - i22)) {
                            i14 = i20;
                        } else if (i12 < i13) {
                            i14 = i19;
                        } else {
                            i14 = -1;
                        }
                        if (i14 != -1) {
                            arrayList.remove(i14);
                            size--;
                        }
                    }
                    i19 = i20;
                }
                if (arrayList.size() != 0) {
                    int size2 = arrayList.size();
                    for (int i24 = i10; i24 < size2; i24++) {
                        f0 f0Var3 = (f0) arrayList.get(i24);
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) spannableStringBuilder2.getSpans(f0Var3.f15671b, f0Var3.f15672c, URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 0) {
                            for (int i25 = i10; i25 < uRLSpanArr2.length; i25++) {
                                URLSpan uRLSpan2 = uRLSpanArr2[i25];
                                spannableStringBuilder2.removeSpan(uRLSpan2);
                                if (!(uRLSpan2 instanceof h51) || z10) {
                                    spannableStringBuilder2.removeSpan(uRLSpan2);
                                }
                            }
                        }
                        String str4 = f0Var3.f15670a;
                        if (str4 != null) {
                            str4 = str4.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                        }
                        if (!gf.f.i(str4)) {
                            spannableStringBuilder2.setSpan(new URLSpan(str4), f0Var3.f15671b, f0Var3.f15672c, 33);
                        }
                    }
                    z11 = z12;
                    return Boolean.valueOf(z11);
                }
                z11 = i10;
                return Boolean.valueOf(z11);
            }
        }
        i10 = 0;
        z11 = i10;
        return Boolean.valueOf(z11);
    }
}

package defpackage;

import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.text.util.Linkify;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class ql implements iac {
    public final SpannableStringBuilder a;
    public final byte b;
    public final boolean c;
    public final boolean d;

    public ql(SpannableStringBuilder spannableStringBuilder, int i, boolean z, boolean z2) {
        this.a = spannableStringBuilder;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    @Override
    public final Object run() {
        boolean z;
        boolean z2;
        boolean z3;
        SpannableStringBuilder spannableStringBuilder;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z4;
        SpannableStringBuilder spannableStringBuilder2 = this.a;
        String obj = spannableStringBuilder2.toString();
        int i7 = 0;
        if (!obj.contains("\u202c") && !obj.contains("\u202d") && !obj.contains("\u202e")) {
            if (!gm.T.matcher(obj).find()) {
                URLSpan[] uRLSpanArr = (URLSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), URLSpan.class);
                boolean z5 = true;
                int length = uRLSpanArr.length - 1;
                while (true) {
                    z3 = this.d;
                    if (length < 0) {
                        break;
                    }
                    URLSpan uRLSpan = uRLSpanArr[length];
                    if (!(uRLSpan instanceof i6c) || z3) {
                        spannableStringBuilder2.removeSpan(uRLSpan);
                    }
                    length--;
                }
                ArrayList arrayList = new ArrayList();
                boolean z6 = this.c;
                int i8 = 4;
                if (!z6 && (this.b & 4) != 0) {
                    Linkify.addLinks(spannableStringBuilder2, 4);
                }
                Pattern pattern = r66.a;
                String[] strArr = {"http://", "https://", "tg://", "tonsite://"};
                il ilVar = gm.c0;
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
                    if (ilVar != null && !ilVar.acceptMatch(spannableStringBuilder, start, end)) {
                        i5 = i7;
                        z4 = z5;
                    } else {
                        ?? obj2 = new Object();
                        String group = matcher.group(i7);
                        i5 = i7;
                        while (true) {
                            if (i7 < i8) {
                                String str = strArr[i7];
                                if (group.regionMatches(true, 0, str, 0, str.length())) {
                                    String str2 = strArr[i7];
                                    if (!group.regionMatches(false, 0, str2, 0, str2.length())) {
                                        group = strArr[i7] + group.substring(strArr[i7].length());
                                    }
                                    i6 = 1;
                                } else {
                                    i7++;
                                    i8 = 4;
                                }
                            } else {
                                i6 = i5;
                                break;
                            }
                        }
                        if (i6 == 0) {
                            group = b10.j(new StringBuilder(), strArr[i5], group);
                        }
                        if (z6) {
                            z4 = true;
                            if (!l11.g(Uri.parse(group), true, null)) {
                            }
                        } else {
                            z4 = true;
                        }
                        obj2.a = group;
                        obj2.b = start;
                        obj2.c = end;
                        arrayList.add(obj2);
                    }
                    z5 = z4;
                    i7 = i5;
                    i8 = 4;
                }
                int i9 = i7;
                boolean z7 = z5;
                Collections.sort(arrayList, new sa((byte) 2));
                int size = arrayList.size();
                int i10 = i9;
                while (i10 < size - 1) {
                    dm dmVar = (dm) arrayList.get(i10);
                    int i11 = i10 + 1;
                    dm dmVar2 = (dm) arrayList.get(i11);
                    int i12 = dmVar.b;
                    int i13 = dmVar2.b;
                    if (i12 <= i13 && (i = dmVar.c) > i13) {
                        int i14 = dmVar2.c;
                        if (i14 <= i || (i3 = i - i12) > (i4 = i14 - i13)) {
                            i2 = i11;
                        } else if (i3 < i4) {
                            i2 = i10;
                        } else {
                            i2 = -1;
                        }
                        if (i2 != -1) {
                            arrayList.remove(i2);
                            size--;
                        }
                    }
                    i10 = i11;
                }
                z = i9;
                if (arrayList.size() != 0) {
                    int size2 = arrayList.size();
                    for (int i15 = i9; i15 < size2; i15++) {
                        dm dmVar3 = (dm) arrayList.get(i15);
                        URLSpan[] uRLSpanArr2 = (URLSpan[]) spannableStringBuilder2.getSpans(dmVar3.b, dmVar3.c, URLSpan.class);
                        if (uRLSpanArr2 != null && uRLSpanArr2.length > 0) {
                            for (int i16 = i9; i16 < uRLSpanArr2.length; i16++) {
                                URLSpan uRLSpan2 = uRLSpanArr2[i16];
                                spannableStringBuilder2.removeSpan(uRLSpan2);
                                if (!(uRLSpan2 instanceof i6c) || z3) {
                                    spannableStringBuilder2.removeSpan(uRLSpan2);
                                }
                            }
                        }
                        String str3 = dmVar3.a;
                        if (str3 != null) {
                            str3 = str3.replaceAll("∕|⁄|%E2%81%84|%E2%88%95", "/");
                        }
                        if (!l11.l(str3)) {
                            spannableStringBuilder2.setSpan(new URLSpan(str3), dmVar3.b, dmVar3.c, 33);
                        }
                    }
                    z2 = z7;
                    return Boolean.valueOf(z2);
                }
                z2 = z;
                return Boolean.valueOf(z2);
            }
        }
        z = 0;
        z2 = z;
        return Boolean.valueOf(z2);
    }
}

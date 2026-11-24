package defpackage;

import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import j$.util.DesugarCollections;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public abstract class cxc {
    public static final Pattern a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", -1);
        hashMap.put("lime", -16711936);
        hashMap.put("cyan", -16711681);
        hashMap.put("red", -65536);
        hashMap.put("yellow", -256);
        hashMap.put("magenta", -65281);
        hashMap.put("blue", -16776961);
        hashMap.put("black", -16777216);
        c = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", -1);
        hashMap2.put("bg_lime", -16711936);
        hashMap2.put("bg_cyan", -16711681);
        hashMap2.put("bg_red", -65536);
        hashMap2.put("bg_yellow", -256);
        hashMap2.put("bg_magenta", -65281);
        hashMap2.put("bg_blue", -16776961);
        hashMap2.put("bg_black", -16777216);
        d = DesugarCollections.unmodifiableMap(hashMap2);
    }

    public static void a(String str, zwc zwcVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c2;
        char c3;
        char c4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = zwcVar.b;
        int length = spannableStringBuilder.length();
        String str2 = zwcVar.a;
        str2.getClass();
        int i7 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i6, length, 33);
                break;
            case 2:
                for (String str3 : zwcVar.d) {
                    Map map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i6, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i6, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i6, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new nlc(zwcVar.c), i6, length, 33);
                break;
            case 7:
                int c5 = c(list2, str, zwcVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, ywc.c);
                int i8 = zwcVar.b;
                int i9 = 0;
                int i10 = 0;
                while (i9 < arrayList.size()) {
                    if ("rt".equals(((ywc) arrayList.get(i9)).a.a)) {
                        ywc ywcVar = (ywc) arrayList.get(i9);
                        int c6 = c(list2, str, ywcVar.a);
                        if (c6 == i7) {
                            if (c5 != i7) {
                                c6 = c5;
                            } else {
                                c6 = 1;
                            }
                        }
                        int i11 = ywcVar.a.b - i10;
                        int i12 = ywcVar.b - i10;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i11, i12);
                        spannableStringBuilder.delete(i11, i12);
                        spannableStringBuilder.setSpan(new eq9(subSequence.toString(), c6), i8, i11, 33);
                        i10 = subSequence.length() + i10;
                        i8 = i11;
                    }
                    i9++;
                    i7 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b2 = b(list2, str, zwcVar);
        for (int i13 = 0; i13 < b2.size(); i13++) {
            wwc wwcVar = ((axc) b2.get(i13)).b;
            int i14 = wwcVar.l;
            if (i14 == -1 && wwcVar.m == -1) {
                i = -1;
            } else {
                if (i14 == 1) {
                    c3 = 1;
                } else {
                    c3 = 0;
                }
                if (wwcVar.m == 1) {
                    c4 = 2;
                } else {
                    c4 = 0;
                }
                i = c4 | c3;
            }
            if (i != -1) {
                int i15 = wwcVar.l;
                if (i15 == -1 && wwcVar.m == -1) {
                    i5 = -1;
                    i2 = 1;
                } else {
                    i2 = 1;
                    if (i15 == 1) {
                        i3 = 1;
                    } else {
                        i3 = 0;
                    }
                    if (wwcVar.m == 1) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    i5 = i3 | i4;
                }
                lwe.a(spannableStringBuilder, new StyleSpan(i5), i6, length);
            } else {
                i2 = 1;
            }
            if (wwcVar.j == i2) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i6, length, 33);
            }
            if (wwcVar.k == i2) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i6, length, 33);
            }
            if (wwcVar.g) {
                if (wwcVar.g) {
                    lwe.a(spannableStringBuilder, new ForegroundColorSpan(wwcVar.f), i6, length);
                } else {
                    dq9.m("Font color not defined");
                    return;
                }
            }
            if (wwcVar.i) {
                if (wwcVar.i) {
                    lwe.a(spannableStringBuilder, new BackgroundColorSpan(wwcVar.h), i6, length);
                } else {
                    dq9.m("Background color not defined.");
                    return;
                }
            }
            if (wwcVar.e != null) {
                lwe.a(spannableStringBuilder, new TypefaceSpan(wwcVar.e), i6, length);
            }
            int i16 = wwcVar.n;
            if (i16 != 1) {
                if (i16 != 2) {
                    if (i16 == 3) {
                        lwe.a(spannableStringBuilder, new RelativeSizeSpan(wwcVar.o / 100.0f), i6, length);
                    }
                } else {
                    lwe.a(spannableStringBuilder, new RelativeSizeSpan(wwcVar.o), i6, length);
                }
            } else {
                lwe.a(spannableStringBuilder, new AbsoluteSizeSpan((int) wwcVar.o, true), i6, length);
            }
            if (wwcVar.q) {
                spannableStringBuilder.setSpan(new Object(), i6, length, 33);
            }
        }
    }

    public static ArrayList b(List list, String str, zwc zwcVar) {
        int i;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            wwc wwcVar = (wwc) list.get(i2);
            String str2 = zwcVar.a;
            Set set = zwcVar.d;
            String str3 = zwcVar.c;
            if (wwcVar.a.isEmpty() && wwcVar.b.isEmpty() && wwcVar.c.isEmpty() && wwcVar.d.isEmpty()) {
                i = TextUtils.isEmpty(str2);
            } else {
                int a2 = wwc.a(wwc.a(wwc.a(0, 1073741824, wwcVar.a, str), 2, wwcVar.b, str2), 4, wwcVar.d, str3);
                if (a2 != -1 && set.containsAll(wwcVar.c)) {
                    i = a2 + (wwcVar.c.size() << 2);
                } else {
                    i = 0;
                }
            }
            if (i > 0) {
                arrayList.add(new axc(i, wwcVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, zwc zwcVar) {
        ArrayList b2 = b(list, str, zwcVar);
        for (int i = 0; i < b2.size(); i++) {
            int i2 = ((axc) b2.get(i)).b.p;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    public static xwc d(String str, Matcher matcher, yw7 yw7Var, ArrayList arrayList) {
        bxc bxcVar = new bxc();
        try {
            String group = matcher.group(1);
            group.getClass();
            bxcVar.a = exc.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            bxcVar.b = exc.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, bxcVar);
            StringBuilder sb = new StringBuilder();
            String n = yw7Var.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(n)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(n.trim());
                n = yw7Var.n(StandardCharsets.UTF_8);
            }
            bxcVar.c = f(str, sb.toString(), arrayList);
            return new xwc(bxcVar.a().a(), bxcVar.a, bxcVar.b);
        } catch (IllegalArgumentException unused) {
            ncd.f("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static void e(java.lang.String r18, defpackage.bxc r19) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxc.e(java.lang.String, bxc):void");
    }

    public static SpannedString f(String str, String str2, List list) {
        boolean z;
        boolean z2;
        int i;
        char c2;
        char c3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            String str3 = "";
            if (i2 < str2.length()) {
                char charAt = str2.charAt(i2);
                char c4 = 65535;
                if (charAt != '&') {
                    if (charAt != '<') {
                        spannableStringBuilder.append(charAt);
                        i2++;
                    } else {
                        int i3 = i2 + 1;
                        if (i3 < str2.length()) {
                            if (str2.charAt(i3) == '/') {
                                z = true;
                            } else {
                                z = false;
                            }
                            int indexOf = str2.indexOf(62, i3);
                            if (indexOf == -1) {
                                i3 = str2.length();
                            } else {
                                i3 = indexOf + 1;
                            }
                            int i4 = i3 - 2;
                            if (str2.charAt(i4) == '/') {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (z) {
                                i = 2;
                            } else {
                                i = 1;
                            }
                            int i5 = i2 + i;
                            if (!z2) {
                                i4 = i3 - 1;
                            }
                            String substring = str2.substring(i5, i4);
                            if (!substring.trim().isEmpty()) {
                                String trim = substring.trim();
                                jte.f(!trim.isEmpty());
                                String str4 = hac.a;
                                String str5 = trim.split("[ \\.]", 2)[0];
                                str5.getClass();
                                switch (str5.hashCode()) {
                                    case 98:
                                        if (str5.equals("b")) {
                                            c2 = 0;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 99:
                                        if (str5.equals("c")) {
                                            c2 = 1;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 105:
                                        if (str5.equals("i")) {
                                            c2 = 2;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 117:
                                        if (str5.equals("u")) {
                                            c2 = 3;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 118:
                                        if (str5.equals("v")) {
                                            c2 = 4;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3650:
                                        if (str5.equals("rt")) {
                                            c2 = 5;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3314158:
                                        if (str5.equals("lang")) {
                                            c2 = 6;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    case 3511770:
                                        if (str5.equals("ruby")) {
                                            c2 = 7;
                                            break;
                                        }
                                        c2 = 65535;
                                        break;
                                    default:
                                        c2 = 65535;
                                        break;
                                }
                                switch (c2) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        if (z) {
                                            while (!arrayDeque.isEmpty()) {
                                                zwc zwcVar = (zwc) arrayDeque.pop();
                                                a(str, zwcVar, arrayList, spannableStringBuilder, list);
                                                if (!arrayDeque.isEmpty()) {
                                                    arrayList.add(new ywc(zwcVar, spannableStringBuilder.length()));
                                                } else {
                                                    arrayList.clear();
                                                }
                                                if (zwcVar.a.equals(str5)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        } else if (!z2) {
                                            int length = spannableStringBuilder.length();
                                            String trim2 = substring.trim();
                                            jte.f(!trim2.isEmpty());
                                            int indexOf2 = trim2.indexOf(" ");
                                            if (indexOf2 == -1) {
                                                c3 = 0;
                                            } else {
                                                str3 = trim2.substring(indexOf2).trim();
                                                c3 = 0;
                                                trim2 = trim2.substring(0, indexOf2);
                                            }
                                            String[] split = trim2.split("\\.", -1);
                                            String str6 = split[c3];
                                            HashSet hashSet = new HashSet();
                                            for (int i6 = 1; i6 < split.length; i6++) {
                                                hashSet.add(split[i6]);
                                            }
                                            arrayDeque.push(new zwc(str6, length, str3, hashSet));
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                        i2 = i3;
                    }
                } else {
                    i2++;
                    int indexOf3 = str2.indexOf(59, i2);
                    int indexOf4 = str2.indexOf(32, i2);
                    if (indexOf3 == -1) {
                        indexOf3 = indexOf4;
                    } else if (indexOf4 != -1) {
                        indexOf3 = Math.min(indexOf3, indexOf4);
                    }
                    if (indexOf3 != -1) {
                        String substring2 = str2.substring(i2, indexOf3);
                        switch (substring2.hashCode()) {
                            case 3309:
                                if (substring2.equals("gt")) {
                                    c4 = 0;
                                    break;
                                }
                                break;
                            case 3464:
                                if (substring2.equals("lt")) {
                                    c4 = 1;
                                    break;
                                }
                                break;
                            case 96708:
                                if (substring2.equals("amp")) {
                                    c4 = 2;
                                    break;
                                }
                                break;
                            case 3374865:
                                if (substring2.equals("nbsp")) {
                                    c4 = 3;
                                    break;
                                }
                                break;
                        }
                        switch (c4) {
                            case 0:
                                spannableStringBuilder.append('>');
                                break;
                            case 1:
                                spannableStringBuilder.append('<');
                                break;
                            case 2:
                                spannableStringBuilder.append('&');
                                break;
                            case 3:
                                spannableStringBuilder.append(' ');
                                break;
                            default:
                                ncd.f("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
                                break;
                        }
                        if (indexOf3 == indexOf4) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        i2 = indexOf3 + 1;
                    } else {
                        spannableStringBuilder.append(charAt);
                    }
                }
            } else {
                while (!arrayDeque.isEmpty()) {
                    a(str, (zwc) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new zwc("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    public static void g(String str, bxc bxcVar) {
        int indexOf = str.indexOf(44);
        char c2 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            int i = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c2 = 3;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                    i = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i = 0;
                    break;
                default:
                    ncd.f("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            bxcVar.g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            bxcVar.e = exc.b(str);
            bxcVar.f = false;
            return;
        }
        bxcVar.e = Integer.parseInt(str);
        bxcVar.f = true;
    }
}

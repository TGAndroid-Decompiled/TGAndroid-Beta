package i4;

import android.graphics.Color;
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
import e2.d0;
import e2.v;
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
import v7.p6;
public abstract class h {
    public static final Pattern f11850a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*)?$");
    public static final Pattern f11851b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map f11852c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f11852c = DesugarCollections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = DesugarCollections.unmodifiableMap(hashMap2);
    }

    public static void a(String str, e eVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c10;
        char c11;
        char c12;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15 = eVar.f11837b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.f11836a;
        str2.getClass();
        int i16 = -1;
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c10 = 0;
                    break;
                }
                c10 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c10 = 1;
                    break;
                }
                c10 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c10 = 2;
                    break;
                }
                c10 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c10 = 3;
                    break;
                }
                c10 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c10 = 4;
                    break;
                }
                c10 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c10 = 5;
                    break;
                }
                c10 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c10 = 6;
                    break;
                }
                c10 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c10 = 7;
                    break;
                }
                c10 = 65535;
                break;
            default:
                c10 = 65535;
                break;
        }
        switch (c10) {
            case 0:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i15, length, 33);
                break;
            case 2:
                for (String str3 : eVar.d) {
                    Map map = f11852c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i15, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i15, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i15, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i15, length, 33);
                break;
            case 5:
                spannableStringBuilder.setSpan(new d2.h(eVar.f11838c), i15, length, 33);
                break;
            case 7:
                int c13 = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.f11833c);
                int i17 = eVar.f11837b;
                int i18 = 0;
                int i19 = 0;
                while (i18 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i18)).f11834a.f11836a)) {
                        d dVar = (d) arrayList.get(i18);
                        int c14 = c(list2, str, dVar.f11834a);
                        if (c14 == i16) {
                            if (c13 != i16) {
                                c14 = c13;
                            } else {
                                c14 = 1;
                            }
                        }
                        int i20 = dVar.f11834a.f11837b - i19;
                        int i21 = dVar.f11835b - i19;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i20, i21);
                        spannableStringBuilder.delete(i20, i21);
                        spannableStringBuilder.setSpan(new d2.f(subSequence.toString(), c14), i17, i20, 33);
                        i19 = subSequence.length() + i19;
                        i17 = i20;
                    }
                    i18++;
                    i16 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b10 = b(list2, str, eVar);
        for (int i22 = 0; i22 < b10.size(); i22++) {
            b bVar = ((f) b10.get(i22)).f11840b;
            int i23 = bVar.f11824l;
            if (i23 == -1 && bVar.f11825m == -1) {
                i10 = -1;
            } else {
                if (i23 == 1) {
                    c11 = 1;
                } else {
                    c11 = 0;
                }
                if (bVar.f11825m == 1) {
                    c12 = 2;
                } else {
                    c12 = 0;
                }
                i10 = c12 | c11;
            }
            if (i10 != -1) {
                int i24 = bVar.f11824l;
                if (i24 == -1 && bVar.f11825m == -1) {
                    i14 = -1;
                    i11 = 1;
                } else {
                    i11 = 1;
                    if (i24 == 1) {
                        i12 = 1;
                    } else {
                        i12 = 0;
                    }
                    if (bVar.f11825m == 1) {
                        i13 = 2;
                    } else {
                        i13 = 0;
                    }
                    i14 = i12 | i13;
                }
                p6.a(new StyleSpan(i14), spannableStringBuilder, i15, length);
            } else {
                i11 = 1;
            }
            if (bVar.f11822j == i11) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i15, length, 33);
            }
            if (bVar.f11823k == i11) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i15, length, 33);
            }
            if (bVar.f11820g) {
                if (bVar.f11820g) {
                    p6.a(new ForegroundColorSpan(bVar.f11819f), spannableStringBuilder, i15, length);
                } else {
                    throw new IllegalStateException("Font color not defined");
                }
            }
            if (bVar.f11821i) {
                if (bVar.f11821i) {
                    p6.a(new BackgroundColorSpan(bVar.h), spannableStringBuilder, i15, length);
                } else {
                    throw new IllegalStateException("Background color not defined.");
                }
            }
            if (bVar.f11818e != null) {
                p6.a(new TypefaceSpan(bVar.f11818e), spannableStringBuilder, i15, length);
            }
            int i25 = bVar.f11826n;
            if (i25 != 1) {
                if (i25 != 2) {
                    if (i25 == 3) {
                        p6.a(new RelativeSizeSpan(bVar.f11827o / 100.0f), spannableStringBuilder, i15, length);
                    }
                } else {
                    p6.a(new RelativeSizeSpan(bVar.f11827o), spannableStringBuilder, i15, length);
                }
            } else {
                p6.a(new AbsoluteSizeSpan((int) bVar.f11827o, true), spannableStringBuilder, i15, length);
            }
            if (bVar.f11829q) {
                spannableStringBuilder.setSpan(new Object(), i15, length, 33);
            }
        }
    }

    public static ArrayList b(List list, String str, e eVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            b bVar = (b) list.get(i11);
            String str2 = eVar.f11836a;
            Set set = eVar.d;
            String str3 = eVar.f11838c;
            if (bVar.f11815a.isEmpty() && bVar.f11816b.isEmpty() && bVar.f11817c.isEmpty() && bVar.d.isEmpty()) {
                i10 = TextUtils.isEmpty(str2);
            } else {
                int a2 = b.a(b.a(b.a(0, 1073741824, bVar.f11815a, str), 2, bVar.f11816b, str2), 4, bVar.d, str3);
                if (a2 != -1 && set.containsAll(bVar.f11817c)) {
                    i10 = a2 + (bVar.f11817c.size() * 4);
                } else {
                    i10 = 0;
                }
            }
            if (i10 > 0) {
                arrayList.add(new f(i10, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList b10 = b(list, str, eVar);
        for (int i10 = 0; i10 < b10.size(); i10++) {
            int i11 = ((f) b10.get(i10)).f11840b.f11828p;
            if (i11 != -1) {
                return i11;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, v vVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String group = matcher.group(1);
            group.getClass();
            gVar.f11841a = i.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            gVar.f11842b = i.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, gVar);
            StringBuilder sb2 = new StringBuilder();
            vVar.getClass();
            String k10 = vVar.k(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(k10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(k10.trim());
                k10 = vVar.k(StandardCharsets.UTF_8);
            }
            gVar.f11843c = f(str, sb2.toString(), arrayList);
            return new c(gVar.a().a(), gVar.f11841a, gVar.f11842b);
        } catch (IllegalArgumentException unused) {
            e2.a.n("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static void e(java.lang.String r18, i4.g r19) {
        throw new UnsupportedOperationException("Method not decompiled: i4.h.e(java.lang.String, i4.g):void");
    }

    public static SpannedString f(String str, String str2, List list) {
        boolean z10;
        boolean z11;
        int i10;
        char c10;
        char c11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            String str3 = "";
            if (i11 < str2.length()) {
                char charAt = str2.charAt(i11);
                char c12 = 65535;
                if (charAt != '&') {
                    if (charAt != '<') {
                        spannableStringBuilder.append(charAt);
                        i11++;
                    } else {
                        int i12 = i11 + 1;
                        if (i12 < str2.length()) {
                            if (str2.charAt(i12) == '/') {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int indexOf = str2.indexOf(62, i12);
                            if (indexOf == -1) {
                                i12 = str2.length();
                            } else {
                                i12 = indexOf + 1;
                            }
                            int i13 = i12 - 2;
                            if (str2.charAt(i13) == '/') {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z10) {
                                i10 = 2;
                            } else {
                                i10 = 1;
                            }
                            int i14 = i11 + i10;
                            if (!z11) {
                                i13 = i12 - 1;
                            }
                            String substring = str2.substring(i14, i13);
                            if (!substring.trim().isEmpty()) {
                                String trim = substring.trim();
                                e2.d.b(!trim.isEmpty());
                                String str4 = d0.f8737a;
                                String str5 = trim.split("[ \\.]", 2)[0];
                                str5.getClass();
                                switch (str5.hashCode()) {
                                    case 98:
                                        if (str5.equals("b")) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 99:
                                        if (str5.equals("c")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 105:
                                        if (str5.equals("i")) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 117:
                                        if (str5.equals("u")) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 118:
                                        if (str5.equals("v")) {
                                            c10 = 4;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 3650:
                                        if (str5.equals("rt")) {
                                            c10 = 5;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 3314158:
                                        if (str5.equals("lang")) {
                                            c10 = 6;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 3511770:
                                        if (str5.equals("ruby")) {
                                            c10 = 7;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    default:
                                        c10 = 65535;
                                        break;
                                }
                                switch (c10) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        if (z10) {
                                            while (!arrayDeque.isEmpty()) {
                                                e eVar = (e) arrayDeque.pop();
                                                a(str, eVar, arrayList, spannableStringBuilder, list);
                                                if (!arrayDeque.isEmpty()) {
                                                    arrayList.add(new d(eVar, spannableStringBuilder.length()));
                                                } else {
                                                    arrayList.clear();
                                                }
                                                if (eVar.f11836a.equals(str5)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        } else if (!z11) {
                                            int length = spannableStringBuilder.length();
                                            String trim2 = substring.trim();
                                            e2.d.b(!trim2.isEmpty());
                                            int indexOf2 = trim2.indexOf(" ");
                                            if (indexOf2 == -1) {
                                                c11 = 0;
                                            } else {
                                                str3 = trim2.substring(indexOf2).trim();
                                                c11 = 0;
                                                trim2 = trim2.substring(0, indexOf2);
                                            }
                                            String[] split = trim2.split("\\.", -1);
                                            String str6 = split[c11];
                                            HashSet hashSet = new HashSet();
                                            for (int i15 = 1; i15 < split.length; i15++) {
                                                hashSet.add(split[i15]);
                                            }
                                            arrayDeque.push(new e(str6, length, str3, hashSet));
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                        i11 = i12;
                    }
                } else {
                    i11++;
                    int indexOf3 = str2.indexOf(59, i11);
                    int indexOf4 = str2.indexOf(32, i11);
                    if (indexOf3 == -1) {
                        indexOf3 = indexOf4;
                    } else if (indexOf4 != -1) {
                        indexOf3 = Math.min(indexOf3, indexOf4);
                    }
                    if (indexOf3 != -1) {
                        String substring2 = str2.substring(i11, indexOf3);
                        substring2.getClass();
                        switch (substring2.hashCode()) {
                            case 3309:
                                if (substring2.equals("gt")) {
                                    c12 = 0;
                                    break;
                                }
                                break;
                            case 3464:
                                if (substring2.equals("lt")) {
                                    c12 = 1;
                                    break;
                                }
                                break;
                            case 96708:
                                if (substring2.equals("amp")) {
                                    c12 = 2;
                                    break;
                                }
                                break;
                            case 3374865:
                                if (substring2.equals("nbsp")) {
                                    c12 = 3;
                                    break;
                                }
                                break;
                        }
                        switch (c12) {
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
                                e2.a.n("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
                                break;
                        }
                        if (indexOf3 == indexOf4) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        i11 = indexOf3 + 1;
                    } else {
                        spannableStringBuilder.append(charAt);
                    }
                }
            } else {
                while (!arrayDeque.isEmpty()) {
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    public static void g(String str, g gVar) {
        int indexOf = str.indexOf(44);
        char c10 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i10 = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c10 = 3;
                        break;
                    }
                    break;
            }
            switch (c10) {
                case 0:
                case 1:
                    i10 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i10 = 0;
                    break;
                default:
                    e2.a.n("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f11846g = i10;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            gVar.f11844e = i.b(str);
            gVar.f11845f = 0;
            return;
        }
        gVar.f11844e = Integer.parseInt(str);
        gVar.f11845f = 1;
    }
}

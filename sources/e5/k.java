package e5;

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
import h5.d0;
import h5.w;
import h7.u;
import j$.util.DesugarCollections;
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
import k7.v8;
public abstract class k {
    public static final Pattern f5146a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern f5147b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map f5148c;
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
        f5148c = DesugarCollections.unmodifiableMap(hashMap);
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

    public static void a(String str, h hVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c3;
        char c10;
        char c11;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = hVar.f5134b;
        int length = spannableStringBuilder.length();
        String str2 = hVar.f5133a;
        str2.getClass();
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c3 = 0;
                    break;
                }
                c3 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c3 = 1;
                    break;
                }
                c3 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c3 = 2;
                    break;
                }
                c3 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c3 = 3;
                    break;
                }
                c3 = 65535;
                break;
            case 117:
                if (str2.equals("u")) {
                    c3 = 4;
                    break;
                }
                c3 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c3 = 5;
                    break;
                }
                c3 = 65535;
                break;
            case 3314158:
                if (str2.equals("lang")) {
                    c3 = 6;
                    break;
                }
                c3 = 65535;
                break;
            case 3511770:
                if (str2.equals("ruby")) {
                    c3 = 7;
                    break;
                }
                c3 = 65535;
                break;
            default:
                c3 = 65535;
                break;
        }
        switch (c3) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i14, length, 33);
                break;
            case 2:
                for (String str3 : hVar.d) {
                    Map map = f5148c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i14, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i14, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i14, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i14, length, 33);
                break;
            case 7:
                c(list2, str, hVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, g.f5130c);
                int i15 = hVar.f5134b;
                int i16 = 0;
                for (int i17 = 0; i17 < arrayList.size(); i17++) {
                    if ("rt".equals(((g) arrayList.get(i17)).f5131a.f5133a)) {
                        g gVar = (g) arrayList.get(i17);
                        c(list2, str, gVar.f5131a);
                        int i18 = gVar.f5131a.f5134b - i16;
                        int i19 = gVar.f5132b - i16;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i18, i19);
                        spannableStringBuilder.delete(i18, i19);
                        subSequence.toString();
                        spannableStringBuilder.setSpan(new z9.d(25), i15, i18, 33);
                        i16 = subSequence.length() + i16;
                        i15 = i18;
                    }
                }
                break;
            default:
                return;
        }
        ArrayList b10 = b(list2, str, hVar);
        for (int i20 = 0; i20 < b10.size(); i20++) {
            d dVar = ((i) b10.get(i20)).f5137b;
            int i21 = dVar.f5120l;
            if (i21 == -1 && dVar.f5121m == -1) {
                i10 = -1;
            } else {
                if (i21 == 1) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (dVar.f5121m == 1) {
                    c11 = 2;
                } else {
                    c11 = 0;
                }
                i10 = c10 | c11;
            }
            if (i10 != -1) {
                int i22 = dVar.f5120l;
                if (i22 == -1 && dVar.f5121m == -1) {
                    i13 = -1;
                } else {
                    if (i22 == 1) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    if (dVar.f5121m == 1) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    i13 = i11 | i12;
                }
                v8.a(new StyleSpan(i13), spannableStringBuilder, i14, length);
            }
            if (dVar.f5118j == 1) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i14, length, 33);
            }
            if (dVar.f5119k == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i14, length, 33);
            }
            if (dVar.f5116g) {
                if (dVar.f5116g) {
                    v8.a(new ForegroundColorSpan(dVar.f5115f), spannableStringBuilder, i14, length);
                } else {
                    throw new IllegalStateException("Font color not defined");
                }
            }
            if (dVar.f5117i) {
                if (dVar.f5117i) {
                    v8.a(new BackgroundColorSpan(dVar.h), spannableStringBuilder, i14, length);
                } else {
                    throw new IllegalStateException("Background color not defined.");
                }
            }
            if (dVar.e != null) {
                v8.a(new TypefaceSpan(dVar.e), spannableStringBuilder, i14, length);
            }
            int i23 = dVar.f5122n;
            if (i23 != 1) {
                if (i23 != 2) {
                    if (i23 == 3) {
                        v8.a(new RelativeSizeSpan(dVar.f5123o / 100.0f), spannableStringBuilder, i14, length);
                    }
                } else {
                    v8.a(new RelativeSizeSpan(dVar.f5123o), spannableStringBuilder, i14, length);
                }
            } else {
                v8.a(new AbsoluteSizeSpan((int) dVar.f5123o, true), spannableStringBuilder, i14, length);
            }
            if (dVar.f5125q) {
                spannableStringBuilder.setSpan(new u(25), i14, length, 33);
            }
        }
    }

    public static ArrayList b(List list, String str, h hVar) {
        int i10;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            d dVar = (d) list.get(i11);
            String str2 = hVar.f5133a;
            Set set = hVar.d;
            String str3 = hVar.f5135c;
            if (dVar.f5112a.isEmpty() && dVar.f5113b.isEmpty() && dVar.f5114c.isEmpty() && dVar.d.isEmpty()) {
                i10 = TextUtils.isEmpty(str2);
            } else {
                int a2 = d.a(d.a(d.a(0, 1073741824, dVar.f5112a, str), 2, dVar.f5113b, str2), 4, dVar.d, str3);
                if (a2 != -1 && set.containsAll(dVar.f5114c)) {
                    i10 = a2 + (dVar.f5114c.size() * 4);
                } else {
                    i10 = 0;
                }
            }
            if (i10 > 0) {
                arrayList.add(new i(i10, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void c(List list, String str, h hVar) {
        ArrayList b10 = b(list, str, hVar);
        for (int i10 = 0; i10 < b10.size() && ((i) b10.get(i10)).f5137b.f5124p == -1; i10++) {
        }
    }

    public static e d(String str, Matcher matcher, w wVar, ArrayList arrayList) {
        j jVar = new j();
        try {
            String group = matcher.group(1);
            group.getClass();
            jVar.f5138a = m.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            jVar.f5139b = m.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, jVar);
            StringBuilder sb = new StringBuilder();
            wVar.getClass();
            String h = wVar.h(r8.d.f43389c);
            while (!TextUtils.isEmpty(h)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(h.trim());
                h = wVar.h(r8.d.f43389c);
            }
            jVar.f5140c = f(str, sb.toString(), arrayList);
            return new e(jVar.a().a(), jVar.f5138a, jVar.f5139b);
        } catch (NumberFormatException unused) {
            h5.a.K("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static void e(java.lang.String r18, e5.j r19) {
        throw new UnsupportedOperationException("Method not decompiled: e5.k.e(java.lang.String, e5.j):void");
    }

    public static SpannedString f(String str, String str2, List list) {
        boolean z4;
        boolean z10;
        int i10;
        char c3;
        char c10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        while (true) {
            String str3 = "";
            if (i11 < str2.length()) {
                char charAt = str2.charAt(i11);
                char c11 = 65535;
                if (charAt != '&') {
                    if (charAt != '<') {
                        spannableStringBuilder.append(charAt);
                        i11++;
                    } else {
                        int i12 = i11 + 1;
                        if (i12 < str2.length()) {
                            if (str2.charAt(i12) == '/') {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            int indexOf = str2.indexOf(62, i12);
                            if (indexOf == -1) {
                                i12 = str2.length();
                            } else {
                                i12 = indexOf + 1;
                            }
                            int i13 = i12 - 2;
                            if (str2.charAt(i13) == '/') {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z4) {
                                i10 = 2;
                            } else {
                                i10 = 1;
                            }
                            int i14 = i11 + i10;
                            if (!z10) {
                                i13 = i12 - 1;
                            }
                            String substring = str2.substring(i14, i13);
                            if (!substring.trim().isEmpty()) {
                                String trim = substring.trim();
                                h5.a.f(!trim.isEmpty());
                                int i15 = d0.f6937a;
                                String str4 = trim.split("[ \\.]", 2)[0];
                                str4.getClass();
                                switch (str4.hashCode()) {
                                    case 98:
                                        if (str4.equals("b")) {
                                            c3 = 0;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 99:
                                        if (str4.equals("c")) {
                                            c3 = 1;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 105:
                                        if (str4.equals("i")) {
                                            c3 = 2;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 117:
                                        if (str4.equals("u")) {
                                            c3 = 3;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 118:
                                        if (str4.equals("v")) {
                                            c3 = 4;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3650:
                                        if (str4.equals("rt")) {
                                            c3 = 5;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3314158:
                                        if (str4.equals("lang")) {
                                            c3 = 6;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    case 3511770:
                                        if (str4.equals("ruby")) {
                                            c3 = 7;
                                            break;
                                        }
                                        c3 = 65535;
                                        break;
                                    default:
                                        c3 = 65535;
                                        break;
                                }
                                switch (c3) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        if (z4) {
                                            while (!arrayDeque.isEmpty()) {
                                                h hVar = (h) arrayDeque.pop();
                                                a(str, hVar, arrayList, spannableStringBuilder, list);
                                                if (!arrayDeque.isEmpty()) {
                                                    arrayList.add(new g(hVar, spannableStringBuilder.length()));
                                                } else {
                                                    arrayList.clear();
                                                }
                                                if (hVar.f5133a.equals(str4)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        } else if (!z10) {
                                            int length = spannableStringBuilder.length();
                                            String trim2 = substring.trim();
                                            h5.a.f(!trim2.isEmpty());
                                            int indexOf2 = trim2.indexOf(" ");
                                            if (indexOf2 == -1) {
                                                c10 = 0;
                                            } else {
                                                str3 = trim2.substring(indexOf2).trim();
                                                c10 = 0;
                                                trim2 = trim2.substring(0, indexOf2);
                                            }
                                            String[] split = trim2.split("\\.", -1);
                                            String str5 = split[c10];
                                            HashSet hashSet = new HashSet();
                                            for (int i16 = 1; i16 < split.length; i16++) {
                                                hashSet.add(split[i16]);
                                            }
                                            arrayDeque.push(new h(str5, length, str3, hashSet));
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
                                    c11 = 0;
                                    break;
                                }
                                break;
                            case 3464:
                                if (substring2.equals("lt")) {
                                    c11 = 1;
                                    break;
                                }
                                break;
                            case 96708:
                                if (substring2.equals("amp")) {
                                    c11 = 2;
                                    break;
                                }
                                break;
                            case 3374865:
                                if (substring2.equals("nbsp")) {
                                    c11 = 3;
                                    break;
                                }
                                break;
                        }
                        switch (c11) {
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
                                h5.a.K("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
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
                    a(str, (h) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new h("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    public static void g(String str, j jVar) {
        int indexOf = str.indexOf(44);
        char c3 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i10 = 2;
            switch (substring.hashCode()) {
                case -1364013995:
                    if (substring.equals("center")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -1074341483:
                    if (substring.equals("middle")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 100571:
                    if (substring.equals("end")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 109757538:
                    if (substring.equals("start")) {
                        c3 = 3;
                        break;
                    }
                    break;
            }
            switch (c3) {
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
                    h5.a.K("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            jVar.f5142g = i10;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            jVar.e = m.b(str);
            jVar.f5141f = 0;
            return;
        }
        jVar.e = Integer.parseInt(str);
        jVar.f5141f = 1;
    }
}

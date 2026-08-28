package a5;

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
import d5.f0;
import d5.y;
import d7.u;
import g7.y7;
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
public abstract class j {
    public static final Pattern f90a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    public static final Pattern f91b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map f92c;
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
        f92c = DesugarCollections.unmodifiableMap(hashMap);
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

    public static void a(String str, g gVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        char c10;
        char c11;
        char c12;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13 = gVar.f77b;
        int length = spannableStringBuilder.length();
        String str2 = gVar.f76a;
        str2.getClass();
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
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i13, length, 33);
                break;
            case 2:
                for (String str3 : gVar.d) {
                    Map map = f92c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i13, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i13, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i13, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
                break;
            case 7:
                c(list2, str, gVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, f.f73c);
                int i14 = gVar.f77b;
                int i15 = 0;
                for (int i16 = 0; i16 < arrayList.size(); i16++) {
                    if ("rt".equals(((f) arrayList.get(i16)).f74a.f76a)) {
                        f fVar = (f) arrayList.get(i16);
                        c(list2, str, fVar.f74a);
                        int i17 = fVar.f74a.f77b - i15;
                        int i18 = fVar.f75b - i15;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i17, i18);
                        spannableStringBuilder.delete(i17, i18);
                        subSequence.toString();
                        spannableStringBuilder.setSpan(new u(23), i14, i17, 33);
                        i15 += subSequence.length();
                        i14 = i17;
                    }
                }
                break;
            default:
                return;
        }
        ArrayList b10 = b(list2, str, gVar);
        for (int i19 = 0; i19 < b10.size(); i19++) {
            c cVar = ((h) b10.get(i19)).f80b;
            int i20 = cVar.f63l;
            if (i20 == -1 && cVar.f64m == -1) {
                i9 = -1;
            } else {
                if (i20 == 1) {
                    c11 = 1;
                } else {
                    c11 = 0;
                }
                if (cVar.f64m == 1) {
                    c12 = 2;
                } else {
                    c12 = 0;
                }
                i9 = c12 | c11;
            }
            if (i9 != -1) {
                int i21 = cVar.f63l;
                if (i21 == -1 && cVar.f64m == -1) {
                    i12 = -1;
                } else {
                    if (i21 == 1) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if (cVar.f64m == 1) {
                        i11 = 2;
                    } else {
                        i11 = 0;
                    }
                    i12 = i10 | i11;
                }
                y7.a(new StyleSpan(i12), spannableStringBuilder, i13, length);
            }
            if (cVar.f61j == 1) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i13, length, 33);
            }
            if (cVar.f62k == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, length, 33);
            }
            if (cVar.f59g) {
                if (cVar.f59g) {
                    y7.a(new ForegroundColorSpan(cVar.f58f), spannableStringBuilder, i13, length);
                } else {
                    throw new IllegalStateException("Font color not defined");
                }
            }
            if (cVar.f60i) {
                if (cVar.f60i) {
                    y7.a(new BackgroundColorSpan(cVar.h), spannableStringBuilder, i13, length);
                } else {
                    throw new IllegalStateException("Background color not defined.");
                }
            }
            if (cVar.f57e != null) {
                y7.a(new TypefaceSpan(cVar.f57e), spannableStringBuilder, i13, length);
            }
            int i22 = cVar.f65n;
            if (i22 != 1) {
                if (i22 != 2) {
                    if (i22 == 3) {
                        y7.a(new RelativeSizeSpan(cVar.f66o / 100.0f), spannableStringBuilder, i13, length);
                    }
                } else {
                    y7.a(new RelativeSizeSpan(cVar.f66o), spannableStringBuilder, i13, length);
                }
            } else {
                y7.a(new AbsoluteSizeSpan((int) cVar.f66o, true), spannableStringBuilder, i13, length);
            }
            if (cVar.f68q) {
                spannableStringBuilder.setSpan(new za.a(22), i13, length, 33);
            }
        }
    }

    public static ArrayList b(List list, String str, g gVar) {
        int i9;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = (c) list.get(i10);
            String str2 = gVar.f76a;
            Set set = gVar.d;
            String str3 = gVar.f78c;
            if (cVar.f54a.isEmpty() && cVar.f55b.isEmpty() && cVar.f56c.isEmpty() && cVar.d.isEmpty()) {
                i9 = TextUtils.isEmpty(str2);
            } else {
                int a2 = c.a(c.a(c.a(0, 1073741824, cVar.f54a, str), 2, cVar.f55b, str2), 4, cVar.d, str3);
                if (a2 != -1 && set.containsAll(cVar.f56c)) {
                    i9 = a2 + (cVar.f56c.size() * 4);
                } else {
                    i9 = 0;
                }
            }
            if (i9 > 0) {
                arrayList.add(new h(i9, cVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void c(List list, String str, g gVar) {
        ArrayList b10 = b(list, str, gVar);
        for (int i9 = 0; i9 < b10.size() && ((h) b10.get(i9)).f80b.f67p == -1; i9++) {
        }
    }

    public static d d(String str, Matcher matcher, y yVar, ArrayList arrayList) {
        i iVar = new i();
        try {
            String group = matcher.group(1);
            group.getClass();
            iVar.f81a = l.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            iVar.f82b = l.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, iVar);
            StringBuilder sb2 = new StringBuilder();
            yVar.getClass();
            String f10 = yVar.f(n8.d.f18513c);
            while (!TextUtils.isEmpty(f10)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(f10.trim());
                f10 = yVar.f(n8.d.f18513c);
            }
            iVar.f83c = f(str, sb2.toString(), arrayList);
            return new d(iVar.a().a(), iVar.f81a, iVar.f82b);
        } catch (NumberFormatException unused) {
            d5.a.K("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static void e(java.lang.String r18, a5.i r19) {
        throw new UnsupportedOperationException("Method not decompiled: a5.j.e(java.lang.String, a5.i):void");
    }

    public static SpannedString f(String str, String str2, List list) {
        boolean z10;
        boolean z11;
        int i9;
        char c10;
        char c11;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String str3 = "";
            if (i10 < str2.length()) {
                char charAt = str2.charAt(i10);
                char c12 = 65535;
                if (charAt != '&') {
                    if (charAt != '<') {
                        spannableStringBuilder.append(charAt);
                        i10++;
                    } else {
                        int i11 = i10 + 1;
                        if (i11 < str2.length()) {
                            if (str2.charAt(i11) == '/') {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            int indexOf = str2.indexOf(62, i11);
                            if (indexOf == -1) {
                                i11 = str2.length();
                            } else {
                                i11 = indexOf + 1;
                            }
                            int i12 = i11 - 2;
                            if (str2.charAt(i12) == '/') {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z10) {
                                i9 = 2;
                            } else {
                                i9 = 1;
                            }
                            int i13 = i10 + i9;
                            if (!z11) {
                                i12 = i11 - 1;
                            }
                            String substring = str2.substring(i13, i12);
                            if (!substring.trim().isEmpty()) {
                                String trim = substring.trim();
                                d5.a.f(!trim.isEmpty());
                                int i14 = f0.f4349a;
                                String str4 = trim.split("[ \\.]", 2)[0];
                                str4.getClass();
                                switch (str4.hashCode()) {
                                    case 98:
                                        if (str4.equals("b")) {
                                            c10 = 0;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 99:
                                        if (str4.equals("c")) {
                                            c10 = 1;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 105:
                                        if (str4.equals("i")) {
                                            c10 = 2;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 117:
                                        if (str4.equals("u")) {
                                            c10 = 3;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 118:
                                        if (str4.equals("v")) {
                                            c10 = 4;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 3650:
                                        if (str4.equals("rt")) {
                                            c10 = 5;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 3314158:
                                        if (str4.equals("lang")) {
                                            c10 = 6;
                                            break;
                                        }
                                        c10 = 65535;
                                        break;
                                    case 3511770:
                                        if (str4.equals("ruby")) {
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
                                                g gVar = (g) arrayDeque.pop();
                                                a(str, gVar, arrayList, spannableStringBuilder, list);
                                                if (!arrayDeque.isEmpty()) {
                                                    arrayList.add(new f(gVar, spannableStringBuilder.length()));
                                                } else {
                                                    arrayList.clear();
                                                }
                                                if (gVar.f76a.equals(str4)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        } else if (!z11) {
                                            int length = spannableStringBuilder.length();
                                            String trim2 = substring.trim();
                                            d5.a.f(!trim2.isEmpty());
                                            int indexOf2 = trim2.indexOf(" ");
                                            if (indexOf2 == -1) {
                                                c11 = 0;
                                            } else {
                                                str3 = trim2.substring(indexOf2).trim();
                                                c11 = 0;
                                                trim2 = trim2.substring(0, indexOf2);
                                            }
                                            String[] split = trim2.split("\\.", -1);
                                            String str5 = split[c11];
                                            HashSet hashSet = new HashSet();
                                            for (int i15 = 1; i15 < split.length; i15++) {
                                                hashSet.add(split[i15]);
                                            }
                                            arrayDeque.push(new g(str5, length, str3, hashSet));
                                            break;
                                        }
                                        break;
                                }
                            }
                        }
                        i10 = i11;
                    }
                } else {
                    i10++;
                    int indexOf3 = str2.indexOf(59, i10);
                    int indexOf4 = str2.indexOf(32, i10);
                    if (indexOf3 == -1) {
                        indexOf3 = indexOf4;
                    } else if (indexOf4 != -1) {
                        indexOf3 = Math.min(indexOf3, indexOf4);
                    }
                    if (indexOf3 != -1) {
                        String substring2 = str2.substring(i10, indexOf3);
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
                                d5.a.K("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
                                break;
                        }
                        if (indexOf3 == indexOf4) {
                            spannableStringBuilder.append((CharSequence) " ");
                        }
                        i10 = indexOf3 + 1;
                    } else {
                        spannableStringBuilder.append(charAt);
                    }
                }
            } else {
                while (!arrayDeque.isEmpty()) {
                    a(str, (g) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new g("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    public static void g(String str, i iVar) {
        int indexOf = str.indexOf(44);
        char c10 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i9 = 2;
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
                    i9 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i9 = 0;
                    break;
                default:
                    d5.a.K("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i9 = Integer.MIN_VALUE;
                    break;
            }
            iVar.f86g = i9;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            iVar.f84e = l.b(str);
            iVar.f85f = 0;
            return;
        }
        iVar.f84e = Integer.parseInt(str);
        iVar.f85f = 1;
    }
}

package k4;

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
import b8.vb;
import b8.zb;
import g2.n0;
import g2.y;
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
public abstract class h {
    public static final Pattern f16865a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    public static final Pattern f16866b = Pattern.compile("(\\S+?):(\\S+)");
    public static final Map f16867c;
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
        f16867c = DesugarCollections.unmodifiableMap(hashMap);
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
        char c2;
        char c10;
        char c11;
        int i3;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = eVar.f16852b;
        int length = spannableStringBuilder.length();
        String str2 = eVar.f16851a;
        str2.getClass();
        int i15 = -1;
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
                spannableStringBuilder.setSpan(new StyleSpan(1), i14, length, 33);
                break;
            case 2:
                for (String str3 : eVar.d) {
                    Map map = f16867c;
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
            case 5:
                spannableStringBuilder.setSpan(new f2.h(eVar.f16853c), i14, length, 33);
                break;
            case 7:
                int c12 = c(list2, str, eVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, d.f16848c);
                int i16 = eVar.f16852b;
                int i17 = 0;
                int i18 = 0;
                while (i17 < arrayList.size()) {
                    if ("rt".equals(((d) arrayList.get(i17)).f16849a.f16851a)) {
                        d dVar = (d) arrayList.get(i17);
                        int c13 = c(list2, str, dVar.f16849a);
                        if (c13 == i15) {
                            if (c12 != i15) {
                                c13 = c12;
                            } else {
                                c13 = 1;
                            }
                        }
                        int i19 = dVar.f16849a.f16852b - i18;
                        int i20 = dVar.f16850b - i18;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i19, i20);
                        spannableStringBuilder.delete(i19, i20);
                        spannableStringBuilder.setSpan(new f2.f(subSequence.toString(), c13), i16, i19, 33);
                        i18 = subSequence.length() + i18;
                        i16 = i19;
                    }
                    i17++;
                    i15 = -1;
                }
                break;
            default:
                return;
        }
        ArrayList b10 = b(list2, str, eVar);
        for (int i21 = 0; i21 < b10.size(); i21++) {
            b bVar = ((f) b10.get(i21)).f16855b;
            int i22 = bVar.f16839l;
            if (i22 == -1 && bVar.f16840m == -1) {
                i3 = -1;
            } else {
                if (i22 == 1) {
                    c10 = 1;
                } else {
                    c10 = 0;
                }
                if (bVar.f16840m == 1) {
                    c11 = 2;
                } else {
                    c11 = 0;
                }
                i3 = c11 | c10;
            }
            if (i3 != -1) {
                int i23 = bVar.f16839l;
                if (i23 == -1 && bVar.f16840m == -1) {
                    i13 = -1;
                    i10 = 1;
                } else {
                    i10 = 1;
                    if (i23 == 1) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    if (bVar.f16840m == 1) {
                        i12 = 2;
                    } else {
                        i12 = 0;
                    }
                    i13 = i11 | i12;
                }
                vb.a(spannableStringBuilder, new StyleSpan(i13), i14, length);
            } else {
                i10 = 1;
            }
            if (bVar.f16837j == i10) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i14, length, 33);
            }
            if (bVar.f16838k == i10) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i14, length, 33);
            }
            if (bVar.f16835g) {
                if (bVar.f16835g) {
                    vb.a(spannableStringBuilder, new ForegroundColorSpan(bVar.f16834f), i14, length);
                } else {
                    throw new IllegalStateException("Font color not defined");
                }
            }
            if (bVar.f16836i) {
                if (bVar.f16836i) {
                    vb.a(spannableStringBuilder, new BackgroundColorSpan(bVar.h), i14, length);
                } else {
                    throw new IllegalStateException("Background color not defined.");
                }
            }
            if (bVar.f16833e != null) {
                vb.a(spannableStringBuilder, new TypefaceSpan(bVar.f16833e), i14, length);
            }
            int i24 = bVar.f16841n;
            if (i24 != 1) {
                if (i24 != 2) {
                    if (i24 == 3) {
                        vb.a(spannableStringBuilder, new RelativeSizeSpan(bVar.f16842o / 100.0f), i14, length);
                    }
                } else {
                    vb.a(spannableStringBuilder, new RelativeSizeSpan(bVar.f16842o), i14, length);
                }
            } else {
                vb.a(spannableStringBuilder, new AbsoluteSizeSpan((int) bVar.f16842o, true), i14, length);
            }
            if (bVar.f16844q) {
                spannableStringBuilder.setSpan(new Object(), i14, length, 33);
            }
        }
    }

    public static ArrayList b(List list, String str, e eVar) {
        int i3;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            b bVar = (b) list.get(i10);
            String str2 = eVar.f16851a;
            Set set = eVar.d;
            String str3 = eVar.f16853c;
            if (bVar.f16830a.isEmpty() && bVar.f16831b.isEmpty() && bVar.f16832c.isEmpty() && bVar.d.isEmpty()) {
                i3 = TextUtils.isEmpty(str2);
            } else {
                int a10 = b.a(b.a(b.a(0, 1073741824, bVar.f16830a, str), 2, bVar.f16831b, str2), 4, bVar.d, str3);
                if (a10 != -1 && set.containsAll(bVar.f16832c)) {
                    i3 = a10 + (bVar.f16832c.size() * 4);
                } else {
                    i3 = 0;
                }
            }
            if (i3 > 0) {
                arrayList.add(new f(i3, bVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static int c(List list, String str, e eVar) {
        ArrayList b10 = b(list, str, eVar);
        for (int i3 = 0; i3 < b10.size(); i3++) {
            int i10 = ((f) b10.get(i3)).f16855b.f16843p;
            if (i10 != -1) {
                return i10;
            }
        }
        return -1;
    }

    public static c d(String str, Matcher matcher, y yVar, ArrayList arrayList) {
        g gVar = new g();
        try {
            String group = matcher.group(1);
            group.getClass();
            gVar.f16856a = i.c(group);
            String group2 = matcher.group(2);
            group2.getClass();
            gVar.f16857b = i.c(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            e(group3, gVar);
            StringBuilder sb2 = new StringBuilder();
            yVar.getClass();
            String n4 = yVar.n(StandardCharsets.UTF_8);
            while (!TextUtils.isEmpty(n4)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(n4.trim());
                n4 = yVar.n(StandardCharsets.UTF_8);
            }
            gVar.f16858c = f(str, sb2.toString(), arrayList);
            return new c(gVar.a().a(), gVar.f16856a, gVar.f16857b);
        } catch (IllegalArgumentException unused) {
            g2.a.l("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static void e(java.lang.String r18, k4.g r19) {
        throw new UnsupportedOperationException("Method not decompiled: k4.h.e(java.lang.String, k4.g):void");
    }

    public static SpannedString f(String str, String str2, List list) {
        boolean z10;
        boolean z11;
        int i3;
        char c2;
        char c10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String str3 = "";
            if (i10 < str2.length()) {
                char charAt = str2.charAt(i10);
                char c11 = 65535;
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
                                i3 = 2;
                            } else {
                                i3 = 1;
                            }
                            int i13 = i10 + i3;
                            if (!z11) {
                                i12 = i11 - 1;
                            }
                            String substring = str2.substring(i13, i12);
                            if (!substring.trim().isEmpty()) {
                                String trim = substring.trim();
                                zb.f(!trim.isEmpty());
                                String str4 = n0.f11873a;
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
                                        if (z10) {
                                            while (!arrayDeque.isEmpty()) {
                                                e eVar = (e) arrayDeque.pop();
                                                a(str, eVar, arrayList, spannableStringBuilder, list);
                                                if (!arrayDeque.isEmpty()) {
                                                    arrayList.add(new d(eVar, spannableStringBuilder.length()));
                                                } else {
                                                    arrayList.clear();
                                                }
                                                if (eVar.f16851a.equals(str5)) {
                                                    break;
                                                }
                                            }
                                            break;
                                        } else if (!z11) {
                                            int length = spannableStringBuilder.length();
                                            String trim2 = substring.trim();
                                            zb.f(!trim2.isEmpty());
                                            int indexOf2 = trim2.indexOf(" ");
                                            if (indexOf2 == -1) {
                                                c10 = 0;
                                            } else {
                                                str3 = trim2.substring(indexOf2).trim();
                                                c10 = 0;
                                                trim2 = trim2.substring(0, indexOf2);
                                            }
                                            String[] split = trim2.split("\\.", -1);
                                            String str6 = split[c10];
                                            HashSet hashSet = new HashSet();
                                            for (int i14 = 1; i14 < split.length; i14++) {
                                                hashSet.add(split[i14]);
                                            }
                                            arrayDeque.push(new e(str6, length, str3, hashSet));
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
                                g2.a.l("WebvttCueParser", "ignoring unsupported entity: '&" + substring2 + ";'");
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
                    a(str, (e) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new e("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
        }
    }

    public static void g(String str, g gVar) {
        int indexOf = str.indexOf(44);
        char c2 = 65535;
        if (indexOf != -1) {
            String substring = str.substring(indexOf + 1);
            substring.getClass();
            int i3 = 2;
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
                    i3 = 1;
                    break;
                case 2:
                    break;
                case 3:
                    i3 = 0;
                    break;
                default:
                    g2.a.l("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i3 = Integer.MIN_VALUE;
                    break;
            }
            gVar.f16861g = i3;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            gVar.f16859e = i.b(str);
            gVar.f16860f = 0;
            return;
        }
        gVar.f16859e = Integer.parseInt(str);
        gVar.f16860f = 1;
    }
}

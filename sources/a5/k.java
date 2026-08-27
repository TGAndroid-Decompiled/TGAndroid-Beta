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
import d5.g0;
import d5.z;
import e7.v;
import h7.v7;
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

public abstract class k {

    public static final Pattern f92a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    public static final Pattern f93b = Pattern.compile("(\\S+?):(\\S+)");

    public static final Map f94c;
    public static final Map d;

    static {
        HashMap map = new HashMap();
        map.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f94c = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        map2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        map2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        map2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        map2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        map2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        map2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        map2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = DesugarCollections.unmodifiableMap(map2);
    }

    public static void a(String str, h hVar, List list, SpannableStringBuilder spannableStringBuilder, List list2) {
        int i10 = hVar.f79b;
        int length = spannableStringBuilder.length();
        String str2 = hVar.f78a;
        str2.getClass();
        switch (str2) {
            case "":
            case "v":
            case "lang":
                break;
            case "b":
                spannableStringBuilder.setSpan(new StyleSpan(1), i10, length, 33);
                break;
            case "c":
                for (String str3 : hVar.d) {
                    Map map = f94c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(((Integer) map.get(str3)).intValue()), i10, length, 33);
                    } else {
                        Map map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(((Integer) map2.get(str3)).intValue()), i10, length, 33);
                        }
                    }
                }
                break;
            case "i":
                spannableStringBuilder.setSpan(new StyleSpan(2), i10, length, 33);
                break;
            case "u":
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
                break;
            case "ruby":
                c(list2, str, hVar);
                ArrayList arrayList = new ArrayList(list.size());
                arrayList.addAll(list);
                Collections.sort(arrayList, g.f75c);
                int i11 = hVar.f79b;
                int length2 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if ("rt".equals(((g) arrayList.get(i12)).f76a.f78a)) {
                        g gVar = (g) arrayList.get(i12);
                        c(list2, str, gVar.f76a);
                        int i13 = gVar.f76a.f79b - length2;
                        int i14 = gVar.f77b - length2;
                        CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i13, i14);
                        spannableStringBuilder.delete(i13, i14);
                        charSequenceSubSequence.toString();
                        spannableStringBuilder.setSpan(new v(23), i11, i13, 33);
                        length2 = charSequenceSubSequence.length() + length2;
                        i11 = i13;
                    }
                }
                break;
            default:
                return;
        }
        ArrayList arrayListB = b(list2, str, hVar);
        for (int i15 = 0; i15 < arrayListB.size(); i15++) {
            d dVar = ((i) arrayListB.get(i15)).f82b;
            int i16 = dVar.f65l;
            if (((i16 == -1 && dVar.f66m == -1) ? -1 : (i16 == 1 ? (char) 1 : (char) 0) | (dVar.f66m == 1 ? (char) 2 : (char) 0)) != -1) {
                int i17 = dVar.f65l;
                v7.a(new StyleSpan((i17 == -1 && dVar.f66m == -1) ? -1 : (i17 == 1 ? 1 : 0) | (dVar.f66m == 1 ? 2 : 0)), spannableStringBuilder, i10, length);
            }
            if (dVar.f63j == 1) {
                spannableStringBuilder.setSpan(new StrikethroughSpan(), i10, length, 33);
            }
            if (dVar.f64k == 1) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i10, length, 33);
            }
            if (dVar.f61g) {
                if (!dVar.f61g) {
                    throw new IllegalStateException("Font color not defined");
                }
                v7.a(new ForegroundColorSpan(dVar.f60f), spannableStringBuilder, i10, length);
            }
            if (dVar.f62i) {
                if (!dVar.f62i) {
                    throw new IllegalStateException("Background color not defined.");
                }
                v7.a(new BackgroundColorSpan(dVar.h), spannableStringBuilder, i10, length);
            }
            if (dVar.f59e != null) {
                v7.a(new TypefaceSpan(dVar.f59e), spannableStringBuilder, i10, length);
            }
            int i18 = dVar.f67n;
            if (i18 == 1) {
                v7.a(new AbsoluteSizeSpan((int) dVar.f68o, true), spannableStringBuilder, i10, length);
            } else if (i18 == 2) {
                v7.a(new RelativeSizeSpan(dVar.f68o), spannableStringBuilder, i10, length);
            } else if (i18 == 3) {
                v7.a(new RelativeSizeSpan(dVar.f68o / 100.0f), spannableStringBuilder, i10, length);
            }
            if (dVar.f70q) {
                spannableStringBuilder.setSpan(new ab.a(23), i10, length, 33);
            }
        }
    }

    public static ArrayList b(List list, String str, h hVar) {
        ?? r10;
        int size;
        boolean zIsEmpty;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            d dVar = (d) list.get(i10);
            String str2 = hVar.f78a;
            Set set = hVar.d;
            String str3 = hVar.f80c;
            if (dVar.f56a.isEmpty() && dVar.f57b.isEmpty() && dVar.f58c.isEmpty() && dVar.d.isEmpty()) {
                zIsEmpty = TextUtils.isEmpty(str2);
            } else {
                int iA = d.a(d.a(d.a(0, 1073741824, dVar.f56a, str), 2, dVar.f57b, str2), 4, dVar.d, str3);
                if (iA == -1 || !set.containsAll(dVar.f58c)) {
                    r10 = 0;
                } else {
                    size = iA + (dVar.f58c.size() * 4);
                }
            }
            if (r10 > 0) {
                r10 = size;
                r10 = zIsEmpty;
                arrayList.add(new i(r10, dVar));
            } else {
                r10 = size;
                r10 = zIsEmpty;
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void c(List list, String str, h hVar) {
        ArrayList arrayListB = b(list, str, hVar);
        for (int i10 = 0; i10 < arrayListB.size() && ((i) arrayListB.get(i10)).f82b.f69p == -1; i10++) {
        }
    }

    public static e d(String str, Matcher matcher, z zVar, ArrayList arrayList) {
        j jVar = new j();
        try {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            jVar.f83a = m.c(strGroup);
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            jVar.f84b = m.c(strGroup2);
            String strGroup3 = matcher.group(3);
            strGroup3.getClass();
            e(strGroup3, jVar);
            StringBuilder sb2 = new StringBuilder();
            zVar.getClass();
            String strF = zVar.f(o8.d.f19363c);
            while (!TextUtils.isEmpty(strF)) {
                if (sb2.length() > 0) {
                    sb2.append("\n");
                }
                sb2.append(strF.trim());
                strF = zVar.f(o8.d.f19363c);
            }
            jVar.f85c = f(str, sb2.toString(), arrayList);
            return new e(jVar.a().a(), jVar.f83a, jVar.f84b);
        } catch (NumberFormatException unused) {
            d5.a.K("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    public static void e(String str, j jVar) {
        int i10;
        int i11;
        int i12;
        Matcher matcher = f93b.matcher(str);
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            strGroup.getClass();
            String strGroup2 = matcher.group(2);
            strGroup2.getClass();
            try {
                if ("line".equals(strGroup)) {
                    g(strGroup2, jVar);
                } else {
                    if ("align".equals(strGroup)) {
                        switch (strGroup2) {
                            case "center":
                            case "middle":
                                i10 = 2;
                                break;
                            case "end":
                                i10 = 3;
                                break;
                            case "left":
                                i10 = 4;
                                break;
                            case "right":
                                i10 = 5;
                                break;
                            case "start":
                                i10 = 1;
                                break;
                            default:
                                d5.a.K("WebvttCueParser", "Invalid alignment value: ".concat(strGroup2));
                                i10 = 2;
                                break;
                        }
                        jVar.d = i10;
                    } else if ("position".equals(strGroup)) {
                        int iIndexOf = strGroup2.indexOf(44);
                        if (iIndexOf != -1) {
                            String strSubstring = strGroup2.substring(iIndexOf + 1);
                            strSubstring.getClass();
                            switch (strSubstring) {
                                case "line-left":
                                case "start":
                                    i11 = 0;
                                    break;
                                case "center":
                                case "middle":
                                    i11 = 1;
                                    break;
                                case "line-right":
                                case "end":
                                    i11 = 2;
                                    break;
                                default:
                                    d5.a.K("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                                    i11 = Integer.MIN_VALUE;
                                    break;
                            }
                            jVar.f89i = i11;
                            strGroup2 = strGroup2.substring(0, iIndexOf);
                        }
                        jVar.h = m.b(strGroup2);
                    } else if ("size".equals(strGroup)) {
                        jVar.f90j = m.b(strGroup2);
                    } else if ("vertical".equals(strGroup)) {
                        if (strGroup2.equals("lr")) {
                            i12 = 2;
                        } else if (strGroup2.equals("rl")) {
                            i12 = 1;
                        } else {
                            d5.a.K("WebvttCueParser", "Invalid 'vertical' value: ".concat(strGroup2));
                            i12 = Integer.MIN_VALUE;
                        }
                        jVar.f91k = i12;
                    } else {
                        d5.a.K("WebvttCueParser", "Unknown cue setting " + strGroup + ":" + strGroup2);
                    }
                }
            } catch (NumberFormatException unused) {
                d5.a.K("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    public static SpannedString f(String str, String str2, List list) {
        char c10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String strTrim = "";
            if (i10 >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (h) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
                }
                a(str, new h("", 0, "", Collections.EMPTY_SET), Collections.EMPTY_LIST, spannableStringBuilder, list);
                return SpannedString.valueOf(spannableStringBuilder);
            }
            char cCharAt = str2.charAt(i10);
            if (cCharAt == '&') {
                i10++;
                int iIndexOf = str2.indexOf(59, i10);
                int iIndexOf2 = str2.indexOf(32, i10);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    String strSubstring = str2.substring(i10, iIndexOf);
                    strSubstring.getClass();
                    switch (strSubstring) {
                        case "gt":
                            spannableStringBuilder.append('>');
                            break;
                        case "lt":
                            spannableStringBuilder.append('<');
                            break;
                        case "amp":
                            spannableStringBuilder.append('&');
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            d5.a.K("WebvttCueParser", "ignoring unsupported entity: '&" + strSubstring + ";'");
                            break;
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i10 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
                i10++;
            } else {
                int length = i10 + 1;
                if (length < str2.length()) {
                    boolean z10 = str2.charAt(length) == '/';
                    int iIndexOf3 = str2.indexOf(62, length);
                    length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                    int i11 = length - 2;
                    boolean z11 = str2.charAt(i11) == '/';
                    int i12 = i10 + (z10 ? 2 : 1);
                    if (!z11) {
                        i11 = length - 1;
                    }
                    String strSubstring2 = str2.substring(i12, i11);
                    if (!strSubstring2.trim().isEmpty()) {
                        String strTrim2 = strSubstring2.trim();
                        d5.a.f(!strTrim2.isEmpty());
                        int i13 = g0.f4795a;
                        String str3 = strTrim2.split("[ \\.]", 2)[0];
                        str3.getClass();
                        switch (str3) {
                            case "b":
                            case "c":
                            case "i":
                            case "u":
                            case "v":
                            case "rt":
                            case "lang":
                            case "ruby":
                                if (!z10) {
                                    if (!z11) {
                                        int length2 = spannableStringBuilder.length();
                                        String strTrim3 = strSubstring2.trim();
                                        d5.a.f(!strTrim3.isEmpty());
                                        int iIndexOf4 = strTrim3.indexOf(" ");
                                        if (iIndexOf4 == -1) {
                                            c10 = 0;
                                        } else {
                                            strTrim = strTrim3.substring(iIndexOf4).trim();
                                            c10 = 0;
                                            strTrim3 = strTrim3.substring(0, iIndexOf4);
                                        }
                                        String[] strArrSplit = strTrim3.split("\\.", -1);
                                        String str4 = strArrSplit[c10];
                                        HashSet hashSet = new HashSet();
                                        for (int i14 = 1; i14 < strArrSplit.length; i14++) {
                                            hashSet.add(strArrSplit[i14]);
                                        }
                                        arrayDeque.push(new h(str4, length2, strTrim, hashSet));
                                    }
                                    break;
                                } else {
                                    while (!arrayDeque.isEmpty()) {
                                        h hVar = (h) arrayDeque.pop();
                                        a(str, hVar, arrayList, spannableStringBuilder, list);
                                        if (arrayDeque.isEmpty()) {
                                            arrayList.clear();
                                        } else {
                                            arrayList.add(new g(hVar, spannableStringBuilder.length()));
                                        }
                                        if (hVar.f78a.equals(str3)) {
                                            break;
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                }
                i10 = length;
            }
        }
    }

    public static void g(String str, j jVar) {
        int iIndexOf = str.indexOf(44);
        if (iIndexOf != -1) {
            String strSubstring = str.substring(iIndexOf + 1);
            strSubstring.getClass();
            int i10 = 2;
            switch (strSubstring) {
                case "center":
                case "middle":
                    i10 = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i10 = 0;
                    break;
                default:
                    d5.a.K("WebvttCueParser", "Invalid anchor value: ".concat(strSubstring));
                    i10 = Integer.MIN_VALUE;
                    break;
            }
            jVar.f88g = i10;
            str = str.substring(0, iIndexOf);
        }
        if (str.endsWith("%")) {
            jVar.f86e = m.b(str);
            jVar.f87f = 0;
        } else {
            jVar.f86e = Integer.parseInt(str);
            jVar.f87f = 1;
        }
    }
}

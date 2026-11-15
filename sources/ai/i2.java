package ai;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
public final class i2 {
    public static final HashSet h = new HashSet(Arrays.asList("a", "an", "and", "the", "but", "so", "or", "to", "of", "in", "on", "at", "for", "with", "it", "it's", "that", "this", "these", "those", "then", "than", "also", "because", "which", "who", "if", "when", "while", "just", "like", "is", "are", "was", "were", "be", "been", "we", "you", "they", "he", "she", "my", "our", "your", "their", "his", "her", "not", "as", "what", "how", "why", "where", "there", "here", "now", "do", "does", "did", "have", "has", "had", "will", "would", "can", "could", "should", "maybe", "really", "very", "too", "и", "а", "но", "что", "как", "это", "в", "во", "на", "с", "со", "к", "по", "за", "из", "у", "о", "об", "от", "до", "для", "что-то", "где", "почему", "зачем", "сейчас", "не", "ни", "же", "ли", "бы", "то", "так", "там", "тут", "вот", "ну", "или", "если", "когда", "потому", "чтобы", "мы", "вы", "он", "она", "они", "оно", "ты", "я", "мой", "моя", "мне", "меня", "его", "её", "их", "был", "была", "было", "были", "будет", "уже", "ещё", "еще", "тоже", "очень", "просто", "наверное", "может"));
    public boolean d;
    public boolean f1251f;
    public a3.l f1252g;
    public final StringBuilder f1247a = new StringBuilder();
    public String f1248b = "";
    public String f1249c = "";
    public int f1250e = -1;

    public static String c(String str) {
        if (str == null) {
            return "null";
        }
        if (str.length() <= 48) {
            return str;
        }
        return "…" + str.substring(str.length() - 46);
    }

    public static java.lang.String e(java.lang.String r7, java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: ai.i2.e(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String f(int i7, String str) {
        String[] split = str.trim().split("\\s+");
        int i10 = 0;
        int i11 = 0;
        while (i10 < split.length && i11 < i7) {
            if (!k(split[i10]).isEmpty()) {
                i11++;
            }
            i10++;
        }
        StringBuilder sb2 = new StringBuilder();
        while (i10 < split.length) {
            if (sb2.length() > 0) {
                sb2.append(' ');
            }
            sb2.append(split[i10]);
            i10++;
        }
        return sb2.toString();
    }

    public static String i(String str, String str2) {
        String trim;
        String str3 = "";
        if (str == null) {
            trim = "";
        } else {
            trim = str.trim();
        }
        if (str2 != null) {
            str3 = str2.trim();
        }
        if (trim.isEmpty()) {
            return str3;
        }
        if (str3.isEmpty()) {
            return trim;
        }
        boolean z10 = true;
        char charAt = trim.charAt(trim.length() - 1);
        if (charAt != '.' && charAt != '?' && charAt != '!' && charAt != 8230) {
            z10 = false;
        }
        int codePointAt = str3.codePointAt(0);
        if (z10) {
            if (Character.isLowerCase(codePointAt)) {
                str3 = new String(Character.toChars(Character.toUpperCase(codePointAt))) + str3.substring(Character.charCount(codePointAt));
            }
        } else if (Character.isUpperCase(codePointAt)) {
            int i7 = 0;
            while (true) {
                if ((i7 >= str3.length() || !Character.isLetter(str3.charAt(i7))) && (i7 >= str3.length() || str3.charAt(i7) != '\'')) {
                    break;
                }
                i7++;
            }
            String substring = str3.substring(0, i7);
            Locale locale = Locale.ROOT;
            String lowerCase = substring.toLowerCase(locale);
            if (str3.substring(Character.charCount(codePointAt), i7).equals(str3.substring(Character.charCount(codePointAt), i7).toLowerCase(locale)) && h.contains(lowerCase)) {
                str3 = new String(Character.toChars(Character.toLowerCase(codePointAt))) + str3.substring(Character.charCount(codePointAt));
            }
        }
        return a8.p0.E(trim, " ", str3);
    }

    public static String k(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i7 = 0; i7 < str.length(); i7++) {
            char charAt = str.charAt(i7);
            if (Character.isLetterOrDigit(charAt) || charAt == '\'') {
                sb2.append(Character.toLowerCase(charAt));
            }
        }
        return sb2.toString();
    }

    public static boolean l(String str, String str2) {
        if (str.length() < 3 || str2.length() < 3 || !str.regionMatches(0, str2, 0, Math.min(3, Math.min(str.length(), str2.length()))) || Math.abs(str.length() - str2.length()) > 4) {
            return false;
        }
        return true;
    }

    public static boolean m(ArrayList arrayList, ArrayList arrayList2, int i7) {
        if (i7 > 0 && arrayList.size() >= i7 && arrayList2.size() >= i7) {
            for (int i10 = 0; i10 < i7; i10++) {
                if (((String) arrayList.get(i10)).equals(arrayList2.get(i10))) {
                }
            }
            return true;
        }
        return false;
    }

    public static ArrayList o(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            for (String str2 : str.trim().split("\\s+")) {
                String k10 = k(str2);
                if (!k10.isEmpty()) {
                    arrayList.add(k10);
                }
            }
        }
        return arrayList;
    }

    public final void a(java.lang.String r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: ai.i2.a(java.lang.String, boolean):void");
    }

    public final void b(int i7) {
        if (this.f1251f) {
            d("superseded");
        }
        this.f1250e = i7;
        this.f1251f = true;
        this.f1248b = "";
        this.f1249c = "";
        this.d = false;
        j("session " + i7 + " begin");
    }

    public final void d(String str) {
        String i7 = i(this.f1248b, this.f1249c);
        this.f1248b = "";
        this.f1249c = "";
        this.d = false;
        this.f1251f = false;
        if (!i7.isEmpty()) {
            StringBuilder sb2 = this.f1247a;
            String e10 = e(sb2.toString(), i7);
            if (!e10.isEmpty()) {
                String i10 = i(sb2.toString(), e10);
                sb2.setLength(0);
                sb2.append(i10);
            }
            j("session " + this.f1250e + " close(" + str + ") +\"" + c(e10) + "\" → " + sb2.length() + " chars");
            return;
        }
        j("session " + this.f1250e + " close(" + str + ") empty");
    }

    public final void g(int i7, String str) {
        if (!h(i7)) {
            j("session " + i7 + " end(" + str + ") for a closed session ignored");
            return;
        }
        d(str);
    }

    public final boolean h(int i7) {
        if (this.f1251f && i7 == this.f1250e) {
            return true;
        }
        return false;
    }

    public final void j(String str) {
        a3.l lVar = this.f1252g;
        if (lVar != null) {
            lVar.getClass();
            Log.d("Dictation", str);
        }
    }

    public final String n() {
        return i(i(this.f1247a.toString(), this.f1248b), this.f1249c);
    }
}

package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
public final class rn3 {
    public static final HashSet h = new HashSet(Arrays.asList("a", "an", "and", "the", "but", "so", "or", "to", "of", "in", "on", "at", "for", "with", "it", "it's", "that", "this", "these", "those", "then", "than", "also", "because", "which", "who", "if", "when", "while", "just", "like", "is", "are", "was", "were", "be", "been", "we", "you", "they", "he", "she", "my", "our", "your", "their", "his", "her", "not", "as", "what", "how", "why", "where", "there", "here", "now", "do", "does", "did", "have", "has", "had", "will", "would", "can", "could", "should", "maybe", "really", "very", "too", "и", "а", "но", "что", "как", "это", "в", "во", "на", "с", "со", "к", "по", "за", "из", "у", "о", "об", "от", "до", "для", "что-то", "где", "почему", "зачем", "сейчас", "не", "ни", "же", "ли", "бы", "то", "так", "там", "тут", "вот", "ну", "или", "если", "когда", "потому", "чтобы", "мы", "вы", "он", "она", "они", "оно", "ты", "я", "мой", "моя", "мне", "меня", "его", "её", "их", "был", "была", "было", "были", "будет", "уже", "ещё", "еще", "тоже", "очень", "просто", "наверное", "может"));
    public boolean d;
    public boolean f;
    public k93 g;
    public final StringBuilder a = new StringBuilder();
    public String b = "";
    public String c = "";
    public int e = -1;

    public static String b(String str) {
        if (str == null) {
            return "null";
        }
        return "<" + str.length() + " chars>";
    }

    public static java.lang.String d(java.lang.String r7, java.lang.String r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn3.d(java.lang.String, java.lang.String):java.lang.String");
    }

    public static String e(int i, String str) {
        String[] split = str.trim().split("\\s+");
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length && i3 < i) {
            if (!j(split[i2]).isEmpty()) {
                i3++;
            }
            i2++;
        }
        StringBuilder sb = new StringBuilder();
        while (i2 < split.length) {
            if (sb.length() > 0) {
                sb.append(' ');
            }
            sb.append(split[i2]);
            i2++;
        }
        return sb.toString();
    }

    public static String h(String str, String str2) {
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
        boolean z = true;
        char charAt = trim.charAt(trim.length() - 1);
        if (charAt != '.' && charAt != '?' && charAt != '!' && charAt != 8230) {
            z = false;
        }
        int codePointAt = str3.codePointAt(0);
        if (z) {
            if (Character.isLowerCase(codePointAt)) {
                str3 = new String(Character.toChars(Character.toUpperCase(codePointAt))).concat(str3.substring(Character.charCount(codePointAt)));
            }
        } else if (Character.isUpperCase(codePointAt)) {
            int i = 0;
            while (true) {
                if ((i >= str3.length() || !Character.isLetter(str3.charAt(i))) && (i >= str3.length() || str3.charAt(i) != '\'')) {
                    break;
                }
                i++;
            }
            String substring = str3.substring(0, i);
            Locale locale = Locale.ROOT;
            String lowerCase = substring.toLowerCase(locale);
            if (str3.substring(Character.charCount(codePointAt), i).equals(str3.substring(Character.charCount(codePointAt), i).toLowerCase(locale)) && h.contains(lowerCase)) {
                str3 = new String(Character.toChars(Character.toLowerCase(codePointAt))).concat(str3.substring(Character.charCount(codePointAt)));
            }
        }
        return tb4.y(trim, " ", str3);
    }

    public static String j(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isLetterOrDigit(charAt) || charAt == '\'') {
                sb.append(Character.toLowerCase(charAt));
            }
        }
        return sb.toString();
    }

    public static boolean k(String str, String str2) {
        if (str.length() < 3 || str2.length() < 3 || !str.regionMatches(0, str2, 0, Math.min(3, Math.min(str.length(), str2.length()))) || Math.abs(str.length() - str2.length()) > 4) {
            return false;
        }
        return true;
    }

    public static boolean l(ArrayList arrayList, ArrayList arrayList2, int i) {
        if (i > 0 && arrayList.size() >= i && arrayList2.size() >= i) {
            for (int i2 = 0; i2 < i; i2++) {
                if (((String) arrayList.get(i2)).equals(arrayList2.get(i2))) {
                }
            }
            return true;
        }
        return false;
    }

    public static ArrayList n(String str) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            for (String str2 : str.trim().split("\\s+")) {
                String j = j(str2);
                if (!j.isEmpty()) {
                    arrayList.add(j);
                }
            }
        }
        return arrayList;
    }

    public final void a(java.lang.String r12, boolean r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rn3.a(java.lang.String, boolean):void");
    }

    public final void c(String str) {
        String h2 = h(this.b, this.c);
        this.b = "";
        this.c = "";
        this.d = false;
        this.f = false;
        if (!h2.isEmpty()) {
            StringBuilder sb = this.a;
            String d = d(sb.toString(), h2);
            if (!d.isEmpty()) {
                String h3 = h(sb.toString(), d);
                sb.setLength(0);
                sb.append(h3);
            }
            i("session " + this.e + " close(" + str + ") +\"" + b(d) + "\" → " + sb.length() + " chars");
            return;
        }
        i("session " + this.e + " close(" + str + ") empty");
    }

    public final void f(int i, String str) {
        if (!g(i)) {
            i("session " + i + " end(" + str + ") for a closed session ignored");
            return;
        }
        c(str);
    }

    public final boolean g(int i) {
        if (this.f && i == this.e) {
            return true;
        }
        return false;
    }

    public final void i(String str) {
        if (this.g != null) {
            Log.d("Dictation", str);
        }
    }

    public final String m() {
        return h(h(this.a.toString(), this.b), this.c);
    }
}

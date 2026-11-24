package defpackage;
public abstract class rne {
    public static final void a(e0c e0cVar, String str) {
        e0cVar.l(e0cVar.b - 1, "Trailing comma before the end of JSON ".concat(str), "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw null;
    }

    public static final CharSequence b(int i, CharSequence charSequence) {
        String str;
        int length;
        charSequence.getClass();
        if (charSequence.length() >= 200) {
            String str2 = ".....";
            if (i == -1) {
                if (charSequence.length() - 60 > 0) {
                    return "....." + charSequence.subSequence(length, charSequence.length()).toString();
                }
            } else {
                int i2 = i - 30;
                int i3 = i + 30;
                if (i2 > 0) {
                    str = ".....";
                } else {
                    str = "";
                }
                if (i3 >= charSequence.length()) {
                    str2 = "";
                }
                StringBuilder sb = new StringBuilder(str);
                if (i2 < 0) {
                    i2 = 0;
                }
                int length2 = charSequence.length();
                if (i3 > length2) {
                    i3 = length2;
                }
                sb.append(charSequence.subSequence(i2, i3).toString());
                sb.append(str2);
                return sb.toString();
            }
        }
        return charSequence;
    }
}

package k7;
public abstract class t {
    public static int a(int r7, java.lang.CharSequence r8) {
        throw new UnsupportedOperationException("Method not decompiled: k7.t.a(int, java.lang.CharSequence):int");
    }

    public static int b(int i10, CharSequence charSequence) {
        while (i10 < charSequence.length()) {
            switch (charSequence.charAt(i10)) {
                case '[':
                    return -1;
                case '\\':
                    int i11 = i10 + 1;
                    if (!u.a(i11, charSequence)) {
                        break;
                    } else {
                        i10 = i11;
                        break;
                    }
                case ']':
                    return i10;
            }
            i10++;
        }
        return charSequence.length();
    }

    public static int c(int i10, CharSequence charSequence) {
        if (i10 >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i10);
        char c3 = '\"';
        if (charAt != '\"') {
            c3 = '\'';
            if (charAt != '\'') {
                if (charAt != '(') {
                    return -1;
                }
                c3 = ')';
            }
        }
        int d = d(charSequence, i10 + 1, c3);
        if (d == -1 || d >= charSequence.length() || charSequence.charAt(d) != c3) {
            return -1;
        }
        return d + 1;
    }

    public static int d(CharSequence charSequence, int i10, char c3) {
        while (i10 < charSequence.length()) {
            char charAt = charSequence.charAt(i10);
            if (charAt == '\\') {
                int i11 = i10 + 1;
                if (u.a(i11, charSequence)) {
                    i10 = i11;
                    i10++;
                }
            }
            if (charAt == c3) {
                return i10;
            }
            if (c3 == ')' && charAt == '(') {
                return -1;
            }
            i10++;
        }
        return charSequence.length();
    }
}

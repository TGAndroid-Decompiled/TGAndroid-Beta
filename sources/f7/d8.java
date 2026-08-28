package f7;
public abstract class d8 {
    public static int a(int r7, java.lang.CharSequence r8) {
        throw new UnsupportedOperationException("Method not decompiled: f7.d8.a(int, java.lang.CharSequence):int");
    }

    public static int b(int i9, CharSequence charSequence) {
        while (i9 < charSequence.length()) {
            switch (charSequence.charAt(i9)) {
                case '[':
                    return -1;
                case '\\':
                    int i10 = i9 + 1;
                    if (!e8.a(i10, charSequence)) {
                        break;
                    } else {
                        i9 = i10;
                        break;
                    }
                case ']':
                    return i9;
            }
            i9++;
        }
        return charSequence.length();
    }

    public static int c(int i9, CharSequence charSequence) {
        if (i9 >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i9);
        char c10 = '\"';
        if (charAt != '\"') {
            c10 = '\'';
            if (charAt != '\'') {
                if (charAt != '(') {
                    return -1;
                }
                c10 = ')';
            }
        }
        int d = d(charSequence, i9 + 1, c10);
        if (d == -1 || d >= charSequence.length() || charSequence.charAt(d) != c10) {
            return -1;
        }
        return d + 1;
    }

    public static int d(CharSequence charSequence, int i9, char c10) {
        while (i9 < charSequence.length()) {
            char charAt = charSequence.charAt(i9);
            if (charAt == '\\') {
                int i10 = i9 + 1;
                if (e8.a(i10, charSequence)) {
                    i9 = i10;
                    i9++;
                }
            }
            if (charAt == c10) {
                return i9;
            }
            if (c10 == ')' && charAt == '(') {
                return -1;
            }
            i9++;
        }
        return charSequence.length();
    }
}

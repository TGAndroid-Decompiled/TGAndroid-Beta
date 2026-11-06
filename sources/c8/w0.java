package c8;
public abstract class w0 {
    public static int a(int r7, java.lang.CharSequence r8) {
        throw new UnsupportedOperationException("Method not decompiled: c8.w0.a(int, java.lang.CharSequence):int");
    }

    public static int b(int i7, CharSequence charSequence) {
        while (i7 < charSequence.length()) {
            switch (charSequence.charAt(i7)) {
                case '[':
                    return -1;
                case '\\':
                    int i10 = i7 + 1;
                    if (!x0.a(i10, charSequence)) {
                        break;
                    } else {
                        i7 = i10;
                        break;
                    }
                case ']':
                    return i7;
            }
            i7++;
        }
        return charSequence.length();
    }

    public static int c(int i7, CharSequence charSequence) {
        if (i7 >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i7);
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
        int d = d(charSequence, i7 + 1, c10);
        if (d == -1 || d >= charSequence.length() || charSequence.charAt(d) != c10) {
            return -1;
        }
        return d + 1;
    }

    public static int d(CharSequence charSequence, int i7, char c10) {
        while (i7 < charSequence.length()) {
            char charAt = charSequence.charAt(i7);
            if (charAt == '\\') {
                int i10 = i7 + 1;
                if (x0.a(i10, charSequence)) {
                    i7 = i10;
                    i7++;
                }
            }
            if (charAt == c10) {
                return i7;
            }
            if (c10 == ')' && charAt == '(') {
                return -1;
            }
            i7++;
        }
        return charSequence.length();
    }
}

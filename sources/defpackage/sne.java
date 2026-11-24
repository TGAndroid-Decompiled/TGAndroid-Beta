package defpackage;
public abstract class sne {
    public static int a(int r7, java.lang.CharSequence r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sne.a(int, java.lang.CharSequence):int");
    }

    public static int b(int i, CharSequence charSequence) {
        while (i < charSequence.length()) {
            switch (charSequence.charAt(i)) {
                case '[':
                    return -1;
                case '\\':
                    int i2 = i + 1;
                    if (!lqe.a(i2, charSequence)) {
                        break;
                    } else {
                        i = i2;
                        break;
                    }
                case ']':
                    return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static int c(int i, CharSequence charSequence) {
        if (i >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i);
        char c = '\"';
        if (charAt != '\"') {
            c = '\'';
            if (charAt != '\'') {
                if (charAt != '(') {
                    return -1;
                }
                c = ')';
            }
        }
        int d = d(charSequence, i + 1, c);
        if (d == -1 || d >= charSequence.length() || charSequence.charAt(d) != c) {
            return -1;
        }
        return d + 1;
    }

    public static int d(CharSequence charSequence, int i, char c) {
        while (i < charSequence.length()) {
            char charAt = charSequence.charAt(i);
            if (charAt == '\\') {
                int i2 = i + 1;
                if (lqe.a(i2, charSequence)) {
                    i = i2;
                    i++;
                }
            }
            if (charAt == c) {
                return i;
            }
            if (c == ')' && charAt == '(') {
                return -1;
            }
            i++;
        }
        return charSequence.length();
    }
}

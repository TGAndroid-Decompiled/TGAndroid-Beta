package b8;
public abstract class dc {
    public static int a(int r7, java.lang.CharSequence r8) {
        throw new UnsupportedOperationException("Method not decompiled: b8.dc.a(int, java.lang.CharSequence):int");
    }

    public static int b(int i3, CharSequence charSequence) {
        while (i3 < charSequence.length()) {
            switch (charSequence.charAt(i3)) {
                case '[':
                    return -1;
                case '\\':
                    int i10 = i3 + 1;
                    if (!ec.a(i10, charSequence)) {
                        break;
                    } else {
                        i3 = i10;
                        break;
                    }
                case ']':
                    return i3;
            }
            i3++;
        }
        return charSequence.length();
    }

    public static int c(int i3, CharSequence charSequence) {
        if (i3 >= charSequence.length()) {
            return -1;
        }
        char charAt = charSequence.charAt(i3);
        char c2 = '\"';
        if (charAt != '\"') {
            c2 = '\'';
            if (charAt != '\'') {
                if (charAt != '(') {
                    return -1;
                }
                c2 = ')';
            }
        }
        int d = d(charSequence, i3 + 1, c2);
        if (d == -1 || d >= charSequence.length() || charSequence.charAt(d) != c2) {
            return -1;
        }
        return d + 1;
    }

    public static int d(CharSequence charSequence, int i3, char c2) {
        while (i3 < charSequence.length()) {
            char charAt = charSequence.charAt(i3);
            if (charAt == '\\') {
                int i10 = i3 + 1;
                if (ec.a(i10, charSequence)) {
                    i3 = i10;
                    i3++;
                }
            }
            if (charAt == c2) {
                return i3;
            }
            if (c2 == ')' && charAt == '(') {
                return -1;
            }
            i3++;
        }
        return charSequence.length();
    }
}

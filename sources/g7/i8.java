package g7;

public abstract class i8 {
    public static int a(int i10, CharSequence charSequence) {
        char cCharAt;
        if (i10 >= charSequence.length()) {
            return -1;
        }
        if (charSequence.charAt(i10) == '<') {
            while (true) {
                i10++;
                if (i10 >= charSequence.length() || (cCharAt = charSequence.charAt(i10)) == '\n' || cCharAt == '<') {
                    break;
                }
                if (cCharAt == '>') {
                    return i10 + 1;
                }
                if (cCharAt == '\\') {
                    int i11 = i10 + 1;
                    if (j8.a(i11, charSequence)) {
                        i10 = i11;
                    }
                }
            }
            return -1;
        }
        int i12 = 0;
        int i13 = i10;
        while (i13 < charSequence.length()) {
            char cCharAt2 = charSequence.charAt(i13);
            if (cCharAt2 == 0 || cCharAt2 == ' ') {
                if (i13 != i10) {
                    return i13;
                }
                return -1;
            }
            if (cCharAt2 == '\\') {
                int i14 = i13 + 1;
                if (j8.a(i14, charSequence)) {
                    i13 = i14;
                }
            } else if (cCharAt2 == '(') {
                i12++;
                if (i12 > 32) {
                    return -1;
                }
            } else if (cCharAt2 != ')') {
                if (Character.isISOControl(cCharAt2)) {
                    if (i13 != i10) {
                        return i13;
                    }
                    return -1;
                }
            } else {
                if (i12 == 0) {
                    return i13;
                }
                i12--;
            }
            i13++;
        }
        return charSequence.length();
    }

    public static int b(int i10, CharSequence charSequence) {
        while (i10 < charSequence.length()) {
            switch (charSequence.charAt(i10)) {
                case '[':
                    return -1;
                case '\\':
                    int i11 = i10 + 1;
                    if (j8.a(i11, charSequence)) {
                        i10 = i11;
                    }
                    break;
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
        char cCharAt = charSequence.charAt(i10);
        char c10 = '\"';
        if (cCharAt != '\"') {
            c10 = '\'';
            if (cCharAt != '\'') {
                if (cCharAt != '(') {
                    return -1;
                }
                c10 = ')';
            }
        }
        int iD = d(charSequence, i10 + 1, c10);
        if (iD != -1 && iD < charSequence.length() && charSequence.charAt(iD) == c10) {
            return iD + 1;
        }
        return -1;
    }

    public static int d(CharSequence charSequence, int i10, char c10) {
        while (i10 < charSequence.length()) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt == '\\') {
                int i11 = i10 + 1;
                if (j8.a(i11, charSequence)) {
                    i10 = i11;
                } else {
                    if (cCharAt == c10) {
                        return i10;
                    }
                    if (c10 == ')' && cCharAt == '(') {
                        return -1;
                    }
                }
            } else {
                if (cCharAt == c10) {
                    return i10;
                }
                if (c10 == ')') {
                    continue;
                }
            }
            i10++;
        }
        return charSequence.length();
    }
}

package defpackage;

import javax.security.auth.x500.X500Principal;
public final class gp3 {
    public final String a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public char[] g;

    public gp3(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.a = name;
        this.b = name.length();
    }

    public final int a(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        int i5 = this.b;
        String str = this.a;
        if (i4 < i5) {
            char[] cArr = this.g;
            char c = cArr[i];
            if (c >= '0' && c <= '9') {
                i2 = c - '0';
            } else if (c >= 'a' && c <= 'f') {
                i2 = c - 'W';
            } else if (c >= 'A' && c <= 'F') {
                i2 = c - '7';
            } else {
                grb.i(c00.i("Malformed DN: ", str));
                return 0;
            }
            char c2 = cArr[i4];
            if (c2 >= '0' && c2 <= '9') {
                i3 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i3 = c2 - 'W';
            } else if (c2 >= 'A' && c2 <= 'F') {
                i3 = c2 - '7';
            } else {
                grb.i(c00.i("Malformed DN: ", str));
                return 0;
            }
            return (i2 << 4) + i3;
        }
        grb.i(c00.i("Malformed DN: ", str));
        return 0;
    }

    public final char b() {
        int i;
        int i2 = this.c + 1;
        this.c = i2;
        int i3 = this.b;
        if (i2 != i3) {
            char c = this.g[i2];
            if (c != ' ' && c != '%' && c != '\\' && c != '_' && c != '\"' && c != '#') {
                switch (c) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                int a = a(i2);
                                this.c++;
                                if (a >= 128) {
                                    if (a >= 192 && a <= 247) {
                                        if (a <= 223) {
                                            a &= 31;
                                            i = 1;
                                        } else if (a <= 239) {
                                            a &= 15;
                                            i = 2;
                                        } else {
                                            a &= 7;
                                            i = 3;
                                        }
                                        for (int i4 = 0; i4 < i; i4++) {
                                            int i5 = this.c;
                                            int i6 = i5 + 1;
                                            this.c = i6;
                                            if (i6 != i3 && this.g[i6] == '\\') {
                                                int i7 = i5 + 2;
                                                this.c = i7;
                                                int a2 = a(i7);
                                                this.c++;
                                                if ((a2 & 192) == 128) {
                                                    a = (a << 6) + (a2 & 63);
                                                } else {
                                                    return '?';
                                                }
                                            } else {
                                                return '?';
                                            }
                                        }
                                    } else {
                                        return '?';
                                    }
                                }
                                return (char) a;
                        }
                }
            }
            return c;
        }
        lq5.o(this.a, "Unexpected end of DN: ");
        return (char) 0;
    }

    public final String c() {
        int i;
        int i2;
        int i3;
        char c;
        char c2;
        char c3;
        while (true) {
            i = this.c;
            i2 = this.b;
            if (i >= i2 || this.g[i] != ' ') {
                break;
            }
            this.c = i + 1;
        }
        if (i != i2) {
            this.d = i;
            this.c = i + 1;
            while (true) {
                i3 = this.c;
                if (i3 >= i2 || (c3 = this.g[i3]) == '=' || c3 == ' ') {
                    break;
                }
                this.c = i3 + 1;
            }
            String str = this.a;
            if (i3 < i2) {
                this.e = i3;
                if (this.g[i3] == ' ') {
                    while (true) {
                        i3 = this.c;
                        if (i3 >= i2 || (c2 = this.g[i3]) == '=' || c2 != ' ') {
                            break;
                        }
                        this.c = i3 + 1;
                    }
                    if (this.g[i3] != '=' || i3 == i2) {
                        grb.i(c00.i("Unexpected end of DN: ", str));
                        return null;
                    }
                }
                this.c = i3 + 1;
                while (true) {
                    int i4 = this.c;
                    if (i4 >= i2 || this.g[i4] != ' ') {
                        break;
                    }
                    this.c = i4 + 1;
                }
                int i5 = this.e;
                int i6 = this.d;
                if (i5 - i6 > 4) {
                    char[] cArr = this.g;
                    if (cArr[i6 + 3] == '.' && (((c = cArr[i6]) == 'O' || c == 'o') && ((cArr[i6 + 1] == 'I' || cArr[i6 + 1] == 'i') && (cArr[i6 + 2] == 'D' || cArr[i6 + 2] == 'd')))) {
                        i6 += 4;
                        this.d = i6;
                    }
                }
                return new String(this.g, i6, i5 - i6);
            }
            grb.i(c00.i("Unexpected end of DN: ", str));
            return null;
        }
        return null;
    }
}

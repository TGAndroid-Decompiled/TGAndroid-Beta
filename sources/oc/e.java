package oc;

import javax.security.auth.x500.X500Principal;
public final class e {
    public final String f20967a;
    public final int f20968b;
    public int f20969c;
    public int d;
    public int f20970e;
    public int f20971f;
    public char[] f20972g;

    public e(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f20967a = name;
        this.f20968b = name.length();
    }

    public final int a(int i3) {
        int i10;
        int i11;
        int i12 = i3 + 1;
        int i13 = this.f20968b;
        String str = this.f20967a;
        if (i12 < i13) {
            char[] cArr = this.f20972g;
            char c2 = cArr[i3];
            if (c2 >= '0' && c2 <= '9') {
                i10 = c2 - '0';
            } else if (c2 >= 'a' && c2 <= 'f') {
                i10 = c2 - 'W';
            } else if (c2 >= 'A' && c2 <= 'F') {
                i10 = c2 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            char c10 = cArr[i12];
            if (c10 >= '0' && c10 <= '9') {
                i11 = c10 - '0';
            } else if (c10 >= 'a' && c10 <= 'f') {
                i11 = c10 - 'W';
            } else if (c10 >= 'A' && c10 <= 'F') {
                i11 = c10 - '7';
            } else {
                throw new IllegalStateException("Malformed DN: " + str);
            }
            return (i10 << 4) + i11;
        }
        throw new IllegalStateException("Malformed DN: " + str);
    }

    public final char b() {
        int i3;
        int i10;
        int i11 = this.f20969c + 1;
        this.f20969c = i11;
        int i12 = this.f20968b;
        if (i11 != i12) {
            char c2 = this.f20972g[i11];
            if (c2 != ' ' && c2 != '%' && c2 != '\\' && c2 != '_' && c2 != '\"' && c2 != '#') {
                switch (c2) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c2) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                int a10 = a(i11);
                                this.f20969c++;
                                if (a10 < 128) {
                                    return (char) a10;
                                }
                                if (a10 >= 192 && a10 <= 247) {
                                    if (a10 <= 223) {
                                        i3 = a10 & 31;
                                        i10 = 1;
                                    } else if (a10 <= 239) {
                                        i3 = a10 & 15;
                                        i10 = 2;
                                    } else {
                                        i3 = a10 & 7;
                                        i10 = 3;
                                    }
                                    for (int i13 = 0; i13 < i10; i13++) {
                                        int i14 = this.f20969c;
                                        int i15 = i14 + 1;
                                        this.f20969c = i15;
                                        if (i15 != i12 && this.f20972g[i15] == '\\') {
                                            int i16 = i14 + 2;
                                            this.f20969c = i16;
                                            int a11 = a(i16);
                                            this.f20969c++;
                                            if ((a11 & 192) == 128) {
                                                i3 = (i3 << 6) + (a11 & 63);
                                            } else {
                                                return '?';
                                            }
                                        } else {
                                            return '?';
                                        }
                                    }
                                    return (char) i3;
                                }
                                return '?';
                        }
                }
            }
            return c2;
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f20967a);
    }

    public final String c() {
        int i3;
        int i10;
        int i11;
        char c2;
        int i12;
        char c10;
        char c11;
        while (true) {
            i3 = this.f20969c;
            i10 = this.f20968b;
            if (i3 >= i10 || this.f20972g[i3] != ' ') {
                break;
            }
            this.f20969c = i3 + 1;
        }
        if (i3 == i10) {
            return null;
        }
        this.d = i3;
        this.f20969c = i3 + 1;
        while (true) {
            i11 = this.f20969c;
            if (i11 >= i10 || (c11 = this.f20972g[i11]) == '=' || c11 == ' ') {
                break;
            }
            this.f20969c = i11 + 1;
        }
        String str = this.f20967a;
        if (i11 < i10) {
            this.f20970e = i11;
            if (this.f20972g[i11] == ' ') {
                while (true) {
                    i12 = this.f20969c;
                    if (i12 >= i10 || (c10 = this.f20972g[i12]) == '=' || c10 != ' ') {
                        break;
                    }
                    this.f20969c = i12 + 1;
                }
                if (this.f20972g[i12] != '=' || i12 == i10) {
                    throw new IllegalStateException("Unexpected end of DN: " + str);
                }
            }
            this.f20969c++;
            while (true) {
                int i13 = this.f20969c;
                if (i13 >= i10 || this.f20972g[i13] != ' ') {
                    break;
                }
                this.f20969c = i13 + 1;
            }
            int i14 = this.f20970e;
            int i15 = this.d;
            if (i14 - i15 > 4) {
                char[] cArr = this.f20972g;
                if (cArr[i15 + 3] == '.' && (((c2 = cArr[i15]) == 'O' || c2 == 'o') && ((cArr[i15 + 1] == 'I' || cArr[i15 + 1] == 'i') && (cArr[i15 + 2] == 'D' || cArr[i15 + 2] == 'd')))) {
                    this.d = i15 + 4;
                }
            }
            char[] cArr2 = this.f20972g;
            int i16 = this.d;
            return new String(cArr2, i16, i14 - i16);
        }
        throw new IllegalStateException("Unexpected end of DN: " + str);
    }
}

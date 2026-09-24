package lb;

import j$.util.Objects;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
public class a implements Closeable {
    public final Reader f14156a;
    public long f14160n;
    public int f14161r;
    public String f14162s;
    public int[] v;
    public String[] f14164x;
    public int[] f14165y;
    public final char[] f14157b = new char[1024];
    public int f14158c = 0;
    public int d = 0;
    public int e = 0;
    public int f14159f = 0;
    public int h = 0;
    public int f14163w = 1;

    static {
        rb.a.f42460b = new rb.a(12);
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.v = iArr;
        iArr[0] = 6;
        this.f14164x = new String[32];
        this.f14165y = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f14156a = reader;
    }

    public final void A(char c10) {
        do {
            int i10 = this.f14158c;
            int i11 = this.d;
            while (i10 < i11) {
                int i12 = i10 + 1;
                char c11 = this.f14157b[i10];
                if (c11 == c10) {
                    this.f14158c = i12;
                    return;
                } else if (c11 == '\\') {
                    this.f14158c = i12;
                    z();
                    i10 = this.f14158c;
                    i11 = this.d;
                } else {
                    if (c11 == '\n') {
                        this.e++;
                        this.f14159f = i12;
                    }
                    i10 = i12;
                }
            }
            this.f14158c = i10;
        } while (g(1));
        D("Unterminated string");
        throw null;
    }

    public final void B() {
        throw new UnsupportedOperationException("Method not decompiled: lb.a.B():void");
    }

    public void C() {
        int i10 = 0;
        do {
            int i11 = this.h;
            if (i11 == 0) {
                i11 = d();
            }
            switch (i11) {
                case 1:
                    y(3);
                    i10++;
                    break;
                case 2:
                    if (i10 == 0) {
                        this.f14164x[this.f14163w - 1] = null;
                    }
                    this.f14163w--;
                    i10--;
                    break;
                case 3:
                    y(1);
                    i10++;
                    break;
                case 4:
                    this.f14163w--;
                    i10--;
                    break;
                case 8:
                    A('\'');
                    break;
                case 9:
                    A('\"');
                    break;
                case 10:
                    B();
                    break;
                case 12:
                    A('\'');
                    if (i10 == 0) {
                        this.f14164x[this.f14163w - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 13:
                    A('\"');
                    if (i10 == 0) {
                        this.f14164x[this.f14163w - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 14:
                    B();
                    if (i10 == 0) {
                        this.f14164x[this.f14163w - 1] = "<skipped>";
                        break;
                    }
                    break;
                case 16:
                    this.f14158c += this.f14161r;
                    break;
                case 17:
                    return;
            }
            this.h = 0;
        } while (i10 > 0);
        int[] iArr = this.f14165y;
        int i12 = this.f14163w - 1;
        iArr[i12] = iArr[i12] + 1;
    }

    public final void D(String str) {
        StringBuilder v = a4.a.v(str);
        v.append(m());
        v.append("\nSee ");
        v.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new IOException(v.toString());
    }

    public final IllegalStateException E(String str) {
        String str2;
        if (x() == 9) {
            str2 = "adapter-not-null-safe";
        } else {
            str2 = "unexpected-json-structure";
        }
        StringBuilder w10 = a4.a.w("Expected ", str, " but was ");
        w10.append(hg.c.D(x()));
        w10.append(m());
        w10.append("\nSee ");
        w10.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(w10.toString());
    }

    public void a() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 3) {
            y(1);
            this.f14165y[this.f14163w - 1] = 0;
            this.h = 0;
            return;
        }
        throw E("BEGIN_ARRAY");
    }

    public void b() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 1) {
            y(3);
            this.h = 0;
            return;
        }
        throw E("BEGIN_OBJECT");
    }

    public final void c() {
        D("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    @Override
    public void close() {
        this.h = 0;
        this.v[0] = 8;
        this.f14163w = 1;
        this.f14156a.close();
    }

    public final int d() {
        throw new UnsupportedOperationException("Method not decompiled: lb.a.d():int");
    }

    public void e() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 4) {
            int i11 = this.f14163w;
            this.f14163w = i11 - 1;
            int[] iArr = this.f14165y;
            int i12 = i11 - 2;
            iArr[i12] = iArr[i12] + 1;
            this.h = 0;
            return;
        }
        throw E("END_ARRAY");
    }

    public void f() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 2) {
            int i11 = this.f14163w;
            int i12 = i11 - 1;
            this.f14163w = i12;
            this.f14164x[i12] = null;
            int[] iArr = this.f14165y;
            int i13 = i11 - 2;
            iArr[i13] = iArr[i13] + 1;
            this.h = 0;
            return;
        }
        throw E("END_OBJECT");
    }

    public final boolean g(int i10) {
        int i11;
        int i12;
        int i13 = this.f14159f;
        int i14 = this.f14158c;
        this.f14159f = i13 - i14;
        int i15 = this.d;
        char[] cArr = this.f14157b;
        if (i15 != i14) {
            int i16 = i15 - i14;
            this.d = i16;
            System.arraycopy(cArr, i14, cArr, 0, i16);
        } else {
            this.d = 0;
        }
        this.f14158c = 0;
        do {
            int i17 = this.d;
            int read = this.f14156a.read(cArr, i17, cArr.length - i17);
            if (read == -1) {
                return false;
            }
            i11 = this.d + read;
            this.d = i11;
            if (this.e == 0 && (i12 = this.f14159f) == 0 && i11 > 0 && cArr[0] == 65279) {
                this.f14158c++;
                this.f14159f = i12 + 1;
                i10++;
                continue;
            }
        } while (i11 < i10);
        return true;
    }

    public String h() {
        return i(false);
    }

    public final String i(boolean z10) {
        StringBuilder sb2 = new StringBuilder("$");
        int i10 = 0;
        while (true) {
            int i11 = this.f14163w;
            if (i10 < i11) {
                int i12 = this.v[i10];
                switch (i12) {
                    case 1:
                    case 2:
                        int i13 = this.f14165y[i10];
                        if (z10 && i13 > 0 && i10 == i11 - 1) {
                            i13--;
                        }
                        sb2.append('[');
                        sb2.append(i13);
                        sb2.append(']');
                        break;
                    case 3:
                    case 4:
                    case 5:
                        sb2.append('.');
                        String str = this.f14164x[i10];
                        if (str == null) {
                            break;
                        } else {
                            sb2.append(str);
                            break;
                        }
                    case 6:
                    case 7:
                    case 8:
                        break;
                    default:
                        throw new AssertionError(hg.c.h(i12, "Unknown scope value: "));
                }
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    public String j() {
        return i(true);
    }

    public boolean k() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 != 2 && i10 != 4 && i10 != 17) {
            return true;
        }
        return false;
    }

    public final boolean l(char c10) {
        if (c10 != '\t' && c10 != '\n' && c10 != '\f' && c10 != '\r' && c10 != ' ') {
            if (c10 != '#') {
                if (c10 != ',') {
                    if (c10 != '/' && c10 != '=') {
                        if (c10 != '{' && c10 != '}' && c10 != ':') {
                            if (c10 != ';') {
                                switch (c10) {
                                    case '[':
                                    case ']':
                                        return false;
                                    case '\\':
                                        break;
                                    default:
                                        return true;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            c();
            throw null;
        }
        return false;
    }

    final String m() {
        StringBuilder k10 = hg.c.k(" at line ", this.e + 1, " column ", (this.f14158c - this.f14159f) + 1, " path ");
        k10.append(h());
        return k10.toString();
    }

    public boolean n() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 5) {
            this.h = 0;
            int[] iArr = this.f14165y;
            int i11 = this.f14163w - 1;
            iArr[i11] = iArr[i11] + 1;
            return true;
        } else if (i10 == 6) {
            this.h = 0;
            int[] iArr2 = this.f14165y;
            int i12 = this.f14163w - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return false;
        } else {
            throw E("a boolean");
        }
    }

    public double o() {
        char c10;
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 15) {
            this.h = 0;
            int[] iArr = this.f14165y;
            int i11 = this.f14163w - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f14160n;
        }
        if (i10 == 16) {
            this.f14162s = new String(this.f14157b, this.f14158c, this.f14161r);
            this.f14158c += this.f14161r;
        } else if (i10 != 8 && i10 != 9) {
            if (i10 == 10) {
                this.f14162s = w();
            } else if (i10 != 11) {
                throw E("a double");
            }
        } else {
            if (i10 == 8) {
                c10 = '\'';
            } else {
                c10 = '\"';
            }
            this.f14162s = u(c10);
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.f14162s);
        if (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble)) {
            this.f14162s = null;
            this.h = 0;
            int[] iArr2 = this.f14165y;
            int i12 = this.f14163w - 1;
            iArr2[i12] = iArr2[i12] + 1;
            return parseDouble;
        }
        D("JSON forbids NaN and infinities: " + parseDouble);
        throw null;
    }

    public int p() {
        char c10;
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 15) {
            long j3 = this.f14160n;
            int i11 = (int) j3;
            if (j3 == i11) {
                this.h = 0;
                int[] iArr = this.f14165y;
                int i12 = this.f14163w - 1;
                iArr[i12] = iArr[i12] + 1;
                return i11;
            }
            throw new NumberFormatException("Expected an int but was " + this.f14160n + m());
        }
        if (i10 == 16) {
            this.f14162s = new String(this.f14157b, this.f14158c, this.f14161r);
            this.f14158c += this.f14161r;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw E("an int");
        } else {
            if (i10 == 10) {
                this.f14162s = w();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f14162s = u(c10);
            }
            try {
                int parseInt = Integer.parseInt(this.f14162s);
                this.h = 0;
                int[] iArr2 = this.f14165y;
                int i13 = this.f14163w - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.f14162s);
        int i14 = (int) parseDouble;
        if (i14 == parseDouble) {
            this.f14162s = null;
            this.h = 0;
            int[] iArr3 = this.f14165y;
            int i15 = this.f14163w - 1;
            iArr3[i15] = iArr3[i15] + 1;
            return i14;
        }
        throw new NumberFormatException("Expected an int but was " + this.f14162s + m());
    }

    public long q() {
        char c10;
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 15) {
            this.h = 0;
            int[] iArr = this.f14165y;
            int i11 = this.f14163w - 1;
            iArr[i11] = iArr[i11] + 1;
            return this.f14160n;
        }
        if (i10 == 16) {
            this.f14162s = new String(this.f14157b, this.f14158c, this.f14161r);
            this.f14158c += this.f14161r;
        } else if (i10 != 8 && i10 != 9 && i10 != 10) {
            throw E("a long");
        } else {
            if (i10 == 10) {
                this.f14162s = w();
            } else {
                if (i10 == 8) {
                    c10 = '\'';
                } else {
                    c10 = '\"';
                }
                this.f14162s = u(c10);
            }
            try {
                long parseLong = Long.parseLong(this.f14162s);
                this.h = 0;
                int[] iArr2 = this.f14165y;
                int i12 = this.f14163w - 1;
                iArr2[i12] = iArr2[i12] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.h = 11;
        double parseDouble = Double.parseDouble(this.f14162s);
        long j3 = (long) parseDouble;
        if (j3 == parseDouble) {
            this.f14162s = null;
            this.h = 0;
            int[] iArr3 = this.f14165y;
            int i13 = this.f14163w - 1;
            iArr3[i13] = iArr3[i13] + 1;
            return j3;
        }
        throw new NumberFormatException("Expected a long but was " + this.f14162s + m());
    }

    public String r() {
        String u10;
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 14) {
            u10 = w();
        } else if (i10 == 12) {
            u10 = u('\'');
        } else if (i10 == 13) {
            u10 = u('\"');
        } else {
            throw E("a name");
        }
        this.h = 0;
        this.f14164x[this.f14163w - 1] = u10;
        return u10;
    }

    public final int s(boolean z10) {
        int i10 = this.f14158c;
        int i11 = this.d;
        while (true) {
            if (i10 == i11) {
                this.f14158c = i10;
                if (!g(1)) {
                    if (!z10) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m());
                }
                i10 = this.f14158c;
                i11 = this.d;
            }
            int i12 = i10 + 1;
            char c10 = this.f14157b[i10];
            if (c10 == '\n') {
                this.e++;
                this.f14159f = i12;
            } else if (c10 != ' ' && c10 != '\r' && c10 != '\t') {
                if (c10 == '/') {
                    this.f14158c = i12;
                    if (i12 == i11) {
                        this.f14158c = i10;
                        boolean g10 = g(2);
                        this.f14158c++;
                        if (!g10) {
                            return c10;
                        }
                    }
                    c();
                    throw null;
                } else if (c10 != '#') {
                    this.f14158c = i12;
                    return c10;
                } else {
                    this.f14158c = i12;
                    c();
                    throw null;
                }
            }
            i10 = i12;
        }
    }

    public void t() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 7) {
            this.h = 0;
            int[] iArr = this.f14165y;
            int i11 = this.f14163w - 1;
            iArr[i11] = iArr[i11] + 1;
            return;
        }
        throw E("null");
    }

    public String toString() {
        return getClass().getSimpleName() + m();
    }

    public final java.lang.String u(char r11) {
        throw new UnsupportedOperationException("Method not decompiled: lb.a.u(char):java.lang.String");
    }

    public String v() {
        String str;
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        if (i10 == 10) {
            str = w();
        } else if (i10 == 8) {
            str = u('\'');
        } else if (i10 == 9) {
            str = u('\"');
        } else if (i10 == 11) {
            str = this.f14162s;
            this.f14162s = null;
        } else if (i10 == 15) {
            str = Long.toString(this.f14160n);
        } else if (i10 == 16) {
            str = new String(this.f14157b, this.f14158c, this.f14161r);
            this.f14158c += this.f14161r;
        } else {
            throw E("a string");
        }
        this.h = 0;
        int[] iArr = this.f14165y;
        int i11 = this.f14163w - 1;
        iArr[i11] = iArr[i11] + 1;
        return str;
    }

    public final java.lang.String w() {
        throw new UnsupportedOperationException("Method not decompiled: lb.a.w():java.lang.String");
    }

    public int x() {
        int i10 = this.h;
        if (i10 == 0) {
            i10 = d();
        }
        switch (i10) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    public final void y(int i10) {
        int i11 = this.f14163w;
        int[] iArr = this.v;
        if (i11 == iArr.length) {
            int i12 = i11 * 2;
            this.v = Arrays.copyOf(iArr, i12);
            this.f14165y = Arrays.copyOf(this.f14165y, i12);
            this.f14164x = (String[]) Arrays.copyOf(this.f14164x, i12);
        }
        int[] iArr2 = this.v;
        int i13 = this.f14163w;
        this.f14163w = i13 + 1;
        iArr2[i13] = i10;
    }

    public final char z() {
        int i10;
        if (this.f14158c == this.d && !g(1)) {
            D("Unterminated escape sequence");
            throw null;
        }
        int i11 = this.f14158c;
        int i12 = i11 + 1;
        this.f14158c = i12;
        char[] cArr = this.f14157b;
        char c10 = cArr[i11];
        if (c10 != '\n') {
            if (c10 != '\"' && c10 != '\'' && c10 != '/' && c10 != '\\') {
                if (c10 != 'b') {
                    if (c10 != 'f') {
                        if (c10 == 'n') {
                            return '\n';
                        }
                        if (c10 != 'r') {
                            if (c10 != 't') {
                                if (c10 == 'u') {
                                    if (i11 + 5 > this.d && !g(4)) {
                                        D("Unterminated escape sequence");
                                        throw null;
                                    }
                                    int i13 = this.f14158c;
                                    int i14 = i13 + 4;
                                    int i15 = 0;
                                    while (i13 < i14) {
                                        char c11 = cArr[i13];
                                        int i16 = i15 << 4;
                                        if (c11 >= '0' && c11 <= '9') {
                                            i10 = c11 - '0';
                                        } else if (c11 >= 'a' && c11 <= 'f') {
                                            i10 = c11 - 'W';
                                        } else if (c11 >= 'A' && c11 <= 'F') {
                                            i10 = c11 - '7';
                                        } else {
                                            D("Malformed Unicode escape \\u".concat(new String(cArr, this.f14158c, 4)));
                                            throw null;
                                        }
                                        i15 = i10 + i16;
                                        i13++;
                                    }
                                    this.f14158c += 4;
                                    return (char) i15;
                                }
                                D("Invalid escape sequence");
                                throw null;
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\f';
                }
                return '\b';
            }
            return c10;
        }
        this.e++;
        this.f14159f = i12;
        return c10;
    }
}

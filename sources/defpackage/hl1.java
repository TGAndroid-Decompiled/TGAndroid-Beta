package defpackage;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
public final class hl1 {
    public final char[] a;
    public final StringReader b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final String[] h;

    public hl1(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.h = new String[128];
        if (stringReader.markSupported()) {
            this.b = stringReader;
            this.a = new char[4096];
            b();
            return;
        }
        u36.j("Must be true");
        throw null;
    }

    public static String c(char[] cArr, String[] strArr, int i, int i2) {
        if (i2 > 12) {
            return new String(cArr, i, i2);
        }
        if (i2 < 1) {
            return "";
        }
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        int i6 = 0;
        while (i5 < i2) {
            i6 = (i6 * 31) + cArr[i4];
            i5++;
            i4++;
        }
        int length = i6 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i, i2);
            strArr[length] = str2;
            return str2;
        }
        if (i2 == str.length()) {
            int i7 = i;
            int i8 = i2;
            while (true) {
                int i9 = i8 - 1;
                if (i8 != 0) {
                    int i10 = i7 + 1;
                    int i11 = i3 + 1;
                    if (cArr[i7] != str.charAt(i3)) {
                        break;
                    }
                    i7 = i10;
                    i8 = i9;
                    i3 = i11;
                } else {
                    return str;
                }
            }
        }
        String str3 = new String(cArr, i, i2);
        strArr[length] = str3;
        return str3;
    }

    public final void a() {
        this.e++;
    }

    public final void b() {
        StringReader stringReader = this.b;
        int i = this.e;
        if (i >= this.d) {
            try {
                stringReader.skip(i);
                stringReader.mark(4096);
                int read = stringReader.read(this.a);
                stringReader.reset();
                if (read != -1) {
                    this.c = read;
                    this.f += this.e;
                    this.e = 0;
                    this.g = 0;
                    if (read > 3072) {
                        read = 3072;
                    }
                    this.d = read;
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final char d() {
        char c;
        b();
        int i = this.e;
        if (i >= this.c) {
            c = 65535;
        } else {
            c = this.a[i];
        }
        this.e = i + 1;
        return c;
    }

    public final String e() {
        char[] cArr;
        char c;
        b();
        int i = this.e;
        while (true) {
            int i2 = this.e;
            int i3 = this.c;
            cArr = this.a;
            if (i2 >= i3 || (((c = cArr[i2]) < 'A' || c > 'Z') && ((c < 'a' || c > 'z') && !Character.isLetter(c)))) {
                break;
            }
            this.e++;
        }
        return c(cArr, this.h, i, this.e - i);
    }

    public final String f(char c) {
        char[] cArr;
        int i;
        b();
        int i2 = this.e;
        while (true) {
            int i3 = this.c;
            cArr = this.a;
            if (i2 < i3) {
                if (c == cArr[i2]) {
                    i = i2 - this.e;
                    break;
                }
                i2++;
            } else {
                i = -1;
                break;
            }
        }
        String[] strArr = this.h;
        if (i != -1) {
            String c2 = c(cArr, strArr, this.e, i);
            this.e += i;
            return c2;
        }
        b();
        int i4 = this.e;
        String c3 = c(cArr, strArr, i4, this.c - i4);
        this.e = this.c;
        return c3;
    }

    public final String g(char... cArr) {
        int i;
        char[] cArr2;
        b();
        int i2 = this.e;
        int i3 = this.c;
        loop0: while (true) {
            i = this.e;
            cArr2 = this.a;
            if (i >= i3) {
                break;
            }
            for (char c : cArr) {
                int i4 = this.e;
                if (cArr2[i4] == c) {
                    i = i4;
                    break loop0;
                }
            }
            this.e++;
        }
        if (i > i2) {
            return c(cArr2, this.h, i2, i - i2);
        }
        return "";
    }

    public final String h(char... cArr) {
        char[] cArr2;
        b();
        int i = this.e;
        int i2 = this.c;
        while (true) {
            int i3 = this.e;
            cArr2 = this.a;
            if (i3 >= i2 || Arrays.binarySearch(cArr, cArr2[i3]) >= 0) {
                break;
            }
            this.e++;
        }
        int i4 = this.e;
        if (i4 > i) {
            return c(cArr2, this.h, i, i4 - i);
        }
        return "";
    }

    public final char i() {
        b();
        int i = this.e;
        if (i >= this.c) {
            return (char) 65535;
        }
        return this.a[i];
    }

    public final boolean j() {
        b();
        if (this.e >= this.c) {
            return true;
        }
        return false;
    }

    public final boolean k(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.c - this.e) {
            for (int i = 0; i < length; i++) {
                if (str.charAt(i) == this.a[this.e + i]) {
                }
            }
            this.e = str.length() + this.e;
            return true;
        }
        return false;
    }

    public final boolean l(String str) {
        b();
        int length = str.length();
        if (length <= this.c - this.e) {
            for (int i = 0; i < length; i++) {
                if (Character.toUpperCase(str.charAt(i)) == Character.toUpperCase(this.a[this.e + i])) {
                }
            }
            this.e = str.length() + this.e;
            return true;
        }
        return false;
    }

    public final boolean m(char c) {
        if (!j() && this.a[this.e] == c) {
            return true;
        }
        return false;
    }

    public final boolean n(char... cArr) {
        if (!j()) {
            b();
            char c = this.a[this.e];
            for (char c2 : cArr) {
                if (c2 == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean o() {
        if (j()) {
            return false;
        }
        char c = this.a[this.e];
        if (c < 'A' || c > 'Z') {
            if ((c < 'a' || c > 'z') && !Character.isLetter(c)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int p(String str) {
        b();
        char charAt = str.charAt(0);
        int i = this.e;
        while (i < this.c) {
            char[] cArr = this.a;
            if (charAt != cArr[i]) {
                do {
                    i++;
                    if (i >= this.c) {
                        break;
                    }
                } while (charAt != cArr[i]);
            }
            int i2 = i + 1;
            int length = (str.length() + i2) - 1;
            int i3 = this.c;
            if (i < i3 && length <= i3) {
                int i4 = i2;
                for (int i5 = 1; i4 < length && str.charAt(i5) == cArr[i4]; i5++) {
                    i4++;
                }
                if (i4 == length) {
                    return i - this.e;
                }
            }
            i = i2;
        }
        return -1;
    }

    public final void q() {
        this.e--;
    }

    public final String toString() {
        int i = this.e;
        return new String(this.a, i, this.c - i);
    }
}

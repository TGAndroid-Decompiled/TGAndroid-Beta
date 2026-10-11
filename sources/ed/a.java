package ed;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
public final class a {
    public final char[] f8826a;
    public final StringReader f8827b;
    public int f8828c;
    public int d;
    public int f8829e;
    public int f8830f;
    public int f8831g;
    public final String[] h;

    public a(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.h = new String[128];
        if (stringReader.markSupported()) {
            this.f8827b = stringReader;
            this.f8826a = new char[4096];
            b();
            return;
        }
        throw new IllegalArgumentException("Must be true");
    }

    public static String c(char[] cArr, String[] strArr, int i10, int i11) {
        if (i11 > 12) {
            return new String(cArr, i10, i11);
        }
        if (i11 < 1) {
            return "";
        }
        int i12 = 0;
        int i13 = i10;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i11) {
            i15 = (i15 * 31) + cArr[i13];
            i14++;
            i13++;
        }
        int length = i15 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i10, i11);
            strArr[length] = str2;
            return str2;
        }
        if (i11 == str.length()) {
            int i16 = i10;
            int i17 = i11;
            while (true) {
                int i18 = i17 - 1;
                if (i17 != 0) {
                    int i19 = i16 + 1;
                    int i20 = i12 + 1;
                    if (cArr[i16] != str.charAt(i12)) {
                        break;
                    }
                    i16 = i19;
                    i17 = i18;
                    i12 = i20;
                } else {
                    return str;
                }
            }
        }
        String str3 = new String(cArr, i10, i11);
        strArr[length] = str3;
        return str3;
    }

    public final void a() {
        this.f8829e++;
    }

    public final void b() {
        StringReader stringReader = this.f8827b;
        int i10 = this.f8829e;
        if (i10 >= this.d) {
            try {
                stringReader.skip(i10);
                stringReader.mark(4096);
                int read = stringReader.read(this.f8826a);
                stringReader.reset();
                if (read != -1) {
                    this.f8828c = read;
                    this.f8830f += this.f8829e;
                    this.f8829e = 0;
                    this.f8831g = 0;
                    if (read > 3072) {
                        read = 3072;
                    }
                    this.d = read;
                }
            } catch (IOException e7) {
                throw new RuntimeException(e7);
            }
        }
    }

    public final char d() {
        char c10;
        b();
        int i10 = this.f8829e;
        if (i10 >= this.f8828c) {
            c10 = 65535;
        } else {
            c10 = this.f8826a[i10];
        }
        this.f8829e = i10 + 1;
        return c10;
    }

    public final String e() {
        char[] cArr;
        char c10;
        b();
        int i10 = this.f8829e;
        while (true) {
            int i11 = this.f8829e;
            int i12 = this.f8828c;
            cArr = this.f8826a;
            if (i11 >= i12 || (((c10 = cArr[i11]) < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !Character.isLetter(c10)))) {
                break;
            }
            this.f8829e++;
        }
        return c(cArr, this.h, i10, this.f8829e - i10);
    }

    public final String f(char c10) {
        char[] cArr;
        int i10;
        b();
        int i11 = this.f8829e;
        while (true) {
            int i12 = this.f8828c;
            cArr = this.f8826a;
            if (i11 < i12) {
                if (c10 == cArr[i11]) {
                    i10 = i11 - this.f8829e;
                    break;
                }
                i11++;
            } else {
                i10 = -1;
                break;
            }
        }
        String[] strArr = this.h;
        if (i10 != -1) {
            String c11 = c(cArr, strArr, this.f8829e, i10);
            this.f8829e += i10;
            return c11;
        }
        b();
        int i13 = this.f8829e;
        String c12 = c(cArr, strArr, i13, this.f8828c - i13);
        this.f8829e = this.f8828c;
        return c12;
    }

    public final String g(char... cArr) {
        char[] cArr2;
        b();
        int i10 = this.f8829e;
        int i11 = this.f8828c;
        loop0: while (true) {
            int i12 = this.f8829e;
            cArr2 = this.f8826a;
            if (i12 >= i11) {
                break;
            }
            for (char c10 : cArr) {
                if (cArr2[this.f8829e] == c10) {
                    break loop0;
                }
            }
            this.f8829e++;
        }
        int i13 = this.f8829e;
        if (i13 > i10) {
            return c(cArr2, this.h, i10, i13 - i10);
        }
        return "";
    }

    public final String h(char... cArr) {
        char[] cArr2;
        b();
        int i10 = this.f8829e;
        int i11 = this.f8828c;
        while (true) {
            int i12 = this.f8829e;
            cArr2 = this.f8826a;
            if (i12 >= i11 || Arrays.binarySearch(cArr, cArr2[i12]) >= 0) {
                break;
            }
            this.f8829e++;
        }
        int i13 = this.f8829e;
        if (i13 > i10) {
            return c(cArr2, this.h, i10, i13 - i10);
        }
        return "";
    }

    public final char i() {
        b();
        int i10 = this.f8829e;
        if (i10 >= this.f8828c) {
            return (char) 65535;
        }
        return this.f8826a[i10];
    }

    public final boolean j() {
        b();
        if (this.f8829e >= this.f8828c) {
            return true;
        }
        return false;
    }

    public final boolean k(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.f8828c - this.f8829e) {
            for (int i10 = 0; i10 < length; i10++) {
                if (str.charAt(i10) == this.f8826a[this.f8829e + i10]) {
                }
            }
            this.f8829e = str.length() + this.f8829e;
            return true;
        }
        return false;
    }

    public final boolean l(String str) {
        b();
        int length = str.length();
        if (length <= this.f8828c - this.f8829e) {
            for (int i10 = 0; i10 < length; i10++) {
                if (Character.toUpperCase(str.charAt(i10)) == Character.toUpperCase(this.f8826a[this.f8829e + i10])) {
                }
            }
            this.f8829e = str.length() + this.f8829e;
            return true;
        }
        return false;
    }

    public final boolean m(char c10) {
        if (!j() && this.f8826a[this.f8829e] == c10) {
            return true;
        }
        return false;
    }

    public final boolean n(char... cArr) {
        if (!j()) {
            b();
            char c10 = this.f8826a[this.f8829e];
            for (char c11 : cArr) {
                if (c11 == c10) {
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
        char c10 = this.f8826a[this.f8829e];
        if (c10 < 'A' || c10 > 'Z') {
            if ((c10 < 'a' || c10 > 'z') && !Character.isLetter(c10)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int p(String str) {
        b();
        char charAt = str.charAt(0);
        int i10 = this.f8829e;
        while (i10 < this.f8828c) {
            char[] cArr = this.f8826a;
            if (charAt != cArr[i10]) {
                do {
                    i10++;
                    if (i10 >= this.f8828c) {
                        break;
                    }
                } while (charAt != cArr[i10]);
            }
            int i11 = i10 + 1;
            int length = (str.length() + i11) - 1;
            int i12 = this.f8828c;
            if (i10 < i12 && length <= i12) {
                int i13 = i11;
                for (int i14 = 1; i13 < length && str.charAt(i14) == cArr[i13]; i14++) {
                    i13++;
                }
                if (i13 == length) {
                    return i10 - this.f8829e;
                }
            }
            i10 = i11;
        }
        return -1;
    }

    public final void q() {
        this.f8829e--;
    }

    public final String toString() {
        int i10 = this.f8829e;
        return new String(this.f8826a, i10, this.f8828c - i10);
    }
}

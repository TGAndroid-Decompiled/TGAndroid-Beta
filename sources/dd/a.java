package dd;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
public final class a {
    public final char[] f8294a;
    public final StringReader f8295b;
    public int f8296c;
    public int d;
    public int f8297e;
    public int f8298f;
    public int f8299g;
    public final String[] h;

    public a(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.h = new String[128];
        if (stringReader.markSupported()) {
            this.f8295b = stringReader;
            this.f8294a = new char[4096];
            b();
            return;
        }
        throw new IllegalArgumentException("Must be true");
    }

    public static String c(char[] cArr, String[] strArr, int i7, int i10) {
        if (i10 > 12) {
            return new String(cArr, i7, i10);
        }
        if (i10 < 1) {
            return "";
        }
        int i11 = 0;
        int i12 = i7;
        int i13 = 0;
        int i14 = 0;
        while (i13 < i10) {
            i14 = (i14 * 31) + cArr[i12];
            i13++;
            i12++;
        }
        int length = i14 & (strArr.length - 1);
        String str = strArr[length];
        if (str == null) {
            String str2 = new String(cArr, i7, i10);
            strArr[length] = str2;
            return str2;
        }
        if (i10 == str.length()) {
            int i15 = i7;
            int i16 = i10;
            while (true) {
                int i17 = i16 - 1;
                if (i16 != 0) {
                    int i18 = i15 + 1;
                    int i19 = i11 + 1;
                    if (cArr[i15] != str.charAt(i11)) {
                        break;
                    }
                    i15 = i18;
                    i16 = i17;
                    i11 = i19;
                } else {
                    return str;
                }
            }
        }
        String str3 = new String(cArr, i7, i10);
        strArr[length] = str3;
        return str3;
    }

    public final void a() {
        this.f8297e++;
    }

    public final void b() {
        StringReader stringReader = this.f8295b;
        int i7 = this.f8297e;
        if (i7 >= this.d) {
            try {
                stringReader.skip(i7);
                stringReader.mark(4096);
                int read = stringReader.read(this.f8294a);
                stringReader.reset();
                if (read != -1) {
                    this.f8296c = read;
                    this.f8298f += this.f8297e;
                    this.f8297e = 0;
                    this.f8299g = 0;
                    if (read > 3072) {
                        read = 3072;
                    }
                    this.d = read;
                }
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
    }

    public final char d() {
        char c10;
        b();
        int i7 = this.f8297e;
        if (i7 >= this.f8296c) {
            c10 = 65535;
        } else {
            c10 = this.f8294a[i7];
        }
        this.f8297e = i7 + 1;
        return c10;
    }

    public final String e() {
        char[] cArr;
        char c10;
        b();
        int i7 = this.f8297e;
        while (true) {
            int i10 = this.f8297e;
            int i11 = this.f8296c;
            cArr = this.f8294a;
            if (i10 >= i11 || (((c10 = cArr[i10]) < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !Character.isLetter(c10)))) {
                break;
            }
            this.f8297e++;
        }
        return c(cArr, this.h, i7, this.f8297e - i7);
    }

    public final String f(char c10) {
        char[] cArr;
        int i7;
        b();
        int i10 = this.f8297e;
        while (true) {
            int i11 = this.f8296c;
            cArr = this.f8294a;
            if (i10 < i11) {
                if (c10 == cArr[i10]) {
                    i7 = i10 - this.f8297e;
                    break;
                }
                i10++;
            } else {
                i7 = -1;
                break;
            }
        }
        String[] strArr = this.h;
        if (i7 != -1) {
            String c11 = c(cArr, strArr, this.f8297e, i7);
            this.f8297e += i7;
            return c11;
        }
        b();
        int i12 = this.f8297e;
        String c12 = c(cArr, strArr, i12, this.f8296c - i12);
        this.f8297e = this.f8296c;
        return c12;
    }

    public final String g(char... cArr) {
        char[] cArr2;
        b();
        int i7 = this.f8297e;
        int i10 = this.f8296c;
        loop0: while (true) {
            int i11 = this.f8297e;
            cArr2 = this.f8294a;
            if (i11 >= i10) {
                break;
            }
            for (char c10 : cArr) {
                if (cArr2[this.f8297e] == c10) {
                    break loop0;
                }
            }
            this.f8297e++;
        }
        int i12 = this.f8297e;
        if (i12 > i7) {
            return c(cArr2, this.h, i7, i12 - i7);
        }
        return "";
    }

    public final String h(char... cArr) {
        char[] cArr2;
        b();
        int i7 = this.f8297e;
        int i10 = this.f8296c;
        while (true) {
            int i11 = this.f8297e;
            cArr2 = this.f8294a;
            if (i11 >= i10 || Arrays.binarySearch(cArr, cArr2[i11]) >= 0) {
                break;
            }
            this.f8297e++;
        }
        int i12 = this.f8297e;
        if (i12 > i7) {
            return c(cArr2, this.h, i7, i12 - i7);
        }
        return "";
    }

    public final char i() {
        b();
        int i7 = this.f8297e;
        if (i7 >= this.f8296c) {
            return (char) 65535;
        }
        return this.f8294a[i7];
    }

    public final boolean j() {
        b();
        if (this.f8297e >= this.f8296c) {
            return true;
        }
        return false;
    }

    public final boolean k(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.f8296c - this.f8297e) {
            for (int i7 = 0; i7 < length; i7++) {
                if (str.charAt(i7) == this.f8294a[this.f8297e + i7]) {
                }
            }
            this.f8297e = str.length() + this.f8297e;
            return true;
        }
        return false;
    }

    public final boolean l(String str) {
        b();
        int length = str.length();
        if (length <= this.f8296c - this.f8297e) {
            for (int i7 = 0; i7 < length; i7++) {
                if (Character.toUpperCase(str.charAt(i7)) == Character.toUpperCase(this.f8294a[this.f8297e + i7])) {
                }
            }
            this.f8297e = str.length() + this.f8297e;
            return true;
        }
        return false;
    }

    public final boolean m(char c10) {
        if (!j() && this.f8294a[this.f8297e] == c10) {
            return true;
        }
        return false;
    }

    public final boolean n(char... cArr) {
        if (!j()) {
            b();
            char c10 = this.f8294a[this.f8297e];
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
        char c10 = this.f8294a[this.f8297e];
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
        int i7 = this.f8297e;
        while (i7 < this.f8296c) {
            char[] cArr = this.f8294a;
            if (charAt != cArr[i7]) {
                do {
                    i7++;
                    if (i7 >= this.f8296c) {
                        break;
                    }
                } while (charAt != cArr[i7]);
            }
            int i10 = i7 + 1;
            int length = (str.length() + i10) - 1;
            int i11 = this.f8296c;
            if (i7 < i11 && length <= i11) {
                int i12 = i10;
                for (int i13 = 1; i12 < length && str.charAt(i13) == cArr[i12]; i13++) {
                    i12++;
                }
                if (i12 == length) {
                    return i7 - this.f8297e;
                }
            }
            i7 = i10;
        }
        return -1;
    }

    public final void q() {
        this.f8297e--;
    }

    public final String toString() {
        int i7 = this.f8297e;
        return new String(this.f8294a, i7, this.f8296c - i7);
    }
}

package ad;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
public final class a {
    public final char[] f308a;
    public final StringReader f309b;
    public int f310c;
    public int d;
    public int f311e;
    public int f312f;
    public int f313g;
    public final String[] h;

    public a(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.h = new String[128];
        if (stringReader.markSupported()) {
            this.f309b = stringReader;
            this.f308a = new char[4096];
            b();
            return;
        }
        throw new IllegalArgumentException("Must be true");
    }

    public static String c(char[] cArr, String[] strArr, int i3, int i10) {
        if (i10 > 12) {
            return new String(cArr, i3, i10);
        }
        if (i10 < 1) {
            return "";
        }
        int i11 = 0;
        int i12 = i3;
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
            String str2 = new String(cArr, i3, i10);
            strArr[length] = str2;
            return str2;
        }
        if (i10 == str.length()) {
            int i15 = i3;
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
        String str3 = new String(cArr, i3, i10);
        strArr[length] = str3;
        return str3;
    }

    public final void a() {
        this.f311e++;
    }

    public final void b() {
        StringReader stringReader = this.f309b;
        int i3 = this.f311e;
        if (i3 >= this.d) {
            try {
                stringReader.skip(i3);
                stringReader.mark(4096);
                int read = stringReader.read(this.f308a);
                stringReader.reset();
                if (read != -1) {
                    this.f310c = read;
                    this.f312f += this.f311e;
                    this.f311e = 0;
                    this.f313g = 0;
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
        char c2;
        b();
        int i3 = this.f311e;
        if (i3 >= this.f310c) {
            c2 = 65535;
        } else {
            c2 = this.f308a[i3];
        }
        this.f311e = i3 + 1;
        return c2;
    }

    public final String e() {
        char[] cArr;
        char c2;
        b();
        int i3 = this.f311e;
        while (true) {
            int i10 = this.f311e;
            int i11 = this.f310c;
            cArr = this.f308a;
            if (i10 >= i11 || (((c2 = cArr[i10]) < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !Character.isLetter(c2)))) {
                break;
            }
            this.f311e++;
        }
        return c(cArr, this.h, i3, this.f311e - i3);
    }

    public final String f(char c2) {
        char[] cArr;
        int i3;
        b();
        int i10 = this.f311e;
        while (true) {
            int i11 = this.f310c;
            cArr = this.f308a;
            if (i10 < i11) {
                if (c2 == cArr[i10]) {
                    i3 = i10 - this.f311e;
                    break;
                }
                i10++;
            } else {
                i3 = -1;
                break;
            }
        }
        String[] strArr = this.h;
        if (i3 != -1) {
            String c10 = c(cArr, strArr, this.f311e, i3);
            this.f311e += i3;
            return c10;
        }
        b();
        int i12 = this.f311e;
        String c11 = c(cArr, strArr, i12, this.f310c - i12);
        this.f311e = this.f310c;
        return c11;
    }

    public final String g(char... cArr) {
        char[] cArr2;
        b();
        int i3 = this.f311e;
        int i10 = this.f310c;
        loop0: while (true) {
            int i11 = this.f311e;
            cArr2 = this.f308a;
            if (i11 >= i10) {
                break;
            }
            for (char c2 : cArr) {
                if (cArr2[this.f311e] == c2) {
                    break loop0;
                }
            }
            this.f311e++;
        }
        int i12 = this.f311e;
        if (i12 > i3) {
            return c(cArr2, this.h, i3, i12 - i3);
        }
        return "";
    }

    public final String h(char... cArr) {
        char[] cArr2;
        b();
        int i3 = this.f311e;
        int i10 = this.f310c;
        while (true) {
            int i11 = this.f311e;
            cArr2 = this.f308a;
            if (i11 >= i10 || Arrays.binarySearch(cArr, cArr2[i11]) >= 0) {
                break;
            }
            this.f311e++;
        }
        int i12 = this.f311e;
        if (i12 > i3) {
            return c(cArr2, this.h, i3, i12 - i3);
        }
        return "";
    }

    public final char i() {
        b();
        int i3 = this.f311e;
        if (i3 >= this.f310c) {
            return (char) 65535;
        }
        return this.f308a[i3];
    }

    public final boolean j() {
        b();
        if (this.f311e >= this.f310c) {
            return true;
        }
        return false;
    }

    public final boolean k(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.f310c - this.f311e) {
            for (int i3 = 0; i3 < length; i3++) {
                if (str.charAt(i3) == this.f308a[this.f311e + i3]) {
                }
            }
            this.f311e = str.length() + this.f311e;
            return true;
        }
        return false;
    }

    public final boolean l(String str) {
        b();
        int length = str.length();
        if (length <= this.f310c - this.f311e) {
            for (int i3 = 0; i3 < length; i3++) {
                if (Character.toUpperCase(str.charAt(i3)) == Character.toUpperCase(this.f308a[this.f311e + i3])) {
                }
            }
            this.f311e = str.length() + this.f311e;
            return true;
        }
        return false;
    }

    public final boolean m(char c2) {
        if (!j() && this.f308a[this.f311e] == c2) {
            return true;
        }
        return false;
    }

    public final boolean n(char... cArr) {
        if (!j()) {
            b();
            char c2 = this.f308a[this.f311e];
            for (char c10 : cArr) {
                if (c10 == c2) {
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
        char c2 = this.f308a[this.f311e];
        if (c2 < 'A' || c2 > 'Z') {
            if ((c2 < 'a' || c2 > 'z') && !Character.isLetter(c2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int p(String str) {
        b();
        char charAt = str.charAt(0);
        int i3 = this.f311e;
        while (i3 < this.f310c) {
            char[] cArr = this.f308a;
            if (charAt != cArr[i3]) {
                do {
                    i3++;
                    if (i3 >= this.f310c) {
                        break;
                    }
                } while (charAt != cArr[i3]);
            }
            int i10 = i3 + 1;
            int length = (str.length() + i10) - 1;
            int i11 = this.f310c;
            if (i3 < i11 && length <= i11) {
                int i12 = i10;
                for (int i13 = 1; i12 < length && str.charAt(i13) == cArr[i12]; i13++) {
                    i12++;
                }
                if (i12 == length) {
                    return i3 - this.f311e;
                }
            }
            i3 = i10;
        }
        return -1;
    }

    public final void q() {
        this.f311e--;
    }

    public final String toString() {
        int i3 = this.f311e;
        return new String(this.f308a, i3, this.f310c - i3);
    }
}

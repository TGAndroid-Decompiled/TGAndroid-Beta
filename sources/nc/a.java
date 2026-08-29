package nc;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
public final class a {
    public final char[] f17231a;
    public final StringReader f17232b;
    public int f17233c;
    public int d;
    public int f17234e;
    public int f17235f;
    public int f17236g;
    public final String[] h;

    public a(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.h = new String[128];
        if (stringReader.markSupported()) {
            this.f17232b = stringReader;
            this.f17231a = new char[4096];
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
        this.f17234e++;
    }

    public final void b() {
        StringReader stringReader = this.f17232b;
        int i10 = this.f17234e;
        if (i10 >= this.d) {
            try {
                stringReader.skip(i10);
                stringReader.mark(4096);
                int read = stringReader.read(this.f17231a);
                stringReader.reset();
                if (read != -1) {
                    this.f17233c = read;
                    this.f17235f += this.f17234e;
                    this.f17234e = 0;
                    this.f17236g = 0;
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
        char c3;
        b();
        int i10 = this.f17234e;
        if (i10 >= this.f17233c) {
            c3 = 65535;
        } else {
            c3 = this.f17231a[i10];
        }
        this.f17234e = i10 + 1;
        return c3;
    }

    public final String e() {
        char[] cArr;
        char c3;
        b();
        int i10 = this.f17234e;
        while (true) {
            int i11 = this.f17234e;
            int i12 = this.f17233c;
            cArr = this.f17231a;
            if (i11 >= i12 || (((c3 = cArr[i11]) < 'A' || c3 > 'Z') && ((c3 < 'a' || c3 > 'z') && !Character.isLetter(c3)))) {
                break;
            }
            this.f17234e++;
        }
        return c(cArr, this.h, i10, this.f17234e - i10);
    }

    public final String f(char c3) {
        char[] cArr;
        int i10;
        b();
        int i11 = this.f17234e;
        while (true) {
            int i12 = this.f17233c;
            cArr = this.f17231a;
            if (i11 < i12) {
                if (c3 == cArr[i11]) {
                    i10 = i11 - this.f17234e;
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
            String c6 = c(cArr, strArr, this.f17234e, i10);
            this.f17234e += i10;
            return c6;
        }
        b();
        int i13 = this.f17234e;
        String c10 = c(cArr, strArr, i13, this.f17233c - i13);
        this.f17234e = this.f17233c;
        return c10;
    }

    public final String g(char... cArr) {
        char[] cArr2;
        b();
        int i10 = this.f17234e;
        int i11 = this.f17233c;
        loop0: while (true) {
            int i12 = this.f17234e;
            cArr2 = this.f17231a;
            if (i12 >= i11) {
                break;
            }
            for (char c3 : cArr) {
                if (cArr2[this.f17234e] == c3) {
                    break loop0;
                }
            }
            this.f17234e++;
        }
        int i13 = this.f17234e;
        if (i13 > i10) {
            return c(cArr2, this.h, i10, i13 - i10);
        }
        return "";
    }

    public final String h(char... cArr) {
        char[] cArr2;
        b();
        int i10 = this.f17234e;
        int i11 = this.f17233c;
        while (true) {
            int i12 = this.f17234e;
            cArr2 = this.f17231a;
            if (i12 >= i11 || Arrays.binarySearch(cArr, cArr2[i12]) >= 0) {
                break;
            }
            this.f17234e++;
        }
        int i13 = this.f17234e;
        if (i13 > i10) {
            return c(cArr2, this.h, i10, i13 - i10);
        }
        return "";
    }

    public final char i() {
        b();
        int i10 = this.f17234e;
        if (i10 >= this.f17233c) {
            return (char) 65535;
        }
        return this.f17231a[i10];
    }

    public final boolean j() {
        b();
        if (this.f17234e >= this.f17233c) {
            return true;
        }
        return false;
    }

    public final boolean k(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.f17233c - this.f17234e) {
            for (int i10 = 0; i10 < length; i10++) {
                if (str.charAt(i10) == this.f17231a[this.f17234e + i10]) {
                }
            }
            this.f17234e = str.length() + this.f17234e;
            return true;
        }
        return false;
    }

    public final boolean l(String str) {
        b();
        int length = str.length();
        if (length <= this.f17233c - this.f17234e) {
            for (int i10 = 0; i10 < length; i10++) {
                if (Character.toUpperCase(str.charAt(i10)) == Character.toUpperCase(this.f17231a[this.f17234e + i10])) {
                }
            }
            this.f17234e = str.length() + this.f17234e;
            return true;
        }
        return false;
    }

    public final boolean m(char c3) {
        if (!j() && this.f17231a[this.f17234e] == c3) {
            return true;
        }
        return false;
    }

    public final boolean n(char... cArr) {
        if (!j()) {
            b();
            char c3 = this.f17231a[this.f17234e];
            for (char c6 : cArr) {
                if (c6 == c3) {
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
        char c3 = this.f17231a[this.f17234e];
        if (c3 < 'A' || c3 > 'Z') {
            if ((c3 < 'a' || c3 > 'z') && !Character.isLetter(c3)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int p(String str) {
        b();
        char charAt = str.charAt(0);
        int i10 = this.f17234e;
        while (i10 < this.f17233c) {
            char[] cArr = this.f17231a;
            if (charAt != cArr[i10]) {
                do {
                    i10++;
                    if (i10 >= this.f17233c) {
                        break;
                    }
                } while (charAt != cArr[i10]);
            }
            int i11 = i10 + 1;
            int length = (str.length() + i11) - 1;
            int i12 = this.f17233c;
            if (i10 < i12 && length <= i12) {
                int i13 = i11;
                for (int i14 = 1; i13 < length && str.charAt(i14) == cArr[i13]; i14++) {
                    i13++;
                }
                if (i13 == length) {
                    return i10 - this.f17234e;
                }
            }
            i10 = i11;
        }
        return -1;
    }

    public final void q() {
        this.f17234e--;
    }

    public final String toString() {
        int i10 = this.f17234e;
        return new String(this.f17231a, i10, this.f17233c - i10);
    }
}

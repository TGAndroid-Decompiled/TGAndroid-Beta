package mc;

import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;

public final class a {

    public final char[] f17948a;

    public final StringReader f17949b;

    public int f17950c;
    public int d;

    public int f17951e;

    public int f17952f;

    public int f17953g;
    public final String[] h;

    public a(String str) {
        StringReader stringReader = new StringReader(str);
        str.getClass();
        this.h = new String[128];
        if (!stringReader.markSupported()) {
            throw new IllegalArgumentException("Must be true");
        }
        this.f17949b = stringReader;
        this.f17948a = new char[4096];
        b();
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
                if (i17 == 0) {
                    return str;
                }
                int i19 = i16 + 1;
                int i20 = i12 + 1;
                if (cArr[i16] == str.charAt(i12)) {
                    i16 = i19;
                    i17 = i18;
                    i12 = i20;
                }
            }
        }
        String str3 = new String(cArr, i10, i11);
        strArr[length] = str3;
        return str3;
    }

    public final void a() {
        this.f17951e++;
    }

    public final void b() {
        StringReader stringReader = this.f17949b;
        int i10 = this.f17951e;
        if (i10 < this.d) {
            return;
        }
        try {
            stringReader.skip(i10);
            stringReader.mark(4096);
            int i11 = stringReader.read(this.f17948a);
            stringReader.reset();
            if (i11 != -1) {
                this.f17950c = i11;
                this.f17952f += this.f17951e;
                this.f17951e = 0;
                this.f17953g = 0;
                if (i11 > 3072) {
                    i11 = 3072;
                }
                this.d = i11;
            }
        } catch (IOException e9) {
            throw new a7.c(e9);
        }
    }

    public final char d() {
        b();
        int i10 = this.f17951e;
        char c10 = i10 >= this.f17950c ? (char) 65535 : this.f17948a[i10];
        this.f17951e = i10 + 1;
        return c10;
    }

    public final String e() {
        char[] cArr;
        char c10;
        b();
        int i10 = this.f17951e;
        while (true) {
            int i11 = this.f17951e;
            int i12 = this.f17950c;
            cArr = this.f17948a;
            if (i11 >= i12 || (((c10 = cArr[i11]) < 'A' || c10 > 'Z') && ((c10 < 'a' || c10 > 'z') && !Character.isLetter(c10)))) {
                break;
            }
            this.f17951e++;
        }
        return c(cArr, this.h, i10, this.f17951e - i10);
    }

    public final String f(char c10) {
        char[] cArr;
        int i10;
        b();
        int i11 = this.f17951e;
        while (true) {
            int i12 = this.f17950c;
            cArr = this.f17948a;
            if (i11 >= i12) {
                i10 = -1;
                break;
            }
            if (c10 == cArr[i11]) {
                i10 = i11 - this.f17951e;
                break;
            }
            i11++;
        }
        String[] strArr = this.h;
        if (i10 != -1) {
            String strC = c(cArr, strArr, this.f17951e, i10);
            this.f17951e += i10;
            return strC;
        }
        b();
        int i13 = this.f17951e;
        String strC2 = c(cArr, strArr, i13, this.f17950c - i13);
        this.f17951e = this.f17950c;
        return strC2;
    }

    public final String g(char... cArr) {
        char[] cArr2;
        b();
        int i10 = this.f17951e;
        int i11 = this.f17950c;
        loop0: while (true) {
            int i12 = this.f17951e;
            cArr2 = this.f17948a;
            if (i12 >= i11) {
                break;
            }
            for (char c10 : cArr) {
                if (cArr2[this.f17951e] == c10) {
                    break loop0;
                }
            }
            this.f17951e++;
        }
        int i13 = this.f17951e;
        return i13 > i10 ? c(cArr2, this.h, i10, i13 - i10) : "";
    }

    public final String h(char... cArr) {
        char[] cArr2;
        b();
        int i10 = this.f17951e;
        int i11 = this.f17950c;
        while (true) {
            int i12 = this.f17951e;
            cArr2 = this.f17948a;
            if (i12 >= i11 || Arrays.binarySearch(cArr, cArr2[i12]) >= 0) {
                break;
            }
            this.f17951e++;
        }
        int i13 = this.f17951e;
        return i13 > i10 ? c(cArr2, this.h, i10, i13 - i10) : "";
    }

    public final char i() {
        b();
        int i10 = this.f17951e;
        if (i10 >= this.f17950c) {
            return (char) 65535;
        }
        return this.f17948a[i10];
    }

    public final boolean j() {
        b();
        return this.f17951e >= this.f17950c;
    }

    public final boolean k(String str) {
        b();
        b();
        int length = str.length();
        if (length <= this.f17950c - this.f17951e) {
            for (int i10 = 0; i10 < length; i10++) {
                if (str.charAt(i10) == this.f17948a[this.f17951e + i10]) {
                }
            }
            this.f17951e = str.length() + this.f17951e;
            return true;
        }
        return false;
    }

    public final boolean l(String str) {
        b();
        int length = str.length();
        if (length <= this.f17950c - this.f17951e) {
            for (int i10 = 0; i10 < length; i10++) {
                if (Character.toUpperCase(str.charAt(i10)) == Character.toUpperCase(this.f17948a[this.f17951e + i10])) {
                }
            }
            this.f17951e = str.length() + this.f17951e;
            return true;
        }
        return false;
    }

    public final boolean m(char c10) {
        return !j() && this.f17948a[this.f17951e] == c10;
    }

    public final boolean n(char... cArr) {
        if (!j()) {
            b();
            char c10 = this.f17948a[this.f17951e];
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
        char c10 = this.f17948a[this.f17951e];
        if (c10 < 'A' || c10 > 'Z') {
            return (c10 >= 'a' && c10 <= 'z') || Character.isLetter(c10);
        }
        return true;
    }

    public final int p(String str) {
        b();
        char cCharAt = str.charAt(0);
        int i10 = this.f17951e;
        while (i10 < this.f17950c) {
            char[] cArr = this.f17948a;
            if (cCharAt != cArr[i10]) {
                do {
                    i10++;
                    if (i10 >= this.f17950c) {
                        break;
                    }
                } while (cCharAt != cArr[i10]);
            }
            int i11 = i10 + 1;
            int length = (str.length() + i11) - 1;
            int i12 = this.f17950c;
            if (i10 < i12 && length <= i12) {
                int i13 = i11;
                for (int i14 = 1; i13 < length && str.charAt(i14) == cArr[i13]; i14++) {
                    i13++;
                }
                if (i13 == length) {
                    return i10 - this.f17951e;
                }
            }
            i10 = i11;
        }
        return -1;
    }

    public final void q() {
        this.f17951e--;
    }

    public final String toString() {
        int i10 = this.f17951e;
        return new String(this.f17948a, i10, this.f17950c - i10);
    }
}

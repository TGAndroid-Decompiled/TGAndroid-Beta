package mc;

import java.util.Locale;

public abstract class j extends k {

    public String f17994c;
    public String d;

    public String f17995e;

    public final StringBuilder f17996f;

    public String f17997g;
    public boolean h;

    public boolean f17998i;

    public boolean f17999j;

    public lc.b f18000k;

    public j(int i10) {
        super(i10, 0);
        this.f17996f = new StringBuilder();
        this.h = false;
        this.f17998i = false;
        this.f17999j = false;
    }

    public final void e(char c10) {
        String strValueOf = String.valueOf(c10);
        String str = this.f17995e;
        if (str != null) {
            strValueOf = str.concat(strValueOf);
        }
        this.f17995e = strValueOf;
    }

    public final void f(char c10) {
        this.f17998i = true;
        String str = this.f17997g;
        StringBuilder sb2 = this.f17996f;
        if (str != null) {
            sb2.append(str);
            this.f17997g = null;
        }
        sb2.append(c10);
    }

    public final void g(String str) {
        this.f17998i = true;
        String str2 = this.f17997g;
        StringBuilder sb2 = this.f17996f;
        if (str2 != null) {
            sb2.append(str2);
            this.f17997g = null;
        }
        if (sb2.length() == 0) {
            this.f17997g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void h(int[] iArr) {
        this.f17998i = true;
        String str = this.f17997g;
        StringBuilder sb2 = this.f17996f;
        if (str != null) {
            sb2.append(str);
            this.f17997g = null;
        }
        for (int i10 : iArr) {
            sb2.appendCodePoint(i10);
        }
    }

    public final void i(String str) {
        String str2 = this.f17994c;
        if (str2 != null) {
            str = str2.concat(str);
        }
        this.f17994c = str;
        this.d = str != null ? str.toLowerCase(Locale.ENGLISH) : "";
    }

    public final String j() {
        String str = this.f17994c;
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("Must be false");
        }
        return this.f17994c;
    }

    public final void k() {
        String string;
        if (this.f18000k == null) {
            this.f18000k = new lc.b();
        }
        String str = this.f17995e;
        StringBuilder sb2 = this.f17996f;
        if (str != null) {
            String strTrim = str.trim();
            this.f17995e = strTrim;
            if (strTrim.length() > 0) {
                if (this.f17998i) {
                    string = sb2.length() > 0 ? sb2.toString() : this.f17997g;
                } else {
                    string = this.h ? "" : null;
                }
                lc.b bVar = this.f18000k;
                String str2 = this.f17995e;
                int i10 = bVar.i(str2);
                if (i10 != -1) {
                    bVar.f15536c[i10] = string;
                } else {
                    int i11 = bVar.f15534a;
                    int i12 = i11 + 1;
                    if (i12 < i11) {
                        throw new IllegalArgumentException("Must be true");
                    }
                    String[] strArr = bVar.f15535b;
                    int length = strArr.length;
                    if (length < i12) {
                        int i13 = length >= 4 ? i11 * 2 : 4;
                        if (i12 <= i13) {
                            i12 = i13;
                        }
                        String[] strArr2 = new String[i12];
                        System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i12));
                        bVar.f15535b = strArr2;
                        String[] strArr3 = bVar.f15536c;
                        String[] strArr4 = new String[i12];
                        System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i12));
                        bVar.f15536c = strArr4;
                    }
                    String[] strArr5 = bVar.f15535b;
                    int i14 = bVar.f15534a;
                    strArr5[i14] = str2;
                    bVar.f15536c[i14] = string;
                    bVar.f15534a = i14 + 1;
                }
            }
        }
        this.f17995e = null;
        this.h = false;
        this.f17998i = false;
        k.d(sb2);
        this.f17997g = null;
    }

    @Override
    public j c() {
        this.f17994c = null;
        this.d = null;
        this.f17995e = null;
        k.d(this.f17996f);
        this.f17997g = null;
        this.h = false;
        this.f17998i = false;
        this.f17999j = false;
        this.f18000k = null;
        return this;
    }
}

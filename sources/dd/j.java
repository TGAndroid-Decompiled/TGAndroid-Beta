package dd;

import java.util.Locale;
public abstract class j extends k {
    public String f6793c;
    public String d;
    public String f6794e;
    public final StringBuilder f6795f;
    public String f6796g;
    public boolean h;
    public boolean f6797i;
    public boolean f6798j;
    public cd.c f6799k;

    public j(int i10) {
        super(i10, 0);
        this.f6795f = new StringBuilder();
        this.h = false;
        this.f6797i = false;
        this.f6798j = false;
    }

    public final void d(char c10) {
        String valueOf = String.valueOf(c10);
        String str = this.f6794e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.f6794e = valueOf;
    }

    public final void e(char c10) {
        this.f6797i = true;
        String str = this.f6796g;
        StringBuilder sb2 = this.f6795f;
        if (str != null) {
            sb2.append(str);
            this.f6796g = null;
        }
        sb2.append(c10);
    }

    public final void f(String str) {
        this.f6797i = true;
        String str2 = this.f6796g;
        StringBuilder sb2 = this.f6795f;
        if (str2 != null) {
            sb2.append(str2);
            this.f6796g = null;
        }
        if (sb2.length() == 0) {
            this.f6796g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void g(int[] iArr) {
        this.f6797i = true;
        String str = this.f6796g;
        StringBuilder sb2 = this.f6795f;
        if (str != null) {
            sb2.append(str);
            this.f6796g = null;
        }
        for (int i10 : iArr) {
            sb2.appendCodePoint(i10);
        }
    }

    public final void h(String str) {
        String str2;
        String str3 = this.f6793c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f6793c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String i() {
        String str = this.f6793c;
        if (str != null && str.length() != 0) {
            return this.f6793c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void j() {
        String str;
        if (this.f6799k == null) {
            this.f6799k = new cd.c();
        }
        String str2 = this.f6794e;
        StringBuilder sb2 = this.f6795f;
        if (str2 != null) {
            String trim = str2.trim();
            this.f6794e = trim;
            if (trim.length() > 0) {
                if (this.f6797i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f6796g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                cd.c cVar = this.f6799k;
                String str3 = this.f6794e;
                int i10 = cVar.i(str3);
                if (i10 != -1) {
                    cVar.f4784c[i10] = str;
                } else {
                    int i11 = cVar.f4782a;
                    int i12 = i11 + 1;
                    if (i12 >= i11) {
                        String[] strArr = cVar.f4783b;
                        int length = strArr.length;
                        if (length < i12) {
                            int i13 = 4;
                            if (length >= 4) {
                                i13 = i11 * 2;
                            }
                            if (i12 <= i13) {
                                i12 = i13;
                            }
                            String[] strArr2 = new String[i12];
                            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i12));
                            cVar.f4783b = strArr2;
                            String[] strArr3 = cVar.f4784c;
                            String[] strArr4 = new String[i12];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i12));
                            cVar.f4784c = strArr4;
                        }
                        String[] strArr5 = cVar.f4783b;
                        int i14 = cVar.f4782a;
                        strArr5[i14] = str3;
                        cVar.f4784c[i14] = str;
                        cVar.f4782a = i14 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.f6794e = null;
        this.h = false;
        this.f6797i = false;
        k.c(sb2);
        this.f6796g = null;
    }

    @Override
    public j b() {
        this.f6793c = null;
        this.d = null;
        this.f6794e = null;
        k.c(this.f6795f);
        this.f6796g = null;
        this.h = false;
        this.f6797i = false;
        this.f6798j = false;
        this.f6799k = null;
        return this;
    }
}

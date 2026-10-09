package ed;

import java.util.Locale;
public abstract class j extends k {
    public String f8873c;
    public String d;
    public String f8874e;
    public final StringBuilder f8875f;
    public String f8876g;
    public boolean h;
    public boolean f8877i;
    public boolean f8878j;
    public dd.c f8879k;

    public j(int i10) {
        super(i10, 0);
        this.f8875f = new StringBuilder();
        this.h = false;
        this.f8877i = false;
        this.f8878j = false;
    }

    public final void d(char c10) {
        String valueOf = String.valueOf(c10);
        String str = this.f8874e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.f8874e = valueOf;
    }

    public final void e(char c10) {
        this.f8877i = true;
        String str = this.f8876g;
        StringBuilder sb2 = this.f8875f;
        if (str != null) {
            sb2.append(str);
            this.f8876g = null;
        }
        sb2.append(c10);
    }

    public final void f(String str) {
        this.f8877i = true;
        String str2 = this.f8876g;
        StringBuilder sb2 = this.f8875f;
        if (str2 != null) {
            sb2.append(str2);
            this.f8876g = null;
        }
        if (sb2.length() == 0) {
            this.f8876g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void g(int[] iArr) {
        this.f8877i = true;
        String str = this.f8876g;
        StringBuilder sb2 = this.f8875f;
        if (str != null) {
            sb2.append(str);
            this.f8876g = null;
        }
        for (int i10 : iArr) {
            sb2.appendCodePoint(i10);
        }
    }

    public final void h(String str) {
        String str2;
        String str3 = this.f8873c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f8873c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String i() {
        String str = this.f8873c;
        if (str != null && str.length() != 0) {
            return this.f8873c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void j() {
        String str;
        if (this.f8879k == null) {
            this.f8879k = new dd.c();
        }
        String str2 = this.f8874e;
        StringBuilder sb2 = this.f8875f;
        if (str2 != null) {
            String trim = str2.trim();
            this.f8874e = trim;
            if (trim.length() > 0) {
                if (this.f8877i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f8876g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                dd.c cVar = this.f8879k;
                String str3 = this.f8874e;
                int i10 = cVar.i(str3);
                if (i10 != -1) {
                    cVar.f8309c[i10] = str;
                } else {
                    int i11 = cVar.f8307a;
                    int i12 = i11 + 1;
                    if (i12 >= i11) {
                        String[] strArr = cVar.f8308b;
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
                            cVar.f8308b = strArr2;
                            String[] strArr3 = cVar.f8309c;
                            String[] strArr4 = new String[i12];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i12));
                            cVar.f8309c = strArr4;
                        }
                        String[] strArr5 = cVar.f8308b;
                        int i14 = cVar.f8307a;
                        strArr5[i14] = str3;
                        cVar.f8309c[i14] = str;
                        cVar.f8307a = i14 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.f8874e = null;
        this.h = false;
        this.f8877i = false;
        k.c(sb2);
        this.f8876g = null;
    }

    @Override
    public j b() {
        this.f8873c = null;
        this.d = null;
        this.f8874e = null;
        k.c(this.f8875f);
        this.f8876g = null;
        this.h = false;
        this.f8877i = false;
        this.f8878j = false;
        this.f8879k = null;
        return this;
    }
}

package dd;

import java.util.Locale;
public abstract class j extends k {
    public String f8305c;
    public String d;
    public String f8306e;
    public final StringBuilder f8307f;
    public String f8308g;
    public boolean h;
    public boolean f8309i;
    public boolean f8310j;
    public cd.c f8311k;

    public j(int i7) {
        super(i7, 0);
        this.f8307f = new StringBuilder();
        this.h = false;
        this.f8309i = false;
        this.f8310j = false;
    }

    public final void d(char c10) {
        String valueOf = String.valueOf(c10);
        String str = this.f8306e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.f8306e = valueOf;
    }

    public final void e(char c10) {
        this.f8309i = true;
        String str = this.f8308g;
        StringBuilder sb2 = this.f8307f;
        if (str != null) {
            sb2.append(str);
            this.f8308g = null;
        }
        sb2.append(c10);
    }

    public final void f(String str) {
        this.f8309i = true;
        String str2 = this.f8308g;
        StringBuilder sb2 = this.f8307f;
        if (str2 != null) {
            sb2.append(str2);
            this.f8308g = null;
        }
        if (sb2.length() == 0) {
            this.f8308g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void g(int[] iArr) {
        this.f8309i = true;
        String str = this.f8308g;
        StringBuilder sb2 = this.f8307f;
        if (str != null) {
            sb2.append(str);
            this.f8308g = null;
        }
        for (int i7 : iArr) {
            sb2.appendCodePoint(i7);
        }
    }

    public final void h(String str) {
        String str2;
        String str3 = this.f8305c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f8305c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String i() {
        String str = this.f8305c;
        if (str != null && str.length() != 0) {
            return this.f8305c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void j() {
        String str;
        if (this.f8311k == null) {
            this.f8311k = new cd.c();
        }
        String str2 = this.f8306e;
        StringBuilder sb2 = this.f8307f;
        if (str2 != null) {
            String trim = str2.trim();
            this.f8306e = trim;
            if (trim.length() > 0) {
                if (this.f8309i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f8308g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                cd.c cVar = this.f8311k;
                String str3 = this.f8306e;
                int f10 = cVar.f(str3);
                if (f10 != -1) {
                    cVar.f5191c[f10] = str;
                } else {
                    int i7 = cVar.f5189a;
                    int i10 = i7 + 1;
                    if (i10 >= i7) {
                        String[] strArr = cVar.f5190b;
                        int length = strArr.length;
                        if (length < i10) {
                            int i11 = 4;
                            if (length >= 4) {
                                i11 = i7 * 2;
                            }
                            if (i10 <= i11) {
                                i10 = i11;
                            }
                            String[] strArr2 = new String[i10];
                            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
                            cVar.f5190b = strArr2;
                            String[] strArr3 = cVar.f5191c;
                            String[] strArr4 = new String[i10];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
                            cVar.f5191c = strArr4;
                        }
                        String[] strArr5 = cVar.f5190b;
                        int i12 = cVar.f5189a;
                        strArr5[i12] = str3;
                        cVar.f5191c[i12] = str;
                        cVar.f5189a = i12 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.f8306e = null;
        this.h = false;
        this.f8309i = false;
        k.c(sb2);
        this.f8308g = null;
    }

    @Override
    public j b() {
        this.f8305c = null;
        this.d = null;
        this.f8306e = null;
        k.c(this.f8307f);
        this.f8308g = null;
        this.h = false;
        this.f8309i = false;
        this.f8310j = false;
        this.f8311k = null;
        return this;
    }
}

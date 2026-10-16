package fd;

import java.util.Locale;
public abstract class j extends f2.e {
    public String f9117c;
    public String d;
    public String e;
    public final StringBuilder f9118f;
    public String f9119g;
    public boolean h;
    public boolean f9120i;
    public boolean f9121j;
    public ed.c f9122k;

    public j(int i10) {
        super(i10, 1);
        this.f9118f = new StringBuilder();
        this.h = false;
        this.f9120i = false;
        this.f9121j = false;
    }

    public final void d(char c10) {
        String valueOf = String.valueOf(c10);
        String str = this.e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.e = valueOf;
    }

    public final void e(char c10) {
        this.f9120i = true;
        String str = this.f9119g;
        StringBuilder sb2 = this.f9118f;
        if (str != null) {
            sb2.append(str);
            this.f9119g = null;
        }
        sb2.append(c10);
    }

    public final void f(String str) {
        this.f9120i = true;
        String str2 = this.f9119g;
        StringBuilder sb2 = this.f9118f;
        if (str2 != null) {
            sb2.append(str2);
            this.f9119g = null;
        }
        if (sb2.length() == 0) {
            this.f9119g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void g(int[] iArr) {
        this.f9120i = true;
        String str = this.f9119g;
        StringBuilder sb2 = this.f9118f;
        if (str != null) {
            sb2.append(str);
            this.f9119g = null;
        }
        for (int i10 : iArr) {
            sb2.appendCodePoint(i10);
        }
    }

    public final void h(String str) {
        String str2;
        String str3 = this.f9117c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f9117c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String i() {
        String str = this.f9117c;
        if (str != null && str.length() != 0) {
            return this.f9117c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void j() {
        String str;
        if (this.f9122k == null) {
            this.f9122k = new ed.c();
        }
        String str2 = this.e;
        StringBuilder sb2 = this.f9118f;
        if (str2 != null) {
            String trim = str2.trim();
            this.e = trim;
            if (trim.length() > 0) {
                if (this.f9120i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f9119g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                ed.c cVar = this.f9122k;
                String str3 = this.e;
                int h = cVar.h(str3);
                if (h != -1) {
                    cVar.f8732c[h] = str;
                } else {
                    int i10 = cVar.f8730a;
                    int i11 = i10 + 1;
                    if (i11 >= i10) {
                        String[] strArr = cVar.f8731b;
                        int length = strArr.length;
                        if (length < i11) {
                            int i12 = 4;
                            if (length >= 4) {
                                i12 = i10 * 2;
                            }
                            if (i11 <= i12) {
                                i11 = i12;
                            }
                            String[] strArr2 = new String[i11];
                            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i11));
                            cVar.f8731b = strArr2;
                            String[] strArr3 = cVar.f8732c;
                            String[] strArr4 = new String[i11];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
                            cVar.f8732c = strArr4;
                        }
                        String[] strArr5 = cVar.f8731b;
                        int i13 = cVar.f8730a;
                        strArr5[i13] = str3;
                        cVar.f8732c[i13] = str;
                        cVar.f8730a = i13 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.e = null;
        this.h = false;
        this.f9120i = false;
        f2.e.c(sb2);
        this.f9119g = null;
    }

    @Override
    public j b() {
        this.f9117c = null;
        this.d = null;
        this.e = null;
        f2.e.c(this.f9118f);
        this.f9119g = null;
        this.h = false;
        this.f9120i = false;
        this.f9121j = false;
        this.f9122k = null;
        return this;
    }
}

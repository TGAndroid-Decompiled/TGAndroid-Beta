package dd;

import java.util.Locale;
public abstract class j extends k {
    public String f7687c;
    public String d;
    public String e;
    public final StringBuilder f7688f;
    public String f7689g;
    public boolean h;
    public boolean f7690i;
    public boolean f7691j;
    public cd.c f7692k;

    public j(int i10) {
        super(i10, 0);
        this.f7688f = new StringBuilder();
        this.h = false;
        this.f7690i = false;
        this.f7691j = false;
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
        this.f7690i = true;
        String str = this.f7689g;
        StringBuilder sb2 = this.f7688f;
        if (str != null) {
            sb2.append(str);
            this.f7689g = null;
        }
        sb2.append(c10);
    }

    public final void f(String str) {
        this.f7690i = true;
        String str2 = this.f7689g;
        StringBuilder sb2 = this.f7688f;
        if (str2 != null) {
            sb2.append(str2);
            this.f7689g = null;
        }
        if (sb2.length() == 0) {
            this.f7689g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void g(int[] iArr) {
        this.f7690i = true;
        String str = this.f7689g;
        StringBuilder sb2 = this.f7688f;
        if (str != null) {
            sb2.append(str);
            this.f7689g = null;
        }
        for (int i10 : iArr) {
            sb2.appendCodePoint(i10);
        }
    }

    public final void h(String str) {
        String str2;
        String str3 = this.f7687c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f7687c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String i() {
        String str = this.f7687c;
        if (str != null && str.length() != 0) {
            return this.f7687c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void j() {
        String str;
        if (this.f7692k == null) {
            this.f7692k = new cd.c();
        }
        String str2 = this.e;
        StringBuilder sb2 = this.f7688f;
        if (str2 != null) {
            String trim = str2.trim();
            this.e = trim;
            if (trim.length() > 0) {
                if (this.f7690i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f7689g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                cd.c cVar = this.f7692k;
                String str3 = this.e;
                int i10 = cVar.i(str3);
                if (i10 != -1) {
                    cVar.f4226c[i10] = str;
                } else {
                    int i11 = cVar.f4224a;
                    int i12 = i11 + 1;
                    if (i12 >= i11) {
                        String[] strArr = cVar.f4225b;
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
                            cVar.f4225b = strArr2;
                            String[] strArr3 = cVar.f4226c;
                            String[] strArr4 = new String[i12];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i12));
                            cVar.f4226c = strArr4;
                        }
                        String[] strArr5 = cVar.f4225b;
                        int i14 = cVar.f4224a;
                        strArr5[i14] = str3;
                        cVar.f4226c[i14] = str;
                        cVar.f4224a = i14 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.e = null;
        this.h = false;
        this.f7690i = false;
        k.c(sb2);
        this.f7689g = null;
    }

    @Override
    public j b() {
        this.f7687c = null;
        this.d = null;
        this.e = null;
        k.c(this.f7688f);
        this.f7689g = null;
        this.h = false;
        this.f7690i = false;
        this.f7691j = false;
        this.f7692k = null;
        return this;
    }
}

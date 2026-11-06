package dd;

import java.util.Locale;
public abstract class j extends k {
    public String f8642c;
    public String d;
    public String f8643e;
    public final StringBuilder f8644f;
    public String f8645g;
    public boolean h;
    public boolean f8646i;
    public boolean f8647j;
    public cd.c f8648k;

    public j(int i7) {
        super(i7, 0);
        this.f8644f = new StringBuilder();
        this.h = false;
        this.f8646i = false;
        this.f8647j = false;
    }

    public final void d(char c10) {
        String valueOf = String.valueOf(c10);
        String str = this.f8643e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.f8643e = valueOf;
    }

    public final void e(char c10) {
        this.f8646i = true;
        String str = this.f8645g;
        StringBuilder sb2 = this.f8644f;
        if (str != null) {
            sb2.append(str);
            this.f8645g = null;
        }
        sb2.append(c10);
    }

    public final void f(String str) {
        this.f8646i = true;
        String str2 = this.f8645g;
        StringBuilder sb2 = this.f8644f;
        if (str2 != null) {
            sb2.append(str2);
            this.f8645g = null;
        }
        if (sb2.length() == 0) {
            this.f8645g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void g(int[] iArr) {
        this.f8646i = true;
        String str = this.f8645g;
        StringBuilder sb2 = this.f8644f;
        if (str != null) {
            sb2.append(str);
            this.f8645g = null;
        }
        for (int i7 : iArr) {
            sb2.appendCodePoint(i7);
        }
    }

    public final void h(String str) {
        String str2;
        String str3 = this.f8642c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f8642c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String i() {
        String str = this.f8642c;
        if (str != null && str.length() != 0) {
            return this.f8642c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void j() {
        String str;
        if (this.f8648k == null) {
            this.f8648k = new cd.c();
        }
        String str2 = this.f8643e;
        StringBuilder sb2 = this.f8644f;
        if (str2 != null) {
            String trim = str2.trim();
            this.f8643e = trim;
            if (trim.length() > 0) {
                if (this.f8646i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f8645g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                cd.c cVar = this.f8648k;
                String str3 = this.f8643e;
                int f10 = cVar.f(str3);
                if (f10 != -1) {
                    cVar.f6085c[f10] = str;
                } else {
                    int i7 = cVar.f6083a;
                    int i10 = i7 + 1;
                    if (i10 >= i7) {
                        String[] strArr = cVar.f6084b;
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
                            cVar.f6084b = strArr2;
                            String[] strArr3 = cVar.f6085c;
                            String[] strArr4 = new String[i10];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
                            cVar.f6085c = strArr4;
                        }
                        String[] strArr5 = cVar.f6084b;
                        int i12 = cVar.f6083a;
                        strArr5[i12] = str3;
                        cVar.f6085c[i12] = str;
                        cVar.f6083a = i12 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.f8643e = null;
        this.h = false;
        this.f8646i = false;
        k.c(sb2);
        this.f8645g = null;
    }

    @Override
    public j b() {
        this.f8642c = null;
        this.d = null;
        this.f8643e = null;
        k.c(this.f8644f);
        this.f8645g = null;
        this.h = false;
        this.f8646i = false;
        this.f8647j = false;
        this.f8648k = null;
        return this;
    }
}

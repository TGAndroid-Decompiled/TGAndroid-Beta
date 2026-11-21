package dd;

import java.util.Locale;
public abstract class j extends k {
    public String f8340c;
    public String d;
    public String f8341e;
    public final StringBuilder f8342f;
    public String f8343g;
    public boolean h;
    public boolean f8344i;
    public boolean f8345j;
    public cd.c f8346k;

    public j(int i7) {
        super(i7, 0);
        this.f8342f = new StringBuilder();
        this.h = false;
        this.f8344i = false;
        this.f8345j = false;
    }

    public final void d(char c10) {
        String valueOf = String.valueOf(c10);
        String str = this.f8341e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.f8341e = valueOf;
    }

    public final void e(char c10) {
        this.f8344i = true;
        String str = this.f8343g;
        StringBuilder sb2 = this.f8342f;
        if (str != null) {
            sb2.append(str);
            this.f8343g = null;
        }
        sb2.append(c10);
    }

    public final void f(String str) {
        this.f8344i = true;
        String str2 = this.f8343g;
        StringBuilder sb2 = this.f8342f;
        if (str2 != null) {
            sb2.append(str2);
            this.f8343g = null;
        }
        if (sb2.length() == 0) {
            this.f8343g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void g(int[] iArr) {
        this.f8344i = true;
        String str = this.f8343g;
        StringBuilder sb2 = this.f8342f;
        if (str != null) {
            sb2.append(str);
            this.f8343g = null;
        }
        for (int i7 : iArr) {
            sb2.appendCodePoint(i7);
        }
    }

    public final void h(String str) {
        String str2;
        String str3 = this.f8340c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f8340c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String i() {
        String str = this.f8340c;
        if (str != null && str.length() != 0) {
            return this.f8340c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void j() {
        String str;
        if (this.f8346k == null) {
            this.f8346k = new cd.c();
        }
        String str2 = this.f8341e;
        StringBuilder sb2 = this.f8342f;
        if (str2 != null) {
            String trim = str2.trim();
            this.f8341e = trim;
            if (trim.length() > 0) {
                if (this.f8344i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f8343g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                cd.c cVar = this.f8346k;
                String str3 = this.f8341e;
                int f10 = cVar.f(str3);
                if (f10 != -1) {
                    cVar.f5225c[f10] = str;
                } else {
                    int i7 = cVar.f5223a;
                    int i10 = i7 + 1;
                    if (i10 >= i7) {
                        String[] strArr = cVar.f5224b;
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
                            cVar.f5224b = strArr2;
                            String[] strArr3 = cVar.f5225c;
                            String[] strArr4 = new String[i10];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
                            cVar.f5225c = strArr4;
                        }
                        String[] strArr5 = cVar.f5224b;
                        int i12 = cVar.f5223a;
                        strArr5[i12] = str3;
                        cVar.f5225c[i12] = str;
                        cVar.f5223a = i12 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.f8341e = null;
        this.h = false;
        this.f8344i = false;
        k.c(sb2);
        this.f8343g = null;
    }

    @Override
    public j b() {
        this.f8340c = null;
        this.d = null;
        this.f8341e = null;
        k.c(this.f8342f);
        this.f8343g = null;
        this.h = false;
        this.f8344i = false;
        this.f8345j = false;
        this.f8346k = null;
        return this;
    }
}

package dd;

import java.util.Locale;
public abstract class j extends k {
    public String f8343c;
    public String d;
    public String f8344e;
    public final StringBuilder f8345f;
    public String f8346g;
    public boolean h;
    public boolean f8347i;
    public boolean f8348j;
    public cd.c f8349k;

    public j(int i7) {
        super(i7, 0);
        this.f8345f = new StringBuilder();
        this.h = false;
        this.f8347i = false;
        this.f8348j = false;
    }

    public final void d(char c10) {
        String valueOf = String.valueOf(c10);
        String str = this.f8344e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.f8344e = valueOf;
    }

    public final void e(char c10) {
        this.f8347i = true;
        String str = this.f8346g;
        StringBuilder sb2 = this.f8345f;
        if (str != null) {
            sb2.append(str);
            this.f8346g = null;
        }
        sb2.append(c10);
    }

    public final void f(String str) {
        this.f8347i = true;
        String str2 = this.f8346g;
        StringBuilder sb2 = this.f8345f;
        if (str2 != null) {
            sb2.append(str2);
            this.f8346g = null;
        }
        if (sb2.length() == 0) {
            this.f8346g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void g(int[] iArr) {
        this.f8347i = true;
        String str = this.f8346g;
        StringBuilder sb2 = this.f8345f;
        if (str != null) {
            sb2.append(str);
            this.f8346g = null;
        }
        for (int i7 : iArr) {
            sb2.appendCodePoint(i7);
        }
    }

    public final void h(String str) {
        String str2;
        String str3 = this.f8343c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f8343c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String i() {
        String str = this.f8343c;
        if (str != null && str.length() != 0) {
            return this.f8343c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void j() {
        String str;
        if (this.f8349k == null) {
            this.f8349k = new cd.c();
        }
        String str2 = this.f8344e;
        StringBuilder sb2 = this.f8345f;
        if (str2 != null) {
            String trim = str2.trim();
            this.f8344e = trim;
            if (trim.length() > 0) {
                if (this.f8347i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f8346g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                cd.c cVar = this.f8349k;
                String str3 = this.f8344e;
                int f10 = cVar.f(str3);
                if (f10 != -1) {
                    cVar.f5228c[f10] = str;
                } else {
                    int i7 = cVar.f5226a;
                    int i10 = i7 + 1;
                    if (i10 >= i7) {
                        String[] strArr = cVar.f5227b;
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
                            cVar.f5227b = strArr2;
                            String[] strArr3 = cVar.f5228c;
                            String[] strArr4 = new String[i10];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
                            cVar.f5228c = strArr4;
                        }
                        String[] strArr5 = cVar.f5227b;
                        int i12 = cVar.f5226a;
                        strArr5[i12] = str3;
                        cVar.f5228c[i12] = str;
                        cVar.f5226a = i12 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.f8344e = null;
        this.h = false;
        this.f8347i = false;
        k.c(sb2);
        this.f8346g = null;
    }

    @Override
    public j b() {
        this.f8343c = null;
        this.d = null;
        this.f8344e = null;
        k.c(this.f8345f);
        this.f8346g = null;
        this.h = false;
        this.f8347i = false;
        this.f8348j = false;
        this.f8349k = null;
        return this;
    }
}

package lc;

import java.util.Locale;
public abstract class j extends k {
    public String f16810c;
    public String d;
    public String f16811e;
    public final StringBuilder f16812f;
    public String f16813g;
    public boolean h;
    public boolean f16814i;
    public boolean f16815j;
    public kc.c f16816k;

    public j(int i9) {
        super(i9, 0);
        this.f16812f = new StringBuilder();
        this.h = false;
        this.f16814i = false;
        this.f16815j = false;
    }

    public final void e(char c10) {
        String valueOf = String.valueOf(c10);
        String str = this.f16811e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.f16811e = valueOf;
    }

    public final void f(char c10) {
        this.f16814i = true;
        String str = this.f16813g;
        StringBuilder sb2 = this.f16812f;
        if (str != null) {
            sb2.append(str);
            this.f16813g = null;
        }
        sb2.append(c10);
    }

    public final void g(String str) {
        this.f16814i = true;
        String str2 = this.f16813g;
        StringBuilder sb2 = this.f16812f;
        if (str2 != null) {
            sb2.append(str2);
            this.f16813g = null;
        }
        if (sb2.length() == 0) {
            this.f16813g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void h(int[] iArr) {
        this.f16814i = true;
        String str = this.f16813g;
        StringBuilder sb2 = this.f16812f;
        if (str != null) {
            sb2.append(str);
            this.f16813g = null;
        }
        for (int i9 : iArr) {
            sb2.appendCodePoint(i9);
        }
    }

    public final void i(String str) {
        String str2;
        String str3 = this.f16810c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f16810c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String j() {
        String str = this.f16810c;
        if (str != null && str.length() != 0) {
            return this.f16810c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void k() {
        String str;
        if (this.f16816k == null) {
            this.f16816k = new kc.c();
        }
        String str2 = this.f16811e;
        StringBuilder sb2 = this.f16812f;
        if (str2 != null) {
            String trim = str2.trim();
            this.f16811e = trim;
            if (trim.length() > 0) {
                if (this.f16814i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f16813g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                kc.c cVar = this.f16816k;
                String str3 = this.f16811e;
                int i9 = cVar.i(str3);
                if (i9 != -1) {
                    cVar.f14758c[i9] = str;
                } else {
                    int i10 = cVar.f14756a;
                    int i11 = i10 + 1;
                    if (i11 >= i10) {
                        String[] strArr = cVar.f14757b;
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
                            cVar.f14757b = strArr2;
                            String[] strArr3 = cVar.f14758c;
                            String[] strArr4 = new String[i11];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
                            cVar.f14758c = strArr4;
                        }
                        String[] strArr5 = cVar.f14757b;
                        int i13 = cVar.f14756a;
                        strArr5[i13] = str3;
                        cVar.f14758c[i13] = str;
                        cVar.f14756a = i13 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.f16811e = null;
        this.h = false;
        this.f16814i = false;
        k.d(sb2);
        this.f16813g = null;
    }

    @Override
    public j c() {
        this.f16810c = null;
        this.d = null;
        this.f16811e = null;
        k.d(this.f16812f);
        this.f16813g = null;
        this.h = false;
        this.f16814i = false;
        this.f16815j = false;
        this.f16816k = null;
        return this;
    }
}

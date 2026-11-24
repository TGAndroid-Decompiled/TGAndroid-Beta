package defpackage;

import java.util.Locale;
public abstract class vpb extends fs5 {
    public String e;
    public String f;
    public String g;
    public final StringBuilder h;
    public String i;
    public boolean j;
    public boolean k;
    public boolean l;
    public fy m;

    public vpb(int i) {
        super(i, (byte) 2);
        this.h = new StringBuilder();
        this.j = false;
        this.k = false;
        this.l = false;
    }

    public final void A() {
        String str;
        if (this.m == null) {
            this.m = new fy();
        }
        String str2 = this.g;
        StringBuilder sb = this.h;
        if (str2 != null) {
            String trim = str2.trim();
            this.g = trim;
            if (trim.length() > 0) {
                if (this.k) {
                    if (sb.length() > 0) {
                        str = sb.toString();
                    } else {
                        str = this.i;
                    }
                } else if (this.j) {
                    str = "";
                } else {
                    str = null;
                }
                fy fyVar = this.m;
                String str3 = this.g;
                int h = fyVar.h(str3);
                if (h != -1) {
                    fyVar.c[h] = str;
                } else {
                    int i = fyVar.a;
                    int i2 = i + 1;
                    if (i2 >= i) {
                        String[] strArr = fyVar.b;
                        int length = strArr.length;
                        if (length < i2) {
                            int i3 = 4;
                            if (length >= 4) {
                                i3 = i << 1;
                            }
                            if (i2 <= i3) {
                                i2 = i3;
                            }
                            String[] strArr2 = new String[i2];
                            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i2));
                            fyVar.b = strArr2;
                            String[] strArr3 = fyVar.c;
                            String[] strArr4 = new String[i2];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i2));
                            fyVar.c = strArr4;
                        }
                        String[] strArr5 = fyVar.b;
                        int i4 = fyVar.a;
                        strArr5[i4] = str3;
                        fyVar.c[i4] = str;
                        fyVar.a = i4 + 1;
                    } else {
                        w26.j("Must be true");
                        return;
                    }
                }
            }
        }
        this.g = null;
        this.j = false;
        this.k = false;
        fs5.t(sb);
        this.i = null;
    }

    @Override
    public vpb s() {
        this.e = null;
        this.f = null;
        this.g = null;
        fs5.t(this.h);
        this.i = null;
        this.j = false;
        this.k = false;
        this.l = false;
        this.m = null;
        return this;
    }

    public final void u(char c) {
        String valueOf = String.valueOf(c);
        String str = this.g;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.g = valueOf;
    }

    public final void v(char c) {
        this.k = true;
        String str = this.i;
        StringBuilder sb = this.h;
        if (str != null) {
            sb.append(str);
            this.i = null;
        }
        sb.append(c);
    }

    public final void w(String str) {
        this.k = true;
        String str2 = this.i;
        StringBuilder sb = this.h;
        if (str2 != null) {
            sb.append(str2);
            this.i = null;
        }
        if (sb.length() == 0) {
            this.i = str;
        } else {
            sb.append(str);
        }
    }

    public final void x(int[] iArr) {
        this.k = true;
        String str = this.i;
        StringBuilder sb = this.h;
        if (str != null) {
            sb.append(str);
            this.i = null;
        }
        for (int i : iArr) {
            sb.appendCodePoint(i);
        }
    }

    public final void y(String str) {
        String str2;
        String str3 = this.e;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.e = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.f = str2;
    }

    public final String z() {
        String str = this.e;
        if (str != null && str.length() != 0) {
            return this.e;
        }
        w26.j("Must be false");
        return null;
    }
}

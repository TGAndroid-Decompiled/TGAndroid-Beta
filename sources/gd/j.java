package gd;

import java.util.Locale;
public abstract class j extends f2.f {
    public String f12449c;
    public String d;
    public String e;
    public final StringBuilder f12450f;
    public String f12451g;
    public boolean h;
    public boolean f12452i;
    public boolean f12453j;
    public fd.c f12454k;

    public j(int i10) {
        super(i10, 1);
        this.f12450f = new StringBuilder();
        this.h = false;
        this.f12452i = false;
        this.f12453j = false;
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
        this.f12452i = true;
        String str = this.f12451g;
        StringBuilder sb2 = this.f12450f;
        if (str != null) {
            sb2.append(str);
            this.f12451g = null;
        }
        sb2.append(c10);
    }

    public final void f(String str) {
        this.f12452i = true;
        String str2 = this.f12451g;
        StringBuilder sb2 = this.f12450f;
        if (str2 != null) {
            sb2.append(str2);
            this.f12451g = null;
        }
        if (sb2.length() == 0) {
            this.f12451g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void g(int[] iArr) {
        this.f12452i = true;
        String str = this.f12451g;
        StringBuilder sb2 = this.f12450f;
        if (str != null) {
            sb2.append(str);
            this.f12451g = null;
        }
        for (int i10 : iArr) {
            sb2.appendCodePoint(i10);
        }
    }

    public final void h(String str) {
        String str2;
        String str3 = this.f12449c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f12449c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String i() {
        String str = this.f12449c;
        if (str != null && str.length() != 0) {
            return this.f12449c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void j() {
        String str;
        if (this.f12454k == null) {
            this.f12454k = new fd.c();
        }
        String str2 = this.e;
        StringBuilder sb2 = this.f12450f;
        if (str2 != null) {
            String trim = str2.trim();
            this.e = trim;
            if (trim.length() > 0) {
                if (this.f12452i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f12451g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                fd.c cVar = this.f12454k;
                String str3 = this.e;
                int h = cVar.h(str3);
                if (h != -1) {
                    cVar.f10434c[h] = str;
                } else {
                    int i10 = cVar.f10432a;
                    int i11 = i10 + 1;
                    if (i11 >= i10) {
                        String[] strArr = cVar.f10433b;
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
                            cVar.f10433b = strArr2;
                            String[] strArr3 = cVar.f10434c;
                            String[] strArr4 = new String[i11];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
                            cVar.f10434c = strArr4;
                        }
                        String[] strArr5 = cVar.f10433b;
                        int i13 = cVar.f10432a;
                        strArr5[i13] = str3;
                        cVar.f10434c[i13] = str;
                        cVar.f10432a = i13 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.e = null;
        this.h = false;
        this.f12452i = false;
        f2.f.c(sb2);
        this.f12451g = null;
    }

    @Override
    public j b() {
        this.f12449c = null;
        this.d = null;
        this.e = null;
        f2.f.c(this.f12450f);
        this.f12451g = null;
        this.h = false;
        this.f12452i = false;
        this.f12453j = false;
        this.f12454k = null;
        return this;
    }
}

package ad;

import java.util.Locale;
public abstract class k extends l {
    public String f357c;
    public String d;
    public String f358e;
    public final StringBuilder f359f;
    public String f360g;
    public boolean h;
    public boolean f361i;
    public boolean f362j;
    public zc.b f363k;

    public k(int i3) {
        super(i3, 0);
        this.f359f = new StringBuilder();
        this.h = false;
        this.f361i = false;
        this.f362j = false;
    }

    public final void d(char c2) {
        String valueOf = String.valueOf(c2);
        String str = this.f358e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.f358e = valueOf;
    }

    public final void e(char c2) {
        this.f361i = true;
        String str = this.f360g;
        StringBuilder sb2 = this.f359f;
        if (str != null) {
            sb2.append(str);
            this.f360g = null;
        }
        sb2.append(c2);
    }

    public final void f(String str) {
        this.f361i = true;
        String str2 = this.f360g;
        StringBuilder sb2 = this.f359f;
        if (str2 != null) {
            sb2.append(str2);
            this.f360g = null;
        }
        if (sb2.length() == 0) {
            this.f360g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void g(int[] iArr) {
        this.f361i = true;
        String str = this.f360g;
        StringBuilder sb2 = this.f359f;
        if (str != null) {
            sb2.append(str);
            this.f360g = null;
        }
        for (int i3 : iArr) {
            sb2.appendCodePoint(i3);
        }
    }

    public final void h(String str) {
        String str2;
        String str3 = this.f357c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f357c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String i() {
        String str = this.f357c;
        if (str != null && str.length() != 0) {
            return this.f357c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void j() {
        String str;
        if (this.f363k == null) {
            this.f363k = new zc.b();
        }
        String str2 = this.f358e;
        StringBuilder sb2 = this.f359f;
        if (str2 != null) {
            String trim = str2.trim();
            this.f358e = trim;
            if (trim.length() > 0) {
                if (this.f361i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f360g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                zc.b bVar = this.f363k;
                String str3 = this.f358e;
                int h = bVar.h(str3);
                if (h != -1) {
                    bVar.f60379c[h] = str;
                } else {
                    int i3 = bVar.f60377a;
                    int i10 = i3 + 1;
                    if (i10 >= i3) {
                        String[] strArr = bVar.f60378b;
                        int length = strArr.length;
                        if (length < i10) {
                            int i11 = 4;
                            if (length >= 4) {
                                i11 = i3 * 2;
                            }
                            if (i10 <= i11) {
                                i10 = i11;
                            }
                            String[] strArr2 = new String[i10];
                            System.arraycopy(strArr, 0, strArr2, 0, Math.min(strArr.length, i10));
                            bVar.f60378b = strArr2;
                            String[] strArr3 = bVar.f60379c;
                            String[] strArr4 = new String[i10];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i10));
                            bVar.f60379c = strArr4;
                        }
                        String[] strArr5 = bVar.f60378b;
                        int i12 = bVar.f60377a;
                        strArr5[i12] = str3;
                        bVar.f60379c[i12] = str;
                        bVar.f60377a = i12 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.f358e = null;
        this.h = false;
        this.f361i = false;
        l.c(sb2);
        this.f360g = null;
    }

    @Override
    public k b() {
        this.f357c = null;
        this.d = null;
        this.f358e = null;
        l.c(this.f359f);
        this.f360g = null;
        this.h = false;
        this.f361i = false;
        this.f362j = false;
        this.f363k = null;
        return this;
    }
}

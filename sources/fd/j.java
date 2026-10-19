package fd;

import java.util.Locale;
public abstract class j extends f2.f {
    public String f10559c;
    public String d;
    public String e;
    public final StringBuilder f10560f;
    public String f10561g;
    public boolean h;
    public boolean f10562i;
    public boolean f10563j;
    public ed.c f10564k;

    public j(int i10) {
        super(i10, 1);
        this.f10560f = new StringBuilder();
        this.h = false;
        this.f10562i = false;
        this.f10563j = false;
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
        this.f10562i = true;
        String str = this.f10561g;
        StringBuilder sb2 = this.f10560f;
        if (str != null) {
            sb2.append(str);
            this.f10561g = null;
        }
        sb2.append(c10);
    }

    public final void f(String str) {
        this.f10562i = true;
        String str2 = this.f10561g;
        StringBuilder sb2 = this.f10560f;
        if (str2 != null) {
            sb2.append(str2);
            this.f10561g = null;
        }
        if (sb2.length() == 0) {
            this.f10561g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void g(int[] iArr) {
        this.f10562i = true;
        String str = this.f10561g;
        StringBuilder sb2 = this.f10560f;
        if (str != null) {
            sb2.append(str);
            this.f10561g = null;
        }
        for (int i10 : iArr) {
            sb2.appendCodePoint(i10);
        }
    }

    public final void h(String str) {
        String str2;
        String str3 = this.f10559c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f10559c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String i() {
        String str = this.f10559c;
        if (str != null && str.length() != 0) {
            return this.f10559c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void j() {
        String str;
        if (this.f10564k == null) {
            this.f10564k = new ed.c();
        }
        String str2 = this.e;
        StringBuilder sb2 = this.f10560f;
        if (str2 != null) {
            String trim = str2.trim();
            this.e = trim;
            if (trim.length() > 0) {
                if (this.f10562i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f10561g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                ed.c cVar = this.f10564k;
                String str3 = this.e;
                int h = cVar.h(str3);
                if (h != -1) {
                    cVar.f8613c[h] = str;
                } else {
                    int i10 = cVar.f8611a;
                    int i11 = i10 + 1;
                    if (i11 >= i10) {
                        String[] strArr = cVar.f8612b;
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
                            cVar.f8612b = strArr2;
                            String[] strArr3 = cVar.f8613c;
                            String[] strArr4 = new String[i11];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i11));
                            cVar.f8613c = strArr4;
                        }
                        String[] strArr5 = cVar.f8612b;
                        int i13 = cVar.f8611a;
                        strArr5[i13] = str3;
                        cVar.f8613c[i13] = str;
                        cVar.f8611a = i13 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.e = null;
        this.h = false;
        this.f10562i = false;
        f2.f.c(sb2);
        this.f10561g = null;
    }

    @Override
    public j b() {
        this.f10559c = null;
        this.d = null;
        this.e = null;
        f2.f.c(this.f10560f);
        this.f10561g = null;
        this.h = false;
        this.f10562i = false;
        this.f10563j = false;
        this.f10564k = null;
        return this;
    }
}

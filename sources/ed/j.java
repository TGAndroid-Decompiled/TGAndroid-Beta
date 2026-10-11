package ed;

import java.util.Locale;
public abstract class j extends k {
    public String f8872c;
    public String d;
    public String f8873e;
    public final StringBuilder f8874f;
    public String f8875g;
    public boolean h;
    public boolean f8876i;
    public boolean f8877j;
    public dd.c f8878k;

    public j(int i10) {
        super(i10, 0);
        this.f8874f = new StringBuilder();
        this.h = false;
        this.f8876i = false;
        this.f8877j = false;
    }

    public final void d(char c10) {
        String valueOf = String.valueOf(c10);
        String str = this.f8873e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.f8873e = valueOf;
    }

    public final void e(char c10) {
        this.f8876i = true;
        String str = this.f8875g;
        StringBuilder sb2 = this.f8874f;
        if (str != null) {
            sb2.append(str);
            this.f8875g = null;
        }
        sb2.append(c10);
    }

    public final void f(String str) {
        this.f8876i = true;
        String str2 = this.f8875g;
        StringBuilder sb2 = this.f8874f;
        if (str2 != null) {
            sb2.append(str2);
            this.f8875g = null;
        }
        if (sb2.length() == 0) {
            this.f8875g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void g(int[] iArr) {
        this.f8876i = true;
        String str = this.f8875g;
        StringBuilder sb2 = this.f8874f;
        if (str != null) {
            sb2.append(str);
            this.f8875g = null;
        }
        for (int i10 : iArr) {
            sb2.appendCodePoint(i10);
        }
    }

    public final void h(String str) {
        String str2;
        String str3 = this.f8872c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f8872c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String i() {
        String str = this.f8872c;
        if (str != null && str.length() != 0) {
            return this.f8872c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void j() {
        String str;
        if (this.f8878k == null) {
            this.f8878k = new dd.c();
        }
        String str2 = this.f8873e;
        StringBuilder sb2 = this.f8874f;
        if (str2 != null) {
            String trim = str2.trim();
            this.f8873e = trim;
            if (trim.length() > 0) {
                if (this.f8876i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f8875g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                dd.c cVar = this.f8878k;
                String str3 = this.f8873e;
                int i10 = cVar.i(str3);
                if (i10 != -1) {
                    cVar.f8308c[i10] = str;
                } else {
                    int i11 = cVar.f8306a;
                    int i12 = i11 + 1;
                    if (i12 >= i11) {
                        String[] strArr = cVar.f8307b;
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
                            cVar.f8307b = strArr2;
                            String[] strArr3 = cVar.f8308c;
                            String[] strArr4 = new String[i12];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i12));
                            cVar.f8308c = strArr4;
                        }
                        String[] strArr5 = cVar.f8307b;
                        int i14 = cVar.f8306a;
                        strArr5[i14] = str3;
                        cVar.f8308c[i14] = str;
                        cVar.f8306a = i14 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.f8873e = null;
        this.h = false;
        this.f8876i = false;
        k.c(sb2);
        this.f8875g = null;
    }

    @Override
    public j b() {
        this.f8872c = null;
        this.d = null;
        this.f8873e = null;
        k.c(this.f8874f);
        this.f8875g = null;
        this.h = false;
        this.f8876i = false;
        this.f8877j = false;
        this.f8878k = null;
        return this;
    }
}

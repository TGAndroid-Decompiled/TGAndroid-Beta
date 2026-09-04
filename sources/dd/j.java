package dd;

import java.util.Locale;
public abstract class j extends k {
    public String f6766c;
    public String d;
    public String f6767e;
    public final StringBuilder f6768f;
    public String h;
    public boolean f6769n;
    public boolean f6770r;
    public boolean f6771s;
    public cd.c v;

    public j(int i10) {
        super(i10, 0);
        this.f6768f = new StringBuilder();
        this.f6769n = false;
        this.f6770r = false;
        this.f6771s = false;
    }

    public final void i(char c10) {
        String valueOf = String.valueOf(c10);
        String str = this.f6767e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.f6767e = valueOf;
    }

    public final void j(char c10) {
        this.f6770r = true;
        String str = this.h;
        StringBuilder sb2 = this.f6768f;
        if (str != null) {
            sb2.append(str);
            this.h = null;
        }
        sb2.append(c10);
    }

    public final void l(String str) {
        this.f6770r = true;
        String str2 = this.h;
        StringBuilder sb2 = this.f6768f;
        if (str2 != null) {
            sb2.append(str2);
            this.h = null;
        }
        if (sb2.length() == 0) {
            this.h = str;
        } else {
            sb2.append(str);
        }
    }

    public final void m(int[] iArr) {
        this.f6770r = true;
        String str = this.h;
        StringBuilder sb2 = this.f6768f;
        if (str != null) {
            sb2.append(str);
            this.h = null;
        }
        for (int i10 : iArr) {
            sb2.appendCodePoint(i10);
        }
    }

    public final void n(String str) {
        String str2;
        String str3 = this.f6766c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f6766c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String o() {
        String str = this.f6766c;
        if (str != null && str.length() != 0) {
            return this.f6766c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void p() {
        String str;
        if (this.v == null) {
            this.v = new cd.c();
        }
        String str2 = this.f6767e;
        StringBuilder sb2 = this.f6768f;
        if (str2 != null) {
            String trim = str2.trim();
            this.f6767e = trim;
            if (trim.length() > 0) {
                if (this.f6770r) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.h;
                    }
                } else if (this.f6769n) {
                    str = "";
                } else {
                    str = null;
                }
                cd.c cVar = this.v;
                String str3 = this.f6767e;
                int i10 = cVar.i(str3);
                if (i10 != -1) {
                    cVar.f4757c[i10] = str;
                } else {
                    int i11 = cVar.f4755a;
                    int i12 = i11 + 1;
                    if (i12 >= i11) {
                        String[] strArr = cVar.f4756b;
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
                            cVar.f4756b = strArr2;
                            String[] strArr3 = cVar.f4757c;
                            String[] strArr4 = new String[i12];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i12));
                            cVar.f4757c = strArr4;
                        }
                        String[] strArr5 = cVar.f4756b;
                        int i14 = cVar.f4755a;
                        strArr5[i14] = str3;
                        cVar.f4757c[i14] = str;
                        cVar.f4755a = i14 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.f6767e = null;
        this.f6769n = false;
        this.f6770r = false;
        k.g(sb2);
        this.h = null;
    }

    @Override
    public j f() {
        this.f6766c = null;
        this.d = null;
        this.f6767e = null;
        k.g(this.f6768f);
        this.h = null;
        this.f6769n = false;
        this.f6770r = false;
        this.f6771s = false;
        this.v = null;
        return this;
    }
}

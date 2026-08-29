package nc;

import java.util.Locale;
public abstract class j extends k {
    public String f17277c;
    public String d;
    public String f17278e;
    public final StringBuilder f17279f;
    public String f17280g;
    public boolean h;
    public boolean f17281i;
    public boolean f17282j;
    public mc.b f17283k;

    public j(int i10) {
        super(i10, 0);
        this.f17279f = new StringBuilder();
        this.h = false;
        this.f17281i = false;
        this.f17282j = false;
    }

    public final void e(char c3) {
        String valueOf = String.valueOf(c3);
        String str = this.f17278e;
        if (str != null) {
            valueOf = str.concat(valueOf);
        }
        this.f17278e = valueOf;
    }

    public final void f(char c3) {
        this.f17281i = true;
        String str = this.f17280g;
        StringBuilder sb2 = this.f17279f;
        if (str != null) {
            sb2.append(str);
            this.f17280g = null;
        }
        sb2.append(c3);
    }

    public final void g(String str) {
        this.f17281i = true;
        String str2 = this.f17280g;
        StringBuilder sb2 = this.f17279f;
        if (str2 != null) {
            sb2.append(str2);
            this.f17280g = null;
        }
        if (sb2.length() == 0) {
            this.f17280g = str;
        } else {
            sb2.append(str);
        }
    }

    public final void h(int[] iArr) {
        this.f17281i = true;
        String str = this.f17280g;
        StringBuilder sb2 = this.f17279f;
        if (str != null) {
            sb2.append(str);
            this.f17280g = null;
        }
        for (int i10 : iArr) {
            sb2.appendCodePoint(i10);
        }
    }

    public final void i(String str) {
        String str2;
        String str3 = this.f17277c;
        if (str3 != null) {
            str = str3.concat(str);
        }
        this.f17277c = str;
        if (str != null) {
            str2 = str.toLowerCase(Locale.ENGLISH);
        } else {
            str2 = "";
        }
        this.d = str2;
    }

    public final String j() {
        String str = this.f17277c;
        if (str != null && str.length() != 0) {
            return this.f17277c;
        }
        throw new IllegalArgumentException("Must be false");
    }

    public final void k() {
        String str;
        if (this.f17283k == null) {
            this.f17283k = new mc.b();
        }
        String str2 = this.f17278e;
        StringBuilder sb2 = this.f17279f;
        if (str2 != null) {
            String trim = str2.trim();
            this.f17278e = trim;
            if (trim.length() > 0) {
                if (this.f17281i) {
                    if (sb2.length() > 0) {
                        str = sb2.toString();
                    } else {
                        str = this.f17280g;
                    }
                } else if (this.h) {
                    str = "";
                } else {
                    str = null;
                }
                mc.b bVar = this.f17283k;
                String str3 = this.f17278e;
                int i10 = bVar.i(str3);
                if (i10 != -1) {
                    bVar.f16976c[i10] = str;
                } else {
                    int i11 = bVar.f16974a;
                    int i12 = i11 + 1;
                    if (i12 >= i11) {
                        String[] strArr = bVar.f16975b;
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
                            bVar.f16975b = strArr2;
                            String[] strArr3 = bVar.f16976c;
                            String[] strArr4 = new String[i12];
                            System.arraycopy(strArr3, 0, strArr4, 0, Math.min(strArr3.length, i12));
                            bVar.f16976c = strArr4;
                        }
                        String[] strArr5 = bVar.f16975b;
                        int i14 = bVar.f16974a;
                        strArr5[i14] = str3;
                        bVar.f16976c[i14] = str;
                        bVar.f16974a = i14 + 1;
                    } else {
                        throw new IllegalArgumentException("Must be true");
                    }
                }
            }
        }
        this.f17278e = null;
        this.h = false;
        this.f17281i = false;
        k.d(sb2);
        this.f17280g = null;
    }

    @Override
    public j c() {
        this.f17277c = null;
        this.d = null;
        this.f17278e = null;
        k.d(this.f17279f);
        this.f17280g = null;
        this.h = false;
        this.f17281i = false;
        this.f17282j = false;
        this.f17283k = null;
        return this;
    }
}

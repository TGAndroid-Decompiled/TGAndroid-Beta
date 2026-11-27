package defpackage;

import java.util.Iterator;
public final class hpa implements Iterator {
    public String b;
    public final CharSequence c;
    public final zj1 d;
    public final k09 h;
    public int a = 2;
    public int e = 0;
    public int f = Integer.MAX_VALUE;

    public hpa(k09 k09Var, um4 um4Var, CharSequence charSequence) {
        this.h = k09Var;
        this.d = (zj1) um4Var.b;
        this.c = charSequence;
    }

    @Override
    public final boolean hasNext() {
        boolean z;
        String str;
        int i;
        if (this.a != 4) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        int F = ik8.F(this.a);
        if (F == 0) {
            return true;
        }
        if (F != 2) {
            this.a = 4;
            int i2 = this.e;
            while (true) {
                int i3 = this.e;
                if (i3 != -1) {
                    ck1 ck1Var = (ck1) this.h.b;
                    CharSequence charSequence = this.c;
                    int length = charSequence.length();
                    yve.m(i3, length);
                    while (true) {
                        if (i3 < length) {
                            if (ck1Var.b(charSequence.charAt(i3))) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 == -1) {
                        i3 = charSequence.length();
                        this.e = -1;
                        i = -1;
                    } else {
                        i = i3 + 1;
                        this.e = i;
                    }
                    if (i == i2) {
                        int i4 = i + 1;
                        this.e = i4;
                        if (i4 > charSequence.length()) {
                            this.e = -1;
                        }
                    } else {
                        zj1 zj1Var = this.d;
                        if (i2 < i3) {
                            charSequence.charAt(i2);
                            zj1Var.getClass();
                            charSequence.charAt(i3 - 1);
                            zj1Var.getClass();
                        }
                        int i5 = this.f;
                        if (i5 == 1) {
                            i3 = charSequence.length();
                            this.e = -1;
                            if (i3 > i2) {
                                charSequence.charAt(i3 - 1);
                                zj1Var.getClass();
                            }
                        } else {
                            this.f = i5 - 1;
                        }
                        str = charSequence.subSequence(i2, i3).toString();
                    }
                } else {
                    this.a = 3;
                    str = null;
                    break;
                }
            }
            this.b = str;
            if (this.a != 3) {
                this.a = 1;
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object next() {
        if (hasNext()) {
            this.a = 2;
            String str = this.b;
            this.b = null;
            return str;
        }
        lq5.n();
        return null;
    }

    @Override
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}

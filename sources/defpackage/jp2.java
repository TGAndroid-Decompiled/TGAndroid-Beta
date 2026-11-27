package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
public abstract class jp2 implements Iterator {
    public final byte a = 0;
    public int b;
    public int c;
    public int d;
    public final AbstractMap e;

    public jp2(lp2 lp2Var, byte b) {
        int i;
        this.e = lp2Var;
        this.b = lp2Var.f;
        if (lp2Var.isEmpty()) {
            i = -1;
        } else {
            i = 0;
        }
        this.c = i;
        this.d = -1;
    }

    public abstract Object a(int i);

    public abstract Object b(int i);

    @Override
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c >= 0) {
                    return true;
                }
                return false;
            case 1:
                if (this.c >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.c >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override
    public final Object next() {
        byte b = this.a;
        int i = -1;
        AbstractMap abstractMap = this.e;
        Object obj = null;
        switch (b) {
            case 0:
                lp2 lp2Var = (lp2) abstractMap;
                if (lp2Var.f == this.b) {
                    if (hasNext()) {
                        int i2 = this.c;
                        this.d = i2;
                        obj = a(i2);
                        int i3 = this.c + 1;
                        if (i3 < lp2Var.h) {
                            i = i3;
                        }
                        this.c = i;
                    } else {
                        lq5.n();
                    }
                } else {
                    bg.b();
                }
                return obj;
            case 1:
                lp2 lp2Var2 = (lp2) abstractMap;
                if (lp2Var2.f == this.b) {
                    if (hasNext()) {
                        int i4 = this.c;
                        this.d = i4;
                        obj = b(i4);
                        int i5 = this.c + 1;
                        if (i5 < lp2Var2.h) {
                            i = i5;
                        }
                        this.c = i;
                    } else {
                        lq5.n();
                    }
                } else {
                    bg.b();
                }
                return obj;
            default:
                lp2 lp2Var3 = (lp2) abstractMap;
                if (lp2Var3.f == this.b) {
                    if (hasNext()) {
                        int i6 = this.c;
                        this.d = i6;
                        obj = b(i6);
                        int i7 = this.c + 1;
                        if (i7 < lp2Var3.h) {
                            i = i7;
                        }
                        this.c = i;
                    } else {
                        lq5.n();
                    }
                } else {
                    bg.b();
                }
                return obj;
        }
    }

    @Override
    public final void remove() {
        byte b = this.a;
        boolean z = false;
        AbstractMap abstractMap = this.e;
        switch (b) {
            case 0:
                lp2 lp2Var = (lp2) abstractMap;
                if (lp2Var.f == this.b) {
                    if (this.d >= 0) {
                        z = true;
                    }
                    yve.o("no calls to next() since the last call to remove()", z);
                    this.b += 32;
                    int i = this.d;
                    Object obj = lp2.w;
                    lp2Var.remove(lp2Var.g(i));
                    this.c--;
                    this.d = -1;
                    return;
                }
                bg.b();
                return;
            case 1:
                lp2 lp2Var2 = (lp2) abstractMap;
                int i2 = lp2Var2.f;
                int i3 = this.b;
                if (i2 == i3) {
                    int i4 = this.d;
                    if (i4 >= 0) {
                        z = true;
                    }
                    if (z) {
                        this.b = i3 + 32;
                        Object[] objArr = lp2Var2.d;
                        objArr.getClass();
                        lp2Var2.remove(objArr[i4]);
                        this.c--;
                        this.d = -1;
                        return;
                    }
                    grb.i("no calls to next() since the last call to remove()");
                    return;
                }
                bg.b();
                return;
            default:
                lp2 lp2Var3 = (lp2) abstractMap;
                int i5 = lp2Var3.f;
                int i6 = this.b;
                if (i5 == i6) {
                    int i7 = this.d;
                    if (i7 >= 0) {
                        z = true;
                    }
                    if (z) {
                        this.b = i6 + 32;
                        Object[] objArr2 = lp2Var3.d;
                        objArr2.getClass();
                        lp2Var3.remove(objArr2[i7]);
                        this.c--;
                        this.d = -1;
                        return;
                    }
                    grb.i("no calls to next() since the last call to remove()");
                    return;
                }
                bg.b();
                return;
        }
    }

    public jp2(lp2 lp2Var, char c) {
        this.e = lp2Var;
        this.b = lp2Var.f;
        this.c = lp2Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public jp2(lp2 lp2Var) {
        this.e = lp2Var;
        this.b = lp2Var.f;
        this.c = lp2Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}

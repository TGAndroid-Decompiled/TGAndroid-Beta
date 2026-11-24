package defpackage;

import java.util.AbstractMap;
import java.util.Iterator;
public abstract class bq2 implements Iterator {
    public final byte a = 0;
    public int b;
    public int c;
    public int d;
    public final AbstractMap e;

    public bq2(dq2 dq2Var, byte b) {
        int i;
        this.e = dq2Var;
        this.b = dq2Var.f;
        if (dq2Var.isEmpty()) {
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
                dq2 dq2Var = (dq2) abstractMap;
                if (dq2Var.f == this.b) {
                    if (hasNext()) {
                        int i2 = this.c;
                        this.d = i2;
                        obj = a(i2);
                        int i3 = this.c + 1;
                        if (i3 < dq2Var.h) {
                            i = i3;
                        }
                        this.c = i;
                    } else {
                        u36.g();
                    }
                } else {
                    zg.b();
                }
                return obj;
            case 1:
                dq2 dq2Var2 = (dq2) abstractMap;
                if (dq2Var2.f == this.b) {
                    if (hasNext()) {
                        int i4 = this.c;
                        this.d = i4;
                        obj = b(i4);
                        int i5 = this.c + 1;
                        if (i5 < dq2Var2.h) {
                            i = i5;
                        }
                        this.c = i;
                    } else {
                        u36.g();
                    }
                } else {
                    zg.b();
                }
                return obj;
            default:
                dq2 dq2Var3 = (dq2) abstractMap;
                if (dq2Var3.f == this.b) {
                    if (hasNext()) {
                        int i6 = this.c;
                        this.d = i6;
                        obj = b(i6);
                        int i7 = this.c + 1;
                        if (i7 < dq2Var3.h) {
                            i = i7;
                        }
                        this.c = i;
                    } else {
                        u36.g();
                    }
                } else {
                    zg.b();
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
                dq2 dq2Var = (dq2) abstractMap;
                if (dq2Var.f == this.b) {
                    if (this.d >= 0) {
                        z = true;
                    }
                    jte.o("no calls to next() since the last call to remove()", z);
                    this.b += 32;
                    int i = this.d;
                    Object obj = dq2.w;
                    dq2Var.remove(dq2Var.g(i));
                    this.c--;
                    this.d = -1;
                    return;
                }
                zg.b();
                return;
            case 1:
                dq2 dq2Var2 = (dq2) abstractMap;
                int i2 = dq2Var2.f;
                int i3 = this.b;
                if (i2 == i3) {
                    int i4 = this.d;
                    if (i4 >= 0) {
                        z = true;
                    }
                    if (z) {
                        this.b = i3 + 32;
                        Object[] objArr = dq2Var2.d;
                        objArr.getClass();
                        dq2Var2.remove(objArr[i4]);
                        this.c--;
                        this.d = -1;
                        return;
                    }
                    dq9.m("no calls to next() since the last call to remove()");
                    return;
                }
                zg.b();
                return;
            default:
                dq2 dq2Var3 = (dq2) abstractMap;
                int i5 = dq2Var3.f;
                int i6 = this.b;
                if (i5 == i6) {
                    int i7 = this.d;
                    if (i7 >= 0) {
                        z = true;
                    }
                    if (z) {
                        this.b = i6 + 32;
                        Object[] objArr2 = dq2Var3.d;
                        objArr2.getClass();
                        dq2Var3.remove(objArr2[i7]);
                        this.c--;
                        this.d = -1;
                        return;
                    }
                    dq9.m("no calls to next() since the last call to remove()");
                    return;
                }
                zg.b();
                return;
        }
    }

    public bq2(dq2 dq2Var, char c) {
        this.e = dq2Var;
        this.b = dq2Var.f;
        this.c = dq2Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }

    public bq2(dq2 dq2Var) {
        this.e = dq2Var;
        this.b = dq2Var.f;
        this.c = dq2Var.isEmpty() ? -1 : 0;
        this.d = -1;
    }
}

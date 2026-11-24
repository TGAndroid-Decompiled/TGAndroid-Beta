package defpackage;

import java.util.ArrayList;
public final class fu9 extends age {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final int g;
    public final int h;
    public final ArrayList i;
    public final ju9 j;

    public fu9(ju9 ju9Var, int i, int i2, int i3, int i4, int i5, ArrayList arrayList, int i6, int i7, ArrayList arrayList2) {
        this.j = ju9Var;
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = arrayList;
        this.g = i6;
        this.h = i7;
        this.i = arrayList2;
    }

    @Override
    public final boolean a(int i, int i2) {
        return b(i, i2);
    }

    @Override
    public final boolean b(int i, int i2) {
        k47 k47Var;
        ju9 ju9Var = this.j;
        if (i >= 0 && i2 >= 0) {
            if (i != this.b || i2 != ju9Var.s) {
                if (i == this.c && i2 == ju9Var.y) {
                    return true;
                }
            } else {
                return true;
            }
        }
        k47 k47Var2 = null;
        int i3 = this.d;
        if (i >= i3 && i < this.e) {
            k47Var = (k47) this.f.get(i - i3);
        } else {
            int i4 = this.g;
            if (i >= i4 && i < this.h) {
                k47Var = (k47) this.i.get(i - i4);
            } else {
                k47Var = null;
            }
        }
        int i5 = ju9Var.w;
        if (i2 >= i5 && i2 < ju9Var.x) {
            k47Var2 = (k47) ju9Var.e.get(i2 - i5);
        } else {
            int i6 = ju9Var.E;
            if (i2 >= i6 && i2 < ju9Var.F) {
                k47Var2 = (k47) ju9Var.f.get(i2 - i6);
            }
        }
        if (k47Var2 != null && k47Var != null && k47Var2.F0() != null && k47Var.F0() != null && k47Var2.F0().id == k47Var.F0().id) {
            return true;
        }
        return false;
    }

    @Override
    public final int c() {
        return this.j.r;
    }

    @Override
    public final int d() {
        return this.a;
    }
}

package defpackage;

import java.util.ArrayList;
public abstract class u49 extends q59 {
    public boolean c;
    public boolean d;
    public ArrayList e;
    public ArrayList f;

    public final void E() {
        this.c = false;
        if (!this.d && this.e.isEmpty() && this.f.isEmpty()) {
            return;
        }
        ((hu1) this).J(false);
    }

    @Override
    public void f() {
        if (!this.c) {
            super.f();
        } else {
            this.d = true;
        }
    }

    @Override
    public void g(int i) {
        if (!this.c) {
            super.g(i);
        }
    }

    @Override
    public void i(int i) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.i(i);
            return;
        }
        arrayList.add(Integer.valueOf(i));
        arrayList.add(1);
    }

    @Override
    public void l(int i, int i2) {
        if (!this.c) {
            super.l(i, i2);
        }
    }

    @Override
    public void p(int i, int i2) {
        ArrayList arrayList = this.e;
        if (!this.c) {
            super.p(i, i2);
            return;
        }
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
    }

    @Override
    public void q(int i, int i2) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.q(i, i2);
            return;
        }
        arrayList.add(Integer.valueOf(i));
        arrayList.add(Integer.valueOf(i2));
    }

    @Override
    public void s(int i) {
        ArrayList arrayList = this.f;
        if (!this.c) {
            super.s(i);
            return;
        }
        arrayList.add(Integer.valueOf(i));
        arrayList.add(1);
    }
}

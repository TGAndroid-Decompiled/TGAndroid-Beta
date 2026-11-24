package defpackage;

import android.view.View;
import android.widget.FrameLayout;
public final class swa extends oec {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final FrameLayout d;
    public final uxa e;

    public swa(uxa uxaVar, boolean z, boolean z2, boolean z3, FrameLayout frameLayout) {
        this.e = uxaVar;
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = frameLayout;
    }

    @Override
    public final View d(int i) {
        uxa uxaVar = this.e;
        if (uxaVar.o0) {
            return uxaVar.j0;
        }
        if (this.a) {
            if (i != 0) {
                i--;
            }
            return this.d;
        }
        if (this.b) {
            if (i == 0) {
                return uxaVar.j0;
            }
            i--;
        }
        if (this.c && i == 0) {
            return uxaVar.k0;
        }
        return this.d;
    }

    @Override
    public final int e() {
        if (this.e.o0) {
            return 1;
        }
        return (this.a ? 1 : 0) + (this.b ? 1 : 0) + (this.c ? 1 : 0);
    }

    @Override
    public final int h(int i) {
        return i;
    }

    @Override
    public final void b(View view, int i, int i2) {
    }
}

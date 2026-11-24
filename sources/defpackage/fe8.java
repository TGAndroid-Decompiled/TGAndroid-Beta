package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class fe8 extends le8 {
    public final ge8 G;

    public fe8(ge8 ge8Var, Context context, int i, fr7 fr7Var) {
        super(context, i, fr7Var, null);
        this.G = ge8Var;
    }

    @Override
    public final boolean f() {
        s49 T;
        ie8 ie8Var = this.G.d;
        rkb rkbVar = ie8Var.c;
        View F = rkbVar.F(this);
        if (F == null) {
            T = null;
        } else {
            T = rkbVar.T(F);
        }
        if (T != null) {
            int b = T.b();
            int i = ie8Var.E;
            if (i == ie8Var.n && b == (ie8Var.o0 + i) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean g(le8 le8Var) {
        s49 T;
        int b;
        ie8 ie8Var = this.G.d;
        rkb rkbVar = ie8Var.c;
        View F = rkbVar.F(le8Var);
        if (F == null) {
            T = null;
        } else {
            T = rkbVar.T(F);
        }
        if (T != null && (b = T.b()) != -1) {
            return ie8Var.x[b - ie8Var.o0];
        }
        return false;
    }

    @Override
    public final void h(py pyVar, ActionMode actionMode) {
        if (pyVar.isFocused() && pyVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                mu1.x6(menu, this.G.d.f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(le8 le8Var, boolean z) {
        s49 T;
        int b;
        ie8 ie8Var = this.G.d;
        ie8Var.c.getChildCount();
        if (z && ie8Var.M) {
            Arrays.fill(ie8Var.x, false);
            for (int i = ie8Var.o0; i < ie8Var.o0 + ie8Var.E; i++) {
                s49 K = ie8Var.c.K(i);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof le8) {
                        ((le8) view).r.a(false, true);
                    }
                }
            }
        }
        super.i(le8Var, z);
        rkb rkbVar = ie8Var.c;
        View F = rkbVar.F(le8Var);
        if (F == null) {
            T = null;
        } else {
            T = rkbVar.T(F);
        }
        if (T != null && (b = T.b()) != -1) {
            ie8Var.x[b - ie8Var.o0] = z;
        }
        ie8Var.j0();
    }

    @Override
    public final void j(boolean z) {
        this.G.d.n0(this, z);
    }

    @Override
    public final void k(le8 le8Var) {
        this.G.d.o0(le8Var);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        ie8 ie8Var = this.G.d;
        if (!arrayList.isEmpty()) {
            ie8Var.c.getClass();
            int R = RecyclerView.R(this) - ie8Var.o0;
            if (R >= 0) {
                py pyVar = this.d;
                pyVar.getText().replace(pyVar.getSelectionStart(), pyVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i = R + 1;
                while (!arrayList.isEmpty() && i < ie8Var.n) {
                    for (int length = ie8Var.w.length - 1; length > i; length--) {
                        CharSequence[] charSequenceArr = ie8Var.w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    ie8Var.w[i] = (CharSequence) arrayList.remove(0);
                    ie8Var.E++;
                    i++;
                }
                ie8Var.u0();
                ie8Var.h0 = (ie8Var.o0 + i) - 1;
                ie8Var.b.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean q() {
        return this.G.d.M;
    }
}

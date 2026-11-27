package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class y62 extends zh8 {
    public final t20 G;

    public y62(t20 t20Var, Context context, int i, u62 u62Var, vnb vnbVar) {
        super(context, i, u62Var, vnbVar);
        this.G = t20Var;
        ((a72) t20Var.e).s.getChildCount();
    }

    @Override
    public final boolean f() {
        f89 U;
        a72 a72Var = (a72) this.G.e;
        qob qobVar = a72Var.s;
        View G = qobVar.G(this);
        if (G == null) {
            U = null;
        } else {
            U = qobVar.U(G);
        }
        if (U != null) {
            int b = U.b();
            int i = a72Var.N;
            if (i == a72Var.K && b == (a72Var.u0 + i) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean g(zh8 zh8Var) {
        f89 U;
        int b;
        a72 a72Var = (a72) this.G.e;
        qob qobVar = a72Var.s;
        View G = qobVar.G(zh8Var);
        if (G == null) {
            U = null;
        } else {
            U = qobVar.U(G);
        }
        if (U != null && (b = U.b()) != -1) {
            return a72Var.M[b - a72Var.u0];
        }
        return false;
    }

    @Override
    public final void h(qy qyVar, ActionMode actionMode) {
        a72 a72Var = (a72) this.G.e;
        if (a72Var.n && qyVar.isFocused() && qyVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                zu1.E6(menu, ((zu1) a72Var.b.Z1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(zh8 zh8Var, boolean z) {
        f89 U;
        int b;
        a72 a72Var = (a72) this.G.e;
        if (z && a72Var.d0 && !a72Var.c0) {
            Arrays.fill(a72Var.M, false);
            for (int i = a72Var.u0; i < a72Var.u0 + a72Var.N; i++) {
                f89 L = a72Var.s.L(i);
                if (L != null) {
                    View view = L.a;
                    if (view instanceof zh8) {
                        ((zh8) view).r.a(false, true);
                    }
                }
            }
        }
        super.i(zh8Var, z);
        qob qobVar = a72Var.s;
        View G = qobVar.G(zh8Var);
        if (G == null) {
            U = null;
        } else {
            U = qobVar.U(G);
        }
        if (U != null && (b = U.b()) != -1) {
            a72Var.M[b - a72Var.u0] = z;
        }
        a72Var.S();
    }

    @Override
    public final void j(boolean z) {
        ((a72) this.G.e).a0(this, z);
    }

    @Override
    public final void k(zh8 zh8Var) {
        ((a72) this.G.e).b0(zh8Var);
    }

    @Override
    public final void l(qy qyVar) {
        ((a72) this.G.e).b.d1(qyVar, true);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        a72 a72Var = (a72) this.G.e;
        if (!arrayList.isEmpty()) {
            a72Var.s.getClass();
            int S = RecyclerView.S(this) - a72Var.u0;
            if (S >= 0) {
                qy qyVar = this.d;
                qyVar.getText().replace(qyVar.getSelectionStart(), qyVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i = S + 1;
                while (!arrayList.isEmpty() && i < a72Var.K) {
                    for (int length = a72Var.L.length - 1; length > i; length--) {
                        CharSequence[] charSequenceArr = a72Var.L;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    a72Var.L[i] = (CharSequence) arrayList.remove(0);
                    a72Var.N++;
                    i++;
                }
                a72Var.m0();
                a72Var.l0 = (a72Var.u0 + i) - 1;
                a72Var.s.setItemAnimator(a72Var.w);
                a72Var.r.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return ((a72) this.G.e).d0;
    }
}

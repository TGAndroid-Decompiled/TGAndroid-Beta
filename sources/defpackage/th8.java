package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class th8 extends zh8 {
    public final uh8 G;

    public th8(uh8 uh8Var, Context context, int i, am7 am7Var) {
        super(context, i, am7Var, null);
        this.G = uh8Var;
    }

    @Override
    public final boolean f() {
        f89 U;
        wh8 wh8Var = this.G.d;
        qob qobVar = wh8Var.c;
        View G = qobVar.G(this);
        if (G == null) {
            U = null;
        } else {
            U = qobVar.U(G);
        }
        if (U != null) {
            int b = U.b();
            int i = wh8Var.E;
            if (i == wh8Var.n && b == (wh8Var.o0 + i) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean g(zh8 zh8Var) {
        f89 U;
        int b;
        wh8 wh8Var = this.G.d;
        qob qobVar = wh8Var.c;
        View G = qobVar.G(zh8Var);
        if (G == null) {
            U = null;
        } else {
            U = qobVar.U(G);
        }
        if (U != null && (b = U.b()) != -1) {
            return wh8Var.x[b - wh8Var.o0];
        }
        return false;
    }

    @Override
    public final void h(qy qyVar, ActionMode actionMode) {
        if (qyVar.isFocused() && qyVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                zu1.E6(menu, this.G.d.f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(zh8 zh8Var, boolean z) {
        f89 U;
        int b;
        wh8 wh8Var = this.G.d;
        wh8Var.c.getChildCount();
        if (z && wh8Var.M) {
            Arrays.fill(wh8Var.x, false);
            for (int i = wh8Var.o0; i < wh8Var.o0 + wh8Var.E; i++) {
                f89 L = wh8Var.c.L(i);
                if (L != null) {
                    View view = L.a;
                    if (view instanceof zh8) {
                        ((zh8) view).r.a(false, true);
                    }
                }
            }
        }
        super.i(zh8Var, z);
        qob qobVar = wh8Var.c;
        View G = qobVar.G(zh8Var);
        if (G == null) {
            U = null;
        } else {
            U = qobVar.U(G);
        }
        if (U != null && (b = U.b()) != -1) {
            wh8Var.x[b - wh8Var.o0] = z;
        }
        wh8Var.j0();
    }

    @Override
    public final void j(boolean z) {
        this.G.d.n0(this, z);
    }

    @Override
    public final void k(zh8 zh8Var) {
        this.G.d.o0(zh8Var);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        wh8 wh8Var = this.G.d;
        if (!arrayList.isEmpty()) {
            wh8Var.c.getClass();
            int S = RecyclerView.S(this) - wh8Var.o0;
            if (S >= 0) {
                qy qyVar = this.d;
                qyVar.getText().replace(qyVar.getSelectionStart(), qyVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i = S + 1;
                while (!arrayList.isEmpty() && i < wh8Var.n) {
                    for (int length = wh8Var.w.length - 1; length > i; length--) {
                        CharSequence[] charSequenceArr = wh8Var.w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    wh8Var.w[i] = (CharSequence) arrayList.remove(0);
                    wh8Var.E++;
                    i++;
                }
                wh8Var.u0();
                wh8Var.h0 = (wh8Var.o0 + i) - 1;
                wh8Var.b.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return this.G.d.M;
    }
}

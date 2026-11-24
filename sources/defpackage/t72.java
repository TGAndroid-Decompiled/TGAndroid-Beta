package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class t72 extends ng8 {
    public final s30 G;

    public t72(s30 s30Var, Context context, int i, p72 p72Var, ylb ylbVar) {
        super(context, i, p72Var, ylbVar);
        this.G = s30Var;
        ((v72) s30Var.e).s.getChildCount();
    }

    @Override
    public final boolean f() {
        u69 T;
        v72 v72Var = (v72) this.G.e;
        smb smbVar = v72Var.s;
        View F = smbVar.F(this);
        if (F == null) {
            T = null;
        } else {
            T = smbVar.T(F);
        }
        if (T != null) {
            int b = T.b();
            int i = v72Var.N;
            if (i == v72Var.K && b == (v72Var.u0 + i) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean g(ng8 ng8Var) {
        u69 T;
        int b;
        v72 v72Var = (v72) this.G.e;
        smb smbVar = v72Var.s;
        View F = smbVar.F(ng8Var);
        if (F == null) {
            T = null;
        } else {
            T = smbVar.T(F);
        }
        if (T != null && (b = T.b()) != -1) {
            return v72Var.M[b - v72Var.u0];
        }
        return false;
    }

    @Override
    public final void h(pz pzVar, ActionMode actionMode) {
        v72 v72Var = (v72) this.G.e;
        if (v72Var.n && pzVar.isFocused() && pzVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                yv1.E6(menu, ((yv1) v72Var.b.Z1).h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(ng8 ng8Var, boolean z) {
        u69 T;
        int b;
        v72 v72Var = (v72) this.G.e;
        if (z && v72Var.d0 && !v72Var.c0) {
            Arrays.fill(v72Var.M, false);
            for (int i = v72Var.u0; i < v72Var.u0 + v72Var.N; i++) {
                u69 K = v72Var.s.K(i);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof ng8) {
                        ((ng8) view).r.a(false, true);
                    }
                }
            }
        }
        super.i(ng8Var, z);
        smb smbVar = v72Var.s;
        View F = smbVar.F(ng8Var);
        if (F == null) {
            T = null;
        } else {
            T = smbVar.T(F);
        }
        if (T != null && (b = T.b()) != -1) {
            v72Var.M[b - v72Var.u0] = z;
        }
        v72Var.S();
    }

    @Override
    public final void j(boolean z) {
        ((v72) this.G.e).b0(this, z);
    }

    @Override
    public final void k(ng8 ng8Var) {
        ((v72) this.G.e).c0(ng8Var);
    }

    @Override
    public final void l(pz pzVar) {
        ((v72) this.G.e).b.c1(pzVar, true);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        v72 v72Var = (v72) this.G.e;
        if (!arrayList.isEmpty()) {
            v72Var.s.getClass();
            int R = RecyclerView.R(this) - v72Var.u0;
            if (R >= 0) {
                pz pzVar = this.d;
                pzVar.getText().replace(pzVar.getSelectionStart(), pzVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i = R + 1;
                while (!arrayList.isEmpty() && i < v72Var.K) {
                    for (int length = v72Var.L.length - 1; length > i; length--) {
                        CharSequence[] charSequenceArr = v72Var.L;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    v72Var.L[i] = (CharSequence) arrayList.remove(0);
                    v72Var.N++;
                    i++;
                }
                v72Var.n0();
                v72Var.l0 = (v72Var.u0 + i) - 1;
                v72Var.s.setItemAnimator(v72Var.w);
                v72Var.r.f();
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean p() {
        return ((v72) this.G.e).d0;
    }
}

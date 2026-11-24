package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
public final class hg8 extends ng8 {
    public final ig8 G;

    public hg8(ig8 ig8Var, Context context, int i, m67 m67Var) {
        super(context, i, m67Var, null);
        this.G = ig8Var;
    }

    @Override
    public final boolean f() {
        u69 T;
        kg8 kg8Var = this.G.d;
        smb smbVar = kg8Var.c;
        View F = smbVar.F(this);
        if (F == null) {
            T = null;
        } else {
            T = smbVar.T(F);
        }
        if (T != null) {
            int b = T.b();
            int i = kg8Var.E;
            if (i == kg8Var.n && b == (kg8Var.o0 + i) - 1) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final boolean g(ng8 ng8Var) {
        u69 T;
        int b;
        kg8 kg8Var = this.G.d;
        smb smbVar = kg8Var.c;
        View F = smbVar.F(ng8Var);
        if (F == null) {
            T = null;
        } else {
            T = smbVar.T(F);
        }
        if (T != null && (b = T.b()) != -1) {
            return kg8Var.x[b - kg8Var.o0];
        }
        return false;
    }

    @Override
    public final void h(pz pzVar, ActionMode actionMode) {
        if (pzVar.isFocused() && pzVar.hasSelection()) {
            Menu menu = actionMode.getMenu();
            if (menu.findItem(16908321) != null) {
                yv1.E6(menu, this.G.d.f.h, false, true, true, true);
            }
        }
    }

    @Override
    public final void i(ng8 ng8Var, boolean z) {
        u69 T;
        int b;
        kg8 kg8Var = this.G.d;
        kg8Var.c.getChildCount();
        if (z && kg8Var.M) {
            Arrays.fill(kg8Var.x, false);
            for (int i = kg8Var.o0; i < kg8Var.o0 + kg8Var.E; i++) {
                u69 K = kg8Var.c.K(i);
                if (K != null) {
                    View view = K.a;
                    if (view instanceof ng8) {
                        ((ng8) view).r.a(false, true);
                    }
                }
            }
        }
        super.i(ng8Var, z);
        smb smbVar = kg8Var.c;
        View F = smbVar.F(ng8Var);
        if (F == null) {
            T = null;
        } else {
            T = smbVar.T(F);
        }
        if (T != null && (b = T.b()) != -1) {
            kg8Var.x[b - kg8Var.o0] = z;
        }
        kg8Var.k0();
    }

    @Override
    public final void j(boolean z) {
        this.G.d.o0(this, z);
    }

    @Override
    public final void k(ng8 ng8Var) {
        this.G.d.p0(ng8Var);
    }

    @Override
    public final boolean m(ArrayList arrayList) {
        kg8 kg8Var = this.G.d;
        if (!arrayList.isEmpty()) {
            kg8Var.c.getClass();
            int R = RecyclerView.R(this) - kg8Var.o0;
            if (R >= 0) {
                pz pzVar = this.d;
                pzVar.getText().replace(pzVar.getSelectionStart(), pzVar.getSelectionEnd(), (CharSequence) arrayList.remove(0));
                int i = R + 1;
                while (!arrayList.isEmpty() && i < kg8Var.n) {
                    for (int length = kg8Var.w.length - 1; length > i; length--) {
                        CharSequence[] charSequenceArr = kg8Var.w;
                        charSequenceArr[length] = charSequenceArr[length - 1];
                    }
                    kg8Var.w[i] = (CharSequence) arrayList.remove(0);
                    kg8Var.E++;
                    i++;
                }
                kg8Var.v0();
                kg8Var.h0 = (kg8Var.o0 + i) - 1;
                kg8Var.b.f();
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

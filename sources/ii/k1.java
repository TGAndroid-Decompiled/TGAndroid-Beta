package ii;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ah;
import org.telegram.ui.Components.b80;
import org.telegram.ui.Components.nz;
import org.telegram.ui.zi0;
public final class k1 implements View.OnClickListener {
    public final int f12484a;
    public final e2 f12485b;

    public k1(e2 e2Var, int i10) {
        this.f12484a = i10;
        this.f12485b = e2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        q5 T2;
        t5 o9;
        String str;
        switch (this.f12484a) {
            case 0:
                this.f12485b.r0();
                return;
            case 1:
                e2 e2Var = this.f12485b;
                if (!e2Var.P.H2()) {
                    e2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                i2 i2Var = this.f12485b.P.Q3;
                if (i2Var != null) {
                    i2Var.k();
                    return;
                }
                return;
            case 3:
                i2 i2Var2 = this.f12485b.P.Q3;
                if (i2Var2 != null) {
                    i2Var2.i();
                    return;
                }
                return;
            case 4:
                e2.S(this.f12485b);
                return;
            case 5:
                e2 e2Var2 = this.f12485b;
                if (e2Var2.B0) {
                    e2Var2.k0(true);
                    i1 R2 = e2Var2.P.R2();
                    if (R2 != null) {
                        R2.r();
                        AndroidUtilities.showKeyboard(R2);
                        return;
                    }
                    return;
                }
                if (e2Var2.A0 == null) {
                    nz nzVar = new nz(e2Var2, true, false, false, e2Var2.getParentActivity(), true, null, e2Var2.O, true, e2Var2.getResourceProvider(), false, false);
                    e2Var2.A0 = nzVar;
                    nzVar.setVisibility(8);
                    nz nzVar2 = e2Var2.A0;
                    nzVar2.f29157w2 = false;
                    nzVar2.setDelegate(new v1(e2Var2));
                    int indexOfChild = e2Var2.O.indexOfChild(e2Var2.f12313a0);
                    if (indexOfChild < 0) {
                        indexOfChild = e2Var2.O.getChildCount();
                    }
                    FrameLayout.LayoutParams e7 = w7.z5.e(-1, e2Var2.j0(), 87);
                    e7.bottomMargin = e2Var2.T0;
                    e2Var2.O.addView(e2Var2.A0, indexOfChild, e7);
                }
                int j02 = e2Var2.j0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e2Var2.A0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = w7.z5.e(-1, j02, 87);
                } else {
                    layoutParams.height = j02;
                }
                layoutParams.bottomMargin = e2Var2.T0;
                e2Var2.A0.setLayoutParams(layoutParams);
                e2Var2.A0.setVisibility(0);
                e2Var2.B0 = true;
                e2Var2.D0 = j02 + e2Var2.T0;
                i1 R22 = e2Var2.P.R2();
                if (R22 != null) {
                    AndroidUtilities.hideKeyboard(R22);
                }
                e2Var2.h0();
                e2Var2.f12315b0.j(ah.d, true);
                return;
            case 6:
                final e2 e2Var3 = this.f12485b;
                b80 b80Var = e2Var3.f12344x0;
                if (b80Var != null) {
                    b80Var.u();
                    e2Var3.f12344x0 = null;
                }
                final b80 H = b80.H(e2Var3, view);
                H.Q = true;
                a S2 = e2Var3.P.S2();
                if (S2 != null && S2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                H.j(z10, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new n1(e2Var3, S2, 5));
                if (S2 != null && S2.b() && !S2.a() && !S2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new n1(e2Var3, S2, 6));
                if (S2 != null && S2.b() && !S2.a() && S2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new n1(e2Var3, S2, 7));
                if (S2 != null && S2.b() && S2.a() && !S2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new n1(e2Var3, S2, 8));
                if (S2 != null && (S2.f12186b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i10 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                x3 x3Var = e2Var3.P;
                Objects.requireNonNull(x3Var);
                H.j(z14, i10, null, string, new b(x3Var, 1));
                boolean o22 = e2Var3.P.o2();
                boolean r22 = e2Var3.P.r2();
                if (o22 || r22) {
                    H.k();
                    if (o22) {
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        e2Var3.P.t3(false);
                                        H.u();
                                        return;
                                    default:
                                        e2Var3.P.t3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (r22) {
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        e2Var3.P.t3(false);
                                        H.u();
                                        return;
                                    default:
                                        e2Var3.P.t3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                e2Var3.f12344x0 = H;
                return;
            case 7:
                e2 e2Var4 = this.f12485b;
                b80 b80Var2 = e2Var4.f12344x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (b80Var2 != null) {
                    b80Var2.u();
                    e2Var4.f12344x0 = null;
                }
                x3 x3Var2 = e2Var4.P;
                q5 q5Var = x3Var2.f12772p4;
                if (q5Var == null && (T2 = x3Var2.T2()) != null && T2.getModel() != null) {
                    View findFocus = e2Var4.P.findFocus();
                    if ((findFocus instanceof i1) && (o9 = T2.o((i1) findFocus)) != null) {
                        pagetablecell = o9.f12661b;
                    }
                    if (pagetablecell != null) {
                        e2Var4.P.i2(T2);
                        if (T2.H.add(pagetablecell)) {
                            T2.v.invalidate();
                            T2.t();
                        }
                        q5Var = T2;
                    }
                }
                if (q5Var != null && q5Var.getModel() != null && !q5Var.H.isEmpty()) {
                    e2Var4.P.H4(q5Var);
                    return;
                } else {
                    e2Var4.P.T1(f6.u(2, 2));
                    return;
                }
            case 8:
                e2 e2Var5 = this.f12485b;
                b80 b80Var3 = e2Var5.f12344x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (b80Var3 != null) {
                    b80Var3.u();
                    e2Var5.f12344x0 = null;
                }
                a S22 = e2Var5.P.S2();
                if (S22 != null) {
                    TL_iv.PageBlock pageBlock = S22.f12186b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = e2Var5.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                r.S(parentActivity, str, new ai.g3(21, e2Var5, pageblockmath), e2Var5.getResourceProvider());
                return;
            case 9:
                e2 e2Var6 = this.f12485b;
                e2Var6.P.f12762i4 = null;
                e2Var6.o0(90, 0);
                return;
            case 10:
                e2 e2Var7 = this.f12485b;
                e2Var7.r0();
                zi0 zi0Var = e2Var7.O0;
                if (zi0Var != null) {
                    zi0Var.h(true);
                    e2Var7.O0 = null;
                    return;
                }
                return;
            case 11:
                e2 e2Var8 = this.f12485b;
                e2Var8.P.S4();
                e2Var8.y0();
                return;
            case 12:
                this.f12485b.P.b4(view);
                return;
            case 13:
                this.f12485b.P.c4();
                return;
            case 14:
                this.f12485b.P.Z3();
                return;
            case 15:
                this.f12485b.P.d4();
                return;
            default:
                this.f12485b.n0();
                return;
        }
    }
}

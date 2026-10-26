package li;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.sz;
import org.telegram.ui.Components.yg;
import org.telegram.ui.ni0;
public final class i1 implements View.OnClickListener {
    public final int f17293a;
    public final b2 f17294b;

    public i1(b2 b2Var, int i10) {
        this.f17293a = i10;
        this.f17294b = b2Var;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        p5 X2;
        s5 n10;
        String str;
        switch (this.f17293a) {
            case 0:
                this.f17294b.s0();
                return;
            case 1:
                b2 b2Var = this.f17294b;
                if (!b2Var.P.L2()) {
                    b2Var.finishFragment();
                    return;
                }
                return;
            case 2:
                f2 f2Var = this.f17294b.P.R3;
                if (f2Var != null) {
                    f2Var.k();
                    return;
                }
                return;
            case 3:
                f2 f2Var2 = this.f17294b.P.R3;
                if (f2Var2 != null) {
                    f2Var2.i();
                    return;
                }
                return;
            case 4:
                b2.V(this.f17294b);
                return;
            case 5:
                b2 b2Var2 = this.f17294b;
                if (b2Var2.B0) {
                    b2Var2.l0(true);
                    g1 V2 = b2Var2.P.V2();
                    if (V2 != null) {
                        V2.r();
                        AndroidUtilities.showKeyboard(V2);
                        return;
                    }
                    return;
                }
                if (b2Var2.A0 == null) {
                    sz szVar = new sz(b2Var2, true, false, false, b2Var2.getParentActivity(), true, null, b2Var2.O, true, b2Var2.getResourceProvider(), false, false);
                    b2Var2.A0 = szVar;
                    szVar.setVisibility(8);
                    sz szVar2 = b2Var2.A0;
                    szVar2.f32787x2 = false;
                    szVar2.setDelegate(new s1(b2Var2));
                    int indexOfChild = b2Var2.O.indexOfChild(b2Var2.f17120a0);
                    if (indexOfChild < 0) {
                        indexOfChild = b2Var2.O.getChildCount();
                    }
                    FrameLayout.LayoutParams i10 = gb1.i(-1, b2Var2.k0(), 87);
                    i10.bottomMargin = b2Var2.T0;
                    b2Var2.O.addView(b2Var2.A0, indexOfChild, i10);
                }
                int k02 = b2Var2.k0();
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) b2Var2.A0.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = gb1.i(-1, k02, 87);
                } else {
                    layoutParams.height = k02;
                }
                layoutParams.bottomMargin = b2Var2.T0;
                b2Var2.A0.setLayoutParams(layoutParams);
                b2Var2.A0.setVisibility(0);
                b2Var2.B0 = true;
                b2Var2.D0 = k02 + b2Var2.T0;
                g1 V22 = b2Var2.P.V2();
                if (V22 != null) {
                    AndroidUtilities.hideKeyboard(V22);
                }
                b2Var2.i0();
                b2Var2.f17122b0.j(yg.d, true);
                return;
            case 6:
                final b2 b2Var3 = this.f17294b;
                k80 k80Var = b2Var3.f17150x0;
                if (k80Var != null) {
                    k80Var.u();
                    b2Var3.f17150x0 = null;
                }
                final k80 H = k80.H(b2Var3, view);
                H.Q = true;
                a W2 = b2Var3.P.W2();
                if (W2 != null && W2.b()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                H.j(z10, R.drawable.field_carret_empty, null, LocaleController.getString(R.string.ArticleNone), new l1(b2Var3, W2, 5));
                if (W2 != null && W2.b() && !W2.a() && !W2.c()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                H.j(z11, R.drawable.iv_list, null, LocaleController.getString(R.string.ArticleListBulletedList), new l1(b2Var3, W2, 6));
                if (W2 != null && W2.b() && !W2.a() && W2.c()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                H.j(z12, R.drawable.iv_ordered_list, null, LocaleController.getString(R.string.ArticleListNumberedList), new l1(b2Var3, W2, 7));
                if (W2 != null && W2.b() && W2.a() && !W2.c()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                H.j(z13, R.drawable.iv_todo, null, LocaleController.getString(R.string.ArticleListChecklist), new l1(b2Var3, W2, 8));
                if (W2 != null && (W2.f17054b instanceof TL_iv.pageBlockDetails)) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                int i11 = R.drawable.iv_details;
                String string = LocaleController.getString(R.string.ArticleToggleBlock);
                v3 v3Var = b2Var3.P;
                Objects.requireNonNull(v3Var);
                H.j(z14, i11, null, string, new b(v3Var, 1));
                boolean s22 = b2Var3.P.s2();
                boolean v22 = b2Var3.P.v2();
                if (s22 || v22) {
                    H.k();
                    if (s22) {
                        H.c(R.drawable.iv_list_tab, LocaleController.getString(R.string.ArticleIndent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        b2Var3.P.x3(false);
                                        H.u();
                                        return;
                                    default:
                                        b2Var3.P.x3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                    if (v22) {
                        H.c(R.drawable.iv_list_untab, LocaleController.getString(R.string.ArticleOutdent), new Runnable() {
                            @Override
                            public final void run() {
                                switch (r3) {
                                    case 0:
                                        b2Var3.P.x3(false);
                                        H.u();
                                        return;
                                    default:
                                        b2Var3.P.x3(true);
                                        H.u();
                                        return;
                                }
                            }
                        }, false);
                    }
                }
                H.U = true;
                H.Z();
                b2Var3.f17150x0 = H;
                return;
            case 7:
                b2 b2Var4 = this.f17294b;
                k80 k80Var2 = b2Var4.f17150x0;
                TL_iv.pageTableCell pagetablecell = null;
                if (k80Var2 != null) {
                    k80Var2.u();
                    b2Var4.f17150x0 = null;
                }
                v3 v3Var2 = b2Var4.P;
                p5 p5Var = v3Var2.f17560q4;
                if (p5Var == null && (X2 = v3Var2.X2()) != null && X2.getModel() != null) {
                    View findFocus = b2Var4.P.findFocus();
                    if ((findFocus instanceof g1) && (n10 = X2.n((g1) findFocus)) != null) {
                        pagetablecell = n10.f17476b;
                    }
                    if (pagetablecell != null) {
                        b2Var4.P.m2(X2);
                        if (X2.H.add(pagetablecell)) {
                            X2.v.invalidate();
                            X2.s();
                        }
                        p5Var = X2;
                    }
                }
                if (p5Var != null && p5Var.getModel() != null && !p5Var.H.isEmpty()) {
                    b2Var4.P.L4(p5Var);
                    return;
                } else {
                    b2Var4.P.X1(d6.t(2, 2));
                    return;
                }
            case 8:
                b2 b2Var5 = this.f17294b;
                k80 k80Var3 = b2Var5.f17150x0;
                TL_iv.pageBlockMath pageblockmath = null;
                if (k80Var3 != null) {
                    k80Var3.u();
                    b2Var5.f17150x0 = null;
                }
                a W22 = b2Var5.P.W2();
                if (W22 != null) {
                    TL_iv.PageBlock pageBlock = W22.f17054b;
                    if (pageBlock instanceof TL_iv.pageBlockMath) {
                        pageblockmath = (TL_iv.pageBlockMath) pageBlock;
                    }
                }
                Activity parentActivity = b2Var5.getParentActivity();
                if (pageblockmath != null && !TextUtils.isEmpty(pageblockmath.source)) {
                    str = pageblockmath.source;
                } else {
                    str = "";
                }
                q.X(parentActivity, str, new ai.n1(29, b2Var5, pageblockmath), b2Var5.getResourceProvider());
                return;
            case 9:
                b2 b2Var6 = this.f17294b;
                b2Var6.P.f17550j4 = null;
                b2Var6.p0(90, 0);
                return;
            case 10:
                b2 b2Var7 = this.f17294b;
                b2Var7.s0();
                ni0 ni0Var = b2Var7.O0;
                if (ni0Var != null) {
                    ni0Var.g(true);
                    b2Var7.O0 = null;
                    return;
                }
                return;
            case 11:
                b2 b2Var8 = this.f17294b;
                b2Var8.P.W4();
                b2Var8.z0();
                return;
            case 12:
                this.f17294b.P.f4(view);
                return;
            case 13:
                this.f17294b.P.g4();
                return;
            case 14:
                this.f17294b.P.d4();
                return;
            case 15:
                this.f17294b.P.h4();
                return;
            default:
                this.f17294b.o0();
                return;
        }
    }
}

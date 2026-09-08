package ji;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.yg0;
import org.telegram.ui.co;
import org.telegram.ui.ee;
import org.telegram.ui.er0;
import org.telegram.ui.gr0;
import org.telegram.ui.nv;
import org.telegram.ui.ov;
import org.telegram.ui.ss;
import org.telegram.ui.uy;
import org.telegram.ui.yh0;
public final class l3 extends s4.s0 {
    public final int f14066a;
    public final Object f14067b;
    public final Object f14068c;

    public l3(int i10, Object obj, Object obj2) {
        this.f14066a = i10;
        this.f14068c = obj;
        this.f14067b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f14066a) {
            case 0:
                if (i10 == 0) {
                    ((v3) this.f14068c).f14285n3.W();
                    return;
                }
                return;
            case 5:
                ov ovVar = (ov) this.f14068c;
                nv[] nvVarArr = ovVar.f39348f;
                ((s4.s0) this.f14067b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-ov.h0(ovVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            nvVarArr[0].d.v0(0, i12, null);
                            bi.o0 o0Var = nvVarArr[0].f39065e;
                            if (o0Var != null) {
                                o0Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        nvVarArr[0].d.v0(0, i13, null);
                        bi.o0 o0Var2 = nvVarArr[0].f39065e;
                        if (o0Var2 != null) {
                            o0Var2.v0(0, i13, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                gr0 gr0Var = (gr0) this.f14068c;
                er0[] er0VarArr = gr0Var.f36784n;
                ((s4.s0) this.f14067b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            er0VarArr[0].d.v0(0, -i14, null);
                            return;
                        } else {
                            er0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((s4.s0) this.f14067b).a(recyclerView, i10);
                ((da0) this.f14068c).D.getClass();
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        View F;
        int i12;
        int i13;
        int i14;
        bh.f fVar;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f14066a) {
            case 0:
                v3 v3Var = (v3) this.f14068c;
                ((t3) this.f14067b).o(i11);
                v3Var.f14285n3.H();
                h1 h1Var = v3Var.L3;
                if (h1Var != null && (F = v3Var.F(h1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= v3Var.getHeight()) {
                        v3Var.L3 = null;
                        h1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(v3Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                d61 d61Var = ((ee) this.f14068c).f36032a;
                if (d61Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < d61Var.getChildCount(); i15++) {
                        if (!(d61Var.getChildAt(i15) instanceof t00)) {
                        }
                    }
                    return;
                }
                ((ah.g) this.f14067b).run();
                return;
            case 2:
                co coVar = (co) this.f14068c;
                co coVar2 = coVar.f35261da;
                if (coVar2 == null) {
                    coVar2 = coVar;
                }
                if (i11 != 0) {
                    coVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = coVar2.F) != null) {
                    fVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(coVar.X0);
                }
                int N0 = ((s4.c0) this.f14067b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > coVar.M3.h - 5) {
                    if (coVar.R3 == 7) {
                        if (!coVar.G6 && !coVar.C6[0]) {
                            coVar.G6 = true;
                            coVar.f35306h6.add(Integer.valueOf(coVar.V5));
                            i13 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = coVar.f35464u3;
                            i14 = ((org.telegram.ui.ActionBar.n2) coVar).classGuid;
                            int i16 = coVar.O3;
                            int i17 = coVar.V5;
                            coVar.V5 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i16, i17);
                            return;
                        }
                        return;
                    }
                    coVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 3:
                uy uyVar = (uy) this.f14067b;
                yg0 yg0Var = (yg0) this.f14068c;
                d61 d61Var2 = yg0Var.f32936c;
                if (TextUtils.isEmpty(yg0Var.f32942w)) {
                    arrayList = yg0Var.f32937e;
                } else {
                    arrayList = yg0Var.f32939n;
                }
                if (!arrayList.isEmpty()) {
                    if (d61Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < d61Var2.getChildCount(); i18++) {
                            if (!(d61Var2.getChildAt(i18) instanceof t00)) {
                            }
                        }
                    }
                    yg0Var.a(false);
                }
                if (d61Var2.K1 && !yg0Var.Q && uyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((ss) this.f14068c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f14067b);
                    return;
                }
                return;
            case 5:
                ((s4.s0) this.f14067b).b(recyclerView, i10, i11);
                ov ovVar = (ov) this.f14068c;
                nv nvVar = ovVar.f39348f[0];
                if (recyclerView == nvVar.d || recyclerView == nvVar.f39065e) {
                    float translationY = ov.i0(ovVar).getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        ov.j0(ovVar, f7);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                yh0 yh0Var = (yh0) this.f14068c;
                if (yh0Var.f43149b0 && !yh0Var.W) {
                    if (yh0Var.X - ((hg.b0) this.f14067b).N0() < 10) {
                        yh0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.s0) this.f14067b).b(recyclerView, i10, i11);
                gr0 gr0Var = (gr0) this.f14068c;
                if (recyclerView == gr0Var.f36784n[0].d) {
                    kVar = ((org.telegram.ui.ActionBar.n2) gr0Var).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        gr0.g0(gr0Var, f10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((s4.s0) this.f14067b).b(recyclerView, i10, i11);
                ((da0) this.f14068c).D.b(recyclerView, i10, i11);
                return;
            default:
                yh.m2 m2Var = (yh.m2) this.f14068c;
                yh.h2 h2Var = m2Var.f50472f;
                if (m2Var.isAttachedToWindow()) {
                    if (h2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < h2Var.getChildCount(); i19++) {
                            if (!(h2Var.getChildAt(i19) instanceof t00)) {
                            }
                        }
                    }
                    m2Var.f50471e.a();
                }
                ((nr0) this.f14067b).o();
                return;
        }
    }
}

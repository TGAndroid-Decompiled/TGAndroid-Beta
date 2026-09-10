package hi;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.a10;
import org.telegram.ui.Components.ih0;
import org.telegram.ui.Components.ma0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.wr0;
import org.telegram.ui.eo;
import org.telegram.ui.er0;
import org.telegram.ui.fe;
import org.telegram.ui.gr0;
import org.telegram.ui.ov;
import org.telegram.ui.pv;
import org.telegram.ui.ts;
import org.telegram.ui.wy;
import org.telegram.ui.zh0;
public final class p3 extends s4.s0 {
    public final int f9788a;
    public final Object f9789b;
    public final Object f9790c;

    public p3(int i10, Object obj, Object obj2) {
        this.f9788a = i10;
        this.f9790c = obj;
        this.f9789b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f9788a) {
            case 0:
                if (i10 == 0) {
                    ((z3) this.f9790c).f10011n3.W();
                    return;
                }
                return;
            case 5:
                pv pvVar = (pv) this.f9790c;
                ov[] ovVarArr = pvVar.f35910f;
                ((s4.s0) this.f9789b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-pv.h0(pvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            ovVarArr[0].d.v0(0, i12, null);
                            bi.y1 y1Var = ovVarArr[0].e;
                            if (y1Var != null) {
                                y1Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        ovVarArr[0].d.v0(0, i13, null);
                        bi.y1 y1Var2 = ovVarArr[0].e;
                        if (y1Var2 != null) {
                            y1Var2.v0(0, i13, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                gr0 gr0Var = (gr0) this.f9790c;
                er0[] er0VarArr = gr0Var.f33170n;
                ((s4.s0) this.f9789b).a(recyclerView, i10);
                if (i10 != 1) {
                    lVar = ((org.telegram.ui.ActionBar.p2) gr0Var).actionBar;
                    int i14 = (int) (-lVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
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
                ((s4.s0) this.f9789b).a(recyclerView, i10);
                ((ma0) this.f9790c).D.getClass();
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
        zg.e eVar;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f9788a) {
            case 0:
                z3 z3Var = (z3) this.f9790c;
                ((x3) this.f9789b).K(i11);
                z3Var.f10011n3.H();
                k1 k1Var = z3Var.L3;
                if (k1Var != null && (F = z3Var.F(k1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= z3Var.getHeight()) {
                        z3Var.L3 = null;
                        k1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(z3Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r61 r61Var = ((fe) this.f9790c).f32788a;
                if (r61Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < r61Var.getChildCount(); i15++) {
                        if (!(r61Var.getChildAt(i15) instanceof a10)) {
                        }
                    }
                    return;
                }
                ((bi.s) this.f9789b).run();
                return;
            case 2:
                eo eoVar = (eo) this.f9790c;
                eo eoVar2 = eoVar.f32304da;
                if (eoVar2 == null) {
                    eoVar2 = eoVar;
                }
                if (i11 != 0) {
                    eoVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = eoVar2.F) != null) {
                    eVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(eoVar.X0);
                }
                int N0 = ((s4.c0) this.f9789b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > eoVar.M3.h - 5) {
                    if (eoVar.R3 == 7) {
                        if (!eoVar.G6 && !eoVar.C6[0]) {
                            eoVar.G6 = true;
                            eoVar.f32348h6.add(Integer.valueOf(eoVar.V5));
                            i13 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = eoVar.f32506u3;
                            i14 = ((org.telegram.ui.ActionBar.p2) eoVar).classGuid;
                            int i16 = eoVar.O3;
                            int i17 = eoVar.V5;
                            eoVar.V5 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i16, i17);
                            return;
                        }
                        return;
                    }
                    eoVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 3:
                wy wyVar = (wy) this.f9789b;
                ih0 ih0Var = (ih0) this.f9790c;
                r61 r61Var2 = ih0Var.f24022c;
                if (TextUtils.isEmpty(ih0Var.f24027w)) {
                    arrayList = ih0Var.e;
                } else {
                    arrayList = ih0Var.f24024n;
                }
                if (!arrayList.isEmpty()) {
                    if (r61Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < r61Var2.getChildCount(); i18++) {
                            if (!(r61Var2.getChildAt(i18) instanceof a10)) {
                            }
                        }
                    }
                    ih0Var.a(false);
                }
                if (r61Var2.K1 && !ih0Var.Q && wyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(wyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((ts) this.f9790c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f9789b);
                    return;
                }
                return;
            case 5:
                ((s4.s0) this.f9789b).b(recyclerView, i10, i11);
                pv pvVar = (pv) this.f9790c;
                ov ovVar = pvVar.f35910f[0];
                if (recyclerView == ovVar.d || recyclerView == ovVar.e) {
                    float translationY = pv.i0(pvVar).getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        pv.j0(pvVar, f7);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                zh0 zh0Var = (zh0) this.f9790c;
                if (zh0Var.f39325b0 && !zh0Var.W) {
                    if (zh0Var.X - ((fg.a0) this.f9789b).N0() < 10) {
                        zh0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.s0) this.f9789b).b(recyclerView, i10, i11);
                gr0 gr0Var = (gr0) this.f9790c;
                if (recyclerView == gr0Var.f33170n[0].d) {
                    lVar = ((org.telegram.ui.ActionBar.p2) gr0Var).actionBar;
                    float translationY2 = lVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
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
                ((s4.s0) this.f9789b).b(recyclerView, i10, i11);
                ((ma0) this.f9790c).D.b(recyclerView, i10, i11);
                return;
            default:
                wh.m2 m2Var = (wh.m2) this.f9790c;
                wh.h2 h2Var = m2Var.f44249f;
                if (m2Var.isAttachedToWindow()) {
                    if (h2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < h2Var.getChildCount(); i19++) {
                            if (!(h2Var.getChildAt(i19) instanceof a10)) {
                            }
                        }
                    }
                    m2Var.e.a();
                }
                ((wr0) this.f9789b).o();
                return;
        }
    }
}

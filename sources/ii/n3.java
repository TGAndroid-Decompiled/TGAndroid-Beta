package ii;

import ai.p8;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.m10;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.xs0;
import org.telegram.ui.ai0;
import org.telegram.ui.eo;
import org.telegram.ui.gr0;
import org.telegram.ui.ie;
import org.telegram.ui.ir0;
import org.telegram.ui.ov;
import org.telegram.ui.pv;
import org.telegram.ui.ts;
import org.telegram.ui.vy;
public final class n3 extends s4.t0 {
    public final int f12583a;
    public final Object f12584b;
    public final Object f12585c;

    public n3(int i10, Object obj, Object obj2) {
        this.f12583a = i10;
        this.f12585c = obj;
        this.f12584b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f12583a) {
            case 0:
                if (i10 == 0) {
                    ((x3) this.f12585c).f12818l3.V();
                    return;
                }
                return;
            case 5:
                pv pvVar = (pv) this.f12585c;
                ov[] ovVarArr = pvVar.f41101f;
                ((s4.t0) this.f12584b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-pv.h0(pvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            ovVarArr[0].d.v0(0, i12, null);
                            ai.w0 w0Var = ovVarArr[0].f40781e;
                            if (w0Var != null) {
                                w0Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        ovVarArr[0].d.v0(0, i13, null);
                        ai.w0 w0Var2 = ovVarArr[0].f40781e;
                        if (w0Var2 != null) {
                            w0Var2.v0(0, i13, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ir0 ir0Var = (ir0) this.f12585c;
                gr0[] gr0VarArr = ir0Var.f38979n;
                ((s4.t0) this.f12584b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.m2) ir0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            gr0VarArr[0].d.v0(0, -i14, null);
                            return;
                        } else {
                            gr0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((s4.t0) this.f12584b).a(recyclerView, i10);
                ((ib0) this.f12585c).D.getClass();
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
        ah.h hVar;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f12583a) {
            case 0:
                x3 x3Var = (x3) this.f12585c;
                ((v3) this.f12584b).y(i11);
                x3Var.f12818l3.G();
                i1 i1Var = x3Var.J3;
                if (i1Var != null && (F = x3Var.F(i1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= x3Var.getHeight()) {
                        x3Var.J3 = null;
                        i1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(x3Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                p71 p71Var = ((ie) this.f12585c).f38880a;
                if (p71Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < p71Var.getChildCount(); i15++) {
                        if (!(p71Var.getChildAt(i15) instanceof m10)) {
                        }
                    }
                    return;
                }
                ((p8) this.f12584b).run();
                return;
            case 2:
                eo eoVar = (eo) this.f12585c;
                eo eoVar2 = eoVar.f37238da;
                if (eoVar2 == null) {
                    eoVar2 = eoVar;
                }
                if (i11 != 0) {
                    eoVar.v9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = eoVar2.F) != null) {
                    hVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(eoVar.X0);
                }
                int N0 = ((s4.d0) this.f12584b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > eoVar.M3.h - 5) {
                    if (eoVar.R3 == 7) {
                        if (!eoVar.G6 && !eoVar.C6[0]) {
                            eoVar.G6 = true;
                            eoVar.f37283h6.add(Integer.valueOf(eoVar.V5));
                            i13 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = eoVar.f37441u3;
                            i14 = ((org.telegram.ui.ActionBar.m2) eoVar).classGuid;
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
                vy vyVar = (vy) this.f12584b;
                fi0 fi0Var = (fi0) this.f12585c;
                p71 p71Var2 = fi0Var.f26078c;
                if (TextUtils.isEmpty(fi0Var.f26084w)) {
                    arrayList = fi0Var.f26079e;
                } else {
                    arrayList = fi0Var.f26081n;
                }
                if (!arrayList.isEmpty()) {
                    if (p71Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < p71Var2.getChildCount(); i18++) {
                            if (!(p71Var2.getChildAt(i18) instanceof m10)) {
                            }
                        }
                    }
                    fi0Var.a(false);
                }
                if (p71Var2.I1 && !fi0Var.Q && vyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(vyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((ts) this.f12585c).W.I1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f12584b);
                    return;
                }
                return;
            case 5:
                ((s4.t0) this.f12584b).b(recyclerView, i10, i11);
                pv pvVar = (pv) this.f12585c;
                ov ovVar = pvVar.f41101f[0];
                if (recyclerView == ovVar.d || recyclerView == ovVar.f40781e) {
                    float translationY = pv.i0(pvVar).getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
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
                ai0 ai0Var = (ai0) this.f12585c;
                if (ai0Var.f35816b0 && !ai0Var.W) {
                    if (ai0Var.X - ((gg.a0) this.f12584b).N0() < 10) {
                        ai0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.t0) this.f12584b).b(recyclerView, i10, i11);
                ir0 ir0Var = (ir0) this.f12585c;
                if (recyclerView == ir0Var.f38979n[0].d) {
                    kVar = ((org.telegram.ui.ActionBar.m2) ir0Var).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        ir0.g0(ir0Var, f10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((s4.t0) this.f12584b).b(recyclerView, i10, i11);
                ((ib0) this.f12585c).D.b(recyclerView, i10, i11);
                return;
            default:
                xh.n2 n2Var = (xh.n2) this.f12585c;
                xh.i2 i2Var = n2Var.f51626f;
                if (n2Var.isAttachedToWindow()) {
                    if (i2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < i2Var.getChildCount(); i19++) {
                            if (!(i2Var.getChildAt(i19) instanceof m10)) {
                            }
                        }
                    }
                    n2Var.f51625e.a();
                }
                ((xs0) this.f12584b).o();
                return;
        }
    }
}

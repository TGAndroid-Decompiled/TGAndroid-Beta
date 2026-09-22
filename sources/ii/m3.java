package ii;

import ai.n8;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.bs0;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.na0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.u61;
import org.telegram.ui.ai0;
import org.telegram.ui.ee;
import org.telegram.ui.fr0;
import org.telegram.ui.hr0;
import org.telegram.ui.nv;
import org.telegram.ui.ov;
import org.telegram.ui.ss;
import org.telegram.ui.uy;
import org.telegram.ui.zn;
public final class m3 extends s4.s0 {
    public final int f11504a;
    public final Object f11505b;
    public final Object f11506c;

    public m3(int i10, Object obj, Object obj2) {
        this.f11504a = i10;
        this.f11506c = obj;
        this.f11505b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f11504a) {
            case 0:
                if (i10 == 0) {
                    ((w3) this.f11506c).f11725n3.W();
                    return;
                }
                return;
            case 5:
                ov ovVar = (ov) this.f11506c;
                nv[] nvVarArr = ovVar.f36413f;
                ((s4.s0) this.f11505b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-ov.h0(ovVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            nvVarArr[0].d.w0(0, i12, null);
                            ai.w0 w0Var = nvVarArr[0].e;
                            if (w0Var != null) {
                                w0Var.w0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        nvVarArr[0].d.w0(0, i13, null);
                        ai.w0 w0Var2 = nvVarArr[0].e;
                        if (w0Var2 != null) {
                            w0Var2.w0(0, i13, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                hr0 hr0Var = (hr0) this.f11506c;
                fr0[] fr0VarArr = hr0Var.f34287n;
                ((s4.s0) this.f11505b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) hr0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            fr0VarArr[0].d.w0(0, -i14, null);
                            return;
                        } else {
                            fr0VarArr[0].d.w0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((s4.s0) this.f11505b).a(recyclerView, i10);
                ((na0) this.f11506c).D.getClass();
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        View G;
        int i12;
        int i13;
        int i14;
        ah.i iVar;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f11504a) {
            case 0:
                w3 w3Var = (w3) this.f11506c;
                ((u3) this.f11505b).y(i11);
                w3Var.f11725n3.H();
                i1 i1Var = w3Var.L3;
                if (i1Var != null && (G = w3Var.G(i1Var)) != null) {
                    if (G.getBottom() <= 0 || G.getTop() >= w3Var.getHeight()) {
                        w3Var.L3 = null;
                        i1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(w3Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                u61 u61Var = ((ee) this.f11506c).f33339a;
                if (u61Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < u61Var.getChildCount(); i15++) {
                        if (!(u61Var.getChildAt(i15) instanceof t00)) {
                        }
                    }
                    return;
                }
                ((n8) this.f11505b).run();
                return;
            case 2:
                zn znVar = (zn) this.f11506c;
                zn znVar2 = znVar.f40312da;
                if (znVar2 == null) {
                    znVar2 = znVar;
                }
                if (i11 != 0) {
                    znVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = znVar2.F) != null) {
                    iVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(znVar.X0);
                }
                int N0 = ((s4.c0) this.f11505b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > znVar.M3.h - 5) {
                    if (znVar.R3 == 7) {
                        if (!znVar.G6 && !znVar.C6[0]) {
                            znVar.G6 = true;
                            znVar.f40357h6.add(Integer.valueOf(znVar.V5));
                            i13 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = znVar.f40515u3;
                            i14 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
                            int i16 = znVar.O3;
                            int i17 = znVar.V5;
                            znVar.V5 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i16, i17);
                            return;
                        }
                        return;
                    }
                    znVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 3:
                uy uyVar = (uy) this.f11505b;
                lh0 lh0Var = (lh0) this.f11506c;
                u61 u61Var2 = lh0Var.f26110c;
                if (TextUtils.isEmpty(lh0Var.f26115w)) {
                    arrayList = lh0Var.e;
                } else {
                    arrayList = lh0Var.f26112n;
                }
                if (!arrayList.isEmpty()) {
                    if (u61Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < u61Var2.getChildCount(); i18++) {
                            if (!(u61Var2.getChildAt(i18) instanceof t00)) {
                            }
                        }
                    }
                    lh0Var.a(false);
                }
                if (u61Var2.K1 && !lh0Var.Q && uyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((ss) this.f11506c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f11505b);
                    return;
                }
                return;
            case 5:
                ((s4.s0) this.f11505b).b(recyclerView, i10, i11);
                ov ovVar = (ov) this.f11506c;
                nv nvVar = ovVar.f36413f[0];
                if (recyclerView == nvVar.d || recyclerView == nvVar.e) {
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
                ai0 ai0Var = (ai0) this.f11506c;
                if (ai0Var.f32095b0 && !ai0Var.W) {
                    if (ai0Var.X - ((gg.b0) this.f11505b).N0() < 10) {
                        ai0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.s0) this.f11505b).b(recyclerView, i10, i11);
                hr0 hr0Var = (hr0) this.f11506c;
                if (recyclerView == hr0Var.f34287n[0].d) {
                    kVar = ((org.telegram.ui.ActionBar.n2) hr0Var).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        hr0.g0(hr0Var, f10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((s4.s0) this.f11505b).b(recyclerView, i10, i11);
                ((na0) this.f11506c).D.b(recyclerView, i10, i11);
                return;
            default:
                xh.o2 o2Var = (xh.o2) this.f11506c;
                xh.j2 j2Var = o2Var.f46371f;
                if (o2Var.isAttachedToWindow()) {
                    if (j2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < j2Var.getChildCount(); i19++) {
                            if (!(j2Var.getChildAt(i19) instanceof t00)) {
                            }
                        }
                    }
                    o2Var.e.a();
                }
                ((bs0) this.f11505b).o();
                return;
        }
    }
}

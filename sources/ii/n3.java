package ii;

import ai.o8;
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
import org.telegram.ui.Components.pa0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.v00;
import org.telegram.ui.br0;
import org.telegram.ui.ge;
import org.telegram.ui.kv;
import org.telegram.ui.lv;
import org.telegram.ui.ps;
import org.telegram.ui.ty;
import org.telegram.ui.vh0;
import org.telegram.ui.xn;
import org.telegram.ui.zq0;
public final class n3 extends s4.s0 {
    public final int f11516a;
    public final Object f11517b;
    public final Object f11518c;

    public n3(int i10, Object obj, Object obj2) {
        this.f11516a = i10;
        this.f11518c = obj;
        this.f11517b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f11516a) {
            case 0:
                if (i10 == 0) {
                    ((x3) this.f11518c).f11741n3.W();
                    return;
                }
                return;
            case 5:
                lv lvVar = (lv) this.f11518c;
                kv[] kvVarArr = lvVar.f35456f;
                ((s4.s0) this.f11517b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-lv.h0(lvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            kvVarArr[0].d.w0(0, i12, null);
                            ai.w0 w0Var = kvVarArr[0].e;
                            if (w0Var != null) {
                                w0Var.w0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        kvVarArr[0].d.w0(0, i13, null);
                        ai.w0 w0Var2 = kvVarArr[0].e;
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
                br0 br0Var = (br0) this.f11518c;
                zq0[] zq0VarArr = br0Var.f32423n;
                ((s4.s0) this.f11517b).a(recyclerView, i10);
                if (i10 != 1) {
                    lVar = ((org.telegram.ui.ActionBar.o2) br0Var).actionBar;
                    int i14 = (int) (-lVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            zq0VarArr[0].d.w0(0, -i14, null);
                            return;
                        } else {
                            zq0VarArr[0].d.w0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((s4.s0) this.f11517b).a(recyclerView, i10);
                ((pa0) this.f11518c).D.getClass();
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
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f11516a) {
            case 0:
                x3 x3Var = (x3) this.f11518c;
                ((v3) this.f11517b).u(i11);
                x3Var.f11741n3.H();
                i1 i1Var = x3Var.L3;
                if (i1Var != null && (G = x3Var.G(i1Var)) != null) {
                    if (G.getBottom() <= 0 || G.getTop() >= x3Var.getHeight()) {
                        x3Var.L3 = null;
                        i1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(x3Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                t61 t61Var = ((ge) this.f11518c).f33908a;
                if (t61Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < t61Var.getChildCount(); i15++) {
                        if (!(t61Var.getChildAt(i15) instanceof v00)) {
                        }
                    }
                    return;
                }
                ((o8) this.f11517b).run();
                return;
            case 2:
                xn xnVar = (xn) this.f11518c;
                xn xnVar2 = xnVar.f39738da;
                if (xnVar2 == null) {
                    xnVar2 = xnVar;
                }
                if (i11 != 0) {
                    xnVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = xnVar2.F) != null) {
                    iVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(xnVar.X0);
                }
                int N0 = ((s4.c0) this.f11517b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > xnVar.M3.h - 5) {
                    if (xnVar.R3 == 7) {
                        if (!xnVar.G6 && !xnVar.C6[0]) {
                            xnVar.G6 = true;
                            xnVar.f39783h6.add(Integer.valueOf(xnVar.V5));
                            i13 = ((org.telegram.ui.ActionBar.o2) xnVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = xnVar.f39941u3;
                            i14 = ((org.telegram.ui.ActionBar.o2) xnVar).classGuid;
                            int i16 = xnVar.O3;
                            int i17 = xnVar.V5;
                            xnVar.V5 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i16, i17);
                            return;
                        }
                        return;
                    }
                    xnVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 3:
                ty tyVar = (ty) this.f11517b;
                lh0 lh0Var = (lh0) this.f11518c;
                t61 t61Var2 = lh0Var.f26051c;
                if (TextUtils.isEmpty(lh0Var.f26056w)) {
                    arrayList = lh0Var.e;
                } else {
                    arrayList = lh0Var.f26053n;
                }
                if (!arrayList.isEmpty()) {
                    if (t61Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < t61Var2.getChildCount(); i18++) {
                            if (!(t61Var2.getChildAt(i18) instanceof v00)) {
                            }
                        }
                    }
                    lh0Var.a(false);
                }
                if (t61Var2.K1 && !lh0Var.Q && tyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(tyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((ps) this.f11518c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f11517b);
                    return;
                }
                return;
            case 5:
                ((s4.s0) this.f11517b).b(recyclerView, i10, i11);
                lv lvVar = (lv) this.f11518c;
                kv kvVar = lvVar.f35456f[0];
                if (recyclerView == kvVar.d || recyclerView == kvVar.e) {
                    float translationY = lv.i0(lvVar).getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        lv.j0(lvVar, f7);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                vh0 vh0Var = (vh0) this.f11518c;
                if (vh0Var.f38585b0 && !vh0Var.W) {
                    if (vh0Var.X - ((gg.b0) this.f11517b).N0() < 10) {
                        vh0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.s0) this.f11517b).b(recyclerView, i10, i11);
                br0 br0Var = (br0) this.f11518c;
                if (recyclerView == br0Var.f32423n[0].d) {
                    lVar = ((org.telegram.ui.ActionBar.o2) br0Var).actionBar;
                    float translationY2 = lVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        br0.g0(br0Var, f10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((s4.s0) this.f11517b).b(recyclerView, i10, i11);
                ((pa0) this.f11518c).D.b(recyclerView, i10, i11);
                return;
            default:
                xh.p2 p2Var = (xh.p2) this.f11518c;
                xh.k2 k2Var = p2Var.f46408f;
                if (p2Var.isAttachedToWindow()) {
                    if (k2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < k2Var.getChildCount(); i19++) {
                            if (!(k2Var.getChildAt(i19) instanceof v00)) {
                            }
                        }
                    }
                    p2Var.e.a();
                }
                ((bs0) this.f11517b).o();
                return;
        }
    }
}

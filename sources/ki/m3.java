package ki;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.ks0;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.xa0;
import org.telegram.ui.av;
import org.telegram.ui.ce;
import org.telegram.ui.cy;
import org.telegram.ui.fs;
import org.telegram.ui.ih0;
import org.telegram.ui.mq0;
import org.telegram.ui.oq0;
import org.telegram.ui.qn;
import org.telegram.ui.zu;
public final class m3 extends s4.r0 {
    public final int f15388a;
    public final Object f15389b;
    public final Object f15390c;

    public m3(int i10, Object obj, Object obj2) {
        this.f15388a = i10;
        this.f15390c = obj;
        this.f15389b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f15388a) {
            case 0:
                if (i10 == 0) {
                    ((w3) this.f15390c).f15604l3.V();
                    return;
                }
                return;
            case 5:
                av avVar = (av) this.f15390c;
                zu[] zuVarArr = avVar.f35430f;
                ((s4.r0) this.f15389b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-av.h0(avVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            zuVarArr[0].d.v0(0, i12, null);
                            ai.u1 u1Var = zuVarArr[0].e;
                            if (u1Var != null) {
                                u1Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        zuVarArr[0].d.v0(0, i13, null);
                        ai.u1 u1Var2 = zuVarArr[0].e;
                        if (u1Var2 != null) {
                            u1Var2.v0(0, i13, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                oq0 oq0Var = (oq0) this.f15390c;
                mq0[] mq0VarArr = oq0Var.f39964n;
                ((s4.r0) this.f15389b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) oq0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            mq0VarArr[0].d.v0(0, -i14, null);
                            return;
                        } else {
                            mq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((s4.r0) this.f15389b).a(recyclerView, i10);
                ((xa0) this.f15390c).D.getClass();
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
        switch (this.f15388a) {
            case 0:
                w3 w3Var = (w3) this.f15390c;
                ((u3) this.f15389b).A(i11);
                w3Var.f15604l3.G();
                h1 h1Var = w3Var.J3;
                if (h1Var != null && (F = w3Var.F(h1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= w3Var.getHeight()) {
                        w3Var.J3 = null;
                        h1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(w3Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                c71 c71Var = ((ce) this.f15390c).f35945a;
                if (c71Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < c71Var.getChildCount(); i15++) {
                        if (!(c71Var.getChildAt(i15) instanceof b10)) {
                        }
                    }
                    return;
                }
                ((ah.g) this.f15389b).run();
                return;
            case 2:
                qn qnVar = (qn) this.f15390c;
                qn qnVar2 = qnVar.f40662da;
                if (qnVar2 == null) {
                    qnVar2 = qnVar;
                }
                if (i11 != 0) {
                    qnVar.v9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = qnVar2.F) != null) {
                    fVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(qnVar.X0);
                }
                int N0 = ((s4.b0) this.f15389b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > qnVar.M3.h - 5) {
                    if (qnVar.R3 == 7) {
                        if (!qnVar.G6 && !qnVar.C6[0]) {
                            qnVar.G6 = true;
                            qnVar.f40707h6.add(Integer.valueOf(qnVar.V5));
                            i13 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = qnVar.f40865u3;
                            i14 = ((org.telegram.ui.ActionBar.n2) qnVar).classGuid;
                            int i16 = qnVar.O3;
                            int i17 = qnVar.V5;
                            qnVar.V5 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i16, i17);
                            return;
                        }
                        return;
                    }
                    qnVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 3:
                cy cyVar = (cy) this.f15389b;
                uh0 uh0Var = (uh0) this.f15390c;
                c71 c71Var2 = uh0Var.f30935c;
                if (TextUtils.isEmpty(uh0Var.f30940w)) {
                    arrayList = uh0Var.e;
                } else {
                    arrayList = uh0Var.f30937n;
                }
                if (!arrayList.isEmpty()) {
                    if (c71Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < c71Var2.getChildCount(); i18++) {
                            if (!(c71Var2.getChildAt(i18) instanceof b10)) {
                            }
                        }
                    }
                    uh0Var.a(false);
                }
                if (c71Var2.I1 && !uh0Var.Q && cyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(cyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((fs) this.f15390c).W.I1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f15389b);
                    return;
                }
                return;
            case 5:
                ((s4.r0) this.f15389b).b(recyclerView, i10, i11);
                av avVar = (av) this.f15390c;
                zu zuVar = avVar.f35430f[0];
                if (recyclerView == zuVar.d || recyclerView == zuVar.e) {
                    float translationY = av.i0(avVar).getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        av.j0(avVar, f7);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ih0 ih0Var = (ih0) this.f15390c;
                if (ih0Var.f37979b0 && !ih0Var.W) {
                    if (ih0Var.X - ((hg.a0) this.f15389b).N0() < 10) {
                        ih0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.r0) this.f15389b).b(recyclerView, i10, i11);
                oq0 oq0Var = (oq0) this.f15390c;
                if (recyclerView == oq0Var.f39964n[0].d) {
                    kVar = ((org.telegram.ui.ActionBar.n2) oq0Var).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        oq0.g0(oq0Var, f10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((s4.r0) this.f15389b).b(recyclerView, i10, i11);
                ((xa0) this.f15390c).D.b(recyclerView, i10, i11);
                return;
            case 9:
                yh.l2 l2Var = (yh.l2) this.f15390c;
                yh.g2 g2Var = l2Var.f50368f;
                if (l2Var.isAttachedToWindow()) {
                    if (g2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < g2Var.getChildCount(); i19++) {
                            if (!(g2Var.getChildAt(i19) instanceof b10)) {
                            }
                        }
                    }
                    l2Var.e.a();
                }
                ((ks0) this.f15389b).o();
                return;
            default:
                zh.q qVar = (zh.q) this.f15389b;
                float translationY3 = qVar.getTranslationY();
                float f11 = ((zh.n0) this.f15390c).f52043d0;
                if (translationY3 != f11) {
                    qVar.setTranslationY(f11);
                    qVar.invalidate();
                    return;
                }
                return;
        }
    }
}

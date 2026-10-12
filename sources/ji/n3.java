package ji;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.db0;
import org.telegram.ui.Components.f10;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ns0;
import org.telegram.ui.Components.zh0;
import org.telegram.ui.ei0;
import org.telegram.ui.fo;
import org.telegram.ui.ke;
import org.telegram.ui.kr0;
import org.telegram.ui.mr0;
import org.telegram.ui.rv;
import org.telegram.ui.sv;
import org.telegram.ui.ws;
import org.telegram.ui.yy;
public final class n3 extends s4.r0 {
    public final int f13428a;
    public final Object f13429b;
    public final Object f13430c;

    public n3(int i10, Object obj, Object obj2) {
        this.f13428a = i10;
        this.f13430c = obj;
        this.f13429b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f13428a) {
            case 0:
                if (i10 == 0) {
                    ((x3) this.f13430c).f13639l3.V();
                    return;
                }
                return;
            case 5:
                sv svVar = (sv) this.f13430c;
                rv[] rvVarArr = svVar.f40220f;
                ((s4.r0) this.f13429b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-sv.h0(svVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            rvVarArr[0].d.v0(0, i12, null);
                            bi.o0 o0Var = rvVarArr[0].e;
                            if (o0Var != null) {
                                o0Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        rvVarArr[0].d.v0(0, i13, null);
                        bi.o0 o0Var2 = rvVarArr[0].e;
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
                mr0 mr0Var = (mr0) this.f13430c;
                kr0[] kr0VarArr = mr0Var.f38322n;
                ((s4.r0) this.f13429b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.m2) mr0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            kr0VarArr[0].d.v0(0, -i14, null);
                            return;
                        } else {
                            kr0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((s4.r0) this.f13429b).a(recyclerView, i10);
                ((db0) this.f13430c).D.getClass();
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
        switch (this.f13428a) {
            case 0:
                x3 x3Var = (x3) this.f13430c;
                ((v3) this.f13429b).G(i11);
                x3Var.f13639l3.G();
                h1 h1Var = x3Var.J3;
                if (h1Var != null && (F = x3Var.F(h1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= x3Var.getHeight()) {
                        x3Var.J3 = null;
                        h1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(x3Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                h71 h71Var = ((ke) this.f13430c).f37629a;
                if (h71Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < h71Var.getChildCount(); i15++) {
                        if (!(h71Var.getChildAt(i15) instanceof f10)) {
                        }
                    }
                    return;
                }
                ((ah.g) this.f13429b).run();
                return;
            case 2:
                fo foVar = (fo) this.f13430c;
                fo foVar2 = foVar.f35921da;
                if (foVar2 == null) {
                    foVar2 = foVar;
                }
                if (i11 != 0) {
                    foVar.v9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = foVar2.F) != null) {
                    fVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(foVar.X0);
                }
                int N0 = ((s4.b0) this.f13429b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > foVar.M3.h - 5) {
                    if (foVar.R3 == 7) {
                        if (!foVar.G6 && !foVar.C6[0]) {
                            foVar.G6 = true;
                            foVar.f35966h6.add(Integer.valueOf(foVar.V5));
                            i13 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = foVar.f36124u3;
                            i14 = ((org.telegram.ui.ActionBar.m2) foVar).classGuid;
                            int i16 = foVar.O3;
                            int i17 = foVar.V5;
                            foVar.V5 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i16, i17);
                            return;
                        }
                        return;
                    }
                    foVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 3:
                yy yyVar = (yy) this.f13429b;
                zh0 zh0Var = (zh0) this.f13430c;
                h71 h71Var2 = zh0Var.f31870c;
                if (TextUtils.isEmpty(zh0Var.f31875w)) {
                    arrayList = zh0Var.e;
                } else {
                    arrayList = zh0Var.f31872n;
                }
                if (!arrayList.isEmpty()) {
                    if (h71Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < h71Var2.getChildCount(); i18++) {
                            if (!(h71Var2.getChildAt(i18) instanceof f10)) {
                            }
                        }
                    }
                    zh0Var.a(false);
                }
                if (h71Var2.I1 && !zh0Var.Q && yyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(yyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((ws) this.f13430c).W.I1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f13429b);
                    return;
                }
                return;
            case 5:
                ((s4.r0) this.f13429b).b(recyclerView, i10, i11);
                sv svVar = (sv) this.f13430c;
                rv rvVar = svVar.f40220f[0];
                if (recyclerView == rvVar.d || recyclerView == rvVar.e) {
                    float translationY = sv.i0(svVar).getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        sv.j0(svVar, f7);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                ei0 ei0Var = (ei0) this.f13430c;
                if (ei0Var.f35587b0 && !ei0Var.W) {
                    if (ei0Var.X - ((hg.a0) this.f13429b).N0() < 10) {
                        ei0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.r0) this.f13429b).b(recyclerView, i10, i11);
                mr0 mr0Var = (mr0) this.f13430c;
                if (recyclerView == mr0Var.f38322n[0].d) {
                    kVar = ((org.telegram.ui.ActionBar.m2) mr0Var).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        mr0.g0(mr0Var, f10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((s4.r0) this.f13429b).b(recyclerView, i10, i11);
                ((db0) this.f13430c).D.b(recyclerView, i10, i11);
                return;
            default:
                yh.m2 m2Var = (yh.m2) this.f13430c;
                yh.h2 h2Var = m2Var.f48997f;
                if (m2Var.isAttachedToWindow()) {
                    if (h2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < h2Var.getChildCount(); i19++) {
                            if (!(h2Var.getChildAt(i19) instanceof f10)) {
                            }
                        }
                    }
                    m2Var.e.a();
                }
                ((ns0) this.f13429b).o();
                return;
        }
    }
}

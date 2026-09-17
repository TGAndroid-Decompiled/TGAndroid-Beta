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
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.ai0;
import org.telegram.ui.bo;
import org.telegram.ui.fe;
import org.telegram.ui.gr0;
import org.telegram.ui.ir0;
import org.telegram.ui.ov;
import org.telegram.ui.pv;
import org.telegram.ui.us;
import org.telegram.ui.wy;
public final class m3 extends s4.s0 {
    public final int f11503a;
    public final Object f11504b;
    public final Object f11505c;

    public m3(int i10, Object obj, Object obj2) {
        this.f11503a = i10;
        this.f11505c = obj;
        this.f11504b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f11503a) {
            case 0:
                if (i10 == 0) {
                    ((w3) this.f11505c).f11724n3.W();
                    return;
                }
                return;
            case 5:
                pv pvVar = (pv) this.f11505c;
                ov[] ovVarArr = pvVar.f36737f;
                ((s4.s0) this.f11504b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-pv.h0(pvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            ovVarArr[0].d.w0(0, i12, null);
                            ai.w0 w0Var = ovVarArr[0].e;
                            if (w0Var != null) {
                                w0Var.w0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        ovVarArr[0].d.w0(0, i13, null);
                        ai.w0 w0Var2 = ovVarArr[0].e;
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
                ir0 ir0Var = (ir0) this.f11505c;
                gr0[] gr0VarArr = ir0Var.f34661n;
                ((s4.s0) this.f11504b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.o2) ir0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            gr0VarArr[0].d.w0(0, -i14, null);
                            return;
                        } else {
                            gr0VarArr[0].d.w0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((s4.s0) this.f11504b).a(recyclerView, i10);
                ((ca0) this.f11505c).D.getClass();
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
        switch (this.f11503a) {
            case 0:
                w3 w3Var = (w3) this.f11505c;
                ((u3) this.f11504b).u(i11);
                w3Var.f11724n3.H();
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
                f61 f61Var = ((fe) this.f11505c).f33620a;
                if (f61Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < f61Var.getChildCount(); i15++) {
                        if (!(f61Var.getChildAt(i15) instanceof t00)) {
                        }
                    }
                    return;
                }
                ((n8) this.f11504b).run();
                return;
            case 2:
                bo boVar = (bo) this.f11505c;
                bo boVar2 = boVar.f32263da;
                if (boVar2 == null) {
                    boVar2 = boVar;
                }
                if (i11 != 0) {
                    boVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (iVar = boVar2.F) != null) {
                    iVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(boVar.X0);
                }
                int N0 = ((s4.c0) this.f11504b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > boVar.M3.h - 5) {
                    if (boVar.R3 == 7) {
                        if (!boVar.G6 && !boVar.C6[0]) {
                            boVar.G6 = true;
                            boVar.f32308h6.add(Integer.valueOf(boVar.V5));
                            i13 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = boVar.f32466u3;
                            i14 = ((org.telegram.ui.ActionBar.o2) boVar).classGuid;
                            int i16 = boVar.O3;
                            int i17 = boVar.V5;
                            boVar.V5 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i16, i17);
                            return;
                        }
                        return;
                    }
                    boVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 3:
                wy wyVar = (wy) this.f11504b;
                zg0 zg0Var = (zg0) this.f11505c;
                f61 f61Var2 = zg0Var.f30517c;
                if (TextUtils.isEmpty(zg0Var.f30522w)) {
                    arrayList = zg0Var.e;
                } else {
                    arrayList = zg0Var.f30519n;
                }
                if (!arrayList.isEmpty()) {
                    if (f61Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < f61Var2.getChildCount(); i18++) {
                            if (!(f61Var2.getChildAt(i18) instanceof t00)) {
                            }
                        }
                    }
                    zg0Var.a(false);
                }
                if (f61Var2.K1 && !zg0Var.Q && wyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(wyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((us) this.f11505c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f11504b);
                    return;
                }
                return;
            case 5:
                ((s4.s0) this.f11504b).b(recyclerView, i10, i11);
                pv pvVar = (pv) this.f11505c;
                ov ovVar = pvVar.f36737f[0];
                if (recyclerView == ovVar.d || recyclerView == ovVar.e) {
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
                ai0 ai0Var = (ai0) this.f11505c;
                if (ai0Var.f31872b0 && !ai0Var.W) {
                    if (ai0Var.X - ((gg.b0) this.f11504b).N0() < 10) {
                        ai0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.s0) this.f11504b).b(recyclerView, i10, i11);
                ir0 ir0Var = (ir0) this.f11505c;
                if (recyclerView == ir0Var.f34661n[0].d) {
                    kVar = ((org.telegram.ui.ActionBar.o2) ir0Var).actionBar;
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
                ((s4.s0) this.f11504b).b(recyclerView, i10, i11);
                ((ca0) this.f11505c).D.b(recyclerView, i10, i11);
                return;
            default:
                xh.n2 n2Var = (xh.n2) this.f11505c;
                xh.i2 i2Var = n2Var.f46060f;
                if (n2Var.isAttachedToWindow()) {
                    if (i2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < i2Var.getChildCount(); i19++) {
                            if (!(i2Var.getChildAt(i19) instanceof t00)) {
                            }
                        }
                    }
                    n2Var.e.a();
                }
                ((or0) this.f11504b).o();
                return;
        }
    }
}

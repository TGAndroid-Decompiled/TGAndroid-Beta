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
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.Components.yg0;
import org.telegram.ui.bo;
import org.telegram.ui.de;
import org.telegram.ui.er0;
import org.telegram.ui.gr0;
import org.telegram.ui.mv;
import org.telegram.ui.nv;
import org.telegram.ui.ss;
import org.telegram.ui.uy;
import org.telegram.ui.yh0;
public final class m3 extends s4.s0 {
    public final int f11502a;
    public final Object f11503b;
    public final Object f11504c;

    public m3(int i10, Object obj, Object obj2) {
        this.f11502a = i10;
        this.f11504c = obj;
        this.f11503b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f11502a) {
            case 0:
                if (i10 == 0) {
                    ((w3) this.f11504c).f11723n3.W();
                    return;
                }
                return;
            case 5:
                nv nvVar = (nv) this.f11504c;
                mv[] mvVarArr = nvVar.f36055f;
                ((s4.s0) this.f11503b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-nv.h0(nvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            mvVarArr[0].d.v0(0, i12, null);
                            ai.w0 w0Var = mvVarArr[0].e;
                            if (w0Var != null) {
                                w0Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        mvVarArr[0].d.v0(0, i13, null);
                        ai.w0 w0Var2 = mvVarArr[0].e;
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
                gr0 gr0Var = (gr0) this.f11504c;
                er0[] er0VarArr = gr0Var.f33927n;
                ((s4.s0) this.f11503b).a(recyclerView, i10);
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
                ((s4.s0) this.f11503b).a(recyclerView, i10);
                ((ca0) this.f11504c).D.getClass();
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
        switch (this.f11502a) {
            case 0:
                w3 w3Var = (w3) this.f11504c;
                ((u3) this.f11503b).u(i11);
                w3Var.f11723n3.H();
                i1 i1Var = w3Var.L3;
                if (i1Var != null && (F = w3Var.F(i1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= w3Var.getHeight()) {
                        w3Var.L3 = null;
                        i1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(w3Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                e61 e61Var = ((de) this.f11504c).f33004a;
                if (e61Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < e61Var.getChildCount(); i15++) {
                        if (!(e61Var.getChildAt(i15) instanceof t00)) {
                        }
                    }
                    return;
                }
                ((n8) this.f11503b).run();
                return;
            case 2:
                bo boVar = (bo) this.f11504c;
                bo boVar2 = boVar.f32281da;
                if (boVar2 == null) {
                    boVar2 = boVar;
                }
                if (i11 != 0) {
                    boVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = boVar2.F) != null) {
                    hVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(boVar.X0);
                }
                int N0 = ((s4.c0) this.f11503b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > boVar.M3.h - 5) {
                    if (boVar.R3 == 7) {
                        if (!boVar.G6 && !boVar.C6[0]) {
                            boVar.G6 = true;
                            boVar.f32325h6.add(Integer.valueOf(boVar.V5));
                            i13 = ((org.telegram.ui.ActionBar.n2) boVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = boVar.f32483u3;
                            i14 = ((org.telegram.ui.ActionBar.n2) boVar).classGuid;
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
                uy uyVar = (uy) this.f11503b;
                yg0 yg0Var = (yg0) this.f11504c;
                e61 e61Var2 = yg0Var.f30244c;
                if (TextUtils.isEmpty(yg0Var.f30249w)) {
                    arrayList = yg0Var.e;
                } else {
                    arrayList = yg0Var.f30246n;
                }
                if (!arrayList.isEmpty()) {
                    if (e61Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < e61Var2.getChildCount(); i18++) {
                            if (!(e61Var2.getChildAt(i18) instanceof t00)) {
                            }
                        }
                    }
                    yg0Var.a(false);
                }
                if (e61Var2.K1 && !yg0Var.Q && uyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((ss) this.f11504c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f11503b);
                    return;
                }
                return;
            case 5:
                ((s4.s0) this.f11503b).b(recyclerView, i10, i11);
                nv nvVar = (nv) this.f11504c;
                mv mvVar = nvVar.f36055f[0];
                if (recyclerView == mvVar.d || recyclerView == mvVar.e) {
                    float translationY = nv.i0(nvVar).getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        nv.j0(nvVar, f7);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                yh0 yh0Var = (yh0) this.f11504c;
                if (yh0Var.f39855b0 && !yh0Var.W) {
                    if (yh0Var.X - ((gg.b0) this.f11503b).N0() < 10) {
                        yh0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.s0) this.f11503b).b(recyclerView, i10, i11);
                gr0 gr0Var = (gr0) this.f11504c;
                if (recyclerView == gr0Var.f33927n[0].d) {
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
                ((s4.s0) this.f11503b).b(recyclerView, i10, i11);
                ((ca0) this.f11504c).D.b(recyclerView, i10, i11);
                return;
            default:
                xh.n2 n2Var = (xh.n2) this.f11504c;
                xh.i2 i2Var = n2Var.f46033f;
                if (n2Var.isAttachedToWindow()) {
                    if (i2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < i2Var.getChildCount(); i19++) {
                            if (!(i2Var.getChildAt(i19) instanceof t00)) {
                            }
                        }
                    }
                    n2Var.e.a();
                }
                ((nr0) this.f11503b).o();
                return;
        }
    }
}

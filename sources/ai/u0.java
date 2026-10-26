package ai;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import li.t3;
import li.v3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.ActionBar.q5;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.c10;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.cy;
import org.telegram.ui.ee;
import org.telegram.ui.jh0;
import org.telegram.ui.js;
import org.telegram.ui.un;
import org.telegram.ui.vq0;
import org.telegram.ui.yu;
import org.telegram.ui.zu;
import zh.h2;
import zh.m2;
public final class u0 extends s4.u0 {
    public final int f1942a;
    public final Object f1943b;
    public final Object f1944c;

    public u0(int i10, Object obj, Object obj2) {
        this.f1942a = i10;
        this.f1944c = obj;
        this.f1943b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f1942a) {
            case 1:
                if (i10 == 0) {
                    ((v3) this.f1944c).f17569v3.V();
                    return;
                }
                return;
            case 6:
                zu zuVar = (zu) this.f1944c;
                yu[] yuVarArr = zuVar.f46366f;
                ((s4.u0) this.f1943b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-zu.i0(zuVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            yuVarArr[0].d.w0(0, i12, null);
                            bi.r1 r1Var = yuVarArr[0].e;
                            if (r1Var != null) {
                                r1Var.w0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        yuVarArr[0].d.w0(0, i13, null);
                        bi.r1 r1Var2 = yuVarArr[0].e;
                        if (r1Var2 != null) {
                            r1Var2.w0(0, i13, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                vq0 vq0Var = (vq0) this.f1944c;
                q5[] q5VarArr = vq0Var.f44889n;
                ((s4.u0) this.f1943b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((r2) vq0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            ((mm0) q5VarArr[0].f22991f).w0(0, -i14, null);
                            return;
                        } else {
                            ((mm0) q5VarArr[0].f22991f).w0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 9:
                ((s4.u0) this.f1943b).a(recyclerView, i10);
                ((ua0) this.f1944c).D.getClass();
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
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f1942a) {
            case 0:
                x xVar = (x) this.f1943b;
                float translationY = xVar.getTranslationY();
                float f7 = ((z0) this.f1944c).f1992d0;
                if (translationY != f7) {
                    xVar.setTranslationY(f7);
                    xVar.invalidate();
                    return;
                }
                return;
            case 1:
                v3 v3Var = (v3) this.f1944c;
                ((t3) this.f1943b).A(i11);
                v3Var.f17569v3.G();
                li.g1 g1Var = v3Var.T3;
                if (g1Var != null && (F = v3Var.F(g1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= v3Var.getHeight()) {
                        v3Var.T3 = null;
                        g1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(v3Var);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                r71 r71Var = ((ee) this.f1944c).f39091a;
                if (r71Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < r71Var.getChildCount(); i15++) {
                        if (!(r71Var.getChildAt(i15) instanceof c10)) {
                        }
                    }
                    return;
                }
                ((ag.r0) this.f1943b).run();
                return;
            case 3:
                un unVar = (un) this.f1944c;
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(unVar.f44295j1);
                }
                int N0 = ((s4.c0) this.f1943b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > unVar.Y3.h - 5) {
                    if (unVar.f44224d4 == 7) {
                        if (!unVar.S6 && !unVar.O6[0]) {
                            unVar.S6 = true;
                            unVar.f44424t6.add(Integer.valueOf(unVar.f44275h6));
                            i13 = ((r2) unVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = unVar.G3;
                            i14 = ((r2) unVar).classGuid;
                            int i16 = unVar.f44183a4;
                            int i17 = unVar.f44275h6;
                            unVar.f44275h6 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i16, i17);
                            return;
                        }
                        return;
                    }
                    unVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 4:
                cy cyVar = (cy) this.f1943b;
                wh0 wh0Var = (wh0) this.f1944c;
                r71 r71Var2 = wh0Var.f34444c;
                if (TextUtils.isEmpty(wh0Var.f34449w)) {
                    arrayList = wh0Var.e;
                } else {
                    arrayList = wh0Var.f34446n;
                }
                if (!arrayList.isEmpty()) {
                    if (r71Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < r71Var2.getChildCount(); i18++) {
                            if (!(r71Var2.getChildAt(i18) instanceof c10)) {
                            }
                        }
                    }
                    wh0Var.a(false);
                }
                if (r71Var2.I1 && !wh0Var.Q && cyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(cyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 5:
                if (((js) this.f1944c).W.I1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f1943b);
                    return;
                }
                return;
            case 6:
                ((s4.u0) this.f1943b).b(recyclerView, i10, i11);
                zu zuVar = (zu) this.f1944c;
                yu yuVar = zuVar.f46366f[0];
                if (recyclerView == yuVar.d || recyclerView == yuVar.e) {
                    float translationY2 = zu.j0(zuVar).getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        zu.k0(zuVar, f10);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                jh0 jh0Var = (jh0) this.f1944c;
                if (jh0Var.f40648b0 && !jh0Var.W) {
                    if (jh0Var.X - ((ig.a0) this.f1943b).N0() < 10) {
                        jh0Var.f0(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((s4.u0) this.f1943b).b(recyclerView, i10, i11);
                vq0 vq0Var = (vq0) this.f1944c;
                if (recyclerView == ((mm0) vq0Var.f44889n[0].f22991f)) {
                    kVar = ((r2) vq0Var).actionBar;
                    float translationY3 = kVar.getTranslationY();
                    float f11 = translationY3 - i11;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY3) {
                        vq0.h0(vq0Var, f11);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((s4.u0) this.f1943b).b(recyclerView, i10, i11);
                ((ua0) this.f1944c).D.b(recyclerView, i10, i11);
                return;
            default:
                m2 m2Var = (m2) this.f1944c;
                h2 h2Var = m2Var.f53146f;
                if (m2Var.isAttachedToWindow()) {
                    if (h2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < h2Var.getChildCount(); i19++) {
                            if (!(h2Var.getChildAt(i19) instanceof c10)) {
                            }
                        }
                    }
                    m2Var.e.b();
                }
                ((vs0) this.f1943b).p();
                return;
        }
    }
}

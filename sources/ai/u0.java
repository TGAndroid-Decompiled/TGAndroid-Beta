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
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.xh0;
import org.telegram.ui.av;
import org.telegram.ui.bv;
import org.telegram.ui.ee;
import org.telegram.ui.ey;
import org.telegram.ui.lh0;
import org.telegram.ui.ls;
import org.telegram.ui.wn;
import org.telegram.ui.xq0;
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
                    ((v3) this.f1944c).f17568v3.V();
                    return;
                }
                return;
            case 6:
                bv bvVar = (bv) this.f1944c;
                av[] avVarArr = bvVar.f38108f;
                ((s4.u0) this.f1943b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-bv.i0(bvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            avVarArr[0].d.w0(0, i12, null);
                            bi.r1 r1Var = avVarArr[0].e;
                            if (r1Var != null) {
                                r1Var.w0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        avVarArr[0].d.w0(0, i13, null);
                        bi.r1 r1Var2 = avVarArr[0].e;
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
                xq0 xq0Var = (xq0) this.f1944c;
                q5[] q5VarArr = xq0Var.f45764n;
                ((s4.u0) this.f1943b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((r2) xq0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            ((nm0) q5VarArr[0].f22992f).w0(0, -i14, null);
                            return;
                        } else {
                            ((nm0) q5VarArr[0].f22992f).w0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 9:
                ((s4.u0) this.f1943b).a(recyclerView, i10);
                ((va0) this.f1944c).D.getClass();
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
                v3Var.f17568v3.G();
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
                s71 s71Var = ((ee) this.f1944c).f38846a;
                if (s71Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < s71Var.getChildCount(); i15++) {
                        if (!(s71Var.getChildAt(i15) instanceof c10)) {
                        }
                    }
                    return;
                }
                ((ag.r0) this.f1943b).run();
                return;
            case 3:
                wn wnVar = (wn) this.f1944c;
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(wnVar.f45163j1);
                }
                int N0 = ((s4.c0) this.f1943b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > wnVar.Y3.h - 5) {
                    if (wnVar.f45091d4 == 7) {
                        if (!wnVar.W6 && !wnVar.S6[0]) {
                            wnVar.W6 = true;
                            wnVar.f45345x6.add(Integer.valueOf(wnVar.f45191l6));
                            i13 = ((r2) wnVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = wnVar.G3;
                            i14 = ((r2) wnVar).classGuid;
                            int i16 = wnVar.f45048a4;
                            int i17 = wnVar.f45191l6;
                            wnVar.f45191l6 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i16, i17);
                            return;
                        }
                        return;
                    }
                    wnVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 4:
                ey eyVar = (ey) this.f1943b;
                xh0 xh0Var = (xh0) this.f1944c;
                s71 s71Var2 = xh0Var.f34769c;
                if (TextUtils.isEmpty(xh0Var.f34774w)) {
                    arrayList = xh0Var.e;
                } else {
                    arrayList = xh0Var.f34771n;
                }
                if (!arrayList.isEmpty()) {
                    if (s71Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < s71Var2.getChildCount(); i18++) {
                            if (!(s71Var2.getChildAt(i18) instanceof c10)) {
                            }
                        }
                    }
                    xh0Var.a(false);
                }
                if (s71Var2.I1 && !xh0Var.Q && eyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(eyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 5:
                if (((ls) this.f1944c).W.I1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f1943b);
                    return;
                }
                return;
            case 6:
                ((s4.u0) this.f1943b).b(recyclerView, i10, i11);
                bv bvVar = (bv) this.f1944c;
                av avVar = bvVar.f38108f[0];
                if (recyclerView == avVar.d || recyclerView == avVar.e) {
                    float translationY2 = bv.j0(bvVar).getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        bv.k0(bvVar, f10);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                lh0 lh0Var = (lh0) this.f1944c;
                if (lh0Var.f41164b0 && !lh0Var.W) {
                    if (lh0Var.X - ((ig.a0) this.f1943b).N0() < 10) {
                        lh0Var.f0(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((s4.u0) this.f1943b).b(recyclerView, i10, i11);
                xq0 xq0Var = (xq0) this.f1944c;
                if (recyclerView == ((nm0) xq0Var.f45764n[0].f22992f)) {
                    kVar = ((r2) xq0Var).actionBar;
                    float translationY3 = kVar.getTranslationY();
                    float f11 = translationY3 - i11;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY3) {
                        xq0.h0(xq0Var, f11);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((s4.u0) this.f1943b).b(recyclerView, i10, i11);
                ((va0) this.f1944c).D.b(recyclerView, i10, i11);
                return;
            default:
                m2 m2Var = (m2) this.f1944c;
                h2 h2Var = m2Var.f53204f;
                if (m2Var.isAttachedToWindow()) {
                    if (h2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < h2Var.getChildCount(); i19++) {
                            if (!(h2Var.getChildAt(i19) instanceof c10)) {
                            }
                        }
                    }
                    m2Var.e.b();
                }
                ((ws0) this.f1943b).p();
                return;
        }
    }
}

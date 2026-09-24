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
import org.telegram.ui.Components.jh0;
import org.telegram.ui.Components.oa0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.de;
import org.telegram.ui.iv;
import org.telegram.ui.jv;
import org.telegram.ui.ms;
import org.telegram.ui.qy;
import org.telegram.ui.sh0;
import org.telegram.ui.wn;
import org.telegram.ui.wq0;
import org.telegram.ui.yq0;
public final class n3 extends s4.s0 {
    public final int f11513a;
    public final Object f11514b;
    public final Object f11515c;

    public n3(int i10, Object obj, Object obj2) {
        this.f11513a = i10;
        this.f11515c = obj;
        this.f11514b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f11513a) {
            case 0:
                if (i10 == 0) {
                    ((x3) this.f11515c).f11738n3.W();
                    return;
                }
                return;
            case 5:
                jv jvVar = (jv) this.f11515c;
                iv[] ivVarArr = jvVar.f34864f;
                ((s4.s0) this.f11514b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-jv.h0(jvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            ivVarArr[0].d.v0(0, i12, null);
                            ai.w0 w0Var = ivVarArr[0].e;
                            if (w0Var != null) {
                                w0Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        ivVarArr[0].d.v0(0, i13, null);
                        ai.w0 w0Var2 = ivVarArr[0].e;
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
                yq0 yq0Var = (yq0) this.f11515c;
                wq0[] wq0VarArr = yq0Var.f40213n;
                ((s4.s0) this.f11514b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.m2) yq0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            wq0VarArr[0].d.v0(0, -i14, null);
                            return;
                        } else {
                            wq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((s4.s0) this.f11514b).a(recyclerView, i10);
                ((oa0) this.f11515c).D.getClass();
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
        switch (this.f11513a) {
            case 0:
                x3 x3Var = (x3) this.f11515c;
                ((v3) this.f11514b).u(i11);
                x3Var.f11738n3.H();
                i1 i1Var = x3Var.L3;
                if (i1Var != null && (F = x3Var.F(i1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= x3Var.getHeight()) {
                        x3Var.L3 = null;
                        i1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(x3Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r61 r61Var = ((de) this.f11515c).f33067a;
                if (r61Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < r61Var.getChildCount(); i15++) {
                        if (!(r61Var.getChildAt(i15) instanceof u00)) {
                        }
                    }
                    return;
                }
                ((o8) this.f11514b).run();
                return;
            case 2:
                wn wnVar = (wn) this.f11515c;
                wn wnVar2 = wnVar.f39442da;
                if (wnVar2 == null) {
                    wnVar2 = wnVar;
                }
                if (i11 != 0) {
                    wnVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = wnVar2.F) != null) {
                    hVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(wnVar.X0);
                }
                int N0 = ((s4.c0) this.f11514b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > wnVar.M3.h - 5) {
                    if (wnVar.R3 == 7) {
                        if (!wnVar.G6 && !wnVar.C6[0]) {
                            wnVar.G6 = true;
                            wnVar.f39486h6.add(Integer.valueOf(wnVar.V5));
                            i13 = ((org.telegram.ui.ActionBar.m2) wnVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = wnVar.f39644u3;
                            i14 = ((org.telegram.ui.ActionBar.m2) wnVar).classGuid;
                            int i16 = wnVar.O3;
                            int i17 = wnVar.V5;
                            wnVar.V5 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i16, i17);
                            return;
                        }
                        return;
                    }
                    wnVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 3:
                qy qyVar = (qy) this.f11514b;
                jh0 jh0Var = (jh0) this.f11515c;
                r61 r61Var2 = jh0Var.f25416c;
                if (TextUtils.isEmpty(jh0Var.f25421w)) {
                    arrayList = jh0Var.e;
                } else {
                    arrayList = jh0Var.f25418n;
                }
                if (!arrayList.isEmpty()) {
                    if (r61Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < r61Var2.getChildCount(); i18++) {
                            if (!(r61Var2.getChildAt(i18) instanceof u00)) {
                            }
                        }
                    }
                    jh0Var.a(false);
                }
                if (r61Var2.K1 && !jh0Var.Q && qyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(qyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((ms) this.f11515c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f11514b);
                    return;
                }
                return;
            case 5:
                ((s4.s0) this.f11514b).b(recyclerView, i10, i11);
                jv jvVar = (jv) this.f11515c;
                iv ivVar = jvVar.f34864f[0];
                if (recyclerView == ivVar.d || recyclerView == ivVar.e) {
                    float translationY = jv.i0(jvVar).getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        jv.j0(jvVar, f7);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                sh0 sh0Var = (sh0) this.f11515c;
                if (sh0Var.f37756b0 && !sh0Var.W) {
                    if (sh0Var.X - ((gg.b0) this.f11514b).N0() < 10) {
                        sh0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.s0) this.f11514b).b(recyclerView, i10, i11);
                yq0 yq0Var = (yq0) this.f11515c;
                if (recyclerView == yq0Var.f40213n[0].d) {
                    kVar = ((org.telegram.ui.ActionBar.m2) yq0Var).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        yq0.g0(yq0Var, f10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((s4.s0) this.f11514b).b(recyclerView, i10, i11);
                ((oa0) this.f11515c).D.b(recyclerView, i10, i11);
                return;
            default:
                xh.o2 o2Var = (xh.o2) this.f11515c;
                xh.j2 j2Var = o2Var.f46316f;
                if (o2Var.isAttachedToWindow()) {
                    if (j2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < j2Var.getChildCount(); i19++) {
                            if (!(j2Var.getChildAt(i19) instanceof u00)) {
                            }
                        }
                    }
                    o2Var.e.a();
                }
                ((zr0) this.f11514b).o();
                return;
        }
    }
}

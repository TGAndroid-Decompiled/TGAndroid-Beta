package ki;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.wa0;
import org.telegram.ui.Components.wh0;
import org.telegram.ui.Components.z00;
import org.telegram.ui.bv;
import org.telegram.ui.ce;
import org.telegram.ui.cv;
import org.telegram.ui.ey;
import org.telegram.ui.hs;
import org.telegram.ui.lh0;
import org.telegram.ui.oq0;
import org.telegram.ui.qq0;
import org.telegram.ui.sn;
public final class m3 extends s4.r0 {
    public final int f15448a;
    public final Object f15449b;
    public final Object f15450c;

    public m3(int i10, Object obj, Object obj2) {
        this.f15448a = i10;
        this.f15450c = obj;
        this.f15449b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f15448a) {
            case 0:
                if (i10 == 0) {
                    ((w3) this.f15450c).f15667o3.V();
                    return;
                }
                return;
            case 5:
                cv cvVar = (cv) this.f15450c;
                bv[] bvVarArr = cvVar.f36409f;
                ((s4.r0) this.f15449b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-cv.h0(cvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            bvVarArr[0].d.v0(0, i12, null);
                            ai.u1 u1Var = bvVarArr[0].e;
                            if (u1Var != null) {
                                u1Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        bvVarArr[0].d.v0(0, i13, null);
                        ai.u1 u1Var2 = bvVarArr[0].e;
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
                qq0 qq0Var = (qq0) this.f15450c;
                oq0[] oq0VarArr = qq0Var.f40924n;
                ((s4.r0) this.f15449b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.o2) qq0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            oq0VarArr[0].d.v0(0, -i14, null);
                            return;
                        } else {
                            oq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((s4.r0) this.f15449b).a(recyclerView, i10);
                ((wa0) this.f15450c).D.getClass();
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
        switch (this.f15448a) {
            case 0:
                w3 w3Var = (w3) this.f15450c;
                ((u3) this.f15449b).z(i11);
                w3Var.f15667o3.G();
                h1 h1Var = w3Var.M3;
                if (h1Var != null && (F = w3Var.F(h1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= w3Var.getHeight()) {
                        w3Var.M3 = null;
                        h1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(w3Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                i71 i71Var = ((ce) this.f15450c).f36312a;
                if (i71Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < i71Var.getChildCount(); i15++) {
                        if (!(i71Var.getChildAt(i15) instanceof z00)) {
                        }
                    }
                    return;
                }
                ((ah.g) this.f15449b).run();
                return;
            case 2:
                sn snVar = (sn) this.f15450c;
                sn snVar2 = snVar.f41639pa;
                if (snVar2 == null) {
                    snVar2 = snVar;
                }
                if (i11 != 0) {
                    snVar.v9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (fVar = snVar2.F) != null) {
                    fVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(snVar.f41558j1);
                }
                int N0 = ((s4.b0) this.f15449b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > snVar.Y3.h - 5) {
                    if (snVar.f41489d4 == 7) {
                        if (!snVar.S6 && !snVar.O6[0]) {
                            snVar.S6 = true;
                            snVar.f41688t6.add(Integer.valueOf(snVar.f41540h6));
                            i13 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = snVar.G3;
                            i14 = ((org.telegram.ui.ActionBar.o2) snVar).classGuid;
                            int i16 = snVar.f41448a4;
                            int i17 = snVar.f41540h6;
                            snVar.f41540h6 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i16, i17);
                            return;
                        }
                        return;
                    }
                    snVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 3:
                ey eyVar = (ey) this.f15449b;
                wh0 wh0Var = (wh0) this.f15450c;
                i71 i71Var2 = wh0Var.f32240c;
                if (TextUtils.isEmpty(wh0Var.f32245w)) {
                    arrayList = wh0Var.e;
                } else {
                    arrayList = wh0Var.f32242n;
                }
                if (!arrayList.isEmpty()) {
                    if (i71Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < i71Var2.getChildCount(); i18++) {
                            if (!(i71Var2.getChildAt(i18) instanceof z00)) {
                            }
                        }
                    }
                    wh0Var.a(false);
                }
                if (i71Var2.I1 && !wh0Var.Q && eyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(eyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((hs) this.f15450c).W.I1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f15449b);
                    return;
                }
                return;
            case 5:
                ((s4.r0) this.f15449b).b(recyclerView, i10, i11);
                cv cvVar = (cv) this.f15450c;
                bv bvVar = cvVar.f36409f[0];
                if (recyclerView == bvVar.d || recyclerView == bvVar.e) {
                    float translationY = cv.i0(cvVar).getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        cv.j0(cvVar, f7);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                lh0 lh0Var = (lh0) this.f15450c;
                if (lh0Var.f39274b0 && !lh0Var.W) {
                    if (lh0Var.X - ((hg.a0) this.f15449b).N0() < 10) {
                        lh0Var.e0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.r0) this.f15449b).b(recyclerView, i10, i11);
                qq0 qq0Var = (qq0) this.f15450c;
                if (recyclerView == qq0Var.f40924n[0].d) {
                    kVar = ((org.telegram.ui.ActionBar.o2) qq0Var).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        qq0.g0(qq0Var, f10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((s4.r0) this.f15449b).b(recyclerView, i10, i11);
                ((wa0) this.f15450c).D.b(recyclerView, i10, i11);
                return;
            case 9:
                yh.l2 l2Var = (yh.l2) this.f15450c;
                yh.g2 g2Var = l2Var.f50827f;
                if (l2Var.isAttachedToWindow()) {
                    if (g2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < g2Var.getChildCount(); i19++) {
                            if (!(g2Var.getChildAt(i19) instanceof z00)) {
                            }
                        }
                    }
                    l2Var.e.a();
                }
                ((ms0) this.f15449b).o();
                return;
            default:
                zh.q qVar = (zh.q) this.f15449b;
                float translationY3 = qVar.getTranslationY();
                float f11 = ((zh.n0) this.f15450c).f52508d0;
                if (translationY3 != f11) {
                    qVar.setTranslationY(f11);
                    qVar.invalidate();
                    return;
                }
                return;
        }
    }
}

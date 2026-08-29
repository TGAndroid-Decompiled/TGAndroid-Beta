package hh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import f2.a1;
import f2.j0;
import ih.h3;
import ih.n3;
import java.util.ArrayList;
import jh.e1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.p00;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.ug0;
import org.telegram.ui.Components.z90;
import org.telegram.ui.bv;
import org.telegram.ui.cq0;
import org.telegram.ui.cv;
import org.telegram.ui.eq0;
import org.telegram.ui.fy;
import org.telegram.ui.hh0;
import org.telegram.ui.hs;
import org.telegram.ui.tn;
import org.telegram.ui.xd;
import th.d1;
import th.p3;
public final class l extends a1 {
    public final int f8090a;
    public final Object f8091b;
    public final Object f8092c;

    public l(int i10, Object obj, Object obj2) {
        this.f8090a = i10;
        this.f8092c = obj;
        this.f8091b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.l lVar;
        switch (this.f8090a) {
            case 0:
                ((a1) this.f8091b).a(recyclerView, i10);
                ((z90) this.f8092c).D.getClass();
                return;
            case 6:
                cv cvVar = (cv) this.f8092c;
                bv[] bvVarArr = cvVar.f37222f;
                ((a1) this.f8091b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-cv.h0(cvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            bvVarArr[0].d.v0(0, i12, null);
                            e1 e1Var = bvVarArr[0].f36926e;
                            if (e1Var != null) {
                                e1Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        bvVarArr[0].d.v0(0, i13, null);
                        e1 e1Var2 = bvVarArr[0].f36926e;
                        if (e1Var2 != null) {
                            e1Var2.v0(0, i13, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                eq0 eq0Var = (eq0) this.f8092c;
                cq0[] cq0VarArr = eq0Var.f37891n;
                ((a1) this.f8091b).a(recyclerView, i10);
                if (i10 != 1) {
                    lVar = ((o2) eq0Var).actionBar;
                    int i14 = (int) (-lVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            cq0VarArr[0].d.v0(0, -i14, null);
                            return;
                        } else {
                            cq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 9:
                if (i10 == 0) {
                    ((p3) this.f8092c).f48650j3.W();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        lg.e eVar;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.l lVar;
        View F;
        switch (this.f8090a) {
            case 0:
                ((a1) this.f8091b).b(recyclerView, i10, i11);
                ((z90) this.f8092c).D.b(recyclerView, i10, i11);
                return;
            case 1:
                n3 n3Var = (n3) this.f8092c;
                h3 h3Var = n3Var.f9297f;
                if (n3Var.isAttachedToWindow()) {
                    if (h3Var.canScrollVertically(1)) {
                        for (int i15 = 0; i15 < h3Var.getChildCount(); i15++) {
                            if (!(h3Var.getChildAt(i15) instanceof p00)) {
                            }
                        }
                    }
                    n3Var.f9296e.a();
                }
                ((gr0) this.f8091b).o();
                return;
            case 2:
                u51 u51Var = ((xd) this.f8092c).f44553a;
                if (u51Var.canScrollVertically(1)) {
                    for (int i16 = 0; i16 < u51Var.getChildCount(); i16++) {
                        if (!(u51Var.getChildAt(i16) instanceof p00)) {
                        }
                    }
                    return;
                }
                ((bg.f) this.f8091b).run();
                return;
            case 3:
                tn tnVar = (tn) this.f8092c;
                tn tnVar2 = tnVar.Z9;
                if (tnVar2 == null) {
                    tnVar2 = tnVar;
                }
                if (i11 != 0) {
                    tnVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = tnVar2.B) != null) {
                    eVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(tnVar.T0);
                }
                int N0 = ((j0) this.f8091b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > tnVar.I3.h - 5) {
                    if (tnVar.N3 == 7) {
                        if (!tnVar.C6 && !tnVar.f43044y6[0]) {
                            tnVar.C6 = true;
                            tnVar.f42781d6.add(Integer.valueOf(tnVar.R5));
                            i13 = ((o2) tnVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = tnVar.f42940q3;
                            i14 = ((o2) tnVar).classGuid;
                            int i17 = tnVar.K3;
                            int i18 = tnVar.R5;
                            tnVar.R5 = i18 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i17, i18);
                            return;
                        }
                        return;
                    }
                    tnVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 4:
                fy fyVar = (fy) this.f8091b;
                ug0 ug0Var = (ug0) this.f8092c;
                u51 u51Var2 = ug0Var.f33224c;
                if (TextUtils.isEmpty(ug0Var.f33230w)) {
                    arrayList = ug0Var.f33225e;
                } else {
                    arrayList = ug0Var.f33227n;
                }
                if (!arrayList.isEmpty()) {
                    if (u51Var2.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < u51Var2.getChildCount(); i19++) {
                            if (!(u51Var2.getChildAt(i19) instanceof p00)) {
                            }
                        }
                    }
                    ug0Var.a(false);
                }
                if (u51Var2.G1 && !ug0Var.M && fyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(fyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 5:
                if (((hs) this.f8092c).S.G1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f8091b);
                    return;
                }
                return;
            case 6:
                ((a1) this.f8091b).b(recyclerView, i10, i11);
                cv cvVar = (cv) this.f8092c;
                bv bvVar = cvVar.f37222f[0];
                if (recyclerView == bvVar.d || recyclerView == bvVar.f36926e) {
                    float translationY = cv.i0(cvVar).getTranslationY();
                    float f9 = translationY - i11;
                    if (f9 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f9 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f9 > 0.0f) {
                        f9 = 0.0f;
                    }
                    if (f9 != translationY) {
                        cv.j0(cvVar, f9);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                hh0 hh0Var = (hh0) this.f8092c;
                if (hh0Var.X && !hh0Var.S) {
                    if (hh0Var.T - ((org.telegram.ui.k) this.f8091b).N0() < 10) {
                        hh0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((a1) this.f8091b).b(recyclerView, i10, i11);
                eq0 eq0Var = (eq0) this.f8092c;
                if (recyclerView == eq0Var.f37891n[0].d) {
                    lVar = ((o2) eq0Var).actionBar;
                    float translationY2 = lVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.l.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        eq0.g0(eq0Var, f10);
                        return;
                    }
                    return;
                }
                return;
            default:
                p3 p3Var = (p3) this.f8092c;
                ((th.n3) this.f8091b).K0(i11);
                p3Var.f48650j3.H();
                d1 d1Var = p3Var.H3;
                if (d1Var != null && (F = p3Var.F(d1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= p3Var.getHeight()) {
                        p3Var.H3 = null;
                        d1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(p3Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

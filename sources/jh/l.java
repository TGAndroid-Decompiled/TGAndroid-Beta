package jh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import f2.i0;
import f2.z0;
import java.util.ArrayList;
import kh.g3;
import kh.m3;
import lh.e1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.ge;
import org.telegram.ui.lv;
import org.telegram.ui.mv;
import org.telegram.ui.pq0;
import org.telegram.ui.ps;
import org.telegram.ui.qy;
import org.telegram.ui.rh0;
import org.telegram.ui.rq0;
import org.telegram.ui.zn;
import vh.q3;
import vh.s3;
public final class l extends z0 {
    public final int f9433a;
    public final Object f9434b;
    public final Object f9435c;

    public l(int i10, Object obj, Object obj2) {
        this.f9433a = i10;
        this.f9435c = obj;
        this.f9434b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f9433a) {
            case 0:
                ((z0) this.f9434b).a(recyclerView, i10);
                ((fa0) this.f9435c).D.getClass();
                return;
            case 6:
                mv mvVar = (mv) this.f9435c;
                lv[] lvVarArr = mvVar.f36224f;
                ((z0) this.f9434b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-mv.h0(mvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            lvVarArr[0].d.v0(0, i12, null);
                            e1 e1Var = lvVarArr[0].e;
                            if (e1Var != null) {
                                e1Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        lvVarArr[0].d.v0(0, i13, null);
                        e1 e1Var2 = lvVarArr[0].e;
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
                rq0 rq0Var = (rq0) this.f9435c;
                pq0[] pq0VarArr = rq0Var.f37950n;
                ((z0) this.f9434b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((p2) rq0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            pq0VarArr[0].d.v0(0, -i14, null);
                            return;
                        } else {
                            pq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 9:
                if (i10 == 0) {
                    ((s3) this.f9435c).f46221k3.W();
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
        ng.e eVar;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar;
        View F;
        switch (this.f9433a) {
            case 0:
                ((z0) this.f9434b).b(recyclerView, i10, i11);
                ((fa0) this.f9435c).D.b(recyclerView, i10, i11);
                return;
            case 1:
                m3 m3Var = (m3) this.f9435c;
                g3 g3Var = m3Var.f10820f;
                if (m3Var.isAttachedToWindow()) {
                    if (g3Var.canScrollVertically(1)) {
                        for (int i15 = 0; i15 < g3Var.getChildCount(); i15++) {
                            if (!(g3Var.getChildAt(i15) instanceof u00)) {
                            }
                        }
                    }
                    m3Var.e.a();
                }
                ((or0) this.f9434b).o();
                return;
            case 2:
                g61 g61Var = ((ge) this.f9435c).f34421a;
                if (g61Var.canScrollVertically(1)) {
                    for (int i16 = 0; i16 < g61Var.getChildCount(); i16++) {
                        if (!(g61Var.getChildAt(i16) instanceof u00)) {
                        }
                    }
                    return;
                }
                ((ah.b) this.f9434b).run();
                return;
            case 3:
                zn znVar = (zn) this.f9435c;
                zn znVar2 = znVar.f40520aa;
                if (znVar2 == null) {
                    znVar2 = znVar;
                }
                if (i11 != 0) {
                    znVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = znVar2.C) != null) {
                    eVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(znVar.U0);
                }
                int N0 = ((i0) this.f9434b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > znVar.J3.h - 5) {
                    if (znVar.O3 == 7) {
                        if (!znVar.D6 && !znVar.f40832z6[0]) {
                            znVar.D6 = true;
                            znVar.e6.add(Integer.valueOf(znVar.S5));
                            i13 = ((p2) znVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = znVar.f40727r3;
                            i14 = ((p2) znVar).classGuid;
                            int i17 = znVar.L3;
                            int i18 = znVar.S5;
                            znVar.S5 = i18 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i17, i18);
                            return;
                        }
                        return;
                    }
                    znVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 4:
                qy qyVar = (qy) this.f9434b;
                fh0 fh0Var = (fh0) this.f9435c;
                g61 g61Var2 = fh0Var.f24889c;
                if (TextUtils.isEmpty(fh0Var.f24894w)) {
                    arrayList = fh0Var.e;
                } else {
                    arrayList = fh0Var.f24891n;
                }
                if (!arrayList.isEmpty()) {
                    if (g61Var2.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < g61Var2.getChildCount(); i19++) {
                            if (!(g61Var2.getChildAt(i19) instanceof u00)) {
                            }
                        }
                    }
                    fh0Var.a(false);
                }
                if (g61Var2.H1 && !fh0Var.N && qyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(qyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 5:
                if (((ps) this.f9435c).T.H1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f9434b);
                    return;
                }
                return;
            case 6:
                ((z0) this.f9434b).b(recyclerView, i10, i11);
                mv mvVar = (mv) this.f9435c;
                lv lvVar = mvVar.f36224f[0];
                if (recyclerView == lvVar.d || recyclerView == lvVar.e) {
                    float translationY = mv.i0(mvVar).getTranslationY();
                    float f10 = translationY - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY) {
                        mv.j0(mvVar, f10);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                rh0 rh0Var = (rh0) this.f9435c;
                if (rh0Var.Y && !rh0Var.T) {
                    if (rh0Var.U - ((org.telegram.ui.k) this.f9434b).N0() < 10) {
                        rh0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((z0) this.f9434b).b(recyclerView, i10, i11);
                rq0 rq0Var = (rq0) this.f9435c;
                if (recyclerView == rq0Var.f37950n[0].d) {
                    kVar = ((p2) rq0Var).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f11 = translationY2 - i11;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        rq0.g0(rq0Var, f11);
                        return;
                    }
                    return;
                }
                return;
            default:
                s3 s3Var = (s3) this.f9435c;
                ((q3) this.f9434b).y(i11);
                s3Var.f46221k3.H();
                vh.e1 e1Var = s3Var.I3;
                if (e1Var != null && (F = s3Var.F(e1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= s3Var.getHeight()) {
                        s3Var.I3 = null;
                        e1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(s3Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

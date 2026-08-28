package eh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import bg.c2;
import f2.d1;
import f2.m0;
import fh.s3;
import fh.y3;
import gh.f1;
import java.util.ArrayList;
import of.y;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.l90;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.av;
import org.telegram.ui.bv;
import org.telegram.ui.cq0;
import org.telegram.ui.dy;
import org.telegram.ui.eq0;
import org.telegram.ui.hh0;
import org.telegram.ui.is;
import org.telegram.ui.qn;
import org.telegram.ui.zd;
import qh.m3;
import qh.o3;
public final class n extends d1 {
    public final int f5216a;
    public final Object f5217b;
    public final Object f5218c;

    public n(int i9, Object obj, Object obj2) {
        this.f5216a = i9;
        this.f5218c = obj;
        this.f5217b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i9) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f5216a) {
            case 0:
                ((d1) this.f5217b).a(recyclerView, i9);
                ((l90) this.f5218c).D.getClass();
                return;
            case 6:
                bv bvVar = (bv) this.f5218c;
                av[] avVarArr = bvVar.f37000f;
                ((d1) this.f5217b).a(recyclerView, i9);
                if (i9 != 1) {
                    int i10 = (int) (-bv.g0(bvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 < currentActionBarHeight / 2) {
                            int i11 = -i10;
                            avVarArr[0].d.v0(0, i11, null);
                            f1 f1Var = avVarArr[0].f36559e;
                            if (f1Var != null) {
                                f1Var.v0(0, i11, null);
                                return;
                            }
                            return;
                        }
                        int i12 = currentActionBarHeight - i10;
                        avVarArr[0].d.v0(0, i12, null);
                        f1 f1Var2 = avVarArr[0].f36559e;
                        if (f1Var2 != null) {
                            f1Var2.v0(0, i12, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                eq0 eq0Var = (eq0) this.f5218c;
                cq0[] cq0VarArr = eq0Var.f38013n;
                ((d1) this.f5217b).a(recyclerView, i9);
                if (i9 != 1) {
                    kVar = ((o2) eq0Var).actionBar;
                    int i13 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 < currentActionBarHeight2 / 2) {
                            cq0VarArr[0].d.v0(0, -i13, null);
                            return;
                        } else {
                            cq0VarArr[0].d.v0(0, currentActionBarHeight2 - i13, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 9:
                if (i9 == 0) {
                    ((o3) this.f5218c).f46577j3.W();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        int i11;
        int i12;
        int i13;
        ig.e eVar;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar;
        View F;
        switch (this.f5216a) {
            case 0:
                ((d1) this.f5217b).b(recyclerView, i9, i10);
                ((l90) this.f5218c).D.b(recyclerView, i9, i10);
                return;
            case 1:
                y3 y3Var = (y3) this.f5218c;
                s3 s3Var = y3Var.f6884f;
                if (y3Var.isAttachedToWindow()) {
                    if (s3Var.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < s3Var.getChildCount(); i14++) {
                            if (!(s3Var.getChildAt(i14) instanceof e00)) {
                            }
                        }
                    }
                    y3Var.f6883e.a();
                }
                ((vq0) this.f5217b).o();
                return;
            case 2:
                i51 i51Var = ((zd) this.f5218c).f45112a;
                if (i51Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < i51Var.getChildCount(); i15++) {
                        if (!(i51Var.getChildAt(i15) instanceof e00)) {
                        }
                    }
                    return;
                }
                ((c2) this.f5217b).run();
                return;
            case 3:
                qn qnVar = (qn) this.f5218c;
                qn qnVar2 = qnVar.Z9;
                if (qnVar2 == null) {
                    qnVar2 = qnVar;
                }
                if (i10 != 0) {
                    qnVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = qnVar2.B) != null) {
                    eVar.f(i9, i10);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(qnVar.T0);
                }
                int N0 = ((m0) this.f5217b).N0();
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0 && N0 > qnVar.I3.h - 5) {
                    if (qnVar.N3 == 7) {
                        if (!qnVar.C6 && !qnVar.f42147y6[0]) {
                            qnVar.C6 = true;
                            qnVar.f41884d6.add(Integer.valueOf(qnVar.R5));
                            i12 = ((o2) qnVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i12);
                            String str = qnVar.f42039q3;
                            i13 = ((o2) qnVar).classGuid;
                            int i16 = qnVar.K3;
                            int i17 = qnVar.R5;
                            qnVar.R5 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i13, i16, i17);
                            return;
                        }
                        return;
                    }
                    qnVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 4:
                dy dyVar = (dy) this.f5217b;
                kg0 kg0Var = (kg0) this.f5218c;
                i51 i51Var2 = kg0Var.f30078c;
                if (TextUtils.isEmpty(kg0Var.f30084w)) {
                    arrayList = kg0Var.f30079e;
                } else {
                    arrayList = kg0Var.f30081n;
                }
                if (!arrayList.isEmpty()) {
                    if (i51Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < i51Var2.getChildCount(); i18++) {
                            if (!(i51Var2.getChildAt(i18) instanceof e00)) {
                            }
                        }
                    }
                    kg0Var.a(false);
                }
                if (i51Var2.G1 && !kg0Var.M && dyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(dyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 5:
                if (((is) this.f5218c).S.G1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f5217b);
                    return;
                }
                return;
            case 6:
                ((d1) this.f5217b).b(recyclerView, i9, i10);
                bv bvVar = (bv) this.f5218c;
                av avVar = bvVar.f37000f[0];
                if (recyclerView == avVar.d || recyclerView == avVar.f36559e) {
                    float translationY = bv.h0(bvVar).getTranslationY();
                    float f10 = translationY - i10;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY) {
                        bv.i0(bvVar, f10);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                hh0 hh0Var = (hh0) this.f5218c;
                if (hh0Var.X && !hh0Var.S) {
                    if (hh0Var.T - ((y) this.f5217b).N0() < 10) {
                        hh0Var.c0(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((d1) this.f5217b).b(recyclerView, i9, i10);
                eq0 eq0Var = (eq0) this.f5218c;
                if (recyclerView == eq0Var.f38013n[0].d) {
                    kVar = ((o2) eq0Var).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        eq0.f0(eq0Var, f11);
                        return;
                    }
                    return;
                }
                return;
            default:
                o3 o3Var = (o3) this.f5218c;
                ((m3) this.f5217b).b1(i10);
                o3Var.f46577j3.H();
                qh.d1 d1Var = o3Var.H3;
                if (d1Var != null && (F = o3Var.F(d1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= o3Var.getHeight()) {
                        o3Var.H3 = null;
                        d1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(o3Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

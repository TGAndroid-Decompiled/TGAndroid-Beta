package ii;

import ai.p8;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.di0;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.j10;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.ee;
import org.telegram.ui.er0;
import org.telegram.ui.gr0;
import org.telegram.ui.lv;
import org.telegram.ui.mv;
import org.telegram.ui.qs;
import org.telegram.ui.ty;
import org.telegram.ui.zh0;
import org.telegram.ui.zn;
public final class n3 extends s4.t0 {
    public final int f12589a;
    public final Object f12590b;
    public final Object f12591c;

    public n3(int i10, Object obj, Object obj2) {
        this.f12589a = i10;
        this.f12591c = obj;
        this.f12590b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f12589a) {
            case 0:
                if (i10 == 0) {
                    ((x3) this.f12591c).f12820l3.V();
                    return;
                }
                return;
            case 5:
                mv mvVar = (mv) this.f12591c;
                lv[] lvVarArr = mvVar.f39995f;
                ((s4.t0) this.f12590b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-mv.h0(mvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            lvVarArr[0].d.v0(0, i12, null);
                            ai.w0 w0Var = lvVarArr[0].f39684e;
                            if (w0Var != null) {
                                w0Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        lvVarArr[0].d.v0(0, i13, null);
                        ai.w0 w0Var2 = lvVarArr[0].f39684e;
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
                gr0 gr0Var = (gr0) this.f12591c;
                er0[] er0VarArr = gr0Var.f38089n;
                ((s4.t0) this.f12590b).a(recyclerView, i10);
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
                ((s4.t0) this.f12590b).a(recyclerView, i10);
                ((eb0) this.f12591c).D.getClass();
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
        switch (this.f12589a) {
            case 0:
                x3 x3Var = (x3) this.f12591c;
                ((v3) this.f12590b).t(i11);
                x3Var.f12820l3.G();
                i1 i1Var = x3Var.J3;
                if (i1Var != null && (F = x3Var.F(i1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= x3Var.getHeight()) {
                        x3Var.J3 = null;
                        i1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(x3Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                k71 k71Var = ((ee) this.f12591c).f37239a;
                if (k71Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < k71Var.getChildCount(); i15++) {
                        if (!(k71Var.getChildAt(i15) instanceof j10)) {
                        }
                    }
                    return;
                }
                ((p8) this.f12590b).run();
                return;
            case 2:
                zn znVar = (zn) this.f12591c;
                zn znVar2 = znVar.f44750da;
                if (znVar2 == null) {
                    znVar2 = znVar;
                }
                if (i11 != 0) {
                    znVar.v9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = znVar2.F) != null) {
                    hVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(znVar.X0);
                }
                int N0 = ((s4.d0) this.f12590b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > znVar.M3.h - 5) {
                    if (znVar.R3 == 7) {
                        if (!znVar.G6 && !znVar.C6[0]) {
                            znVar.G6 = true;
                            znVar.f44795h6.add(Integer.valueOf(znVar.V5));
                            i13 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = znVar.f44953u3;
                            i14 = ((org.telegram.ui.ActionBar.n2) znVar).classGuid;
                            int i16 = znVar.O3;
                            int i17 = znVar.V5;
                            znVar.V5 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i16, i17);
                            return;
                        }
                        return;
                    }
                    znVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 3:
                ty tyVar = (ty) this.f12590b;
                di0 di0Var = (di0) this.f12591c;
                k71 k71Var2 = di0Var.f25714c;
                if (TextUtils.isEmpty(di0Var.f25720w)) {
                    arrayList = di0Var.f25715e;
                } else {
                    arrayList = di0Var.f25717n;
                }
                if (!arrayList.isEmpty()) {
                    if (k71Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < k71Var2.getChildCount(); i18++) {
                            if (!(k71Var2.getChildAt(i18) instanceof j10)) {
                            }
                        }
                    }
                    di0Var.a(false);
                }
                if (k71Var2.I1 && !di0Var.Q && tyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(tyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((qs) this.f12591c).W.I1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f12590b);
                    return;
                }
                return;
            case 5:
                ((s4.t0) this.f12590b).b(recyclerView, i10, i11);
                mv mvVar = (mv) this.f12591c;
                lv lvVar = mvVar.f39995f[0];
                if (recyclerView == lvVar.d || recyclerView == lvVar.f39684e) {
                    float translationY = mv.i0(mvVar).getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        mv.j0(mvVar, f7);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                zh0 zh0Var = (zh0) this.f12591c;
                if (zh0Var.f44636b0 && !zh0Var.W) {
                    if (zh0Var.X - ((gg.a0) this.f12590b).N0() < 10) {
                        zh0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.t0) this.f12590b).b(recyclerView, i10, i11);
                gr0 gr0Var = (gr0) this.f12591c;
                if (recyclerView == gr0Var.f38089n[0].d) {
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
                ((s4.t0) this.f12590b).b(recyclerView, i10, i11);
                ((eb0) this.f12591c).D.b(recyclerView, i10, i11);
                return;
            default:
                xh.o2 o2Var = (xh.o2) this.f12591c;
                xh.j2 j2Var = o2Var.f51439f;
                if (o2Var.isAttachedToWindow()) {
                    if (j2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < j2Var.getChildCount(); i19++) {
                            if (!(j2Var.getChildAt(i19) instanceof j10)) {
                            }
                        }
                    }
                    o2Var.f51438e.a();
                }
                ((rs0) this.f12590b).o();
                return;
        }
    }
}

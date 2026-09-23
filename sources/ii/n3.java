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
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.zg0;
import org.telegram.ui.ar0;
import org.telegram.ui.de;
import org.telegram.ui.jv;
import org.telegram.ui.kv;
import org.telegram.ui.ns;
import org.telegram.ui.ry;
import org.telegram.ui.th0;
import org.telegram.ui.xn;
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
                kv kvVar = (kv) this.f11515c;
                jv[] jvVarArr = kvVar.f34806f;
                ((s4.s0) this.f11514b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-kv.h0(kvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            jvVarArr[0].d.v0(0, i12, null);
                            ai.w0 w0Var = jvVarArr[0].e;
                            if (w0Var != null) {
                                w0Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        jvVarArr[0].d.v0(0, i13, null);
                        ai.w0 w0Var2 = jvVarArr[0].e;
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
                ar0 ar0Var = (ar0) this.f11515c;
                yq0[] yq0VarArr = ar0Var.f31871n;
                ((s4.s0) this.f11514b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) ar0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            yq0VarArr[0].d.v0(0, -i14, null);
                            return;
                        } else {
                            yq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((s4.s0) this.f11514b).a(recyclerView, i10);
                ((da0) this.f11515c).D.getClass();
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
                d61 d61Var = ((de) this.f11515c).f32615a;
                if (d61Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < d61Var.getChildCount(); i15++) {
                        if (!(d61Var.getChildAt(i15) instanceof u00)) {
                        }
                    }
                    return;
                }
                ((o8) this.f11514b).run();
                return;
            case 2:
                xn xnVar = (xn) this.f11515c;
                xn xnVar2 = xnVar.f39358da;
                if (xnVar2 == null) {
                    xnVar2 = xnVar;
                }
                if (i11 != 0) {
                    xnVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (hVar = xnVar2.F) != null) {
                    hVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(xnVar.X0);
                }
                int N0 = ((s4.c0) this.f11514b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > xnVar.M3.h - 5) {
                    if (xnVar.R3 == 7) {
                        if (!xnVar.G6 && !xnVar.C6[0]) {
                            xnVar.G6 = true;
                            xnVar.f39402h6.add(Integer.valueOf(xnVar.V5));
                            i13 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = xnVar.f39560u3;
                            i14 = ((org.telegram.ui.ActionBar.n2) xnVar).classGuid;
                            int i16 = xnVar.O3;
                            int i17 = xnVar.V5;
                            xnVar.V5 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i16, i17);
                            return;
                        }
                        return;
                    }
                    xnVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 3:
                ry ryVar = (ry) this.f11514b;
                zg0 zg0Var = (zg0) this.f11515c;
                d61 d61Var2 = zg0Var.f30587c;
                if (TextUtils.isEmpty(zg0Var.f30592w)) {
                    arrayList = zg0Var.e;
                } else {
                    arrayList = zg0Var.f30589n;
                }
                if (!arrayList.isEmpty()) {
                    if (d61Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < d61Var2.getChildCount(); i18++) {
                            if (!(d61Var2.getChildAt(i18) instanceof u00)) {
                            }
                        }
                    }
                    zg0Var.a(false);
                }
                if (d61Var2.K1 && !zg0Var.Q && ryVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(ryVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((ns) this.f11515c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f11514b);
                    return;
                }
                return;
            case 5:
                ((s4.s0) this.f11514b).b(recyclerView, i10, i11);
                kv kvVar = (kv) this.f11515c;
                jv jvVar = kvVar.f34806f[0];
                if (recyclerView == jvVar.d || recyclerView == jvVar.e) {
                    float translationY = kv.i0(kvVar).getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        kv.j0(kvVar, f7);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                th0 th0Var = (th0) this.f11515c;
                if (th0Var.f37658b0 && !th0Var.W) {
                    if (th0Var.X - ((gg.b0) this.f11514b).N0() < 10) {
                        th0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.s0) this.f11514b).b(recyclerView, i10, i11);
                ar0 ar0Var = (ar0) this.f11515c;
                if (recyclerView == ar0Var.f31871n[0].d) {
                    kVar = ((org.telegram.ui.ActionBar.n2) ar0Var).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        ar0.g0(ar0Var, f10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((s4.s0) this.f11514b).b(recyclerView, i10, i11);
                ((da0) this.f11515c).D.b(recyclerView, i10, i11);
                return;
            default:
                xh.o2 o2Var = (xh.o2) this.f11515c;
                xh.j2 j2Var = o2Var.f46002f;
                if (o2Var.isAttachedToWindow()) {
                    if (j2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < j2Var.getChildCount(); i19++) {
                            if (!(j2Var.getChildAt(i19) instanceof u00)) {
                            }
                        }
                    }
                    o2Var.e.a();
                }
                ((nr0) this.f11514b).o();
                return;
        }
    }
}

package ai;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ha;
import org.telegram.ui.Components.bf0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.s80;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.lr;
import org.telegram.ui.rd;
import org.telegram.ui.uw;
import org.telegram.ui.vm0;
import org.telegram.ui.wm;
import org.telegram.ui.xe0;
import org.telegram.ui.xt;
import org.telegram.ui.yt;
public final class i4 extends u4.t0 {
    public final int f712a;
    public final Object f713b;
    public final Object f714c;

    public i4(int i3, Object obj, Object obj2) {
        this.f712a = i3;
        this.f714c = obj;
        this.f713b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i3) {
        switch (this.f712a) {
            case 2:
                if (i3 == 0) {
                    ((mi.t3) this.f714c).f19928v3.V();
                    return;
                }
                return;
            case 7:
                yt ytVar = (yt) this.f714c;
                xt[] xtVarArr = ytVar.f52403f;
                ((u4.t0) this.f713b).a(recyclerView, i3);
                if (i3 != 1) {
                    int i10 = (int) (-yt.m0(ytVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 < currentActionBarHeight / 2) {
                            int i11 = -i10;
                            xtVarArr[0].d.w0(0, i11, null);
                            ci.j1 j1Var = xtVarArr[0].f52099e;
                            if (j1Var != null) {
                                j1Var.w0(0, i11, null);
                                return;
                            }
                            return;
                        }
                        int i12 = currentActionBarHeight - i10;
                        xtVarArr[0].d.w0(0, i12, null);
                        ci.j1 j1Var2 = xtVarArr[0].f52099e;
                        if (j1Var2 != null) {
                            j1Var2.w0(0, i12, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                vm0 vm0Var = (vm0) this.f714c;
                org.telegram.ui.ActionBar.x4[] x4VarArr = vm0Var.f50558n;
                ((u4.t0) this.f713b).a(recyclerView, i3);
                if (i3 != 1) {
                    int i13 = (int) (-vm0.j0(vm0Var).getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 < currentActionBarHeight2 / 2) {
                            ((tj0) x4VarArr[0].f28806f).w0(0, -i13, null);
                            return;
                        } else {
                            ((tj0) x4VarArr[0].f28806f).w0(0, currentActionBarHeight2 - i13, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                ((u4.t0) this.f713b).a(recyclerView, i3);
                ((s80) this.f714c).D.getClass();
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        View F;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        switch (this.f712a) {
            case 0:
                o4 o4Var = (o4) this.f714c;
                h4 h4Var = o4Var.f860f;
                if (o4Var.isAttachedToWindow()) {
                    if (h4Var.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < h4Var.getChildCount(); i14++) {
                            if (!(h4Var.getChildAt(i14) instanceof iz)) {
                            }
                        }
                    }
                    o4Var.f859e.a();
                }
                ((vp0) this.f713b).p();
                return;
            case 1:
                bi.r rVar = (bi.r) this.f713b;
                float translationY = rVar.getTranslationY();
                float f10 = ((bi.j0) this.f714c).f3756e0;
                if (translationY != f10) {
                    rVar.setTranslationY(f10);
                    rVar.invalidate();
                    return;
                }
                return;
            case 2:
                mi.t3 t3Var = (mi.t3) this.f714c;
                ((mi.r3) this.f713b).Y0(i10);
                t3Var.f19928v3.G();
                mi.h1 h1Var = t3Var.T3;
                if (h1Var != null && (F = t3Var.F(h1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= t3Var.getHeight()) {
                        t3Var.T3 = null;
                        h1Var.clearFocus();
                        org.telegram.messenger.g0.v1(t3Var);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                l41 l41Var = ((rd) this.f714c).f49199a;
                if (l41Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < l41Var.getChildCount(); i15++) {
                        if (!(l41Var.getChildAt(i15) instanceof iz)) {
                        }
                    }
                    return;
                }
                ((cg.l0) this.f713b).run();
                return;
            case 4:
                wm wmVar = (wm) this.f714c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(wmVar.m1);
                }
                int N0 = ((u4.b0) this.f713b).N0();
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0 && N0 > wmVar.f51255b4.h - 5) {
                    if (wmVar.f51325g4 == 7) {
                        if (!wmVar.X6 && !wmVar.T6[0]) {
                            wmVar.X6 = true;
                            wmVar.f51554y6.add(Integer.valueOf(wmVar.f51399m6));
                            i12 = ((org.telegram.ui.ActionBar.d2) wmVar).currentAccount;
                            ha a10 = ha.a(i12);
                            String str = wmVar.J3;
                            i13 = ((org.telegram.ui.ActionBar.d2) wmVar).classGuid;
                            int i16 = wmVar.f51282d4;
                            int i17 = wmVar.f51399m6;
                            wmVar.f51399m6 = i17 + 1;
                            a10.e(i13, i16, i17, str);
                            return;
                        }
                        return;
                    }
                    wmVar.getMediaDataController().O0();
                    return;
                }
                return;
            case 5:
                uw uwVar = (uw) this.f713b;
                bf0 bf0Var = (bf0) this.f714c;
                l41 l41Var2 = bf0Var.f32170c;
                if (TextUtils.isEmpty(bf0Var.f32177x)) {
                    arrayList = bf0Var.f32171e;
                } else {
                    arrayList = bf0Var.f32173n;
                }
                if (!arrayList.isEmpty()) {
                    if (l41Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < l41Var2.getChildCount(); i18++) {
                            if (!(l41Var2.getChildAt(i18) instanceof iz)) {
                            }
                        }
                    }
                    bf0Var.a(false);
                }
                if (l41Var2.J1 && !bf0Var.R && uwVar.getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(uwVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (((lr) this.f714c).X.J1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.f713b);
                    return;
                }
                return;
            case 7:
                ((u4.t0) this.f713b).b(recyclerView, i3, i10);
                yt ytVar = (yt) this.f714c;
                xt xtVar = ytVar.f52403f[0];
                if (recyclerView == xtVar.d || recyclerView == xtVar.f52099e) {
                    float translationY2 = yt.n0(ytVar).getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        yt.o0(ytVar, f11);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                xe0 xe0Var = (xe0) this.f714c;
                if (xe0Var.f51988c0 && !xe0Var.X) {
                    if (xe0Var.Y - ((kg.y) this.f713b).N0() < 10) {
                        xe0Var.j0(true);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((u4.t0) this.f713b).b(recyclerView, i3, i10);
                vm0 vm0Var = (vm0) this.f714c;
                if (recyclerView == ((tj0) vm0Var.f50558n[0].f28806f)) {
                    float translationY3 = vm0.k0(vm0Var).getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f12 > 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 != translationY3) {
                        vm0.l0(vm0Var, f12);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                th.n nVar = (th.n) this.f714c;
                th.m mVar = (th.m) this.f713b;
                if (!mVar.h && !mVar.f55435i) {
                    if ((nVar.f55439c.f35594g3.E.size() - 1) - nVar.f55439c.f35593f3.M0() < 5) {
                        mVar.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((u4.t0) this.f713b).b(recyclerView, i3, i10);
                ((s80) this.f714c).D.b(recyclerView, i3, i10);
                return;
        }
    }
}

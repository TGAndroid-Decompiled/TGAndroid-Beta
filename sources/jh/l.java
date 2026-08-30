package jh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import f2.i0;
import f2.z0;
import java.util.ArrayList;
import kh.h3;
import kh.n3;
import lh.e1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ea0;
import org.telegram.ui.Components.eh0;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.t00;
import org.telegram.ui.ee;
import org.telegram.ui.iq0;
import org.telegram.ui.jv;
import org.telegram.ui.kq0;
import org.telegram.ui.kv;
import org.telegram.ui.ns;
import org.telegram.ui.oy;
import org.telegram.ui.ph0;
import org.telegram.ui.xn;
import vh.d1;
import vh.p3;
import vh.r3;
public final class l extends z0 {
    public final int f9452a;
    public final Object f9453b;
    public final Object f9454c;

    public l(int i10, Object obj, Object obj2) {
        this.f9452a = i10;
        this.f9454c = obj;
        this.f9453b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f9452a) {
            case 0:
                ((z0) this.f9453b).a(recyclerView, i10);
                ((ea0) this.f9454c).D.getClass();
                return;
            case 6:
                kv kvVar = (kv) this.f9454c;
                jv[] jvVarArr = kvVar.f35821f;
                ((z0) this.f9453b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-kv.h0(kvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            jvVarArr[0].d.v0(0, i12, null);
                            e1 e1Var = jvVarArr[0].e;
                            if (e1Var != null) {
                                e1Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        jvVarArr[0].d.v0(0, i13, null);
                        e1 e1Var2 = jvVarArr[0].e;
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
                kq0 kq0Var = (kq0) this.f9454c;
                iq0[] iq0VarArr = kq0Var.f35792n;
                ((z0) this.f9453b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((p2) kq0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            iq0VarArr[0].d.v0(0, -i14, null);
                            return;
                        } else {
                            iq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 9:
                if (i10 == 0) {
                    ((r3) this.f9454c).f46124k3.W();
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
        switch (this.f9452a) {
            case 0:
                ((z0) this.f9453b).b(recyclerView, i10, i11);
                ((ea0) this.f9454c).D.b(recyclerView, i10, i11);
                return;
            case 1:
                n3 n3Var = (n3) this.f9454c;
                h3 h3Var = n3Var.f10722f;
                if (n3Var.isAttachedToWindow()) {
                    if (h3Var.canScrollVertically(1)) {
                        for (int i15 = 0; i15 < h3Var.getChildCount(); i15++) {
                            if (!(h3Var.getChildAt(i15) instanceof t00)) {
                            }
                        }
                    }
                    n3Var.e.a();
                }
                ((or0) this.f9453b).o();
                return;
            case 2:
                g61 g61Var = ((ee) this.f9454c).f33998a;
                if (g61Var.canScrollVertically(1)) {
                    for (int i16 = 0; i16 < g61Var.getChildCount(); i16++) {
                        if (!(g61Var.getChildAt(i16) instanceof t00)) {
                        }
                    }
                    return;
                }
                ((af.b) this.f9453b).run();
                return;
            case 3:
                xn xnVar = (xn) this.f9454c;
                xn xnVar2 = xnVar.f39954aa;
                if (xnVar2 == null) {
                    xnVar2 = xnVar;
                }
                if (i11 != 0) {
                    xnVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = xnVar2.C) != null) {
                    eVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(xnVar.U0);
                }
                int N0 = ((i0) this.f9453b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > xnVar.J3.h - 5) {
                    if (xnVar.O3 == 7) {
                        if (!xnVar.D6 && !xnVar.f40266z6[0]) {
                            xnVar.D6 = true;
                            xnVar.e6.add(Integer.valueOf(xnVar.S5));
                            i13 = ((p2) xnVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = xnVar.f40161r3;
                            i14 = ((p2) xnVar).classGuid;
                            int i17 = xnVar.L3;
                            int i18 = xnVar.S5;
                            xnVar.S5 = i18 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i17, i18);
                            return;
                        }
                        return;
                    }
                    xnVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 4:
                oy oyVar = (oy) this.f9453b;
                eh0 eh0Var = (eh0) this.f9454c;
                g61 g61Var2 = eh0Var.f24578c;
                if (TextUtils.isEmpty(eh0Var.f24583w)) {
                    arrayList = eh0Var.e;
                } else {
                    arrayList = eh0Var.f24580n;
                }
                if (!arrayList.isEmpty()) {
                    if (g61Var2.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < g61Var2.getChildCount(); i19++) {
                            if (!(g61Var2.getChildAt(i19) instanceof t00)) {
                            }
                        }
                    }
                    eh0Var.a(false);
                }
                if (g61Var2.H1 && !eh0Var.N && oyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(oyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 5:
                if (((ns) this.f9454c).T.H1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f9453b);
                    return;
                }
                return;
            case 6:
                ((z0) this.f9453b).b(recyclerView, i10, i11);
                kv kvVar = (kv) this.f9454c;
                jv jvVar = kvVar.f35821f[0];
                if (recyclerView == jvVar.d || recyclerView == jvVar.e) {
                    float translationY = kv.i0(kvVar).getTranslationY();
                    float f10 = translationY - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY) {
                        kv.j0(kvVar, f10);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ph0 ph0Var = (ph0) this.f9454c;
                if (ph0Var.Y && !ph0Var.T) {
                    if (ph0Var.U - ((org.telegram.ui.k) this.f9453b).N0() < 10) {
                        ph0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((z0) this.f9453b).b(recyclerView, i10, i11);
                kq0 kq0Var = (kq0) this.f9454c;
                if (recyclerView == kq0Var.f35792n[0].d) {
                    kVar = ((p2) kq0Var).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f11 = translationY2 - i11;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        kq0.g0(kq0Var, f11);
                        return;
                    }
                    return;
                }
                return;
            default:
                r3 r3Var = (r3) this.f9454c;
                ((p3) this.f9453b).x(i11);
                r3Var.f46124k3.H();
                d1 d1Var = r3Var.I3;
                if (d1Var != null && (F = r3Var.F(d1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= r3Var.getHeight()) {
                        r3Var.I3 = null;
                        d1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(r3Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

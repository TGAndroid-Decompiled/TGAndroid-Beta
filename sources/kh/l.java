package kh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import f2.a1;
import f2.j0;
import java.util.ArrayList;
import lh.h3;
import lh.n3;
import mh.d1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.ga0;
import org.telegram.ui.Components.gh0;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.pr0;
import org.telegram.ui.Components.u00;
import org.telegram.ui.ee;
import org.telegram.ui.kq0;
import org.telegram.ui.kv;
import org.telegram.ui.lv;
import org.telegram.ui.mq0;
import org.telegram.ui.os;
import org.telegram.ui.py;
import org.telegram.ui.qh0;
import org.telegram.ui.xn;
import wh.e1;
import wh.p3;
import wh.r3;
public final class l extends a1 {
    public final int f11274a;
    public final Object f11275b;
    public final Object f11276c;

    public l(int i10, Object obj, Object obj2) {
        this.f11274a = i10;
        this.f11276c = obj;
        this.f11275b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f11274a) {
            case 0:
                ((a1) this.f11275b).a(recyclerView, i10);
                ((ga0) this.f11276c).D.getClass();
                return;
            case 6:
                lv lvVar = (lv) this.f11276c;
                kv[] kvVarArr = lvVar.f38886f;
                ((a1) this.f11275b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-lv.h0(lvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            kvVarArr[0].d.v0(0, i12, null);
                            d1 d1Var = kvVarArr[0].f38521e;
                            if (d1Var != null) {
                                d1Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        kvVarArr[0].d.v0(0, i13, null);
                        d1 d1Var2 = kvVarArr[0].f38521e;
                        if (d1Var2 != null) {
                            d1Var2.v0(0, i13, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 8:
                mq0 mq0Var = (mq0) this.f11276c;
                kq0[] kq0VarArr = mq0Var.f39204n;
                ((a1) this.f11275b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((p2) mq0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            kq0VarArr[0].d.v0(0, -i14, null);
                            return;
                        } else {
                            kq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 9:
                if (i10 == 0) {
                    ((r3) this.f11276c).f49991k3.W();
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
        og.e eVar;
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar;
        View F;
        switch (this.f11274a) {
            case 0:
                ((a1) this.f11275b).b(recyclerView, i10, i11);
                ((ga0) this.f11276c).D.b(recyclerView, i10, i11);
                return;
            case 1:
                n3 n3Var = (n3) this.f11276c;
                h3 h3Var = n3Var.f12864f;
                if (n3Var.isAttachedToWindow()) {
                    if (h3Var.canScrollVertically(1)) {
                        for (int i15 = 0; i15 < h3Var.getChildCount(); i15++) {
                            if (!(h3Var.getChildAt(i15) instanceof u00)) {
                            }
                        }
                    }
                    n3Var.f12863e.a();
                }
                ((pr0) this.f11275b).o();
                return;
            case 2:
                i61 i61Var = ((ee) this.f11276c).f36553a;
                if (i61Var.canScrollVertically(1)) {
                    for (int i16 = 0; i16 < i61Var.getChildCount(); i16++) {
                        if (!(i61Var.getChildAt(i16) instanceof u00)) {
                        }
                    }
                    return;
                }
                ((af.b) this.f11275b).run();
                return;
            case 3:
                xn xnVar = (xn) this.f11276c;
                xn xnVar2 = xnVar.f43122aa;
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
                int N0 = ((j0) this.f11275b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > xnVar.J3.h - 5) {
                    if (xnVar.O3 == 7) {
                        if (!xnVar.D6 && !xnVar.f43435z6[0]) {
                            xnVar.D6 = true;
                            xnVar.e6.add(Integer.valueOf(xnVar.S5));
                            i13 = ((p2) xnVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = xnVar.f43330r3;
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
                py pyVar = (py) this.f11275b;
                gh0 gh0Var = (gh0) this.f11276c;
                i61 i61Var2 = gh0Var.f27194c;
                if (TextUtils.isEmpty(gh0Var.f27200w)) {
                    arrayList = gh0Var.f27195e;
                } else {
                    arrayList = gh0Var.f27197n;
                }
                if (!arrayList.isEmpty()) {
                    if (i61Var2.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < i61Var2.getChildCount(); i19++) {
                            if (!(i61Var2.getChildAt(i19) instanceof u00)) {
                            }
                        }
                    }
                    gh0Var.a(false);
                }
                if (i61Var2.H1 && !gh0Var.N && pyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(pyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 5:
                if (((os) this.f11276c).T.H1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f11275b);
                    return;
                }
                return;
            case 6:
                ((a1) this.f11275b).b(recyclerView, i10, i11);
                lv lvVar = (lv) this.f11276c;
                kv kvVar = lvVar.f38886f[0];
                if (recyclerView == kvVar.d || recyclerView == kvVar.f38521e) {
                    float translationY = lv.i0(lvVar).getTranslationY();
                    float f10 = translationY - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY) {
                        lv.j0(lvVar, f10);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                qh0 qh0Var = (qh0) this.f11276c;
                if (qh0Var.Y && !qh0Var.T) {
                    if (qh0Var.U - ((org.telegram.ui.k) this.f11275b).N0() < 10) {
                        qh0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((a1) this.f11275b).b(recyclerView, i10, i11);
                mq0 mq0Var = (mq0) this.f11276c;
                if (recyclerView == mq0Var.f39204n[0].d) {
                    kVar = ((p2) mq0Var).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f11 = translationY2 - i11;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        mq0.g0(mq0Var, f11);
                        return;
                    }
                    return;
                }
                return;
            default:
                r3 r3Var = (r3) this.f11276c;
                ((p3) this.f11275b).C(i11);
                r3Var.f49991k3.H();
                e1 e1Var = r3Var.I3;
                if (e1Var != null && (F = r3Var.F(e1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= r3Var.getHeight()) {
                        r3Var.I3 = null;
                        e1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(r3Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

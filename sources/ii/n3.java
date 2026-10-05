package ii;

import ai.o8;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.lh0;
import org.telegram.ui.Components.qa0;
import org.telegram.ui.Components.w00;
import org.telegram.ui.br0;
import org.telegram.ui.ge;
import org.telegram.ui.mv;
import org.telegram.ui.nv;
import org.telegram.ui.qs;
import org.telegram.ui.uy;
import org.telegram.ui.wh0;
import org.telegram.ui.yn;
import org.telegram.ui.zq0;
public final class n3 extends s4.s0 {
    public final int f12540a;
    public final Object f12541b;
    public final Object f12542c;

    public n3(int i10, Object obj, Object obj2) {
        this.f12540a = i10;
        this.f12542c = obj;
        this.f12541b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f12540a) {
            case 0:
                if (i10 == 0) {
                    ((x3) this.f12542c).f12782u3.W();
                    return;
                }
                return;
            case 5:
                nv nvVar = (nv) this.f12542c;
                mv[] mvVarArr = nvVar.f39044f;
                ((s4.s0) this.f12541b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-nv.h0(nvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            mvVarArr[0].d.w0(0, i12, null);
                            ai.w0 w0Var = mvVarArr[0].f38755e;
                            if (w0Var != null) {
                                w0Var.w0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        mvVarArr[0].d.w0(0, i13, null);
                        ai.w0 w0Var2 = mvVarArr[0].f38755e;
                        if (w0Var2 != null) {
                            w0Var2.w0(0, i13, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 7:
                br0 br0Var = (br0) this.f12542c;
                zq0[] zq0VarArr = br0Var.f35210n;
                ((s4.s0) this.f12541b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.n2) br0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            zq0VarArr[0].d.w0(0, -i14, null);
                            return;
                        } else {
                            zq0VarArr[0].d.w0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((s4.s0) this.f12541b).a(recyclerView, i10);
                ((qa0) this.f12542c).D.getClass();
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
        ArrayList arrayList;
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f12540a) {
            case 0:
                x3 x3Var = (x3) this.f12542c;
                ((v3) this.f12541b).Q(i11);
                x3Var.f12782u3.H();
                i1 i1Var = x3Var.S3;
                if (i1Var != null && (F = x3Var.F(i1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= x3Var.getHeight()) {
                        x3Var.S3 = null;
                        i1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(x3Var);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                e71 e71Var = ((ge) this.f12542c).f36637a;
                if (e71Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < e71Var.getChildCount(); i15++) {
                        if (!(e71Var.getChildAt(i15) instanceof w00)) {
                        }
                    }
                    return;
                }
                ((o8) this.f12541b).run();
                return;
            case 2:
                yn ynVar = (yn) this.f12542c;
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(ynVar.V0);
                }
                int N0 = ((s4.c0) this.f12541b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > ynVar.K3.h - 5) {
                    if (ynVar.P3 == 7) {
                        if (!ynVar.E6 && !ynVar.A6[0]) {
                            ynVar.E6 = true;
                            ynVar.f43334f6.add(Integer.valueOf(ynVar.T5));
                            i13 = ((org.telegram.ui.ActionBar.n2) ynVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = ynVar.f43491s3;
                            i14 = ((org.telegram.ui.ActionBar.n2) ynVar).classGuid;
                            int i16 = ynVar.M3;
                            int i17 = ynVar.T5;
                            ynVar.T5 = i17 + 1;
                            hashtagSearchController.searchHashtag(str, i14, i16, i17);
                            return;
                        }
                        return;
                    }
                    ynVar.getMediaDataController().loadMoreSearchMessages(true);
                    return;
                }
                return;
            case 3:
                uy uyVar = (uy) this.f12541b;
                lh0 lh0Var = (lh0) this.f12542c;
                e71 e71Var2 = lh0Var.f28475c;
                if (TextUtils.isEmpty(lh0Var.f28481w)) {
                    arrayList = lh0Var.f28476e;
                } else {
                    arrayList = lh0Var.f28478n;
                }
                if (!arrayList.isEmpty()) {
                    if (e71Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < e71Var2.getChildCount(); i18++) {
                            if (!(e71Var2.getChildAt(i18) instanceof w00)) {
                            }
                        }
                    }
                    lh0Var.a(false);
                }
                if (e71Var2.K1 && !lh0Var.Q && uyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((qs) this.f12542c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f12541b);
                    return;
                }
                return;
            case 5:
                ((s4.s0) this.f12541b).b(recyclerView, i10, i11);
                nv nvVar = (nv) this.f12542c;
                mv mvVar = nvVar.f39044f[0];
                if (recyclerView == mvVar.d || recyclerView == mvVar.f38755e) {
                    float translationY = nv.i0(nvVar).getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        nv.j0(nvVar, f7);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                wh0 wh0Var = (wh0) this.f12542c;
                if (wh0Var.f42532b0 && !wh0Var.W) {
                    if (wh0Var.X - ((gg.b0) this.f12541b).N0() < 10) {
                        wh0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.s0) this.f12541b).b(recyclerView, i10, i11);
                br0 br0Var = (br0) this.f12542c;
                if (recyclerView == br0Var.f35210n[0].d) {
                    kVar = ((org.telegram.ui.ActionBar.n2) br0Var).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        br0.g0(br0Var, f10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((s4.s0) this.f12541b).b(recyclerView, i10, i11);
                ((qa0) this.f12542c).D.b(recyclerView, i10, i11);
                return;
            default:
                xh.o2 o2Var = (xh.o2) this.f12542c;
                xh.j2 j2Var = o2Var.f50163f;
                if (o2Var.isAttachedToWindow()) {
                    if (j2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < j2Var.getChildCount(); i19++) {
                            if (!(j2Var.getChildAt(i19) instanceof w00)) {
                            }
                        }
                    }
                    o2Var.f50162e.a();
                }
                ((gs0) this.f12541b).o();
                return;
        }
    }
}

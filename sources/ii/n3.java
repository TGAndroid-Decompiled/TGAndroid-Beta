package ii;

import ai.o8;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.fs0;
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
    public final int f12539a;
    public final Object f12540b;
    public final Object f12541c;

    public n3(int i10, Object obj, Object obj2) {
        this.f12539a = i10;
        this.f12541c = obj;
        this.f12540b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f12539a) {
            case 0:
                if (i10 == 0) {
                    ((x3) this.f12541c).f12781u3.W();
                    return;
                }
                return;
            case 5:
                nv nvVar = (nv) this.f12541c;
                mv[] mvVarArr = nvVar.f39050f;
                ((s4.s0) this.f12540b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-nv.h0(nvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            mvVarArr[0].d.w0(0, i12, null);
                            ai.w0 w0Var = mvVarArr[0].f38764e;
                            if (w0Var != null) {
                                w0Var.w0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        mvVarArr[0].d.w0(0, i13, null);
                        ai.w0 w0Var2 = mvVarArr[0].f38764e;
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
                br0 br0Var = (br0) this.f12541c;
                zq0[] zq0VarArr = br0Var.f35181n;
                ((s4.s0) this.f12540b).a(recyclerView, i10);
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
                ((s4.s0) this.f12540b).a(recyclerView, i10);
                ((qa0) this.f12541c).D.getClass();
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
        switch (this.f12539a) {
            case 0:
                x3 x3Var = (x3) this.f12541c;
                ((v3) this.f12540b).Q(i11);
                x3Var.f12781u3.H();
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
                c71 c71Var = ((ge) this.f12541c).f36598a;
                if (c71Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < c71Var.getChildCount(); i15++) {
                        if (!(c71Var.getChildAt(i15) instanceof w00)) {
                        }
                    }
                    return;
                }
                ((o8) this.f12540b).run();
                return;
            case 2:
                yn ynVar = (yn) this.f12541c;
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(ynVar.V0);
                }
                int N0 = ((s4.c0) this.f12540b).N0();
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
                uy uyVar = (uy) this.f12540b;
                lh0 lh0Var = (lh0) this.f12541c;
                c71 c71Var2 = lh0Var.f28367c;
                if (TextUtils.isEmpty(lh0Var.f28373w)) {
                    arrayList = lh0Var.f28368e;
                } else {
                    arrayList = lh0Var.f28370n;
                }
                if (!arrayList.isEmpty()) {
                    if (c71Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < c71Var2.getChildCount(); i18++) {
                            if (!(c71Var2.getChildAt(i18) instanceof w00)) {
                            }
                        }
                    }
                    lh0Var.a(false);
                }
                if (c71Var2.K1 && !lh0Var.Q && uyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(uyVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((qs) this.f12541c).W.K1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f12540b);
                    return;
                }
                return;
            case 5:
                ((s4.s0) this.f12540b).b(recyclerView, i10, i11);
                nv nvVar = (nv) this.f12541c;
                mv mvVar = nvVar.f39050f[0];
                if (recyclerView == mvVar.d || recyclerView == mvVar.f38764e) {
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
                wh0 wh0Var = (wh0) this.f12541c;
                if (wh0Var.f42470b0 && !wh0Var.W) {
                    if (wh0Var.X - ((gg.b0) this.f12540b).N0() < 10) {
                        wh0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.s0) this.f12540b).b(recyclerView, i10, i11);
                br0 br0Var = (br0) this.f12541c;
                if (recyclerView == br0Var.f35181n[0].d) {
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
                ((s4.s0) this.f12540b).b(recyclerView, i10, i11);
                ((qa0) this.f12541c).D.b(recyclerView, i10, i11);
                return;
            default:
                xh.o2 o2Var = (xh.o2) this.f12541c;
                xh.j2 j2Var = o2Var.f50148f;
                if (o2Var.isAttachedToWindow()) {
                    if (j2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < j2Var.getChildCount(); i19++) {
                            if (!(j2Var.getChildAt(i19) instanceof w00)) {
                            }
                        }
                    }
                    o2Var.f50147e.a();
                }
                ((fs0) this.f12540b).o();
                return;
        }
    }
}

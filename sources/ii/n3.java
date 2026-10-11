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
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.k10;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.ts0;
import org.telegram.ui.de;
import org.telegram.ui.dr0;
import org.telegram.ui.fr0;
import org.telegram.ui.kv;
import org.telegram.ui.lv;
import org.telegram.ui.ps;
import org.telegram.ui.sy;
import org.telegram.ui.yh0;
import org.telegram.ui.zn;
public final class n3 extends s4.t0 {
    public final int f12588a;
    public final Object f12589b;
    public final Object f12590c;

    public n3(int i10, Object obj, Object obj2) {
        this.f12588a = i10;
        this.f12590c = obj;
        this.f12589b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f12588a) {
            case 0:
                if (i10 == 0) {
                    ((x3) this.f12590c).f12819l3.V();
                    return;
                }
                return;
            case 5:
                lv lvVar = (lv) this.f12590c;
                kv[] kvVarArr = lvVar.f39737f;
                ((s4.t0) this.f12589b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-lv.h0(lvVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 < currentActionBarHeight / 2) {
                            int i12 = -i11;
                            kvVarArr[0].d.v0(0, i12, null);
                            ai.w0 w0Var = kvVarArr[0].f39425e;
                            if (w0Var != null) {
                                w0Var.v0(0, i12, null);
                                return;
                            }
                            return;
                        }
                        int i13 = currentActionBarHeight - i11;
                        kvVarArr[0].d.v0(0, i13, null);
                        ai.w0 w0Var2 = kvVarArr[0].f39425e;
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
                fr0 fr0Var = (fr0) this.f12590c;
                dr0[] dr0VarArr = fr0Var.f37751n;
                ((s4.t0) this.f12589b).a(recyclerView, i10);
                if (i10 != 1) {
                    kVar = ((org.telegram.ui.ActionBar.m2) fr0Var).actionBar;
                    int i14 = (int) (-kVar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 < currentActionBarHeight2 / 2) {
                            dr0VarArr[0].d.v0(0, -i14, null);
                            return;
                        } else {
                            dr0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 8:
                ((s4.t0) this.f12589b).a(recyclerView, i10);
                ((fb0) this.f12590c).D.getClass();
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
        switch (this.f12588a) {
            case 0:
                x3 x3Var = (x3) this.f12590c;
                ((v3) this.f12589b).B(i11);
                x3Var.f12819l3.G();
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
                m71 m71Var = ((de) this.f12590c).f36993a;
                if (m71Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < m71Var.getChildCount(); i15++) {
                        if (!(m71Var.getChildAt(i15) instanceof k10)) {
                        }
                    }
                    return;
                }
                ((p8) this.f12589b).run();
                return;
            case 2:
                zn znVar = (zn) this.f12590c;
                zn znVar2 = znVar.f44749da;
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
                int N0 = ((s4.d0) this.f12589b).N0();
                if (N0 == -1) {
                    i12 = 0;
                } else {
                    i12 = N0;
                }
                if (i12 > 0 && N0 > znVar.M3.h - 5) {
                    if (znVar.R3 == 7) {
                        if (!znVar.G6 && !znVar.C6[0]) {
                            znVar.G6 = true;
                            znVar.f44794h6.add(Integer.valueOf(znVar.V5));
                            i13 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
                            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(i13);
                            String str = znVar.f44952u3;
                            i14 = ((org.telegram.ui.ActionBar.m2) znVar).classGuid;
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
                sy syVar = (sy) this.f12589b;
                ei0 ei0Var = (ei0) this.f12590c;
                m71 m71Var2 = ei0Var.f26018c;
                if (TextUtils.isEmpty(ei0Var.f26024w)) {
                    arrayList = ei0Var.f26019e;
                } else {
                    arrayList = ei0Var.f26021n;
                }
                if (!arrayList.isEmpty()) {
                    if (m71Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < m71Var2.getChildCount(); i18++) {
                            if (!(m71Var2.getChildAt(i18) instanceof k10)) {
                            }
                        }
                    }
                    ei0Var.a(false);
                }
                if (m71Var2.I1 && !ei0Var.Q && syVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(syVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 4:
                if (((ps) this.f12590c).W.I1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f12589b);
                    return;
                }
                return;
            case 5:
                ((s4.t0) this.f12589b).b(recyclerView, i10, i11);
                lv lvVar = (lv) this.f12590c;
                kv kvVar = lvVar.f39737f[0];
                if (recyclerView == kvVar.d || recyclerView == kvVar.f39425e) {
                    float translationY = lv.i0(lvVar).getTranslationY();
                    float f7 = translationY - i11;
                    if (f7 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f7 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f7 > 0.0f) {
                        f7 = 0.0f;
                    }
                    if (f7 != translationY) {
                        lv.j0(lvVar, f7);
                        return;
                    }
                    return;
                }
                return;
            case 6:
                yh0 yh0Var = (yh0) this.f12590c;
                if (yh0Var.f44406b0 && !yh0Var.W) {
                    if (yh0Var.X - ((gg.a0) this.f12589b).N0() < 10) {
                        yh0Var.d0(true);
                        return;
                    }
                    return;
                }
                return;
            case 7:
                ((s4.t0) this.f12589b).b(recyclerView, i10, i11);
                fr0 fr0Var = (fr0) this.f12590c;
                if (recyclerView == fr0Var.f37751n[0].d) {
                    kVar = ((org.telegram.ui.ActionBar.m2) fr0Var).actionBar;
                    float translationY2 = kVar.getTranslationY();
                    float f10 = translationY2 - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY2) {
                        fr0.g0(fr0Var, f10);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                ((s4.t0) this.f12589b).b(recyclerView, i10, i11);
                ((fb0) this.f12590c).D.b(recyclerView, i10, i11);
                return;
            default:
                xh.o2 o2Var = (xh.o2) this.f12590c;
                xh.j2 j2Var = o2Var.f51526f;
                if (o2Var.isAttachedToWindow()) {
                    if (j2Var.canScrollVertically(1)) {
                        for (int i19 = 0; i19 < j2Var.getChildCount(); i19++) {
                            if (!(j2Var.getChildAt(i19) instanceof k10)) {
                            }
                        }
                    }
                    o2Var.f51525e.a();
                }
                ((ts0) this.f12589b).o();
                return;
        }
    }
}

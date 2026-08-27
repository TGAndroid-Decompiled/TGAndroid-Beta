package fh;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import cg.w1;
import f2.b1;
import f2.k0;
import gh.n3;
import gh.t3;
import hh.f1;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.p90;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.dq0;
import org.telegram.ui.dv;
import org.telegram.ui.ev;
import org.telegram.ui.fq0;
import org.telegram.ui.gy;
import org.telegram.ui.js;
import org.telegram.ui.kh0;
import org.telegram.ui.rn;
import org.telegram.ui.zd;
import rh.d1;
import rh.p3;

public final class l extends b1 {

    public final int f6143a;

    public final Object f6144b;

    public final Object f6145c;

    public l(int i10, Object obj, Object obj2) {
        this.f6143a = i10;
        this.f6145c = obj;
        this.f6144b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i10) {
        switch (this.f6143a) {
            case 0:
                ((b1) this.f6144b).a(recyclerView, i10);
                ((p90) this.f6145c).D.getClass();
                break;
            case 6:
                ev evVar = (ev) this.f6145c;
                dv[] dvVarArr = evVar.f37857f;
                ((b1) this.f6144b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i11 = (int) (-((n2) evVar).actionBar.getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i11 != 0 && i11 != currentActionBarHeight) {
                        if (i11 >= currentActionBarHeight / 2) {
                            int i12 = currentActionBarHeight - i11;
                            dvVarArr[0].d.v0(0, i12, null);
                            f1 f1Var = dvVarArr[0].f37556e;
                            if (f1Var != null) {
                                f1Var.v0(0, i12, null);
                            }
                        } else {
                            int i13 = -i11;
                            dvVarArr[0].d.v0(0, i13, null);
                            f1 f1Var2 = dvVarArr[0].f37556e;
                            if (f1Var2 != null) {
                                f1Var2.v0(0, i13, null);
                            }
                        }
                        break;
                    }
                }
                break;
            case 8:
                fq0 fq0Var = (fq0) this.f6145c;
                dq0[] dq0VarArr = fq0Var.f38190n;
                ((b1) this.f6144b).a(recyclerView, i10);
                if (i10 != 1) {
                    int i14 = (int) (-((n2) fq0Var).actionBar.getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i14 != 0 && i14 != currentActionBarHeight2) {
                        if (i14 >= currentActionBarHeight2 / 2) {
                            dq0VarArr[0].d.v0(0, currentActionBarHeight2 - i14, null);
                        } else {
                            dq0VarArr[0].d.v0(0, -i14, null);
                        }
                        break;
                    }
                }
                break;
            case 9:
                if (i10 == 0) {
                    ((p3) this.f6145c).f47352j3.W();
                }
                break;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        jg.e eVar;
        View viewF;
        switch (this.f6143a) {
            case 0:
                ((b1) this.f6144b).b(recyclerView, i10, i11);
                ((p90) this.f6145c).D.b(recyclerView, i10, i11);
                break;
            case 1:
                t3 t3Var = (t3) this.f6145c;
                n3 n3Var = t3Var.f7537f;
                if (t3Var.isAttachedToWindow()) {
                    if (n3Var.canScrollVertically(1)) {
                        for (int i12 = 0; i12 < n3Var.getChildCount(); i12++) {
                            if (n3Var.getChildAt(i12) instanceof h00) {
                                t3Var.f7536e.a();
                            }
                        }
                    } else {
                        t3Var.f7536e.a();
                    }
                }
                ((wq0) this.f6144b).o();
                break;
            case 2:
                k51 k51Var = ((zd) this.f6145c).f45140a;
                if (k51Var.canScrollVertically(1)) {
                    for (int i13 = 0; i13 < k51Var.getChildCount(); i13++) {
                        if (!(k51Var.getChildAt(i13) instanceof h00)) {
                        }
                    }
                }
                ((w1) this.f6144b).run();
                break;
            case 3:
                rn rnVar = (rn) this.f6145c;
                rn rnVar2 = rnVar.Z9;
                if (rnVar2 == null) {
                    rnVar2 = rnVar;
                }
                if (i11 != 0) {
                    rnVar.q9(1);
                }
                if (Build.VERSION.SDK_INT >= 31 && (eVar = rnVar2.B) != null) {
                    eVar.f(i10, i11);
                }
                if (recyclerView.getScrollState() == 1) {
                    AndroidUtilities.hideKeyboard(rnVar.T0);
                }
                int iN0 = ((k0) this.f6144b).N0();
                if ((iN0 == -1 ? 0 : iN0) > 0 && iN0 > rnVar.I3.h - 5) {
                    if (rnVar.N3 != 7) {
                        rnVar.getMediaDataController().loadMoreSearchMessages(true);
                        break;
                    } else if (!rnVar.C6 && !rnVar.f42283y6[0]) {
                        rnVar.C6 = true;
                        rnVar.f42019d6.add(Integer.valueOf(rnVar.R5));
                        HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(((n2) rnVar).currentAccount);
                        String str = rnVar.f42177q3;
                        int i14 = ((n2) rnVar).classGuid;
                        int i15 = rnVar.K3;
                        int i16 = rnVar.R5;
                        rnVar.R5 = i16 + 1;
                        hashtagSearchController.searchHashtag(str, i14, i15, i16);
                        break;
                    }
                }
                break;
            case 4:
                gy gyVar = (gy) this.f6144b;
                mg0 mg0Var = (mg0) this.f6145c;
                k51 k51Var2 = mg0Var.f30677c;
                if (!(TextUtils.isEmpty(mg0Var.f30683w) ? mg0Var.f30678e : mg0Var.f30680n).isEmpty()) {
                    if (k51Var2.canScrollVertically(1)) {
                        for (int i17 = 0; i17 < k51Var2.getChildCount(); i17++) {
                            if (k51Var2.getChildAt(i17) instanceof h00) {
                                mg0Var.a(false);
                            }
                        }
                    } else {
                        mg0Var.a(false);
                    }
                }
                if (k51Var2.G1 && !mg0Var.M && gyVar.getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(gyVar.getParentActivity().getCurrentFocus());
                    break;
                }
                break;
            case 5:
                if (((js) this.f6145c).S.G1) {
                    AndroidUtilities.hideKeyboard((FrameLayout) this.f6144b);
                }
                break;
            case 6:
                ((b1) this.f6144b).b(recyclerView, i10, i11);
                ev evVar = (ev) this.f6145c;
                dv dvVar = evVar.f37857f[0];
                if (recyclerView == dvVar.d || recyclerView == dvVar.f37556e) {
                    float translationY = ((n2) evVar).actionBar.getTranslationY();
                    float f10 = translationY - i11;
                    if (f10 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f10 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f10 > 0.0f) {
                        f10 = 0.0f;
                    }
                    if (f10 != translationY) {
                        ev.j0(evVar, f10);
                    }
                }
                break;
            case 7:
                kh0 kh0Var = (kh0) this.f6145c;
                if (kh0Var.X && !kh0Var.S) {
                    if (kh0Var.T - ((org.telegram.ui.j) this.f6144b).N0() < 10) {
                        kh0Var.d0(true);
                    }
                    break;
                }
                break;
            case 8:
                ((b1) this.f6144b).b(recyclerView, i10, i11);
                fq0 fq0Var = (fq0) this.f6145c;
                if (recyclerView == fq0Var.f38190n[0].d) {
                    float translationY2 = ((n2) fq0Var).actionBar.getTranslationY();
                    float f11 = translationY2 - i11;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        fq0.g0(fq0Var, f11);
                    }
                }
                break;
            default:
                p3 p3Var = (p3) this.f6145c;
                ((rh.n3) this.f6144b).b1(i11);
                p3Var.f47352j3.H();
                d1 d1Var = p3Var.H3;
                if (d1Var != null && (viewF = p3Var.F(d1Var)) != null) {
                    if (viewF.getBottom() <= 0 || viewF.getTop() >= p3Var.getHeight()) {
                        p3Var.H3 = null;
                        d1Var.clearFocus();
                        AndroidUtilities.hideKeyboard(p3Var);
                    }
                }
                break;
        }
    }
}

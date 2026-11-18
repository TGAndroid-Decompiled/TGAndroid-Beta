package bi;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.ma;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.mf0;
import org.telegram.ui.Components.wz;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.du;
import org.telegram.ui.eu;
import org.telegram.ui.fn0;
import org.telegram.ui.gf0;
import org.telegram.ui.qr;
import org.telegram.ui.rd;
public final class d6 extends v4.u0 {
    public final int f3525a;
    public final Object f3526b;
    public final Object f3527c;

    public d6(int i7, Object obj, Object obj2) {
        this.f3525a = i7;
        this.f3527c = obj;
        this.f3526b = obj2;
    }

    @Override
    public void a(RecyclerView recyclerView, int i7) {
        switch (this.f3525a) {
            case 2:
                if (i7 == 0) {
                    ((oi.s3) this.f3527c).f22346v3.V();
                    return;
                }
                return;
            case 7:
                eu euVar = (eu) this.f3527c;
                du[] duVarArr = euVar.f47315f;
                ((v4.u0) this.f3526b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i10 = (int) (-eu.m0(euVar).getTranslationY());
                    int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i10 != 0 && i10 != currentActionBarHeight) {
                        if (i10 < currentActionBarHeight / 2) {
                            int i11 = -i10;
                            duVarArr[0].d.w0(0, i11, null);
                            di.b1 b1Var = duVarArr[0].f46974e;
                            if (b1Var != null) {
                                b1Var.w0(0, i11, null);
                                return;
                            }
                            return;
                        }
                        int i12 = currentActionBarHeight - i10;
                        duVarArr[0].d.w0(0, i12, null);
                        di.b1 b1Var2 = duVarArr[0].f46974e;
                        if (b1Var2 != null) {
                            b1Var2.w0(0, i12, null);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 9:
                fn0 fn0Var = (fn0) this.f3527c;
                org.telegram.ui.ActionBar.z4[] z4VarArr = fn0Var.f47728n;
                ((v4.u0) this.f3526b).a(recyclerView, i7);
                if (i7 != 1) {
                    int i13 = (int) (-fn0.j0(fn0Var).getTranslationY());
                    int currentActionBarHeight2 = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    if (i13 != 0 && i13 != currentActionBarHeight2) {
                        if (i13 < currentActionBarHeight2 / 2) {
                            ((ck0) z4VarArr[0].f30320f).w0(0, -i13, null);
                            return;
                        } else {
                            ((ck0) z4VarArr[0].f30320f).w0(0, currentActionBarHeight2 - i13, null);
                            return;
                        }
                    }
                    return;
                }
                return;
            case 11:
                ((v4.u0) this.f3526b).a(recyclerView, i7);
                ((j90) this.f3527c).D.getClass();
                return;
            default:
                return;
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        View F;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        switch (this.f3525a) {
            case 0:
                j6 j6Var = (j6) this.f3527c;
                c6 c6Var = j6Var.f3760f;
                if (j6Var.isAttachedToWindow()) {
                    if (c6Var.canScrollVertically(1)) {
                        for (int i14 = 0; i14 < c6Var.getChildCount(); i14++) {
                            if (!(c6Var.getChildAt(i14) instanceof wz)) {
                            }
                        }
                    }
                    j6Var.f3759e.a();
                }
                ((eq0) this.f3526b).p();
                return;
            case 1:
                ci.r rVar = (ci.r) this.f3526b;
                float translationY = rVar.getTranslationY();
                float f10 = ((ci.j0) this.f3527c).f5678e0;
                if (translationY != f10) {
                    rVar.setTranslationY(f10);
                    rVar.invalidate();
                    return;
                }
                return;
            case 2:
                oi.s3 s3Var = (oi.s3) this.f3527c;
                ((oi.q3) this.f3526b).b0(i10);
                s3Var.f22346v3.G();
                oi.e1 e1Var = s3Var.T3;
                if (e1Var != null && (F = s3Var.F(e1Var)) != null) {
                    if (F.getBottom() <= 0 || F.getTop() >= s3Var.getHeight()) {
                        s3Var.T3 = null;
                        e1Var.clearFocus();
                        org.telegram.messenger.g0.v1(s3Var);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                e51 e51Var = ((rd) this.f3527c).f51564a;
                if (e51Var.canScrollVertically(1)) {
                    for (int i15 = 0; i15 < e51Var.getChildCount(); i15++) {
                        if (!(e51Var.getChildAt(i15) instanceof wz)) {
                        }
                    }
                    return;
                }
                ((ai.w0) this.f3526b).run();
                return;
            case 4:
                bn bnVar = (bn) this.f3527c;
                if (recyclerView.getScrollState() == 1) {
                    org.telegram.messenger.g0.v1(bnVar.f46084m1);
                }
                int N0 = ((v4.c0) this.f3526b).N0();
                if (N0 == -1) {
                    i11 = 0;
                } else {
                    i11 = N0;
                }
                if (i11 > 0 && N0 > bnVar.f45942b4.h - 5) {
                    if (bnVar.f46009g4 == 7) {
                        if (!bnVar.Y6 && !bnVar.U6[0]) {
                            bnVar.Y6 = true;
                            bnVar.f46254z6.add(Integer.valueOf(bnVar.f46100n6));
                            i12 = ((org.telegram.ui.ActionBar.h2) bnVar).currentAccount;
                            ma a10 = ma.a(i12);
                            String str = bnVar.J3;
                            i13 = ((org.telegram.ui.ActionBar.h2) bnVar).classGuid;
                            int i16 = bnVar.f45969d4;
                            int i17 = bnVar.f46100n6;
                            bnVar.f46100n6 = i17 + 1;
                            a10.e(i13, i16, i17, str);
                            return;
                        }
                        return;
                    }
                    bnVar.getMediaDataController().R0();
                    return;
                }
                return;
            case 5:
                cx cxVar = (cx) this.f3526b;
                mf0 mf0Var = (mf0) this.f3527c;
                e51 e51Var2 = mf0Var.f37453c;
                if (TextUtils.isEmpty(mf0Var.f37460x)) {
                    arrayList = mf0Var.f37454e;
                } else {
                    arrayList = mf0Var.f37456n;
                }
                if (!arrayList.isEmpty()) {
                    if (e51Var2.canScrollVertically(1)) {
                        for (int i18 = 0; i18 < e51Var2.getChildCount(); i18++) {
                            if (!(e51Var2.getChildAt(i18) instanceof wz)) {
                            }
                        }
                    }
                    mf0Var.a(false);
                }
                if (e51Var2.J1 && !mf0Var.R && cxVar.getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(cxVar.getParentActivity().getCurrentFocus());
                    return;
                }
                return;
            case 6:
                if (((qr) this.f3527c).X.J1) {
                    org.telegram.messenger.g0.v1((FrameLayout) this.f3526b);
                    return;
                }
                return;
            case 7:
                ((v4.u0) this.f3526b).b(recyclerView, i7, i10);
                eu euVar = (eu) this.f3527c;
                du duVar = euVar.f47315f[0];
                if (recyclerView == duVar.d || recyclerView == duVar.f46974e) {
                    float translationY2 = eu.n0(euVar).getTranslationY();
                    float f11 = translationY2 - i10;
                    if (f11 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f11 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f11 > 0.0f) {
                        f11 = 0.0f;
                    }
                    if (f11 != translationY2) {
                        eu.o0(euVar, f11);
                        return;
                    }
                    return;
                }
                return;
            case 8:
                gf0 gf0Var = (gf0) this.f3527c;
                if (gf0Var.f48003c0 && !gf0Var.X) {
                    if (gf0Var.Y - ((jg.b0) this.f3526b).N0() < 10) {
                        gf0Var.j0(true);
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ((v4.u0) this.f3526b).b(recyclerView, i7, i10);
                fn0 fn0Var = (fn0) this.f3527c;
                if (recyclerView == ((ck0) fn0Var.f47728n[0].f30320f)) {
                    float translationY3 = fn0.k0(fn0Var).getTranslationY();
                    float f12 = translationY3 - i10;
                    if (f12 < (-org.telegram.ui.ActionBar.k.getCurrentActionBarHeight())) {
                        f12 = -org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
                    } else if (f12 > 0.0f) {
                        f12 = 0.0f;
                    }
                    if (f12 != translationY3) {
                        fn0.l0(fn0Var, f12);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                sh.o oVar = (sh.o) this.f3527c;
                sh.n nVar = (sh.n) this.f3526b;
                if (!nVar.h && !nVar.f57470i) {
                    if ((oVar.f57474c.f34607g3.E.size() - 1) - oVar.f57474c.f34606f3.M0() < 5) {
                        nVar.a();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((v4.u0) this.f3526b).b(recyclerView, i7, i10);
                ((j90) this.f3527c).D.b(recyclerView, i7, i10);
                return;
        }
    }
}

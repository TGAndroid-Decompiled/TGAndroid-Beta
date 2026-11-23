package gi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import fi.a6;
import fi.h6;
import fi.o6;
import hi.c7;
import java.util.ArrayList;
import m.o3;
import org.telegram.messenger.cz;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.kj0;
import v4.f1;
public class l extends kj0 {
    public final Context f13673c;
    public h6 f13674e;
    public l f13675f;
    public o3 h;
    public boolean f13677r;
    public final m f13678s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f13676n = new ArrayList();

    public l(m mVar, Context context) {
        this.f13678s = mVar;
        this.f13673c = context;
        M();
    }

    @Override
    public final boolean D(f1 f1Var) {
        return false;
    }

    @Override
    public final String F(int i7) {
        gj gjVar;
        TL_stories.StoryItem storyItem;
        h6 h6Var = this.f13674e;
        if (h6Var == null || i7 < 0 || i7 >= h6Var.f12089i.size() || (gjVar = (gj) this.f13674e.f12089i.get(i7)) == null || (storyItem = gjVar.f24218l) == null) {
            return null;
        }
        return hd.e0(storyItem.date, true);
    }

    @Override
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
        l lVar = this.f13675f;
        m mVar = this.f13678s;
        if (this == lVar) {
            i7 = mVar.f13684e;
        } else {
            i7 = mVar.d;
        }
        int ceil = (int) (Math.ceil(b() / i7) * measuredHeight);
        int measuredHeight2 = ek0Var.getMeasuredHeight() - ek0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f11 = f10 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f11 / measuredHeight)) * i7;
        iArr[1] = ((int) f11) % measuredHeight;
    }

    public final boolean L(int i7) {
        fq0 fq0Var = this.f13678s.f13681a0;
        h6 h6Var = this.f13674e;
        if (h6Var != null) {
            if (h6Var instanceof a6) {
                TLRPC.User c22 = np.u1(fq0Var.f13697b).c2(Long.valueOf(fq0Var.d));
                if (c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < h6Var.f12089i.size()) {
                return this.f13674e.m(((gj) this.f13674e.f12089i.get(i7)).e1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.f13674e != null) {
            m mVar = this.f13678s;
            if ((!mVar.J || (mVar.I && b() > 1)) && b() > 0) {
                boolean z10 = false;
                if (b() < 5) {
                    int max = Math.max(1, b());
                    mVar.d = max;
                    if (max == 1) {
                        z10 = true;
                    }
                    mVar.I = z10;
                } else if (mVar.I || mVar.d == 1) {
                    mVar.I = false;
                    mVar.d = Math.max(2, cz.f23447u1);
                }
                mVar.h.y1(mVar.d);
                mVar.J = true;
            }
        }
    }

    @Override
    public final int b() {
        if (this.f13674e == null) {
            return 0;
        }
        return this.f13674e.g() + this.d.size();
    }

    @Override
    public final int d(int i7) {
        return 19;
    }

    @Override
    public final int e() {
        return b();
    }

    @Override
    public void f() {
        h6 h6Var = this.f13674e;
        boolean z10 = h6Var instanceof a6;
        m mVar = this.f13678s;
        if (z10) {
            a6 a6Var = (a6) h6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = np.u1(this.f13674e.f12085c).R1().F(mVar.f13681a0.d);
            if (F != null) {
                for (int i7 = 0; i7 < F.size(); i7++) {
                    o6 o6Var = (o6) F.get(i7);
                    c7 c7Var = o6Var.f12375c;
                    if (c7Var != null && !c7Var.f14354g && TextUtils.equals(c7Var.K0, a6Var.E)) {
                        arrayList.add(o6Var);
                    }
                }
            }
        }
        super.f();
        l lVar = this.f13675f;
        if (lVar != null) {
            lVar.f();
        }
        if (this != mVar.f13690x) {
            M();
            mVar.c();
        }
    }

    @Override
    public final void t(f1 f1Var, int i7) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        if (this.f13674e != null) {
            View view = f1Var.f59165a;
            if (!(view instanceof p7)) {
                return;
            }
            p7 p7Var = (p7) view;
            p7Var.f31261e0 = true;
            m mVar = this.f13678s;
            ArrayList arrayList = this.d;
            if (i7 >= 0 && i7 < arrayList.size()) {
                o6 o6Var = (o6) arrayList.get(i7);
                p7Var.f31264g0 = false;
                if (o6Var.L == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = o6Var.f12373a;
                    int i13 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i13;
                    tL_storyItem.f28673id = i13;
                    tL_storyItem.attachPath = o6Var.f12377f;
                    gj gjVar = new gj(this.f13674e.f12085c, tL_storyItem);
                    o6Var.L = gjVar;
                    gjVar.f24222m = o6Var;
                }
                gj gjVar2 = o6Var.L;
                if (this == this.f13675f) {
                    i12 = mVar.f13684e;
                } else {
                    i12 = mVar.d;
                }
                p7Var.k(gjVar2, i12, false);
                p7Var.f31261e0 = true;
                p7Var.setReorder(false);
                p7Var.i(false, false);
                return;
            }
            int size = i7 - arrayList.size();
            if (size >= 0 && size < this.f13674e.f12089i.size()) {
                gj gjVar3 = (gj) this.f13674e.f12089i.get(size);
                if (gjVar3 != null && this.f13674e.m(gjVar3.e1())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p7Var.f31264g0 = z10;
                p7Var.setReorder(true);
                if (this == this.f13675f) {
                    i11 = mVar.f13684e;
                } else {
                    i11 = mVar.d;
                }
                p7Var.k(gjVar3, i11, false);
                fq0 fq0Var = mVar.f13681a0;
                if (fq0Var.H.F1 && gjVar3 != null) {
                    p7Var.i(fq0Var.c(gjVar3), true);
                    return;
                } else {
                    p7Var.i(false, false);
                    return;
                }
            }
            p7Var.f31264g0 = false;
            if (this == this.f13675f) {
                i10 = mVar.f13684e;
            } else {
                i10 = mVar.d;
            }
            p7Var.k(null, i10, false);
            p7Var.f31261e0 = true;
        }
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        fq0 fq0Var = this.f13678s.f13681a0;
        if (this.h == null) {
            this.h = new o3(viewGroup.getContext(), fq0Var.f13698c);
        }
        p7 p7Var = new p7(this.f13673c, this.h, fq0Var.f13697b);
        p7Var.f31285x0 = true;
        p7Var.setGradientView(null);
        p7Var.f31261e0 = true;
        return new f1(p7Var);
    }

    @Override
    public final void I() {
    }
}

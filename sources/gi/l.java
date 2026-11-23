package gi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import fi.h6;
import fi.o6;
import fi.z5;
import hi.d7;
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
import v4.e1;
public class l extends kj0 {
    public final Context f13636c;
    public h6 f13637e;
    public l f13638f;
    public o3 h;
    public boolean f13640r;
    public final m f13641s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f13639n = new ArrayList();

    public l(m mVar, Context context) {
        this.f13641s = mVar;
        this.f13636c = context;
        M();
    }

    @Override
    public final boolean D(e1 e1Var) {
        return false;
    }

    @Override
    public final String F(int i7) {
        gj gjVar;
        TL_stories.StoryItem storyItem;
        h6 h6Var = this.f13637e;
        if (h6Var == null || i7 < 0 || i7 >= h6Var.f12040i.size() || (gjVar = (gj) this.f13637e.f12040i.get(i7)) == null || (storyItem = gjVar.f24182l) == null) {
            return null;
        }
        return hd.e0(storyItem.date, true);
    }

    @Override
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
        l lVar = this.f13638f;
        m mVar = this.f13641s;
        if (this == lVar) {
            i7 = mVar.f13647e;
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
        fq0 fq0Var = this.f13641s.f13644a0;
        h6 h6Var = this.f13637e;
        if (h6Var != null) {
            if (h6Var instanceof z5) {
                TLRPC.User c22 = np.u1(fq0Var.f13660b).c2(Long.valueOf(fq0Var.d));
                if (c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < h6Var.f12040i.size()) {
                return this.f13637e.m(((gj) this.f13637e.f12040i.get(i7)).e1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.f13637e != null) {
            m mVar = this.f13641s;
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
                    mVar.d = Math.max(2, cz.f23411u1);
                }
                mVar.h.y1(mVar.d);
                mVar.J = true;
            }
        }
    }

    @Override
    public final int b() {
        if (this.f13637e == null) {
            return 0;
        }
        return this.f13637e.g() + this.d.size();
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
        h6 h6Var = this.f13637e;
        boolean z10 = h6Var instanceof z5;
        m mVar = this.f13641s;
        if (z10) {
            z5 z5Var = (z5) h6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = np.u1(this.f13637e.f12036c).R1().F(mVar.f13644a0.d);
            if (F != null) {
                for (int i7 = 0; i7 < F.size(); i7++) {
                    o6 o6Var = (o6) F.get(i7);
                    d7 d7Var = o6Var.f12325c;
                    if (d7Var != null && !d7Var.f14378g && TextUtils.equals(d7Var.K0, z5Var.E)) {
                        arrayList.add(o6Var);
                    }
                }
            }
        }
        super.f();
        l lVar = this.f13638f;
        if (lVar != null) {
            lVar.f();
        }
        if (this != mVar.f13653x) {
            M();
            mVar.c();
        }
    }

    @Override
    public final void t(e1 e1Var, int i7) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        if (this.f13637e != null) {
            View view = e1Var.f59111a;
            if (!(view instanceof p7)) {
                return;
            }
            p7 p7Var = (p7) view;
            p7Var.f31227e0 = true;
            m mVar = this.f13641s;
            ArrayList arrayList = this.d;
            if (i7 >= 0 && i7 < arrayList.size()) {
                o6 o6Var = (o6) arrayList.get(i7);
                p7Var.f31230g0 = false;
                if (o6Var.L == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = o6Var.f12323a;
                    int i13 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i13;
                    tL_storyItem.f28637id = i13;
                    tL_storyItem.attachPath = o6Var.f12327f;
                    gj gjVar = new gj(this.f13637e.f12036c, tL_storyItem);
                    o6Var.L = gjVar;
                    gjVar.f24186m = o6Var;
                }
                gj gjVar2 = o6Var.L;
                if (this == this.f13638f) {
                    i12 = mVar.f13647e;
                } else {
                    i12 = mVar.d;
                }
                p7Var.k(gjVar2, i12, false);
                p7Var.f31227e0 = true;
                p7Var.setReorder(false);
                p7Var.i(false, false);
                return;
            }
            int size = i7 - arrayList.size();
            if (size >= 0 && size < this.f13637e.f12040i.size()) {
                gj gjVar3 = (gj) this.f13637e.f12040i.get(size);
                if (gjVar3 != null && this.f13637e.m(gjVar3.e1())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p7Var.f31230g0 = z10;
                p7Var.setReorder(true);
                if (this == this.f13638f) {
                    i11 = mVar.f13647e;
                } else {
                    i11 = mVar.d;
                }
                p7Var.k(gjVar3, i11, false);
                fq0 fq0Var = mVar.f13644a0;
                if (fq0Var.H.F1 && gjVar3 != null) {
                    p7Var.i(fq0Var.c(gjVar3), true);
                    return;
                } else {
                    p7Var.i(false, false);
                    return;
                }
            }
            p7Var.f31230g0 = false;
            if (this == this.f13638f) {
                i10 = mVar.f13647e;
            } else {
                i10 = mVar.d;
            }
            p7Var.k(null, i10, false);
            p7Var.f31227e0 = true;
        }
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i7) {
        fq0 fq0Var = this.f13641s.f13644a0;
        if (this.h == null) {
            this.h = new o3(viewGroup.getContext(), fq0Var.f13661c);
        }
        p7 p7Var = new p7(this.f13636c, this.h, fq0Var.f13660b);
        p7Var.f31251x0 = true;
        p7Var.setGradientView(null);
        p7Var.f31227e0 = true;
        return new e1(p7Var);
    }

    @Override
    public final void I() {
    }
}

package gi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import fi.a6;
import fi.h6;
import fi.o6;
import hi.x7;
import java.util.ArrayList;
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.kj0;
import v4.f1;
public class l extends kj0 {
    public final Context f13636c;
    public h6 f13637e;
    public l f13638f;
    public ga.d h;
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
    public final boolean D(f1 f1Var) {
        return false;
    }

    @Override
    public final String F(int i7) {
        fj fjVar;
        TL_stories.StoryItem storyItem;
        h6 h6Var = this.f13637e;
        if (h6Var == null || i7 < 0 || i7 >= h6Var.f12051i.size() || (fjVar = (fj) this.f13637e.f12051i.get(i7)) == null || (storyItem = fjVar.f24078l) == null) {
            return null;
        }
        return gd.e0(storyItem.date, true);
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
        eq0 eq0Var = this.f13641s.f13644a0;
        h6 h6Var = this.f13637e;
        if (h6Var != null) {
            if (h6Var instanceof a6) {
                TLRPC.User c22 = mp.u1(eq0Var.f13660b).c2(Long.valueOf(eq0Var.d));
                if (c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < h6Var.f12051i.size()) {
                return this.f13637e.m(((fj) this.f13637e.f12051i.get(i7)).e1());
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
                    mVar.d = Math.max(2, bz.f23327u1);
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
        boolean z10 = h6Var instanceof a6;
        m mVar = this.f13641s;
        if (z10) {
            a6 a6Var = (a6) h6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = mp.u1(this.f13637e.f12047c).R1().F(mVar.f13644a0.d);
            if (F != null) {
                for (int i7 = 0; i7 < F.size(); i7++) {
                    o6 o6Var = (o6) F.get(i7);
                    x7 x7Var = o6Var.f12337c;
                    if (x7Var != null && !x7Var.f15749g && TextUtils.equals(x7Var.K0, a6Var.E)) {
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
    public final void t(f1 f1Var, int i7) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        if (this.f13637e != null) {
            View view = f1Var.f59245a;
            if (!(view instanceof o7)) {
                return;
            }
            o7 o7Var = (o7) view;
            o7Var.f31267e0 = true;
            m mVar = this.f13641s;
            ArrayList arrayList = this.d;
            if (i7 >= 0 && i7 < arrayList.size()) {
                o6 o6Var = (o6) arrayList.get(i7);
                o7Var.f31270g0 = false;
                if (o6Var.L == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = o6Var.f12335a;
                    int i13 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i13;
                    tL_storyItem.f28731id = i13;
                    tL_storyItem.attachPath = o6Var.f12339f;
                    fj fjVar = new fj(this.f13637e.f12047c, tL_storyItem);
                    o6Var.L = fjVar;
                    fjVar.f24082m = o6Var;
                }
                fj fjVar2 = o6Var.L;
                if (this == this.f13638f) {
                    i12 = mVar.f13647e;
                } else {
                    i12 = mVar.d;
                }
                o7Var.k(fjVar2, i12, false);
                o7Var.f31267e0 = true;
                o7Var.setReorder(false);
                o7Var.i(false, false);
                return;
            }
            int size = i7 - arrayList.size();
            if (size >= 0 && size < this.f13637e.f12051i.size()) {
                fj fjVar3 = (fj) this.f13637e.f12051i.get(size);
                if (fjVar3 != null && this.f13637e.m(fjVar3.e1())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o7Var.f31270g0 = z10;
                o7Var.setReorder(true);
                if (this == this.f13638f) {
                    i11 = mVar.f13647e;
                } else {
                    i11 = mVar.d;
                }
                o7Var.k(fjVar3, i11, false);
                eq0 eq0Var = mVar.f13644a0;
                if (eq0Var.H.F1 && fjVar3 != null) {
                    o7Var.i(eq0Var.c(fjVar3), true);
                    return;
                } else {
                    o7Var.i(false, false);
                    return;
                }
            }
            o7Var.f31270g0 = false;
            if (this == this.f13638f) {
                i10 = mVar.f13647e;
            } else {
                i10 = mVar.d;
            }
            o7Var.k(null, i10, false);
            o7Var.f31267e0 = true;
        }
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        eq0 eq0Var = this.f13641s.f13644a0;
        if (this.h == null) {
            this.h = new ga.d(viewGroup.getContext(), eq0Var.f13661c);
        }
        o7 o7Var = new o7(this.f13636c, this.h, eq0Var.f13660b);
        o7Var.f31291x0 = true;
        o7Var.setGradientView(null);
        o7Var.f31267e0 = true;
        return new f1(o7Var);
    }

    @Override
    public final void I() {
    }
}

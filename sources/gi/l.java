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
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.fq0;
import org.telegram.ui.Components.kj0;
import v4.f1;
public class l extends kj0 {
    public final Context f13670c;
    public h6 f13671e;
    public l f13672f;
    public o3 h;
    public boolean f13674r;
    public final m f13675s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f13673n = new ArrayList();

    public l(m mVar, Context context) {
        this.f13675s = mVar;
        this.f13670c = context;
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
        h6 h6Var = this.f13671e;
        if (h6Var == null || i7 < 0 || i7 >= h6Var.f12086i.size() || (fjVar = (fj) this.f13671e.f12086i.get(i7)) == null || (storyItem = fjVar.f23998l) == null) {
            return null;
        }
        return gd.e0(storyItem.date, true);
    }

    @Override
    public final void G(ek0 ek0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = ek0Var.getChildAt(0).getMeasuredHeight();
        l lVar = this.f13672f;
        m mVar = this.f13675s;
        if (this == lVar) {
            i7 = mVar.f13681e;
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
        fq0 fq0Var = this.f13675s.f13678a0;
        h6 h6Var = this.f13671e;
        if (h6Var != null) {
            if (h6Var instanceof a6) {
                TLRPC.User c22 = mp.u1(fq0Var.f13694b).c2(Long.valueOf(fq0Var.d));
                if (c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < h6Var.f12086i.size()) {
                return this.f13671e.m(((fj) this.f13671e.f12086i.get(i7)).e1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.f13671e != null) {
            m mVar = this.f13675s;
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
                    mVar.d = Math.max(2, bz.f23230u1);
                }
                mVar.h.y1(mVar.d);
                mVar.J = true;
            }
        }
    }

    @Override
    public final int b() {
        if (this.f13671e == null) {
            return 0;
        }
        return this.f13671e.g() + this.d.size();
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
        h6 h6Var = this.f13671e;
        boolean z10 = h6Var instanceof a6;
        m mVar = this.f13675s;
        if (z10) {
            a6 a6Var = (a6) h6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = mp.u1(this.f13671e.f12082c).R1().F(mVar.f13678a0.d);
            if (F != null) {
                for (int i7 = 0; i7 < F.size(); i7++) {
                    o6 o6Var = (o6) F.get(i7);
                    c7 c7Var = o6Var.f12372c;
                    if (c7Var != null && !c7Var.f14351g && TextUtils.equals(c7Var.K0, a6Var.E)) {
                        arrayList.add(o6Var);
                    }
                }
            }
        }
        super.f();
        l lVar = this.f13672f;
        if (lVar != null) {
            lVar.f();
        }
        if (this != mVar.f13687x) {
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
        if (this.f13671e != null) {
            View view = f1Var.f59161a;
            if (!(view instanceof p7)) {
                return;
            }
            p7 p7Var = (p7) view;
            p7Var.f31258e0 = true;
            m mVar = this.f13675s;
            ArrayList arrayList = this.d;
            if (i7 >= 0 && i7 < arrayList.size()) {
                o6 o6Var = (o6) arrayList.get(i7);
                p7Var.f31261g0 = false;
                if (o6Var.L == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = o6Var.f12370a;
                    int i13 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i13;
                    tL_storyItem.f28670id = i13;
                    tL_storyItem.attachPath = o6Var.f12374f;
                    fj fjVar = new fj(this.f13671e.f12082c, tL_storyItem);
                    o6Var.L = fjVar;
                    fjVar.f24002m = o6Var;
                }
                fj fjVar2 = o6Var.L;
                if (this == this.f13672f) {
                    i12 = mVar.f13681e;
                } else {
                    i12 = mVar.d;
                }
                p7Var.k(fjVar2, i12, false);
                p7Var.f31258e0 = true;
                p7Var.setReorder(false);
                p7Var.i(false, false);
                return;
            }
            int size = i7 - arrayList.size();
            if (size >= 0 && size < this.f13671e.f12086i.size()) {
                fj fjVar3 = (fj) this.f13671e.f12086i.get(size);
                if (fjVar3 != null && this.f13671e.m(fjVar3.e1())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p7Var.f31261g0 = z10;
                p7Var.setReorder(true);
                if (this == this.f13672f) {
                    i11 = mVar.f13681e;
                } else {
                    i11 = mVar.d;
                }
                p7Var.k(fjVar3, i11, false);
                fq0 fq0Var = mVar.f13678a0;
                if (fq0Var.H.F1 && fjVar3 != null) {
                    p7Var.i(fq0Var.c(fjVar3), true);
                    return;
                } else {
                    p7Var.i(false, false);
                    return;
                }
            }
            p7Var.f31261g0 = false;
            if (this == this.f13672f) {
                i10 = mVar.f13681e;
            } else {
                i10 = mVar.d;
            }
            p7Var.k(null, i10, false);
            p7Var.f31258e0 = true;
        }
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        fq0 fq0Var = this.f13675s.f13678a0;
        if (this.h == null) {
            this.h = new o3(viewGroup.getContext(), fq0Var.f13695c);
        }
        p7 p7Var = new p7(this.f13670c, this.h, fq0Var.f13694b);
        p7Var.f31282x0 = true;
        p7Var.setGradientView(null);
        p7Var.f31258e0 = true;
        return new f1(p7Var);
    }

    @Override
    public final void I() {
    }
}

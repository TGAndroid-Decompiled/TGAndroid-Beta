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
import org.telegram.messenger.bz;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.p7;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.ij0;
import v4.f1;
public class l extends ij0 {
    public final Context f13641c;
    public h6 f13642e;
    public l f13643f;
    public o3 h;
    public boolean f13645r;
    public final m f13646s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f13644n = new ArrayList();

    public l(m mVar, Context context) {
        this.f13646s = mVar;
        this.f13641c = context;
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
        h6 h6Var = this.f13642e;
        if (h6Var == null || i7 < 0 || i7 >= h6Var.f12045i.size() || (fjVar = (fj) this.f13642e.f12045i.get(i7)) == null || (storyItem = fjVar.f23970l) == null) {
            return null;
        }
        return gd.e0(storyItem.date, true);
    }

    @Override
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = ck0Var.getChildAt(0).getMeasuredHeight();
        l lVar = this.f13643f;
        m mVar = this.f13646s;
        if (this == lVar) {
            i7 = mVar.f13652e;
        } else {
            i7 = mVar.d;
        }
        int ceil = (int) (Math.ceil(b() / i7) * measuredHeight);
        int measuredHeight2 = ck0Var.getMeasuredHeight() - ck0Var.getPaddingTop();
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
        dq0 dq0Var = this.f13646s.f13649a0;
        h6 h6Var = this.f13642e;
        if (h6Var != null) {
            if (h6Var instanceof z5) {
                TLRPC.User c22 = mp.u1(dq0Var.f13665b).c2(Long.valueOf(dq0Var.d));
                if (c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < h6Var.f12045i.size()) {
                return this.f13642e.m(((fj) this.f13642e.f12045i.get(i7)).e1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.f13642e != null) {
            m mVar = this.f13646s;
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
                    mVar.d = Math.max(2, bz.f23202u1);
                }
                mVar.h.y1(mVar.d);
                mVar.J = true;
            }
        }
    }

    @Override
    public final int b() {
        if (this.f13642e == null) {
            return 0;
        }
        return this.f13642e.g() + this.d.size();
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
        h6 h6Var = this.f13642e;
        boolean z10 = h6Var instanceof z5;
        m mVar = this.f13646s;
        if (z10) {
            z5 z5Var = (z5) h6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = mp.u1(this.f13642e.f12041c).R1().F(mVar.f13649a0.d);
            if (F != null) {
                for (int i7 = 0; i7 < F.size(); i7++) {
                    o6 o6Var = (o6) F.get(i7);
                    d7 d7Var = o6Var.f12330c;
                    if (d7Var != null && !d7Var.f14401g && TextUtils.equals(d7Var.K0, z5Var.E)) {
                        arrayList.add(o6Var);
                    }
                }
            }
        }
        super.f();
        l lVar = this.f13643f;
        if (lVar != null) {
            lVar.f();
        }
        if (this != mVar.f13658x) {
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
        if (this.f13642e != null) {
            View view = f1Var.f59123a;
            if (!(view instanceof p7)) {
                return;
            }
            p7 p7Var = (p7) view;
            p7Var.f31230e0 = true;
            m mVar = this.f13646s;
            ArrayList arrayList = this.d;
            if (i7 >= 0 && i7 < arrayList.size()) {
                o6 o6Var = (o6) arrayList.get(i7);
                p7Var.f31233g0 = false;
                if (o6Var.L == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = o6Var.f12328a;
                    int i13 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i13;
                    tL_storyItem.f28642id = i13;
                    tL_storyItem.attachPath = o6Var.f12332f;
                    fj fjVar = new fj(this.f13642e.f12041c, tL_storyItem);
                    o6Var.L = fjVar;
                    fjVar.f23974m = o6Var;
                }
                fj fjVar2 = o6Var.L;
                if (this == this.f13643f) {
                    i12 = mVar.f13652e;
                } else {
                    i12 = mVar.d;
                }
                p7Var.k(fjVar2, i12, false);
                p7Var.f31230e0 = true;
                p7Var.setReorder(false);
                p7Var.i(false, false);
                return;
            }
            int size = i7 - arrayList.size();
            if (size >= 0 && size < this.f13642e.f12045i.size()) {
                fj fjVar3 = (fj) this.f13642e.f12045i.get(size);
                if (fjVar3 != null && this.f13642e.m(fjVar3.e1())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                p7Var.f31233g0 = z10;
                p7Var.setReorder(true);
                if (this == this.f13643f) {
                    i11 = mVar.f13652e;
                } else {
                    i11 = mVar.d;
                }
                p7Var.k(fjVar3, i11, false);
                dq0 dq0Var = mVar.f13649a0;
                if (dq0Var.H.F1 && fjVar3 != null) {
                    p7Var.i(dq0Var.c(fjVar3), true);
                    return;
                } else {
                    p7Var.i(false, false);
                    return;
                }
            }
            p7Var.f31233g0 = false;
            if (this == this.f13643f) {
                i10 = mVar.f13652e;
            } else {
                i10 = mVar.d;
            }
            p7Var.k(null, i10, false);
            p7Var.f31230e0 = true;
        }
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        dq0 dq0Var = this.f13646s.f13649a0;
        if (this.h == null) {
            this.h = new o3(viewGroup.getContext(), dq0Var.f13666c);
        }
        p7 p7Var = new p7(this.f13641c, this.h, dq0Var.f13665b);
        p7Var.f31254x0 = true;
        p7Var.setGradientView(null);
        p7Var.f31230e0 = true;
        return new f1(p7Var);
    }

    @Override
    public final void I() {
    }
}

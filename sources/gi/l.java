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
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.dq0;
import org.telegram.ui.Components.ij0;
import v4.f1;
public class l extends ij0 {
    public final Context f13644c;
    public h6 f13645e;
    public l f13646f;
    public o3 h;
    public boolean f13648r;
    public final m f13649s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f13647n = new ArrayList();

    public l(m mVar, Context context) {
        this.f13649s = mVar;
        this.f13644c = context;
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
        h6 h6Var = this.f13645e;
        if (h6Var == null || i7 < 0 || i7 >= h6Var.f12048i.size() || (fjVar = (fj) this.f13645e.f12048i.get(i7)) == null || (storyItem = fjVar.f23973l) == null) {
            return null;
        }
        return gd.e0(storyItem.date, true);
    }

    @Override
    public final void G(ck0 ck0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = ck0Var.getChildAt(0).getMeasuredHeight();
        l lVar = this.f13646f;
        m mVar = this.f13649s;
        if (this == lVar) {
            i7 = mVar.f13655e;
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
        dq0 dq0Var = this.f13649s.f13652a0;
        h6 h6Var = this.f13645e;
        if (h6Var != null) {
            if (h6Var instanceof z5) {
                TLRPC.User c22 = mp.u1(dq0Var.f13668b).c2(Long.valueOf(dq0Var.d));
                if (c22 != null && c22.bot && c22.bot_has_main_app && c22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < h6Var.f12048i.size()) {
                return this.f13645e.m(((fj) this.f13645e.f12048i.get(i7)).e1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.f13645e != null) {
            m mVar = this.f13649s;
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
                    mVar.d = Math.max(2, bz.f23205u1);
                }
                mVar.h.y1(mVar.d);
                mVar.J = true;
            }
        }
    }

    @Override
    public final int b() {
        if (this.f13645e == null) {
            return 0;
        }
        return this.f13645e.g() + this.d.size();
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
        h6 h6Var = this.f13645e;
        boolean z10 = h6Var instanceof z5;
        m mVar = this.f13649s;
        if (z10) {
            z5 z5Var = (z5) h6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = mp.u1(this.f13645e.f12044c).R1().F(mVar.f13652a0.d);
            if (F != null) {
                for (int i7 = 0; i7 < F.size(); i7++) {
                    o6 o6Var = (o6) F.get(i7);
                    d7 d7Var = o6Var.f12333c;
                    if (d7Var != null && !d7Var.f14404g && TextUtils.equals(d7Var.K0, z5Var.E)) {
                        arrayList.add(o6Var);
                    }
                }
            }
        }
        super.f();
        l lVar = this.f13646f;
        if (lVar != null) {
            lVar.f();
        }
        if (this != mVar.f13661x) {
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
        if (this.f13645e != null) {
            View view = f1Var.f59122a;
            if (!(view instanceof o7)) {
                return;
            }
            o7 o7Var = (o7) view;
            o7Var.f31183e0 = true;
            m mVar = this.f13649s;
            ArrayList arrayList = this.d;
            if (i7 >= 0 && i7 < arrayList.size()) {
                o6 o6Var = (o6) arrayList.get(i7);
                o7Var.f31186g0 = false;
                if (o6Var.L == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = o6Var.f12331a;
                    int i13 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i13;
                    tL_storyItem.f28644id = i13;
                    tL_storyItem.attachPath = o6Var.f12335f;
                    fj fjVar = new fj(this.f13645e.f12044c, tL_storyItem);
                    o6Var.L = fjVar;
                    fjVar.f23977m = o6Var;
                }
                fj fjVar2 = o6Var.L;
                if (this == this.f13646f) {
                    i12 = mVar.f13655e;
                } else {
                    i12 = mVar.d;
                }
                o7Var.k(fjVar2, i12, false);
                o7Var.f31183e0 = true;
                o7Var.setReorder(false);
                o7Var.i(false, false);
                return;
            }
            int size = i7 - arrayList.size();
            if (size >= 0 && size < this.f13645e.f12048i.size()) {
                fj fjVar3 = (fj) this.f13645e.f12048i.get(size);
                if (fjVar3 != null && this.f13645e.m(fjVar3.e1())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                o7Var.f31186g0 = z10;
                o7Var.setReorder(true);
                if (this == this.f13646f) {
                    i11 = mVar.f13655e;
                } else {
                    i11 = mVar.d;
                }
                o7Var.k(fjVar3, i11, false);
                dq0 dq0Var = mVar.f13652a0;
                if (dq0Var.H.F1 && fjVar3 != null) {
                    o7Var.i(dq0Var.c(fjVar3), true);
                    return;
                } else {
                    o7Var.i(false, false);
                    return;
                }
            }
            o7Var.f31186g0 = false;
            if (this == this.f13646f) {
                i10 = mVar.f13655e;
            } else {
                i10 = mVar.d;
            }
            o7Var.k(null, i10, false);
            o7Var.f31183e0 = true;
        }
    }

    @Override
    public final f1 x(ViewGroup viewGroup, int i7) {
        dq0 dq0Var = this.f13649s.f13652a0;
        if (this.h == null) {
            this.h = new o3(viewGroup.getContext(), dq0Var.f13669c);
        }
        o7 o7Var = new o7(this.f13644c, this.h, dq0Var.f13668b);
        o7Var.f31207x0 = true;
        o7Var.setGradientView(null);
        o7Var.f31183e0 = true;
        return new f1(o7Var);
    }

    @Override
    public final void I() {
    }
}

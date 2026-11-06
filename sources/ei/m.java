package ei;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import di.j6;
import di.q6;
import di.x6;
import fi.e7;
import java.util.ArrayList;
import m.q3;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.Components.vi0;
import v4.d1;
public class m extends vi0 {
    public final Context f10822c;
    public q6 f10823e;
    public m f10824f;
    public q3 h;
    public boolean f10826r;
    public final n f10827s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f10825n = new ArrayList();

    public m(n nVar, Context context) {
        this.f10827s = nVar;
        this.f10822c = context;
        M();
    }

    @Override
    public final boolean D(d1 d1Var) {
        return false;
    }

    @Override
    public final String F(int i7) {
        ij ijVar;
        TL_stories.StoryItem storyItem;
        q6 q6Var = this.f10823e;
        if (q6Var == null || i7 < 0 || i7 >= q6Var.f9643i.size() || (ijVar = (ij) this.f10823e.f9643i.get(i7)) == null || (storyItem = ijVar.f23241l) == null) {
            return null;
        }
        return hd.e0(storyItem.date, true);
    }

    @Override
    public final void G(pj0 pj0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = pj0Var.getChildAt(0).getMeasuredHeight();
        m mVar = this.f10824f;
        n nVar = this.f10827s;
        if (this == mVar) {
            i7 = nVar.f10832e;
        } else {
            i7 = nVar.d;
        }
        int ceil = (int) (Math.ceil(b() / i7) * measuredHeight);
        int measuredHeight2 = pj0Var.getMeasuredHeight() - pj0Var.getPaddingTop();
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
        sp0 sp0Var = this.f10827s.W;
        q6 q6Var = this.f10823e;
        if (q6Var != null) {
            if (q6Var instanceof j6) {
                TLRPC.User a22 = qp.s1(sp0Var.f10845b).a2(Long.valueOf(sp0Var.d));
                if (a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < q6Var.f9643i.size()) {
                return this.f10823e.m(((ij) this.f10823e.f9643i.get(i7)).f1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.f10823e != null) {
            n nVar = this.f10827s;
            if ((!nVar.I || (nVar.H && b() > 1)) && b() > 0) {
                boolean z9 = false;
                if (b() < 5) {
                    int max = Math.max(1, b());
                    nVar.d = max;
                    if (max == 1) {
                        z9 = true;
                    }
                    nVar.H = z9;
                } else if (nVar.H || nVar.d == 1) {
                    nVar.H = false;
                    nVar.d = Math.max(2, iz.f23414u1);
                }
                nVar.h.y1(nVar.d);
                nVar.I = true;
            }
        }
    }

    @Override
    public final int b() {
        if (this.f10823e == null) {
            return 0;
        }
        return this.f10823e.g() + this.d.size();
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
        q6 q6Var = this.f10823e;
        boolean z9 = q6Var instanceof j6;
        n nVar = this.f10827s;
        if (z9) {
            j6 j6Var = (j6) q6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = qp.s1(this.f10823e.f9639c).P1().F(nVar.W.d);
            if (F != null) {
                for (int i7 = 0; i7 < F.size(); i7++) {
                    x6 x6Var = (x6) F.get(i7);
                    e7 e7Var = x6Var.f9930c;
                    if (e7Var != null && !e7Var.f11892g && TextUtils.equals(e7Var.K0, j6Var.E)) {
                        arrayList.add(x6Var);
                    }
                }
            }
        }
        super.f();
        m mVar = this.f10824f;
        if (mVar != null) {
            mVar.f();
        }
        if (this != nVar.f10838x) {
            M();
            nVar.c();
        }
    }

    @Override
    public final void t(d1 d1Var, int i7) {
        int i10;
        boolean z9;
        int i11;
        int i12;
        if (this.f10823e != null) {
            View view = d1Var.f56927a;
            if (!(view instanceof o7)) {
                return;
            }
            o7 o7Var = (o7) view;
            o7Var.f29662d0 = true;
            n nVar = this.f10827s;
            ArrayList arrayList = this.d;
            if (i7 >= 0 && i7 < arrayList.size()) {
                x6 x6Var = (x6) arrayList.get(i7);
                o7Var.f29666f0 = false;
                if (x6Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = x6Var.f9928a;
                    int i13 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i13;
                    tL_storyItem.f27191id = i13;
                    tL_storyItem.attachPath = x6Var.f9932f;
                    ij ijVar = new ij(this.f10823e.f9639c, tL_storyItem);
                    x6Var.K = ijVar;
                    ijVar.f23244m = x6Var;
                }
                ij ijVar2 = x6Var.K;
                if (this == this.f10824f) {
                    i12 = nVar.f10832e;
                } else {
                    i12 = nVar.d;
                }
                o7Var.k(ijVar2, i12, false);
                o7Var.f29662d0 = true;
                o7Var.setReorder(false);
                o7Var.i(false, false);
                return;
            }
            int size = i7 - arrayList.size();
            if (size >= 0 && size < this.f10823e.f9643i.size()) {
                ij ijVar3 = (ij) this.f10823e.f9643i.get(size);
                if (ijVar3 != null && this.f10823e.m(ijVar3.f1())) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                o7Var.f29666f0 = z9;
                o7Var.setReorder(true);
                if (this == this.f10824f) {
                    i11 = nVar.f10832e;
                } else {
                    i11 = nVar.d;
                }
                o7Var.k(ijVar3, i11, false);
                sp0 sp0Var = nVar.W;
                if (sp0Var.G.E1 && ijVar3 != null) {
                    o7Var.i(sp0Var.c(ijVar3), true);
                    return;
                } else {
                    o7Var.i(false, false);
                    return;
                }
            }
            o7Var.f29666f0 = false;
            if (this == this.f10824f) {
                i10 = nVar.f10832e;
            } else {
                i10 = nVar.d;
            }
            o7Var.k(null, i10, false);
            o7Var.f29662d0 = true;
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i7) {
        sp0 sp0Var = this.f10827s.W;
        if (this.h == null) {
            this.h = new q3(viewGroup.getContext(), sp0Var.f10846c);
        }
        o7 o7Var = new o7(this.f10822c, this.h, sp0Var.f10845b);
        o7Var.f29686w0 = true;
        o7Var.setGradientView(null);
        o7Var.f29662d0 = true;
        return new d1(o7Var);
    }

    @Override
    public final void I() {
    }
}

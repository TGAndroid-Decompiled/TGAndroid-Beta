package ei;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import di.k6;
import di.r6;
import di.y6;
import fi.e7;
import java.util.ArrayList;
import m.q3;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.o7;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.wi0;
import v4.d1;
public class m extends wi0 {
    public final Context f10822c;
    public r6 f10823e;
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
        r6 r6Var = this.f10823e;
        if (r6Var == null || i7 < 0 || i7 >= r6Var.f9694i.size() || (ijVar = (ij) this.f10823e.f9694i.get(i7)) == null || (storyItem = ijVar.f23266l) == null) {
            return null;
        }
        return id.e0(storyItem.date, true);
    }

    @Override
    public final void G(qj0 qj0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = qj0Var.getChildAt(0).getMeasuredHeight();
        m mVar = this.f10824f;
        n nVar = this.f10827s;
        if (this == mVar) {
            i7 = nVar.f10832e;
        } else {
            i7 = nVar.d;
        }
        int ceil = (int) (Math.ceil(b() / i7) * measuredHeight);
        int measuredHeight2 = qj0Var.getMeasuredHeight() - qj0Var.getPaddingTop();
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
        tp0 tp0Var = this.f10827s.W;
        r6 r6Var = this.f10823e;
        if (r6Var != null) {
            if (r6Var instanceof k6) {
                TLRPC.User a22 = qp.s1(tp0Var.f10845b).a2(Long.valueOf(tp0Var.d));
                if (a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < r6Var.f9694i.size()) {
                return this.f10823e.m(((ij) this.f10823e.f9694i.get(i7)).e1());
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
                    nVar.d = Math.max(2, iz.f23442u1);
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
        r6 r6Var = this.f10823e;
        boolean z9 = r6Var instanceof k6;
        n nVar = this.f10827s;
        if (z9) {
            k6 k6Var = (k6) r6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = qp.s1(this.f10823e.f9690c).P1().F(nVar.W.d);
            if (F != null) {
                for (int i7 = 0; i7 < F.size(); i7++) {
                    y6 y6Var = (y6) F.get(i7);
                    e7 e7Var = y6Var.f9960c;
                    if (e7Var != null && !e7Var.f11892g && TextUtils.equals(e7Var.K0, k6Var.E)) {
                        arrayList.add(y6Var);
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
            View view = d1Var.f57056a;
            if (!(view instanceof o7)) {
                return;
            }
            o7 o7Var = (o7) view;
            o7Var.f29670d0 = true;
            n nVar = this.f10827s;
            ArrayList arrayList = this.d;
            if (i7 >= 0 && i7 < arrayList.size()) {
                y6 y6Var = (y6) arrayList.get(i7);
                o7Var.f29674f0 = false;
                if (y6Var.K == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = y6Var.f9958a;
                    int i13 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i13;
                    tL_storyItem.f27195id = i13;
                    tL_storyItem.attachPath = y6Var.f9962f;
                    ij ijVar = new ij(this.f10823e.f9690c, tL_storyItem);
                    y6Var.K = ijVar;
                    ijVar.f23269m = y6Var;
                }
                ij ijVar2 = y6Var.K;
                if (this == this.f10824f) {
                    i12 = nVar.f10832e;
                } else {
                    i12 = nVar.d;
                }
                o7Var.k(ijVar2, i12, false);
                o7Var.f29670d0 = true;
                o7Var.setReorder(false);
                o7Var.i(false, false);
                return;
            }
            int size = i7 - arrayList.size();
            if (size >= 0 && size < this.f10823e.f9694i.size()) {
                ij ijVar3 = (ij) this.f10823e.f9694i.get(size);
                if (ijVar3 != null && this.f10823e.m(ijVar3.e1())) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                o7Var.f29674f0 = z9;
                o7Var.setReorder(true);
                if (this == this.f10824f) {
                    i11 = nVar.f10832e;
                } else {
                    i11 = nVar.d;
                }
                o7Var.k(ijVar3, i11, false);
                tp0 tp0Var = nVar.W;
                if (tp0Var.G.E1 && ijVar3 != null) {
                    o7Var.i(tp0Var.c(ijVar3), true);
                    return;
                } else {
                    o7Var.i(false, false);
                    return;
                }
            }
            o7Var.f29674f0 = false;
            if (this == this.f10824f) {
                i10 = nVar.f10832e;
            } else {
                i10 = nVar.d;
            }
            o7Var.k(null, i10, false);
            o7Var.f29670d0 = true;
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i7) {
        tp0 tp0Var = this.f10827s.W;
        if (this.h == null) {
            this.h = new q3(viewGroup.getContext(), tp0Var.f10846c);
        }
        o7 o7Var = new o7(this.f10822c, this.h, tp0Var.f10845b);
        o7Var.f29694w0 = true;
        o7Var.setGradientView(null);
        o7Var.f29670d0 = true;
        return new d1(o7Var);
    }

    @Override
    public final void I() {
    }
}

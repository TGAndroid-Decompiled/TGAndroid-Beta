package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class fr0 extends w29 {
    public final Context c;
    public s1b e;
    public fr0 f;
    public jb4 h;
    public boolean r;
    public final gr0 s;
    public final ArrayList d = new ArrayList();
    public final ArrayList n = new ArrayList();

    public fr0(gr0 gr0Var, Context context) {
        this.s = gr0Var;
        this.c = context;
        M();
    }

    @Override
    public final boolean D(s49 s49Var) {
        return false;
    }

    @Override
    public final String F(int i) {
        k27 k27Var;
        TL_stories.StoryItem storyItem;
        s1b s1bVar = this.e;
        if (s1bVar != null && i >= 0 && i < s1bVar.i.size() && (k27Var = (k27) this.e.i.get(i)) != null && (storyItem = k27Var.l) != null) {
            return k96.e0(storyItem.date, true);
        }
        return null;
    }

    @Override
    public final void G(o39 o39Var, float f, int[] iArr) {
        int i;
        int measuredHeight = o39Var.getChildAt(0).getMeasuredHeight();
        fr0 fr0Var = this.f;
        gr0 gr0Var = this.s;
        if (this == fr0Var) {
            i = gr0Var.e;
        } else {
            i = gr0Var.d;
        }
        int ceil = (int) (Math.ceil(b() / i) * measuredHeight);
        int measuredHeight2 = o39Var.getMeasuredHeight() - o39Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f2 = f * (ceil - measuredHeight2);
        iArr[0] = ((int) (f2 / measuredHeight)) * i;
        iArr[1] = ((int) f2) % measuredHeight;
    }

    public final boolean L(int i) {
        TLRPC.User V1;
        kca kcaVar = this.s.a0;
        if (this.e != null && (V1 = na7.q1(kcaVar.b).V1(Long.valueOf(kcaVar.d))) != null && V1.bot && V1.bot_has_main_app && V1.bot_can_edit) {
            return true;
        }
        return false;
    }

    public final void M() {
        int max;
        if (this.e != null) {
            gr0 gr0Var = this.s;
            if ((!gr0Var.J || (gr0Var.I && b() > 1)) && b() > 0) {
                boolean z = false;
                if (b() < 5) {
                    max = Math.max(1, b());
                    gr0Var.d = max;
                    if (max == 1) {
                        z = true;
                    }
                    gr0Var.I = z;
                } else if (gr0Var.I || (max = gr0Var.d) == 1) {
                    gr0Var.I = false;
                    max = Math.max(2, gba.q1);
                    gr0Var.d = max;
                }
                gr0Var.h.x1(max);
                gr0Var.J = true;
            }
        }
    }

    @Override
    public final int b() {
        if (this.e == null) {
            return 0;
        }
        return this.e.i.size() + this.d.size();
    }

    @Override
    public final int d(int i) {
        return 19;
    }

    @Override
    public final int e() {
        return b();
    }

    @Override
    public void f() {
        s1b s1bVar = this.e;
        boolean A = ug8.A(s1bVar);
        gr0 gr0Var = this.s;
        if (A) {
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = na7.q1(this.e.c).M1().E(gr0Var.a0.d);
            if (E != null) {
                for (int i = 0; i < E.size(); i++) {
                    f2b f2bVar = (f2b) E.get(i);
                    f4b f4bVar = f2bVar.c;
                    if (f4bVar != null && !f4bVar.g && TextUtils.equals(f4bVar.K0, s1bVar.E)) {
                        arrayList.add(f2bVar);
                    }
                }
            }
        }
        super.f();
        fr0 fr0Var = this.f;
        if (fr0Var != null) {
            fr0Var.f();
        }
        if (this != gr0Var.x) {
            M();
            gr0Var.c();
        }
    }

    @Override
    public final void t(s49 s49Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        if (this.e != null) {
            View view = s49Var.a;
            if (!(view instanceof qfa)) {
                return;
            }
            qfa qfaVar = (qfa) view;
            qfaVar.e0 = true;
            gr0 gr0Var = this.s;
            ArrayList arrayList = this.d;
            if (i >= 0 && i < arrayList.size()) {
                f2b f2bVar = (f2b) arrayList.get(i);
                qfaVar.g0 = false;
                k27 k27Var = f2bVar.L;
                if (k27Var == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j = f2bVar.a;
                    int i5 = (int) (j ^ (j >>> 32));
                    tL_storyItem.messageId = i5;
                    tL_storyItem.id = i5;
                    tL_storyItem.attachPath = f2bVar.f;
                    k27 k27Var2 = new k27(this.e.c, tL_storyItem);
                    f2bVar.L = k27Var2;
                    k27Var2.m = f2bVar;
                    k27Var = k27Var2;
                }
                if (this == this.f) {
                    i4 = gr0Var.e;
                } else {
                    i4 = gr0Var.d;
                }
                qfaVar.k(k27Var, i4, false);
                qfaVar.e0 = true;
                qfaVar.setReorder(false);
                qfaVar.i(false, false);
                return;
            }
            int size = i - arrayList.size();
            if (size >= 0 && size < this.e.i.size()) {
                k27 k27Var3 = (k27) this.e.i.get(size);
                if (k27Var3 != null && this.e.m(k27Var3.e1())) {
                    z = true;
                } else {
                    z = false;
                }
                qfaVar.g0 = z;
                qfaVar.setReorder(true);
                if (this == this.f) {
                    i3 = gr0Var.e;
                } else {
                    i3 = gr0Var.d;
                }
                qfaVar.k(k27Var3, i3, false);
                kca kcaVar = gr0Var.a0;
                if (kcaVar.H.F1 && k27Var3 != null) {
                    qfaVar.i(kcaVar.c(k27Var3), true);
                    return;
                } else {
                    qfaVar.i(false, false);
                    return;
                }
            }
            qfaVar.g0 = false;
            if (this == this.f) {
                i2 = gr0Var.e;
            } else {
                i2 = gr0Var.d;
            }
            qfaVar.k(null, i2, false);
            qfaVar.e0 = true;
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        kca kcaVar = this.s.a0;
        if (this.h == null) {
            this.h = new jb4(viewGroup.getContext(), kcaVar.c);
        }
        qfa qfaVar = new qfa(this.c, this.h, kcaVar.b);
        qfaVar.x0 = true;
        qfaVar.setGradientView(null);
        qfaVar.e0 = true;
        return new s49(qfaVar);
    }

    @Override
    public final void I() {
    }
}

package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public class fr0 extends l69 {
    public final Context c;
    public o5b e;
    public fr0 f;
    public gd4 h;
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
    public final boolean D(f89 f89Var) {
        return false;
    }

    @Override
    public final String F(int i) {
        r47 r47Var;
        TL_stories.StoryItem storyItem;
        o5b o5bVar = this.e;
        if (o5bVar != null && i >= 0 && i < o5bVar.i.size() && (r47Var = (r47) this.e.i.get(i)) != null && (storyItem = r47Var.l) != null) {
            return ob6.e0(storyItem.date, true);
        }
        return null;
    }

    @Override
    public final void G(d79 d79Var, float f, int[] iArr) {
        int i;
        int measuredHeight = d79Var.getChildAt(0).getMeasuredHeight();
        fr0 fr0Var = this.f;
        gr0 gr0Var = this.s;
        if (this == fr0Var) {
            i = gr0Var.e;
        } else {
            i = gr0Var.d;
        }
        int ceil = (int) (Math.ceil(b() / i) * measuredHeight);
        int measuredHeight2 = d79Var.getMeasuredHeight() - d79Var.getPaddingTop();
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
        TLRPC.User X1;
        bga bgaVar = this.s.a0;
        if (this.e != null && (X1 = uc7.s1(bgaVar.b).X1(Long.valueOf(bgaVar.d))) != null && X1.bot && X1.bot_has_main_app && X1.bot_can_edit) {
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
                    max = Math.max(2, xea.q1);
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
        o5b o5bVar = this.e;
        boolean A = ik8.A(o5bVar);
        gr0 gr0Var = this.s;
        if (A) {
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList E = uc7.s1(this.e.c).O1().E(gr0Var.a0.d);
            if (E != null) {
                for (int i = 0; i < E.size(); i++) {
                    b6b b6bVar = (b6b) E.get(i);
                    c8b c8bVar = b6bVar.c;
                    if (c8bVar != null && !c8bVar.g && TextUtils.equals(c8bVar.K0, o5bVar.E)) {
                        arrayList.add(b6bVar);
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
    public final void t(f89 f89Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        if (this.e != null) {
            View view = f89Var.a;
            if (!(view instanceof jja)) {
                return;
            }
            jja jjaVar = (jja) view;
            jjaVar.e0 = true;
            gr0 gr0Var = this.s;
            ArrayList arrayList = this.d;
            if (i >= 0 && i < arrayList.size()) {
                b6b b6bVar = (b6b) arrayList.get(i);
                jjaVar.g0 = false;
                r47 r47Var = b6bVar.L;
                if (r47Var == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j = b6bVar.a;
                    int i5 = (int) (j ^ (j >>> 32));
                    tL_storyItem.messageId = i5;
                    tL_storyItem.id = i5;
                    tL_storyItem.attachPath = b6bVar.f;
                    r47 r47Var2 = new r47(this.e.c, tL_storyItem);
                    b6bVar.L = r47Var2;
                    r47Var2.m = b6bVar;
                    r47Var = r47Var2;
                }
                if (this == this.f) {
                    i4 = gr0Var.e;
                } else {
                    i4 = gr0Var.d;
                }
                jjaVar.k(i4, r47Var, false);
                jjaVar.e0 = true;
                jjaVar.setReorder(false);
                jjaVar.i(false, false);
                return;
            }
            int size = i - arrayList.size();
            if (size >= 0 && size < this.e.i.size()) {
                r47 r47Var3 = (r47) this.e.i.get(size);
                if (r47Var3 != null && this.e.m(r47Var3.e1())) {
                    z = true;
                } else {
                    z = false;
                }
                jjaVar.g0 = z;
                jjaVar.setReorder(true);
                if (this == this.f) {
                    i3 = gr0Var.e;
                } else {
                    i3 = gr0Var.d;
                }
                jjaVar.k(i3, r47Var3, false);
                bga bgaVar = gr0Var.a0;
                if (bgaVar.H.F1 && r47Var3 != null) {
                    jjaVar.i(bgaVar.c(r47Var3), true);
                    return;
                } else {
                    jjaVar.i(false, false);
                    return;
                }
            }
            jjaVar.g0 = false;
            if (this == this.f) {
                i2 = gr0Var.e;
            } else {
                i2 = gr0Var.d;
            }
            jjaVar.k(i2, null, false);
            jjaVar.e0 = true;
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        bga bgaVar = this.s.a0;
        if (this.h == null) {
            this.h = new gd4(viewGroup.getContext(), bgaVar.c);
        }
        jja jjaVar = new jja(this.c, this.h, bgaVar.b);
        jjaVar.x0 = true;
        jjaVar.setGradientView(null);
        jjaVar.e0 = true;
        return new f89(jjaVar);
    }

    @Override
    public final void I() {
    }
}

package fi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import ei.k6;
import ei.r6;
import ei.y6;
import gi.f7;
import java.util.ArrayList;
import m.o3;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.tp0;
import org.telegram.ui.Components.zi0;
import u4.d1;
public class l extends zi0 {
    public final Context f11608c;
    public r6 f11609e;
    public l f11610f;
    public o3 h;
    public boolean f11612r;
    public final m f11613s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f11611n = new ArrayList();

    public l(m mVar, Context context) {
        this.f11613s = mVar;
        this.f11608c = context;
        M();
    }

    @Override
    public final boolean D(d1 d1Var) {
        return false;
    }

    @Override
    public final String F(int i3) {
        zi ziVar;
        TL_stories.StoryItem storyItem;
        r6 r6Var = this.f11609e;
        if (r6Var == null || i3 < 0 || i3 >= r6Var.f10876i.size() || (ziVar = (zi) this.f11609e.f10876i.get(i3)) == null || (storyItem = ziVar.f26871l) == null) {
            return null;
        }
        return bd.e0(storyItem.date, true);
    }

    @Override
    public final void G(tj0 tj0Var, float f10, int[] iArr) {
        int i3;
        int measuredHeight = tj0Var.getChildAt(0).getMeasuredHeight();
        l lVar = this.f11610f;
        m mVar = this.f11613s;
        if (this == lVar) {
            i3 = mVar.f11619e;
        } else {
            i3 = mVar.d;
        }
        int ceil = (int) (Math.ceil(b() / i3) * measuredHeight);
        int measuredHeight2 = tj0Var.getMeasuredHeight() - tj0Var.getPaddingTop();
        if (measuredHeight == 0) {
            iArr[1] = 0;
            iArr[0] = 0;
            return;
        }
        float f11 = f10 * (ceil - measuredHeight2);
        iArr[0] = ((int) (f11 / measuredHeight)) * i3;
        iArr[1] = ((int) f11) % measuredHeight;
    }

    public final boolean L(int i3) {
        tp0 tp0Var = this.f11613s.f11616a0;
        r6 r6Var = this.f11609e;
        if (r6Var != null) {
            if (r6Var instanceof k6) {
                TLRPC.User a22 = hp.s1(tp0Var.f11632b).a2(Long.valueOf(tp0Var.d));
                if (a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i3 >= 0 && i3 < r6Var.f10876i.size()) {
                return this.f11609e.m(((zi) this.f11609e.f10876i.get(i3)).f1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.f11609e != null) {
            m mVar = this.f11613s;
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
                    mVar.d = Math.max(2, az.f21669u1);
                }
                mVar.h.y1(mVar.d);
                mVar.J = true;
            }
        }
    }

    @Override
    public final int b() {
        if (this.f11609e == null) {
            return 0;
        }
        return this.f11609e.g() + this.d.size();
    }

    @Override
    public final int d(int i3) {
        return 19;
    }

    @Override
    public final int e() {
        return b();
    }

    @Override
    public void f() {
        r6 r6Var = this.f11609e;
        boolean z10 = r6Var instanceof k6;
        m mVar = this.f11613s;
        if (z10) {
            k6 k6Var = (k6) r6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = hp.s1(this.f11609e.f10872c).P1().F(mVar.f11616a0.d);
            if (F != null) {
                for (int i3 = 0; i3 < F.size(); i3++) {
                    y6 y6Var = (y6) F.get(i3);
                    f7 f7Var = y6Var.f11236c;
                    if (f7Var != null && !f7Var.f12718g && TextUtils.equals(f7Var.K0, k6Var.E)) {
                        arrayList.add(y6Var);
                    }
                }
            }
        }
        super.f();
        l lVar = this.f11610f;
        if (lVar != null) {
            lVar.f();
        }
        if (this != mVar.f11625x) {
            M();
            mVar.c();
        }
    }

    @Override
    public final void t(d1 d1Var, int i3) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        if (this.f11609e != null) {
            View view = d1Var.f55540a;
            if (!(view instanceof n7)) {
                return;
            }
            n7 n7Var = (n7) view;
            n7Var.f29687e0 = true;
            m mVar = this.f11613s;
            ArrayList arrayList = this.d;
            if (i3 >= 0 && i3 < arrayList.size()) {
                y6 y6Var = (y6) arrayList.get(i3);
                n7Var.f29690g0 = false;
                if (y6Var.L == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j10 = y6Var.f11234a;
                    int i13 = (int) (j10 ^ (j10 >>> 32));
                    tL_storyItem.messageId = i13;
                    tL_storyItem.f27240id = i13;
                    tL_storyItem.attachPath = y6Var.f11238f;
                    zi ziVar = new zi(this.f11609e.f10872c, tL_storyItem);
                    y6Var.L = ziVar;
                    ziVar.f26875m = y6Var;
                }
                zi ziVar2 = y6Var.L;
                if (this == this.f11610f) {
                    i12 = mVar.f11619e;
                } else {
                    i12 = mVar.d;
                }
                n7Var.k(ziVar2, i12, false);
                n7Var.f29687e0 = true;
                n7Var.setReorder(false);
                n7Var.i(false, false);
                return;
            }
            int size = i3 - arrayList.size();
            if (size >= 0 && size < this.f11609e.f10876i.size()) {
                zi ziVar3 = (zi) this.f11609e.f10876i.get(size);
                if (ziVar3 != null && this.f11609e.m(ziVar3.f1())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n7Var.f29690g0 = z10;
                n7Var.setReorder(true);
                if (this == this.f11610f) {
                    i11 = mVar.f11619e;
                } else {
                    i11 = mVar.d;
                }
                n7Var.k(ziVar3, i11, false);
                tp0 tp0Var = mVar.f11616a0;
                if (tp0Var.H.F1 && ziVar3 != null) {
                    n7Var.i(tp0Var.c(ziVar3), true);
                    return;
                } else {
                    n7Var.i(false, false);
                    return;
                }
            }
            n7Var.f29690g0 = false;
            if (this == this.f11610f) {
                i10 = mVar.f11619e;
            } else {
                i10 = mVar.d;
            }
            n7Var.k(null, i10, false);
            n7Var.f29687e0 = true;
        }
    }

    @Override
    public final d1 x(ViewGroup viewGroup, int i3) {
        tp0 tp0Var = this.f11613s.f11616a0;
        if (this.h == null) {
            this.h = new o3(viewGroup.getContext(), tp0Var.f11633c);
        }
        n7 n7Var = new n7(this.f11608c, this.h, tp0Var.f11632b);
        n7Var.f29711x0 = true;
        n7Var.setGradientView(null);
        n7Var.f29687e0 = true;
        return new d1(n7Var);
    }

    @Override
    public final void I() {
    }
}

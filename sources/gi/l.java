package gi;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import fi.c6;
import fi.k6;
import fi.r6;
import hi.d7;
import java.util.ArrayList;
import m.o3;
import org.telegram.messenger.gj;
import org.telegram.messenger.gz;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Cells.n7;
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vp0;
import v4.e1;
public class l extends aj0 {
    public final Context f13329c;
    public k6 f13330e;
    public l f13331f;
    public o3 h;
    public boolean f13333r;
    public final m f13334s;
    public final ArrayList d = new ArrayList();
    public final ArrayList f13332n = new ArrayList();

    public l(m mVar, Context context) {
        this.f13334s = mVar;
        this.f13329c = context;
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
        k6 k6Var = this.f13330e;
        if (k6Var == null || i7 < 0 || i7 >= k6Var.f11944i.size() || (gjVar = (gj) this.f13330e.f11944i.get(i7)) == null || (storyItem = gjVar.f23822l) == null) {
            return null;
        }
        return hd.e0(storyItem.date, true);
    }

    @Override
    public final void G(uj0 uj0Var, float f10, int[] iArr) {
        int i7;
        int measuredHeight = uj0Var.getChildAt(0).getMeasuredHeight();
        l lVar = this.f13331f;
        m mVar = this.f13334s;
        if (this == lVar) {
            i7 = mVar.f13340e;
        } else {
            i7 = mVar.d;
        }
        int ceil = (int) (Math.ceil(b() / i7) * measuredHeight);
        int measuredHeight2 = uj0Var.getMeasuredHeight() - uj0Var.getPaddingTop();
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
        vp0 vp0Var = this.f13334s.f13337a0;
        k6 k6Var = this.f13330e;
        if (k6Var != null) {
            if (k6Var instanceof c6) {
                TLRPC.User a22 = np.s1(vp0Var.f13353b).a2(Long.valueOf(vp0Var.d));
                if (a22 != null && a22.bot && a22.bot_has_main_app && a22.bot_can_edit) {
                    return true;
                }
                return false;
            } else if (i7 >= 0 && i7 < k6Var.f11944i.size()) {
                return this.f13330e.m(((gj) this.f13330e.f11944i.get(i7)).e1());
            } else {
                return false;
            }
        }
        return false;
    }

    public final void M() {
        if (this.f13330e != null) {
            m mVar = this.f13334s;
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
                    mVar.d = Math.max(2, gz.f23986u1);
                }
                mVar.h.y1(mVar.d);
                mVar.J = true;
            }
        }
    }

    @Override
    public final int b() {
        if (this.f13330e == null) {
            return 0;
        }
        return this.f13330e.g() + this.d.size();
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
        k6 k6Var = this.f13330e;
        boolean z10 = k6Var instanceof c6;
        m mVar = this.f13334s;
        if (z10) {
            c6 c6Var = (c6) k6Var;
            ArrayList arrayList = this.d;
            arrayList.clear();
            ArrayList F = np.s1(this.f13330e.f11940c).P1().F(mVar.f13337a0.d);
            if (F != null) {
                for (int i7 = 0; i7 < F.size(); i7++) {
                    r6 r6Var = (r6) F.get(i7);
                    d7 d7Var = r6Var.f12274c;
                    if (d7Var != null && !d7Var.f14139g && TextUtils.equals(d7Var.K0, c6Var.E)) {
                        arrayList.add(r6Var);
                    }
                }
            }
        }
        super.f();
        l lVar = this.f13331f;
        if (lVar != null) {
            lVar.f();
        }
        if (this != mVar.f13346x) {
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
        if (this.f13330e != null) {
            View view = e1Var.f58535a;
            if (!(view instanceof n7)) {
                return;
            }
            n7 n7Var = (n7) view;
            n7Var.f30748e0 = true;
            m mVar = this.f13334s;
            ArrayList arrayList = this.d;
            if (i7 >= 0 && i7 < arrayList.size()) {
                r6 r6Var = (r6) arrayList.get(i7);
                n7Var.f30751g0 = false;
                if (r6Var.L == null) {
                    TL_stories.TL_storyItem tL_storyItem = new TL_stories.TL_storyItem();
                    long j3 = r6Var.f12272a;
                    int i13 = (int) (j3 ^ (j3 >>> 32));
                    tL_storyItem.messageId = i13;
                    tL_storyItem.f28290id = i13;
                    tL_storyItem.attachPath = r6Var.f12276f;
                    gj gjVar = new gj(this.f13330e.f11940c, tL_storyItem);
                    r6Var.L = gjVar;
                    gjVar.f23826m = r6Var;
                }
                gj gjVar2 = r6Var.L;
                if (this == this.f13331f) {
                    i12 = mVar.f13340e;
                } else {
                    i12 = mVar.d;
                }
                n7Var.k(gjVar2, i12, false);
                n7Var.f30748e0 = true;
                n7Var.setReorder(false);
                n7Var.i(false, false);
                return;
            }
            int size = i7 - arrayList.size();
            if (size >= 0 && size < this.f13330e.f11944i.size()) {
                gj gjVar3 = (gj) this.f13330e.f11944i.get(size);
                if (gjVar3 != null && this.f13330e.m(gjVar3.e1())) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n7Var.f30751g0 = z10;
                n7Var.setReorder(true);
                if (this == this.f13331f) {
                    i11 = mVar.f13340e;
                } else {
                    i11 = mVar.d;
                }
                n7Var.k(gjVar3, i11, false);
                vp0 vp0Var = mVar.f13337a0;
                if (vp0Var.H.F1 && gjVar3 != null) {
                    n7Var.i(vp0Var.c(gjVar3), true);
                    return;
                } else {
                    n7Var.i(false, false);
                    return;
                }
            }
            n7Var.f30751g0 = false;
            if (this == this.f13331f) {
                i10 = mVar.f13340e;
            } else {
                i10 = mVar.d;
            }
            n7Var.k(null, i10, false);
            n7Var.f30748e0 = true;
        }
    }

    @Override
    public final e1 x(ViewGroup viewGroup, int i7) {
        vp0 vp0Var = this.f13334s.f13337a0;
        if (this.h == null) {
            this.h = new o3(viewGroup.getContext(), vp0Var.f13354c);
        }
        n7 n7Var = new n7(this.f13329c, this.h, vp0Var.f13353b);
        n7Var.f30772x0 = true;
        n7Var.setGradientView(null);
        n7Var.f30748e0 = true;
        return new e1(n7Var);
    }

    @Override
    public final void I() {
    }
}

package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class kvb extends n39 {
    public final mvb c;

    public kvb(mvb mvbVar) {
        this.c = mvbVar;
    }

    @Override
    public final boolean D(s49 s49Var) {
        int i = s49Var.f;
        if (i != 3 && i != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        mvb mvbVar = this.c;
        if (mvbVar.o0) {
            return 0;
        }
        return mvbVar.n0;
    }

    @Override
    public final int d(int i) {
        mvb mvbVar = this.c;
        if (i != mvbVar.k0 && i != mvbVar.h0) {
            if (i >= mvbVar.i0 && i < mvbVar.j0) {
                return 2;
            }
            if (i >= mvbVar.l0 && i < mvbVar.m0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        boolean z;
        int i2;
        boolean z2;
        View view = s49Var.a;
        mvb mvbVar = this.c;
        qvb qvbVar = mvbVar.w0;
        if (d(i) == 1) {
            l35 l35Var = (l35) view;
            if (i == mvbVar.h0) {
                l35Var.setText(k96.M0(2131743757, null));
            }
            if (i == mvbVar.k0) {
                l35Var.setText(k96.M0(2131745564, null));
            }
        }
        if (d(i) == 2) {
            ytb ytbVar = (ytb) view;
            ytbVar.setTopic((TLRPC.TL_forumTopic) mvbVar.f0.get(i - mvbVar.i0));
            if (i != mvbVar.j0 - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            ytbVar.d = z2;
        }
        if (d(i) == 3) {
            k27 k27Var = (k27) mvbVar.g0.get(i - mvbVar.l0);
            nvb nvbVar = (nvb) view;
            if (i != mvbVar.m0 - 1) {
                z = true;
            } else {
                z = false;
            }
            nvbVar.b5 = z;
            i2 = ((d) qvbVar).currentAccount;
            long b2 = k27.b2(i2, k27Var.k, true, false);
            if (b2 == 0) {
                b2 = 1;
            }
            TLRPC.TL_forumTopic f = qvbVar.s.f(qvbVar.a, b2);
            if (f == null) {
                fa4.b("cant find topic " + b2);
                return;
            }
            nvbVar.h0(f, k27.B0(k27Var.k), k27Var, false, false);
            nvbVar.setTopicIcon(f);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        boolean z;
        qvb qvbVar = this.c.w0;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ?? nvbVar = new nvb(qvbVar, viewGroup.getContext(), true);
                    z = ((d) qvbVar).inPreviewMode;
                    nvbVar.l0 = z;
                    frameLayout = nvbVar;
                } else {
                    wn4.j("unsupported view type");
                    return null;
                }
            } else {
                frameLayout = new ytb(viewGroup.getContext());
            }
        } else {
            frameLayout = new l35(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new e49(-1, -2));
        return new s49(frameLayout);
    }
}

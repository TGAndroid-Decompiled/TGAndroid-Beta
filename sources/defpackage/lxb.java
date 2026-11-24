package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class lxb extends q59 {
    public final nxb c;

    public lxb(nxb nxbVar) {
        this.c = nxbVar;
    }

    @Override
    public final boolean D(u69 u69Var) {
        int i = u69Var.f;
        if (i != 3 && i != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        nxb nxbVar = this.c;
        if (nxbVar.o0) {
            return 0;
        }
        return nxbVar.n0;
    }

    @Override
    public final int d(int i) {
        nxb nxbVar = this.c;
        if (i != nxbVar.k0 && i != nxbVar.h0) {
            if (i >= nxbVar.i0 && i < nxbVar.j0) {
                return 2;
            }
            if (i >= nxbVar.l0 && i < nxbVar.m0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        boolean z;
        int i2;
        boolean z2;
        View view = u69Var.a;
        nxb nxbVar = this.c;
        sxb sxbVar = nxbVar.w0;
        if (d(i) == 1) {
            l55 l55Var = (l55) view;
            if (i == nxbVar.h0) {
                l55Var.setText(jb6.M0(2131743683, null));
            }
            if (i == nxbVar.k0) {
                l55Var.setText(jb6.M0(2131745490, null));
            }
        }
        if (d(i) == 2) {
            zvb zvbVar = (zvb) view;
            zvbVar.setTopic((TLRPC.TL_forumTopic) nxbVar.f0.get(i - nxbVar.i0));
            if (i != nxbVar.j0 - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            zvbVar.d = z2;
        }
        if (d(i) == 3) {
            k47 k47Var = (k47) nxbVar.g0.get(i - nxbVar.l0);
            pxb pxbVar = (pxb) view;
            if (i != nxbVar.m0 - 1) {
                z = true;
            } else {
                z = false;
            }
            pxbVar.b5 = z;
            i2 = ((d) sxbVar).currentAccount;
            long b2 = k47.b2(i2, k47Var.k, true, false);
            if (b2 == 0) {
                b2 = 1;
            }
            TLRPC.TL_forumTopic f = sxbVar.s.f(sxbVar.a, b2);
            if (f == null) {
                fc4.b("cant find topic " + b2);
                return;
            }
            pxbVar.g0(f, k47.B0(k47Var.k), k47Var, false, false);
            pxbVar.setTopicIcon(f);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        boolean z;
        sxb sxbVar = this.c.w0;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ?? pxbVar = new pxb(sxbVar, viewGroup.getContext(), true);
                    z = ((d) sxbVar).inPreviewMode;
                    pxbVar.l0 = z;
                    frameLayout = pxbVar;
                } else {
                    zo4.k("unsupported view type");
                    return null;
                }
            } else {
                frameLayout = new zvb(viewGroup.getContext());
            }
        } else {
            frameLayout = new l55(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new g69(-1, -2));
        return new u69(frameLayout);
    }
}

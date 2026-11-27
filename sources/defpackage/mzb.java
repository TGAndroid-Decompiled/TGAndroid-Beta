package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class mzb extends c79 {
    public final ozb c;

    public mzb(ozb ozbVar) {
        this.c = ozbVar;
    }

    @Override
    public final boolean D(f89 f89Var) {
        int i = f89Var.f;
        if (i != 3 && i != 2) {
            return false;
        }
        return true;
    }

    @Override
    public final int b() {
        ozb ozbVar = this.c;
        if (ozbVar.o0) {
            return 0;
        }
        return ozbVar.n0;
    }

    @Override
    public final int d(int i) {
        ozb ozbVar = this.c;
        if (i != ozbVar.k0 && i != ozbVar.h0) {
            if (i >= ozbVar.i0 && i < ozbVar.j0) {
                return 2;
            }
            if (i >= ozbVar.l0 && i < ozbVar.m0) {
                return 3;
            }
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(f89 f89Var, int i) {
        boolean z;
        int i2;
        boolean z2;
        View view = f89Var.a;
        ozb ozbVar = this.c;
        tzb tzbVar = ozbVar.w0;
        if (d(i) == 1) {
            p55 p55Var = (p55) view;
            if (i == ozbVar.h0) {
                p55Var.setText(ob6.M0(2131743651, null));
            }
            if (i == ozbVar.k0) {
                p55Var.setText(ob6.M0(2131745484, null));
            }
        }
        if (d(i) == 2) {
            zxb zxbVar = (zxb) view;
            zxbVar.setTopic((TLRPC.TL_forumTopic) ozbVar.f0.get(i - ozbVar.i0));
            if (i != ozbVar.j0 - 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            zxbVar.d = z2;
        }
        if (d(i) == 3) {
            r47 r47Var = (r47) ozbVar.g0.get(i - ozbVar.l0);
            qzb qzbVar = (qzb) view;
            if (i != ozbVar.m0 - 1) {
                z = true;
            } else {
                z = false;
            }
            qzbVar.b5 = z;
            i2 = ((e) tzbVar).currentAccount;
            long b2 = r47.b2(i2, r47Var.k, true, false);
            if (b2 == 0) {
                b2 = 1;
            }
            TLRPC.TL_forumTopic f = tzbVar.s.f(tzbVar.a, b2);
            if (f == null) {
                cc4.b("cant find topic " + b2);
                return;
            }
            qzbVar.g0(f, r47.B0(r47Var.k), r47Var, false, false);
            qzbVar.setTopicIcon(f);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout frameLayout;
        boolean z;
        tzb tzbVar = this.c.w0;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ?? qzbVar = new qzb(tzbVar, viewGroup.getContext(), true);
                    z = ((e) tzbVar).inPreviewMode;
                    qzbVar.l0 = z;
                    frameLayout = qzbVar;
                } else {
                    xi4.l("unsupported view type");
                    return null;
                }
            } else {
                frameLayout = new zxb(viewGroup.getContext());
            }
        } else {
            frameLayout = new p55(viewGroup.getContext(), null);
        }
        frameLayout.setLayoutParams(new r79(-1, -2));
        return new f89(frameLayout);
    }
}

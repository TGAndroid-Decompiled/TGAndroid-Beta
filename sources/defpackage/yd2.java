package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class yd2 extends y59 {
    public final Context c;
    public final zd2 d;

    public yd2(zd2 zd2Var, Context context) {
        this.d = zd2Var;
        this.c = context;
    }

    @Override
    public final int b() {
        int i;
        zd2 zd2Var = this.d;
        if (!zd2Var.d.isEmpty()) {
            i = zd2Var.n.size() + 1;
        } else {
            i = 0;
        }
        return i + 2;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return 3;
        }
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(u69 u69Var, int i) {
        int i2;
        View view = u69Var.a;
        int d = d(i);
        zd2 zd2Var = this.d;
        if (d != 0) {
            if (d != 1) {
                if (d == 2) {
                    TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) zd2Var.n.get(i - 3);
                    boolean contains = zd2Var.d.contains(tL_availableReaction.reaction);
                    i2 = ((d) zd2Var).currentAccount;
                    ((vb0) view).a(tL_availableReaction, contains, i2);
                    return;
                }
                return;
            }
            ((jf5) view).setText(jb6.M0(2131747555, null));
            return;
        }
        njb njbVar = (njb) view;
        anb.X(njbVar.getTextView(), cmb.A6, null);
        int i3 = zd2Var.s;
        if (i3 == 1) {
            njbVar.setText(jb6.M0(2131751084, null));
        } else if (i3 == 0) {
            njbVar.setText(jb6.M0(2131751096, null));
        } else if (i3 == 2) {
            njbVar.setText(jb6.M0(2131751366, null));
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        Context context = this.c;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    return new u69(new vb0(context, false, false));
                }
                FrameLayout frameLayout = new FrameLayout(context);
                zd2 zd2Var = this.d;
                gm.B2(zd2Var.r);
                frameLayout.addView(zd2Var.r);
                frameLayout.setLayoutParams(new g69(-1, -2));
                return new u69(frameLayout);
            }
            return new u69(new jf5(context, 23));
        }
        return new u69(new njb(context));
    }
}

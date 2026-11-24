package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class tz8 extends w39 {
    public final int c;
    public final Context d;
    public final wjb e;
    public final boolean f;
    public final a09 h;

    public tz8(a09 a09Var, int i, Context context, wjb wjbVar, boolean z) {
        this.h = a09Var;
        this.c = i;
        this.d = context;
        this.e = wjbVar;
        this.f = z;
    }

    @Override
    public final int b() {
        int i;
        a09 a09Var = this.h;
        int size = a09Var.n.size();
        if (!a09Var.I.isEmpty() && !na7.q1(this.c).F3()) {
            i = 1;
        } else {
            i = 0;
        }
        return size + i;
    }

    @Override
    public final int d(int i) {
        if (i < this.h.n.size()) {
            return 0;
        }
        return 1;
    }

    @Override
    public final void t(s49 s49Var, int i) {
        if (s49Var.f == 0) {
            ((qz8) s49Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i));
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        FrameLayout qz8Var;
        if (i != 0) {
            a09 a09Var = this.h;
            j17 j17Var = a09Var.K;
            if (j17Var != null) {
                if (j17Var.getParent() != null) {
                    ((ViewGroup) a09Var.K.getParent()).removeView(a09Var.K);
                }
            } else {
                a09Var.e();
            }
            Context context = this.d;
            qz8Var = new FrameLayout(context);
            View view = new View(context);
            zkb.i(view, zkb.K(0.06f, bkb.D8), this.e);
            qz8Var.addView(view, nme.c(8.0f, -1));
            qz8Var.addView(a09Var.K, nme.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            qz8Var = new qz8(0, this.c, this.e, this.d, true, this.f);
        }
        return new s49(qz8Var);
    }
}

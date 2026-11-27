package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class h39 extends j79 {
    public final int c;
    public final Context d;
    public final vnb e;
    public final boolean f;
    public final o39 h;

    public h39(o39 o39Var, int i, Context context, vnb vnbVar, boolean z) {
        this.h = o39Var;
        this.c = i;
        this.d = context;
        this.e = vnbVar;
        this.f = z;
    }

    @Override
    public final int b() {
        int i;
        o39 o39Var = this.h;
        int size = o39Var.n.size();
        if (!o39Var.I.isEmpty() && !uc7.s1(this.c).M3()) {
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
    public final void t(f89 f89Var, int i) {
        if (f89Var.f == 0) {
            ((e39) f89Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i));
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        FrameLayout e39Var;
        if (i != 0) {
            o39 o39Var = this.h;
            q37 q37Var = o39Var.K;
            if (q37Var != null) {
                if (q37Var.getParent() != null) {
                    ((ViewGroup) o39Var.K.getParent()).removeView(o39Var.K);
                }
            } else {
                o39Var.e();
            }
            Context context = this.d;
            e39Var = new FrameLayout(context);
            View view = new View(context);
            yob.i(view, yob.K(0.06f, aob.E8), this.e);
            e39Var.addView(view, tre.c(8.0f, -1));
            e39Var.addView(o39Var.K, tre.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            e39Var = new e39(0, this.c, this.e, this.d, true, this.f);
        }
        return new f89(e39Var);
    }
}

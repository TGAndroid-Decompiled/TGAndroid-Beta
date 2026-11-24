package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLRPC;
public final class v19 extends y59 {
    public final int c;
    public final Context d;
    public final ylb e;
    public final boolean f;
    public final c29 h;

    public v19(c29 c29Var, int i, Context context, ylb ylbVar, boolean z) {
        this.h = c29Var;
        this.c = i;
        this.d = context;
        this.e = ylbVar;
        this.f = z;
    }

    @Override
    public final int b() {
        int i;
        c29 c29Var = this.h;
        int size = c29Var.n.size();
        if (!c29Var.I.isEmpty() && !oc7.r1(this.c).H3()) {
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
    public final void t(u69 u69Var, int i) {
        if (u69Var.f == 0) {
            ((r19) u69Var.a).setUserReaction((TLRPC.MessagePeerReaction) this.h.n.get(i));
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        FrameLayout r19Var;
        if (i != 0) {
            c29 c29Var = this.h;
            j37 j37Var = c29Var.K;
            if (j37Var != null) {
                if (j37Var.getParent() != null) {
                    ((ViewGroup) c29Var.K.getParent()).removeView(c29Var.K);
                }
            } else {
                c29Var.e();
            }
            Context context = this.d;
            r19Var = new FrameLayout(context);
            View view = new View(context);
            anb.i(view, anb.K(0.06f, cmb.D8), this.e);
            r19Var.addView(view, qoe.c(8.0f, -1));
            r19Var.addView(c29Var.K, qoe.d(-1, -1.0f, 0, 0.0f, 8.0f, 0.0f, 0.0f));
        } else {
            r19Var = new r19(0, this.c, this.e, this.d, true, this.f);
        }
        return new u69(r19Var);
    }
}

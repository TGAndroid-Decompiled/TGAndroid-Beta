package defpackage;

import android.os.Bundle;
import android.view.View;
public final class t0b implements t69, s84 {
    public final w1b a;

    public t0b(w1b w1bVar) {
        this.a = w1bVar;
    }

    @Override
    public final boolean e(int i, View view) {
        final w1b w1bVar = this.a;
        id[] idVarArr = w1bVar.h0;
        b1b b1bVar = w1bVar.X;
        int i2 = b1bVar.J;
        if (i >= i2 && i <= b1bVar.K) {
            final r47 r47Var = ((t1b) w1bVar.z0.get(i - i2)).b;
            if (!r47Var.w4()) {
                fu5 I = fu5.I(w1bVar, view);
                I.b(2131232383, ob6.M0(2131743201, null), new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r3;
                        r47 r47Var2 = r47Var;
                        w1b w1bVar2 = w1bVar;
                        switch (b) {
                            case 0:
                                w1bVar2.presentFragment(new z67(r47Var2));
                                return;
                            default:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", w1bVar2.b);
                                bundle.putInt("message_id", r47Var2.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                w1bVar2.presentFragment(new zu1(bundle), false);
                                return;
                        }
                    }
                }, false);
                I.b(2131232260, ob6.M0(2131743202, null), new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r3;
                        r47 r47Var2 = r47Var;
                        w1b w1bVar2 = w1bVar;
                        switch (b) {
                            case 0:
                                w1bVar2.presentFragment(new z67(r47Var2));
                                return;
                            default:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", w1bVar2.b);
                                bundle.putInt("message_id", r47Var2.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                w1bVar2.presentFragment(new zu1(bundle), false);
                                return;
                        }
                    }
                }, false);
                I.X(w1bVar.T.W0(view, false));
                I.a0();
                return true;
            }
        } else {
            int i3 = b1bVar.V;
            if (i >= i3 && i <= b1bVar.W) {
                ((p1b) w1bVar.R.get(i - i3)).c(w1bVar.a, w1bVar, idVarArr, true);
                return true;
            }
            int i4 = b1bVar.S;
            if (i >= i4 && i <= b1bVar.T) {
                ((p1b) w1bVar.P.get(i - i4)).c(w1bVar.a, w1bVar, idVarArr, true);
                return true;
            }
            int i5 = b1bVar.Y;
            if (i >= i5 && i <= b1bVar.Z) {
                ((p1b) w1bVar.Q.get(i - i5)).c(w1bVar.a, w1bVar, idVarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void t(int i, float f, float f2, t84 t84Var) {
        this.a.s0();
    }

    @Override
    public final void v0(float f, int i) {
    }
}

package defpackage;

import android.os.Bundle;
import android.view.View;
public final class qwa implements e39, x74 {
    public final uxa a;

    public qwa(uxa uxaVar) {
        this.a = uxaVar;
    }

    @Override
    public final boolean d(int i, View view) {
        final uxa uxaVar = this.a;
        hd[] hdVarArr = uxaVar.h0;
        ywa ywaVar = uxaVar.X;
        int i2 = ywaVar.J;
        if (i >= i2 && i <= ywaVar.K) {
            final k27 k27Var = ((rxa) uxaVar.z0.get(i - i2)).b;
            if (!k27Var.w4()) {
                cs5 I = cs5.I(uxaVar, view);
                I.b(2131232383, k96.M0(2131743307, null), new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r3;
                        k27 k27Var2 = k27Var;
                        uxa uxaVar2 = uxaVar;
                        switch (b) {
                            case 0:
                                uxaVar2.presentFragment(new s47(k27Var2));
                                return;
                            default:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", uxaVar2.b);
                                bundle.putInt("message_id", k27Var2.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                uxaVar2.presentFragment(new mu1(bundle), false);
                                return;
                        }
                    }
                }, false);
                I.b(2131232260, k96.M0(2131743308, null), new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r3;
                        k27 k27Var2 = k27Var;
                        uxa uxaVar2 = uxaVar;
                        switch (b) {
                            case 0:
                                uxaVar2.presentFragment(new s47(k27Var2));
                                return;
                            default:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", uxaVar2.b);
                                bundle.putInt("message_id", k27Var2.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                uxaVar2.presentFragment(new mu1(bundle), false);
                                return;
                        }
                    }
                }, false);
                I.X(uxaVar.T.V0(view, false));
                I.a0();
                return true;
            }
        } else {
            int i3 = ywaVar.V;
            if (i >= i3 && i <= ywaVar.W) {
                ((nxa) uxaVar.R.get(i - i3)).c(uxaVar.a, uxaVar, hdVarArr, true);
                return true;
            }
            int i4 = ywaVar.S;
            if (i >= i4 && i <= ywaVar.T) {
                ((nxa) uxaVar.P.get(i - i4)).c(uxaVar.a, uxaVar, hdVarArr, true);
                return true;
            }
            int i5 = ywaVar.Y;
            if (i >= i5 && i <= ywaVar.Z) {
                ((nxa) uxaVar.Q.get(i - i5)).c(uxaVar.a, uxaVar, hdVarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void p(int i, float f, float f2, y74 y74Var) {
        this.a.s0();
    }

    @Override
    public final void D(float f, int i) {
    }
}

package defpackage;

import android.os.Bundle;
import android.view.View;
public final class tya implements h59, g94 {
    public final xza a;

    public tya(xza xzaVar) {
        this.a = xzaVar;
    }

    @Override
    public final void D(int i, float f, float f2, h94 h94Var) {
        this.a.t0();
    }

    @Override
    public final boolean g(int i, View view) {
        final xza xzaVar = this.a;
        he[] heVarArr = xzaVar.h0;
        bza bzaVar = xzaVar.X;
        int i2 = bzaVar.J;
        if (i >= i2 && i <= bzaVar.K) {
            final k47 k47Var = ((uza) xzaVar.z0.get(i - i2)).b;
            if (!k47Var.w4()) {
                bu5 I = bu5.I(xzaVar, view);
                I.b(2131232384, jb6.M0(2131743233, null), new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r3;
                        k47 k47Var2 = k47Var;
                        xza xzaVar2 = xzaVar;
                        switch (b) {
                            case 0:
                                xzaVar2.presentFragment(new t67(k47Var2));
                                return;
                            default:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", xzaVar2.b);
                                bundle.putInt("message_id", k47Var2.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                xzaVar2.presentFragment(new yv1(bundle), false);
                                return;
                        }
                    }
                }, false);
                I.b(2131232261, jb6.M0(2131743234, null), new Runnable() {
                    @Override
                    public final void run() {
                        byte b = r3;
                        k47 k47Var2 = k47Var;
                        xza xzaVar2 = xzaVar;
                        switch (b) {
                            case 0:
                                xzaVar2.presentFragment(new t67(k47Var2));
                                return;
                            default:
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", xzaVar2.b);
                                bundle.putInt("message_id", k47Var2.e1());
                                bundle.putBoolean("need_remove_previous_same_chat_activity", false);
                                xzaVar2.presentFragment(new yv1(bundle), false);
                                return;
                        }
                    }
                }, false);
                I.X(xzaVar.T.V0(view, false));
                I.a0();
                return true;
            }
        } else {
            int i3 = bzaVar.V;
            if (i >= i3 && i <= bzaVar.W) {
                ((qza) xzaVar.R.get(i - i3)).c(xzaVar.a, xzaVar, heVarArr, true);
                return true;
            }
            int i4 = bzaVar.S;
            if (i >= i4 && i <= bzaVar.T) {
                ((qza) xzaVar.P.get(i - i4)).c(xzaVar.a, xzaVar, heVarArr, true);
                return true;
            }
            int i5 = bzaVar.Y;
            if (i >= i5 && i <= bzaVar.Z) {
                ((qza) xzaVar.Q.get(i - i5)).c(xzaVar.a, xzaVar, heVarArr, true);
                return true;
            }
        }
        return false;
    }

    @Override
    public final void V(float f, int i) {
    }
}

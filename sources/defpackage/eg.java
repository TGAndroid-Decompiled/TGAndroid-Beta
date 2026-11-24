package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.TwoStepVerificationActivity;
public final class eg implements TextView.OnEditorActionListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public eg(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int b;
        int b2;
        byte b3 = this.a;
        u69 u69Var = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b3) {
            case 0:
                he heVar = (he) obj2;
                cg cgVar = (cg) obj;
                if ((i != 6 && keyEvent.getKeyCode() != 66) || !heVar.isShowing()) {
                    return false;
                }
                cgVar.r(heVar, 0);
                return true;
            case 1:
                ik1 ik1Var = (ik1) obj2;
                xza xzaVar = (xza) obj;
                if (i != 5) {
                    return false;
                }
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                oj1 oj1Var = new oj1(ik1Var, twoStepVerificationActivity, (byte) 1);
                twoStepVerificationActivity.a0 = (byte) 1;
                twoStepVerificationActivity.c0 = oj1Var;
                ik1Var.G0.setLoading(true);
                twoStepVerificationActivity.x0(new pj1(ik1Var, xzaVar, twoStepVerificationActivity, (byte) 1));
                return true;
            case 2:
                t72 t72Var = (t72) obj;
                v72 v72Var = (v72) ((s30) obj2).e;
                smb smbVar = v72Var.s;
                if (i != 5) {
                    return false;
                }
                View F = smbVar.F(t72Var);
                if (F != null) {
                    u69Var = smbVar.T(F);
                }
                if (u69Var != null && (b = u69Var.b()) != -1) {
                    int i2 = b - v72Var.u0;
                    int i3 = v72Var.N;
                    if (i2 == i3 - 1) {
                        if (i3 < v72Var.K) {
                            v72Var.O();
                        } else {
                            gm.t1(t72Var.getTextView());
                        }
                    } else {
                        u69 K = smbVar.K(b + 1);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof ng8) {
                                ((ng8) view).getTextView().requestFocus();
                            }
                        }
                    }
                }
                return true;
            default:
                hg8 hg8Var = (hg8) obj;
                kg8 kg8Var = ((ig8) obj2).d;
                if (i != 5) {
                    return false;
                }
                smb smbVar2 = kg8Var.c;
                View F2 = smbVar2.F(hg8Var);
                if (F2 != null) {
                    u69Var = smbVar2.T(F2);
                }
                if (u69Var != null && (b2 = u69Var.b()) != -1) {
                    int i4 = b2 - kg8Var.o0;
                    int i5 = kg8Var.E;
                    if (i4 == i5 - 1) {
                        if (i5 < kg8Var.n) {
                            kg8Var.h0();
                        } else {
                            gm.t1(hg8Var.getTextView());
                        }
                    } else {
                        u69 K2 = kg8Var.c.K(b2 + 1);
                        if (K2 != null) {
                            View view2 = K2.a;
                            if (view2 instanceof ng8) {
                                ((ng8) view2).getTextView().requestFocus();
                            }
                        }
                    }
                }
                return true;
        }
    }
}

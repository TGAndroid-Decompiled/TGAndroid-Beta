package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.TwoStepVerificationActivity;
public final class df implements TextView.OnEditorActionListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public df(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int b;
        int b2;
        byte b3 = this.a;
        s49 s49Var = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b3) {
            case 0:
                hd hdVar = (hd) obj2;
                bf bfVar = (bf) obj;
                if ((i != 6 && keyEvent.getKeyCode() != 66) || !hdVar.isShowing()) {
                    return false;
                }
                bfVar.u(hdVar, 0);
                return true;
            case 1:
                zi1 zi1Var = (zi1) obj2;
                uxa uxaVar = (uxa) obj;
                if (i != 5) {
                    return false;
                }
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                gi1 gi1Var = new gi1(zi1Var, twoStepVerificationActivity, (byte) 1);
                twoStepVerificationActivity.a0 = (byte) 1;
                twoStepVerificationActivity.c0 = gi1Var;
                zi1Var.G0.setLoading(true);
                twoStepVerificationActivity.w0(new hi1(zi1Var, uxaVar, twoStepVerificationActivity, (byte) 1));
                return true;
            case 2:
                i62 i62Var = (i62) obj;
                k62 k62Var = (k62) ((s20) obj2).e;
                rkb rkbVar = k62Var.s;
                if (i != 5) {
                    return false;
                }
                View F = rkbVar.F(i62Var);
                if (F != null) {
                    s49Var = rkbVar.T(F);
                }
                if (s49Var != null && (b = s49Var.b()) != -1) {
                    int i2 = b - k62Var.u0;
                    int i3 = k62Var.N;
                    if (i2 == i3 - 1) {
                        if (i3 < k62Var.K) {
                            k62Var.P();
                        } else {
                            gl.t1(i62Var.getTextView());
                        }
                    } else {
                        s49 K = rkbVar.K(b + 1);
                        if (K != null) {
                            View view = K.a;
                            if (view instanceof le8) {
                                ((le8) view).getTextView().requestFocus();
                            }
                        }
                    }
                }
                return true;
            default:
                fe8 fe8Var = (fe8) obj;
                ie8 ie8Var = ((ge8) obj2).d;
                if (i != 5) {
                    return false;
                }
                rkb rkbVar2 = ie8Var.c;
                View F2 = rkbVar2.F(fe8Var);
                if (F2 != null) {
                    s49Var = rkbVar2.T(F2);
                }
                if (s49Var != null && (b2 = s49Var.b()) != -1) {
                    int i4 = b2 - ie8Var.o0;
                    int i5 = ie8Var.E;
                    if (i4 == i5 - 1) {
                        if (i5 < ie8Var.n) {
                            ie8Var.g0();
                        } else {
                            gl.t1(fe8Var.getTextView());
                        }
                    } else {
                        s49 K2 = ie8Var.c.K(b2 + 1);
                        if (K2 != null) {
                            View view2 = K2.a;
                            if (view2 instanceof le8) {
                                ((le8) view2).getTextView().requestFocus();
                            }
                        }
                    }
                }
                return true;
        }
    }
}

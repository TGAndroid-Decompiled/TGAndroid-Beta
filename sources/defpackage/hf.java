package defpackage;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import org.telegram.ui.TwoStepVerificationActivity;
public final class hf implements TextView.OnEditorActionListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public hf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        int b;
        int b2;
        byte b3 = this.a;
        f89 f89Var = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b3) {
            case 0:
                id idVar = (id) obj2;
                ff ffVar = (ff) obj;
                if ((i != 6 && keyEvent.getKeyCode() != 66) || !idVar.isShowing()) {
                    return false;
                }
                ffVar.w(idVar, 0);
                return true;
            case 1:
                ij1 ij1Var = (ij1) obj2;
                w1b w1bVar = (w1b) obj;
                if (i != 5) {
                    return false;
                }
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                pi1 pi1Var = new pi1(ij1Var, twoStepVerificationActivity, (byte) 1);
                twoStepVerificationActivity.a0 = (byte) 1;
                twoStepVerificationActivity.c0 = pi1Var;
                ij1Var.G0.setLoading(true);
                twoStepVerificationActivity.x0(new qi1(ij1Var, w1bVar, twoStepVerificationActivity, (byte) 1));
                return true;
            case 2:
                y62 y62Var = (y62) obj;
                a72 a72Var = (a72) ((t20) obj2).e;
                qob qobVar = a72Var.s;
                if (i != 5) {
                    return false;
                }
                View G = qobVar.G(y62Var);
                if (G != null) {
                    f89Var = qobVar.U(G);
                }
                if (f89Var != null && (b = f89Var.b()) != -1) {
                    int i2 = b - a72Var.u0;
                    int i3 = a72Var.N;
                    if (i2 == i3 - 1) {
                        if (i3 < a72Var.K) {
                            a72Var.O();
                        } else {
                            hl.t1(y62Var.getTextView());
                        }
                    } else {
                        f89 L = qobVar.L(b + 1);
                        if (L != null) {
                            View view = L.a;
                            if (view instanceof zh8) {
                                ((zh8) view).getTextView().requestFocus();
                            }
                        }
                    }
                }
                return true;
            default:
                th8 th8Var = (th8) obj;
                wh8 wh8Var = ((uh8) obj2).d;
                if (i != 5) {
                    return false;
                }
                qob qobVar2 = wh8Var.c;
                View G2 = qobVar2.G(th8Var);
                if (G2 != null) {
                    f89Var = qobVar2.U(G2);
                }
                if (f89Var != null && (b2 = f89Var.b()) != -1) {
                    int i4 = b2 - wh8Var.o0;
                    int i5 = wh8Var.E;
                    if (i4 == i5 - 1) {
                        if (i5 < wh8Var.n) {
                            wh8Var.g0();
                        } else {
                            hl.t1(th8Var.getTextView());
                        }
                    } else {
                        f89 L2 = wh8Var.c.L(b2 + 1);
                        if (L2 != null) {
                            View view2 = L2.a;
                            if (view2 instanceof zh8) {
                                ((zh8) view2).getTextView().requestFocus();
                            }
                        }
                    }
                }
                return true;
        }
    }
}

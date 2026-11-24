package defpackage;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.TextView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g0;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class j implements TextView.OnEditorActionListener {
    public final byte a;
    public final Object b;

    public j(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        uja ujaVar;
        rc2 rc2Var;
        uja ujaVar2;
        me9 me9Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (i != 3) {
                    return false;
                }
                gm.t1(editTextBoldCursor);
                return true;
            case 1:
                r7 r7Var = (r7) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    gm.t1(r7Var.e);
                    n7 n7Var = r7Var.I;
                    if (n7Var != null) {
                        n7Var.k(r7Var.e);
                    }
                }
                return false;
            case 2:
                gm.t1(((wc) obj).a);
                return true;
            case 3:
                l97 l97Var = (l97) obj;
                if (i != 6) {
                    return false;
                }
                l97Var.run();
                return true;
            case 4:
                au0 au0Var = (au0) obj;
                if (i != 5) {
                    return false;
                }
                au0Var.z0();
                return true;
            case 5:
                of1 of1Var = (of1) obj;
                if (i != 6 || (ujaVar = of1Var.c.a) == null) {
                    return false;
                }
                ujaVar.performClick();
                return true;
            case 6:
                yv1 yv1Var = (yv1) obj;
                if (i == 6) {
                    lf8 lf8Var = yv1Var.vd;
                    if (lf8Var == null || (rc2Var = lf8Var.n) == null) {
                        return false;
                    }
                    yv1Var.Ka(rc2Var);
                    return true;
                }
                yv1Var.getClass();
                return false;
            case 7:
                c52 c52Var = (c52) obj;
                if (i != 6) {
                    return false;
                }
                b61 b61Var = c52Var.p0;
                if (!b61Var.e0) {
                    return false;
                }
                b61Var.performClick();
                return true;
            case 8:
                ba2 ba2Var = (ba2) obj;
                if (i != 6 || (ujaVar2 = ba2Var.a) == null) {
                    return false;
                }
                ujaVar2.performClick();
                return true;
            case 9:
                hh2 hh2Var = (hh2) obj;
                ah2 ah2Var = hh2Var.G;
                if (i != 6) {
                    return false;
                }
                hh2Var.y = false;
                gm.r(ah2Var);
                if (TextUtils.isEmpty(hh2Var.f.getText())) {
                    hh2Var.E = null;
                    hh2Var.d.b();
                    hh2Var.c.g3.O(true);
                } else {
                    gm.c3(ah2Var);
                }
                hh2Var.g0();
                return true;
            case 10:
                tk2 tk2Var = (tk2) obj;
                if (i != 5) {
                    return false;
                }
                tk2Var.a();
                return true;
            case 11:
                ru3 ru3Var = ((su3) obj).d;
                if (i != 5) {
                    return false;
                }
                ru3Var.requestFocus();
                ru3Var.setSelection(ru3Var.length());
                return true;
            case 12:
                i13 i13Var = (i13) obj;
                if (i != 6) {
                    return false;
                }
                i13Var.run();
                return true;
            case 13:
                oc5 oc5Var = (oc5) obj;
                if (i != 6 || !oc5Var.s0()) {
                    return false;
                }
                return true;
            case 14:
                if6 if6Var = (if6) obj;
                if (i != 5) {
                    return false;
                }
                if6Var.h(null);
                return true;
            case 15:
                pf6 pf6Var = (pf6) obj;
                if (i != 5) {
                    return false;
                }
                pf6Var.h(null);
                return true;
            case 16:
                cg6 cg6Var = (cg6) obj;
                if (i != 5) {
                    return false;
                }
                cg6Var.h(null);
                return true;
            case 17:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                boolean z = passcodeActivity.F;
                if (!z) {
                    passcodeActivity.v0();
                } else if (!z) {
                    return false;
                } else {
                    passcodeActivity.u0();
                }
                return true;
            case 18:
                by7 by7Var = (by7) obj;
                if (i != 6) {
                    return false;
                }
                by7Var.n(false);
                return true;
            case 19:
                tz7 tz7Var = (tz7) obj;
                if (i != 5) {
                    return false;
                }
                tz7Var.h(null);
                return true;
            case 20:
                gw8 gw8Var = (gw8) obj;
                if (i == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = gw8Var.a;
                    if (intValue < editTextBoldCursorArr.length) {
                        editTextBoldCursorArr[intValue].requestFocus();
                    }
                } else if (i != 6) {
                    return false;
                } else {
                    gw8Var.finishFragment();
                }
                return true;
            case 21:
                wj wjVar = (wj) obj;
                if (i != 6) {
                    return false;
                }
                wjVar.l1.a.callOnClick();
                return true;
            case 22:
                ne9 ne9Var = (ne9) obj;
                if (i != 5 || (me9Var = ne9Var.e2) == null || ne9Var.n2) {
                    return false;
                }
                if (ne9Var.k2) {
                    ne9Var.M();
                } else {
                    me9Var.W(ne9Var);
                }
                return true;
            case 23:
                vc vcVar = ((lu9) obj).d;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    vcVar.m();
                    gm.t1(vcVar);
                }
                return false;
            case 24:
                k0a k0aVar = (k0a) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    gm.t1(k0aVar.X1);
                }
                return false;
            case 25:
                tca tcaVar = (tca) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    gm.t1(tcaVar.t2.r);
                }
                return false;
            case 26:
                ((rja) obj).A(i, keyEvent);
                return false;
            case 27:
                g0 g0Var = (g0) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    gm.t1(g0Var.b);
                }
                return false;
            case 28:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (i != 5 && i != 6) {
                    return false;
                }
                twoStepVerificationActivity.y0();
                return true;
            default:
                x9c x9cVar = (x9c) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    gm.t1(x9cVar.K);
                }
                return false;
        }
    }
}

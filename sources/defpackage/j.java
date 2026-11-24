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
        sha shaVar;
        gb2 gb2Var;
        sha shaVar2;
        lc9 lc9Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (i != 3) {
                    return false;
                }
                gl.t1(editTextBoldCursor);
                return true;
            case 1:
                r7 r7Var = (r7) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    gl.t1(r7Var.e);
                    n7 n7Var = r7Var.I;
                    if (n7Var != null) {
                        n7Var.k(r7Var.e);
                    }
                }
                return false;
            case 2:
                s67 s67Var = (s67) obj;
                if (i != 6) {
                    return false;
                }
                s67Var.run();
                return true;
            case 3:
                ss0 ss0Var = (ss0) obj;
                if (i != 5) {
                    return false;
                }
                ss0Var.y0();
                return true;
            case 4:
                ge1 ge1Var = (ge1) obj;
                if (i != 6 || (shaVar = ge1Var.c.a) == null) {
                    return false;
                }
                shaVar.performClick();
                return true;
            case 5:
                mu1 mu1Var = (mu1) obj;
                if (i == 6) {
                    jd8 jd8Var = mu1Var.kd;
                    if (jd8Var != null && (gb2Var = jd8Var.n) != null) {
                        mu1Var.ya(gb2Var);
                        return true;
                    }
                } else {
                    mu1Var.getClass();
                }
                return false;
            case 6:
                r32 r32Var = (r32) obj;
                if (i == 6) {
                    u41 u41Var = r32Var.p0;
                    if (u41Var.e0) {
                        u41Var.performClick();
                        return true;
                    }
                }
                return false;
            case 7:
                p82 p82Var = (p82) obj;
                if (i != 6 || (shaVar2 = p82Var.a) == null) {
                    return false;
                }
                shaVar2.performClick();
                return true;
            case 8:
                uf2 uf2Var = (uf2) obj;
                of2 of2Var = uf2Var.G;
                if (i != 6) {
                    return false;
                }
                uf2Var.y = false;
                gl.r(of2Var);
                if (TextUtils.isEmpty(uf2Var.f.getText())) {
                    uf2Var.E = null;
                    uf2Var.d.b();
                    uf2Var.c.g3.O(true);
                } else {
                    gl.d3(of2Var);
                }
                uf2Var.f0();
                return true;
            case 9:
                fj2 fj2Var = (fj2) obj;
                if (i != 5) {
                    return false;
                }
                fj2Var.a();
                return true;
            case 10:
                ht3 ht3Var = ((it3) obj).d;
                if (i != 5) {
                    return false;
                }
                ht3Var.requestFocus();
                ht3Var.setSelection(ht3Var.length());
                return true;
            case 11:
                xz2 xz2Var = (xz2) obj;
                if (i != 6) {
                    return false;
                }
                xz2Var.run();
                return true;
            case 12:
                qa5 qa5Var = (qa5) obj;
                if (i == 6 && qa5Var.r0()) {
                    return true;
                }
                return false;
            case 13:
                jd6 jd6Var = (jd6) obj;
                if (i != 5) {
                    return false;
                }
                jd6Var.h(null);
                return true;
            case 14:
                qd6 qd6Var = (qd6) obj;
                if (i != 5) {
                    return false;
                }
                qd6Var.h(null);
                return true;
            case 15:
                de6 de6Var = (de6) obj;
                if (i != 5) {
                    return false;
                }
                de6Var.h(null);
                return true;
            case 16:
                PasscodeActivity passcodeActivity = (PasscodeActivity) obj;
                boolean z = passcodeActivity.F;
                if (!z) {
                    passcodeActivity.u0();
                    return true;
                } else if (!z) {
                    return false;
                } else {
                    passcodeActivity.t0();
                    return true;
                }
            case 17:
                yv7 yv7Var = (yv7) obj;
                if (i != 6) {
                    return false;
                }
                yv7Var.n(false);
                return true;
            case 18:
                rx7 rx7Var = (rx7) obj;
                if (i != 5) {
                    return false;
                }
                rx7Var.h(null);
                return true;
            case 19:
                fu8 fu8Var = (fu8) obj;
                if (i == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = fu8Var.a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i != 6) {
                    return false;
                } else {
                    fu8Var.finishFragment();
                    return true;
                }
            case 20:
                wi wiVar = (wi) obj;
                if (i != 6) {
                    return false;
                }
                wiVar.l1.a.callOnClick();
                return true;
            case 21:
                mc9 mc9Var = (mc9) obj;
                if (i != 5 || (lc9Var = mc9Var.e2) == null || mc9Var.n2) {
                    return false;
                }
                if (mc9Var.k2) {
                    mc9Var.M();
                    return true;
                }
                lc9Var.Y(mc9Var);
                return true;
            case 22:
                ps0 ps0Var = ((js9) obj).d;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    ps0Var.m();
                    gl.t1(ps0Var);
                }
                return false;
            case 23:
                iy9 iy9Var = (iy9) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    gl.t1(iy9Var.X1);
                }
                return false;
            case 24:
                taa taaVar = (taa) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    gl.t1(taaVar.t2.r);
                }
                return false;
            case 25:
                ((pha) obj).A(i, keyEvent);
                return false;
            case 26:
                g0 g0Var = (g0) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    gl.t1(g0Var.b);
                }
                return false;
            case 27:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (i != 5 && i != 6) {
                    return false;
                }
                twoStepVerificationActivity.x0();
                return true;
            case 28:
                w7c w7cVar = (w7c) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    gl.t1(w7cVar.K);
                }
                return false;
            default:
                zoc zocVar = (zoc) obj;
                if (i != 3) {
                    return false;
                }
                gl.t1(zocVar.b);
                return true;
        }
    }
}

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
        nla nlaVar;
        wb2 wb2Var;
        nla nlaVar2;
        cg9 cg9Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj;
                if (i != 3) {
                    return false;
                }
                hl.t1(editTextBoldCursor);
                return true;
            case 1:
                s7 s7Var = (s7) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    hl.t1(s7Var.e);
                    o7 o7Var = s7Var.I;
                    if (o7Var != null) {
                        o7Var.k(s7Var.e);
                    }
                }
                return false;
            case 2:
                o97 o97Var = (o97) obj;
                if (i != 6) {
                    return false;
                }
                o97Var.run();
                return true;
            case 3:
                at0 at0Var = (at0) obj;
                if (i != 5) {
                    return false;
                }
                at0Var.z0();
                return true;
            case 4:
                pe1 pe1Var = (pe1) obj;
                if (i != 6 || (nlaVar = pe1Var.c.a) == null) {
                    return false;
                }
                nlaVar.performClick();
                return true;
            case 5:
                zu1 zu1Var = (zu1) obj;
                if (i == 6) {
                    xg8 xg8Var = zu1Var.yd;
                    if (xg8Var != null && (wb2Var = xg8Var.n) != null) {
                        zu1Var.La(wb2Var);
                        return true;
                    }
                } else {
                    zu1Var.getClass();
                }
                return false;
            case 6:
                h42 h42Var = (h42) obj;
                if (i == 6) {
                    c51 c51Var = h42Var.p0;
                    if (c51Var.e0) {
                        c51Var.performClick();
                        return true;
                    }
                }
                return false;
            case 7:
                g92 g92Var = (g92) obj;
                if (i != 6 || (nlaVar2 = g92Var.a) == null) {
                    return false;
                }
                nlaVar2.performClick();
                return true;
            case 8:
                mg2 mg2Var = (mg2) obj;
                fg2 fg2Var = mg2Var.G;
                if (i != 6) {
                    return false;
                }
                mg2Var.y = false;
                hl.r(fg2Var);
                if (TextUtils.isEmpty(mg2Var.f.getText())) {
                    mg2Var.E = null;
                    mg2Var.d.b();
                    mg2Var.c.g3.O(true);
                } else {
                    hl.c3(fg2Var);
                }
                mg2Var.f0();
                return true;
            case 9:
                bk2 bk2Var = (bk2) obj;
                if (i != 5) {
                    return false;
                }
                bk2Var.a();
                return true;
            case 10:
                yt3 yt3Var = ((zt3) obj).d;
                if (i != 5) {
                    return false;
                }
                yt3Var.requestFocus();
                yt3Var.setSelection(yt3Var.length());
                return true;
            case 11:
                q03 q03Var = (q03) obj;
                if (i != 6) {
                    return false;
                }
                q03Var.run();
                return true;
            case 12:
                rc5 rc5Var = (rc5) obj;
                if (i == 6 && rc5Var.r0()) {
                    return true;
                }
                return false;
            case 13:
                lf6 lf6Var = (lf6) obj;
                if (i != 5) {
                    return false;
                }
                lf6Var.h(null);
                return true;
            case 14:
                sf6 sf6Var = (sf6) obj;
                if (i != 5) {
                    return false;
                }
                sf6Var.h(null);
                return true;
            case 15:
                fg6 fg6Var = (fg6) obj;
                if (i != 5) {
                    return false;
                }
                fg6Var.h(null);
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
                fz7 fz7Var = (fz7) obj;
                if (i != 6) {
                    return false;
                }
                fz7Var.n(false);
                return true;
            case 18:
                x08 x08Var = (x08) obj;
                if (i != 5) {
                    return false;
                }
                x08Var.h(null);
                return true;
            case 19:
                ox8 ox8Var = (ox8) obj;
                if (i == 5) {
                    int intValue = ((Integer) textView.getTag()).intValue() + 1;
                    EditTextBoldCursor[] editTextBoldCursorArr = ox8Var.a;
                    if (intValue >= editTextBoldCursorArr.length) {
                        return true;
                    }
                    editTextBoldCursorArr[intValue].requestFocus();
                    return true;
                } else if (i != 6) {
                    return false;
                } else {
                    ox8Var.finishFragment();
                    return true;
                }
            case 20:
                xi xiVar = (xi) obj;
                if (i != 6) {
                    return false;
                }
                xiVar.l1.a.callOnClick();
                return true;
            case 21:
                dg9 dg9Var = (dg9) obj;
                if (i != 5 || (cg9Var = dg9Var.f2) == null || dg9Var.o2) {
                    return false;
                }
                if (dg9Var.l2) {
                    dg9Var.M();
                    return true;
                }
                cg9Var.U(dg9Var);
                return true;
            case 22:
                xs0 xs0Var = ((cw9) obj).d;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    xs0Var.m();
                    hl.t1(xs0Var);
                }
                return false;
            case 23:
                b2a b2aVar = (b2a) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    hl.t1(b2aVar.X1);
                }
                return false;
            case 24:
                kea keaVar = (kea) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    hl.t1(keaVar.t2.r);
                }
                return false;
            case 25:
                ((jla) obj).D(i, keyEvent);
                return false;
            case 26:
                g0 g0Var = (g0) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    hl.t1(g0Var.b);
                }
                return false;
            case 27:
                TwoStepVerificationActivity twoStepVerificationActivity = (TwoStepVerificationActivity) obj;
                if (i != 5 && i != 6) {
                    return false;
                }
                twoStepVerificationActivity.y0();
                return true;
            case 28:
                wbc wbcVar = (wbc) obj;
                if (keyEvent != null && ((keyEvent.getAction() == 1 && keyEvent.getKeyCode() == 84) || (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66))) {
                    hl.t1(wbcVar.L);
                }
                return false;
            default:
                ltc ltcVar = (ltc) obj;
                if (i != 3) {
                    return false;
                }
                hl.t1(ltcVar.b);
                return true;
        }
    }
}

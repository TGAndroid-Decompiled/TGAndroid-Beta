package defpackage;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class og implements ee, fu2 {
    public final byte a = 3;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public og(kq kqVar, ea6 ea6Var, ft6 ft6Var, IOException iOException, boolean z) {
        this.c = kqVar;
        this.d = ea6Var;
        this.e = ft6Var;
        this.f = iOException;
        this.b = z;
    }

    @Override
    public final void accept(Object obj) {
        kq kqVar = (kq) this.c;
        ((vz6) obj).w(kqVar.b, (rz6) kqVar.c, (ea6) this.d, (ft6) this.e, (IOException) this.f, this.b);
    }

    @Override
    public final void r(he heVar, int i) {
        int i2;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                lp7 lp7Var = (lp7) obj4;
                lp7 lp7Var2 = (lp7) obj3;
                lp7 lp7Var3 = (lp7) obj2;
                yg ygVar = (yg) obj;
                if (z) {
                    ik.d(lp7Var, lp7Var2, lp7Var3);
                }
                int value = lp7Var3.getValue();
                int value2 = lp7Var2.getValue();
                int value3 = lp7Var.getValue();
                xz7 xz7Var = (xz7) ygVar.c;
                int i3 = ygVar.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) ygVar.d;
                if (i3 == 8) {
                    int[] iArr = xz7Var.y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
            case 1:
                iv1 iv1Var = (iv1) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                yv1 yv1Var = iv1Var.a;
                x0 x0Var = new x0(iv1Var, (rc2) obj3, (byte) 27);
                if (((boolean[]) obj2)[0]) {
                    if (!z && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        x0Var.a(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = yv1Var.getParentActivity();
                    i2 = ((d) yv1Var).currentAccount;
                    ThemeActivity.H0(i2, yv1Var.getResourceProvider(), new x0(iv1Var, x0Var, (byte) 28), parentActivity);
                    return;
                }
                x0Var.a(Boolean.FALSE);
                return;
            default:
                yv1 yv1Var2 = (yv1) obj;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                mx1 mx1Var = new mx1(yv1Var2, (k47) obj3, (a6a) obj4, (TL_keyboard.KeyboardButtonProto) obj2, twoStepVerificationActivity, this.b);
                twoStepVerificationActivity.a0 = (byte) 0;
                twoStepVerificationActivity.c0 = mx1Var;
                yv1Var2.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    public og(iv1 iv1Var, rc2 rc2Var, boolean[] zArr, boolean z, TL_account.contentSettings contentsettings) {
        this.c = iv1Var;
        this.d = rc2Var;
        this.e = zArr;
        this.b = z;
        this.f = contentsettings;
    }

    public og(a6a a6aVar, boolean z, k47 k47Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto, yv1 yv1Var) {
        this.c = a6aVar;
        this.b = z;
        this.d = k47Var;
        this.e = keyboardButtonProto;
        this.f = yv1Var;
    }

    public og(boolean z, lp7 lp7Var, lp7 lp7Var2, lp7 lp7Var3, yg ygVar) {
        this.b = z;
        this.c = lp7Var;
        this.d = lp7Var2;
        this.e = lp7Var3;
        this.f = ygVar;
    }
}

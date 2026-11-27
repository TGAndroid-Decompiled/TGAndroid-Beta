package defpackage;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.TwoStepVerificationActivity;
public final class sf implements fd, ot2 {
    public final byte a = 1;
    public final boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public sf(lp lpVar, ja6 ja6Var, jt6 jt6Var, IOException iOException, boolean z) {
        this.c = lpVar;
        this.d = ja6Var;
        this.e = jt6Var;
        this.f = iOException;
        this.b = z;
    }

    @Override
    public final void accept(Object obj) {
        lp lpVar = (lp) this.c;
        ((zz6) obj).w(lpVar.b, (vz6) lpVar.c, (ja6) this.d, (jt6) this.e, (IOException) this.f, this.b);
    }

    @Override
    public final void w(id idVar, int i) {
        int i2;
        byte b = this.a;
        boolean z = this.b;
        Object obj = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                hq7 hq7Var = (hq7) obj4;
                hq7 hq7Var2 = (hq7) obj3;
                hq7 hq7Var3 = (hq7) obj2;
                bf bfVar = (bf) obj;
                if (z) {
                    jj.d(hq7Var, hq7Var2, hq7Var3);
                }
                int value = hq7Var3.getValue();
                int value2 = hq7Var2.getValue();
                int value3 = hq7Var.getValue();
                b18 b18Var = (b18) bfVar.c;
                int i3 = bfVar.b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) bfVar.d;
                if (i3 == 8) {
                    int[] iArr = b18Var.y;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
            case 1:
                ju1 ju1Var = (ju1) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                zu1 zu1Var = ju1Var.a;
                y0 y0Var = new y0(ju1Var, (wb2) obj3, (byte) 26);
                if (((boolean[]) obj2)[0]) {
                    if (!z && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        y0Var.a(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = zu1Var.getParentActivity();
                    i2 = ((e) zu1Var).currentAccount;
                    ThemeActivity.H0(i2, zu1Var.getResourceProvider(), new y0(ju1Var, y0Var, (byte) 27), parentActivity);
                    return;
                }
                y0Var.a(Boolean.FALSE);
                return;
            default:
                zu1 zu1Var2 = (zu1) obj;
                TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
                mw1 mw1Var = new mw1(zu1Var2, (r47) obj3, (r7a) obj4, (TL_keyboard.KeyboardButtonProto) obj2, twoStepVerificationActivity, this.b);
                twoStepVerificationActivity.a0 = (byte) 0;
                twoStepVerificationActivity.c0 = mw1Var;
                zu1Var2.presentFragment(twoStepVerificationActivity);
                return;
        }
    }

    public sf(ju1 ju1Var, wb2 wb2Var, boolean[] zArr, boolean z, TL_account.contentSettings contentsettings) {
        this.c = ju1Var;
        this.d = wb2Var;
        this.e = zArr;
        this.b = z;
        this.f = contentsettings;
    }

    public sf(r7a r7aVar, boolean z, r47 r47Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zu1 zu1Var) {
        this.c = r7aVar;
        this.b = z;
        this.d = r47Var;
        this.e = keyboardButtonProto;
        this.f = zu1Var;
    }

    public sf(boolean z, hq7 hq7Var, hq7 hq7Var2, hq7 hq7Var3, bf bfVar) {
        this.b = z;
        this.c = hq7Var;
        this.d = hq7Var2;
        this.e = hq7Var3;
        this.f = bfVar;
    }
}

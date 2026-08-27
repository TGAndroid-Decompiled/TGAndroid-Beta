package org.telegram.messenger;

import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.dn;
import org.telegram.ui.rn;
import org.telegram.ui.xm0;

public final class wj implements org.telegram.ui.ActionBar.a2 {

    public final int f22075a = 0;

    public final boolean f22076b;

    public final Object f22077c;
    public final Object d;

    public final Object f22078e;

    public final Object f22079f;

    public wj(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, rn rnVar) {
        this.f22077c = sendMessagesHelper;
        this.f22076b = z10;
        this.d = messageObject;
        this.f22078e = keyboardButtonProto;
        this.f22079f = rnVar;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11 = this.f22075a;
        int i12 = 8;
        boolean z10 = this.f22076b;
        Object obj = this.f22079f;
        Object obj2 = this.f22078e;
        Object obj3 = this.d;
        Object obj4 = this.f22077c;
        switch (i11) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f22076b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (rn) obj, b2Var, i10);
                break;
            case 1:
                dn dnVar = (dn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                rn rnVar = dnVar.f37446a;
                org.telegram.ui.df dfVar = new org.telegram.ui.df(i12, dnVar, (org.telegram.ui.Cells.s1) obj3);
                if (!((boolean[]) obj2)[0]) {
                    dfVar.run(Boolean.FALSE);
                } else if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                    dfVar.run(Boolean.TRUE);
                } else {
                    ThemeActivity.C0(((org.telegram.ui.ActionBar.n2) rnVar).currentAccount, rnVar.getParentActivity(), new org.telegram.ui.df(9, dnVar, dfVar), rnVar.getResourceProvider());
                }
                break;
            default:
                fc0 fc0Var = (fc0) obj4;
                fc0 fc0Var2 = (fc0) obj3;
                fc0 fc0Var3 = (fc0) obj2;
                c3.d dVar = (c3.d) obj;
                if (z10) {
                    org.telegram.ui.Components.y4.d(fc0Var, fc0Var2, fc0Var3);
                }
                int value = fc0Var3.getValue();
                int value2 = fc0Var2.getValue();
                int value3 = fc0Var.getValue();
                xm0 xm0Var = (xm0) dVar.f2426c;
                int i13 = dVar.f2425b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) dVar.d;
                if (i13 == 8) {
                    int[] iArr = xm0Var.f44532x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    xm0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                break;
        }
    }

    public wj(dn dnVar, org.telegram.ui.Cells.s1 s1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f22077c = dnVar;
        this.d = s1Var;
        this.f22078e = zArr;
        this.f22076b = z10;
        this.f22079f = contentsettings;
    }

    public wj(boolean z10, fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3, c3.d dVar) {
        this.f22076b = z10;
        this.f22077c = fc0Var;
        this.d = fc0Var2;
        this.f22078e = fc0Var3;
        this.f22079f = dVar;
    }
}

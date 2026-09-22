package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.fd0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ln;
import org.telegram.ui.pn0;
import org.telegram.ui.zn;
public final class ak implements org.telegram.ui.ActionBar.a2 {
    public final int f15929a = 0;
    public final boolean f15930b;
    public final Object f15931c;
    public final Object d;
    public final Object e;
    public final Object f15932f;

    public ak(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar) {
        this.f15931c = sendMessagesHelper;
        this.f15930b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f15932f = znVar;
    }

    @Override
    public final void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = this.f15929a;
        boolean z10 = this.f15930b;
        Object obj = this.f15932f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f15931c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f15930b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (zn) obj, b2Var, i10);
                return;
            case 1:
                ln lnVar = (ln) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                zn znVar = lnVar.f35505a;
                org.telegram.ui.of ofVar = new org.telegram.ui.of(6, lnVar, (org.telegram.ui.Cells.u1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        ofVar.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = znVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.of(7, lnVar, ofVar), znVar.getResourceProvider());
                    return;
                }
                ofVar.run(Boolean.FALSE);
                return;
            default:
                fd0 fd0Var = (fd0) obj4;
                fd0 fd0Var2 = (fd0) obj3;
                fd0 fd0Var3 = (fd0) obj2;
                gg.d2 d2Var = (gg.d2) obj;
                if (z10) {
                    org.telegram.ui.Components.d5.d(fd0Var, fd0Var2, fd0Var3);
                }
                int value = fd0Var3.getValue();
                int value2 = fd0Var2.getValue();
                int value3 = fd0Var.getValue();
                pn0 pn0Var = (pn0) d2Var.f9716c;
                int i13 = d2Var.f9715b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) d2Var.d;
                if (i13 == 8) {
                    int[] iArr = pn0Var.f36676x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    pn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public ak(ln lnVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f15931c = lnVar;
        this.d = u1Var;
        this.e = zArr;
        this.f15930b = z10;
        this.f15932f = contentsettings;
    }

    public ak(boolean z10, fd0 fd0Var, fd0 fd0Var2, fd0 fd0Var3, gg.d2 d2Var) {
        this.f15930b = z10;
        this.f15931c = fd0Var;
        this.d = fd0Var2;
        this.e = fd0Var3;
        this.f15932f = d2Var;
    }
}

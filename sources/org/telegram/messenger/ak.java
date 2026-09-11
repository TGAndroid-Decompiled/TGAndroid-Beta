package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.co;
import org.telegram.ui.on;
import org.telegram.ui.pn0;
public final class ak implements org.telegram.ui.ActionBar.a2 {
    public final int f17202a = 0;
    public final boolean f17203b;
    public final Object f17204c;
    public final Object d;
    public final Object f17205e;
    public final Object f17206f;

    public ak(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, co coVar) {
        this.f17204c = sendMessagesHelper;
        this.f17203b = z10;
        this.d = messageObject;
        this.f17205e = keyboardButtonProto;
        this.f17206f = coVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = this.f17202a;
        boolean z10 = this.f17203b;
        Object obj = this.f17206f;
        Object obj2 = this.f17205e;
        Object obj3 = this.d;
        Object obj4 = this.f17204c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f17203b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (co) obj, b2Var, i10);
                return;
            case 1:
                on onVar = (on) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                co coVar = onVar.f39283a;
                org.telegram.ui.nf nfVar = new org.telegram.ui.nf(6, onVar, (org.telegram.ui.Cells.t1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        nfVar.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = coVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) coVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.nf(7, onVar, nfVar), coVar.getResourceProvider());
                    return;
                }
                nfVar.run(Boolean.FALSE);
                return;
            default:
                vc0 vc0Var = (vc0) obj4;
                vc0 vc0Var2 = (vc0) obj3;
                vc0 vc0Var3 = (vc0) obj2;
                hg.c2 c2Var = (hg.c2) obj;
                if (z10) {
                    org.telegram.ui.Components.e5.d(vc0Var, vc0Var2, vc0Var3);
                }
                int value = vc0Var3.getValue();
                int value2 = vc0Var2.getValue();
                int value3 = vc0Var.getValue();
                pn0 pn0Var = (pn0) c2Var.f11011c;
                int i13 = c2Var.f11010b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) c2Var.d;
                if (i13 == 8) {
                    int[] iArr = pn0Var.f39601x;
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

    public ak(on onVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f17204c = onVar;
        this.d = t1Var;
        this.f17205e = zArr;
        this.f17203b = z10;
        this.f17206f = contentsettings;
    }

    public ak(boolean z10, vc0 vc0Var, vc0 vc0Var2, vc0 vc0Var3, hg.c2 c2Var) {
        this.f17203b = z10;
        this.f17204c = vc0Var;
        this.d = vc0Var2;
        this.f17205e = vc0Var3;
        this.f17206f = c2Var;
    }
}

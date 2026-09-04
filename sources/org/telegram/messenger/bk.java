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
public final class bk implements org.telegram.ui.ActionBar.a2 {
    public final int f17279a = 0;
    public final boolean f17280b;
    public final Object f17281c;
    public final Object d;
    public final Object f17282e;
    public final Object f17283f;

    public bk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, co coVar) {
        this.f17281c = sendMessagesHelper;
        this.f17280b = z10;
        this.d = messageObject;
        this.f17282e = keyboardButtonProto;
        this.f17283f = coVar;
    }

    @Override
    public final void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = this.f17279a;
        boolean z10 = this.f17280b;
        Object obj = this.f17283f;
        Object obj2 = this.f17282e;
        Object obj3 = this.d;
        Object obj4 = this.f17281c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f17280b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (co) obj, b2Var, i10);
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

    public bk(on onVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f17281c = onVar;
        this.d = t1Var;
        this.f17282e = zArr;
        this.f17280b = z10;
        this.f17283f = contentsettings;
    }

    public bk(boolean z10, vc0 vc0Var, vc0 vc0Var2, vc0 vc0Var3, hg.c2 c2Var) {
        this.f17280b = z10;
        this.f17281c = vc0Var;
        this.d = vc0Var2;
        this.f17282e = vc0Var3;
        this.f17283f = c2Var;
    }
}

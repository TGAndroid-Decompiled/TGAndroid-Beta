package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.cn;
import org.telegram.ui.qn;
import org.telegram.ui.wm0;
public final class sj implements org.telegram.ui.ActionBar.b2 {
    public final int f21508a = 0;
    public final boolean f21509b;
    public final Object f21510c;
    public final Object d;
    public final Object f21511e;
    public final Object f21512f;

    public sj(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, qn qnVar) {
        this.f21510c = sendMessagesHelper;
        this.f21509b = z10;
        this.d = messageObject;
        this.f21511e = keyboardButtonProto;
        this.f21512f = qnVar;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        int i10;
        int i11 = this.f21508a;
        boolean z10 = this.f21509b;
        Object obj = this.f21512f;
        Object obj2 = this.f21511e;
        Object obj3 = this.d;
        Object obj4 = this.f21510c;
        switch (i11) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f21509b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (qn) obj, c2Var, i9);
                return;
            case 1:
                cn cnVar = (cn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                qn qnVar = cnVar.f37236a;
                org.telegram.ui.df dfVar = new org.telegram.ui.df(8, cnVar, (org.telegram.ui.Cells.t1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        dfVar.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = qnVar.getParentActivity();
                    i10 = ((org.telegram.ui.ActionBar.o2) qnVar).currentAccount;
                    ThemeActivity.B0(i10, parentActivity, new org.telegram.ui.df(9, cnVar, dfVar), qnVar.getResourceProvider());
                    return;
                }
                dfVar.run(Boolean.FALSE);
                return;
            default:
                bc0 bc0Var = (bc0) obj4;
                bc0 bc0Var2 = (bc0) obj3;
                bc0 bc0Var3 = (bc0) obj2;
                c3.e eVar = (c3.e) obj;
                if (z10) {
                    org.telegram.ui.Components.y4.d(bc0Var, bc0Var2, bc0Var3);
                }
                int value = bc0Var3.getValue();
                int value2 = bc0Var2.getValue();
                int value3 = bc0Var.getValue();
                wm0 wm0Var = (wm0) eVar.f2292c;
                int i12 = eVar.f2291b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) eVar.d;
                if (i12 == 8) {
                    int[] iArr = wm0Var.f44201x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    wm0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public sj(cn cnVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f21510c = cnVar;
        this.d = t1Var;
        this.f21511e = zArr;
        this.f21509b = z10;
        this.f21512f = contentsettings;
    }

    public sj(boolean z10, bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3, c3.e eVar) {
        this.f21509b = z10;
        this.f21510c = bc0Var;
        this.d = bc0Var2;
        this.f21511e = bc0Var3;
        this.f21512f = eVar;
    }
}

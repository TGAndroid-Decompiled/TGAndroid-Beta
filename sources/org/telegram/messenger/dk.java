package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.dn0;
import org.telegram.ui.jn;
import org.telegram.ui.xn;
public final class dk implements org.telegram.ui.ActionBar.c2 {
    public final int f17082a = 0;
    public final boolean f17083b;
    public final Object f17084c;
    public final Object d;
    public final Object e;
    public final Object f17085f;

    public dk(SendMessagesHelper sendMessagesHelper, boolean z4, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar) {
        this.f17084c = sendMessagesHelper;
        this.f17083b = z4;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f17085f = xnVar;
    }

    @Override
    public final void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12 = this.f17082a;
        boolean z4 = this.f17083b;
        Object obj = this.f17085f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f17084c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f17083b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (xn) obj, d2Var, i10);
                return;
            case 1:
                jn jnVar = (jn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                xn xnVar = jnVar.f35381a;
                kh.a1 a1Var = new kh.a1(23, jnVar, (org.telegram.ui.Cells.t1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z4 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        a1Var.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = xnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new kh.a1(24, jnVar, a1Var), xnVar.getResourceProvider());
                    return;
                }
                a1Var.run(Boolean.FALSE);
                return;
            default:
                wc0 wc0Var = (wc0) obj4;
                wc0 wc0Var2 = (wc0) obj3;
                wc0 wc0Var3 = (wc0) obj2;
                e3.d dVar = (e3.d) obj;
                if (z4) {
                    org.telegram.ui.Components.z4.d(wc0Var, wc0Var2, wc0Var3);
                }
                int value = wc0Var3.getValue();
                int value2 = wc0Var2.getValue();
                int value3 = wc0Var.getValue();
                dn0 dn0Var = (dn0) dVar.f5088c;
                int i13 = dVar.f5087b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) dVar.d;
                if (i13 == 8) {
                    int[] iArr = dn0Var.f33734x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    dn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public dk(jn jnVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z4, TL_account.contentSettings contentsettings) {
        this.f17084c = jnVar;
        this.d = t1Var;
        this.e = zArr;
        this.f17083b = z4;
        this.f17085f = contentsettings;
    }

    public dk(boolean z4, wc0 wc0Var, wc0 wc0Var2, wc0 wc0Var3, e3.d dVar) {
        this.f17083b = z4;
        this.f17084c = wc0Var;
        this.d = wc0Var2;
        this.e = wc0Var3;
        this.f17085f = dVar;
    }
}

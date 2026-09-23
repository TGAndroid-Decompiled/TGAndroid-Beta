package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.in0;
import org.telegram.ui.jn;
import org.telegram.ui.xn;
public final class ak implements org.telegram.ui.ActionBar.a2, e2.h {
    public final int f15678a = 3;
    public final boolean f15679b;
    public final Object f15680c;
    public final Object d;
    public final Object e;
    public final Object f15681f;

    public ak(a5.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f15680c = aVar;
        this.d = tVar;
        this.e = b0Var;
        this.f15681f = iOException;
        this.f15679b = z10;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f15680c;
        ((u2.j0) obj).f(aVar.f277b, (u2.f0) aVar.f278c, (u2.t) this.d, (u2.b0) this.e, (IOException) this.f15681f, this.f15679b);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = this.f15678a;
        boolean z10 = this.f15679b;
        Object obj = this.f15681f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f15680c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f15679b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (xn) obj, b2Var, i10);
                return;
            case 1:
                jn jnVar = (jn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                xn xnVar = jnVar.f34487a;
                org.telegram.ui.oc ocVar = new org.telegram.ui.oc(11, jnVar, (org.telegram.ui.Cells.t1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        ocVar.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = xnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) xnVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.oc(12, jnVar, ocVar), xnVar.getResourceProvider());
                    return;
                }
                ocVar.run(Boolean.FALSE);
                return;
            default:
                tc0 tc0Var = (tc0) obj4;
                tc0 tc0Var2 = (tc0) obj3;
                tc0 tc0Var3 = (tc0) obj2;
                gg.d2 d2Var = (gg.d2) obj;
                if (z10) {
                    org.telegram.ui.Components.e5.d(tc0Var, tc0Var2, tc0Var3);
                }
                int value = tc0Var3.getValue();
                int value2 = tc0Var2.getValue();
                int value3 = tc0Var.getValue();
                in0 in0Var = (in0) d2Var.f9698c;
                int i13 = d2Var.f9697b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) d2Var.d;
                if (i13 == 8) {
                    int[] iArr = in0Var.f34214x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    in0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public ak(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar) {
        this.f15680c = sendMessagesHelper;
        this.f15679b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f15681f = xnVar;
    }

    public ak(jn jnVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f15680c = jnVar;
        this.d = t1Var;
        this.e = zArr;
        this.f15679b = z10;
        this.f15681f = contentsettings;
    }

    public ak(boolean z10, tc0 tc0Var, tc0 tc0Var2, tc0 tc0Var3, gg.d2 d2Var) {
        this.f15679b = z10;
        this.f15680c = tc0Var;
        this.d = tc0Var2;
        this.e = tc0Var3;
        this.f15681f = d2Var;
    }
}

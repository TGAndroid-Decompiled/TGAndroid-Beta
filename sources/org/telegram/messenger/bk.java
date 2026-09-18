package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ln;
import org.telegram.ui.pn0;
import org.telegram.ui.zn;
public final class bk implements org.telegram.ui.ActionBar.a2 {
    public final int f15972a = 0;
    public final boolean f15973b;
    public final Object f15974c;
    public final Object d;
    public final Object e;
    public final Object f15975f;

    public bk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar) {
        this.f15974c = sendMessagesHelper;
        this.f15973b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f15975f = znVar;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = this.f15972a;
        boolean z10 = this.f15973b;
        Object obj = this.f15975f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f15974c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f15973b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (zn) obj, b2Var, i10);
                return;
            case 1:
                ln lnVar = (ln) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                zn znVar = lnVar.f35408a;
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
                dd0 dd0Var = (dd0) obj4;
                dd0 dd0Var2 = (dd0) obj3;
                dd0 dd0Var3 = (dd0) obj2;
                gg.d2 d2Var = (gg.d2) obj;
                if (z10) {
                    org.telegram.ui.Components.e5.d(dd0Var, dd0Var2, dd0Var3);
                }
                int value = dd0Var3.getValue();
                int value2 = dd0Var2.getValue();
                int value3 = dd0Var.getValue();
                pn0 pn0Var = (pn0) d2Var.f9715c;
                int i13 = d2Var.f9714b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) d2Var.d;
                if (i13 == 8) {
                    int[] iArr = pn0Var.f36573x;
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

    public bk(ln lnVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f15974c = lnVar;
        this.d = u1Var;
        this.e = zArr;
        this.f15973b = z10;
        this.f15975f = contentsettings;
    }

    public bk(boolean z10, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, gg.d2 d2Var) {
        this.f15973b = z10;
        this.f15974c = dd0Var;
        this.d = dd0Var2;
        this.e = dd0Var3;
        this.f15975f = d2Var;
    }
}

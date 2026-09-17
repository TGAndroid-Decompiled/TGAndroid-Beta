package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.uc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.bo;
import org.telegram.ui.nn;
import org.telegram.ui.qn0;
public final class bk implements org.telegram.ui.ActionBar.b2 {
    public final int f15792a = 0;
    public final boolean f15793b;
    public final Object f15794c;
    public final Object d;
    public final Object e;
    public final Object f15795f;

    public bk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, bo boVar) {
        this.f15794c = sendMessagesHelper;
        this.f15793b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f15795f = boVar;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12 = this.f15792a;
        boolean z10 = this.f15793b;
        Object obj = this.f15795f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f15794c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f15793b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (bo) obj, c2Var, i10);
                return;
            case 1:
                nn nnVar = (nn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                bo boVar = nnVar.f36134a;
                org.telegram.ui.pf pfVar = new org.telegram.ui.pf(6, nnVar, (org.telegram.ui.Cells.t1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        pfVar.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = boVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.o2) boVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.pf(7, nnVar, pfVar), boVar.getResourceProvider());
                    return;
                }
                pfVar.run(Boolean.FALSE);
                return;
            default:
                uc0 uc0Var = (uc0) obj4;
                uc0 uc0Var2 = (uc0) obj3;
                uc0 uc0Var3 = (uc0) obj2;
                gg.d2 d2Var = (gg.d2) obj;
                if (z10) {
                    org.telegram.ui.Components.c5.d(uc0Var, uc0Var2, uc0Var3);
                }
                int value = uc0Var3.getValue();
                int value2 = uc0Var2.getValue();
                int value3 = uc0Var.getValue();
                qn0 qn0Var = (qn0) d2Var.f9716c;
                int i13 = d2Var.f9715b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) d2Var.d;
                if (i13 == 8) {
                    int[] iArr = qn0Var.f36994x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    qn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public bk(nn nnVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f15794c = nnVar;
        this.d = t1Var;
        this.e = zArr;
        this.f15793b = z10;
        this.f15795f = contentsettings;
    }

    public bk(boolean z10, uc0 uc0Var, uc0 uc0Var2, uc0 uc0Var3, gg.d2 d2Var) {
        this.f15793b = z10;
        this.f15794c = uc0Var;
        this.d = uc0Var2;
        this.e = uc0Var3;
        this.f15795f = d2Var;
    }
}

package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.eo;
import org.telegram.ui.on0;
import org.telegram.ui.pn;
public final class jk implements org.telegram.ui.ActionBar.c2 {
    public final int f15559a = 0;
    public final boolean f15560b;
    public final Object f15561c;
    public final Object d;
    public final Object e;
    public final Object f15562f;

    public jk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar) {
        this.f15561c = sendMessagesHelper;
        this.f15560b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f15562f = eoVar;
    }

    @Override
    public final void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12 = this.f15559a;
        boolean z10 = this.f15560b;
        Object obj = this.f15562f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f15561c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f15560b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (eo) obj, d2Var, i10);
                return;
            case 1:
                pn pnVar = (pn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                eo eoVar = pnVar.f35881a;
                org.telegram.ui.pf pfVar = new org.telegram.ui.pf(6, pnVar, (org.telegram.ui.Cells.t1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        pfVar.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = eoVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.p2) eoVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.pf(7, pnVar, pfVar), eoVar.getResourceProvider());
                    return;
                }
                pfVar.run(Boolean.FALSE);
                return;
            default:
                dd0 dd0Var = (dd0) obj4;
                dd0 dd0Var2 = (dd0) obj3;
                dd0 dd0Var3 = (dd0) obj2;
                fg.e2 e2Var = (fg.e2) obj;
                if (z10) {
                    org.telegram.ui.Components.d5.d(dd0Var, dd0Var2, dd0Var3);
                }
                int value = dd0Var3.getValue();
                int value2 = dd0Var2.getValue();
                int value3 = dd0Var.getValue();
                on0 on0Var = (on0) e2Var.f8009c;
                int i13 = e2Var.f8008b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) e2Var.d;
                if (i13 == 8) {
                    int[] iArr = on0Var.f35569x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    on0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public jk(pn pnVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f15561c = pnVar;
        this.d = t1Var;
        this.e = zArr;
        this.f15560b = z10;
        this.f15562f = contentsettings;
    }

    public jk(boolean z10, dd0 dd0Var, dd0 dd0Var2, dd0 dd0Var3, fg.e2 e2Var) {
        this.f15560b = z10;
        this.f15561c = dd0Var;
        this.d = dd0Var2;
        this.e = dd0Var3;
        this.f15562f = e2Var;
    }
}

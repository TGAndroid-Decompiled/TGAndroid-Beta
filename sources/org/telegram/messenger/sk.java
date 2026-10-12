package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yd0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.eo;
import org.telegram.ui.pn;
import org.telegram.ui.pn0;
public final class sk implements org.telegram.ui.ActionBar.z1, e2.h {
    public final int f18925a = 3;
    public final boolean f18926b;
    public final Object f18927c;
    public final Object d;
    public final Object f18928e;
    public final Object f18929f;

    public sk(a5.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f18927c = aVar;
        this.d = tVar;
        this.f18928e = b0Var;
        this.f18929f = iOException;
        this.f18926b = z10;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f18927c;
        ((u2.j0) obj).f(aVar.f299b, (u2.f0) aVar.f300c, (u2.t) this.d, (u2.b0) this.f18928e, (IOException) this.f18929f, this.f18926b);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12 = this.f18925a;
        boolean z10 = this.f18926b;
        Object obj = this.f18929f;
        Object obj2 = this.f18928e;
        Object obj3 = this.d;
        Object obj4 = this.f18927c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$44(this.f18926b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (eo) obj, a2Var, i10);
                return;
            case 1:
                pn pnVar = (pn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                eo eoVar = pnVar.f40998a;
                org.telegram.ui.tc tcVar = new org.telegram.ui.tc(11, pnVar, (org.telegram.ui.Cells.u1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        tcVar.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = eoVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.m2) eoVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.tc(12, pnVar, tcVar), eoVar.getResourceProvider());
                    return;
                }
                tcVar.run(Boolean.FALSE);
                return;
            default:
                yd0 yd0Var = (yd0) obj4;
                yd0 yd0Var2 = (yd0) obj3;
                yd0 yd0Var3 = (yd0) obj2;
                gg.c2 c2Var = (gg.c2) obj;
                if (z10) {
                    org.telegram.ui.Components.g5.c(yd0Var, yd0Var2, yd0Var3);
                }
                int value = yd0Var3.getValue();
                int value2 = yd0Var2.getValue();
                int value3 = yd0Var.getValue();
                pn0 pn0Var = (pn0) c2Var.f10562c;
                int i13 = c2Var.f10561b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) c2Var.d;
                if (i13 == 8) {
                    int[] iArr = pn0Var.f41052x;
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

    public sk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, eo eoVar) {
        this.f18927c = sendMessagesHelper;
        this.f18926b = z10;
        this.d = messageObject;
        this.f18928e = keyboardButtonProto;
        this.f18929f = eoVar;
    }

    public sk(pn pnVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f18927c = pnVar;
        this.d = u1Var;
        this.f18928e = zArr;
        this.f18926b = z10;
        this.f18929f = contentsettings;
    }

    public sk(boolean z10, yd0 yd0Var, yd0 yd0Var2, yd0 yd0Var3, gg.c2 c2Var) {
        this.f18926b = z10;
        this.f18927c = yd0Var;
        this.d = yd0Var2;
        this.f18928e = yd0Var3;
        this.f18929f = c2Var;
    }
}

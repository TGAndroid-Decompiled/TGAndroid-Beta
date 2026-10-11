package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ln;
import org.telegram.ui.mn0;
import org.telegram.ui.zn;
public final class mk implements org.telegram.ui.ActionBar.z1, e2.h {
    public final int f18604a = 3;
    public final boolean f18605b;
    public final Object f18606c;
    public final Object d;
    public final Object f18607e;
    public final Object f18608f;

    public mk(a5.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f18606c = aVar;
        this.d = tVar;
        this.f18607e = b0Var;
        this.f18608f = iOException;
        this.f18605b = z10;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f18606c;
        ((u2.j0) obj).f(aVar.f299b, (u2.f0) aVar.f300c, (u2.t) this.d, (u2.b0) this.f18607e, (IOException) this.f18608f, this.f18605b);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12 = this.f18604a;
        boolean z10 = this.f18605b;
        Object obj = this.f18608f;
        Object obj2 = this.f18607e;
        Object obj3 = this.d;
        Object obj4 = this.f18606c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$44(this.f18605b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (zn) obj, a2Var, i10);
                return;
            case 1:
                ln lnVar = (ln) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                zn znVar = lnVar.f39735a;
                org.telegram.ui.oc ocVar = new org.telegram.ui.oc(11, lnVar, (org.telegram.ui.Cells.u1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        ocVar.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = znVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.m2) znVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.oc(12, lnVar, ocVar), znVar.getResourceProvider());
                    return;
                }
                ocVar.run(Boolean.FALSE);
                return;
            default:
                ud0 ud0Var = (ud0) obj4;
                ud0 ud0Var2 = (ud0) obj3;
                ud0 ud0Var3 = (ud0) obj2;
                gg.c2 c2Var = (gg.c2) obj;
                if (z10) {
                    org.telegram.ui.Components.g5.c(ud0Var, ud0Var2, ud0Var3);
                }
                int value = ud0Var3.getValue();
                int value2 = ud0Var2.getValue();
                int value3 = ud0Var.getValue();
                mn0 mn0Var = (mn0) c2Var.f10563c;
                int i13 = c2Var.f10562b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) c2Var.d;
                if (i13 == 8) {
                    int[] iArr = mn0Var.f40069x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    mn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public mk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar) {
        this.f18606c = sendMessagesHelper;
        this.f18605b = z10;
        this.d = messageObject;
        this.f18607e = keyboardButtonProto;
        this.f18608f = znVar;
    }

    public mk(ln lnVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f18606c = lnVar;
        this.d = u1Var;
        this.f18607e = zArr;
        this.f18605b = z10;
        this.f18608f = contentsettings;
    }

    public mk(boolean z10, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, gg.c2 c2Var) {
        this.f18605b = z10;
        this.f18606c = ud0Var;
        this.d = ud0Var2;
        this.f18607e = ud0Var3;
        this.f18608f = c2Var;
    }
}

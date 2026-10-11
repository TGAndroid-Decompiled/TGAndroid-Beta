package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.vd0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.ln;
import org.telegram.ui.mn0;
import org.telegram.ui.zn;
public final class mk implements org.telegram.ui.ActionBar.z1, e2.h {
    public final int f18568a = 3;
    public final boolean f18569b;
    public final Object f18570c;
    public final Object d;
    public final Object f18571e;
    public final Object f18572f;

    public mk(a5.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f18570c = aVar;
        this.d = tVar;
        this.f18571e = b0Var;
        this.f18572f = iOException;
        this.f18569b = z10;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f18570c;
        ((u2.j0) obj).f(aVar.f299b, (u2.f0) aVar.f300c, (u2.t) this.d, (u2.b0) this.f18571e, (IOException) this.f18572f, this.f18569b);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12 = this.f18568a;
        boolean z10 = this.f18569b;
        Object obj = this.f18572f;
        Object obj2 = this.f18571e;
        Object obj3 = this.d;
        Object obj4 = this.f18570c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$44(this.f18569b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (zn) obj, a2Var, i10);
                return;
            case 1:
                ln lnVar = (ln) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                zn znVar = lnVar.f39701a;
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
                vd0 vd0Var = (vd0) obj4;
                vd0 vd0Var2 = (vd0) obj3;
                vd0 vd0Var3 = (vd0) obj2;
                gg.c2 c2Var = (gg.c2) obj;
                if (z10) {
                    org.telegram.ui.Components.g5.c(vd0Var, vd0Var2, vd0Var3);
                }
                int value = vd0Var3.getValue();
                int value2 = vd0Var2.getValue();
                int value3 = vd0Var.getValue();
                mn0 mn0Var = (mn0) c2Var.f10563c;
                int i13 = c2Var.f10562b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) c2Var.d;
                if (i13 == 8) {
                    int[] iArr = mn0Var.f40035x;
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
        this.f18570c = sendMessagesHelper;
        this.f18569b = z10;
        this.d = messageObject;
        this.f18571e = keyboardButtonProto;
        this.f18572f = znVar;
    }

    public mk(ln lnVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f18570c = lnVar;
        this.d = u1Var;
        this.f18571e = zArr;
        this.f18569b = z10;
        this.f18572f = contentsettings;
    }

    public mk(boolean z10, vd0 vd0Var, vd0 vd0Var2, vd0 vd0Var3, gg.c2 c2Var) {
        this.f18569b = z10;
        this.f18570c = vd0Var;
        this.d = vd0Var2;
        this.f18571e = vd0Var3;
        this.f18572f = c2Var;
    }
}

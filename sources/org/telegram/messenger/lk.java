package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.od0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.dn;
import org.telegram.ui.sn;
import org.telegram.ui.zm0;
public final class lk implements org.telegram.ui.ActionBar.z1, e2.j {
    public final int f18980a = 3;
    public final boolean f18981b;
    public final Object f18982c;
    public final Object d;
    public final Object e;
    public final Object f18983f;

    public lk(a5.a aVar, u2.v vVar, u2.d0 d0Var, IOException iOException, boolean z10) {
        this.f18982c = aVar;
        this.d = vVar;
        this.e = d0Var;
        this.f18983f = iOException;
        this.f18981b = z10;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f18982c;
        ((u2.m0) obj).g(aVar.f281b, (u2.h0) aVar.f282c, (u2.v) this.d, (u2.d0) this.e, (IOException) this.f18983f, this.f18981b);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        int i11;
        int i12 = this.f18980a;
        boolean z10 = this.f18981b;
        Object obj = this.f18983f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f18982c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$44(this.f18981b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (sn) obj, c2Var, i10);
                return;
            case 1:
                dn dnVar = (dn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                sn snVar = dnVar.f36651a;
                org.telegram.ui.ActionBar.m3 m3Var = new org.telegram.ui.ActionBar.m3(17, dnVar, (org.telegram.ui.Cells.t1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        m3Var.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = snVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.o2) snVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.ActionBar.m3(18, dnVar, m3Var), snVar.getResourceProvider());
                    return;
                }
                m3Var.run(Boolean.FALSE);
                return;
            default:
                od0 od0Var = (od0) obj4;
                od0 od0Var2 = (od0) obj3;
                od0 od0Var3 = (od0) obj2;
                hg.b2 b2Var = (hg.b2) obj;
                if (z10) {
                    org.telegram.ui.Components.d5.d(od0Var, od0Var2, od0Var3);
                }
                int value = od0Var3.getValue();
                int value2 = od0Var2.getValue();
                int value3 = od0Var.getValue();
                zm0 zm0Var = (zm0) b2Var.f11841c;
                int i13 = b2Var.f11840b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) b2Var.d;
                if (i13 == 8) {
                    int[] iArr = zm0Var.f44176x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    zm0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public lk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, sn snVar) {
        this.f18982c = sendMessagesHelper;
        this.f18981b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f18983f = snVar;
    }

    public lk(dn dnVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f18982c = dnVar;
        this.d = t1Var;
        this.e = zArr;
        this.f18981b = z10;
        this.f18983f = contentsettings;
    }

    public lk(boolean z10, od0 od0Var, od0 od0Var2, od0 od0Var3, hg.b2 b2Var) {
        this.f18981b = z10;
        this.f18982c = od0Var;
        this.d = od0Var2;
        this.e = od0Var3;
        this.f18983f = b2Var;
    }
}

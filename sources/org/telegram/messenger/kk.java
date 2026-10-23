package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.od0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.cn;
import org.telegram.ui.qn;
import org.telegram.ui.vm0;
public final class kk implements org.telegram.ui.ActionBar.a2, e2.j {
    public final int f18826a = 3;
    public final boolean f18827b;
    public final Object f18828c;
    public final Object d;
    public final Object e;
    public final Object f18829f;

    public kk(a5.a aVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.f18828c = aVar;
        this.d = uVar;
        this.e = c0Var;
        this.f18829f = iOException;
        this.f18827b = z10;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f18828c;
        ((u2.l0) obj).g(aVar.f281b, (u2.g0) aVar.f282c, (u2.u) this.d, (u2.c0) this.e, (IOException) this.f18829f, this.f18827b);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = this.f18826a;
        boolean z10 = this.f18827b;
        Object obj = this.f18829f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f18828c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$44(this.f18827b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (qn) obj, b2Var, i10);
                return;
            case 1:
                cn cnVar = (cn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                qn qnVar = cnVar.f36015a;
                org.telegram.ui.ActionBar.j3 j3Var = new org.telegram.ui.ActionBar.j3(17, cnVar, (org.telegram.ui.Cells.u1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        j3Var.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = qnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) qnVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.ActionBar.j3(18, cnVar, j3Var), qnVar.getResourceProvider());
                    return;
                }
                j3Var.run(Boolean.FALSE);
                return;
            default:
                od0 od0Var = (od0) obj4;
                od0 od0Var2 = (od0) obj3;
                od0 od0Var3 = (od0) obj2;
                hg.b2 b2Var2 = (hg.b2) obj;
                if (z10) {
                    org.telegram.ui.Components.f5.c(od0Var, od0Var2, od0Var3);
                }
                int value = od0Var3.getValue();
                int value2 = od0Var2.getValue();
                int value3 = od0Var.getValue();
                vm0 vm0Var = (vm0) b2Var2.f11814c;
                int i13 = b2Var2.f11813b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) b2Var2.d;
                if (i13 == 8) {
                    int[] iArr = vm0Var.f42337x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    vm0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public kk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, qn qnVar) {
        this.f18828c = sendMessagesHelper;
        this.f18827b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f18829f = qnVar;
    }

    public kk(cn cnVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f18828c = cnVar;
        this.d = u1Var;
        this.e = zArr;
        this.f18827b = z10;
        this.f18829f = contentsettings;
    }

    public kk(boolean z10, od0 od0Var, od0 od0Var2, od0 od0Var3, hg.b2 b2Var) {
        this.f18827b = z10;
        this.f18828c = od0Var;
        this.d = od0Var2;
        this.e = od0Var3;
        this.f18829f = b2Var;
    }
}

package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.od0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.en;
import org.telegram.ui.sn;
import org.telegram.ui.xm0;
public final class hk implements org.telegram.ui.ActionBar.a2, e2.j {
    public final int f18557a = 3;
    public final boolean f18558b;
    public final Object f18559c;
    public final Object d;
    public final Object e;
    public final Object f18560f;

    public hk(a5.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f18559c = aVar;
        this.d = tVar;
        this.e = b0Var;
        this.f18560f = iOException;
        this.f18558b = z10;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f18559c;
        ((u2.j0) obj).g(aVar.f280b, (u2.f0) aVar.f281c, (u2.t) this.d, (u2.b0) this.e, (IOException) this.f18560f, this.f18558b);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = this.f18557a;
        boolean z10 = this.f18558b;
        Object obj = this.f18560f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f18559c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$44(this.f18558b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (sn) obj, b2Var, i10);
                return;
            case 1:
                en enVar = (en) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                sn snVar = enVar.f36573a;
                org.telegram.ui.ActionBar.j3 j3Var = new org.telegram.ui.ActionBar.j3(17, enVar, (org.telegram.ui.Cells.u1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        j3Var.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = snVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) snVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.ActionBar.j3(18, enVar, j3Var), snVar.getResourceProvider());
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
                xm0 xm0Var = (xm0) b2Var2.f11817c;
                int i13 = b2Var2.f11816b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) b2Var2.d;
                if (i13 == 8) {
                    int[] iArr = xm0Var.f43235x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    xm0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public hk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, sn snVar) {
        this.f18559c = sendMessagesHelper;
        this.f18558b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f18560f = snVar;
    }

    public hk(en enVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f18559c = enVar;
        this.d = u1Var;
        this.e = zArr;
        this.f18558b = z10;
        this.f18560f = contentsettings;
    }

    public hk(boolean z10, od0 od0Var, od0 od0Var2, od0 od0Var3, hg.b2 b2Var) {
        this.f18558b = z10;
        this.f18559c = od0Var;
        this.d = od0Var2;
        this.e = od0Var3;
        this.f18560f = b2Var;
    }
}

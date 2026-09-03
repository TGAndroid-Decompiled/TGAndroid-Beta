package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.fn0;
import org.telegram.ui.ln;
import org.telegram.ui.zn;
public final class dk implements org.telegram.ui.ActionBar.c2 {
    public final int f17067a = 0;
    public final boolean f17068b;
    public final Object f17069c;
    public final Object d;
    public final Object e;
    public final Object f17070f;

    public dk(SendMessagesHelper sendMessagesHelper, boolean z4, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar) {
        this.f17069c = sendMessagesHelper;
        this.f17068b = z4;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f17070f = znVar;
    }

    @Override
    public final void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12 = this.f17067a;
        boolean z4 = this.f17068b;
        Object obj = this.f17070f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f17069c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f17068b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (zn) obj, d2Var, i10);
                return;
            case 1:
                ln lnVar = (ln) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                zn znVar = lnVar.f35808a;
                kh.a1 a1Var = new kh.a1(23, lnVar, (org.telegram.ui.Cells.s1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z4 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        a1Var.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = znVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.p2) znVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new kh.a1(24, lnVar, a1Var), znVar.getResourceProvider());
                    return;
                }
                a1Var.run(Boolean.FALSE);
                return;
            default:
                xc0 xc0Var = (xc0) obj4;
                xc0 xc0Var2 = (xc0) obj3;
                xc0 xc0Var3 = (xc0) obj2;
                e3.d dVar = (e3.d) obj;
                if (z4) {
                    org.telegram.ui.Components.z4.d(xc0Var, xc0Var2, xc0Var3);
                }
                int value = xc0Var3.getValue();
                int value2 = xc0Var2.getValue();
                int value3 = xc0Var.getValue();
                fn0 fn0Var = (fn0) dVar.f5094c;
                int i13 = dVar.f5093b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) dVar.d;
                if (i13 == 8) {
                    int[] iArr = fn0Var.f34162x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    fn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public dk(ln lnVar, org.telegram.ui.Cells.s1 s1Var, boolean[] zArr, boolean z4, TL_account.contentSettings contentsettings) {
        this.f17069c = lnVar;
        this.d = s1Var;
        this.e = zArr;
        this.f17068b = z4;
        this.f17070f = contentsettings;
    }

    public dk(boolean z4, xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3, e3.d dVar) {
        this.f17068b = z4;
        this.f17069c = xc0Var;
        this.d = xc0Var2;
        this.e = xc0Var3;
        this.f17070f = dVar;
    }
}

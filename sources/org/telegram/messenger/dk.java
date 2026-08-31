package org.telegram.messenger;

import android.app.Activity;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.fn0;
import org.telegram.ui.jn;
import org.telegram.ui.xn;
public final class dk implements org.telegram.ui.ActionBar.c2 {
    public final int f18519a = 0;
    public final boolean f18520b;
    public final Object f18521c;
    public final Object d;
    public final Object f18522e;
    public final Object f18523f;

    public dk(SendMessagesHelper sendMessagesHelper, boolean z4, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, xn xnVar) {
        this.f18521c = sendMessagesHelper;
        this.f18520b = z4;
        this.d = messageObject;
        this.f18522e = keyboardButtonProto;
        this.f18523f = xnVar;
    }

    @Override
    public final void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        int i11;
        int i12 = this.f18519a;
        boolean z4 = this.f18520b;
        Object obj = this.f18523f;
        Object obj2 = this.f18522e;
        Object obj3 = this.d;
        Object obj4 = this.f18521c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$41(this.f18520b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (xn) obj, d2Var, i10);
                return;
            case 1:
                jn jnVar = (jn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                xn xnVar = jnVar.f38188a;
                lh.a1 a1Var = new lh.a1(23, jnVar, (org.telegram.ui.Cells.t1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z4 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        a1Var.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = xnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.p2) xnVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new lh.a1(24, jnVar, a1Var), xnVar.getResourceProvider());
                    return;
                }
                a1Var.run(Boolean.FALSE);
                return;
            default:
                yc0 yc0Var = (yc0) obj4;
                yc0 yc0Var2 = (yc0) obj3;
                yc0 yc0Var3 = (yc0) obj2;
                e3.d dVar = (e3.d) obj;
                if (z4) {
                    org.telegram.ui.Components.z4.d(yc0Var, yc0Var2, yc0Var3);
                }
                int value = yc0Var3.getValue();
                int value2 = yc0Var2.getValue();
                int value3 = yc0Var.getValue();
                fn0 fn0Var = (fn0) dVar.f4924c;
                int i13 = dVar.f4923b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) dVar.d;
                if (i13 == 8) {
                    int[] iArr = fn0Var.f36970x;
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

    public dk(jn jnVar, org.telegram.ui.Cells.t1 t1Var, boolean[] zArr, boolean z4, TL_account.contentSettings contentsettings) {
        this.f18521c = jnVar;
        this.d = t1Var;
        this.f18522e = zArr;
        this.f18520b = z4;
        this.f18523f = contentsettings;
    }

    public dk(boolean z4, yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3, e3.d dVar) {
        this.f18520b = z4;
        this.f18521c = yc0Var;
        this.d = yc0Var2;
        this.f18522e = yc0Var3;
        this.f18523f = dVar;
    }
}

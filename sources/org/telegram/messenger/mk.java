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
import org.telegram.ui.nn0;
import org.telegram.ui.zn;
public final class mk implements org.telegram.ui.ActionBar.a2, e2.h {
    public final int f18560a = 3;
    public final boolean f18561b;
    public final Object f18562c;
    public final Object d;
    public final Object f18563e;
    public final Object f18564f;

    public mk(a5.a aVar, u2.t tVar, u2.b0 b0Var, IOException iOException, boolean z10) {
        this.f18562c = aVar;
        this.d = tVar;
        this.f18563e = b0Var;
        this.f18564f = iOException;
        this.f18561b = z10;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f18562c;
        ((u2.j0) obj).f(aVar.f299b, (u2.f0) aVar.f300c, (u2.t) this.d, (u2.b0) this.f18563e, (IOException) this.f18564f, this.f18561b);
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        int i11;
        int i12 = this.f18560a;
        boolean z10 = this.f18561b;
        Object obj = this.f18564f;
        Object obj2 = this.f18563e;
        Object obj3 = this.d;
        Object obj4 = this.f18562c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$44(this.f18561b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (zn) obj, b2Var, i10);
                return;
            case 1:
                ln lnVar = (ln) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                zn znVar = lnVar.f39636a;
                org.telegram.ui.pc pcVar = new org.telegram.ui.pc(11, lnVar, (org.telegram.ui.Cells.u1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        pcVar.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = znVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.n2) znVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.pc(12, lnVar, pcVar), znVar.getResourceProvider());
                    return;
                }
                pcVar.run(Boolean.FALSE);
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
                nn0 nn0Var = (nn0) c2Var.f10564c;
                int i13 = c2Var.f10563b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) c2Var.d;
                if (i13 == 8) {
                    int[] iArr = nn0Var.f40293x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    nn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public mk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, zn znVar) {
        this.f18562c = sendMessagesHelper;
        this.f18561b = z10;
        this.d = messageObject;
        this.f18563e = keyboardButtonProto;
        this.f18564f = znVar;
    }

    public mk(ln lnVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f18562c = lnVar;
        this.d = u1Var;
        this.f18563e = zArr;
        this.f18561b = z10;
        this.f18564f = contentsettings;
    }

    public mk(boolean z10, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, gg.c2 c2Var) {
        this.f18561b = z10;
        this.f18562c = ud0Var;
        this.d = ud0Var2;
        this.f18563e = ud0Var3;
        this.f18564f = c2Var;
    }
}

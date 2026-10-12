package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.fo;
import org.telegram.ui.qn;
import org.telegram.ui.un0;
public final class pk implements org.telegram.ui.ActionBar.z1, e2.j {
    public final int f18141a = 3;
    public final boolean f18142b;
    public final Object f18143c;
    public final Object d;
    public final Object e;
    public final Object f18144f;

    public pk(a5.a aVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.f18143c = aVar;
        this.d = uVar;
        this.e = c0Var;
        this.f18144f = iOException;
        this.f18142b = z10;
    }

    @Override
    public void accept(Object obj) {
        a5.a aVar = (a5.a) this.f18143c;
        ((u2.k0) obj).g(aVar.f279b, (u2.g0) aVar.f280c, (u2.u) this.d, (u2.c0) this.e, (IOException) this.f18144f, this.f18142b);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        int i11;
        int i12 = this.f18141a;
        boolean z10 = this.f18142b;
        Object obj = this.f18144f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f18143c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$44(this.f18142b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (fo) obj, a2Var, i10);
                return;
            case 1:
                qn qnVar = (qn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                fo foVar = qnVar.f39497a;
                org.telegram.ui.vc vcVar = new org.telegram.ui.vc(11, qnVar, (org.telegram.ui.Cells.u1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        vcVar.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = foVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.m2) foVar).currentAccount;
                    ThemeActivity.C0(i11, parentActivity, new org.telegram.ui.vc(12, qnVar, vcVar), foVar.getResourceProvider());
                    return;
                }
                vcVar.run(Boolean.FALSE);
                return;
            default:
                ud0 ud0Var = (ud0) obj4;
                ud0 ud0Var2 = (ud0) obj3;
                ud0 ud0Var3 = (ud0) obj2;
                hg.b2 b2Var = (hg.b2) obj;
                if (z10) {
                    org.telegram.ui.Components.g5.c(ud0Var, ud0Var2, ud0Var3);
                }
                int value = ud0Var3.getValue();
                int value2 = ud0Var2.getValue();
                int value3 = ud0Var.getValue();
                un0 un0Var = (un0) b2Var.f10506c;
                int i13 = b2Var.f10505b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) b2Var.d;
                if (i13 == 8) {
                    int[] iArr = un0Var.f40771x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    un0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public pk(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, fo foVar) {
        this.f18143c = sendMessagesHelper;
        this.f18142b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f18144f = foVar;
    }

    public pk(qn qnVar, org.telegram.ui.Cells.u1 u1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f18143c = qnVar;
        this.d = u1Var;
        this.e = zArr;
        this.f18142b = z10;
        this.f18144f = contentsettings;
    }

    public pk(boolean z10, ud0 ud0Var, ud0 ud0Var2, ud0 ud0Var3, hg.b2 b2Var) {
        this.f18142b = z10;
        this.f18143c = ud0Var;
        this.d = ud0Var2;
        this.e = ud0Var3;
        this.f18144f = b2Var;
    }
}

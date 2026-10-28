package org.telegram.messenger;

import android.app.Activity;
import java.io.IOException;
import java.util.Locale;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.ThemeActivity;
import org.telegram.ui.hn;
import org.telegram.ui.kn0;
import org.telegram.ui.wn;
public final class ok implements org.telegram.ui.ActionBar.b2, e2.j {
    public final int f20897a = 3;
    public final boolean f20898b;
    public final Object f20899c;
    public final Object d;
    public final Object e;
    public final Object f20900f;

    public ok(a8.ng ngVar, u2.u uVar, u2.c0 c0Var, IOException iOException, boolean z10) {
        this.f20899c = ngVar;
        this.d = uVar;
        this.e = c0Var;
        this.f20900f = iOException;
        this.f20898b = z10;
    }

    @Override
    public void accept(Object obj) {
        a8.ng ngVar = (a8.ng) this.f20899c;
        ((u2.k0) obj).f(ngVar.f639b, (u2.g0) ngVar.f640c, (u2.u) this.d, (u2.c0) this.e, (IOException) this.f20900f, this.f20898b);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        int i11;
        int i12 = this.f20897a;
        boolean z10 = this.f20898b;
        Object obj = this.f20900f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f20899c;
        switch (i12) {
            case 0:
                ((SendMessagesHelper) obj4).lambda$sendCallback$44(this.f20898b, (MessageObject) obj3, (TL_keyboard.KeyboardButtonProto) obj2, (wn) obj, e2Var, i10);
                return;
            case 1:
                hn hnVar = (hn) obj4;
                TL_account.contentSettings contentsettings = (TL_account.contentSettings) obj;
                wn wnVar = hnVar.f39938a;
                li.s2 s2Var = new li.s2(19, hnVar, (org.telegram.ui.Cells.s1) obj3);
                if (((boolean[]) obj2)[0]) {
                    if (!z10 && (contentsettings == null || !contentsettings.sensitive_can_change)) {
                        s2Var.run(Boolean.TRUE);
                        return;
                    }
                    Activity parentActivity = wnVar.getParentActivity();
                    i11 = ((org.telegram.ui.ActionBar.r2) wnVar).currentAccount;
                    ThemeActivity.D0(i11, parentActivity, new li.s2(20, hnVar, s2Var), wnVar.getResourceProvider());
                    return;
                }
                s2Var.run(Boolean.FALSE);
                return;
            default:
                nd0 nd0Var = (nd0) obj4;
                nd0 nd0Var2 = (nd0) obj3;
                nd0 nd0Var3 = (nd0) obj2;
                i2.z zVar = (i2.z) obj;
                if (z10) {
                    org.telegram.ui.Components.g5.d(nd0Var, nd0Var2, nd0Var3);
                }
                int value = nd0Var3.getValue();
                int value2 = nd0Var2.getValue();
                int value3 = nd0Var.getValue();
                kn0 kn0Var = (kn0) zVar.f13804c;
                int i13 = zVar.f13803b;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) zVar.d;
                if (i13 == 8) {
                    int[] iArr = kn0Var.f40887x;
                    iArr[0] = value;
                    iArr[1] = value2 + 1;
                    iArr[2] = value3;
                } else {
                    kn0Var.getClass();
                }
                editTextBoldCursor.setText(String.format(Locale.US, "%02d.%02d.%d", Integer.valueOf(value3), Integer.valueOf(value2 + 1), Integer.valueOf(value)));
                return;
        }
    }

    public ok(SendMessagesHelper sendMessagesHelper, boolean z10, MessageObject messageObject, TL_keyboard.KeyboardButtonProto keyboardButtonProto, wn wnVar) {
        this.f20899c = sendMessagesHelper;
        this.f20898b = z10;
        this.d = messageObject;
        this.e = keyboardButtonProto;
        this.f20900f = wnVar;
    }

    public ok(hn hnVar, org.telegram.ui.Cells.s1 s1Var, boolean[] zArr, boolean z10, TL_account.contentSettings contentsettings) {
        this.f20899c = hnVar;
        this.d = s1Var;
        this.e = zArr;
        this.f20898b = z10;
        this.f20900f = contentsettings;
    }

    public ok(boolean z10, nd0 nd0Var, nd0 nd0Var2, nd0 nd0Var3, i2.z zVar) {
        this.f20898b = z10;
        this.f20899c = nd0Var;
        this.d = nd0Var2;
        this.e = nd0Var3;
        this.f20900f = zVar;
    }
}

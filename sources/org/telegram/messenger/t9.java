package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f19082a;
    public final BaseController f19083b;
    public final Object f19084c;
    public final Object d;
    public final Object f19085e;
    public final Object f19086f;

    public t9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19082a = i10;
        this.f19083b = baseController;
        this.f19084c = obj;
        this.d = obj2;
        this.f19085e = obj3;
        this.f19086f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19082a) {
            case 0:
                ((MessagesController) this.f19083b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.b2) this.f19084c, (of.e) this.d, (org.telegram.ui.ActionBar.n2) this.f19085e, (Bundle) this.f19086f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19083b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f19084c, (org.telegram.ui.ActionBar.i6) this.d, (TLRPC.TL_inputThemeSettings) this.f19085e, (org.telegram.ui.ActionBar.h6) this.f19086f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19083b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f19084c, (byte[]) this.f19085e, (TLRPC.User) this.f19086f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19083b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f19084c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19085e, (MessageObject) this.f19086f, tLObject, tL_error);
                return;
        }
    }

    public t9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f19082a = 2;
        this.f19083b = secretChatHelper;
        this.d = context;
        this.f19084c = b2Var;
        this.f19085e = bArr;
        this.f19086f = user;
    }
}

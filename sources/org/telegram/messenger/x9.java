package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x9 implements RequestDelegate {
    public final int f20129a;
    public final BaseController f20130b;
    public final Object f20131c;
    public final Object d;
    public final Object e;
    public final Object f20132f;

    public x9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20129a = i10;
        this.f20130b = baseController;
        this.f20131c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f20132f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20129a) {
            case 0:
                ((MessagesController) this.f20130b).lambda$checkCanOpenChat$455((org.telegram.ui.ActionBar.c2) this.f20131c, (pf.c) this.d, (org.telegram.ui.ActionBar.o2) this.e, (Bundle) this.f20132f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20130b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f20131c, (org.telegram.ui.ActionBar.j6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.i6) this.f20132f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f20130b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.c2) this.f20131c, (byte[]) this.e, (TLRPC.User) this.f20132f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f20130b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f20131c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f20132f, tLObject, tL_error);
                return;
        }
    }

    public x9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.c2 c2Var, byte[] bArr, TLRPC.User user) {
        this.f20129a = 2;
        this.f20130b = secretChatHelper;
        this.d = context;
        this.f20131c = c2Var;
        this.e = bArr;
        this.f20132f = user;
    }
}

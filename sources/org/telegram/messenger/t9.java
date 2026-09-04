package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f19055a;
    public final BaseController f19056b;
    public final Object f19057c;
    public final Object d;
    public final Object f19058e;
    public final Object f19059f;

    public t9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19055a = i10;
        this.f19056b = baseController;
        this.f19057c = obj;
        this.d = obj2;
        this.f19058e = obj3;
        this.f19059f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19055a) {
            case 0:
                ((MessagesController) this.f19056b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.b2) this.f19057c, (of.e) this.d, (org.telegram.ui.ActionBar.n2) this.f19058e, (Bundle) this.f19059f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19056b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f19057c, (org.telegram.ui.ActionBar.i6) this.d, (TLRPC.TL_inputThemeSettings) this.f19058e, (org.telegram.ui.ActionBar.h6) this.f19059f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19056b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f19057c, (byte[]) this.f19058e, (TLRPC.User) this.f19059f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19056b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f19057c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19058e, (MessageObject) this.f19059f, tLObject, tL_error);
                return;
        }
    }

    public t9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f19055a = 2;
        this.f19056b = secretChatHelper;
        this.d = context;
        this.f19057c = b2Var;
        this.f19058e = bArr;
        this.f19059f = user;
    }
}

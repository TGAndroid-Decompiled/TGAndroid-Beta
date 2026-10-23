package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x9 implements RequestDelegate {
    public final int f20064a;
    public final BaseController f20065b;
    public final Object f20066c;
    public final Object d;
    public final Object e;
    public final Object f20067f;

    public x9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20064a = i10;
        this.f20065b = baseController;
        this.f20066c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f20067f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20064a) {
            case 0:
                ((MessagesController) this.f20065b).lambda$checkCanOpenChat$455((org.telegram.ui.ActionBar.b2) this.f20066c, (pf.c) this.d, (org.telegram.ui.ActionBar.n2) this.e, (Bundle) this.f20067f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20065b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f20066c, (org.telegram.ui.ActionBar.g6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.f6) this.f20067f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f20065b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f20066c, (byte[]) this.e, (TLRPC.User) this.f20067f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f20065b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f20066c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f20067f, tLObject, tL_error);
                return;
        }
    }

    public x9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f20064a = 2;
        this.f20065b = secretChatHelper;
        this.d = context;
        this.f20066c = b2Var;
        this.e = bArr;
        this.f20067f = user;
    }
}

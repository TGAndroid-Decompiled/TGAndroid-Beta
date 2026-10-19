package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u9 implements RequestDelegate {
    public final int f19643a;
    public final BaseController f19644b;
    public final Object f19645c;
    public final Object d;
    public final Object e;
    public final Object f19646f;

    public u9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19643a = i10;
        this.f19644b = baseController;
        this.f19645c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f19646f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19643a) {
            case 0:
                ((MessagesController) this.f19644b).lambda$checkCanOpenChat$455((org.telegram.ui.ActionBar.b2) this.f19645c, (pf.c) this.d, (org.telegram.ui.ActionBar.n2) this.e, (Bundle) this.f19646f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19644b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f19645c, (org.telegram.ui.ActionBar.g6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.f6) this.f19646f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19644b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f19645c, (byte[]) this.e, (TLRPC.User) this.f19646f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19644b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f19645c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f19646f, tLObject, tL_error);
                return;
        }
    }

    public u9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f19643a = 2;
        this.f19644b = secretChatHelper;
        this.d = context;
        this.f19645c = b2Var;
        this.e = bArr;
        this.f19646f = user;
    }
}

package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f19564a;
    public final BaseController f19565b;
    public final Object f19566c;
    public final Object d;
    public final Object e;
    public final Object f19567f;

    public t9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19564a = i10;
        this.f19565b = baseController;
        this.f19566c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f19567f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19564a) {
            case 0:
                ((MessagesController) this.f19565b).lambda$checkCanOpenChat$455((org.telegram.ui.ActionBar.b2) this.f19566c, (pf.c) this.d, (org.telegram.ui.ActionBar.n2) this.e, (Bundle) this.f19567f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19565b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f19566c, (org.telegram.ui.ActionBar.g6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.f6) this.f19567f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19565b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f19566c, (byte[]) this.e, (TLRPC.User) this.f19567f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19565b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f19566c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f19567f, tLObject, tL_error);
                return;
        }
    }

    public t9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f19564a = 2;
        this.f19565b = secretChatHelper;
        this.d = context;
        this.f19566c = b2Var;
        this.e = bArr;
        this.f19567f = user;
    }
}

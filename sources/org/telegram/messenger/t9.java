package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f17372a;
    public final BaseController f17373b;
    public final Object f17374c;
    public final Object d;
    public final Object e;
    public final Object f17375f;

    public t9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17372a = i10;
        this.f17373b = baseController;
        this.f17374c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17375f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17372a) {
            case 0:
                ((MessagesController) this.f17373b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.b2) this.f17374c, (nf.e) this.d, (org.telegram.ui.ActionBar.n2) this.e, (Bundle) this.f17375f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17373b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f17374c, (org.telegram.ui.ActionBar.h6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.g6) this.f17375f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f17373b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f17374c, (byte[]) this.e, (TLRPC.User) this.f17375f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f17373b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f17374c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f17375f, tLObject, tL_error);
                return;
        }
    }

    public t9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f17372a = 2;
        this.f17373b = secretChatHelper;
        this.d = context;
        this.f17374c = b2Var;
        this.e = bArr;
        this.f17375f = user;
    }
}

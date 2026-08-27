package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class v9 implements RequestDelegate {

    public final int f21784a;

    public final BaseController f21785b;

    public final Object f21786c;
    public final Object d;

    public final Object f21787e;

    public final Object f21788f;

    public v9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f21784a = i10;
        this.f21785b = baseController;
        this.f21786c = obj;
        this.d = obj2;
        this.f21787e = obj3;
        this.f21788f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21784a) {
            case 0:
                ((MessagesController) this.f21785b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.b2) this.f21786c, (we.d) this.d, (org.telegram.ui.ActionBar.n2) this.f21787e, (Bundle) this.f21788f, tLObject, tL_error);
                break;
            case 1:
                ((MessagesController) this.f21785b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f21786c, (org.telegram.ui.ActionBar.f6) this.d, (TLRPC.TL_inputThemeSettings) this.f21787e, (org.telegram.ui.ActionBar.e6) this.f21788f, tLObject, tL_error);
                break;
            case 2:
                ((SecretChatHelper) this.f21785b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f21786c, (byte[]) this.f21787e, (TLRPC.User) this.f21788f, tLObject, tL_error);
                break;
            default:
                ((SendMessagesHelper) this.f21785b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f21786c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f21787e, (MessageObject) this.f21788f, tLObject, tL_error);
                break;
        }
    }

    public v9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f21784a = 2;
        this.f21785b = secretChatHelper;
        this.d = context;
        this.f21786c = b2Var;
        this.f21787e = bArr;
        this.f21788f = user;
    }
}

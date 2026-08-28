package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r9 implements RequestDelegate {
    public final int f21389a;
    public final BaseController f21390b;
    public final Object f21391c;
    public final Object d;
    public final Object f21392e;
    public final Object f21393f;

    public r9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f21389a = i9;
        this.f21390b = baseController;
        this.f21391c = obj;
        this.d = obj2;
        this.f21392e = obj3;
        this.f21393f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21389a) {
            case 0:
                ((MessagesController) this.f21390b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.c2) this.f21391c, (ve.d) this.d, (org.telegram.ui.ActionBar.o2) this.f21392e, (Bundle) this.f21393f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f21390b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f21391c, (org.telegram.ui.ActionBar.e6) this.d, (TLRPC.TL_inputThemeSettings) this.f21392e, (org.telegram.ui.ActionBar.d6) this.f21393f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f21390b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.c2) this.f21391c, (byte[]) this.f21392e, (TLRPC.User) this.f21393f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f21390b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f21391c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f21392e, (MessageObject) this.f21393f, tLObject, tL_error);
                return;
        }
    }

    public r9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.c2 c2Var, byte[] bArr, TLRPC.User user) {
        this.f21389a = 2;
        this.f21390b = secretChatHelper;
        this.d = context;
        this.f21391c = c2Var;
        this.f21392e = bArr;
        this.f21393f = user;
    }
}

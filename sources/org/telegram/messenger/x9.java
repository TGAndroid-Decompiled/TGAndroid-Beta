package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x9 implements RequestDelegate {
    public final int f22159a;
    public final BaseController f22160b;
    public final Object f22161c;
    public final Object d;
    public final Object f22162e;
    public final Object f22163f;

    public x9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f22159a = i10;
        this.f22160b = baseController;
        this.f22161c = obj;
        this.d = obj2;
        this.f22162e = obj3;
        this.f22163f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f22159a) {
            case 0:
                ((MessagesController) this.f22160b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.c2) this.f22161c, (ye.c) this.d, (org.telegram.ui.ActionBar.o2) this.f22162e, (Bundle) this.f22163f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f22160b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f22161c, (org.telegram.ui.ActionBar.f6) this.d, (TLRPC.TL_inputThemeSettings) this.f22162e, (org.telegram.ui.ActionBar.e6) this.f22163f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f22160b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.c2) this.f22161c, (byte[]) this.f22162e, (TLRPC.User) this.f22163f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f22160b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f22161c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f22162e, (MessageObject) this.f22163f, tLObject, tL_error);
                return;
        }
    }

    public x9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.c2 c2Var, byte[] bArr, TLRPC.User user) {
        this.f22159a = 2;
        this.f22160b = secretChatHelper;
        this.d = context;
        this.f22161c = c2Var;
        this.f22162e = bArr;
        this.f22163f = user;
    }
}

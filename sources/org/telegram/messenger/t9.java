package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f17591a;
    public final BaseController f17592b;
    public final Object f17593c;
    public final Object d;
    public final Object e;
    public final Object f17594f;

    public t9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17591a = i10;
        this.f17592b = baseController;
        this.f17593c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17594f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17591a) {
            case 0:
                ((MessagesController) this.f17592b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.a2) this.f17593c, (nf.e) this.d, (org.telegram.ui.ActionBar.m2) this.e, (Bundle) this.f17594f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17592b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f17593c, (org.telegram.ui.ActionBar.g6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.f6) this.f17594f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f17592b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.a2) this.f17593c, (byte[]) this.e, (TLRPC.User) this.f17594f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f17592b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f17593c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f17594f, tLObject, tL_error);
                return;
        }
    }

    public t9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, byte[] bArr, TLRPC.User user) {
        this.f17591a = 2;
        this.f17592b = secretChatHelper;
        this.d = context;
        this.f17593c = a2Var;
        this.e = bArr;
        this.f17594f = user;
    }
}

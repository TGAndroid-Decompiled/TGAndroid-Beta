package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f17604a;
    public final BaseController f17605b;
    public final Object f17606c;
    public final Object d;
    public final Object e;
    public final Object f17607f;

    public t9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17604a = i10;
        this.f17605b = baseController;
        this.f17606c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f17607f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17604a) {
            case 0:
                ((MessagesController) this.f17605b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.b2) this.f17606c, (nf.e) this.d, (org.telegram.ui.ActionBar.n2) this.e, (Bundle) this.f17607f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17605b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f17606c, (org.telegram.ui.ActionBar.i6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.h6) this.f17607f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f17605b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f17606c, (byte[]) this.e, (TLRPC.User) this.f17607f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f17605b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f17606c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f17607f, tLObject, tL_error);
                return;
        }
    }

    public t9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f17604a = 2;
        this.f17605b = secretChatHelper;
        this.d = context;
        this.f17606c = b2Var;
        this.e = bArr;
        this.f17607f = user;
    }
}

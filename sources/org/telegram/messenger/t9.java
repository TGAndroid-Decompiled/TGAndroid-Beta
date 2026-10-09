package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f19226a;
    public final BaseController f19227b;
    public final Object f19228c;
    public final Object d;
    public final Object f19229e;
    public final Object f19230f;

    public t9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19226a = i10;
        this.f19227b = baseController;
        this.f19228c = obj;
        this.d = obj2;
        this.f19229e = obj3;
        this.f19230f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19226a) {
            case 0:
                ((MessagesController) this.f19227b).lambda$checkCanOpenChat$455((org.telegram.ui.ActionBar.b2) this.f19228c, (of.e) this.d, (org.telegram.ui.ActionBar.n2) this.f19229e, (Bundle) this.f19230f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19227b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f19228c, (org.telegram.ui.ActionBar.h6) this.d, (TLRPC.TL_inputThemeSettings) this.f19229e, (org.telegram.ui.ActionBar.g6) this.f19230f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19227b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f19228c, (byte[]) this.f19229e, (TLRPC.User) this.f19230f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19227b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f19228c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19229e, (MessageObject) this.f19230f, tLObject, tL_error);
                return;
        }
    }

    public t9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f19226a = 2;
        this.f19227b = secretChatHelper;
        this.d = context;
        this.f19228c = b2Var;
        this.f19229e = bArr;
        this.f19230f = user;
    }
}

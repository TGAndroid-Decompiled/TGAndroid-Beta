package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class v9 implements RequestDelegate {
    public final int f19730a;
    public final BaseController f19731b;
    public final Object f19732c;
    public final Object d;
    public final Object e;
    public final Object f19733f;

    public v9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19730a = i10;
        this.f19731b = baseController;
        this.f19732c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f19733f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19730a) {
            case 0:
                ((MessagesController) this.f19731b).lambda$checkCanOpenChat$455((org.telegram.ui.ActionBar.b2) this.f19732c, (pf.c) this.d, (org.telegram.ui.ActionBar.n2) this.e, (Bundle) this.f19733f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19731b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f19732c, (org.telegram.ui.ActionBar.g6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.f6) this.f19733f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19731b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f19732c, (byte[]) this.e, (TLRPC.User) this.f19733f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19731b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f19732c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f19733f, tLObject, tL_error);
                return;
        }
    }

    public v9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f19730a = 2;
        this.f19731b = secretChatHelper;
        this.d = context;
        this.f19732c = b2Var;
        this.e = bArr;
        this.f19733f = user;
    }
}

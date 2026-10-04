package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f19227a;
    public final BaseController f19228b;
    public final Object f19229c;
    public final Object d;
    public final Object f19230e;
    public final Object f19231f;

    public t9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19227a = i10;
        this.f19228b = baseController;
        this.f19229c = obj;
        this.d = obj2;
        this.f19230e = obj3;
        this.f19231f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19227a) {
            case 0:
                ((MessagesController) this.f19228b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.b2) this.f19229c, (nf.e) this.d, (org.telegram.ui.ActionBar.n2) this.f19230e, (Bundle) this.f19231f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19228b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f19229c, (org.telegram.ui.ActionBar.h6) this.d, (TLRPC.TL_inputThemeSettings) this.f19230e, (org.telegram.ui.ActionBar.f6) this.f19231f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19228b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f19229c, (byte[]) this.f19230e, (TLRPC.User) this.f19231f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19228b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f19229c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19230e, (MessageObject) this.f19231f, tLObject, tL_error);
                return;
        }
    }

    public t9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f19227a = 2;
        this.f19228b = secretChatHelper;
        this.d = context;
        this.f19229c = b2Var;
        this.f19230e = bArr;
        this.f19231f = user;
    }
}

package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f19229a;
    public final BaseController f19230b;
    public final Object f19231c;
    public final Object d;
    public final Object f19232e;
    public final Object f19233f;

    public t9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19229a = i10;
        this.f19230b = baseController;
        this.f19231c = obj;
        this.d = obj2;
        this.f19232e = obj3;
        this.f19233f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19229a) {
            case 0:
                ((MessagesController) this.f19230b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.b2) this.f19231c, (nf.e) this.d, (org.telegram.ui.ActionBar.n2) this.f19232e, (Bundle) this.f19233f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19230b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f19231c, (org.telegram.ui.ActionBar.h6) this.d, (TLRPC.TL_inputThemeSettings) this.f19232e, (org.telegram.ui.ActionBar.f6) this.f19233f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19230b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f19231c, (byte[]) this.f19232e, (TLRPC.User) this.f19233f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19230b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f19231c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19232e, (MessageObject) this.f19233f, tLObject, tL_error);
                return;
        }
    }

    public t9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f19229a = 2;
        this.f19230b = secretChatHelper;
        this.d = context;
        this.f19231c = b2Var;
        this.f19232e = bArr;
        this.f19233f = user;
    }
}

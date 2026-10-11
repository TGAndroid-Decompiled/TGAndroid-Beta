package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f19232a;
    public final BaseController f19233b;
    public final Object f19234c;
    public final Object d;
    public final Object f19235e;
    public final Object f19236f;

    public t9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19232a = i10;
        this.f19233b = baseController;
        this.f19234c = obj;
        this.d = obj2;
        this.f19235e = obj3;
        this.f19236f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19232a) {
            case 0:
                ((MessagesController) this.f19233b).lambda$checkCanOpenChat$455((org.telegram.ui.ActionBar.a2) this.f19234c, (of.e) this.d, (org.telegram.ui.ActionBar.m2) this.f19235e, (Bundle) this.f19236f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19233b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f19234c, (org.telegram.ui.ActionBar.g6) this.d, (TLRPC.TL_inputThemeSettings) this.f19235e, (org.telegram.ui.ActionBar.f6) this.f19236f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19233b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.a2) this.f19234c, (byte[]) this.f19235e, (TLRPC.User) this.f19236f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19233b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f19234c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19235e, (MessageObject) this.f19236f, tLObject, tL_error);
                return;
        }
    }

    public t9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, byte[] bArr, TLRPC.User user) {
        this.f19232a = 2;
        this.f19233b = secretChatHelper;
        this.d = context;
        this.f19234c = a2Var;
        this.f19235e = bArr;
        this.f19236f = user;
    }
}

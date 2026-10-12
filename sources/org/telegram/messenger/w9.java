package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w9 implements RequestDelegate {
    public final int f19454a;
    public final BaseController f19455b;
    public final Object f19456c;
    public final Object d;
    public final Object f19457e;
    public final Object f19458f;

    public w9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19454a = i10;
        this.f19455b = baseController;
        this.f19456c = obj;
        this.d = obj2;
        this.f19457e = obj3;
        this.f19458f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19454a) {
            case 0:
                ((MessagesController) this.f19455b).lambda$checkCanOpenChat$455((org.telegram.ui.ActionBar.a2) this.f19456c, (of.e) this.d, (org.telegram.ui.ActionBar.m2) this.f19457e, (Bundle) this.f19458f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19455b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f19456c, (org.telegram.ui.ActionBar.g6) this.d, (TLRPC.TL_inputThemeSettings) this.f19457e, (org.telegram.ui.ActionBar.e6) this.f19458f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19455b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.a2) this.f19456c, (byte[]) this.f19457e, (TLRPC.User) this.f19458f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19455b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f19456c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19457e, (MessageObject) this.f19458f, tLObject, tL_error);
                return;
        }
    }

    public w9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, byte[] bArr, TLRPC.User user) {
        this.f19454a = 2;
        this.f19455b = secretChatHelper;
        this.d = context;
        this.f19456c = a2Var;
        this.f19457e = bArr;
        this.f19458f = user;
    }
}

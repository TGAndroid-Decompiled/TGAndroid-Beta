package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w9 implements RequestDelegate {
    public final int f19455a;
    public final BaseController f19456b;
    public final Object f19457c;
    public final Object d;
    public final Object f19458e;
    public final Object f19459f;

    public w9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19455a = i10;
        this.f19456b = baseController;
        this.f19457c = obj;
        this.d = obj2;
        this.f19458e = obj3;
        this.f19459f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19455a) {
            case 0:
                ((MessagesController) this.f19456b).lambda$checkCanOpenChat$455((org.telegram.ui.ActionBar.a2) this.f19457c, (of.e) this.d, (org.telegram.ui.ActionBar.m2) this.f19458e, (Bundle) this.f19459f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19456b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f19457c, (org.telegram.ui.ActionBar.g6) this.d, (TLRPC.TL_inputThemeSettings) this.f19458e, (org.telegram.ui.ActionBar.e6) this.f19459f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19456b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.a2) this.f19457c, (byte[]) this.f19458e, (TLRPC.User) this.f19459f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19456b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f19457c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19458e, (MessageObject) this.f19459f, tLObject, tL_error);
                return;
        }
    }

    public w9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, byte[] bArr, TLRPC.User user) {
        this.f19455a = 2;
        this.f19456b = secretChatHelper;
        this.d = context;
        this.f19457c = a2Var;
        this.f19458e = bArr;
        this.f19459f = user;
    }
}

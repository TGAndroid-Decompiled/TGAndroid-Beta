package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class w9 implements RequestDelegate {
    public final int f18913a;
    public final BaseController f18914b;
    public final Object f18915c;
    public final Object d;
    public final Object e;
    public final Object f18916f;

    public w9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18913a = i10;
        this.f18914b = baseController;
        this.f18915c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f18916f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18913a) {
            case 0:
                ((MessagesController) this.f18914b).lambda$checkCanOpenChat$455((org.telegram.ui.ActionBar.a2) this.f18915c, (pf.c) this.d, (org.telegram.ui.ActionBar.m2) this.e, (Bundle) this.f18916f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18914b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f18915c, (org.telegram.ui.ActionBar.f6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.e6) this.f18916f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f18914b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.a2) this.f18915c, (byte[]) this.e, (TLRPC.User) this.f18916f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f18914b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f18915c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f18916f, tLObject, tL_error);
                return;
        }
    }

    public w9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, byte[] bArr, TLRPC.User user) {
        this.f18913a = 2;
        this.f18914b = secretChatHelper;
        this.d = context;
        this.f18915c = a2Var;
        this.e = bArr;
        this.f18916f = user;
    }
}

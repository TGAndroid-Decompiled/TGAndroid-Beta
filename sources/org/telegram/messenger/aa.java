package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class aa implements RequestDelegate {
    public final int f19610a;
    public final BaseController f19611b;
    public final Object f19612c;
    public final Object d;
    public final Object e;
    public final Object f19613f;

    public aa(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19610a = i10;
        this.f19611b = baseController;
        this.f19612c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f19613f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19610a) {
            case 0:
                ((MessagesController) this.f19611b).lambda$checkCanOpenChat$458((org.telegram.ui.ActionBar.e2) this.f19612c, (qf.c) this.d, (org.telegram.ui.ActionBar.r2) this.e, (Bundle) this.f19613f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19611b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f19612c, (org.telegram.ui.ActionBar.x6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.w6) this.f19613f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19611b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.e2) this.f19612c, (byte[]) this.e, (TLRPC.User) this.f19613f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19611b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f19612c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f19613f, tLObject, tL_error);
                return;
        }
    }

    public aa(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.e2 e2Var, byte[] bArr, TLRPC.User user) {
        this.f19610a = 2;
        this.f19611b = secretChatHelper;
        this.d = context;
        this.f19612c = e2Var;
        this.e = bArr;
        this.f19613f = user;
    }
}

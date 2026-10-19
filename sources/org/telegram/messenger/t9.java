package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f19561a;
    public final BaseController f19562b;
    public final Object f19563c;
    public final Object d;
    public final Object e;
    public final Object f19564f;

    public t9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19561a = i10;
        this.f19562b = baseController;
        this.f19563c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f19564f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19561a) {
            case 0:
                ((MessagesController) this.f19562b).lambda$checkCanOpenChat$455((org.telegram.ui.ActionBar.b2) this.f19563c, (pf.c) this.d, (org.telegram.ui.ActionBar.n2) this.e, (Bundle) this.f19564f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19562b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f19563c, (org.telegram.ui.ActionBar.g6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.f6) this.f19564f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19562b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f19563c, (byte[]) this.e, (TLRPC.User) this.f19564f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19562b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f19563c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f19564f, tLObject, tL_error);
                return;
        }
    }

    public t9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f19561a = 2;
        this.f19562b = secretChatHelper;
        this.d = context;
        this.f19563c = b2Var;
        this.e = bArr;
        this.f19564f = user;
    }
}

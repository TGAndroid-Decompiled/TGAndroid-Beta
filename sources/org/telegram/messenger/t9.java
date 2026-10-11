package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f19268a;
    public final BaseController f19269b;
    public final Object f19270c;
    public final Object d;
    public final Object f19271e;
    public final Object f19272f;

    public t9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19268a = i10;
        this.f19269b = baseController;
        this.f19270c = obj;
        this.d = obj2;
        this.f19271e = obj3;
        this.f19272f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19268a) {
            case 0:
                ((MessagesController) this.f19269b).lambda$checkCanOpenChat$455((org.telegram.ui.ActionBar.a2) this.f19270c, (of.e) this.d, (org.telegram.ui.ActionBar.m2) this.f19271e, (Bundle) this.f19272f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19269b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f19270c, (org.telegram.ui.ActionBar.g6) this.d, (TLRPC.TL_inputThemeSettings) this.f19271e, (org.telegram.ui.ActionBar.f6) this.f19272f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19269b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.a2) this.f19270c, (byte[]) this.f19271e, (TLRPC.User) this.f19272f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19269b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f19270c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19271e, (MessageObject) this.f19272f, tLObject, tL_error);
                return;
        }
    }

    public t9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.a2 a2Var, byte[] bArr, TLRPC.User user) {
        this.f19268a = 2;
        this.f19269b = secretChatHelper;
        this.d = context;
        this.f19270c = a2Var;
        this.f19271e = bArr;
        this.f19272f = user;
    }
}

package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class aa implements RequestDelegate {
    public final int f14698a;
    public final BaseController f14699b;
    public final Object f14700c;
    public final Object d;
    public final Object e;
    public final Object f14701f;

    public aa(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f14698a = i10;
        this.f14699b = baseController;
        this.f14700c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f14701f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f14698a) {
            case 0:
                ((MessagesController) this.f14699b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.d2) this.f14700c, (nf.e) this.d, (org.telegram.ui.ActionBar.p2) this.e, (Bundle) this.f14701f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f14699b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f14700c, (org.telegram.ui.ActionBar.i6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.h6) this.f14701f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f14699b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.d2) this.f14700c, (byte[]) this.e, (TLRPC.User) this.f14701f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f14699b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f14700c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f14701f, tLObject, tL_error);
                return;
        }
    }

    public aa(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.d2 d2Var, byte[] bArr, TLRPC.User user) {
        this.f14698a = 2;
        this.f14699b = secretChatHelper;
        this.d = context;
        this.f14700c = d2Var;
        this.e = bArr;
        this.f14701f = user;
    }
}

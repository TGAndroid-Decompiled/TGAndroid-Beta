package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t9 implements RequestDelegate {
    public final int f19234a;
    public final BaseController f19235b;
    public final Object f19236c;
    public final Object d;
    public final Object f19237e;
    public final Object f19238f;

    public t9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f19234a = i10;
        this.f19235b = baseController;
        this.f19236c = obj;
        this.d = obj2;
        this.f19237e = obj3;
        this.f19238f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19234a) {
            case 0:
                ((MessagesController) this.f19235b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.b2) this.f19236c, (nf.e) this.d, (org.telegram.ui.ActionBar.n2) this.f19237e, (Bundle) this.f19238f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19235b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f19236c, (org.telegram.ui.ActionBar.h6) this.d, (TLRPC.TL_inputThemeSettings) this.f19237e, (org.telegram.ui.ActionBar.f6) this.f19238f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f19235b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f19236c, (byte[]) this.f19237e, (TLRPC.User) this.f19238f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f19235b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f19236c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19237e, (MessageObject) this.f19238f, tLObject, tL_error);
                return;
        }
    }

    public t9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f19234a = 2;
        this.f19235b = secretChatHelper;
        this.d = context;
        this.f19236c = b2Var;
        this.f19237e = bArr;
        this.f19238f = user;
    }
}

package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s9 implements RequestDelegate {
    public final int f18971a;
    public final BaseController f18972b;
    public final Object f18973c;
    public final Object d;
    public final Object f18974e;
    public final Object f18975f;

    public s9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18971a = i10;
        this.f18972b = baseController;
        this.f18973c = obj;
        this.d = obj2;
        this.f18974e = obj3;
        this.f18975f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18971a) {
            case 0:
                ((MessagesController) this.f18972b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.b2) this.f18973c, (of.e) this.d, (org.telegram.ui.ActionBar.n2) this.f18974e, (Bundle) this.f18975f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18972b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f18973c, (org.telegram.ui.ActionBar.i6) this.d, (TLRPC.TL_inputThemeSettings) this.f18974e, (org.telegram.ui.ActionBar.h6) this.f18975f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f18972b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f18973c, (byte[]) this.f18974e, (TLRPC.User) this.f18975f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f18972b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f18973c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f18974e, (MessageObject) this.f18975f, tLObject, tL_error);
                return;
        }
    }

    public s9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f18971a = 2;
        this.f18972b = secretChatHelper;
        this.d = context;
        this.f18973c = b2Var;
        this.f18974e = bArr;
        this.f18975f = user;
    }
}

package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s9 implements RequestDelegate {
    public final int f18998a;
    public final BaseController f18999b;
    public final Object f19000c;
    public final Object d;
    public final Object f19001e;
    public final Object f19002f;

    public s9(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18998a = i10;
        this.f18999b = baseController;
        this.f19000c = obj;
        this.d = obj2;
        this.f19001e = obj3;
        this.f19002f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18998a) {
            case 0:
                ((MessagesController) this.f18999b).lambda$checkCanOpenChat$452((org.telegram.ui.ActionBar.b2) this.f19000c, (of.e) this.d, (org.telegram.ui.ActionBar.n2) this.f19001e, (Bundle) this.f19002f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18999b).lambda$didReceivedNotification$51((TLRPC.TL_theme) this.f19000c, (org.telegram.ui.ActionBar.i6) this.d, (TLRPC.TL_inputThemeSettings) this.f19001e, (org.telegram.ui.ActionBar.h6) this.f19002f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f18999b).lambda$startSecretChat$28((Context) this.d, (org.telegram.ui.ActionBar.b2) this.f19000c, (byte[]) this.f19001e, (TLRPC.User) this.f19002f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f18999b).lambda$performSendDelayedMessage$56((TLRPC.InputMedia) this.f19000c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.f19001e, (MessageObject) this.f19002f, tLObject, tL_error);
                return;
        }
    }

    public s9(SecretChatHelper secretChatHelper, Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user) {
        this.f18998a = 2;
        this.f18999b = secretChatHelper;
        this.d = context;
        this.f19000c = b2Var;
        this.f19001e = bArr;
        this.f19002f = user;
    }
}

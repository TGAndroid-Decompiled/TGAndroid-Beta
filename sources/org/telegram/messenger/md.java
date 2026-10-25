package org.telegram.messenger;

import android.content.Context;
import android.os.Bundle;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class md implements RequestDelegate {
    public final int f20687a;
    public final BaseController f20688b;
    public final Object f20689c;
    public final Object d;
    public final Object e;
    public final Object f20690f;

    public md(BaseController baseController, Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20687a = i10;
        this.f20688b = baseController;
        this.f20689c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f20690f = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20687a) {
            case 0:
                ((MessagesController) this.f20688b).lambda$didReceivedNotification$50((TLRPC.TL_theme) this.f20689c, (org.telegram.ui.ActionBar.x6) this.d, (TLRPC.TL_inputThemeSettings) this.e, (org.telegram.ui.ActionBar.w6) this.f20690f, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20688b).lambda$checkCanOpenChat$457((org.telegram.ui.ActionBar.e2) this.f20689c, (qf.c) this.d, (org.telegram.ui.ActionBar.r2) this.e, (Bundle) this.f20690f, tLObject, tL_error);
                return;
            case 2:
                ((SecretChatHelper) this.f20688b).lambda$startSecretChat$28((Context) this.f20689c, (org.telegram.ui.ActionBar.e2) this.d, (byte[]) this.e, (TLRPC.User) this.f20690f, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f20688b).lambda$performSendDelayedMessage$59((TLRPC.InputMedia) this.f20689c, (SendMessagesHelper.DelayedMessage) this.d, (String) this.e, (MessageObject) this.f20690f, tLObject, tL_error);
                return;
        }
    }
}

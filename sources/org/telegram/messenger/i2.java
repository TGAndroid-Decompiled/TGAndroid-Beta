package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i2 implements RequestDelegate {
    public final int f17442a;
    public final Object f17443b;
    public final Object f17444c;
    public final Object d;
    public final Object e;

    public i2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17442a = i10;
        this.f17443b = obj;
        this.f17444c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17442a) {
            case 0:
                ((FactCheckController) this.f17443b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f17444c, (ArrayList) this.d, (HashMap) this.e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f17443b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f17444c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17443b).lambda$didReceivedNotification$45((org.telegram.ui.ActionBar.c6) this.f17444c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f17443b).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.f17444c, (TLRPC.User) this.d, (TLRPC.Chat) this.e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f17443b).lambda$startSecretChat$30((Context) this.f17444c, (org.telegram.ui.ActionBar.d2) this.d, (TLRPC.User) this.e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f17443b).lambda$sendVote$32((MessageObject) this.f17444c, (String) this.d, (Runnable) this.e, tLObject, tL_error);
                return;
        }
    }
}

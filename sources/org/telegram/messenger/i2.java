package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i2 implements RequestDelegate {
    public final int f18915a;
    public final Object f18916b;
    public final Object f18917c;
    public final Object d;
    public final Object f18918e;

    public i2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18915a = i10;
        this.f18916b = obj;
        this.f18917c = obj2;
        this.d = obj3;
        this.f18918e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18915a) {
            case 0:
                ((FactCheckController) this.f18916b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f18917c, (ArrayList) this.d, (HashMap) this.f18918e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f18916b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f18917c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.f18918e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18916b).lambda$didReceivedNotification$45((org.telegram.ui.ActionBar.d6) this.f18917c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.f18918e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f18916b).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.f18917c, (TLRPC.User) this.d, (TLRPC.Chat) this.f18918e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f18916b).lambda$startSecretChat$30((Context) this.f18917c, (org.telegram.ui.ActionBar.d2) this.d, (TLRPC.User) this.f18918e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f18916b).lambda$sendVote$32((MessageObject) this.f18917c, (String) this.d, (Runnable) this.f18918e, tLObject, tL_error);
                return;
        }
    }
}

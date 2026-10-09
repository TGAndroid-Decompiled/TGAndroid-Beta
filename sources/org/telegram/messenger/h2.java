package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f18005a;
    public final Object f18006b;
    public final Object f18007c;
    public final Object d;
    public final Object f18008e;

    public h2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18005a = i10;
        this.f18006b = obj;
        this.f18007c = obj2;
        this.d = obj3;
        this.f18008e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18005a) {
            case 0:
                ((FactCheckController) this.f18006b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f18007c, (ArrayList) this.d, (HashMap) this.f18008e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f18006b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f18007c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.f18008e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18006b).lambda$didReceivedNotification$44((org.telegram.ui.ActionBar.b6) this.f18007c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.f18008e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f18006b).lambda$deleteUserChannelHistory$132((TLRPC.Chat) this.f18007c, (TLRPC.User) this.d, (TLRPC.Chat) this.f18008e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f18006b).lambda$startSecretChat$30((Context) this.f18007c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.User) this.f18008e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f18006b).lambda$sendVote$35((MessageObject) this.f18007c, (String) this.d, (Runnable) this.f18008e, tLObject, tL_error);
                return;
        }
    }
}

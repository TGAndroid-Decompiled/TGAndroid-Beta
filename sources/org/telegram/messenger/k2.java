package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k2 implements RequestDelegate {
    public final int f17350a;
    public final Object f17351b;
    public final Object f17352c;
    public final Object d;
    public final Object e;

    public k2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17350a = i10;
        this.f17351b = obj;
        this.f17352c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17350a) {
            case 0:
                ((FactCheckController) this.f17351b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f17352c, (ArrayList) this.d, (HashMap) this.e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f17351b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f17352c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17351b).lambda$didReceivedNotification$44((org.telegram.ui.ActionBar.z5) this.f17352c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f17351b).lambda$deleteUserChannelHistory$132((TLRPC.Chat) this.f17352c, (TLRPC.User) this.d, (TLRPC.Chat) this.e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f17351b).lambda$startSecretChat$30((Context) this.f17352c, (org.telegram.ui.ActionBar.a2) this.d, (TLRPC.User) this.e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f17351b).lambda$sendVote$35((MessageObject) this.f17352c, (String) this.d, (Runnable) this.e, tLObject, tL_error);
                return;
        }
    }
}

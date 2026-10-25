package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m2 implements RequestDelegate {
    public final int f20635a;
    public final Object f20636b;
    public final Object f20637c;
    public final Object d;
    public final Object e;

    public m2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20635a = i10;
        this.f20636b = obj;
        this.f20637c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20635a) {
            case 0:
                ((FactCheckController) this.f20636b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f20637c, (ArrayList) this.d, (HashMap) this.e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f20636b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f20637c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f20636b).lambda$didReceivedNotification$44((org.telegram.ui.ActionBar.r6) this.f20637c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f20636b).lambda$deleteUserChannelHistory$132((TLRPC.Chat) this.f20637c, (TLRPC.User) this.d, (TLRPC.Chat) this.e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f20636b).lambda$startSecretChat$30((Context) this.f20637c, (org.telegram.ui.ActionBar.e2) this.d, (TLRPC.User) this.e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f20636b).lambda$sendVote$35((MessageObject) this.f20637c, (String) this.d, (Runnable) this.e, tLObject, tL_error);
                return;
        }
    }
}

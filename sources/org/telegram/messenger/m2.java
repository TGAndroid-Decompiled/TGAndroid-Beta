package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m2 implements RequestDelegate {
    public final int f20653a;
    public final Object f20654b;
    public final Object f20655c;
    public final Object d;
    public final Object e;

    public m2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20653a = i10;
        this.f20654b = obj;
        this.f20655c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20653a) {
            case 0:
                ((FactCheckController) this.f20654b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f20655c, (ArrayList) this.d, (HashMap) this.e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f20654b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f20655c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f20654b).lambda$didReceivedNotification$44((org.telegram.ui.ActionBar.r6) this.f20655c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f20654b).lambda$deleteUserChannelHistory$132((TLRPC.Chat) this.f20655c, (TLRPC.User) this.d, (TLRPC.Chat) this.e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f20654b).lambda$startSecretChat$30((Context) this.f20655c, (org.telegram.ui.ActionBar.e2) this.d, (TLRPC.User) this.e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f20654b).lambda$sendVote$35((MessageObject) this.f20655c, (String) this.d, (Runnable) this.e, tLObject, tL_error);
                return;
        }
    }
}

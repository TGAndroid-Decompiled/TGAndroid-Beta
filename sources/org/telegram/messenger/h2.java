package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f18017a;
    public final Object f18018b;
    public final Object f18019c;
    public final Object d;
    public final Object f18020e;

    public h2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18017a = i10;
        this.f18018b = obj;
        this.f18019c = obj2;
        this.d = obj3;
        this.f18020e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18017a) {
            case 0:
                ((FactCheckController) this.f18018b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f18019c, (ArrayList) this.d, (HashMap) this.f18020e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f18018b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f18019c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.f18020e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18018b).lambda$didReceivedNotification$45((org.telegram.ui.ActionBar.a6) this.f18019c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.f18020e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f18018b).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.f18019c, (TLRPC.User) this.d, (TLRPC.Chat) this.f18020e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f18018b).lambda$startSecretChat$30((Context) this.f18019c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.User) this.f18020e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f18018b).lambda$sendVote$32((MessageObject) this.f18019c, (String) this.d, (Runnable) this.f18020e, tLObject, tL_error);
                return;
        }
    }
}

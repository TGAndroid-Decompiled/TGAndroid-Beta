package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f17845a;
    public final Object f17846b;
    public final Object f17847c;
    public final Object d;
    public final Object f17848e;

    public h2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17845a = i10;
        this.f17846b = obj;
        this.f17847c = obj2;
        this.d = obj3;
        this.f17848e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17845a) {
            case 0:
                ((FactCheckController) this.f17846b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f17847c, (ArrayList) this.d, (HashMap) this.f17848e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f17846b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f17847c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.f17848e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17846b).lambda$didReceivedNotification$45((org.telegram.ui.ActionBar.b6) this.f17847c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.f17848e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f17846b).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.f17847c, (TLRPC.User) this.d, (TLRPC.Chat) this.f17848e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f17846b).lambda$startSecretChat$30((Context) this.f17847c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.User) this.f17848e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f17846b).lambda$sendVote$32((MessageObject) this.f17847c, (String) this.d, (Runnable) this.f17848e, tLObject, tL_error);
                return;
        }
    }
}

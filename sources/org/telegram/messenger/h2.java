package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f17872a;
    public final Object f17873b;
    public final Object f17874c;
    public final Object d;
    public final Object f17875e;

    public h2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17872a = i10;
        this.f17873b = obj;
        this.f17874c = obj2;
        this.d = obj3;
        this.f17875e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17872a) {
            case 0:
                ((FactCheckController) this.f17873b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f17874c, (ArrayList) this.d, (HashMap) this.f17875e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f17873b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f17874c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.f17875e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17873b).lambda$didReceivedNotification$45((org.telegram.ui.ActionBar.b6) this.f17874c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.f17875e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f17873b).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.f17874c, (TLRPC.User) this.d, (TLRPC.Chat) this.f17875e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f17873b).lambda$startSecretChat$30((Context) this.f17874c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.User) this.f17875e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f17873b).lambda$sendVote$32((MessageObject) this.f17874c, (String) this.d, (Runnable) this.f17875e, tLObject, tL_error);
                return;
        }
    }
}

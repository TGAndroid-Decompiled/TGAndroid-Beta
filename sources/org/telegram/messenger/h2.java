package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f20444a;
    public final Object f20445b;
    public final Object f20446c;
    public final Object d;
    public final Object f20447e;

    public h2(Object obj, Object obj2, Object obj3, Object obj4, int i9) {
        this.f20444a = i9;
        this.f20445b = obj;
        this.f20446c = obj2;
        this.d = obj3;
        this.f20447e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20444a) {
            case 0:
                ((FactCheckController) this.f20445b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f20446c, (ArrayList) this.d, (HashMap) this.f20447e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f20445b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f20446c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.f20447e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f20445b).lambda$didReceivedNotification$45((org.telegram.ui.ActionBar.y5) this.f20446c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.f20447e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f20445b).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.f20446c, (TLRPC.User) this.d, (TLRPC.Chat) this.f20447e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f20445b).lambda$startSecretChat$30((Context) this.f20446c, (org.telegram.ui.ActionBar.c2) this.d, (TLRPC.User) this.f20447e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f20445b).lambda$sendVote$32((MessageObject) this.f20446c, (String) this.d, (Runnable) this.f20447e, tLObject, tL_error);
                return;
        }
    }
}

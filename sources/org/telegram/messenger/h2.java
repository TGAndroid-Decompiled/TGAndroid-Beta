package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f20399a;
    public final Object f20400b;
    public final Object f20401c;
    public final Object d;
    public final Object f20402e;

    public h2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20399a = i10;
        this.f20400b = obj;
        this.f20401c = obj2;
        this.d = obj3;
        this.f20402e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20399a) {
            case 0:
                ((FactCheckController) this.f20400b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f20401c, (ArrayList) this.d, (HashMap) this.f20402e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f20400b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f20401c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.f20402e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f20400b).lambda$didReceivedNotification$45((org.telegram.ui.ActionBar.z5) this.f20401c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.f20402e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f20400b).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.f20401c, (TLRPC.User) this.d, (TLRPC.Chat) this.f20402e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f20400b).lambda$startSecretChat$30((Context) this.f20401c, (org.telegram.ui.ActionBar.c2) this.d, (TLRPC.User) this.f20402e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f20400b).lambda$sendVote$32((MessageObject) this.f20401c, (String) this.d, (Runnable) this.f20402e, tLObject, tL_error);
                return;
        }
    }
}

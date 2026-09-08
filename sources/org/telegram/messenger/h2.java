package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f17854a;
    public final Object f17855b;
    public final Object f17856c;
    public final Object d;
    public final Object f17857e;

    public h2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f17854a = i10;
        this.f17855b = obj;
        this.f17856c = obj2;
        this.d = obj3;
        this.f17857e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17854a) {
            case 0:
                ((FactCheckController) this.f17855b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f17856c, (ArrayList) this.d, (HashMap) this.f17857e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f17855b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f17856c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.f17857e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17855b).lambda$didReceivedNotification$45((org.telegram.ui.ActionBar.b6) this.f17856c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.f17857e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f17855b).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.f17856c, (TLRPC.User) this.d, (TLRPC.Chat) this.f17857e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f17855b).lambda$startSecretChat$30((Context) this.f17856c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.User) this.f17857e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f17855b).lambda$sendVote$32((MessageObject) this.f17856c, (String) this.d, (Runnable) this.f17857e, tLObject, tL_error);
                return;
        }
    }
}

package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f18043a;
    public final Object f18044b;
    public final Object f18045c;
    public final Object d;
    public final Object f18046e;

    public h2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18043a = i10;
        this.f18044b = obj;
        this.f18045c = obj2;
        this.d = obj3;
        this.f18046e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18043a) {
            case 0:
                ((FactCheckController) this.f18044b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f18045c, (ArrayList) this.d, (HashMap) this.f18046e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f18044b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f18045c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.f18046e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18044b).lambda$didReceivedNotification$44((org.telegram.ui.ActionBar.z5) this.f18045c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.f18046e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f18044b).lambda$deleteUserChannelHistory$132((TLRPC.Chat) this.f18045c, (TLRPC.User) this.d, (TLRPC.Chat) this.f18046e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f18044b).lambda$startSecretChat$30((Context) this.f18045c, (org.telegram.ui.ActionBar.a2) this.d, (TLRPC.User) this.f18046e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f18044b).lambda$sendVote$35((MessageObject) this.f18045c, (String) this.d, (Runnable) this.f18046e, tLObject, tL_error);
                return;
        }
    }
}

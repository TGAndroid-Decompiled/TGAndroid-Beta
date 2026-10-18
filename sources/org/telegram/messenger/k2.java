package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k2 implements RequestDelegate {
    public final int f18755a;
    public final Object f18756b;
    public final Object f18757c;
    public final Object d;
    public final Object e;

    public k2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18755a = i10;
        this.f18756b = obj;
        this.f18757c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18755a) {
            case 0:
                ((FactCheckController) this.f18756b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f18757c, (ArrayList) this.d, (HashMap) this.e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f18756b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f18757c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18756b).lambda$didReceivedNotification$44((org.telegram.ui.ActionBar.a6) this.f18757c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f18756b).lambda$deleteUserChannelHistory$132((TLRPC.Chat) this.f18757c, (TLRPC.User) this.d, (TLRPC.Chat) this.e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f18756b).lambda$startSecretChat$30((Context) this.f18757c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.User) this.e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f18756b).lambda$sendVote$35((MessageObject) this.f18757c, (String) this.d, (Runnable) this.e, tLObject, tL_error);
                return;
        }
    }
}

package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f18010a;
    public final Object f18011b;
    public final Object f18012c;
    public final Object d;
    public final Object f18013e;

    public h2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18010a = i10;
        this.f18011b = obj;
        this.f18012c = obj2;
        this.d = obj3;
        this.f18013e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18010a) {
            case 0:
                ((FactCheckController) this.f18011b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f18012c, (ArrayList) this.d, (HashMap) this.f18013e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f18011b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f18012c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.f18013e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18011b).lambda$didReceivedNotification$45((org.telegram.ui.ActionBar.a6) this.f18012c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.f18013e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f18011b).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.f18012c, (TLRPC.User) this.d, (TLRPC.Chat) this.f18013e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f18011b).lambda$startSecretChat$30((Context) this.f18012c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.User) this.f18013e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f18011b).lambda$sendVote$32((MessageObject) this.f18012c, (String) this.d, (Runnable) this.f18013e, tLObject, tL_error);
                return;
        }
    }
}

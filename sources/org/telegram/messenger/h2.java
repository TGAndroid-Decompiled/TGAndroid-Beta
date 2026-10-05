package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f18015a;
    public final Object f18016b;
    public final Object f18017c;
    public final Object d;
    public final Object f18018e;

    public h2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18015a = i10;
        this.f18016b = obj;
        this.f18017c = obj2;
        this.d = obj3;
        this.f18018e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18015a) {
            case 0:
                ((FactCheckController) this.f18016b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f18017c, (ArrayList) this.d, (HashMap) this.f18018e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f18016b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f18017c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.f18018e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18016b).lambda$didReceivedNotification$45((org.telegram.ui.ActionBar.a6) this.f18017c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.f18018e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f18016b).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.f18017c, (TLRPC.User) this.d, (TLRPC.Chat) this.f18018e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f18016b).lambda$startSecretChat$30((Context) this.f18017c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.User) this.f18018e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f18016b).lambda$sendVote$32((MessageObject) this.f18017c, (String) this.d, (Runnable) this.f18018e, tLObject, tL_error);
                return;
        }
    }
}

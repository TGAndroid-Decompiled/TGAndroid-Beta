package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f18009a;
    public final Object f18010b;
    public final Object f18011c;
    public final Object d;
    public final Object f18012e;

    public h2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18009a = i10;
        this.f18010b = obj;
        this.f18011c = obj2;
        this.d = obj3;
        this.f18012e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18009a) {
            case 0:
                ((FactCheckController) this.f18010b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f18011c, (ArrayList) this.d, (HashMap) this.f18012e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f18010b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f18011c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.f18012e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18010b).lambda$didReceivedNotification$44((org.telegram.ui.ActionBar.b6) this.f18011c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.f18012e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f18010b).lambda$deleteUserChannelHistory$132((TLRPC.Chat) this.f18011c, (TLRPC.User) this.d, (TLRPC.Chat) this.f18012e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f18010b).lambda$startSecretChat$30((Context) this.f18011c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.User) this.f18012e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f18010b).lambda$sendVote$35((MessageObject) this.f18011c, (String) this.d, (Runnable) this.f18012e, tLObject, tL_error);
                return;
        }
    }
}

package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l2 implements RequestDelegate {
    public final int f18853a;
    public final Object f18854b;
    public final Object f18855c;
    public final Object d;
    public final Object e;

    public l2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18853a = i10;
        this.f18854b = obj;
        this.f18855c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18853a) {
            case 0:
                ((FactCheckController) this.f18854b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f18855c, (ArrayList) this.d, (HashMap) this.e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f18854b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f18855c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18854b).lambda$didReceivedNotification$44((org.telegram.ui.ActionBar.a6) this.f18855c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f18854b).lambda$deleteUserChannelHistory$132((TLRPC.Chat) this.f18855c, (TLRPC.User) this.d, (TLRPC.Chat) this.e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f18854b).lambda$startSecretChat$30((Context) this.f18855c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.User) this.e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f18854b).lambda$sendVote$35((MessageObject) this.f18855c, (String) this.d, (Runnable) this.e, tLObject, tL_error);
                return;
        }
    }
}

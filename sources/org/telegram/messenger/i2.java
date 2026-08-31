package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i2 implements RequestDelegate {
    public final int f18913a;
    public final Object f18914b;
    public final Object f18915c;
    public final Object d;
    public final Object f18916e;

    public i2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f18913a = i10;
        this.f18914b = obj;
        this.f18915c = obj2;
        this.d = obj3;
        this.f18916e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18913a) {
            case 0:
                ((FactCheckController) this.f18914b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f18915c, (ArrayList) this.d, (HashMap) this.f18916e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f18914b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f18915c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.f18916e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18914b).lambda$didReceivedNotification$45((org.telegram.ui.ActionBar.d6) this.f18915c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.f18916e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f18914b).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.f18915c, (TLRPC.User) this.d, (TLRPC.Chat) this.f18916e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f18914b).lambda$startSecretChat$30((Context) this.f18915c, (org.telegram.ui.ActionBar.d2) this.d, (TLRPC.User) this.f18916e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f18914b).lambda$sendVote$32((MessageObject) this.f18915c, (String) this.d, (Runnable) this.f18916e, tLObject, tL_error);
                return;
        }
    }
}

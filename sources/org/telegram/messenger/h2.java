package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.LocationController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f16282a;
    public final Object f16283b;
    public final Object f16284c;
    public final Object d;
    public final Object e;

    public h2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f16282a = i10;
        this.f16283b = obj;
        this.f16284c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f16282a) {
            case 0:
                ((FactCheckController) this.f16283b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f16284c, (ArrayList) this.d, (HashMap) this.e, tLObject, tL_error);
                return;
            case 1:
                ((LocationController) this.f16283b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f16284c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f16283b).lambda$didReceivedNotification$45((org.telegram.ui.ActionBar.b6) this.f16284c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.e, tLObject, tL_error);
                return;
            case 3:
                ((MessagesController) this.f16283b).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.f16284c, (TLRPC.User) this.d, (TLRPC.Chat) this.e, tLObject, tL_error);
                return;
            case 4:
                ((SecretChatHelper) this.f16283b).lambda$startSecretChat$30((Context) this.f16284c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.User) this.e, tLObject, tL_error);
                return;
            default:
                ((SendMessagesHelper) this.f16283b).lambda$sendVote$32((MessageObject) this.f16284c, (String) this.d, (Runnable) this.e, tLObject, tL_error);
                return;
        }
    }
}

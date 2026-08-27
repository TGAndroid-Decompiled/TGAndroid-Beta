package org.telegram.messenger;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

public final class i2 implements RequestDelegate {

    public final int f20541a;

    public final Object f20542b;

    public final Object f20543c;
    public final Object d;

    public final Object f20544e;

    public i2(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f20541a = i10;
        this.f20542b = obj;
        this.f20543c = obj2;
        this.d = obj3;
        this.f20544e = obj4;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20541a) {
            case 0:
                ((FactCheckController) this.f20542b).lambda$loadMissing$2((TLRPC.TL_getFactCheck) this.f20543c, (ArrayList) this.d, (HashMap) this.f20544e, tLObject, tL_error);
                break;
            case 1:
                ((LocationController) this.f20542b).lambda$broadcastLastKnownLocation$7((LocationController.SharingLocationInfo) this.f20543c, (int[]) this.d, (TLRPC.TL_messages_editMessage) this.f20544e, tLObject, tL_error);
                break;
            case 2:
                ((MessagesController) this.f20542b).lambda$didReceivedNotification$45((org.telegram.ui.ActionBar.z5) this.f20543c, (TLRPC.TL_wallPaperSettings) this.d, (String) this.f20544e, tLObject, tL_error);
                break;
            case 3:
                ((MessagesController) this.f20542b).lambda$deleteUserChannelHistory$133((TLRPC.Chat) this.f20543c, (TLRPC.User) this.d, (TLRPC.Chat) this.f20544e, tLObject, tL_error);
                break;
            case 4:
                ((SecretChatHelper) this.f20542b).lambda$startSecretChat$30((Context) this.f20543c, (org.telegram.ui.ActionBar.b2) this.d, (TLRPC.User) this.f20544e, tLObject, tL_error);
                break;
            default:
                ((SendMessagesHelper) this.f20542b).lambda$sendVote$32((MessageObject) this.f20543c, (String) this.d, (Runnable) this.f20544e, tLObject, tL_error);
                break;
        }
    }
}

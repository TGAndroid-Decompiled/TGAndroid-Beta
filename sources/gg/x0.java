package gg;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x0 implements RequestDelegate {
    public final int f10847a = 0;
    public final boolean f10848b;
    public final NotificationCenter.NotificationCenterDelegate f10849c;
    public final Serializable d;
    public final Object f10850e;
    public final Serializable f10851f;
    public final Object f10852g;
    public final Object h;

    public x0(k1 k1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f10849c = k1Var;
        this.d = str;
        this.f10848b = z10;
        this.f10852g = user;
        this.f10850e = str2;
        this.h = messagesStorage;
        this.f10851f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10847a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y0((k1) this.f10849c, (String) this.d, this.f10848b, tLObject, (TLRPC.User) this.f10852g, (String) this.f10850e, (MessagesStorage) this.h, (String) this.f10851f));
                return;
            default:
                ((SendMessagesHelper) this.f10849c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.f10850e, (ArrayList) this.f10851f, (ArrayList) this.f10852g, (SendMessagesHelper.DelayedMessage) this.h, this.f10848b, tLObject, tL_error);
                return;
        }
    }

    public x0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f10849c = sendMessagesHelper;
        this.d = arrayList;
        this.f10850e = tLObject;
        this.f10851f = arrayList2;
        this.f10852g = arrayList3;
        this.h = delayedMessage;
        this.f10848b = z10;
    }
}

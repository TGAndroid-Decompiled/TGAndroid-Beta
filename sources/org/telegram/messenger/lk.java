package org.telegram.messenger;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lk implements RequestDelegate {
    public final int f20886a = 0;
    public final boolean f20887b;
    public final NotificationCenter.NotificationCenterDelegate f20888c;
    public final Serializable d;
    public final Object f20889e;
    public final Serializable f20890f;
    public final Object f20891g;
    public final Object h;

    public lk(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f20888c = sendMessagesHelper;
        this.d = arrayList;
        this.f20891g = tLObject;
        this.f20889e = arrayList2;
        this.f20890f = arrayList3;
        this.h = delayedMessage;
        this.f20887b = z10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20886a) {
            case 0:
                ((SendMessagesHelper) this.f20888c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.f20891g, (ArrayList) this.f20889e, (ArrayList) this.f20890f, (SendMessagesHelper.DelayedMessage) this.h, this.f20887b, tLObject, tL_error);
                return;
            default:
                AndroidUtilities.runOnUIThread(new s1((rf.v0) this.f20888c, (String) this.d, this.f20887b, tLObject, (TLRPC.User) this.f20889e, (String) this.f20890f, (MessagesStorage) this.f20891g, (String) this.h));
                return;
        }
    }

    public lk(rf.v0 v0Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f20888c = v0Var;
        this.d = str;
        this.f20887b = z10;
        this.f20889e = user;
        this.f20890f = str2;
        this.f20891g = messagesStorage;
        this.h = str3;
    }
}

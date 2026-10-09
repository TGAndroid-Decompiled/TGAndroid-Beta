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
public final class w0 implements RequestDelegate {
    public final int f10846a = 0;
    public final boolean f10847b;
    public final NotificationCenter.NotificationCenterDelegate f10848c;
    public final Serializable d;
    public final Object f10849e;
    public final Serializable f10850f;
    public final Object f10851g;
    public final Object h;

    public w0(j1 j1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f10848c = j1Var;
        this.d = str;
        this.f10847b = z10;
        this.f10851g = user;
        this.f10849e = str2;
        this.h = messagesStorage;
        this.f10850f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10846a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x0((j1) this.f10848c, (String) this.d, this.f10847b, tLObject, (TLRPC.User) this.f10851g, (String) this.f10849e, (MessagesStorage) this.h, (String) this.f10850f));
                return;
            default:
                ((SendMessagesHelper) this.f10848c).lambda$performSendMessageRequestMulti$77((ArrayList) this.d, (TLObject) this.f10849e, (ArrayList) this.f10850f, (ArrayList) this.f10851g, (SendMessagesHelper.DelayedMessage) this.h, this.f10847b, tLObject, tL_error);
                return;
        }
    }

    public w0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f10848c = sendMessagesHelper;
        this.d = arrayList;
        this.f10849e = tLObject;
        this.f10850f = arrayList2;
        this.f10851g = arrayList3;
        this.h = delayedMessage;
        this.f10847b = z10;
    }
}

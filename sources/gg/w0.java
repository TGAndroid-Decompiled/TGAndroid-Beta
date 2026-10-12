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
    public final int f10844a = 0;
    public final boolean f10845b;
    public final NotificationCenter.NotificationCenterDelegate f10846c;
    public final Serializable d;
    public final Object f10847e;
    public final Serializable f10848f;
    public final Object f10849g;
    public final Object h;

    public w0(j1 j1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f10846c = j1Var;
        this.d = str;
        this.f10845b = z10;
        this.f10849g = user;
        this.f10847e = str2;
        this.h = messagesStorage;
        this.f10848f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10844a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x0((j1) this.f10846c, (String) this.d, this.f10845b, tLObject, (TLRPC.User) this.f10849g, (String) this.f10847e, (MessagesStorage) this.h, (String) this.f10848f));
                return;
            default:
                ((SendMessagesHelper) this.f10846c).lambda$performSendMessageRequestMulti$77((ArrayList) this.d, (TLObject) this.f10847e, (ArrayList) this.f10848f, (ArrayList) this.f10849g, (SendMessagesHelper.DelayedMessage) this.h, this.f10845b, tLObject, tL_error);
                return;
        }
    }

    public w0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f10846c = sendMessagesHelper;
        this.d = arrayList;
        this.f10847e = tLObject;
        this.f10848f = arrayList2;
        this.f10849g = arrayList3;
        this.h = delayedMessage;
        this.f10845b = z10;
    }
}

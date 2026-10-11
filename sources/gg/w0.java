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
    public final int f10845a = 0;
    public final boolean f10846b;
    public final NotificationCenter.NotificationCenterDelegate f10847c;
    public final Serializable d;
    public final Object f10848e;
    public final Serializable f10849f;
    public final Object f10850g;
    public final Object h;

    public w0(j1 j1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f10847c = j1Var;
        this.d = str;
        this.f10846b = z10;
        this.f10850g = user;
        this.f10848e = str2;
        this.h = messagesStorage;
        this.f10849f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10845a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x0((j1) this.f10847c, (String) this.d, this.f10846b, tLObject, (TLRPC.User) this.f10850g, (String) this.f10848e, (MessagesStorage) this.h, (String) this.f10849f));
                return;
            default:
                ((SendMessagesHelper) this.f10847c).lambda$performSendMessageRequestMulti$77((ArrayList) this.d, (TLObject) this.f10848e, (ArrayList) this.f10849f, (ArrayList) this.f10850g, (SendMessagesHelper.DelayedMessage) this.h, this.f10846b, tLObject, tL_error);
                return;
        }
    }

    public w0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f10847c = sendMessagesHelper;
        this.d = arrayList;
        this.f10848e = tLObject;
        this.f10849f = arrayList2;
        this.f10850g = arrayList3;
        this.h = delayedMessage;
        this.f10846b = z10;
    }
}

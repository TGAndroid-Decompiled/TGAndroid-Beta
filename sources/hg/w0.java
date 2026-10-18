package hg;

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
    public final int f12087a = 0;
    public final boolean f12088b;
    public final NotificationCenter.NotificationCenterDelegate f12089c;
    public final Serializable d;
    public final Object e;
    public final Serializable f12090f;
    public final Object f12091g;
    public final Object h;

    public w0(j1 j1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f12089c = j1Var;
        this.d = str;
        this.f12088b = z10;
        this.f12091g = user;
        this.e = str2;
        this.h = messagesStorage;
        this.f12090f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12087a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x0((j1) this.f12089c, (String) this.d, this.f12088b, tLObject, (TLRPC.User) this.f12091g, (String) this.e, (MessagesStorage) this.h, (String) this.f12090f));
                return;
            default:
                ((SendMessagesHelper) this.f12089c).lambda$performSendMessageRequestMulti$77((ArrayList) this.d, (TLObject) this.e, (ArrayList) this.f12090f, (ArrayList) this.f12091g, (SendMessagesHelper.DelayedMessage) this.h, this.f12088b, tLObject, tL_error);
                return;
        }
    }

    public w0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f12089c = sendMessagesHelper;
        this.d = arrayList;
        this.e = tLObject;
        this.f12090f = arrayList2;
        this.f12091g = arrayList3;
        this.h = delayedMessage;
        this.f12088b = z10;
    }
}

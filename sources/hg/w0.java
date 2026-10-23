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
    public final int f12114a = 0;
    public final boolean f12115b;
    public final NotificationCenter.NotificationCenterDelegate f12116c;
    public final Serializable d;
    public final Object e;
    public final Serializable f12117f;
    public final Object f12118g;
    public final Object h;

    public w0(j1 j1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f12116c = j1Var;
        this.d = str;
        this.f12115b = z10;
        this.f12118g = user;
        this.e = str2;
        this.h = messagesStorage;
        this.f12117f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12114a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x0((j1) this.f12116c, (String) this.d, this.f12115b, tLObject, (TLRPC.User) this.f12118g, (String) this.e, (MessagesStorage) this.h, (String) this.f12117f));
                return;
            default:
                ((SendMessagesHelper) this.f12116c).lambda$performSendMessageRequestMulti$77((ArrayList) this.d, (TLObject) this.e, (ArrayList) this.f12117f, (ArrayList) this.f12118g, (SendMessagesHelper.DelayedMessage) this.h, this.f12115b, tLObject, tL_error);
                return;
        }
    }

    public w0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f12116c = sendMessagesHelper;
        this.d = arrayList;
        this.e = tLObject;
        this.f12117f = arrayList2;
        this.f12118g = arrayList3;
        this.h = delayedMessage;
        this.f12115b = z10;
    }
}

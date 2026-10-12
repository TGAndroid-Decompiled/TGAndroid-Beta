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
    public final int f10776a = 0;
    public final boolean f10777b;
    public final NotificationCenter.NotificationCenterDelegate f10778c;
    public final Serializable d;
    public final Object e;
    public final Serializable f10779f;
    public final Object f10780g;
    public final Object h;

    public w0(j1 j1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f10778c = j1Var;
        this.d = str;
        this.f10777b = z10;
        this.f10780g = user;
        this.e = str2;
        this.h = messagesStorage;
        this.f10779f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10776a) {
            case 0:
                AndroidUtilities.runOnUIThread(new x0((j1) this.f10778c, (String) this.d, this.f10777b, tLObject, (TLRPC.User) this.f10780g, (String) this.e, (MessagesStorage) this.h, (String) this.f10779f));
                return;
            default:
                ((SendMessagesHelper) this.f10778c).lambda$performSendMessageRequestMulti$77((ArrayList) this.d, (TLObject) this.e, (ArrayList) this.f10779f, (ArrayList) this.f10780g, (SendMessagesHelper.DelayedMessage) this.h, this.f10777b, tLObject, tL_error);
                return;
        }
    }

    public w0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f10778c = sendMessagesHelper;
        this.d = arrayList;
        this.e = tLObject;
        this.f10779f = arrayList2;
        this.f10780g = arrayList3;
        this.h = delayedMessage;
        this.f10777b = z10;
    }
}

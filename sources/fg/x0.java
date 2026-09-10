package fg;

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
    public final int f8254a = 0;
    public final boolean f8255b;
    public final NotificationCenter.NotificationCenterDelegate f8256c;
    public final Serializable d;
    public final Object e;
    public final Serializable f8257f;
    public final Object f8258g;
    public final Object h;

    public x0(l1 l1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f8256c = l1Var;
        this.d = str;
        this.f8255b = z10;
        this.f8258g = user;
        this.e = str2;
        this.h = messagesStorage;
        this.f8257f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8254a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y0((l1) this.f8256c, (String) this.d, this.f8255b, tLObject, (TLRPC.User) this.f8258g, (String) this.e, (MessagesStorage) this.h, (String) this.f8257f));
                return;
            default:
                ((SendMessagesHelper) this.f8256c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.e, (ArrayList) this.f8257f, (ArrayList) this.f8258g, (SendMessagesHelper.DelayedMessage) this.h, this.f8255b, tLObject, tL_error);
                return;
        }
    }

    public x0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f8256c = sendMessagesHelper;
        this.d = arrayList;
        this.e = tLObject;
        this.f8257f = arrayList2;
        this.f8258g = arrayList3;
        this.h = delayedMessage;
        this.f8255b = z10;
    }
}

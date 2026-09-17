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
public final class x0 implements RequestDelegate {
    public final int f11305a = 0;
    public final boolean f11306b;
    public final NotificationCenter.NotificationCenterDelegate f11307c;
    public final Serializable d;
    public final Object f11308e;
    public final Serializable f11309f;
    public final Object f11310g;
    public final Object h;

    public x0(k1 k1Var, String str, boolean z10, TLRPC.User user, String str2, MessagesStorage messagesStorage, String str3) {
        this.f11307c = k1Var;
        this.d = str;
        this.f11306b = z10;
        this.f11310g = user;
        this.f11308e = str2;
        this.h = messagesStorage;
        this.f11309f = str3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11305a) {
            case 0:
                AndroidUtilities.runOnUIThread(new y0((k1) this.f11307c, (String) this.d, this.f11306b, tLObject, (TLRPC.User) this.f11310g, (String) this.f11308e, (MessagesStorage) this.h, (String) this.f11309f));
                return;
            default:
                ((SendMessagesHelper) this.f11307c).lambda$performSendMessageRequestMulti$74((ArrayList) this.d, (TLObject) this.f11308e, (ArrayList) this.f11309f, (ArrayList) this.f11310g, (SendMessagesHelper.DelayedMessage) this.h, this.f11306b, tLObject, tL_error);
                return;
        }
    }

    public x0(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SendMessagesHelper.DelayedMessage delayedMessage, SendMessagesHelper sendMessagesHelper, TLObject tLObject, boolean z10) {
        this.f11307c = sendMessagesHelper;
        this.d = arrayList;
        this.f11308e = tLObject;
        this.f11309f = arrayList2;
        this.f11310g = arrayList3;
        this.h = delayedMessage;
        this.f11306b = z10;
    }
}

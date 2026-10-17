package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class la implements RequestDelegate {
    public final int f18859a;
    public final BaseController f18860b;
    public final long f18861c;
    public final Object d;
    public final Object e;

    public la(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.f18859a = i10;
        this.f18860b = messagesController;
        this.f18861c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18859a) {
            case 0:
                ((MessagesController) this.f18860b).lambda$getSavedReactionTags$489(this.f18861c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18860b).lambda$deleteSavedDialog$142(this.f18861c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18860b).lambda$addUsersToChannel$273((org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.f18861c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.f18860b).lambda$pinTopic$20((org.telegram.ui.ActionBar.n2) this.d, this.f18861c, (ArrayList) this.e, tLObject, tL_error);
                return;
        }
    }

    public la(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel, long j10) {
        this.f18859a = 2;
        this.f18860b = messagesController;
        this.d = n2Var;
        this.e = tL_channels_inviteToChannel;
        this.f18861c = j10;
    }

    public la(TopicsController topicsController, org.telegram.ui.ActionBar.n2 n2Var, long j10, ArrayList arrayList) {
        this.f18859a = 3;
        this.f18860b = topicsController;
        this.d = n2Var;
        this.f18861c = j10;
        this.e = arrayList;
    }
}

package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class la implements RequestDelegate {
    public final int f18860a;
    public final BaseController f18861b;
    public final long f18862c;
    public final Object d;
    public final Object e;

    public la(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.f18860a = i10;
        this.f18861b = messagesController;
        this.f18862c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18860a) {
            case 0:
                ((MessagesController) this.f18861b).lambda$getSavedReactionTags$489(this.f18862c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18861b).lambda$deleteSavedDialog$142(this.f18862c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18861b).lambda$addUsersToChannel$273((org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.f18862c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.f18861b).lambda$pinTopic$20((org.telegram.ui.ActionBar.n2) this.d, this.f18862c, (ArrayList) this.e, tLObject, tL_error);
                return;
        }
    }

    public la(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel, long j10) {
        this.f18860a = 2;
        this.f18861b = messagesController;
        this.d = n2Var;
        this.e = tL_channels_inviteToChannel;
        this.f18862c = j10;
    }

    public la(TopicsController topicsController, org.telegram.ui.ActionBar.n2 n2Var, long j10, ArrayList arrayList) {
        this.f18860a = 3;
        this.f18861b = topicsController;
        this.d = n2Var;
        this.f18862c = j10;
        this.e = arrayList;
    }
}

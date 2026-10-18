package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ma implements RequestDelegate {
    public final int f18935a;
    public final BaseController f18936b;
    public final long f18937c;
    public final Object d;
    public final Object e;

    public ma(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.f18935a = i10;
        this.f18936b = messagesController;
        this.f18937c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18935a) {
            case 0:
                ((MessagesController) this.f18936b).lambda$getSavedReactionTags$489(this.f18937c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18936b).lambda$deleteSavedDialog$142(this.f18937c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18936b).lambda$addUsersToChannel$273((org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.f18937c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.f18936b).lambda$pinTopic$20((org.telegram.ui.ActionBar.n2) this.d, this.f18937c, (ArrayList) this.e, tLObject, tL_error);
                return;
        }
    }

    public ma(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel, long j10) {
        this.f18935a = 2;
        this.f18936b = messagesController;
        this.d = n2Var;
        this.e = tL_channels_inviteToChannel;
        this.f18937c = j10;
    }

    public ma(TopicsController topicsController, org.telegram.ui.ActionBar.n2 n2Var, long j10, ArrayList arrayList) {
        this.f18935a = 3;
        this.f18936b = topicsController;
        this.d = n2Var;
        this.f18937c = j10;
        this.e = arrayList;
    }
}

package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pa implements RequestDelegate {
    public final int f17791a;
    public final BaseController f17792b;
    public final long f17793c;
    public final Object d;
    public final Object e;

    public pa(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.f17791a = i10;
        this.f17792b = messagesController;
        this.f17793c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f17791a) {
            case 0:
                ((MessagesController) this.f17792b).lambda$getSavedReactionTags$489(this.f17793c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f17792b).lambda$deleteSavedDialog$142(this.f17793c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f17792b).lambda$addUsersToChannel$273((org.telegram.ui.ActionBar.m2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.f17793c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.f17792b).lambda$pinTopic$20((org.telegram.ui.ActionBar.m2) this.d, this.f17793c, (ArrayList) this.e, tLObject, tL_error);
                return;
        }
    }

    public pa(MessagesController messagesController, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel, long j10) {
        this.f17791a = 2;
        this.f17792b = messagesController;
        this.d = m2Var;
        this.e = tL_channels_inviteToChannel;
        this.f17793c = j10;
    }

    public pa(TopicsController topicsController, org.telegram.ui.ActionBar.m2 m2Var, long j10, ArrayList arrayList) {
        this.f17791a = 3;
        this.f17792b = topicsController;
        this.d = m2Var;
        this.f17793c = j10;
        this.e = arrayList;
    }
}

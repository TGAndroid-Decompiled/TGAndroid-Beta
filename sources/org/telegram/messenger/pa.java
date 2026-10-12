package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pa implements RequestDelegate {
    public final int f18557a;
    public final BaseController f18558b;
    public final long f18559c;
    public final Object d;
    public final Object f18560e;

    public pa(MessagesController messagesController, long j3, Object obj, TLObject tLObject, int i10) {
        this.f18557a = i10;
        this.f18558b = messagesController;
        this.f18559c = j3;
        this.d = obj;
        this.f18560e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18557a) {
            case 0:
                ((MessagesController) this.f18558b).lambda$getSavedReactionTags$489(this.f18559c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.f18560e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18558b).lambda$deleteSavedDialog$142(this.f18559c, (int[]) this.d, (TLRPC.InputPeer) this.f18560e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18558b).lambda$addUsersToChannel$273((org.telegram.ui.ActionBar.m2) this.d, (TLRPC.TL_channels_inviteToChannel) this.f18560e, this.f18559c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.f18558b).lambda$pinTopic$20((org.telegram.ui.ActionBar.m2) this.d, this.f18559c, (ArrayList) this.f18560e, tLObject, tL_error);
                return;
        }
    }

    public pa(MessagesController messagesController, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel, long j3) {
        this.f18557a = 2;
        this.f18558b = messagesController;
        this.d = m2Var;
        this.f18560e = tL_channels_inviteToChannel;
        this.f18559c = j3;
    }

    public pa(TopicsController topicsController, org.telegram.ui.ActionBar.m2 m2Var, long j3, ArrayList arrayList) {
        this.f18557a = 3;
        this.f18558b = topicsController;
        this.d = m2Var;
        this.f18559c = j3;
        this.f18560e = arrayList;
    }
}

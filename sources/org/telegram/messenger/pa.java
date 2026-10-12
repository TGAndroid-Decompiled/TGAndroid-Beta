package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pa implements RequestDelegate {
    public final int f18091a;
    public final BaseController f18092b;
    public final long f18093c;
    public final Object d;
    public final Object e;

    public pa(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.f18091a = i10;
        this.f18092b = messagesController;
        this.f18093c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f18091a) {
            case 0:
                ((MessagesController) this.f18092b).lambda$getSavedReactionTags$489(this.f18093c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f18092b).lambda$deleteSavedDialog$142(this.f18093c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f18092b).lambda$addUsersToChannel$273((org.telegram.ui.ActionBar.m2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.f18093c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.f18092b).lambda$pinTopic$20((org.telegram.ui.ActionBar.m2) this.d, this.f18093c, (ArrayList) this.e, tLObject, tL_error);
                return;
        }
    }

    public pa(MessagesController messagesController, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel, long j10) {
        this.f18091a = 2;
        this.f18092b = messagesController;
        this.d = m2Var;
        this.e = tL_channels_inviteToChannel;
        this.f18093c = j10;
    }

    public pa(TopicsController topicsController, org.telegram.ui.ActionBar.m2 m2Var, long j10, ArrayList arrayList) {
        this.f18091a = 3;
        this.f18092b = topicsController;
        this.d = m2Var;
        this.f18093c = j10;
        this.e = arrayList;
    }
}

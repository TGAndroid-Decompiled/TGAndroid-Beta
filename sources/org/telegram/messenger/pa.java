package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pa implements RequestDelegate {
    public final int f19273a;
    public final BaseController f19274b;
    public final long f19275c;
    public final Object d;
    public final Object e;

    public pa(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.f19273a = i10;
        this.f19274b = messagesController;
        this.f19275c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19273a) {
            case 0:
                ((MessagesController) this.f19274b).lambda$getSavedReactionTags$489(this.f19275c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19274b).lambda$deleteSavedDialog$142(this.f19275c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f19274b).lambda$addUsersToChannel$273((org.telegram.ui.ActionBar.o2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.f19275c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.f19274b).lambda$pinTopic$20((org.telegram.ui.ActionBar.o2) this.d, this.f19275c, (ArrayList) this.e, tLObject, tL_error);
                return;
        }
    }

    public pa(MessagesController messagesController, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel, long j10) {
        this.f19273a = 2;
        this.f19274b = messagesController;
        this.d = o2Var;
        this.e = tL_channels_inviteToChannel;
        this.f19275c = j10;
    }

    public pa(TopicsController topicsController, org.telegram.ui.ActionBar.o2 o2Var, long j10, ArrayList arrayList) {
        this.f19273a = 3;
        this.f19274b = topicsController;
        this.d = o2Var;
        this.f19275c = j10;
        this.e = arrayList;
    }
}

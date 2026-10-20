package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class na implements RequestDelegate {
    public final int f19032a;
    public final BaseController f19033b;
    public final long f19034c;
    public final Object d;
    public final Object e;

    public na(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.f19032a = i10;
        this.f19033b = messagesController;
        this.f19034c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19032a) {
            case 0:
                ((MessagesController) this.f19033b).lambda$getSavedReactionTags$489(this.f19034c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19033b).lambda$deleteSavedDialog$142(this.f19034c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f19033b).lambda$addUsersToChannel$273((org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.f19034c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.f19033b).lambda$pinTopic$20((org.telegram.ui.ActionBar.n2) this.d, this.f19034c, (ArrayList) this.e, tLObject, tL_error);
                return;
        }
    }

    public na(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel, long j10) {
        this.f19032a = 2;
        this.f19033b = messagesController;
        this.d = n2Var;
        this.e = tL_channels_inviteToChannel;
        this.f19034c = j10;
    }

    public na(TopicsController topicsController, org.telegram.ui.ActionBar.n2 n2Var, long j10, ArrayList arrayList) {
        this.f19032a = 3;
        this.f19033b = topicsController;
        this.d = n2Var;
        this.f19034c = j10;
        this.e = arrayList;
    }
}

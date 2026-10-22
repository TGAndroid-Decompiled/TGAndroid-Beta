package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qa implements RequestDelegate {
    public final int f19281a;
    public final BaseController f19282b;
    public final long f19283c;
    public final Object d;
    public final Object e;

    public qa(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.f19281a = i10;
        this.f19282b = messagesController;
        this.f19283c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f19281a) {
            case 0:
                ((MessagesController) this.f19282b).lambda$getSavedReactionTags$489(this.f19283c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f19282b).lambda$deleteSavedDialog$142(this.f19283c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f19282b).lambda$addUsersToChannel$273((org.telegram.ui.ActionBar.n2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.f19283c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.f19282b).lambda$pinTopic$20((org.telegram.ui.ActionBar.n2) this.d, this.f19283c, (ArrayList) this.e, tLObject, tL_error);
                return;
        }
    }

    public qa(MessagesController messagesController, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel, long j10) {
        this.f19281a = 2;
        this.f19282b = messagesController;
        this.d = n2Var;
        this.e = tL_channels_inviteToChannel;
        this.f19283c = j10;
    }

    public qa(TopicsController topicsController, org.telegram.ui.ActionBar.n2 n2Var, long j10, ArrayList arrayList) {
        this.f19281a = 3;
        this.f19282b = topicsController;
        this.d = n2Var;
        this.f19283c = j10;
        this.e = arrayList;
    }
}

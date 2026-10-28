package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class md implements RequestDelegate {
    public final int f20684a;
    public final BaseController f20685b;
    public final long f20686c;
    public final Object d;
    public final Object e;

    public md(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.f20684a = i10;
        this.f20685b = messagesController;
        this.f20686c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f20684a) {
            case 0:
                ((MessagesController) this.f20685b).lambda$deleteSavedDialog$142(this.f20686c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f20685b).lambda$getSavedReactionTags$492(this.f20686c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f20685b).lambda$addUsersToChannel$273((org.telegram.ui.ActionBar.r2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.f20686c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.f20685b).lambda$pinTopic$20((org.telegram.ui.ActionBar.r2) this.d, this.f20686c, (ArrayList) this.e, tLObject, tL_error);
                return;
        }
    }

    public md(MessagesController messagesController, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel, long j10) {
        this.f20684a = 2;
        this.f20685b = messagesController;
        this.d = r2Var;
        this.e = tL_channels_inviteToChannel;
        this.f20686c = j10;
    }

    public md(TopicsController topicsController, org.telegram.ui.ActionBar.r2 r2Var, long j10, ArrayList arrayList) {
        this.f20684a = 3;
        this.f20685b = topicsController;
        this.d = r2Var;
        this.f20686c = j10;
        this.e = arrayList;
    }
}

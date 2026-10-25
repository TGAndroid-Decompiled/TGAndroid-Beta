package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wb implements RequestDelegate {
    public final int f21748a;
    public final BaseController f21749b;
    public final long f21750c;
    public final Object d;
    public final Object e;

    public wb(MessagesController messagesController, long j10, Object obj, TLObject tLObject, int i10) {
        this.f21748a = i10;
        this.f21749b = messagesController;
        this.f21750c = j10;
        this.d = obj;
        this.e = tLObject;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f21748a) {
            case 0:
                ((MessagesController) this.f21749b).lambda$getSavedReactionTags$491(this.f21750c, (TLRPC.messages_SavedReactionTags) this.d, (TLRPC.TL_messages_getSavedReactionTags) this.e, tLObject, tL_error);
                return;
            case 1:
                ((MessagesController) this.f21749b).lambda$deleteSavedDialog$142(this.f21750c, (int[]) this.d, (TLRPC.InputPeer) this.e, tLObject, tL_error);
                return;
            case 2:
                ((MessagesController) this.f21749b).lambda$addUsersToChannel$273((org.telegram.ui.ActionBar.r2) this.d, (TLRPC.TL_channels_inviteToChannel) this.e, this.f21750c, tLObject, tL_error);
                return;
            default:
                ((TopicsController) this.f21749b).lambda$pinTopic$20((org.telegram.ui.ActionBar.r2) this.d, this.f21750c, (ArrayList) this.e, tLObject, tL_error);
                return;
        }
    }

    public wb(MessagesController messagesController, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_channels_inviteToChannel tL_channels_inviteToChannel, long j10) {
        this.f21748a = 2;
        this.f21749b = messagesController;
        this.d = r2Var;
        this.e = tL_channels_inviteToChannel;
        this.f21750c = j10;
    }

    public wb(TopicsController topicsController, org.telegram.ui.ActionBar.r2 r2Var, long j10, ArrayList arrayList) {
        this.f21748a = 3;
        this.f21749b = topicsController;
        this.d = r2Var;
        this.f21750c = j10;
        this.e = arrayList;
    }
}

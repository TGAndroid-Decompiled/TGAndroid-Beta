package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Cells.ProfileChannelCell;
import org.telegram.ui.MessageSeenView$$ExternalSyntheticLambda1;

public final class MessagesController$$ExternalSyntheticLambda417 implements RequestDelegate {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final long f$1;
    public final Object f$2;
    public final Object f$3;
    public final int f$4;

    public MessagesController$$ExternalSyntheticLambda417(MessagesController messagesController, long j, Utilities.Callback callback, TLRPC.User user, int i) {
        this.f$0 = messagesController;
        this.f$1 = j;
        this.f$2 = callback;
        this.f$3 = user;
        this.f$4 = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((MessagesController) this.f$0).lambda$loadFullUser$72(this.f$1, (Utilities.Callback) this.f$2, (TLRPC.User) this.f$3, this.f$4, tLObject, tL_error);
                break;
            default:
                ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher = (ProfileChannelCell.ChannelMessageFetcher) this.f$0;
                channelMessageFetcher.getClass();
                AndroidUtilities.runOnUIThread(new MessageSeenView$$ExternalSyntheticLambda1(channelMessageFetcher, tLObject, (MessagesStorage) this.f$2, this.f$1, this.f$4, (ArrayList) this.f$3));
                break;
        }
    }

    public MessagesController$$ExternalSyntheticLambda417(ProfileChannelCell.ChannelMessageFetcher channelMessageFetcher, MessagesStorage messagesStorage, long j, int i, ArrayList arrayList) {
        this.f$0 = channelMessageFetcher;
        this.f$2 = messagesStorage;
        this.f$1 = j;
        this.f$4 = i;
        this.f$3 = arrayList;
    }
}

package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class cb implements Comparator {
    public final int f19815a;
    public final MessagesController f19816b;

    public cb(MessagesController messagesController, int i10) {
        this.f19815a = i10;
        this.f19816b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processUpdatesQueue$328;
        int lambda$renameSavedReactionTag$490;
        int lambda$updateSavedReactionTags$489;
        int lambda$new$9;
        int lambda$new$10;
        int lambda$new$11;
        int lambda$new$12;
        switch (this.f19815a) {
            case 0:
                lambda$processUpdatesQueue$328 = this.f19816b.lambda$processUpdatesQueue$328((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
                return lambda$processUpdatesQueue$328;
            case 1:
                lambda$renameSavedReactionTag$490 = this.f19816b.lambda$renameSavedReactionTag$490((TLRPC.TL_savedReactionTag) obj, (TLRPC.TL_savedReactionTag) obj2);
                return lambda$renameSavedReactionTag$490;
            case 2:
                lambda$updateSavedReactionTags$489 = this.f19816b.lambda$updateSavedReactionTags$489((TLRPC.TL_savedReactionTag) obj, (TLRPC.TL_savedReactionTag) obj2);
                return lambda$updateSavedReactionTags$489;
            case 3:
                lambda$new$9 = this.f19816b.lambda$new$9((TLRPC.Dialog) obj, (TLRPC.Dialog) obj2);
                return lambda$new$9;
            case 4:
                lambda$new$10 = this.f19816b.lambda$new$10((TLRPC.Dialog) obj, (TLRPC.Dialog) obj2);
                return lambda$new$10;
            case 5:
                lambda$new$11 = this.f19816b.lambda$new$11((MessagesController.CommunityPeerDialog) obj, (MessagesController.CommunityPeerDialog) obj2);
                return lambda$new$11;
            default:
                lambda$new$12 = this.f19816b.lambda$new$12((TLRPC.Update) obj, (TLRPC.Update) obj2);
                return lambda$new$12;
        }
    }
}

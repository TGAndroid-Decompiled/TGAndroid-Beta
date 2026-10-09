package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.TLRPC;
public final class sa implements Comparator {
    public final int f19130a;
    public final MessagesController f19131b;

    public sa(MessagesController messagesController, int i10) {
        this.f19130a = i10;
        this.f19131b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processUpdatesQueue$326;
        int lambda$renameSavedReactionTag$487;
        int lambda$updateSavedReactionTags$486;
        int lambda$new$9;
        int lambda$new$10;
        int lambda$new$11;
        int lambda$new$12;
        switch (this.f19130a) {
            case 0:
                lambda$processUpdatesQueue$326 = this.f19131b.lambda$processUpdatesQueue$326((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
                return lambda$processUpdatesQueue$326;
            case 1:
                lambda$renameSavedReactionTag$487 = this.f19131b.lambda$renameSavedReactionTag$487((TLRPC.TL_savedReactionTag) obj, (TLRPC.TL_savedReactionTag) obj2);
                return lambda$renameSavedReactionTag$487;
            case 2:
                lambda$updateSavedReactionTags$486 = this.f19131b.lambda$updateSavedReactionTags$486((TLRPC.TL_savedReactionTag) obj, (TLRPC.TL_savedReactionTag) obj2);
                return lambda$updateSavedReactionTags$486;
            case 3:
                lambda$new$9 = this.f19131b.lambda$new$9((TLRPC.Dialog) obj, (TLRPC.Dialog) obj2);
                return lambda$new$9;
            case 4:
                lambda$new$10 = this.f19131b.lambda$new$10((TLRPC.Dialog) obj, (TLRPC.Dialog) obj2);
                return lambda$new$10;
            case 5:
                lambda$new$11 = this.f19131b.lambda$new$11((MessagesController.CommunityPeerDialog) obj, (MessagesController.CommunityPeerDialog) obj2);
                return lambda$new$11;
            default:
                lambda$new$12 = this.f19131b.lambda$new$12((TLRPC.Update) obj, (TLRPC.Update) obj2);
                return lambda$new$12;
        }
    }
}

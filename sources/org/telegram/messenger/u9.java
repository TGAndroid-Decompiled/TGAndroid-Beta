package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

public final class u9 implements Comparator {

    public final int f21708a;

    public final MessagesController f21709b;

    public u9(MessagesController messagesController, int i10) {
        this.f21708a = i10;
        this.f21709b = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.f21708a) {
            case 0:
                return this.f21709b.lambda$new$9((TLRPC.Dialog) obj, (TLRPC.Dialog) obj2);
            case 1:
                return this.f21709b.lambda$new$10((TLRPC.Dialog) obj, (TLRPC.Dialog) obj2);
            case 2:
                return this.f21709b.lambda$new$11((MessagesController.CommunityPeerDialog) obj, (MessagesController.CommunityPeerDialog) obj2);
            case 3:
                return this.f21709b.lambda$new$12((TLRPC.Update) obj, (TLRPC.Update) obj2);
            case 4:
                return this.f21709b.lambda$processUpdatesQueue$327((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
            case 5:
                return this.f21709b.lambda$renameSavedReactionTag$484((TLRPC.TL_savedReactionTag) obj, (TLRPC.TL_savedReactionTag) obj2);
            default:
                return this.f21709b.lambda$updateSavedReactionTags$483((TLRPC.TL_savedReactionTag) obj, (TLRPC.TL_savedReactionTag) obj2);
        }
    }
}

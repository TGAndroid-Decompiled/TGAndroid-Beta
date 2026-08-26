package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC;

public final class MessagesController$$ExternalSyntheticLambda103 implements Comparator {
    public final int $r8$classId;
    public final MessagesController f$0;

    public MessagesController$$ExternalSyntheticLambda103(MessagesController messagesController, int i) {
        this.$r8$classId = i;
        this.f$0 = messagesController;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return this.f$0.lambda$new$9((TLRPC.Dialog) obj, (TLRPC.Dialog) obj2);
            case 1:
                return this.f$0.lambda$new$10((TLRPC.Dialog) obj, (TLRPC.Dialog) obj2);
            case 2:
                return this.f$0.lambda$new$11((MessagesController.CommunityPeerDialog) obj, (MessagesController.CommunityPeerDialog) obj2);
            case 3:
                return this.f$0.lambda$new$12((TLRPC.Update) obj, (TLRPC.Update) obj2);
            case 4:
                return this.f$0.lambda$processUpdatesQueue$327((TLRPC.Updates) obj, (TLRPC.Updates) obj2);
            case 5:
                return this.f$0.lambda$renameSavedReactionTag$484((TLRPC.TL_savedReactionTag) obj, (TLRPC.TL_savedReactionTag) obj2);
            default:
                return this.f$0.lambda$updateSavedReactionTags$483((TLRPC.TL_savedReactionTag) obj, (TLRPC.TL_savedReactionTag) obj2);
        }
    }
}

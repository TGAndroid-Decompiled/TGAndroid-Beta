package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.ChatObject;
import org.telegram.tgnet.TLRPC$TL_updateGroupCallParticipants;

public final class ChatObject$Call$$ExternalSyntheticLambda8 implements Comparator {
    public static final ChatObject$Call$$ExternalSyntheticLambda8 INSTANCE = new ChatObject$Call$$ExternalSyntheticLambda8();

    private ChatObject$Call$$ExternalSyntheticLambda8() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$processUpdatesQueue$7;
        lambda$processUpdatesQueue$7 = ChatObject.Call.lambda$processUpdatesQueue$7((TLRPC$TL_updateGroupCallParticipants) obj, (TLRPC$TL_updateGroupCallParticipants) obj2);
        return lambda$processUpdatesQueue$7;
    }
}

package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$MessageEntity;

public final class MessageObject$$ExternalSyntheticLambda2 implements Comparator {
    public static final MessageObject$$ExternalSyntheticLambda2 INSTANCE = new MessageObject$$ExternalSyntheticLambda2();

    private MessageObject$$ExternalSyntheticLambda2() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$addEntitiesToText$2;
        lambda$addEntitiesToText$2 = MessageObject.lambda$addEntitiesToText$2((TLRPC$MessageEntity) obj, (TLRPC$MessageEntity) obj2);
        return lambda$addEntitiesToText$2;
    }
}

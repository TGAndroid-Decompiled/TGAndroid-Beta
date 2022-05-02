package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.tgnet.TLRPC$Message;

public final class SecretChatHelper$$ExternalSyntheticLambda25 implements Comparator {
    public static final SecretChatHelper$$ExternalSyntheticLambda25 INSTANCE = new SecretChatHelper$$ExternalSyntheticLambda25();

    private SecretChatHelper$$ExternalSyntheticLambda25() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$resendMessages$13;
        lambda$resendMessages$13 = SecretChatHelper.lambda$resendMessages$13((TLRPC$Message) obj, (TLRPC$Message) obj2);
        return lambda$resendMessages$13;
    }
}

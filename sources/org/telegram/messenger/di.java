package org.telegram.messenger;

import java.util.Comparator;
import org.telegram.messenger.SavedMessagesController;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.TLRPC;
public final class di implements Comparator {
    public final int f17078a;

    public di(int i10) {
        this.f17078a = i10;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int lambda$updateAllDialogs$0;
        int lambda$resendMessages$13;
        int lambda$checkSecretHoles$16;
        int lambda$saveProxyList$4;
        int lambda$sortTopics$9;
        switch (this.f17078a) {
            case 0:
                lambda$updateAllDialogs$0 = SavedMessagesController.lambda$updateAllDialogs$0((SavedMessagesController.SavedDialog) obj, (SavedMessagesController.SavedDialog) obj2);
                return lambda$updateAllDialogs$0;
            case 1:
                lambda$resendMessages$13 = SecretChatHelper.lambda$resendMessages$13((TLRPC.Message) obj, (TLRPC.Message) obj2);
                return lambda$resendMessages$13;
            case 2:
                lambda$checkSecretHoles$16 = SecretChatHelper.lambda$checkSecretHoles$16((SecretChatHelper.TL_decryptedMessageHolder) obj, (SecretChatHelper.TL_decryptedMessageHolder) obj2);
                return lambda$checkSecretHoles$16;
            case 3:
                lambda$saveProxyList$4 = SharedConfig.lambda$saveProxyList$4((SharedConfig.ProxyInfo) obj, (SharedConfig.ProxyInfo) obj2);
                return lambda$saveProxyList$4;
            default:
                lambda$sortTopics$9 = TopicsController.lambda$sortTopics$9((TLRPC.TL_forumTopic) obj, (TLRPC.TL_forumTopic) obj2);
                return lambda$sortTopics$9;
        }
    }
}

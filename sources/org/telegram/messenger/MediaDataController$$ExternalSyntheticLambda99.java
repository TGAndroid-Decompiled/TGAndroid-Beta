package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;

public final class MediaDataController$$ExternalSyntheticLambda99 implements Runnable {
    public final int $r8$classId = 1;
    public final MediaDataController f$0;
    public final TLRPC.Message f$1;
    public final MessagesStorage.TopicKey f$2;

    public MediaDataController$$ExternalSyntheticLambda99(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f$0 = mediaDataController;
        this.f$2 = topicKey;
        this.f$1 = message;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$loadBotKeyboard$195(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$putBotKeyboard$200(this.f$2, this.f$1);
                break;
        }
    }

    public MediaDataController$$ExternalSyntheticLambda99(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f$0 = mediaDataController;
        this.f$1 = message;
        this.f$2 = topicKey;
    }
}

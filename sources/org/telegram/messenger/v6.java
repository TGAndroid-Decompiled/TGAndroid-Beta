package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f17483a = 0;
    public final MediaDataController f17484b;
    public final TLRPC.Message f17485c;
    public final MessagesStorage.TopicKey d;

    public v6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f17484b = mediaDataController;
        this.d = topicKey;
        this.f17485c = message;
    }

    @Override
    public final void run() {
        switch (this.f17483a) {
            case 0:
                this.f17484b.lambda$putBotKeyboard$200(this.d, this.f17485c);
                return;
            default:
                this.f17484b.lambda$loadBotKeyboard$195(this.f17485c, this.d);
                return;
        }
    }

    public v6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f17484b = mediaDataController;
        this.f17485c = message;
        this.d = topicKey;
    }
}

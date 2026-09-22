package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f17511a = 0;
    public final MediaDataController f17512b;
    public final TLRPC.Message f17513c;
    public final MessagesStorage.TopicKey d;

    public v6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f17512b = mediaDataController;
        this.d = topicKey;
        this.f17513c = message;
    }

    @Override
    public final void run() {
        switch (this.f17511a) {
            case 0:
                this.f17512b.lambda$putBotKeyboard$200(this.d, this.f17513c);
                return;
            default:
                this.f17512b.lambda$loadBotKeyboard$195(this.f17513c, this.d);
                return;
        }
    }

    public v6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f17512b = mediaDataController;
        this.f17513c = message;
        this.d = topicKey;
    }
}

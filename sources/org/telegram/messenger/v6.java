package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f17743a = 0;
    public final MediaDataController f17744b;
    public final TLRPC.Message f17745c;
    public final MessagesStorage.TopicKey d;

    public v6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f17744b = mediaDataController;
        this.d = topicKey;
        this.f17745c = message;
    }

    @Override
    public final void run() {
        switch (this.f17743a) {
            case 0:
                this.f17744b.lambda$putBotKeyboard$200(this.d, this.f17745c);
                return;
            default:
                this.f17744b.lambda$loadBotKeyboard$195(this.f17745c, this.d);
                return;
        }
    }

    public v6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f17744b = mediaDataController;
        this.f17745c = message;
        this.d = topicKey;
    }
}

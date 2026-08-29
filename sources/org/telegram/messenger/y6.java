package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class y6 implements Runnable {
    public final int f22228a = 0;
    public final MediaDataController f22229b;
    public final TLRPC.Message f22230c;
    public final MessagesStorage.TopicKey d;

    public y6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f22229b = mediaDataController;
        this.d = topicKey;
        this.f22230c = message;
    }

    @Override
    public final void run() {
        switch (this.f22228a) {
            case 0:
                this.f22229b.lambda$putBotKeyboard$200(this.d, this.f22230c);
                return;
            default:
                this.f22229b.lambda$loadBotKeyboard$195(this.f22230c, this.d);
                return;
        }
    }

    public y6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f22229b = mediaDataController;
        this.f22230c = message;
        this.d = topicKey;
    }
}

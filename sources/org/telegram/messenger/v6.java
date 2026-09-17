package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f17523a = 0;
    public final MediaDataController f17524b;
    public final TLRPC.Message f17525c;
    public final MessagesStorage.TopicKey d;

    public v6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f17524b = mediaDataController;
        this.d = topicKey;
        this.f17525c = message;
    }

    @Override
    public final void run() {
        switch (this.f17523a) {
            case 0:
                this.f17524b.lambda$putBotKeyboard$200(this.d, this.f17525c);
                return;
            default:
                this.f17524b.lambda$loadBotKeyboard$195(this.f17525c, this.d);
                return;
        }
    }

    public v6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f17524b = mediaDataController;
        this.f17525c = message;
        this.d = topicKey;
    }
}

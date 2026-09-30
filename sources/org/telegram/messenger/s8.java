package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f17539a = 1;
    public final MediaDataController f17540b;
    public final MessagesStorage.TopicKey f17541c;
    public final TLRPC.Message d;

    public s8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f17540b = mediaDataController;
        this.f17541c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f17539a) {
            case 0:
                this.f17540b.lambda$loadBotKeyboard$196(this.d, this.f17541c);
                return;
            default:
                this.f17540b.lambda$putBotKeyboard$201(this.f17541c, this.d);
                return;
        }
    }

    public s8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f17540b = mediaDataController;
        this.d = message;
        this.f17541c = topicKey;
    }
}

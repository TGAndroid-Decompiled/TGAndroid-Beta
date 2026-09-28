package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f17522a = 1;
    public final MediaDataController f17523b;
    public final MessagesStorage.TopicKey f17524c;
    public final TLRPC.Message d;

    public s8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f17523b = mediaDataController;
        this.f17524c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f17522a) {
            case 0:
                this.f17523b.lambda$loadBotKeyboard$196(this.d, this.f17524c);
                return;
            default:
                this.f17523b.lambda$putBotKeyboard$201(this.f17524c, this.d);
                return;
        }
    }

    public s8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f17523b = mediaDataController;
        this.d = message;
        this.f17524c = topicKey;
    }
}

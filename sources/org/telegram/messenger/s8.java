package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f17523a = 1;
    public final MediaDataController f17524b;
    public final MessagesStorage.TopicKey f17525c;
    public final TLRPC.Message d;

    public s8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f17524b = mediaDataController;
        this.f17525c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f17523a) {
            case 0:
                this.f17524b.lambda$loadBotKeyboard$196(this.d, this.f17525c);
                return;
            default:
                this.f17524b.lambda$putBotKeyboard$201(this.f17525c, this.d);
                return;
        }
    }

    public s8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f17524b = mediaDataController;
        this.d = message;
        this.f17525c = topicKey;
    }
}

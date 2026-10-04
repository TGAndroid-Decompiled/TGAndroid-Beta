package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f19135a = 1;
    public final MediaDataController f19136b;
    public final MessagesStorage.TopicKey f19137c;
    public final TLRPC.Message d;

    public s8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19136b = mediaDataController;
        this.f19137c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19135a) {
            case 0:
                this.f19136b.lambda$loadBotKeyboard$196(this.d, this.f19137c);
                return;
            default:
                this.f19136b.lambda$putBotKeyboard$201(this.f19137c, this.d);
                return;
        }
    }

    public s8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19136b = mediaDataController;
        this.d = message;
        this.f19137c = topicKey;
    }
}

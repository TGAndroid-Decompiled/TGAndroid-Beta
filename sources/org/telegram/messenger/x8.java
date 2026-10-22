package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f20061a = 1;
    public final MediaDataController f20062b;
    public final MessagesStorage.TopicKey f20063c;
    public final TLRPC.Message d;

    public x8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f20062b = mediaDataController;
        this.f20063c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f20061a) {
            case 0:
                this.f20062b.lambda$loadBotKeyboard$196(this.d, this.f20063c);
                return;
            default:
                this.f20062b.lambda$putBotKeyboard$201(this.f20063c, this.d);
                return;
        }
    }

    public x8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f20062b = mediaDataController;
        this.d = message;
        this.f20063c = topicKey;
    }
}

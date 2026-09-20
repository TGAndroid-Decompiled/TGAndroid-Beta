package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f17728a = 0;
    public final MediaDataController f17729b;
    public final TLRPC.Message f17730c;
    public final MessagesStorage.TopicKey d;

    public v6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f17729b = mediaDataController;
        this.d = topicKey;
        this.f17730c = message;
    }

    @Override
    public final void run() {
        switch (this.f17728a) {
            case 0:
                this.f17729b.lambda$putBotKeyboard$200(this.d, this.f17730c);
                return;
            default:
                this.f17729b.lambda$loadBotKeyboard$195(this.f17730c, this.d);
                return;
        }
    }

    public v6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f17729b = mediaDataController;
        this.f17730c = message;
        this.d = topicKey;
    }
}

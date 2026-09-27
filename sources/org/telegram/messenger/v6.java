package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f17732a = 0;
    public final MediaDataController f17733b;
    public final TLRPC.Message f17734c;
    public final MessagesStorage.TopicKey d;

    public v6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f17733b = mediaDataController;
        this.d = topicKey;
        this.f17734c = message;
    }

    @Override
    public final void run() {
        switch (this.f17732a) {
            case 0:
                this.f17733b.lambda$putBotKeyboard$200(this.d, this.f17734c);
                return;
            default:
                this.f17733b.lambda$loadBotKeyboard$195(this.f17734c, this.d);
                return;
        }
    }

    public v6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f17733b = mediaDataController;
        this.f17734c = message;
        this.d = topicKey;
    }
}

package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f17723a = 0;
    public final MediaDataController f17724b;
    public final TLRPC.Message f17725c;
    public final MessagesStorage.TopicKey d;

    public v6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f17724b = mediaDataController;
        this.d = topicKey;
        this.f17725c = message;
    }

    @Override
    public final void run() {
        switch (this.f17723a) {
            case 0:
                this.f17724b.lambda$putBotKeyboard$200(this.d, this.f17725c);
                return;
            default:
                this.f17724b.lambda$loadBotKeyboard$195(this.f17725c, this.d);
                return;
        }
    }

    public v6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f17724b = mediaDataController;
        this.f17725c = message;
        this.d = topicKey;
    }
}

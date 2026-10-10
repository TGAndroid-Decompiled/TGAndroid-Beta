package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f19128a = 1;
    public final MediaDataController f19129b;
    public final MessagesStorage.TopicKey f19130c;
    public final TLRPC.Message d;

    public s8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19129b = mediaDataController;
        this.f19130c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19128a) {
            case 0:
                this.f19129b.lambda$loadBotKeyboard$196(this.d, this.f19130c);
                return;
            default:
                this.f19129b.lambda$putBotKeyboard$201(this.f19130c, this.d);
                return;
        }
    }

    public s8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19129b = mediaDataController;
        this.d = message;
        this.f19130c = topicKey;
    }
}

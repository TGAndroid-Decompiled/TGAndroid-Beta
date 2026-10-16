package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v8 implements Runnable {
    public final int f18354a = 1;
    public final MediaDataController f18355b;
    public final MessagesStorage.TopicKey f18356c;
    public final TLRPC.Message d;

    public v8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f18355b = mediaDataController;
        this.f18356c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f18354a) {
            case 0:
                this.f18355b.lambda$loadBotKeyboard$196(this.d, this.f18356c);
                return;
            default:
                this.f18355b.lambda$putBotKeyboard$201(this.f18356c, this.d);
                return;
        }
    }

    public v8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f18355b = mediaDataController;
        this.d = message;
        this.f18356c = topicKey;
    }
}

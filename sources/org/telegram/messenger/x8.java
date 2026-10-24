package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class x8 implements Runnable {
    public final int f20126a = 1;
    public final MediaDataController f20127b;
    public final MessagesStorage.TopicKey f20128c;
    public final TLRPC.Message d;

    public x8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f20127b = mediaDataController;
        this.f20128c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f20126a) {
            case 0:
                this.f20127b.lambda$loadBotKeyboard$196(this.d, this.f20128c);
                return;
            default:
                this.f20127b.lambda$putBotKeyboard$201(this.f20128c, this.d);
                return;
        }
    }

    public x8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f20127b = mediaDataController;
        this.d = message;
        this.f20128c = topicKey;
    }
}

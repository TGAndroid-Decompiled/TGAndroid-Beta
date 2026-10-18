package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f19479a = 1;
    public final MediaDataController f19480b;
    public final MessagesStorage.TopicKey f19481c;
    public final TLRPC.Message d;

    public s8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19480b = mediaDataController;
        this.f19481c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19479a) {
            case 0:
                this.f19480b.lambda$loadBotKeyboard$196(this.d, this.f19481c);
                return;
            default:
                this.f19480b.lambda$putBotKeyboard$201(this.f19481c, this.d);
                return;
        }
    }

    public s8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19480b = mediaDataController;
        this.d = message;
        this.f19481c = topicKey;
    }
}

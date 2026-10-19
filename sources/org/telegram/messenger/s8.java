package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f19476a = 1;
    public final MediaDataController f19477b;
    public final MessagesStorage.TopicKey f19478c;
    public final TLRPC.Message d;

    public s8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19477b = mediaDataController;
        this.f19478c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19476a) {
            case 0:
                this.f19477b.lambda$loadBotKeyboard$196(this.d, this.f19478c);
                return;
            default:
                this.f19477b.lambda$putBotKeyboard$201(this.f19478c, this.d);
                return;
        }
    }

    public s8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19477b = mediaDataController;
        this.d = message;
        this.f19478c = topicKey;
    }
}

package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class s8 implements Runnable {
    public final int f19478a = 1;
    public final MediaDataController f19479b;
    public final MessagesStorage.TopicKey f19480c;
    public final TLRPC.Message d;

    public s8(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19479b = mediaDataController;
        this.f19480c = topicKey;
        this.d = message;
    }

    @Override
    public final void run() {
        switch (this.f19478a) {
            case 0:
                this.f19479b.lambda$loadBotKeyboard$196(this.d, this.f19480c);
                return;
            default:
                this.f19479b.lambda$putBotKeyboard$201(this.f19480c, this.d);
                return;
        }
    }

    public s8(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19479b = mediaDataController;
        this.d = message;
        this.f19480c = topicKey;
    }
}

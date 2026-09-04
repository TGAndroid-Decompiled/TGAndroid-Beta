package org.telegram.messenger;

import org.telegram.messenger.MessagesStorage;
import org.telegram.tgnet.TLRPC;
public final class v6 implements Runnable {
    public final int f19207a = 0;
    public final MediaDataController f19208b;
    public final TLRPC.Message f19209c;
    public final MessagesStorage.TopicKey d;

    public v6(MediaDataController mediaDataController, MessagesStorage.TopicKey topicKey, TLRPC.Message message) {
        this.f19208b = mediaDataController;
        this.d = topicKey;
        this.f19209c = message;
    }

    @Override
    public final void run() {
        switch (this.f19207a) {
            case 0:
                this.f19208b.lambda$putBotKeyboard$200(this.d, this.f19209c);
                return;
            default:
                this.f19208b.lambda$loadBotKeyboard$195(this.f19209c, this.d);
                return;
        }
    }

    public v6(MediaDataController mediaDataController, TLRPC.Message message, MessagesStorage.TopicKey topicKey) {
        this.f19208b = mediaDataController;
        this.f19209c = message;
        this.d = topicKey;
    }
}

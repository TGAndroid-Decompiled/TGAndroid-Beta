package org.telegram.messenger;

public final class MessagesController$$ExternalSyntheticLambda59 implements Runnable {
    public final MessagesController f$0;

    public MessagesController$$ExternalSyntheticLambda59(MessagesController messagesController) {
        this.f$0 = messagesController;
    }

    @Override
    public final void run() {
        this.f$0.removePromoDialog();
    }
}

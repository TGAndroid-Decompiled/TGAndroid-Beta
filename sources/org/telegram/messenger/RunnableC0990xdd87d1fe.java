package org.telegram.messenger;

import org.telegram.messenger.MediaController;

public final class RunnableC0990xdd87d1fe implements Runnable {
    public static final RunnableC0990xdd87d1fe INSTANCE = new RunnableC0990xdd87d1fe();

    private RunnableC0990xdd87d1fe() {
    }

    @Override
    public final void run() {
        MediaController.GalleryObserverExternal.lambda$onChange$0();
    }
}

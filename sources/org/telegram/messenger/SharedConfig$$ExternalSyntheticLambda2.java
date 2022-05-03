package org.telegram.messenger;

public final class SharedConfig$$ExternalSyntheticLambda2 implements Runnable {
    public static final SharedConfig$$ExternalSyntheticLambda2 INSTANCE = new SharedConfig$$ExternalSyntheticLambda2();

    private SharedConfig$$ExternalSyntheticLambda2() {
    }

    @Override
    public final void run() {
        SharedConfig.checkSaveToGalleryFiles();
    }
}

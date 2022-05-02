package org.telegram.messenger;

public final class ApplicationLoader$$ExternalSyntheticLambda3 implements Runnable {
    public static final ApplicationLoader$$ExternalSyntheticLambda3 INSTANCE = new ApplicationLoader$$ExternalSyntheticLambda3();

    private ApplicationLoader$$ExternalSyntheticLambda3() {
    }

    @Override
    public final void run() {
        ApplicationLoader.startPushService();
    }
}

package org.telegram.messenger;

public final class ApplicationLoader$$ExternalSyntheticLambda1 implements Runnable {
    public static final ApplicationLoader$$ExternalSyntheticLambda1 INSTANCE = new ApplicationLoader$$ExternalSyntheticLambda1();

    private ApplicationLoader$$ExternalSyntheticLambda1() {
    }

    @Override
    public final void run() {
        ApplicationLoader.startPushService();
    }
}

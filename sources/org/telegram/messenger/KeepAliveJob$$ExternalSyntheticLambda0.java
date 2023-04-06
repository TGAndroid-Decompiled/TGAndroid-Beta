package org.telegram.messenger;
public final class KeepAliveJob$$ExternalSyntheticLambda0 implements Runnable {
    public static final KeepAliveJob$$ExternalSyntheticLambda0 INSTANCE = new KeepAliveJob$$ExternalSyntheticLambda0();

    private KeepAliveJob$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void run() {
        KeepAliveJob.finishJobInternal();
    }
}

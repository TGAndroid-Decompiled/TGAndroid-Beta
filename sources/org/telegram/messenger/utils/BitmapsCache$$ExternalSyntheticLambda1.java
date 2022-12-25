package org.telegram.messenger.utils;

public final class BitmapsCache$$ExternalSyntheticLambda1 implements Runnable {
    public static final BitmapsCache$$ExternalSyntheticLambda1 INSTANCE = new BitmapsCache$$ExternalSyntheticLambda1();

    private BitmapsCache$$ExternalSyntheticLambda1() {
    }

    @Override
    public final void run() {
        BitmapsCache.lambda$decrementTaskCounter$0();
    }
}

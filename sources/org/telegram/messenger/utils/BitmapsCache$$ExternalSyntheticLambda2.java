package org.telegram.messenger.utils;

import org.telegram.messenger.utils.BitmapsCache;
import p008j$.util.function.ToIntFunction;

public final class BitmapsCache$$ExternalSyntheticLambda2 implements ToIntFunction {
    public static final BitmapsCache$$ExternalSyntheticLambda2 INSTANCE = new BitmapsCache$$ExternalSyntheticLambda2();

    private BitmapsCache$$ExternalSyntheticLambda2() {
    }

    @Override
    public final int applyAsInt(Object obj) {
        int i;
        i = ((BitmapsCache.FrameOffset) obj).index;
        return i;
    }
}

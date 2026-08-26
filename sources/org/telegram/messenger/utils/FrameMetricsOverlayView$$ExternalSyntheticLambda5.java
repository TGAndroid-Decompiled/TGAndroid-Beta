package org.telegram.messenger.utils;

import android.view.ViewTreeObserver;

public final class FrameMetricsOverlayView$$ExternalSyntheticLambda5 implements ViewTreeObserver.OnDrawListener {
    public final FrameMetricsOverlayView f$0;

    @Override
    public final void onDraw() {
        this.f$0.onDrawCountAccum.incrementAndGet();
    }
}

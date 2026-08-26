package org.telegram.messenger.pip;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.core.math.MathUtils;
import java.util.ArrayList;
import org.telegram.messenger.pip.activity.IPipActivityAnimationListener;
import org.telegram.messenger.pip.source.PipSourceHandlerState2;
import org.telegram.messenger.pip.utils.PipDuration;
import org.telegram.messenger.utils.FrameMetricsOverlayView;
import org.telegram.ui.Components.spoilers.SpoilerEffectBitmapFactory;
import org.telegram.ui.Components.spoilers.SpoilerEffectBitmapFactory$$ExternalSyntheticLambda1;

public final class PipActivityHandler$$ExternalSyntheticLambda3 implements Choreographer.FrameCallback {
    public final int $r8$classId;
    public final Object f$0;

    public PipActivityHandler$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void doFrame(long j) {
        switch (this.$r8$classId) {
            case 0:
                PipActivityHandler pipActivityHandler = (PipActivityHandler) this.f$0;
                if (pipActivityHandler.hasFrameListener) {
                    ArrayList arrayList = pipActivityHandler.animationListeners;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        PipSourceContentView pipSourceContentView = ((PipSourceHandlerState2) ((IPipActivityAnimationListener) obj)).pictureInPictureWrapperView;
                        if (pipSourceContentView != null) {
                            pipSourceContentView.invalidate();
                        }
                    }
                    PipDuration pipDuration = pipActivityHandler.durationEnter;
                    if (pipDuration.start != 0) {
                        pipActivityHandler.dispatchTransitionAnimationProgress(MathUtils.clamp((pipDuration.estimated > 0 ? MathUtils.clamp((SystemClock.uptimeMillis() - pipDuration.start) / pipDuration.estimated, 0.0f, 1.0f) : 0.5f) / 0.95f, 0.0f, 1.0f));
                    } else {
                        PipDuration pipDuration2 = pipActivityHandler.durationLeave;
                        if (pipDuration2.start != 0) {
                            pipActivityHandler.dispatchTransitionAnimationProgress(MathUtils.clamp(1.0f - ((pipDuration2.estimated > 0 ? MathUtils.clamp((SystemClock.uptimeMillis() - pipDuration2.start) / pipDuration2.estimated, 0.0f, 1.0f) : 0.5f) / 0.95f), 0.0f, 1.0f));
                        }
                    }
                    pipActivityHandler.choreographer.postFrameCallback(pipActivityHandler.callback);
                    break;
                }
                break;
            case 1:
                ((Runnable) this.f$0).run();
                break;
            case 2:
                FrameMetricsOverlayView frameMetricsOverlayView = (FrameMetricsOverlayView) this.f$0;
                if (frameMetricsOverlayView.running.get()) {
                    long j2 = frameMetricsOverlayView.vsyncWindowStartNs;
                    if (j2 == 0) {
                        frameMetricsOverlayView.vsyncWindowStartNs = j;
                    } else if (j - j2 >= 1000000000) {
                        frameMetricsOverlayView.vsyncPerSecond = frameMetricsOverlayView.vsyncCountAccum;
                        frameMetricsOverlayView.onDrawPerSecond = frameMetricsOverlayView.onDrawCountAccum.getAndSet(0);
                        frameMetricsOverlayView.vsyncCountAccum = 0;
                        frameMetricsOverlayView.vsyncWindowStartNs = j;
                    } else {
                        frameMetricsOverlayView.vsyncCountAccum++;
                    }
                    Choreographer.getInstance().postFrameCallback(frameMetricsOverlayView.choreographerCallback);
                    break;
                }
                break;
            default:
                SpoilerEffectBitmapFactory spoilerEffectBitmapFactory = (SpoilerEffectBitmapFactory) this.f$0;
                spoilerEffectBitmapFactory.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j3 = jCurrentTimeMillis - spoilerEffectBitmapFactory.lastUpdateTime;
                Rect rect = spoilerEffectBitmapFactory.clipRegion;
                if (j3 > 32 && !spoilerEffectBitmapFactory.isRunning && !rect.isEmpty()) {
                    spoilerEffectBitmapFactory.lastUpdateTime = jCurrentTimeMillis;
                    spoilerEffectBitmapFactory.isRunning = true;
                    spoilerEffectBitmapFactory.clipRegionDump.set(rect);
                    spoilerEffectBitmapFactory.dispatchQueue.postRunnable(new SpoilerEffectBitmapFactory$$ExternalSyntheticLambda1(spoilerEffectBitmapFactory, (spoilerEffectBitmapFactory.currentBitmapBuffer + 1) % 2, 0));
                }
                rect.set(0, 0, 0, 0);
                spoilerEffectBitmapFactory.invalidated = false;
                break;
        }
    }
}

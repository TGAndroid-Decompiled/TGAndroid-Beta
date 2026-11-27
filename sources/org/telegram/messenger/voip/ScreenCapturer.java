package org.telegram.messenger.voip;

import android.content.Intent;
import android.media.projection.MediaProjection;
import org.webrtc.ScreenCapturerAndroid;
public final class ScreenCapturer extends ScreenCapturerAndroid {
    private final MediaProjection.Callback callback;

    public ScreenCapturer(Intent intent, MediaProjection.Callback callback) {
        super(intent, callback);
        this.callback = callback;
    }

    @Override
    public synchronized void startCapture(int i, int i2, int i3) {
        if (getMediaProjection() != null) {
            return;
        }
        super.startCapture(i, i2, i3);
    }
}

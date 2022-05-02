package org.telegram.messenger;

import android.graphics.ImageDecoder;

public final class NotificationsController$$ExternalSyntheticLambda0 implements ImageDecoder.OnHeaderDecodedListener {
    public static final NotificationsController$$ExternalSyntheticLambda0 INSTANCE = new NotificationsController$$ExternalSyntheticLambda0();

    private NotificationsController$$ExternalSyntheticLambda0() {
    }

    @Override
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        NotificationsController.lambda$loadRoundAvatar$36(imageDecoder, imageInfo, source);
    }
}

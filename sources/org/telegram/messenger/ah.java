package org.telegram.messenger;

import android.graphics.ImageDecoder;
public final class ah implements ImageDecoder.OnHeaderDecodedListener {
    @Override
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        NotificationsController.lambda$loadRoundAvatar$48(imageDecoder, imageInfo, source);
    }
}

package org.telegram.messenger;

import android.graphics.ImageDecoder;
public final class vs implements ImageDecoder.OnHeaderDecodedListener {
    @Override
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setPostProcessor(new Object());
    }
}

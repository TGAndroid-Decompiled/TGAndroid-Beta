package defpackage;

import android.graphics.ImageDecoder;
public final class do7 implements ImageDecoder.OnHeaderDecodedListener {
    @Override
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.setPostProcessor(new Object());
    }
}

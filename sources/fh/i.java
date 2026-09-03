package fh;

import android.graphics.Canvas;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k6;
public final class i extends eh.h {
    public final TLRPC.Document f6671b;
    public final Object f6672c;

    public i(TLRPC.Document document, Object obj) {
        boolean z4;
        String str;
        this.f6671b = document;
        this.f6672c = obj;
        MessageObject.isAnimatedEmoji(document);
        ImageReceiver imageReceiver = this.f5637a;
        if (!MessageObject.isStickerDocument(document) && !MessageObject.isVideoSticker(document)) {
            z4 = false;
        } else {
            z4 = true;
        }
        MessageObject.isAnimatedStickerDocument(document, true);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, k6.f21811lc, 1.0f);
        boolean z10 = z4;
        ImageLocation forDocument = ImageLocation.getForDocument(document);
        long j10 = document.size;
        if (z10) {
            str = "webp";
        } else {
            str = null;
        }
        imageReceiver.setImage(forDocument, "38_38", svgThumb, j10, str, obj, 0);
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.f5637a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}

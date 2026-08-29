package ch;

import android.graphics.Canvas;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.SvgHelper;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
public final class i extends bh.h {
    public final TLRPC.Document f3503b;
    public final Object f3504c;

    public i(TLRPC.Document document, Object obj) {
        boolean z10;
        String str;
        this.f3503b = document;
        this.f3504c = obj;
        MessageObject.isAnimatedEmoji(document);
        ImageReceiver imageReceiver = this.f2668a;
        if (!MessageObject.isStickerDocument(document) && !MessageObject.isVideoSticker(document)) {
            z10 = false;
        } else {
            z10 = true;
        }
        MessageObject.isAnimatedStickerDocument(document, true);
        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, g6.lc, 1.0f);
        boolean z11 = z10;
        ImageLocation forDocument = ImageLocation.getForDocument(document);
        long j10 = document.size;
        if (z11) {
            str = "webp";
        } else {
            str = null;
        }
        imageReceiver.setImage(forDocument, "38_38", svgThumb, j10, str, obj, 0);
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.f2668a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}

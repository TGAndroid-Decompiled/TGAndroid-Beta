package ch;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
public final class g extends bh.h {
    public final TLRPC.MessageMedia f3500b;

    public g(TLRPC.MessageMedia messageMedia) {
        this.f3500b = messageMedia;
        this.f2668a.setRoundRadius(AndroidUtilities.dp(7.0f));
        ImageReceiver imageReceiver = this.f2668a;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        if (geoPoint == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 38, 38, 13, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, (Drawable) null, (Object) null, 0);
        }
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.f2668a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}

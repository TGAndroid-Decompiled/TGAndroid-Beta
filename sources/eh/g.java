package eh;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;
public final class g extends dh.h {
    public final TLRPC.MessageMedia f5603b;

    public g(TLRPC.MessageMedia messageMedia) {
        this.f5603b = messageMedia;
        this.f4910a.setRoundRadius(AndroidUtilities.dp(7.0f));
        ImageReceiver imageReceiver = this.f4910a;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        if (geoPoint == null) {
            imageReceiver.clearImage();
        } else {
            imageReceiver.setImage(ImageLocation.getForWebFile(WebFile.createWithGeoPoint(geoPoint, 38, 38, 13, Math.min(2, (int) Math.ceil(AndroidUtilities.density)))), (String) null, (ImageLocation) null, (String) null, (Drawable) null, (Object) null, 0);
        }
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.f4910a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}

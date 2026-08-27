package ah;

import android.graphics.Canvas;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.SendMessagesHelper;

public final class d extends zg.e {

    public final MediaController.PhotoEntry f756b;

    public final SendMessagesHelper.SendingMediaInfo f757c;

    public d(SendMessagesHelper.SendingMediaInfo sendingMediaInfo) {
        ImageLocation forPath;
        ImageLocation imageLocation;
        this.f757c = sendingMediaInfo;
        MediaController.PhotoEntry photoEntry = sendingMediaInfo.originalPhotoEntry;
        this.f756b = photoEntry;
        this.f50818a.setRoundRadius(AndroidUtilities.dp(7.0f));
        ImageReceiver imageReceiver = this.f50818a;
        imageReceiver.setOrientation(0, true);
        String str = photoEntry.coverPath;
        if (str != null) {
            forPath = ImageLocation.getForPath(str);
        } else {
            String str2 = photoEntry.thumbPath;
            if (str2 != null) {
                forPath = ImageLocation.getForPath(str2);
            } else {
                if (photoEntry.path != null) {
                    if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                        ImageLocation forPath2 = ImageLocation.getForPath("thumb://" + photoEntry.imageId + ":" + photoEntry.path);
                        imageReceiver.setOrientation(photoEntry.orientation, photoEntry.invert, true);
                        imageLocation = forPath2;
                    } else {
                        forPath = ImageLocation.getForPath("vthumb://" + photoEntry.imageId + ":" + photoEntry.path);
                    }
                    if (imageLocation != null) {
                        imageReceiver.setImage(imageLocation, null, null, null, null, 0);
                    } else {
                        imageReceiver.clearImage();
                    }
                }
                imageReceiver.clearImage();
                forPath = null;
            }
        }
        imageLocation = forPath;
        if (imageLocation != null) {
            imageReceiver.setImage(imageLocation, null, null, null, null, 0);
        } else {
            imageReceiver.clearImage();
        }
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.f50818a;
        imageReceiver.setImageCoords(0.0f, 0.0f, i10, i11);
        imageReceiver.draw(canvas);
    }
}

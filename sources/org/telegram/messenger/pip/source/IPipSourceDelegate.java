package org.telegram.messenger.pip.source;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

public interface IPipSourceDelegate {

    public abstract class CC {
        public static boolean $default$pipIsAvailable(IPipSourceDelegate iPipSourceDelegate) {
            return true;
        }

        public static void $default$pipRenderBackground(IPipSourceDelegate iPipSourceDelegate, Canvas canvas) {
        }

        public static void $default$pipRenderForeground(IPipSourceDelegate iPipSourceDelegate, Canvas canvas) {
        }
    }

    View pipCreatePictureInPictureView();

    Bitmap pipCreatePictureInPictureViewBitmap();

    Bitmap pipCreatePrimaryWindowViewBitmap();

    void pipHidePrimaryWindowView(Runnable runnable);

    boolean pipIsAvailable();

    void pipRenderBackground(Canvas canvas);

    void pipRenderForeground(Canvas canvas);

    void pipShowPrimaryWindowView(Runnable runnable);
}

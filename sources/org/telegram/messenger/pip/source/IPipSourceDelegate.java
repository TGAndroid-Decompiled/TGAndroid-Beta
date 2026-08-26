package org.telegram.messenger.pip.source;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.pip.utils.Trigger;

public interface IPipSourceDelegate {
    View pipCreatePictureInPictureView();

    Bitmap pipCreatePictureInPictureViewBitmap();

    Bitmap pipCreatePrimaryWindowViewBitmap();

    void pipHidePrimaryWindowView(Trigger trigger);

    boolean pipIsAvailable();

    void pipRenderBackground(Canvas canvas);

    void pipRenderForeground(Canvas canvas);

    void pipShowPrimaryWindowView(Trigger trigger);
}

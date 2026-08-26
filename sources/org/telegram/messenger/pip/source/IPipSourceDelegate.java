package org.telegram.messenger.pip.source;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;

public interface IPipSourceDelegate {
    View pipCreatePictureInPictureView();

    Bitmap pipCreatePictureInPictureViewBitmap();

    Bitmap pipCreatePrimaryWindowViewBitmap();

    void pipHidePrimaryWindowView(Runnable runnable);

    boolean pipIsAvailable();

    void pipRenderBackground(Canvas canvas);

    void pipRenderForeground(Canvas canvas);

    void pipShowPrimaryWindowView(Runnable runnable);
}

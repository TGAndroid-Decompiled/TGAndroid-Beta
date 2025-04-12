package org.telegram.messenger.pip;

import android.view.View;

public interface PictureInPictureActivityHandler {
    void addActivityPipView(View view);

    void removeActivityPipView(View view);
}

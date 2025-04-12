package org.telegram.messenger.pip;

import android.view.View;

public interface PictureInPictureContentViewProvider {
    void attachContentToWindow();

    View detachContentFromWindow();

    void onAttachContentToPip();

    void prepareDetachContentFromPip();
}

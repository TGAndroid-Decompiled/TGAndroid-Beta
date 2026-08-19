package org.telegram.messenger.pip.activity;

import android.app.PictureInPictureParams;
import android.app.PictureInPictureUiState;
import android.content.res.Configuration;

public interface IPipActivityHandler {
    void onConfigurationChanged(Configuration configuration);

    void onPause();

    void onPictureInPictureModeChanged(boolean z, Configuration configuration);

    void onPictureInPictureRequested();

    void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState);

    void onResume();

    void onStart();

    void onStop();

    void onUserLeaveHint();

    void setPictureInPictureParams(PictureInPictureParams pictureInPictureParams);
}

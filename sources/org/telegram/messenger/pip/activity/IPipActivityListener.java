package org.telegram.messenger.pip.activity;

public interface IPipActivityListener {
    void onCompleteEnterToPip();

    void onCompleteExitFromPip(boolean z);

    void onPipStashEnd();

    void onPipStashStart();

    void onStartEnterToPip();

    void onStartExitFromPip(boolean z);
}

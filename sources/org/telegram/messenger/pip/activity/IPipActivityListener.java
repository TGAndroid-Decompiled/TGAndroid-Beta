package org.telegram.messenger.pip.activity;

public interface IPipActivityListener {
    void onCompleteEnterToPip();

    void onCompleteExitFromPip();

    void onPipStashEnd();

    void onPipStashStart();

    void onStartEnterToPip();

    void onStartExitFromPip();
}

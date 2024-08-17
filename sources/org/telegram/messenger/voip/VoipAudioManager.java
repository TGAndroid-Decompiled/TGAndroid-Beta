package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;

public class VoipAudioManager {
    private Boolean isSpeakerphoneOn;

    private VoipAudioManager() {
    }

    public static final class InstanceHolder {
        static final VoipAudioManager instance = new VoipAudioManager();

        private InstanceHolder() {
        }
    }

    public static VoipAudioManager get() {
        return InstanceHolder.instance;
    }

    public void setSpeakerphoneOn(final boolean z) {
        this.isSpeakerphoneOn = Boolean.valueOf(z);
        final AudioManager audioManager = getAudioManager();
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                audioManager.setSpeakerphoneOn(z);
            }
        });
    }

    public boolean isSpeakerphoneOn() {
        Boolean bool = this.isSpeakerphoneOn;
        if (bool == null) {
            return getAudioManager().isSpeakerphoneOn();
        }
        return bool.booleanValue();
    }

    public void isBluetoothAndSpeakerOnAsync(final Utilities.Callback2<Boolean, Boolean> callback2) {
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                VoipAudioManager.this.lambda$isBluetoothAndSpeakerOnAsync$2(callback2);
            }
        });
    }

    public void lambda$isBluetoothAndSpeakerOnAsync$2(final Utilities.Callback2 callback2) {
        AudioManager audioManager = getAudioManager();
        final boolean isBluetoothScoOn = audioManager.isBluetoothScoOn();
        final boolean isSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoipAudioManager.lambda$isBluetoothAndSpeakerOnAsync$1(Utilities.Callback2.this, isBluetoothScoOn, isSpeakerphoneOn);
            }
        });
    }

    public static void lambda$isBluetoothAndSpeakerOnAsync$1(Utilities.Callback2 callback2, boolean z, boolean z2) {
        callback2.run(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    private AudioManager getAudioManager() {
        return (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }
}

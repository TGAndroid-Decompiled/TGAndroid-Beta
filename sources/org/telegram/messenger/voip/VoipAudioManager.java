package org.telegram.messenger.voip;

import android.media.AudioManager;
import ji.b5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;
public class VoipAudioManager {
    private Boolean isSpeakerphoneOn;

    public static final class InstanceHolder {
        static final VoipAudioManager instance = new VoipAudioManager();

        private InstanceHolder() {
        }
    }

    public static VoipAudioManager get() {
        return InstanceHolder.instance;
    }

    private AudioManager getAudioManager() {
        return (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }

    public static void lambda$isBluetoothAndSpeakerOnAsync$1(Utilities.Callback2 callback2, boolean z10, boolean z11) {
        callback2.run(Boolean.valueOf(z10), Boolean.valueOf(z11));
    }

    public void lambda$isBluetoothAndSpeakerOnAsync$2(Utilities.Callback2 callback2) {
        AudioManager audioManager = getAudioManager();
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.k(callback2, audioManager.isBluetoothScoOn(), audioManager.isSpeakerphoneOn(), 2));
    }

    public void isBluetoothAndSpeakerOnAsync(Utilities.Callback2<Boolean, Boolean> callback2) {
        Utilities.globalQueue.postRunnable(new b5(25, this, callback2));
    }

    public boolean isSpeakerphoneOn() {
        Boolean bool = this.isSpeakerphoneOn;
        if (bool == null) {
            return getAudioManager().isSpeakerphoneOn();
        }
        return bool.booleanValue();
    }

    public void setSpeakerphoneOn(boolean z10) {
        this.isSpeakerphoneOn = Boolean.valueOf(z10);
        Utilities.globalQueue.postRunnable(new ah.u(17, getAudioManager(), z10));
    }

    private VoipAudioManager() {
    }
}

package org.telegram.messenger.voip;

import android.media.AudioManager;
import me.vkryl.android.util.ClickHelper$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.EmojiView$$ExternalSyntheticLambda34;

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

    public static void lambda$isBluetoothAndSpeakerOnAsync$1(Utilities.Callback2 callback2, boolean z, boolean z2) {
        callback2.run(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public void lambda$isBluetoothAndSpeakerOnAsync$2(Utilities.Callback2 callback2) {
        AudioManager audioManager = getAudioManager();
        AndroidUtilities.runOnUIThread(new EmojiView$$ExternalSyntheticLambda34(callback2, audioManager.isBluetoothScoOn(), audioManager.isSpeakerphoneOn(), 3));
    }

    public void isBluetoothAndSpeakerOnAsync(Utilities.Callback2<Boolean, Boolean> callback2) {
        Utilities.globalQueue.postRunnable(new ClickHelper$$ExternalSyntheticLambda0(22, this, callback2));
    }

    public boolean isSpeakerphoneOn() {
        Boolean bool = this.isSpeakerphoneOn;
        return bool == null ? getAudioManager().isSpeakerphoneOn() : bool.booleanValue();
    }

    public void setSpeakerphoneOn(boolean z) {
        this.isSpeakerphoneOn = Boolean.valueOf(z);
        Utilities.globalQueue.postRunnable(new FileLoader$$ExternalSyntheticLambda1(9, getAudioManager(), z));
    }

    private VoipAudioManager() {
    }
}

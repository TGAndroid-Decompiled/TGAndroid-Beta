package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;

public class VoipAudioManager {
    private Boolean isSpeakerphoneOn;

    private VoipAudioManager() {
    }

    private static final class InstanceHolder {
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
                VoipAudioManager.m1209$r8$lambda$GkupENbEtcGx9B_eS_5XMimzM(this.f$0, callback2);
            }
        });
    }

    public static void m1209$r8$lambda$GkupENbEtcGx9B_eS_5XMimzM(VoipAudioManager voipAudioManager, final Utilities.Callback2 callback2) {
        AudioManager audioManager = voipAudioManager.getAudioManager();
        final boolean zIsBluetoothScoOn = audioManager.isBluetoothScoOn();
        final boolean zIsSpeakerphoneOn = audioManager.isSpeakerphoneOn();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                callback2.run(Boolean.valueOf(zIsBluetoothScoOn), Boolean.valueOf(zIsSpeakerphoneOn));
            }
        });
    }

    private AudioManager getAudioManager() {
        return (AudioManager) ApplicationLoader.applicationContext.getSystemService("audio");
    }
}

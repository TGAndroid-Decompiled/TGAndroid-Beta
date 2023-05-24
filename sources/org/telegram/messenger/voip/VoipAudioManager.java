package org.telegram.messenger.voip;

import android.media.AudioManager;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;
import org.webrtc.MediaStreamTrack;
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

    private AudioManager getAudioManager() {
        return (AudioManager) ApplicationLoader.applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
    }
}

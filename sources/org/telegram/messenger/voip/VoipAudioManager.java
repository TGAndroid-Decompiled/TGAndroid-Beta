package org.telegram.messenger.voip;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
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

    public static boolean isBluetoothDevice(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return false;
        }
        int type = audioDeviceInfo.getType();
        if (type == 7) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28 && type == 23) {
            return true;
        }
        if (i10 < 31 || (type != 26 && type != 27)) {
            return false;
        }
        return true;
    }

    public static void lambda$isBluetoothAndSpeakerOnAsync$3(Utilities.Callback2 callback2, boolean z10, boolean z11) {
        callback2.run(Boolean.valueOf(z10), Boolean.valueOf(z11));
    }

    public void lambda$isBluetoothAndSpeakerOnAsync$4(Utilities.Callback2 callback2) {
        AndroidUtilities.runOnUIThread(new org.telegram.messenger.video.k(callback2, isBluetoothOn(), getAudioManager().isSpeakerphoneOn(), 2));
    }

    public static void lambda$stopBluetooth$2(AudioManager audioManager) {
        if (isBluetoothDevice(audioManager.getCommunicationDevice())) {
            audioManager.clearCommunicationDevice();
        }
    }

    public AudioDeviceInfo findBluetoothDevice() {
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        for (AudioDeviceInfo audioDeviceInfo : getAudioManager().getAvailableCommunicationDevices()) {
            AudioDeviceInfo d = j2.e.d(audioDeviceInfo);
            if (isBluetoothDevice(d)) {
                return d;
            }
        }
        return null;
    }

    public void isBluetoothAndSpeakerOnAsync(Utilities.Callback2<Boolean, Boolean> callback2) {
        Utilities.globalQueue.postRunnable(new ki.h0(25, this, callback2));
    }

    public boolean isBluetoothOn() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            return isBluetoothDevice(audioManager.getCommunicationDevice());
        }
        return audioManager.isBluetoothScoOn();
    }

    public boolean isSpeakerphoneOn() {
        Boolean bool = this.isSpeakerphoneOn;
        if (bool == null) {
            return getAudioManager().isSpeakerphoneOn();
        }
        return bool.booleanValue();
    }

    public void setBluetoothOn(boolean z10) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (z10) {
                startBluetooth();
                return;
            } else {
                stopBluetooth();
                return;
            }
        }
        getAudioManager().setBluetoothScoOn(z10);
    }

    public void setSpeakerphoneOn(boolean z10) {
        this.isSpeakerphoneOn = Boolean.valueOf(z10);
        Utilities.globalQueue.postRunnable(new bi.f(17, getAudioManager(), z10));
    }

    public void startBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            AudioDeviceInfo findBluetoothDevice = findBluetoothDevice();
            if (findBluetoothDevice == null) {
                return;
            }
            this.isSpeakerphoneOn = Boolean.FALSE;
            Utilities.globalQueue.postRunnable(new ki.h0(24, audioManager, findBluetoothDevice));
            return;
        }
        audioManager.startBluetoothSco();
    }

    public void stopBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            Utilities.globalQueue.postRunnable(new t0(audioManager, 2));
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    private VoipAudioManager() {
    }
}

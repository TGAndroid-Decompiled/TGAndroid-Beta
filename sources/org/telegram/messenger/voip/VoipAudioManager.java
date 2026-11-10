package org.telegram.messenger.voip;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import bi.k1;
import li.j3;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.v10;
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
        return (AudioManager) org.telegram.messenger.t0.f25570b.getSystemService("audio");
    }

    public static boolean isBluetoothDevice(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return false;
        }
        int type = audioDeviceInfo.getType();
        if (type == 7) {
            return true;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 28 && type == 23) {
            return true;
        }
        if (i7 < 31 || (type != 26 && type != 27)) {
            return false;
        }
        return true;
    }

    public static void lambda$isBluetoothAndSpeakerOnAsync$3(v10 v10Var, boolean z9, boolean z10) {
        v10Var.a(Boolean.valueOf(z9), Boolean.valueOf(z10));
    }

    public void lambda$isBluetoothAndSpeakerOnAsync$4(v10 v10Var) {
        org.telegram.messenger.g0.h3(new h2.n0(v10Var, isBluetoothOn(), getAudioManager().isSpeakerphoneOn(), 3));
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
            if (isBluetoothDevice(audioDeviceInfo)) {
                return audioDeviceInfo;
            }
        }
        return null;
    }

    public void isBluetoothAndSpeakerOnAsync(v10 v10Var) {
        Utilities.f21341e.c(new j3(28, this, v10Var));
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

    public void setBluetoothOn(boolean z9) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (z9) {
                startBluetooth();
                return;
            } else {
                stopBluetooth();
                return;
            }
        }
        getAudioManager().setBluetoothScoOn(z9);
    }

    public void setSpeakerphoneOn(boolean z9) {
        this.isSpeakerphoneOn = Boolean.valueOf(z9);
        Utilities.f21341e.c(new k1(16, getAudioManager(), z9));
    }

    public void startBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            AudioDeviceInfo findBluetoothDevice = findBluetoothDevice();
            if (findBluetoothDevice == null) {
                return;
            }
            this.isSpeakerphoneOn = Boolean.FALSE;
            Utilities.f21341e.c(new j3(27, audioManager, findBluetoothDevice));
            return;
        }
        audioManager.startBluetoothSco();
    }

    public void stopBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            Utilities.f21341e.c(new q0(audioManager, 2));
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    private VoipAudioManager() {
    }
}

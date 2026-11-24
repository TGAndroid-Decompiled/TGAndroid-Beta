package org.telegram.messenger.voip;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
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
        return (AudioManager) org.telegram.messenger.a.b.getSystemService("audio");
    }

    public static boolean isBluetoothDevice(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return false;
        }
        int type = audioDeviceInfo.getType();
        if (type == 7) {
            return true;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 28 && type == 23) {
            return true;
        }
        if (i < 31 || (type != 26 && type != 27)) {
            return false;
        }
        return true;
    }

    public static void lambda$isBluetoothAndSpeakerOnAsync$3(jac jacVar, boolean z, boolean z2) {
        jacVar.a(Boolean.valueOf(z), Boolean.valueOf(z2));
    }

    public void lambda$isBluetoothAndSpeakerOnAsync$4(jac jacVar) {
        gm.c3(new c04(jacVar, isBluetoothOn(), getAudioManager().isSpeakerphoneOn(), (byte) 4));
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

    public void isBluetoothAndSpeakerOnAsync(jac jacVar) {
        Utilities.e.c(new qhc(this, jacVar, (byte) 9));
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

    public void setBluetoothOn(boolean z) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (z) {
                startBluetooth();
                return;
            } else {
                stopBluetooth();
                return;
            }
        }
        getAudioManager().setBluetoothScoOn(z);
    }

    public void setSpeakerphoneOn(boolean z) {
        this.isSpeakerphoneOn = Boolean.valueOf(z);
        Utilities.e.c(new n28((byte) 27, getAudioManager(), z));
    }

    public void startBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            AudioDeviceInfo findBluetoothDevice = findBluetoothDevice();
            if (findBluetoothDevice == null) {
                return;
            }
            this.isSpeakerphoneOn = Boolean.FALSE;
            Utilities.e.c(new qhc(audioManager, findBluetoothDevice, (byte) 8));
            return;
        }
        audioManager.startBluetoothSco();
    }

    public void stopBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            Utilities.e.c(new rjc(audioManager, (byte) 1));
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    private VoipAudioManager() {
    }
}

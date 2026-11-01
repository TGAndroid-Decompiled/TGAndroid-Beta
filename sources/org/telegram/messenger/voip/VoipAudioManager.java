package org.telegram.messenger.voip;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.k20;
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
        return (AudioManager) org.telegram.messenger.w0.f18945b.getSystemService("audio");
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

    public static void lambda$isBluetoothAndSpeakerOnAsync$3(k20 k20Var, boolean z10, boolean z11) {
        k20Var.a(Boolean.valueOf(z10), Boolean.valueOf(z11));
    }

    public void lambda$isBluetoothAndSpeakerOnAsync$4(k20 k20Var) {
        org.telegram.messenger.i0.g3(new e2.m0(k20Var, isBluetoothOn(), getAudioManager().isSpeakerphoneOn(), 3));
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

    public void isBluetoothAndSpeakerOnAsync(k20 k20Var) {
        Utilities.e.c(new mh.k(21, this, k20Var));
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
        Utilities.e.c(new k2.v(6, getAudioManager(), z10));
    }

    public void startBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            AudioDeviceInfo findBluetoothDevice = findBluetoothDevice();
            if (findBluetoothDevice == null) {
                return;
            }
            this.isSpeakerphoneOn = Boolean.FALSE;
            Utilities.e.c(new mh.k(20, audioManager, findBluetoothDevice));
            return;
        }
        audioManager.startBluetoothSco();
    }

    public void stopBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            Utilities.e.c(new w0(audioManager, 2));
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    private VoipAudioManager() {
    }
}

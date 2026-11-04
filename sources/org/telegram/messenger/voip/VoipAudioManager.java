package org.telegram.messenger.voip;

import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.os.Build;
import ci.e1;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.n10;
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
        return (AudioManager) org.telegram.messenger.t0.f25457b.getSystemService("audio");
    }

    public static boolean isBluetoothDevice(AudioDeviceInfo audioDeviceInfo) {
        if (audioDeviceInfo == null) {
            return false;
        }
        int type = audioDeviceInfo.getType();
        if (type == 7) {
            return true;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 28 && type == 23) {
            return true;
        }
        if (i3 < 31 || (type != 26 && type != 27)) {
            return false;
        }
        return true;
    }

    public static void lambda$isBluetoothAndSpeakerOnAsync$3(n10 n10Var, boolean z10, boolean z11) {
        n10Var.a(Boolean.valueOf(z10), Boolean.valueOf(z11));
    }

    public void lambda$isBluetoothAndSpeakerOnAsync$4(n10 n10Var) {
        org.telegram.messenger.g0.h3(new g2.o0(n10Var, isBluetoothOn(), getAudioManager().isSpeakerphoneOn(), 3));
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

    public void isBluetoothAndSpeakerOnAsync(n10 n10Var) {
        Utilities.f21387e.c(new l0(2, this, n10Var));
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
        Utilities.f21387e.c(new e1(16, getAudioManager(), z10));
    }

    public void startBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            AudioDeviceInfo findBluetoothDevice = findBluetoothDevice();
            if (findBluetoothDevice == null) {
                return;
            }
            this.isSpeakerphoneOn = Boolean.FALSE;
            Utilities.f21387e.c(new l0(1, audioManager, findBluetoothDevice));
            return;
        }
        audioManager.startBluetoothSco();
    }

    public void stopBluetooth() {
        AudioManager audioManager = getAudioManager();
        if (Build.VERSION.SDK_INT >= 31) {
            Utilities.f21387e.c(new q0(audioManager, 2));
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    private VoipAudioManager() {
    }
}

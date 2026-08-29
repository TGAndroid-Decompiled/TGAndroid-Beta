package l3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
public abstract class c0 {
    public static void a(AudioTrack audioTrack, e0 e0Var) {
        AudioDeviceInfo audioDeviceInfo;
        if (e0Var == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = e0Var.f14082a;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}

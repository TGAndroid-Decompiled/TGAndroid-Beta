package j3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
public abstract class b0 {
    public static void a(AudioTrack audioTrack, d0 d0Var) {
        AudioDeviceInfo audioDeviceInfo;
        if (d0Var == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = d0Var.f13224a;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}

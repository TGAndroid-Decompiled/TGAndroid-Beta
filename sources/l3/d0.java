package l3;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
public abstract class d0 {
    public static void a(AudioTrack audioTrack, f0 f0Var) {
        AudioDeviceInfo audioDeviceInfo;
        if (f0Var == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = f0Var.f11500a;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}

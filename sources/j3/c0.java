package j3;

import android.media.AudioTrack;

public abstract class c0 {
    public static void a(AudioTrack audioTrack, e0 e0Var) {
        audioTrack.setPreferredDevice(e0Var == null ? null : e0Var.f12326a);
    }
}

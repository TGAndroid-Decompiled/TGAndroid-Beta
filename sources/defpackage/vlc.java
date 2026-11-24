package defpackage;

import android.media.VolumeProvider;
public abstract class vlc {
    public static void a(VolumeProvider volumeProvider, int i) {
        volumeProvider.setCurrentVolume(i);
    }
}

package defpackage;

import android.media.VolumeProvider;
public abstract class ioc {
    public static void a(VolumeProvider volumeProvider, int i) {
        volumeProvider.setCurrentVolume(i);
    }
}

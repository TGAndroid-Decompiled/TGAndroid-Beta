package e0;

import android.media.AudioAttributes;
public abstract class s {
    public static AudioAttributes a(AudioAttributes.Builder builder) {
        return builder.build();
    }

    public static AudioAttributes.Builder b() {
        return new AudioAttributes.Builder();
    }

    public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i9) {
        return builder.setContentType(i9);
    }

    public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i9) {
        return builder.setLegacyStreamType(i9);
    }

    public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i9) {
        return builder.setUsage(i9);
    }
}

package e2;

import android.media.AudioAttributes;
public abstract class d {
    public static void a(AudioAttributes.Builder builder, boolean z9) {
        builder.setIsContentSpatialized(z9);
    }

    public static void b(AudioAttributes.Builder builder, int i7) {
        builder.setSpatializationBehavior(i7);
    }
}

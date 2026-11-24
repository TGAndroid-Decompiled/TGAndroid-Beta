package defpackage;

import android.media.AudioAttributes;
public abstract class n00 {
    public static void a(AudioAttributes.Builder builder, boolean z) {
        builder.setIsContentSpatialized(z);
    }

    public static void b(AudioAttributes.Builder builder, int i) {
        builder.setSpatializationBehavior(i);
    }
}

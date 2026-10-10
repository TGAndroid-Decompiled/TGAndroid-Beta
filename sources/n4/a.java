package n4;

import android.media.AudioAttributes;
import j$.util.Objects;
public class a {
    public final AudioAttributes f16546a;

    public a(AudioAttributes audioAttributes) {
        this.f16546a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Objects.equals(this.f16546a, ((a) obj).f16546a);
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.f16546a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f16546a;
    }
}

package n4;

import android.media.AudioAttributes;
import j$.util.Objects;
public class a {
    public final AudioAttributes f15152a;

    public a(AudioAttributes audioAttributes) {
        this.f15152a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Objects.equals(this.f15152a, ((a) obj).f15152a);
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.f15152a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f15152a;
    }
}

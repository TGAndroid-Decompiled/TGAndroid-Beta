package n4;

import android.media.AudioAttributes;
import j$.util.Objects;
public class a {
    public final AudioAttributes f15191a;

    public a(AudioAttributes audioAttributes) {
        this.f15191a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Objects.equals(this.f15191a, ((a) obj).f15191a);
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.f15191a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f15191a;
    }
}

package n4;

import android.media.AudioAttributes;
import j$.util.Objects;
public class a {
    public final AudioAttributes f15157a;

    public a(AudioAttributes audioAttributes) {
        this.f15157a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Objects.equals(this.f15157a, ((a) obj).f15157a);
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.f15157a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f15157a;
    }
}

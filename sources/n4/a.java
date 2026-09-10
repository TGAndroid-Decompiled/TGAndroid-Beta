package n4;

import android.media.AudioAttributes;
import j$.util.Objects;
public class a {
    public final AudioAttributes f13758a;

    public a(AudioAttributes audioAttributes) {
        this.f13758a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Objects.equals(this.f13758a, ((a) obj).f13758a);
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.f13758a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f13758a;
    }
}

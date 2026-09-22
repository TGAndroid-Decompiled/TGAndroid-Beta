package n4;

import android.media.AudioAttributes;
import j$.util.Objects;
public class a {
    public final AudioAttributes f14926a;

    public a(AudioAttributes audioAttributes) {
        this.f14926a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Objects.equals(this.f14926a, ((a) obj).f14926a);
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.f14926a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f14926a;
    }
}

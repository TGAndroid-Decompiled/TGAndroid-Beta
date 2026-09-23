package n4;

import android.media.AudioAttributes;
import j$.util.Objects;
public class a {
    public final AudioAttributes f14903a;

    public a(AudioAttributes audioAttributes) {
        this.f14903a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Objects.equals(this.f14903a, ((a) obj).f14903a);
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.f14903a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f14903a;
    }
}

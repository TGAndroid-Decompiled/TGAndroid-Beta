package n4;

import android.media.AudioAttributes;
import j$.util.Objects;
public class a {
    public final AudioAttributes f16451a;

    public a(AudioAttributes audioAttributes) {
        this.f16451a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Objects.equals(this.f16451a, ((a) obj).f16451a);
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.f16451a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f16451a;
    }
}

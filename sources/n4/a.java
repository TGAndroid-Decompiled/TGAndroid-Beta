package n4;

import android.media.AudioAttributes;
import j$.util.Objects;
public class a {
    public final AudioAttributes f16291a;

    public a(AudioAttributes audioAttributes) {
        this.f16291a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Objects.equals(this.f16291a, ((a) obj).f16291a);
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.f16291a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f16291a;
    }
}

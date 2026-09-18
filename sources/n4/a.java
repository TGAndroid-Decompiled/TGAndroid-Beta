package n4;

import android.media.AudioAttributes;
import j$.util.Objects;
public class a {
    public final AudioAttributes f14938a;

    public a(AudioAttributes audioAttributes) {
        this.f14938a = audioAttributes;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return Objects.equals(this.f14938a, ((a) obj).f14938a);
    }

    public final int hashCode() {
        AudioAttributes audioAttributes = this.f14938a;
        audioAttributes.getClass();
        return audioAttributes.hashCode();
    }

    public final String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f14938a;
    }
}

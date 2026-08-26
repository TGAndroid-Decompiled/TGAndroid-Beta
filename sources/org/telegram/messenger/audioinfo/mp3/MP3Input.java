package org.telegram.messenger.audioinfo.mp3;

import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import org.telegram.messenger.audioinfo.util.PositionInputStream;

public final class MP3Input extends PositionInputStream {
    public int exceptionsCount;

    public final String toString() {
        return Fragment$$ExternalSyntheticOutline0.m(new StringBuilder("mp3[pos="), this.position, "]");
    }
}

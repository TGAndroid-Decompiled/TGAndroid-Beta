package org.telegram.messenger.audioinfo.mp3;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import org.telegram.messenger.audioinfo.util.PositionInputStream;

public final class MP3Input extends PositionInputStream {
    public int exceptionsCount;

    public final String toString() {
        return SurfaceContainer$$ExternalSyntheticOutline0.m(new StringBuilder("mp3[pos="), this.position, "]");
    }
}

package org.telegram.messenger.audioinfo.m4a;

import java.io.InputStream;
import org.telegram.messenger.audioinfo.util.PositionInputStream;

public final class MP4Input extends MP4Box {
    public MP4Input(InputStream inputStream) {
        super(new PositionInputStream(inputStream), null, "");
    }

    public MP4Atom nextChildUpTo(String str) {
        MP4Atom mP4AtomNextChild;
        do {
            mP4AtomNextChild = nextChild();
        } while (!mP4AtomNextChild.getType().matches(str));
        return mP4AtomNextChild;
    }

    public String toString() {
        return "mp4[pos=" + getPosition() + "]";
    }
}

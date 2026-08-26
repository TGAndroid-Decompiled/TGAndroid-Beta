package org.telegram.messenger.audioinfo.mp3;

import java.util.logging.Logger;
import org.telegram.messenger.audioinfo.AudioInfo;

public final class MP3Info extends AudioInfo {
    public static final Logger LOGGER = Logger.getLogger(MP3Info.class.getName());

    public final class AnonymousClass1 {
        public long stopPosition;

        public boolean stopRead(MP3Input mP3Input) {
            return mP3Input.position == this.stopPosition && ID3v1Info.isID3v1StartPosition(mP3Input);
        }
    }

    public MP3Info(java.io.BufferedInputStream r25, long r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.audioinfo.mp3.MP3Info.<init>(java.io.BufferedInputStream, long):void");
    }

    public static long calculateDuration(org.telegram.messenger.audioinfo.mp3.MP3Input r32, long r33, org.telegram.messenger.audioinfo.mp3.MP3Info.AnonymousClass1 r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.audioinfo.mp3.MP3Info.calculateDuration(org.telegram.messenger.audioinfo.mp3.MP3Input, long, org.telegram.messenger.audioinfo.mp3.MP3Info$1):long");
    }
}

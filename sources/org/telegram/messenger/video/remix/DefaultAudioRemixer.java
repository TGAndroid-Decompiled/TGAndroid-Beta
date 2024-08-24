package org.telegram.messenger.video.remix;

import java.nio.ShortBuffer;

public class DefaultAudioRemixer implements AudioRemixer {
    @Override
    public void remix(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2) {
        AudioRemixer audioRemixer;
        if (i == 6) {
            audioRemixer = AudioRemixer.SURROUND;
        } else if (i > i2) {
            audioRemixer = AudioRemixer.DOWNMIX;
        } else if (i < i2) {
            audioRemixer = AudioRemixer.UPMIX;
        } else {
            audioRemixer = AudioRemixer.PASSTHROUGH;
        }
        audioRemixer.remix(shortBuffer, i, shortBuffer2, i2);
    }

    @Override
    public int getRemixedSize(int i, int i2, int i3) {
        AudioRemixer audioRemixer;
        if (i2 == 6) {
            audioRemixer = AudioRemixer.SURROUND;
        } else if (i2 > i3) {
            audioRemixer = AudioRemixer.DOWNMIX;
        } else if (i2 < i3) {
            audioRemixer = AudioRemixer.UPMIX;
        } else {
            audioRemixer = AudioRemixer.PASSTHROUGH;
        }
        return audioRemixer.getRemixedSize(i, i2, i3);
    }
}

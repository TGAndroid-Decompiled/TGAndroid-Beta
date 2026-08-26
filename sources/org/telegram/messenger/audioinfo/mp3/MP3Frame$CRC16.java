package org.telegram.messenger.audioinfo.mp3;

public final class MP3Frame$CRC16 {
    public short crc;

    public final void update(byte b) {
        int i = 128;
        do {
            short s = this.crc;
            if (((Short.MIN_VALUE & s) == 0) ^ ((b & i) == 0)) {
                this.crc = (short) (((short) (s << 1)) ^ 32773);
            } else {
                this.crc = (short) (s << 1);
            }
            i >>>= 1;
        } while (i != 0);
    }
}

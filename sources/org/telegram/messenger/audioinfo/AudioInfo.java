package org.telegram.messenger.audioinfo;

import android.graphics.Bitmap;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import org.telegram.messenger.audioinfo.m4a.M4AInfo;
import org.telegram.messenger.audioinfo.mp3.MP3Info;

public abstract class AudioInfo {
    public String album;
    public String albumArtist;
    public String artist;
    public String brand;
    public String comment;
    public String composer;
    public String copyright;
    public Bitmap cover;
    public File coverFile;
    public short disc;
    public long duration;
    public String genre;
    public String lyrics;
    public Bitmap smallCover;
    public String title;
    public short track;
    public short year;

    public static AudioInfo getAudioInfo(File file) {
        byte b;
        try {
            byte[] bArr = new byte[12];
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
            randomAccessFile.readFully(bArr, 0, 8);
            randomAccessFile.close();
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            if (bArr[4] == 102 && bArr[5] == 116 && bArr[6] == 121 && bArr[7] == 112) {
                return new M4AInfo(bufferedInputStream);
            }
            if (bArr[0] == 102 && bArr[1] == 76 && bArr[2] == 97 && bArr[3] == 99) {
                OtherAudioInfo otherAudioInfo = new OtherAudioInfo(file);
                if (otherAudioInfo.failed) {
                    return null;
                }
                return otherAudioInfo;
            }
            if (!file.getAbsolutePath().endsWith("mp3") && (((b = bArr[0]) != 73 || bArr[1] != 68 || bArr[2] != 51) && (b != 84 || bArr[1] != 65 || bArr[2] != 71))) {
                OtherAudioInfo otherAudioInfo2 = new OtherAudioInfo(file);
                if (otherAudioInfo2.failed) {
                    return null;
                }
                return otherAudioInfo2;
            }
            return new MP3Info(bufferedInputStream, file.length());
        } catch (Exception unused) {
            return null;
        }
    }
}

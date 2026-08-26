package org.telegram.messenger.audioinfo.mp3;

import java.io.FilterInputStream;
import java.io.IOException;
import org.telegram.messenger.audioinfo.AudioInfo;

public abstract class ID3v1Info extends AudioInfo {
    public static String extractString(int i, int i2, byte[] bArr) {
        try {
            String str = new String(bArr, i, i2, "ISO-8859-1");
            int iIndexOf = str.indexOf(0);
            return iIndexOf < 0 ? str : str.substring(0, iIndexOf);
        } catch (Exception unused) {
            return "";
        }
    }

    public static boolean isID3v1StartPosition(FilterInputStream filterInputStream) throws IOException {
        filterInputStream.mark(3);
        try {
            return filterInputStream.read() == 84 && filterInputStream.read() == 65 && filterInputStream.read() == 71;
        } finally {
            filterInputStream.reset();
        }
    }
}

package org.telegram.messenger.audioinfo.mp3;

import java.nio.charset.Charset;

public enum ID3v2Encoding {
    ISO_8859_1(Charset.forName("ISO-8859-1"), 1),
    UTF_16(Charset.forName("UTF-16"), 2),
    UTF_16BE(Charset.forName("UTF-16BE"), 2),
    UTF_8(Charset.forName("UTF-8"), 1);
    
    private final Charset charset;
    private final int zeroBytes;

    ID3v2Encoding(Charset charset, int i) {
        this.charset = charset;
        this.zeroBytes = i;
    }

    public Charset getCharset() {
        return this.charset;
    }

    public int getZeroBytes() {
        return this.zeroBytes;
    }
}

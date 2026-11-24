package defpackage;

import java.io.RandomAccessFile;
public final class ps7 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ps7(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.b = randomAccessFile.readUnsignedShort();
        this.c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}

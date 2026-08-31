package dg;

import java.io.RandomAccessFile;
public final class r0 {
    public final int f4648a;
    public final int f4649b;
    public final int f4650c;
    public final int d;

    public r0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f4648a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f4649b = randomAccessFile.readUnsignedShort();
        this.f4650c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}

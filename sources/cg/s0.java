package cg;

import java.io.RandomAccessFile;
public final class s0 {
    public final int f2496a;
    public final int f2497b;
    public final int f2498c;
    public final int d;

    public s0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f2496a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f2497b = randomAccessFile.readUnsignedShort();
        this.f2498c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}

package cg;

import java.io.RandomAccessFile;
public final class s0 {
    public final int f2513a;
    public final int f2514b;
    public final int f2515c;
    public final int d;

    public s0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f2513a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f2514b = randomAccessFile.readUnsignedShort();
        this.f2515c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}

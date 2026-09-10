package og;

import java.io.RandomAccessFile;
public final class l0 {
    public final int f14415a;
    public final int f14416b;
    public final int f14417c;
    public final int d;

    public l0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f14415a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f14416b = randomAccessFile.readUnsignedShort();
        this.f14417c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}

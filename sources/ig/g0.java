package ig;

import java.io.RandomAccessFile;
public final class g0 {
    public final int f8311a;
    public final int f8312b;
    public final int f8313c;
    public final int d;

    public g0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f8311a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f8312b = randomAccessFile.readUnsignedShort();
        this.f8313c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}

package ig;

import java.io.RandomAccessFile;
public final class g0 {
    public final int f8310a;
    public final int f8311b;
    public final int f8312c;
    public final int d;

    public g0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f8310a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f8311b = randomAccessFile.readUnsignedShort();
        this.f8312c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}

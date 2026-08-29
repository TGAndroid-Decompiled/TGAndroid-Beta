package ag;

import java.io.RandomAccessFile;
public final class t0 {
    public final int f655a;
    public final int f656b;
    public final int f657c;
    public final int d;

    public t0(RandomAccessFile randomAccessFile) {
        randomAccessFile.readUnsignedShort();
        this.f655a = randomAccessFile.readUnsignedShort();
        randomAccessFile.readUnsignedShort();
        this.f656b = randomAccessFile.readUnsignedShort();
        this.f657c = randomAccessFile.readUnsignedShort();
        this.d = randomAccessFile.readUnsignedShort();
    }
}

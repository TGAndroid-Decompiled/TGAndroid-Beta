package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class cx8 implements Closeable {
    public static final Logger h = Logger.getLogger(cx8.class.getName());
    public final RandomAccessFile a;
    public final int b;
    public final int c;
    public final zw8 d;
    public final zw8 e;
    public final byte[] f = new byte[16];

    public cx8(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i2 = 0; i2 < 4; i2++) {
                    int i3 = iArr[i2];
                    bArr[i] = (byte) (i3 >> 24);
                    bArr[i + 1] = (byte) (i3 >> 16);
                    bArr[i + 2] = (byte) (i3 >> 8);
                    bArr[i + 3] = (byte) i3;
                    i += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    k93.f("Rename failed!");
                    throw null;
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        byte[] bArr2 = this.f;
        randomAccessFile2.readFully(bArr2);
        int c = c(0, bArr2);
        this.b = c;
        if (c <= randomAccessFile2.length()) {
            this.c = c(4, bArr2);
            int c2 = c(8, bArr2);
            int c3 = c(12, bArr2);
            this.d = b(c2);
            this.e = b(c3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int c(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public final synchronized void a(bx8 bx8Var) {
        int i = this.d.b;
        for (int i2 = 0; i2 < this.c; i2++) {
            zw8 b = b(i);
            bx8Var.a(new ax8(this, b), b.c);
            i = d(b.b + 4 + b.c);
        }
    }

    public final zw8 b(int i) {
        if (i == 0) {
            return zw8.d;
        }
        RandomAccessFile randomAccessFile = this.a;
        randomAccessFile.seek(i);
        return new zw8(i, randomAccessFile.readInt(), (byte) 0);
    }

    @Override
    public final synchronized void close() {
        this.a.close();
    }

    public final int d(int i) {
        int i2 = this.b;
        if (i < i2) {
            return i;
        }
        return (i + 16) - i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(cx8.class.getSimpleName());
        sb.append("[fileLength=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", first=");
        sb.append(this.d);
        sb.append(", last=");
        sb.append(this.e);
        sb.append(", element lengths=[");
        try {
            a(new e31(sb, (byte) 10));
        } catch (IOException e) {
            h.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb.append("]]");
        return sb.toString();
    }
}

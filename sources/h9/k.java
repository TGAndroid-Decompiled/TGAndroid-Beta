package h9;

import c2.u;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;
public final class k implements Closeable {
    public static final Logger h = Logger.getLogger(k.class.getName());
    public final RandomAccessFile f7962a;
    public final int f7963b;
    public final int f7964c;
    public final h d;
    public final h f7965e;
    public final byte[] f7966f = new byte[16];

    public k(File file) {
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    int i12 = iArr[i11];
                    bArr[i10] = (byte) (i12 >> 24);
                    bArr[i10 + 1] = (byte) (i12 >> 16);
                    bArr[i10 + 2] = (byte) (i12 >> 8);
                    bArr[i10 + 3] = (byte) i12;
                    i10 += 4;
                }
                randomAccessFile.write(bArr);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f7962a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        byte[] bArr2 = this.f7966f;
        randomAccessFile2.readFully(bArr2);
        int c3 = c(0, bArr2);
        this.f7963b = c3;
        if (c3 <= randomAccessFile2.length()) {
            this.f7964c = c(4, bArr2);
            int c6 = c(8, bArr2);
            int c10 = c(12, bArr2);
            this.d = b(c6);
            this.f7965e = b(c10);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f7963b + ", Actual length: " + randomAccessFile2.length());
    }

    public static int c(int i10, byte[] bArr) {
        return ((bArr[i10] & 255) << 24) + ((bArr[i10 + 1] & 255) << 16) + ((bArr[i10 + 2] & 255) << 8) + (bArr[i10 + 3] & 255);
    }

    public final synchronized void a(j jVar) {
        int i10 = this.d.f7957a;
        for (int i11 = 0; i11 < this.f7964c; i11++) {
            h b10 = b(i10);
            jVar.a(new i(this, b10), b10.f7958b);
            i10 = d(b10.f7957a + 4 + b10.f7958b);
        }
    }

    public final h b(int i10) {
        if (i10 == 0) {
            return h.f7956c;
        }
        RandomAccessFile randomAccessFile = this.f7962a;
        randomAccessFile.seek(i10);
        return new h(i10, randomAccessFile.readInt());
    }

    @Override
    public final synchronized void close() {
        this.f7962a.close();
    }

    public final int d(int i10) {
        int i11 = this.f7963b;
        if (i10 < i11) {
            return i10;
        }
        return (i10 + 16) - i11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(k.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f7963b);
        sb2.append(", size=");
        sb2.append(this.f7964c);
        sb2.append(", first=");
        sb2.append(this.d);
        sb2.append(", last=");
        sb2.append(this.f7965e);
        sb2.append(", element lengths=[");
        try {
            a(new u(sb2));
        } catch (IOException e10) {
            h.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}

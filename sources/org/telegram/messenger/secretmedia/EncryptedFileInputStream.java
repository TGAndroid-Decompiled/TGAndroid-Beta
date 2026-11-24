package org.telegram.messenger.secretmedia;

import java.io.File;
import java.io.FileInputStream;
import java.io.RandomAccessFile;
import org.telegram.messenger.Utilities;
public class EncryptedFileInputStream extends FileInputStream {
    private static final int MODE_CBC = 1;
    private static final int MODE_CTR = 0;
    private int currentMode;
    private int fileOffset;
    private byte[] iv;
    private byte[] key;

    public EncryptedFileInputStream(File file, File file2) {
        super(file);
        this.key = new byte[32];
        this.iv = new byte[16];
        this.currentMode = 0;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
        randomAccessFile.read(this.key, 0, 32);
        randomAccessFile.read(this.iv, 0, 16);
        randomAccessFile.close();
    }

    public static void decryptBytesWithKeyFile(byte[] bArr, int i, int i2, File file) {
        byte[] bArr2 = new byte[32];
        byte[] bArr3 = new byte[16];
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        randomAccessFile.read(bArr2, 0, 32);
        randomAccessFile.read(bArr3, 0, 16);
        randomAccessFile.close();
        Utilities.aesCtrDecryptionByteArray(bArr, bArr2, bArr3, i, i2, 0);
    }

    @Override
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        byte[] bArr2;
        if (this.currentMode == 1 && this.fileOffset == 0) {
            super.read(new byte[32], 0, 32);
            Utilities.b(bArr, this.key, this.iv, i, i2, this.fileOffset, 0);
            this.fileOffset += 32;
            skip((bArr2[0] & 255) - 32);
        }
        int read = super.read(bArr, i, i2);
        int i4 = this.currentMode;
        if (i4 == 1) {
            i3 = i2;
            Utilities.b(bArr, this.key, this.iv, i, i3, this.fileOffset, 0);
        } else {
            i3 = i2;
            if (i4 == 0) {
                Utilities.aesCtrDecryptionByteArray(bArr, this.key, this.iv, i, i3, this.fileOffset);
            }
        }
        this.fileOffset += i3;
        return read;
    }

    @Override
    public long skip(long j) {
        this.fileOffset = (int) (this.fileOffset + j);
        return super.skip(j);
    }

    public static void decryptBytesWithKeyFile(byte[] bArr, int i, int i2, yw9 yw9Var) {
        Utilities.b(bArr, yw9Var.a, yw9Var.b, i, i2, 0, 0);
    }

    public EncryptedFileInputStream(File file, yw9 yw9Var) {
        super(file);
        byte[] bArr = new byte[32];
        this.key = bArr;
        this.iv = new byte[16];
        this.currentMode = 1;
        System.arraycopy(yw9Var.a, 0, bArr, 0, 32);
        byte[] bArr2 = yw9Var.b;
        byte[] bArr3 = this.iv;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr3.length);
    }
}

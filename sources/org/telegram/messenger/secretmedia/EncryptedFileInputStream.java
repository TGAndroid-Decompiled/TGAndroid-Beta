package org.telegram.messenger.secretmedia;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.telegram.messenger.SecureDocumentKey;
import org.telegram.messenger.Utilities;

public class EncryptedFileInputStream extends FileInputStream {
    private static final int MODE_CBC = 1;
    private static final int MODE_CTR = 0;
    private int currentMode;
    private int fileOffset;
    private byte[] f830iv;
    private byte[] key;

    public EncryptedFileInputStream(File file, File file2) throws Exception {
        super(file);
        this.key = new byte[32];
        this.f830iv = new byte[16];
        this.currentMode = 0;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
        randomAccessFile.read(this.key, 0, 32);
        randomAccessFile.read(this.f830iv, 0, 16);
        randomAccessFile.close();
    }

    public EncryptedFileInputStream(File file, SecureDocumentKey secureDocumentKey) throws Exception {
        super(file);
        byte[] bArr = new byte[32];
        this.key = bArr;
        this.f830iv = new byte[16];
        this.currentMode = 1;
        System.arraycopy(secureDocumentKey.file_key, 0, bArr, 0, bArr.length);
        byte[] bArr2 = secureDocumentKey.file_iv;
        byte[] bArr3 = this.f830iv;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr3.length);
    }

    @Override
    public int read(byte[] bArr, int i, int i2) throws IOException {
        byte[] bArr2;
        if (this.currentMode == 1 && this.fileOffset == 0) {
            super.read(new byte[32], 0, 32);
            Utilities.aesCbcEncryptionByteArraySafe(bArr, this.key, this.f830iv, i, i2, this.fileOffset, 0);
            this.fileOffset += 32;
            skip((bArr2[0] & 255) - 32);
        }
        int read = super.read(bArr, i, i2);
        int i3 = this.currentMode;
        if (i3 == 1) {
            Utilities.aesCbcEncryptionByteArraySafe(bArr, this.key, this.f830iv, i, i2, this.fileOffset, 0);
        } else if (i3 == 0) {
            Utilities.aesCtrDecryptionByteArray(bArr, this.key, this.f830iv, i, i2, this.fileOffset);
        }
        this.fileOffset += i2;
        return read;
    }

    @Override
    public long skip(long j) throws IOException {
        this.fileOffset = (int) (this.fileOffset + j);
        return super.skip(j);
    }

    public static void decryptBytesWithKeyFile(byte[] bArr, int i, int i2, SecureDocumentKey secureDocumentKey) {
        Utilities.aesCbcEncryptionByteArraySafe(bArr, secureDocumentKey.file_key, secureDocumentKey.file_iv, i, i2, 0, 0);
    }

    public static void decryptBytesWithKeyFile(byte[] bArr, int i, int i2, File file) throws Exception {
        byte[] bArr2 = new byte[32];
        byte[] bArr3 = new byte[16];
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        randomAccessFile.read(bArr2, 0, 32);
        randomAccessFile.read(bArr3, 0, 16);
        randomAccessFile.close();
        Utilities.aesCtrDecryptionByteArray(bArr, bArr2, bArr3, i, i2, 0);
    }
}

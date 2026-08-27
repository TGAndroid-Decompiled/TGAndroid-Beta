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
    private byte[] iv;
    private byte[] key;

    public EncryptedFileInputStream(File file, File file2) throws IOException {
        super(file);
        this.key = new byte[32];
        this.iv = new byte[16];
        this.currentMode = 0;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "r");
        randomAccessFile.read(this.key, 0, 32);
        randomAccessFile.read(this.iv, 0, 16);
        randomAccessFile.close();
    }

    public static void decryptBytesWithKeyFile(byte[] bArr, int i10, int i11, SecureDocumentKey secureDocumentKey) {
        Utilities.aesCbcEncryptionByteArraySafe(bArr, secureDocumentKey.file_key, secureDocumentKey.file_iv, i10, i11, 0, 0);
    }

    @Override
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12;
        if (this.currentMode == 1 && this.fileOffset == 0) {
            byte[] bArr2 = new byte[32];
            super.read(bArr2, 0, 32);
            Utilities.aesCbcEncryptionByteArraySafe(bArr, this.key, this.iv, i10, i11, this.fileOffset, 0);
            this.fileOffset += 32;
            skip((bArr2[0] & 255) - 32);
        }
        int i13 = super.read(bArr, i10, i11);
        int i14 = this.currentMode;
        if (i14 == 1) {
            i12 = i11;
            Utilities.aesCbcEncryptionByteArraySafe(bArr, this.key, this.iv, i10, i12, this.fileOffset, 0);
        } else {
            i12 = i11;
            if (i14 == 0) {
                Utilities.aesCtrDecryptionByteArray(bArr, this.key, this.iv, i10, i12, this.fileOffset);
            }
        }
        this.fileOffset += i12;
        return i13;
    }

    @Override
    public long skip(long j10) {
        this.fileOffset = (int) (((long) this.fileOffset) + j10);
        return super.skip(j10);
    }

    public static void decryptBytesWithKeyFile(byte[] bArr, int i10, int i11, File file) throws IOException {
        byte[] bArr2 = new byte[32];
        byte[] bArr3 = new byte[16];
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        randomAccessFile.read(bArr2, 0, 32);
        randomAccessFile.read(bArr3, 0, 16);
        randomAccessFile.close();
        Utilities.aesCtrDecryptionByteArray(bArr, bArr2, bArr3, i10, i11, 0);
    }

    public EncryptedFileInputStream(File file, SecureDocumentKey secureDocumentKey) {
        super(file);
        byte[] bArr = new byte[32];
        this.key = bArr;
        this.iv = new byte[16];
        this.currentMode = 1;
        System.arraycopy(secureDocumentKey.file_key, 0, bArr, 0, bArr.length);
        byte[] bArr2 = secureDocumentKey.file_iv;
        byte[] bArr3 = this.iv;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr3.length);
    }
}

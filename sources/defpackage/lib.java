package defpackage;

import org.telegram.tgnet.TLRPC;
public final class lib {
    public final long a;
    public final TLRPC.InputFile b;
    public final TLRPC.InputEncryptedFile c;
    public final byte[] d;
    public final byte[] e;

    public lib(long j, TLRPC.InputFile inputFile, TLRPC.InputEncryptedFile inputEncryptedFile, byte[] bArr, byte[] bArr2) {
        this.a = j;
        this.b = inputFile;
        this.c = inputEncryptedFile;
        this.d = bArr;
        this.e = bArr2;
    }
}

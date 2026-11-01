package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qw extends TLObject {
    public final rw f17823a;
    public final TLRPC.TL_secureFile f17824b;
    public final String f17825c;
    public TLRPC.TL_inputFile d;
    public final byte[] e;
    public final byte[] f17826f;
    public int f17827i;

    public qw(rw rwVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f17823a = rwVar;
        this.f17824b = tL_secureFile;
        this.f17825c = str;
        this.f17826f = bArr;
        this.e = bArr2;
    }
}

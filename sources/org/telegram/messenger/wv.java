package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wv extends TLObject {
    public final xv f26262a;
    public final TLRPC.TL_secureFile f26263b;
    public final String f26264c;
    public TLRPC.TL_inputFile d;
    public final byte[] f26265e;
    public final byte[] f26266f;
    public int f26267i;

    public wv(xv xvVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f26262a = xvVar;
        this.f26263b = tL_secureFile;
        this.f26264c = str;
        this.f26266f = bArr;
        this.f26265e = bArr2;
    }
}

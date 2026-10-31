package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class pw extends TLObject {
    public final qw f17488a;
    public final TLRPC.TL_secureFile f17489b;
    public final String f17490c;
    public TLRPC.TL_inputFile d;
    public final byte[] e;
    public final byte[] f17491f;
    public int f17492i;

    public pw(qw qwVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f17488a = qwVar;
        this.f17489b = tL_secureFile;
        this.f17490c = str;
        this.f17491f = bArr;
        this.e = bArr2;
    }
}

package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ew extends TLObject {
    public final fw f22265a;
    public final TLRPC.TL_secureFile f22266b;
    public final String f22267c;
    public TLRPC.TL_inputFile d;
    public final byte[] f22268e;
    public final byte[] f22269f;
    public int f22270i;

    public ew(fw fwVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f22265a = fwVar;
        this.f22266b = tL_secureFile;
        this.f22267c = str;
        this.f22269f = bArr;
        this.f22268e = bArr2;
    }
}

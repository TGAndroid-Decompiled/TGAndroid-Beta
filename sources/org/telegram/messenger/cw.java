package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cw extends TLObject {
    public final dw f22950a;
    public final TLRPC.TL_secureFile f22951b;
    public final String f22952c;
    public TLRPC.TL_inputFile d;
    public final byte[] f22953e;
    public final byte[] f22954f;
    public int f22955i;

    public cw(dw dwVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f22950a = dwVar;
        this.f22951b = tL_secureFile;
        this.f22952c = str;
        this.f22954f = bArr;
        this.f22953e = bArr2;
    }
}

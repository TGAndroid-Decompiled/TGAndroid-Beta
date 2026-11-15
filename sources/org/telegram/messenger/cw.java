package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cw extends TLObject {
    public final dw f22958a;
    public final TLRPC.TL_secureFile f22959b;
    public final String f22960c;
    public TLRPC.TL_inputFile d;
    public final byte[] f22961e;
    public final byte[] f22962f;
    public int f22963i;

    public cw(dw dwVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f22958a = dwVar;
        this.f22959b = tL_secureFile;
        this.f22960c = str;
        this.f22962f = bArr;
        this.f22961e = bArr2;
    }
}

package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ew extends TLObject {
    public final fw f22258a;
    public final TLRPC.TL_secureFile f22259b;
    public final String f22260c;
    public TLRPC.TL_inputFile d;
    public final byte[] f22261e;
    public final byte[] f22262f;
    public int f22263i;

    public ew(fw fwVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f22258a = fwVar;
        this.f22259b = tL_secureFile;
        this.f22260c = str;
        this.f22262f = bArr;
        this.f22261e = bArr2;
    }
}

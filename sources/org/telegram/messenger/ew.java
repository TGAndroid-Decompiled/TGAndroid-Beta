package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ew extends TLObject {
    public final fw f22284a;
    public final TLRPC.TL_secureFile f22285b;
    public final String f22286c;
    public TLRPC.TL_inputFile d;
    public final byte[] f22287e;
    public final byte[] f22288f;
    public int f22289i;

    public ew(fw fwVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f22284a = fwVar;
        this.f22285b = tL_secureFile;
        this.f22286c = str;
        this.f22288f = bArr;
        this.f22287e = bArr2;
    }
}

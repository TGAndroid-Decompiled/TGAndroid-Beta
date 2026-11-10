package org.telegram.messenger;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ew extends TLObject {
    public final fw f22288a;
    public final TLRPC.TL_secureFile f22289b;
    public final String f22290c;
    public TLRPC.TL_inputFile d;
    public final byte[] f22291e;
    public final byte[] f22292f;
    public int f22293i;

    public ew(fw fwVar, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.f22288a = fwVar;
        this.f22289b = tL_secureFile;
        this.f22290c = str;
        this.f22292f = bArr;
        this.f22291e = bArr2;
    }
}

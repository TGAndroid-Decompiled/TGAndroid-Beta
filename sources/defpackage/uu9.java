package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uu9 extends TLObject {
    public final vu9 a;
    public final TLRPC.TL_secureFile b;
    public final String c;
    public TLRPC.TL_inputFile d;
    public final byte[] e;
    public final byte[] f;
    public byte i;

    public uu9(vu9 vu9Var, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.a = vu9Var;
        this.b = tL_secureFile;
        this.c = str;
        this.f = bArr;
        this.e = bArr2;
    }
}

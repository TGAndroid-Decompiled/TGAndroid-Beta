package defpackage;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class xw9 extends TLObject {
    public final yw9 a;
    public final TLRPC.TL_secureFile b;
    public final String c;
    public TLRPC.TL_inputFile d;
    public final byte[] e;
    public final byte[] f;
    public byte i;

    public xw9(yw9 yw9Var, TLRPC.TL_secureFile tL_secureFile, String str, byte[] bArr, byte[] bArr2) {
        this.a = yw9Var;
        this.b = tL_secureFile;
        this.c = str;
        this.f = bArr;
        this.e = bArr2;
    }
}

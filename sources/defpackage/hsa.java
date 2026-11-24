package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hsa implements RequestDelegate {
    public final byte a;
    public final gta b;

    public hsa(gta gtaVar, byte b) {
        this.a = b;
        this.b = gtaVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        byte b = this.a;
        gta gtaVar = this.b;
        switch (b) {
            case 0:
                gl.c3(new lsa(gtaVar, tLObject, (byte) 0));
                return;
            case 1:
                gl.c3(new lsa(gtaVar, tLObject, (byte) 1));
                return;
            case 2:
                gl.c3(new lsa(gtaVar, tLObject, (byte) 2));
                return;
            case 3:
                gl.c3(new lsa(gtaVar, tLObject, (byte) 3));
                return;
            default:
                gl.c3(new lsa(gtaVar, tLObject, (byte) 4));
                return;
        }
    }
}

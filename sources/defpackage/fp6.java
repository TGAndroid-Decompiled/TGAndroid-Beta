package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fp6 implements Runnable {
    public final byte a = 0;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final Object e;
    public final Object f;
    public final Serializable h;

    public fp6(hq6 hq6Var, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i, String str, boolean z2) {
        this.e = hq6Var;
        this.c = z;
        this.f = tL_messages_stickerSet;
        this.b = i;
        this.h = str;
        this.d = z2;
    }

    @Override
    public final void run() {
        byte b = this.a;
        Object obj = this.f;
        Serializable serializable = this.h;
        Object obj2 = this.e;
        switch (b) {
            case 0:
                hq6 hq6Var = (hq6) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                String str = (String) serializable;
                boolean z = this.c;
                int i = this.b;
                if (z) {
                    long j = 1000;
                    if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400) {
                        gl.d3(new yn6(hq6Var, str, this.d, (byte) 0), (tL_messages_stickerSet != null || z) ? 0L : 0L);
                        if (tL_messages_stickerSet == null) {
                            return;
                        }
                    }
                }
                if (tL_messages_stickerSet != null) {
                    if (!z) {
                        hq6Var.I1(str, tL_messages_stickerSet, i);
                    }
                    gl.c3(new sx5(hq6Var, str, tL_messages_stickerSet, (byte) 29));
                    return;
                } else if (!z) {
                    hq6Var.I1(str, null, i);
                    return;
                } else {
                    return;
                }
            case 1:
                ((kz6) obj2).U((CharSequence) obj, this.b, (ArrayList) serializable, this.c, this.d);
                return;
            default:
                gl.c3(new cib(bkb.n1((vjb) obj2, (String) serializable, this.b, this.c, (TLRPC.Document) obj, this.d), (byte) 4));
                return;
        }
    }

    public fp6(kz6 kz6Var, CharSequence charSequence, int i, ArrayList arrayList, boolean z, boolean z2) {
        this.e = kz6Var;
        this.f = charSequence;
        this.b = i;
        this.h = arrayList;
        this.c = z;
        this.d = z2;
    }

    public fp6(vjb vjbVar, String str, int i, boolean z, TLRPC.Document document, boolean z2) {
        this.e = vjbVar;
        this.h = str;
        this.b = i;
        this.c = z;
        this.f = document;
        this.d = z2;
    }
}

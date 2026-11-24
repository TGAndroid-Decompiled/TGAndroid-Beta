package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fr6 implements Runnable {
    public final byte a = 0;
    public final int b;
    public final boolean c;
    public final boolean d;
    public final Object e;
    public final Object f;
    public final Serializable h;

    public fr6(hs6 hs6Var, boolean z, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, int i, String str, boolean z2) {
        this.e = hs6Var;
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
                hs6 hs6Var = (hs6) obj2;
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                String str = (String) serializable;
                boolean z = this.c;
                int i = this.b;
                if (z) {
                    long j = 1000;
                    if (tL_messages_stickerSet == null || Math.abs((System.currentTimeMillis() / 1000) - i) >= 86400) {
                        gm.d3(new zp6(hs6Var, str, this.d, (byte) 0), (tL_messages_stickerSet != null || z) ? 0L : 0L);
                        if (tL_messages_stickerSet == null) {
                            return;
                        }
                    }
                }
                if (tL_messages_stickerSet != null) {
                    if (!z) {
                        hs6Var.I1(str, tL_messages_stickerSet, i);
                    }
                    gm.c3(new fp6(hs6Var, str, tL_messages_stickerSet, (byte) 1));
                    return;
                } else if (!z) {
                    hs6Var.I1(str, null, i);
                    return;
                } else {
                    return;
                }
            case 1:
                ((k17) obj2).U((CharSequence) obj, this.b, (ArrayList) serializable, this.c, this.d);
                return;
            default:
                gm.c3(new zcb(cmb.n1((xlb) obj2, (String) serializable, this.b, this.c, (TLRPC.Document) obj, this.d), (byte) 12));
                return;
        }
    }

    public fr6(k17 k17Var, CharSequence charSequence, int i, ArrayList arrayList, boolean z, boolean z2) {
        this.e = k17Var;
        this.f = charSequence;
        this.b = i;
        this.h = arrayList;
        this.c = z;
        this.d = z2;
    }

    public fr6(xlb xlbVar, String str, int i, boolean z, TLRPC.Document document, boolean z2) {
        this.e = xlbVar;
        this.h = str;
        this.b = i;
        this.c = z;
        this.f = document;
        this.d = z2;
    }
}

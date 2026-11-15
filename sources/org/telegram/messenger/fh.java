package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fh implements z10 {
    public final int f23490a;
    public final si f23491b;
    public final TLRPC.StickerSet f23492c;

    public fh(si siVar, TLRPC.StickerSet stickerSet, int i7) {
        this.f23490a = i7;
        this.f23491b = siVar;
        this.f23492c = stickerSet;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f23490a;
        ArrayList arrayList = (ArrayList) obj;
        si siVar = this.f23491b;
        siVar.getClass();
        switch (i7) {
            case 0:
                siVar.f1(this.f23492c.f28078id, false);
                return;
            default:
                siVar.g1(this.f23492c.f28078id, false);
                return;
        }
    }
}

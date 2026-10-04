package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vl implements Runnable {
    public final int f19513a = 0;
    public final String f19514b;
    public final Object f19515c;
    public final Object d;

    public vl(String str, String str2, byte[] bArr) {
        this.f19514b = str;
        this.f19515c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f19513a) {
            case 0:
                WearAuthListenerService.a(this.f19514b, (String) this.f19515c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f19515c).lambda$processLoadedDiceStickers$88(this.f19514b, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public vl(MediaDataController mediaDataController, String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f19515c = mediaDataController;
        this.f19514b = str;
        this.d = tL_messages_stickerSet;
    }
}

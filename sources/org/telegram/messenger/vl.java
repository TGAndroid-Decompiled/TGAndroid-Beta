package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vl implements Runnable {
    public final int f19505a = 0;
    public final String f19506b;
    public final Object f19507c;
    public final Object d;

    public vl(String str, String str2, byte[] bArr) {
        this.f19506b = str;
        this.f19507c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f19505a) {
            case 0:
                WearAuthListenerService.a(this.f19506b, (String) this.f19507c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f19507c).lambda$processLoadedDiceStickers$88(this.f19506b, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public vl(MediaDataController mediaDataController, String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f19507c = mediaDataController;
        this.f19506b = str;
        this.d = tL_messages_stickerSet;
    }
}

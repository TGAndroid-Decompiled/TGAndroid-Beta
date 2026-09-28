package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vl implements Runnable {
    public final int f17865a = 0;
    public final String f17866b;
    public final Object f17867c;
    public final Object d;

    public vl(String str, String str2, byte[] bArr) {
        this.f17866b = str;
        this.f17867c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f17865a) {
            case 0:
                WearAuthListenerService.a(this.f17866b, (String) this.f17867c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f17867c).lambda$processLoadedDiceStickers$88(this.f17866b, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public vl(MediaDataController mediaDataController, String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f17867c = mediaDataController;
        this.f17866b = str;
        this.d = tL_messages_stickerSet;
    }
}

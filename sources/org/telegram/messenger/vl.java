package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vl implements Runnable {
    public final int f17881a = 0;
    public final String f17882b;
    public final Object f17883c;
    public final Object d;

    public vl(String str, String str2, byte[] bArr) {
        this.f17882b = str;
        this.f17883c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f17881a) {
            case 0:
                WearAuthListenerService.a(this.f17882b, (String) this.f17883c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f17883c).lambda$processLoadedDiceStickers$88(this.f17882b, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public vl(MediaDataController mediaDataController, String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f17883c = mediaDataController;
        this.f17882b = str;
        this.d = tL_messages_stickerSet;
    }
}

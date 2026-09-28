package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vl implements Runnable {
    public final int f17864a = 0;
    public final String f17865b;
    public final Object f17866c;
    public final Object d;

    public vl(String str, String str2, byte[] bArr) {
        this.f17865b = str;
        this.f17866c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f17864a) {
            case 0:
                WearAuthListenerService.a(this.f17865b, (String) this.f17866c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f17866c).lambda$processLoadedDiceStickers$88(this.f17865b, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public vl(MediaDataController mediaDataController, String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f17866c = mediaDataController;
        this.f17865b = str;
        this.d = tL_messages_stickerSet;
    }
}

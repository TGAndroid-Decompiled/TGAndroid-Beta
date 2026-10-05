package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vl implements Runnable {
    public final int f19510a = 0;
    public final String f19511b;
    public final Object f19512c;
    public final Object d;

    public vl(String str, String str2, byte[] bArr) {
        this.f19511b = str;
        this.f19512c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f19510a) {
            case 0:
                WearAuthListenerService.a(this.f19511b, (String) this.f19512c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f19512c).lambda$processLoadedDiceStickers$88(this.f19511b, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public vl(MediaDataController mediaDataController, String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f19512c = mediaDataController;
        this.f19511b = str;
        this.d = tL_messages_stickerSet;
    }
}

package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class vl implements Runnable {
    public final int f19512a = 0;
    public final String f19513b;
    public final Object f19514c;
    public final Object d;

    public vl(String str, String str2, byte[] bArr) {
        this.f19513b = str;
        this.f19514c = str2;
        this.d = bArr;
    }

    @Override
    public final void run() {
        switch (this.f19512a) {
            case 0:
                WearAuthListenerService.a(this.f19513b, (String) this.f19514c, (byte[]) this.d);
                return;
            default:
                ((MediaDataController) this.f19514c).lambda$processLoadedDiceStickers$88(this.f19513b, (TLRPC.TL_messages_stickerSet) this.d);
                return;
        }
    }

    public vl(MediaDataController mediaDataController, String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        this.f19514c = mediaDataController;
        this.f19513b = str;
        this.d = tL_messages_stickerSet;
    }
}

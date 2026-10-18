package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
public final class o3 implements Runnable {
    public final int f19100a;
    public final FileRefController f19101b;
    public final TLRPC.TL_messages_sendMedia f19102c;
    public final Object[] d;

    public o3(FileRefController fileRefController, TLRPC.TL_messages_sendMedia tL_messages_sendMedia, Object[] objArr, int i10) {
        this.f19100a = i10;
        this.f19101b = fileRefController;
        this.f19102c = tL_messages_sendMedia;
        this.d = objArr;
    }

    @Override
    public final void run() {
        switch (this.f19100a) {
            case 0:
                this.f19101b.lambda$onUpdateObjectReference$31(this.f19102c, this.d);
                return;
            default:
                this.f19101b.lambda$sendErrorToObject$42(this.f19102c, this.d);
                return;
        }
    }
}

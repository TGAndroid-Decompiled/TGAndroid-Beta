package org.telegram.messenger;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class MediaDataController$$ExternalSyntheticLambda54 implements Runnable {
    public final int $r8$classId;
    public final MediaDataController f$0;
    public final TLRPC.messages_Messages f$1;
    public final int f$2;
    public final long f$3;
    public final ArrayList f$4;
    public final int f$5;
    public final int f$6;
    public final boolean f$7;
    public final int f$8;
    public final int f$9;

    public MediaDataController$$ExternalSyntheticLambda54(MediaDataController mediaDataController, TLRPC.messages_Messages messages_messages, int i, long j, ArrayList arrayList, int i2, int i3, boolean z, int i4, int i5, int i6) {
        this.$r8$classId = i6;
        this.f$0 = mediaDataController;
        this.f$1 = messages_messages;
        this.f$2 = i;
        this.f$3 = j;
        this.f$4 = arrayList;
        this.f$5 = i2;
        this.f$6 = i3;
        this.f$7 = z;
        this.f$8 = i4;
        this.f$9 = i5;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processLoadedMedia$134(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9);
                break;
            default:
                this.f$0.lambda$processLoadedMedia$133(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7, this.f$8, this.f$9);
                break;
        }
    }
}

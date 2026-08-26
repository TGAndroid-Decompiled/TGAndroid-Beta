package org.telegram.messenger;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;

public final class MediaController$$ExternalSyntheticLambda60 implements Runnable {
    public final int $r8$classId = 0;
    public final Object f$0;
    public final Serializable f$1;
    public final Object f$2;
    public final int f$3;
    public final boolean f$4;
    public final int f$5;
    public final boolean f$6;
    public final long f$7;

    public MediaController$$ExternalSyntheticLambda60(MediaController mediaController, File file, TLRPC.TL_document tL_document, int i, boolean z, int i2, boolean z2, long j) {
        this.f$0 = mediaController;
        this.f$1 = file;
        this.f$2 = tL_document;
        this.f$3 = i;
        this.f$4 = z;
        this.f$5 = i2;
        this.f$6 = z2;
        this.f$7 = j;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.$r8$classId) {
            case 0:
                ((MediaController) this.f$0).lambda$stopRecordingInternal$40((File) this.f$1, (TLRPC.TL_document) this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, this.f$7);
                break;
            default:
                ((MessagesStorage) this.f$0).lambda$updatePinnedMessages$138(this.f$4, (HashMap) this.f$1, this.f$3, this.f$7, (ArrayList) this.f$2, this.f$5, this.f$6);
                break;
        }
    }

    public MediaController$$ExternalSyntheticLambda60(MessagesStorage messagesStorage, boolean z, HashMap map, int i, long j, ArrayList arrayList, int i2, boolean z2) {
        this.f$0 = messagesStorage;
        this.f$4 = z;
        this.f$1 = map;
        this.f$3 = i;
        this.f$7 = j;
        this.f$2 = arrayList;
        this.f$5 = i2;
        this.f$6 = z2;
    }
}
